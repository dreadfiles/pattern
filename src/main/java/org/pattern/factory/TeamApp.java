package org.pattern.factory;

import org.pattern.factory.implementation.CountryTeamFactory;
import org.pattern.factory.implementation.RandomTeamFactory;
import org.pattern.factory.factory.TeamFactory;
import org.pattern.factory.implementation.WeakTeamFactory;
import org.pattern.factory.model.Team;
import org.pattern.factory.util.TeamUtil;

import java.util.List;

/*
FACTORY - DESIGN PATTERN
In this example we are going to create a Factory to create a soccer draw with different teams,
whether random, the weakest and those from the same country.
 */
public class TeamApp {

    private final TeamFactory teamFactory;

    public TeamApp(TeamFactory teamFactory) {
        this.teamFactory = teamFactory;
    }

    public List<Team> generateTeamSelection() {
        return this.teamFactory.createTeamSelection();
    }

    public static void main(String[] args) {
        List<Team> teamList = TeamUtil.generateTeamList();

        TeamApp teamAppRandom = new TeamApp(new RandomTeamFactory(teamList));
        System.out.println("teamAppRandom = " + teamAppRandom.generateTeamSelection());

        TeamApp teamAppWeak = new TeamApp(new WeakTeamFactory(teamList));
        System.out.println("teamAppWeak = " + teamAppWeak.generateTeamSelection());

        TeamApp teamAppCountry = new TeamApp(new CountryTeamFactory(teamList));
        System.out.println("teamAppCountry = " + teamAppCountry.generateTeamSelection());
    }

}
