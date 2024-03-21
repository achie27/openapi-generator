/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable, from, of, map } from 'rxjs';
import { User } from '../model/user';
import { Configuration } from '../configuration';
import { COLLECTION_FORMATS } from '../variables';


@Injectable()
export class UserService {

    protected basePath = 'http://petstore.swagger.io/v2';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Create user
     * This can only be done by the logged in user.
     * @param user Created user object
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createUser(user: User, ): Observable<AxiosResponse<any>>;
    public createUser(user: User, ): Observable<any> {

        if (user === null || user === undefined) {
            throw new Error('Required parameter user was null or undefined when calling createUser.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (api_key) required
        if (this.configuration.apiKeys?.["api_key"]) {
            headers['api_key'] = this.configuration.apiKeys["api_key"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.post<any>(`${this.basePath}/user`,
                    user,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Creates list of users with given input array
     * 
     * @param user List of user object
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createUsersWithArrayInput(user: Array<User>, ): Observable<AxiosResponse<any>>;
    public createUsersWithArrayInput(user: Array<User>, ): Observable<any> {

        if (user === null || user === undefined) {
            throw new Error('Required parameter user was null or undefined when calling createUsersWithArrayInput.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (api_key) required
        if (this.configuration.apiKeys?.["api_key"]) {
            headers['api_key'] = this.configuration.apiKeys["api_key"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.post<any>(`${this.basePath}/user/createWithArray`,
                    user,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Creates list of users with given input array
     * 
     * @param user List of user object
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createUsersWithListInput(user: Array<User>, ): Observable<AxiosResponse<any>>;
    public createUsersWithListInput(user: Array<User>, ): Observable<any> {

        if (user === null || user === undefined) {
            throw new Error('Required parameter user was null or undefined when calling createUsersWithListInput.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (api_key) required
        if (this.configuration.apiKeys?.["api_key"]) {
            headers['api_key'] = this.configuration.apiKeys["api_key"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.post<any>(`${this.basePath}/user/createWithList`,
                    user,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteUser(username: string, ): Observable<AxiosResponse<any>>;
    public deleteUser(username: string, ): Observable<any> {

        if (username === null || username === undefined) {
            throw new Error('Required parameter username was null or undefined when calling deleteUser.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (api_key) required
        if (this.configuration.apiKeys?.["api_key"]) {
            headers['api_key'] = this.configuration.apiKeys["api_key"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.delete<any>(`${this.basePath}/user/${encodeURIComponent(String(username))}`,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Get user by user name
     * 
     * @param username The name that needs to be fetched. Use user1 for testing.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getUserByName(username: string, ): Observable<AxiosResponse<User>>;
    public getUserByName(username: string, ): Observable<any> {

        if (username === null || username === undefined) {
            throw new Error('Required parameter username was null or undefined when calling getUserByName.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/xml',
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<User>(`${this.basePath}/user/${encodeURIComponent(String(username))}`,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Logs user into the system
     * 
     * @param username The user name for login
     * @param password The password for login in clear text
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public loginUser(username: string, password: string, ): Observable<AxiosResponse<string>>;
    public loginUser(username: string, password: string, ): Observable<any> {

        if (username === null || username === undefined) {
            throw new Error('Required parameter username was null or undefined when calling loginUser.');
        }

        if (password === null || password === undefined) {
            throw new Error('Required parameter password was null or undefined when calling loginUser.');
        }

        let queryParameters = new URLSearchParams();
        if (username !== undefined && username !== null) {
            queryParameters.append('username', <any>username);
        }
        if (password !== undefined && password !== null) {
            queryParameters.append('password', <any>password);
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/xml',
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<string>(`${this.basePath}/user/login`,
                    {
                        params: queryParameters,
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Logs out current logged in user session
     * 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public logoutUser(): Observable<AxiosResponse<any>>;
    public logoutUser(): Observable<any> {

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (api_key) required
        if (this.configuration.apiKeys?.["api_key"]) {
            headers['api_key'] = this.configuration.apiKeys["api_key"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<any>(`${this.basePath}/user/logout`,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Updated user
     * This can only be done by the logged in user.
     * @param username name that need to be deleted
     * @param user Updated user object
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updateUser(username: string, user: User, ): Observable<AxiosResponse<any>>;
    public updateUser(username: string, user: User, ): Observable<any> {

        if (username === null || username === undefined) {
            throw new Error('Required parameter username was null or undefined when calling updateUser.');
        }

        if (user === null || user === undefined) {
            throw new Error('Required parameter user was null or undefined when calling updateUser.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (api_key) required
        if (this.configuration.apiKeys?.["api_key"]) {
            headers['api_key'] = this.configuration.apiKeys["api_key"];
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return accessTokenObservable.pipe(
            map((accessToken) => {
                if(accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.put<any>(`${this.basePath}/user/${encodeURIComponent(String(username))}`,
                    user,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
}
