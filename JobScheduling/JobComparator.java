package JobScheduling;

import java.util.Comparator;

/**
 * Comparing between two Job's from Job() by Comparator
 * 
 * @author tanmoy.tushar
 * @since 2017-07-07
 *
 */
public class JobComparator implements Comparator<Job> {

	@Override
	public int compare(Job o1, Job o2) {
		return o1.finish < o2.finish ? -1 : o1.finish == o2.finish ? 0 : 1;
	}
}
