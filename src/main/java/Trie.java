/**
 * Created by abhi on 17/7/17.
 */
public class Trie {
    public TrieNode root;

    //constructor
    public Trie(){
        root = new TrieNode(' ');
    }

    public void insert(String word){
        if(search(word))
            return;
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            TrieNode child = current.subNode(ch);
            if(child != null){
                current = child;
            }
            else {
                //current.childList.add(new TrieNode(ch));
                current.map.put(ch, new TrieNode(ch));
                current = current.subNode(ch);
            }
            current.count++;
        }
        current.isEnd = true;
    }

    public boolean search(String word){
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            TrieNode child = current.subNode(ch);
            if(child == null)
                return false;
            current = current.subNode(ch);
        }
        if(current.isEnd == true)
            return true;
        return false;
    }

    public void remove(String word){
        if(search(word))
            return;
        TrieNode current = root;
        for(char ch: word.toCharArray()){
            TrieNode child = current.subNode(ch);
            if(child.count == 1){
                //current.childList.remove(child);
                current.map.remove(ch);
                return;
            }
            else {
                child.count--;
                current = child;
            }
        }
        current.isEnd = false;
    }
}
