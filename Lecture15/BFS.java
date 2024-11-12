package Lecture15;

import java.util.HashSet;

public class BFS {
    public boolean BFS(int src, int dst){ 

        LinkedList<Integer> qq= new LinkedList<>(); 

        HashSet<Integer> visited= new HashSet<>(); 

        qq.add(src); 

        while(!qq.isEmpty()){ 

            //remove  

            int r= qq.remove(); 

            //ignore if already visited 

            if(visited.contains(r)) 

                continue; 

             

            //mark visited 

            visited.add(r); 

            if(r==dst) 

                return true; 

             

            for(int nbrs: map.get(r).keySet()){ 

                if(!visited.contains(nbrs)) 

                    qq.add(nbrs); 

            } 

        } 

        return false; 

    }
}
