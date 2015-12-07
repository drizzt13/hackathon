package com.expedia.derbysoft.hackathon.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class IOUtils {

    private static final int DEFAULT_BUFFER_SIZE = 1024;

    private static final int EOF = -1;

    private static Log logger = LogFactory.getLog(IOUtils.class);

    public static byte[] readAsBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        flush(inputStream, outputStream);
        return outputStream.toByteArray();
    }

    public static String readAsString(InputStream inputStream) throws IOException {
        return readAsString(inputStream, "UTF-8");
    }

    public static String readAsString(InputStream inputStream, String charsetName) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        flush(inputStream, outputStream);
        return new String(outputStream.toByteArray(), charsetName);
    }

    private static void flush(InputStream inputStream, OutputStream outputStream) throws IOException {
        flush(inputStream, outputStream, true);
    }

    public static void flush(InputStream inputStream, OutputStream outputStream, boolean close) throws IOException {
        try {
            byte[] buffer = new byte[DEFAULT_BUFFER_SIZE];
            for (int length = inputStream.read(buffer); length > 0; length = inputStream.read(buffer)) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            if (!close) {
                return;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                }
            }
        }
    }

    public static int copy(InputStream input, OutputStream output) {
        long count = copyLarge(input, output);
        if (count > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) count;
    }

    private static long copyLarge(InputStream input, OutputStream output) {
        return copyLarge(input, output, new byte[DEFAULT_BUFFER_SIZE]);
    }

    private static long copyLarge(InputStream input, OutputStream output, byte[] buffer) {
        long count = 0;
        int n = 0;
        try {
            while (EOF != (n = input.read(buffer))) {
                output.write(buffer, 0, n);
                count += n;
            }
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return count;
    }
}