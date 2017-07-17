import java.util.Map;

/**
 * Created by abhi on 17/7/17.
 */
public class TrieTest {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("abhijeet");
        t.insert("abhi");
        t.insert("patwari");
        //System.out.println(t.search("abhijeet"));
        TrieNode node = t.root;
        Map<Character, TrieNode> map = node.map;
        for(Map.Entry<Character, TrieNode> entry : map.entrySet()){
            TrieNode trieNode = entry.getValue();
            //System.out.println(trieNode.content);
            printRecord(trieNode, "");
        }
    }

    private static void printRecord(TrieNode trieNode, String s) {
        Map<Character, TrieNode> map = trieNode.map;
        //System.out.println(trieNode.content);
        s = s+trieNode.content;
        if(trieNode.isEnd){
            System.out.println(s);
        }
        if(map == null){
            return;
        }
        for(Map.Entry<Character, TrieNode> entry : map.entrySet()){
            printRecord(entry.getValue(), s);
        }

    }


}
