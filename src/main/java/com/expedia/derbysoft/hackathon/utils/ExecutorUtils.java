package com.expedia.derbysoft.hackathon.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by zhupan on 12/8/15.
 */
public abstract class ExecutorUtils {

    public static <T> List<T> batchExecute(Executor executor, Collection<Callable<T>> tasks) {
        Collection<Future<T>> futures = submitTasks(executor, tasks);
        List<T> results = new ArrayList<T>(tasks.size());
        for (Future<T> future : futures) {
            try {
                results.add(future.get());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                throw new RuntimeException("Execution Exception [" + e.getMessage() + "]", e);
            }
        }
        return results;
    }

    private static <T> List<Future<T>> submitTasks(Executor executor, Collection<Callable<T>> tasks) {
        CompletionService<T> service = new ExecutorCompletionService<T>(executor);
        List<Future<T>> futures = new ArrayList<Future<T>>(tasks.size());

        for (Callable<T> task : tasks) {
            Future<T> future = service.submit(task);
            futures.add(future);
        }

        return futures;
    }
}
