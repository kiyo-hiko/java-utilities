import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBuilder<K, V> {
    public Map<K, V> from(List<K> ks, List<V> vs) {
        int ksize;
        int vsize;
        int size = (ksize = ks.size()) < (vsize = vs.size()) ? ksize : vsize;
        Map<K, V> map = new HashMap(size);
        for (int i = 0; i < size; i++) {
            map.put(ks.get(i), vs.get(i));
        }
        return map;
    }   
}
