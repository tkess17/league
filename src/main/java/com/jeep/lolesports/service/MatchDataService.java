package com.jeep.lolesports.service;

import com.jeep.lolesports.model.Partida;
import com.jeep.lolesports.model.matches_data.MatchData;
import com.jeep.lolesports.model.matches_data.ParticipantsStatsPar;
import com.jeep.lolesports.model.matches_data.TeamPar;

import java.util.List;

public interface MatchDataService {
    MatchData findById(long id);
    void save(MatchData matchData);
    void delete(MatchData matchData);
    List<ParticipantsStatsPar> findParticipantsStats(Partida partida);
    List<TeamPar> findTeamStats(Partida partida);
}
