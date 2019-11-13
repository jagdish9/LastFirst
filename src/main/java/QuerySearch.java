/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class QuerySearch
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < t; i++) {
            int s = scan.nextInt();
            scan.nextLine();
            String[] strArr = new String[s];
            for (int j = 0; j < s; j++) {
                strArr[j] = scan.nextLine();
            }

            Map<String, Integer> _map = new HashMap<String, Integer>();
            int topNo = 0;
            for (int x = 0; x < s; x++) {
                _map.clear();
                if (strArr[x].startsWith("top")) {
                    String[] spl = strArr[x].split(" ");
                    topNo = Integer.parseInt(spl[1]);
                }
                for (int y = 0; y < x; y++) {
                    int count = 0;
                    for (int z = y+1; z < x; z++) {
                        if (strArr[y].equals(strArr[z])) {
                            count++;
                        }
                    }
                    if (!_map.containsKey(strArr[y]) && !strArr[y].startsWith("top")) {
                        _map.put(strArr[y], count);
                    }
                }

                Map<String, Integer> mapSorted = new HashMap<String, Integer>();
                if (strArr[x].startsWith("top")) {
                    mapSorted = sortByValue(_map);
                }
                int displayCount = 0;
                for (Map.Entry<String, Integer> entry : mapSorted.entrySet()) {
                    if (displayCount != topNo) {
                        System.out.print(entry.getKey() + " ");
                        displayCount++;
                    }
                }
                if (strArr[x].startsWith("top")) {
                    System.out.println();
                    _map.clear();
                }
            }
        }
        scan.close();
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> ls = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

        Collections.sort(ls, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                if(o2.getValue() == o1.getValue())
                    return o1.getKey().compareTo(o2.getKey());
                else if(o2.getValue() > o1.getValue())
                    return o2.getValue().compareTo(o1.getValue());

                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> entryList : ls){
            sortedMap.put(entryList.getKey(), entryList.getValue());
        }

        return sortedMap;
    }
}
