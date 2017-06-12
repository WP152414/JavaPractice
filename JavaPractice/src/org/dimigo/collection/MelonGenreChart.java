/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ HelloWorld
 *
 * 1. 개요 :
 * 2. 작성일 : 3/6
 * </pre>
 *
 * @author      : 안문수
 * @version     : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> list = new ArrayList<>();
		List<Music> list2 = new ArrayList<>();
		map.put("발라드", list);
		map.put("댄스", list2);
		System.out.println("--<<멜론 장르별 차트>>--");
		map.get("발라드").add(new Music("팔레트", "아이유"));
		map.get("댄스").add(new Music("I LUV IT", "PSY"));
		map.get("댄스").add(new Music("맞지?", "언니쓰"));
		printMap(map);
		System.out.println("--<< 댄스 2위 곡 변경 >>--");
		map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		System.out.println("--<< 댄스 1위 곡 삭제 >>--");
		map.get("댄스").remove(0);
		printMap(map);
		System.out.println("--<< 전체 리스트 삭제 >>--");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			MelonChart.printList(map.get(key));
		}
		System.out.println("");
	}

	
}
