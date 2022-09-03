import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // 2.Adds new songs to Playlist
        Playlist.add("Chicago Freestyle");
        Playlist.add("No role modelz");
        Playlist.add("Wet Dreamz");
        Playlist.add("Go flex");
        Playlist.add("Middle child");

        //3. Adds a new song at the front of the Playlist
        Playlist.addFirst("I like you");

        // 4.Adds a new song at the end of the Playlist
        Playlist.addLast("Glimpse of us");

        // 5.Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // 6.Replace the last song using the set() method
        Playlist.set(5, "Gimme Love");

        // 7.Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}
