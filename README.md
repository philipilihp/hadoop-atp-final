# hadoop-atp-final
Example project for running hadoop in a docker container

### Video Tutorial
https://www.youtube.com/watch?v=mRSWcVrtWj0

### Data set
https://www.kaggle.com/robseidl/tennis-atp-tour-australian-open-final-2019

### Setup
####Run hadoop in docker: 
`
docker run -it -p 50070:50070 -p 8088:8088 -p 50075:50075 sequenceiq/hadoop-docker:2.7.0 /etc/bootstrap.sh -bash
`

#### Access dashboard:
[http://192.168.99.100:50070](http://192.168.99.100:50070)

Go to `browse directory` and call `user/root`

#### Copy Data into container
`docker cp points.csv 946e0c69713a:/tmp/`

#### Copy Data into HDFS:

`/usr/local/hadoop/bin/hdfs dfs -put -p -f /tmp/points.csv /user/root/input/points`

#### Copy ja into docker container
`docker cp atp-final-0.0.1-SNAPSHOT.jar 946...:/tmp/atp-final.jar`

#### Run the Job
`$HADOOP_PREFIX/bin/hadoop jar /tmp/atp-final.jar "test" "/user/root/input/points" "/user/root/input/points-result"`

### Next Steps
#### Running a hadoop cluster on GCP
https://medium.com/google-cloud/launch-a-hadoop-cluster-in-90-seconds-or-less-in-google-cloud-dataproc-b3acc1c02598

