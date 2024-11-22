package com.javaextra.day03;

public class MusicDto {

    private int musicId;
    private String title;
    private String artist;

    public MusicDto(){}
    public MusicDto(String title,String artist){
        this.title=title;
        this.artist=artist;
    }
    public String toString(){
        return String.format("[title: %s, artist: %s]",title,artist);
    }
    // 그리고  getter 따로 만들어 줘야 한다


    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    public String getTitle() {
        return title;
    }

    public int getMusicId() {
        return musicId;
    }
}
class MusicDtoTest{
    public static void main(String[] args) {
        MusicDto musicDto=new MusicDto("Spicy","aespa");
        System.out.println(musicDto);

    // 혹은 setter로 설정해보자.

        MusicDto musicDto1 =new MusicDto();
        musicDto1.setArtist("mrs.GreenApple");
        musicDto1.setTitle("Dancing Hall");

        System.out.println(musicDto1);
    }

}
