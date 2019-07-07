package JobScheduling;

/**
 * Job model of Start-time, Finish-time and Profit
 * 
 * @author tanmoy.tushar
 * @since 2019-07-07
 *
 */
public class Job {
	
	int start, finish, profit;
	
	Job(int start, int finish, int profit){
		this.start = start;
		this.finish = finish;
		this.profit = profit;
	}
}
