package pers.java.player;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private String playListName;
	private List<Song> musicList;
	/**
	 * 构造方法
	 * @param playListName
	 */
	public PlayList(String playListName) {
		this.playListName = playListName;
		musicList = new ArrayList<Song>();
	}
	/**
	 * 将歌曲添加到播放列表
	 * @param song 要添加的歌曲
	 */
	public void addToPlayList(Song song) {
		//排除重复添加
		boolean flag = false;//判断播放列表中的歌曲是否存在
		for(Song song1:musicList) {
			if(song1.equals(song)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("该歌曲已经存在于歌曲列表中，添加失败！");
		}else {
		musicList.add(song);
		}
	}
	/**
	 * 通过歌曲id查询歌曲信息
	 * @param id 歌曲id
	 * @return 查询到的歌曲信息
	 */
	public Song searchSongById(String id) {
		Song song = null;
		//id唯一
		for(Song song1:musicList) {
			if(song1.getId().equals(id)) {
				song = song1;break;
			}
		}
		return song;
	}
	/**
	 * 通过歌曲名称查询
	 * @param name 歌曲名称
	 * @return 歌曲信息
	 */
	public Song searchSongByName(String name) {
		Song song = null;
		for(Song song1:musicList) {
			if(song1.getName().equals(name)) {
				song = song1;break;
			}
		}
		return song;
	}
	/**
	 * 修改播放列表中的歌曲信息
	 * @param id 要修改的歌曲id
	 * @param song 新的歌曲信息
	 */
	public void updateSong(String id,Song song) {
		Song song1 = null;
		song1 = searchSongById(id);
		if(song1==null) {
			System.out.println("没有找到id为"+id+"对应的歌曲信息！");
		}else {
			musicList.remove(song1);
			musicList.add(song);
			System.out.println("修改成功");
		}
	}
	/**
	 * 删除播放列表中的指定歌曲信息
	 * @param id 歌曲id
	 */
	public void deleteSong(String id) {
		Song song=searchSongById(id);
		if(song!=null) {
			musicList.remove(song);
		}else {
			System.out.println("没有找到id为"+id+"对应的歌曲信息！");
		}
	}
	/**
	 * 显示播放列表中的所有歌曲
	 */
	public void displayAllSong() {
		System.out.println("播放列表中的所有歌曲为：");
		for(Song song:musicList) {
			System.out.println(song);
		}
	}
	public String getPlayListName() {
		return playListName;
	}
	public void setPlayListName(String playListName) {
		this.playListName = playListName;
	}
	public List<Song> getMusicList() {
		return musicList;
	}
	public void setMusicList(List<Song> musicList) {
		this.musicList = musicList;
	}
	
}
