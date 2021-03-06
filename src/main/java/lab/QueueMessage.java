package lab;

import java.io.Serializable;
import java.util.HashMap;

public final class QueueMessage implements Serializable {

	private long id;
    private String guid;
    private String sourceHost;
    private long delay;
    

    public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	public String getSourceHost() {
		return sourceHost;
	}

	public void setSourceHost(String sourceHost) {
		this.sourceHost = sourceHost;
	}

	// Default constructor is needed to deserialize JSON
    public QueueMessage() {
    }

    public QueueMessage(long id, String guid) {
		this.id = id;
		this.guid = guid;
    }
    public void setGuid(String guid) {
    	this.guid = guid;
    }
    public String getGuid() {
        return this.guid;
    }
	public void setId(long id) {
		this.id = id;
	}

    public long getId() {
    	return this.id;
    }

    @Override
    public String toString() {
        return "CustomMessage{" +
        			"id='" + id + "' " +
                "guid='" + guid + '\'' +
                '}';
    }

}
