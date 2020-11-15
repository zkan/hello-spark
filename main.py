import pyspark


# sc = pyspark.SparkContext('spark://192.168.1.35:7077')
# sc = pyspark.SparkContext('MacBook-Pro.local:7077') # Could not parse Master URL: 'MacBook-Pro.local:7077'
# sc = pyspark.SparkContext('spark://MacBook-Pro.local') # Invalid master URL: spark://MacBook-Pro.local
# sc = pyspark.SparkContext('spark://MacBook-Pro.local:7077')
#sc = pyspark.SparkContext('spark://192.168.1.35:7077')
# sc = pyspark.SparkContext('local') # Use its own context
# sc = pyspark.SparkContext('MacBook-Pro.local') # Could not parse Master URL: 'MacBook-Pro.local'
sc = pyspark.SparkContext('local[*]')

txt = sc.textFile('python-copyright.txt')
print(txt.count())

python_lines = txt.filter(lambda line: 'python' in line.lower())
print(python_lines.count())

# -----

big_list = range(10000)

# parallelize() turns that iterator into a distributed set of numbers and gives you all the capability of Spark’s infrastructure.
rdd = sc.parallelize(big_list, 2)

odds = rdd.filter(lambda x: x % 2 != 0)
print(odds.take(5))

# # load the file
# textFile = sc.textFile("example.txt")
#
# # create one RDD per line
# print(textFile.count()) # should return 5
#
# # print the first RDD (first line)
# print(textFile.first())
#
# # print the first couple lines (maybe 3 lines?)
# print(textFile.take(3))
