import java.util.concurrent.CompletableFuture;

public class TestAA {
  public CompletableFuture<Integer> getFirst(){
    return CompletableFuture.supplyAsync(
        () -> {
          System.out.println("from first: "+Thread.currentThread());
          return 2;
        });
  }

  public CompletableFuture<Integer> getNumber(Integer num){
    return CompletableFuture.supplyAsync(
        () -> {
          System.out.println("from second: "+Thread.currentThread());
          return 10*num;
        });
  }
}
