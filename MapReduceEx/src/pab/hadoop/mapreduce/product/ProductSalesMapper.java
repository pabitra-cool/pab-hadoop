package pab.hadoop.mapreduce.product;

import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class ProductSalesMapper extends MapReduceBase implements Mapper <LongWritable, Text, Text, IntWritable> {

	@Override
	public void map(LongWritable key, Text values, OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {

		String valueString = values.toString();
		String[] CountryProductSalesData = valueString.split(",");
		
		output.collect(new Text(CountryProductSalesData[5]), new IntWritable(Integer.parseInt(CountryProductSalesData[9])));
	}
}