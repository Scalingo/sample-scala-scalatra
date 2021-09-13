# Sample Application with Scala and Scalatra

This sample is running on: https://scala-scalatra.is-easy-on-scalingo.com

## Deploy via Git

Create an application on https://scalingo.com, then:

```shell
scalingo -a my-app git-setup
git push scalingo master
```

And that's it!

## Deploy via One-Click

[![Deploy to Scalingo](https://cdn.scalingo.com/deploy/button.svg)](https://my.scalingo.com/deploy)

## Run Locally

```shell
$ cd sample-scala-scalatra
$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080](http://localhost:8080) in your browser.
