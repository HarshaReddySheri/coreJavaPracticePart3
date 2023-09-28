package comSno5.harsha.multiThreading1;

public class MultiThreadingBasics {
	/*
	 * Task ->work
	 * (multipleTasking-Tasking OneByOne) 
	 * 		-eat
	 * 		-drink
	 * 		-sleep
	 * 
	 * 		-watch video
	 * 		-Listen music
	 * 		-Send message
	 * 		-Calculate
	 * 
	 * Tasking ->working
	 * (multiTasking-Tasking at Once)
	 * 			-eating
	 * 			-drinking
	 * 			-sleeping
	 * 
	 * 			-watching video
	 * 			-listening music
	 * 			- sending message
	 * 			- calculation
	 * 
	 * Task mean work ( Multi works doing at once is called MultiWorking)
	 * Tasking mean working (Multi tasks doing at once is called MultiTasking)
	 * 
	 * for EX;
	 * 1.All the recent app working on a mobile
	 * 
	 * 2. Let take Amazon
	 * item where packing in it
	 * 
	 * packing --> task
	 * person or robot --> Thread
	 * packingRoom ***********
	 * shipingRoom			**-->process (allocating space or area to work done by person or robot
	 * CustomerCareRoom	   ***		
	 *
	 *3.let's take what app
	 *
	 *first it create one process for run inside that process whatApp application will run inside process
	 *
	 *whatApp --> messaging, calling(At Once is called MultiTasking)
	 *
	 * RealWorld
	 * **********
	 * 		work done by person
	 * 		Task done by Thread
	 * 
	 * 
	 * 
	 * 100gb memory
	 * Application run --> i need 1GB
	 * 
	 * Application run resources
	 * Application run memory
	 * --> need logical container(process) keep in it
	 * --> it has id for processing
	 * 
	 * 
	 * Hierarchy
	 * **********
	 * Applications 3Thing do
	 * ***************************************
	 * Process		 Room
	 * 		l			l
	 *  	Thread     Person
	 *  		l          l
	 *  		Task       work
	 *  
	 * MultiApplications 3Thing do
	 * *********************************************
	 * MultiProcessing				 MultiRooming
	 * 		l							  l
	 *  	MultiThreading 			    MultiPersoning
	 *  		l       					   l
	 *  		MultiTasking 			      Multiworking
	 
	 * 		
	 */
}
