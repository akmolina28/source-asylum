
public class Router {
	public class Neighbor
	{
		Router neighbor;
		int distance;
		public Neighbor(Router router, int distance)
		{
			this.neighbor = router;
			this.distance = distance;
		}
	}
	
	public Neighbor[] neighbors;
}
