package org.pattern.factory.factory;

import org.pattern.factory.model.Team;

import java.util.List;

public interface TeamFactory {

    List<Team> createTeamSelection();

}
