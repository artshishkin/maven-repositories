#15 Maven Build Profiles

##152 Creating PackageCloud Build Profile

##153 Assignment - Add Build Profile for Nexus

I added 2 `server`-s to `settings.xml` like so
```xml
<server>
    <id>nexus-snapshots</id>
    <username>admin</username>
    <password>{JJEwLiPh5EYHU4p05omsti5xkZ0nSK6JsbCooUOKVMYKGestgID4cNzG2zjsIrI/}</password>
</server>
```

##154 Assignment review

- setting Nexus group repo
- adding to `settings.xml` mirror of this repo

##155 Maven Profile Command Line Usage 
- `mvn help:active-profiles`
- `mvn help:active-profiles -Ppackagecloud`
- `mvn clean deploy -Pnexus_distro`
- `mvn help:active-profiles -P!packagecloud,nexus_distro`
- `mvn clean deploy -P !packagecloud,nexus_distro` - deactivate one profile and activate another

##156 Setting Properties in Profiles  
- create simple test to use env variable
  
