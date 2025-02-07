/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals.size() <=1){
            return intervals;
        }
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                return Integer.compare(a.start,b.start);
            }
        });
        ArrayList<Interval> merged=new ArrayList<>();
        Interval current=intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            if(current.end >= intervals.get(i).start){
                current.end=Math.max(current.end,intervals.get(i).end);
            }
            else{
                merged.add(current);
                current=intervals.get(i);
            }
        }
        merged.add(current);
        return merged;

    }
}
