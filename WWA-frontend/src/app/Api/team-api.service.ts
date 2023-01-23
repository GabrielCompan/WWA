import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Team} from '../model/team';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TeamApiService {
  baseUrl = 'https://localhost:8086';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of teams
  getTeams(): Observable<Team[]> {
    return this.http.get<Team[]>(`${this.baseUrl}/teams`);
  }

  // Send a GET request to the API to get a team by id
  getTeam(id: number): Observable<Team> {
    return this.http.get<Team>(`${this.baseUrl}/teams/${id}`);
  }

  // Send a POST request to the API to add a new team
  addTeam(team: Team): Observable<Team> {
    return this.http.post<Team>(`${this.baseUrl}/teams`, team);
  }

  // Send a PUT request to the API to update a team
  updateTeam(team: Team): Observable<Team> {
    return this.http.put<Team>(`${this.baseUrl}/teams/${team.id}`, team);
  }

  // Send a DELETE request to the API to delete a team
  deleteTeam(id: number): Observable<Team> {
    return this.http.delete<Team>(`${this.baseUrl}/teams/${id}`);
  }
}
