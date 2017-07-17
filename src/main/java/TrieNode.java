import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhi on 17/7/17.
 */
public class TrieNode {
    char content;
    boolean isEnd;
    int count;
    //LinkedList<TrieNode> childList;
    Map<Character, TrieNode> map;

    public TrieNode(char c){
        //childList = new LinkedList<>();
        map = new HashMap<Character, TrieNode>();
        content = c;
        count = 0;
        isEnd = false;
    }

    public TrieNode subNode(char c){
        /*if(childList == null)
            return null;
        for(TrieNode node : childList){
            if(node.content == c)
                return node;
        }*/
        if(map.containsKey(c)){
            return map.get(c);
        }
        return null;
    }
}
