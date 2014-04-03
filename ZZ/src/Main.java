import jgse.reporting.oda.Statistics.MaximumMulti;
import jgse.reporting.oda.Statistics.MinimumMulti;
import jgse.reporting.oda.demo.producer.RandomMultiGeneratorStream;
import jgse.reporting.oda.demo.producer.RandomMultiGeneratorStream2;
import jgse.reporting.oda.edu.sim.spot.connect.streaming.basic.BlockController;
import jgse.reporting.oda.edu.sim.spot.connect.streaming.main.MultiTimeVectortoTimeVectorProcessStream;



public class Main {


	public static void main(String[] args) {

		MultiTimeVectortoTimeVectorProcessStream z1 = new MultiTimeVectortoTimeVectorProcessStream(20);//so oft wird die read durchgeführt
		
		RandomMultiGeneratorStream r3 = new RandomMultiGeneratorStream(123);//soviele samples hat er
		RandomMultiGeneratorStream2 r4 = new RandomMultiGeneratorStream2(123);//soviele samples hat er
		
		z1.combineStreams(r3,r4);
		MaximumMulti a1 = new MaximumMulti();	
		z1.setNext(a1);
		
		BlockController bc1 = new BlockController(123);//maximum(aus allen produceern sein)
		z1.setController(bc1);
		bc1.execute();
		
		MultiTimeVectortoTimeVectorProcessStream z2 = new MultiTimeVectortoTimeVectorProcessStream(20);//so oft wird die read durchgeführt
		
		RandomMultiGeneratorStream r5 = new RandomMultiGeneratorStream(123);//soviele samples hat er
		
		z2.combineStreams(z1,r5);
		MinimumMulti a2 = new MinimumMulti();
		z2.setNext(a2);

		
		BlockController bc = new BlockController(123);//maximum(aus allen produceern sein)
		z2.setController(bc);
		bc.execute();
	}
}
