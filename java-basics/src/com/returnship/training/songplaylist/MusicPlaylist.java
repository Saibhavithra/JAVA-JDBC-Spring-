package com.returnship.training.songplaylist;
import java.util.*;




	// Create a program that implements a playlist for songs
//  Create a Song class having Title and Duration for a song.
//  The program will have an Album class containing a list of songs.
//  The albums will be stored in an ArrayList
//Songs from different albums can be added to the playlist and will appear in the list in the order
//they are added.
//Once the songs have been added to the playlist, create a menu of options to:-
//Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
//List the songs in the playlist
//A song must exist in an album before it can be added to the playlist (so you can only play songs that
//you own).
//Hint:  To replay a song, consider what happened when we went back and forth from a city before we
//started tracking the direction we were going.
//As an optional extra, provide an option to remove the current song from the playlist
//(hint: listiterator.remove()

//classes: Album -> to arraylist
//menu: quit,skip,>>, <<, replay, listen,

//import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class MusicPlaylist {

private static LinkedList<Album> albums = new LinkedList<>(); // PRIVATE STATIC

// ^ NON STATIC FIELD ALBUMS CAN NOT BE REFERENCE FROM A STATIC CONTEX

public static void main(String[] args) {


//ADDING SONGS
    Album album = new Album("Kill Em All", "ACDC");
    album.addSong("Seek & Destory", 12);
    album.addSong("Ride The Lightin", 13);
    album.addSong("Seek & Destory", 14);
    albums.add(album);

    album = new Album("Death Magnectis", "Metallica");
    album.addSong("The Day That Never Comes", 123);
    album.addSong("All NIghtmare Long", 123);
    album.addSong("Blood and scared", 123);
    albums.add(album);
    //printListAlbum(albums);

    printEverything(albums);


    LinkedList<Song> playlist = new LinkedList<Song>();

    albums.get(0).addToPlaylist("Seek & Destory", playlist);
    albums.get(0).addToPlaylist(2, playlist);
    albums.get(1).addToPlaylist(2, playlist);
    printListPlaylist(playlist);

    play(playlist);


}

public static void play(LinkedList<Song> playlist) {

    Scanner scanner = new Scanner(System.in);
    boolean forward = true;
    boolean isQuit = false;

    ListIterator<Song> listIterator = playlist.listIterator();
//ListIterator<Song> listIterator = playList.listIterator();


    if (playlist.size() == 0) {
        System.out.println("NO SONG IN PLAYLIST");
        return;
    } else {
        System.out.println("NOW PLAYING " + listIterator.next().toString());
        printMenu();
    }

    while (!isQuit) {
        int choose = scanner.nextInt();
        scanner.nextLine();


//        0 - to quit
//        1 - to play next song
//        2 - to play previous song
//        3 - to replay the current song
//        4 - list songs in the playlist
//        5 - print available actions.
//        6 - delete current song from playlist

        switch (choose) {
            case 0:
                System.out.println("Playlist is Done");
                isQuit = true;
                break;

            case 1: // PLAY NEXT SONG
                if (!forward) { // domyslnie true
                    if (listIterator.hasNext()) { //jestesmy w pozycji 0 i sprawdzamy czy jest cos dalej
                        listIterator.next(); // przenosimy ^ wskaznik iteratora dalej
                    }
                    forward = true; // kierunek zostaje --->
                }
                if (listIterator.hasNext()) {  // sprawadzamy czy jest cos dalej
                    System.out.println("Now playing " + listIterator.next().toString()); // gramy to co jest dalej(?)
                } else { // jesli nie ma nic dalej
                    System.out.println("We have reached the end of the playlist");
                    forward = false;
                }
                break;

            case 2:  // PLAY PREVIOUS SONG
                if (forward) { // moze byc true or false
                    if (listIterator.hasPrevious()) {  // analogicznie do next
                        listIterator.previous();
                    }
                    forward = false;
                }
                if (listIterator.hasPrevious()) { // cofamy sie i puszczamy to co bylo wcześniej
                    System.out.println("Now playing " + listIterator.previous().toString());
                } else {  // jesli nie ma nic, nie da sie cofnac
                    System.out.println("We are at the start of the playlist");
                    forward = true;
                }
                break;
            case 3: // REPLAY CURRENT SONG
                if (forward) { // moze byc true or false

                    

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now replaying " + listIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                } else {
                    if (listIterator.hasNext()) {
                        System.out.println("Now replaying " + listIterator.next().toString());
                        forward = true;
                    } else {
                        System.out.println("We have reached the end of the list");
                    }
                }
                break;
            case 4: // PRINT PLAYLIST
                printListPlaylist(playlist);
                break;
            case 5: // PRINT THIS MENU
                printMenu();
                break;

            case 6: // DELETE CURRENT SONG
                if (playlist.size() > 0) {
                    listIterator.remove();
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    }
                }
                break;


        }


    }


}

// method to print everything what is storaged in albums LinkedList (everything you've added)
public static void printEverything(LinkedList<Album> linkedList) {
    System.out.println("=============================");
//    System.out.println("List of song in album: " + albumName);

    Iterator<Album> i = linkedList.iterator(); // coś jak for (int i = 0; i < linkedList.size(); i++ )
    int j = 0;
    while (i.hasNext()) {
        j++;
        Album currentAlbum = i.next();
        System.out.println(j + ": " + currentAlbum.getName());

        currentAlbum.getSongsFromInside();

    }
    System.out.println("=============================");

}

// method to print everything what is storaged in Album LinkedList (everything you've added to Album)
public static void printListAlbum(LinkedList<Album> linkedList) {
    System.out.println("=============================");
//    System.out.println("List of song in album: " + albumName);

    Iterator<Album> i = linkedList.iterator(); // coś jak for (int i = 0; i < linkedList.size(); i++ )
    int j = 0;
    while (i.hasNext()) {

        j++;
        Album currentAlbum = i.next();
        System.out.println(j + ": " + currentAlbum.getName());


    }
    System.out.println("=============================");

}

public static void printListPlaylist(LinkedList<Song> playlist) {
    System.out.println("============ playlist =================");
//    System.out.println("List of song in album: " + albumName);

    Iterator<Song> i = playlist.iterator(); // for (int i = 0; i < playlist.size(); i++ )
    int j = 0;
    while (i.hasNext()) {

        j++;
        Song currentSong = i.next();
        System.out.println(j + ": " + currentSong.getName());
    }
    System.out.println("=============================");

}


private static void printMenu() {
    System.out.println("Available actions:\npress");
    System.out.println("0 - to quit\n" +
            "1 - to play next song\n" +
            "2 - to play previous song\n" +
            "3 - to replay the current song\n" +
            "4 - list songs in the playlist\n" +
            "5 - print available actions.\n" +
            "6 - delete current song from playlist");
}
}

