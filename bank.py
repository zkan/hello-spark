from pyspark.sql import SparkSession


spark = SparkSession.builder \
            .master('local[*]') \
            .appName('ml-bank') \
            .getOrCreate()
df = spark.read.csv('bank.csv', header = True, inferSchema = True)
df.printSchema()
