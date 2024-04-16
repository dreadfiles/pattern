package org.pattern.factory.implementation;

import org.pattern.factory.factory.TeamFactory;
import org.pattern.factory.model.Team;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomTeamFactory implements TeamFactory {

    private final List<Team> teamList;

    public RandomTeamFactory(List<Team> teamList) {
        this.teamList = teamList;
    }

    @Override
    public List<Team> createTeamSelection() {
        Random random = new Random();
        List<Integer> randomList = random.ints(3, 1, 6).boxed().collect(Collectors.toList());
        System.out.println("randomList = " + randomList);

        return teamList.stream().filter(teamItem -> randomList.contains(teamItem.getId())).collect(Collectors.toList());
    }

}
