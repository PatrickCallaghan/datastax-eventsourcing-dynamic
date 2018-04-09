create keyspace if not exists datastax WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 3};

use datastax;

CREATE TABLE IF NOT EXISTS eventsource_dynamic (
date text,
bucket int,
id uuid, 
aggregatetype text, 
host text,
loglevel text,
data text, 
time timestamp, 
eventtype text, 
p_ map<text,int>,
PRIMARY KEY(id)
);

