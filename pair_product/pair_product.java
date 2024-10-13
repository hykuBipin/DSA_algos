import java.util.List;
import java.util.HashMap;


class Source {
  public static List<Integer> pairProduct(List<Integer> numbers, int target) {
    HashMap<Integer,Integer> prevmatch = new HashMap<Integer,Integer>();
    for(int i=0; i < numbers.size(); i++){
        int num = numbers.get(i);
        int complement = target / num; 
        if(prevmatch.containsKey(complement)){
          return List.of(i,prevmatch.get(complement));
        }
      prevmatch.put(num,i);
    }
    return null;
  }


  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

