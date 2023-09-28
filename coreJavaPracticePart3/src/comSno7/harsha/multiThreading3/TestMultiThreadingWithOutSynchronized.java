package comSno7.harsha.multiThreading3;
//problem 

/*problem with the MultiThreading
 * 
 * when we want to build a house we need bricks
 * 
 * Bricks are come by tractor or lorry
 * 
 * They left it & tractor & lorry go away
 * To left it down -> single or multi worker?
 * 
 * obviously -> it's a multiple worker
 * 
 * if tractor -> it bring around 6000 bricks
 * if lorry -> it bring around 25 to 30 k bricks
 * 
 * 
 * ok bricks are here 
 * but how many are bricks left it down
 * 
 * let's take a brick sender owner
 * says 3ok brick are loaded to you
 * 
 * let take a brick receiver owner
 * 
 * says 
 * i have to unload so that i need to maintain brick dairy
 * 
 * book
 * sender or worker updated a loaded bricks from a lorry maintain a count of brick's 
 * 
 * similarly 
 * 
 * other sender or other worker updated a loaded bricks from lorry maintain a count of brick's
 * 
 * Thread -> Worker
 * Task -> work(unloadingBricks)
 * 
 * 
 * 
 * 
 */



/*
 * Worker unload bricks
 * 
 * 1.10k bricks
 * 2.15k bricks
 * 3.5k bricks
 * 
 * you have to maintain a brick dairy
 * brickCount
 * incrementBrickCount();
 * --> Count for every 50 bricks unloading & they updating
 * t1.start, t2.start, t3.start
 * 
 * main thread have to wait until thread's Completion
 * t1.join, t2.join, t3.join
 * 
 * they process is go in right way but way the count difference 
 * sometimes 28k, 30k, 26k
 * 
 * here the worker's are updating at same time as bricks are unloaded
 * 
 * worker 1 and 2 at same time so 50 + 50 = 100
 * 
 * Brick Dairy were updated as only once that 50bricks
 * 
 * here the confusion takes so the count difference in BrickDairy of receiver & sender owner
 * 
 *
 * 
 */


public class TestMultiThreadingWithOutSynchronized {

	public static void main(String[] args) throws Exception {

		NonSynBrickDairy bd = new NonSynBrickDairy();
		//Task of Unloading Brick
		
		Runnable r1 = () ->{
			for(int i=0; i<10000; i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
		};
		
		Runnable r2 = () ->{
			for(int i=0; i<15000; i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
			}
		};
		
		
		Runnable r3 = () ->{
			for(int i=0; i<5000; i+=50) {
				//unloading the 50 bricks
				bd.incrementBrickCount();
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

	}

}

class NonSynBrickDairy{
	int brickCount = 0;
	public void incrementBrickCount() {
		brickCount += 50;
	}
	
}




