package com.javacodegeeks.examples.sequenceFile;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class PointWritable implements WritableComparable<PointWritable>{
	private int x;
	private int y;
	
	public PointWritable() {
		this(0,0);
	}
	
	public PointWritable(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		x = in.readInt();
		y = in.readInt();
	}

	@Override
	public void write(DataOutput out) throws IOException {
		out.write(x);
		out.write(y);
		
	}

	@Override
	public int compareTo(PointWritable o) {
		if(o == null) {
			return -1;
		}
		
		return 0;
	}

}
