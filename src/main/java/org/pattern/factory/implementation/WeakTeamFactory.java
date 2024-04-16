package org.pattern.factory.implementation;

import org.pattern.factory.factory.TeamFactory;
import org.pattern.factory.model.Team;
import org.pattern.factory.util.Constant;

import java.util.List;
import java.util.stream.Collectors;

public class WeakTeamFactory implements TeamFactory {

    private final List<Team> teamList;

    public WeakTeamFactory(List<Team> teamList) {
        this.teamList = teamList;
    }

    @Override
    public List<Team> createTeamSelection() {
        System.out.println("WEAK_LIMIT = " + Constant.WEAK_LIMIT);
        return teamList.stream().filter(teamItem -> teamItem.getPerformance() <= Constant.WEAK_LIMIT).collect(Collectors.toList());
    }

}
