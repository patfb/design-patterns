package proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

		System.out.print(service.getTimeline("userName"));

		System.out.println();

		service.postToTimeline("userName", "some message");
	}

}
