package StorjLib.dataProvider.Dbo;

import StorjLib.dataProvider.contracts.BucketContract;

/**
 * Created by Crawter on 05.03.2018.
 */

public class BucketDbo {
    private String _id;
    private String _name;
    private String _created;
    private long _hash;
    private boolean _isDecrypted;
    private boolean _isStarred;

    public void setProp(String propName, String value) {
        switch(propName) {
            case BucketContract._CREATED :
                _created = value;
                break;
            case BucketContract._NAME :
                _name = value;
                break;
            case BucketContract._ID :
                _id = value;
                break;
        }
    }

    public void setProp(String propName, boolean value) {
        switch(propName) {
            case BucketContract._DECRYPTED :
                _isDecrypted = value;
                break;
            case BucketContract._STARRED :
                _isStarred = value;
                break;
        }
    }

    public void setProp(String propName, long value) {
        _hash = value;
    }
}
