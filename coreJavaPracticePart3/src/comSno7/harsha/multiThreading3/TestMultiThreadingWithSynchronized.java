package comSno7.harsha.multiThreading3;
//it's Solution
public class TestMultiThreadingWithSynchronized {

	public static void main(String[] args) throws Exception {
		BrickDairy bd = new BrickDairy();
		
		/*Thread1 -> value updated then after thread2 value have to updated
		 *
		 * At the same time  more then one Thread don't do it's Updation
		 * sequence have to maintain or one by one have to updated
		 * 
		 *Here the process synchronization help's without getting loss of data
		 * 
		 *The problem occurs here loss of data is called raceCondition
		 *  
		 *MultiThreading is best for MultiTasking but here losses of data is called RaceCondition
		 *
		 * sometime more then one thread or MultiThreading don't do it's updation 
		 * but here the solution of loss of data by synchronization  
		 */


		/* Important
		 ****************
		 * Synchronized & volatile are keyword for safe MultiThreading
		 * 
		 * use volatile for valueGet
		 * use synchronized for valueUpdate or valueManipulation
		 * 
		 * synchronized is best ideas to multiThreading value Updation
		 * due to synchronized thread have to stop when other thread is updating
		 * 
		 * 1.here performance is degrading
		 * 2.Deadlock
		 * oneThread can't doing update & not giving chance for other thread
		 * 
		 * for example
		 * Green tea is best for taking once a day
		 * But 
		 * if you drink like water as a greenTea is bad
		 */

		Runnable r1 = () ->{
			for(int i=0; i<10000; i+=50) {
				//unloading the 50 bricks
				bd.IncrementBrickcount();
			}
		};

		Runnable r2 = () ->{
			for(int i=0; i<10000; i+=50) {
				//unloading the 50 bricks
				bd.IncrementBrickcount();
			}
		};

		Runnable r3 = () ->{
			for(int i=0; i<10000; i+=50) {
				//unloading the 50 bricks
				bd.IncrementBrickcount();
			}
		};

		//Workers
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		//Workers started work 
		//Thread Started Task
		t1.start();
		t2.start();
		t3.start();

		//Use join for main method have to wait until thread completion
		t1.join();
		t2.join();
		t3.join();

		System.out.println(bd.brickCount);
		System.out.println(bd.brickCount2); 
	}

}

class BrickDairy{
	int brickCount = 0;
	int brickCount2 = 0;
	//if you want Entair method for synchronized at method level
	public void IncrementBrickcount() {
		//Apply synchronized key-word for partially at Method Level 
		synchronized(this) {
			brickCount += 50;
		}
		//here the difference of synchronized KW
		brickCount2 += 50;
	}
 }
