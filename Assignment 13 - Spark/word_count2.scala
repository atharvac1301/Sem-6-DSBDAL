var data = sc.textFile("word_count.txt")
data.collect;

var splitdata = data.flatMap(line=>line.split(" "))
splitdata.collect;

var mapper = splitdata.map(word=>(word, 1))
mapper.collect;

var reducer = mapper.reduceByKey(_+_)
reducer.collect;