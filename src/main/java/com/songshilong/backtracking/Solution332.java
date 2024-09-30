package com.songshilong.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 332. 重新安排行程
 */
public class Solution332 {

    List<String> list = new ArrayList<>();
    List<List<String>> result = new ArrayList<>();
    public  List<String> findItinerary(List<List<String>> tickets) {
        backTracking(tickets, new int[tickets.size()], "", "JFK");
        return result.getFirst();
    }

    /**
     * 回溯算法
     * @param ticketList 票据列表
     * @param memory 存储票据搜索的情况
     * @param start 上一张票的开始
     * @param end  上一张票的目的地
     */
    public void backTracking(List<List<String>> ticketList, int[] memory, String start, String end) {
        if (list.size() == ticketList.size()) {
            list.add(end);
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < ticketList.size(); i++) {
            if (memory[i] == 1) continue;

            List<String> ticket = ticketList.get(i);
            String from = ticket.getFirst();
            String to = ticket.getLast();

            if (!end.equals(from)) continue;

            list.add(from);
            memory[i] = 1;
            backTracking(ticketList, memory, from, to);
            memory[i] = 0;
            list.removeLast();
        }
    }

    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(new ArrayList<>(List.of("MUC","LHR")));
        tickets.add(new ArrayList<>(List.of("JFK","MUC")));
        tickets.add(new ArrayList<>(List.of("SFO","SJC")));
        tickets.add(new ArrayList<>(List.of("LHR","SFO")));
        Solution332 solution332 = new Solution332();
        System.out.println(solution332.findItinerary(tickets));
    }
}
