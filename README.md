# Spring-boot-and-angular

## Quick Start
Run `docker-compose up` to pull and start the `frontend` and the `backend` services. If you are on a Linux system, therefore, you need to be a superuser. Afterward, navigate to http://localhost:4200/ and select a region to see the corresponding AWS IP ranges.

#### Hint: Make sure the port 4200 and 8080 are not allocated by some other processes.

## API Call
As long as the backend service is running, the following requests can be made:
http://localhost:8080/ip-ranges.amazonaws?region=X where the variable `X` can be set to: 
  * af 
  * eu
  * us
  * ap
  * cn
  * sa
  * ca
  * all
  
  The arguments are case insensitive.

## Github Actions
Folder `.github/workflows` holds the configurations for the Github Actions.  Each push on the `main branch` trickers a build and a test for both the  backend and frontend services.


## Docker
Each service has a `Dockerfile` to containerized the service. The corresponding images are pushed to Docker Hub, which are then used by the `docker-compose file`

## Test
For each service, test are written (see Github Actions).

