package de.philipilihp.hadoop.atp;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class TotalPointsReducer extends
        Reducer<Text, LongWritable, Text, IntWritable> {

    @Override
    public void reduce(Text key, Iterable<LongWritable> values, Context context) throws IOException, InterruptedException {
        int count = 0;
        for (LongWritable value : values) {
            count++;
        }
        context.write(key, new IntWritable(count));
    }
}
