package JobScheduling;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A Binary Search based function to find the latest job (before current job)
 * that doesn't conflict with current job.
 * 
 * @author tanmoy.tushar
 * @since 2019-07-07
 *
 */
public class Scheduling {

	static Scanner sc = new Scanner(System.in);

	static public int binarySearch(Job[] jobs, int index) {
		int low = 0, high = index - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (jobs[mid].finish <= jobs[index].start) {
				if (jobs[mid + 1].finish <= jobs[index].start)
					low = mid + 1;
				else
					return mid;
			} else
				high = mid - 1;
		}
		return -1;
	}

	static public int schedule(Job[] jobs) {
		Arrays.sort(jobs, new JobComparator());

		int totalJob = jobs.length;
		int[] table = new int[totalJob];
		table[0] = jobs[0].profit;

		for (int i = 1; i < totalJob; i++) {
			int includeProf = jobs[i].profit;
			int position = binarySearch(jobs, i);
			if (position != -1)
				includeProf += table[position];
			table[i] = Math.max(includeProf, table[i - 1]);
		}

		return table[totalJob - 1];
	}

	public static void main(String[] args) {

		int totalJob = sc.nextInt();
		int start, finish, profit;
		Job[] job = new Job[totalJob];
		for (int i = 0; i < totalJob; i++) {
			start = sc.nextInt();
			finish = sc.nextInt();
			profit = sc.nextInt();
			job[i] = new Job(start, finish, profit);
		}

		System.out.println("Optimal profit is: " + schedule(job));
	}
}
