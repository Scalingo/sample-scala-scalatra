# Sample Application with Scala and Scalatra #

## Build & Run ##

```sh
$ cd sample-scala-scalatra
$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Deploying on Scalingo

You can use our one-click button: [![Deploy to Scalingo](https://cdn.scalingo.com/deploy/button.svg)](https://my.scalingo.com/deploy)

Or do it manually in order to customize the sample by creating an application on https://scalingo.com, then:

```
git remote add scalingo git@scalingo.com:<name_of_your_app>.git
git push scalingo master
```

And that's it!

The application is running at this url: https://sample-scala-scalatra.scalingo.io/


