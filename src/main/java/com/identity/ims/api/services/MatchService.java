package com.identity.ims.api.services;

import java.util.ArrayList;
import java.util.List;

import com.identity.ims.api.Entity.Match;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MatchService {

 
 public List<Match> GetPartyMatches(){

    List<Match> matches = new ArrayList<Match>();

    
    matches.add(new Match("joe bloggs", "p001"));
    matches.add(new Match("pat rods", "p002"));

    return matches;

 }


}
