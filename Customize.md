GitPitch Customize
===================

### Front page

* html: app/com/gitpitch/views/index.scala.html
* PortalController: app/com/gitpitch/PortalController.java
* routing:  please add following in conf/routes

```
GET  /  com.gitpitch.controllers.PortalController.index
```

### Configuration

* Secret key
```
play.crypto.secret = "1234567890"
```

* Allowed hosts filter configuration

```
allowed = ["localhost", "127.0.0.1", ".local","ip here", "domain here"]
```

* hostname for listen

```
hostname = "0.0.0.0:9000"
```

* git repository setting

```
git {
    repo {
        services = [
           {}
```


