package linkedListNeeds;

public class Page {
	  String url;
      Page next, prev;

      public Page(String url) {
          this.url = url;
      }

	  public String getUrl() {
		  return url;
	  }

	  public void setUrl(String url) {
		  this.url = url;
	  }

	  public Page getNext() {
		  return next;
	  }

	  public void setNext(Page next) {
		  this.next = next;
	  }

	  public Page getPrev() {
		  return prev;
	  }

	  public void setPrev(Page prev) {
		  this.prev = prev;
	  }
}
