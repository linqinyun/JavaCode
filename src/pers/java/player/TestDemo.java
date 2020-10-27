package pers.java.player;

import java.util.Scanner;

public class TestDemo {

	public void testSong() {
		Song song1 = new Song("s001", "量子", "A合成");
		Song song2 = new Song("s002", "物理", "B合成");
		Song song3 = new Song("s003", "化工", "C合成");
		System.out.println(song1.toString());
		// test ==
		System.out.println(song1.equals(song2));
	}

	// 播放列表类测试
	public void testPlayList() {
		Song song1 = new Song("s001", "量子", "A合成");
		Song song2 = new Song("s002", "物理", "B合成");
		Song song3 = new Song("s003", "化工", "C合成");
		Song song4 = new Song("s003", "化工", "C合成");
		// 创建播放列表对象
		PlayList pl = new PlayList("主播放列表");
		pl.addToPlayList(song1);
		pl.addToPlayList(song2);
		pl.addToPlayList(song3);
		pl.addToPlayList(song4);
		// 显示
		pl.displayAllSong();
		// 测试歌曲查询方法
		Song song = pl.searchSongById("s001");
		if (song != null) {
			System.out.println("根据id查询到的信息");
			System.out.println(song);
		} else {
			System.out.println("歌曲不存在");
		}
		Song songName = pl.searchSongByName("化工");
		if (songName != null) {
			System.out.println("根据name查询到的信息");
			System.out.println(songName);
		} else {
			System.out.println("歌曲不存在");
		}
		Song songUpdate = new Song("s005", "石油", "小太阳");
		pl.updateSong("s003", songUpdate);
		pl.displayAllSong();
		// 删除歌曲信息
		pl.deleteSong("s005");
		pl.displayAllSong();
	}

	// 测试播放列表集合类
	public void testPlayListCollection() {
		Song song1 = new Song("s001", "量子", "A合成");
		Song song2 = new Song("s002", "物理", "B合成");
		Song song3 = new Song("s003", "化工", "C合成");
		// 创建播放列表对象
		PlayList pl1 = new PlayList("主播放列表");
		pl1.addToPlayList(song1);
		pl1.addToPlayList(song2);
		pl1.addToPlayList(song3);
		PlayList pl2 = new PlayList("最喜欢的歌曲");
		pl2.addToPlayList(pl1.getMusicList().get(0));
		pl2.addToPlayList(pl1.getMusicList().get(1));
		pl2.displayAllSong();
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayList(pl1);
		plc.addPlayList(pl2);
		plc.displayListName();
		PlayList playList = plc.searchPlayListByName("最喜欢的歌曲");
		playList.displayAllSong();
		// 删除方法
		System.out.println("删除前");
		plc.displayListName();
		System.out.println("删除后");
		plc.deletePlayList(pl2);
		plc.displayListName();

	}

	// 播放器管理菜单
	public void playerMenu() {
		System.out.println("****************************");
		System.out.println("************播放器管理***********************************");
		System.out.println("************1--向播放器添加播放列表***********");
		System.out.println("************2--从播放器删除播放列表***********");
		System.out.println("************3--通过名字查询播放列表信息***********");
		System.out.println("************4--显示所有播放列表名称***********");
		System.out.println("************9--返回上一级菜单***********");
		System.out.println("****************************");
	}

	// 播放列表菜单
	public void playListMenu() {
		System.out.println("****************************");
		System.out.println("************播放列表管理***********************************");
		System.out.println("************1--将歌曲添加到主播放列表***********");
		System.out.println("************2--将歌曲添加到普通播放列表***********");
		System.out.println("************3--通过歌曲id查询播放列表歌曲***********");
		System.out.println("************4--通过歌曲名称查询播放列表歌曲***********");
		System.out.println("************5--修改播放列表中的歌曲***********");
		System.out.println("************6--删除播放列表中的歌曲***********");
		System.out.println("************7--显示播放列表中的所有歌曲***********");
		System.out.println("************9--返回上一级菜单***********");
		System.out.println("****************************");
	}

	// 主菜单
	public void mainMenu() {
		System.out.println("****************************");
		System.out.println("************主菜单***********");
		System.out.println("************1--播放列表管理***********");
		System.out.println("************2--播放器管理***********");
		System.out.println("************0--退出***********");
		System.out.println("****************************");
	}

