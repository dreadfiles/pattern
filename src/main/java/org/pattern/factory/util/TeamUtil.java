package org.pattern.factory.util;

import org.pattern.factory.model.Team;

import java.util.List;

public class TeamUtil {

    public static List<Team> generateTeamList() {
        return List.of(
                new Team(1, "Real Madrid", "Spain", 9),
                new Team(2, "Bayer Munich", "Germany", 8),
                new Team(3, "Manchester City", "England", 10),
                new Team(4, "Juventus", "Italy", 6),
                new Team(5, "Chelsea", "England", 8),
                new Team(6, "Barcelona", "Spain", 7)
        );
    }
}
