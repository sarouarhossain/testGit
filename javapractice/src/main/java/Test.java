import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
//    Thread currentThread = Thread.currentThread();
//    System.out.println("Test: "+currentThread);
//
//    Executor executor = Executors.newFixedThreadPool(2);
//    CompletableFuture<String> st =
//        CompletableFuture.supplyAsync(
//                () -> {
//                  try {
//                    TimeUnit.SECONDS.sleep(3);
//                  } catch (InterruptedException e) {
//                    e.printStackTrace();
//                  }
//                  System.out.println("first thread: " + Thread.currentThread());
//                  return "Rajib";
//                })
//            .thenApplyAsync(
//                re -> {
//                  System.out.println("second thread: "+Thread.currentThread());
//                  return "Hello" + re;
//                },executor);
//
//    System.out.println("Test2: "+st.get());

    TestAA testAA = new TestAA();
    CompletableFuture<Integer> res = testAA.getFirst().thenComposeAsync(testAA::getNumber);
    System.out.println("Res: "+res.get());
  }
}
