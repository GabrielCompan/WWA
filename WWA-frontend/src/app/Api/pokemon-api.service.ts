import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pokemon} from '../model/pokemon';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PokemonApiService {
  baseUrl = 'https://localhost:8087';

  constructor(private http: HttpClient) {}

  // Send a GET request to the API to get a list of pokemons
  getPokemons(): Observable<Pokemon[]> {
    return this.http.get<Pokemon[]>(`${this.baseUrl}/pokemons`);
  }

  // Send a GET request to the API to get a pokemon by id
  getPokemon(id: number): Observable<Pokemon> {
    return this.http.get<Pokemon>(`${this.baseUrl}/pokemons/${id}`);
  }

  // Send a POST request to the API to add a new pokemon
  addPokemon(pokemon: Pokemon): Observable<Pokemon> {
    return this.http.post<Pokemon>(`${this.baseUrl}/pokemons`, pokemon);
  }

  // Send a PUT request to the API to update a pokemon
  updatePokemon(pokemon: Pokemon): Observable<Pokemon> {
    return this.http.put<Pokemon>(`${this.baseUrl}/pokemons/${pokemon.id}`, pokemon);
  }

  // Send a DELETE request to the API to delete a pokemon
  deletePokemon(id: number): Observable<Pokemon> {
    return this.http.delete<Pokemon>(`${this.baseUrl}/pokemons/${id}`);
  }
}
