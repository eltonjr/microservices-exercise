# System workflow

## Step 0

When the system loads, a initial request is made to populate the Locations list on the left side of the page.

**[webpage]** --- GET /locations ---> **[nginx]** --- GET /locations ---> **[ws-locations]**

![step0](https://raw.githubusercontent.com/eltonjr/microservices-exercise/master/docs/stage0.png)

## Step 1

When the user clicks a city name on the left, a request is made with the city's ID to get the city's Demographics information.

**[webpage]** --- GET /demographics/<id> ---> **[nginx]** --- GET /demographics/<id> ---> **[ws-demographics]**

![step1](https://raw.githubusercontent.com/eltonjr/microservices-exercise/master/docs/stage1.png)

## Step 2

When the user decides to create a new Business at that location, he clicks the button on the bottom of the page and a POST is made to save that location at the third webservice. The body of the post is the content to be saved.

**[webpage]** --- POST /business ---> **[nginx]** --- POST /business ---> **[ws-business]**

After the Business returned a `HTTP 200 OK`, a new request is made to get all the saved businesses since they have changed. The response is used to populate a list on the right side of the page.

**[webpage]** --- GET /business ---> **[nginx]** --- GET /business ---> **[ws-business]**

![step2](https://raw.githubusercontent.com/eltonjr/microservices-exercise/master/docs/stage2.png)
