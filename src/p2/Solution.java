package p2;

/*
 * Знакомство с тегами
Считайте с консоли имя файла, который имеет HTML-формат.

Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>

Первым параметром в метод main приходит тег. Например, "span".
Вывести на консоль все теги, которые соответствуют заданному тегу.
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле.
Количество пробелов, \n, \r не влияют на результат.
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нет.
Тег может содержать вложенные теги.

Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми


Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все теги, которые соответствуют тегу, заданному в параметре метода main.
FUCK
 * */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
	public static ArrayList<String> list = new ArrayList<String>();
	public static ArrayList<Integer> blist = new ArrayList<Integer>();
	public static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		FileReader freader = new FileReader(reader.readLine());
		reader.close();
		BufferedReader breader = new BufferedReader(freader);

		String otag = "<" + args[0];
		String ctag = "</" + args[0];
		String s;
		StringBuilder str = new StringBuilder();

		while ((s = breader.readLine()) != null) {
			str.append(s);
		}
		
		tagNumber(str.toString(), otag, ctag);
		System.out.println(map);
		getAll(str.toString(), otag, ctag);
		
		System.out.println(list);
		modify(otag, ctag);
		System.out.println(blist);

		breader.close();
		freader.close();
		
		
		/*
		for (String stri : list) {
			System.out.println(stri);
		}
		*/

	}

	/*
	 * Tag amount and coordinates
	 */
	public static Integer tagNumber(String str, String otag, String ctag) {
		int i = -1;
		while (true) {
			i = str.indexOf(otag, ++i);
			if (i == -1)
				break;
			map.put(i, otag);
		}
		i = -1;
		while (true) {
			i = str.indexOf(ctag, ++i);
			if (i == -1)
				break;
			map.put(i, ctag);
		}
		return map.size() / 2;
	}

	/*
	 * Cut string into pieces with symmetric open/close tags
	 */
	public static void getAll(String str, String otag, String ctag) {
		int k = 0, l = 0;
		int start = 0, finish;

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getValue() == otag) {
				if (k == 0) {
					start = entry.getKey();
					k = k + 1;
				} else
					k = k + 1;
			}
			if (entry.getValue() == ctag) {
				l = l + 1;
				finish = entry.getKey();
				if (k == l) {
					finish = str.indexOf(">", finish);
					list.add(str.substring(start, finish + 1));
					k = 0;
					l = 0;
				}
			}
		}
		map.clear();
	}

	public static void strChange(String str, Integer pos) {
		int start = 0, finish;
		map.remove(0);
		map.remove(map.lastKey());
		start = map.firstKey();
		finish = map.lastKey();
		finish = str.indexOf(">", finish);
		/// blist.add(pos++, str.substring(start, finish));
		map.clear();
	}

	public static boolean modify(String otag, String ctag) {
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			blist.add(tagNumber(s, otag, ctag));
			map.clear();
		}
		int max = 1;
		for (int i = 0; i < blist.size(); i++) {
			if (blist.get(i) > max)
				max = blist.get(i);
		}
		if (max > 1) return false;
		else return true;
		

	}
}