	// 主流程
	public void test() {
		TestDemo td = new TestDemo();
		Scanner sc = new Scanner(System.in);
		int input = 0, input1 = 0, input2 = 0;
		//创建一个播放列表容器
		PlayListCollection plc = new PlayListCollection();
		//创建主播放列表
		PlayList mainPlayList = new PlayList("主播放列表");
		plc.addPlayList(mainPlayList);
		PlayList favouritePlayList = null;
		while (true) {
			td.mainMenu();
			System.out.println("请输入对应数字进行操作");
			input = sc.nextInt();
			if (input == 0)
				break;
			switch (input) {
			case 1:
				// 播放器列表管理
				while (true) {
					td.playListMenu();
					System.out.println("请输入对应数字进行操作");
					input1 = sc.nextInt();
					if (input1 == 9)
						break;
					switch (input1) {
					case 1:
						System.out.println("将歌曲添加到主播放列表");
						System.out.println("请输入要添加歌曲的数量");
						int count = sc.nextInt();
						for(int i =1;i<=count;i++) {
							System.out.println("请输入第"+i+"首歌曲");
							System.out.println("请输入歌曲的id");
							String strId = sc.next();
							System.out.println("请输入歌曲的名称");
							String strName = sc.next();
							System.out.println("请输入演唱者");
							String strSinger = sc.next();
							Song song = new Song(strId,strName,strSinger);
							mainPlayList.addToPlayList(song);
						}
						mainPlayList.displayAllSong();
						break;
					case 2:
						System.out.println("将歌曲添加到普通播放列表");
						System.out.println("请输入要添加的播放列表名称");
						String sName = sc.next();
						//根据名称判断播放列表是否存在
						favouritePlayList = plc.searchPlayListByName(sName);
						if(favouritePlayList==null) {
							System.out.println("该播放列表不存在，请先将播放列表添加到播放器中");
							
						}else {
							System.out.println("请输入要添加的歌曲数量");
							int count1 = sc.nextInt();
							for(int i=1;i<=count1;i++) {
								System.out.println("请输入第"+i+"首歌曲");
								System.out.println("请输入歌曲id：");
								String strId = sc.next();
								//判断id的歌曲是否在主播放器存在
								Song song = mainPlayList.searchSongById(strId);
								if(song==null) {
									System.out.println("该歌曲在主播放列表不存在，继续输入其他信息");
									System.out.println("请输入歌曲的名称");
									String strName = sc.next();
									System.out.println("请输入演唱者");
									String strSinger = sc.next();
									song = new Song(strId,strName,strSinger);
									mainPlayList.addToPlayList(song);
									favouritePlayList.addToPlayList(song);
								}else {
									System.out.println("该歌曲在主播放列表存在");
									favouritePlayList.addToPlayList(song);
								}
								
							}
							System.out.println("主播放列表");
							mainPlayList.displayAllSong();
							System.out.println("普通播放列表");
							favouritePlayList.displayAllSong();
						}
						
						break;
					case 3:
						System.out.println("通过歌曲id查询播放列表歌曲");
						System.out.println("请输入要查询的播放列表名称");
						String strPlayListName1 = sc.next();
						//查询播放列表存在
						PlayList pl = plc.searchPlayListByName(strPlayListName1);
						if(pl==null) {
							System.out.println("该播放列表不存在");
							break;
						}else {
							System.out.println("请输入要查询的歌曲id");
							String strId1 = sc.next();
							Song s = pl.searchSongById(strId1);
							if(s==null) {
								System.out.println("该歌曲在播放列表"+strPlayListName1+"不存在");
							}else {
								System.out.println("该歌曲信息为：");
								System.out.println(s);
							}
						}
						break;
					case 4:
						System.out.println("通过歌曲名称查询播放列表歌曲");
						break;
					case 5:
						System.out.println("修改播放列表中的歌曲");
						break;
					case 6:
						System.out.println("删除播放列表中的歌曲");
						break;
					case 7:
						System.out.println("显示播放列表中的所有歌曲");
						break;
					default:
						System.out.println("该数字没有对应的操作");
						break;
					}
				}
				break;
			case 2:
				// 播放器管理
				while (true) {
					td.playerMenu();
					System.out.println("请输入对应数字进行操作");
					input2 = sc.nextInt();
					if (input2 == 9)
						break;
					switch (input2) {
					case 1:
						System.out.println("向播放器添加播放列表");
						System.out.println("输入要添加的播放列表名称：");
						String playerName = sc.next();
						favouritePlayList = new PlayList(playerName);
						//将播放列表添加播放器中Map
						plc.addPlayList(favouritePlayList);
						break;
					case 2:
						System.out.println("从播放器删除播放列表");
						break;
					case 3:
						System.out.println("通过名字查询播放列表信息");
						break;
					case 4:
						System.out.println("显示所有播放列表名称");
						break;
					default:
						System.out.println("该数字没有对应的操作");
						break;
					}
				}
				break;
			default:
				System.out.println("该数字没有对应的操作");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo td = new TestDemo();
		td.test();
	}

}
