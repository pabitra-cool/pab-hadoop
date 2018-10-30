How to run MapReduceEx ::
=========================
Download sample dataset : //www.ibm.com/communities/analytics/watson-analytics-blog/sales-products-sample-data/WA_Sales_Products_2012-14.csv
 
Start hadoop ::  start-dfs.sh & start-yarn.sh

1. Copy the WA_Sales_Products_2012-14.csv into hdfs folder ie /Sales
2. Open project MapReduceEx(ProductSales.java,ProductSalesReducer.java,ProductSalesDriver.java)  and create jar file ie sales.jar 
3. Copy sales.jar into master node vm
4. Run MapReduce driver program -  
hadoop jar /home/hadoop/sales.jar pab.hadoop.mapreduce.product /Sales/WA_Sales_Products_2012-14.csv  /Output/ProductSales
5. Now we can see the result through command line / web interface-
hdfs dfs -cat /Output/ProductSales
Web interface/File system :
http://localhost:50070/dfshealth.jsp
