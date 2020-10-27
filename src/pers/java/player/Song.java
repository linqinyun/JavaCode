package pers.java.player;

public class Song {
	private String id;
	private String name;
	private String singer;
	public Song(String id,String name,String singer) {
		this.id = id;
		this.name= name;
		this.singer = singer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj.getClass()==Song.class) {
			Song song = (Song)obj;
			return (song.getId().equals(id))&&(song.getName().equals(name))
					&&(song.getSinger().equals(singer));
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "歌曲信息: id为"+id+",歌曲名称为: "+name+"，演唱者为："+singer;
	}
	
}
