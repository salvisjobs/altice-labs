import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root',
})
export class DataSequenceService {
  // Base url
  baseurl = 'http://localhost:8085/api/v1'
  constructor(private http: HttpClient) {}
  // Http Headers
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
    }),
  };
  // GET
  GetSequence(data: any): Observable<Int16Array> {
    console.log(JSON.stringify(data));
    return this.http
      .get<Int16Array>(this.baseurl + '/labseq/' + data.algarism)
      .pipe(retry(1));
  }
}
