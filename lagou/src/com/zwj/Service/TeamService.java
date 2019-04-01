package com.zwj.Service;

import com.zwj.entity.Team;

public interface TeamService {
    boolean AddTeam(Team team);

    Team queryTeam(String founder);
}
