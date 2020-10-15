import pyspark


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
