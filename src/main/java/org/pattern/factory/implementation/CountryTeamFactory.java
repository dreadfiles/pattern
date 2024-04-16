package org.pattern.factory.implementation;

import org.pattern.factory.factory.TeamFactory;
import org.pattern.factory.model.Team;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CountryTeamFactory implements TeamFactory {

    private final List<Team> teamList;

    public CountryTeamFactory(List<Team> teamList) {
        this.teamList = teamList;
    }

    @Override
    public List<Team> createTeamSelection() {
        System.out.println("GROUP BY COUNTRY");
        return teamList.stream()
                .collect(Collectors.groupingBy(Team::getCountry))
                .values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

}
