package StorjLib.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.storj.libstorj.File;

public class FileModel {
    @Expose
    @SerializedName("bucketId")
    private String _bucketId;
    @Expose
    @SerializedName("created")
    private String _created;
    @Expose
    @SerializedName("erasure")
    private String _erasure;
    @Expose
    @SerializedName("hmac")
    private String _hmac;
    @Expose
    @SerializedName("fileId")
    private String _fileId;
    @Expose
    @SerializedName("index")
    private String _index;
    @Expose
    @SerializedName("mimeType")
    private String _mimeType;
    @Expose
    @SerializedName("name")
    private String _name;
    @Expose
    @SerializedName("size")
    private long _size;
    @Expose
    @SerializedName("isDecrypted")
    private boolean _isDecrypted;
    @Expose
    @SerializedName("isStarred")
    private boolean _isStarred;


    public FileModel(File file) {
        _bucketId = file.getBucketId();
        _created = file.getCreated();
        _erasure = file.getErasure();
        _fileId = file.getId();
        _hmac = file.getHMAC();
        _index = file.getIndex();
        _isDecrypted = file.isDecrypted();
        //_mimeType = file.getMimeType();
        _name = file.getName();
        _size = file.getSize();
    }

    public FileModel(File file, boolean isStarred) {
        _bucketId = file.getBucketId();
        _created = file.getCreated();
        _erasure = file.getErasure();
        _fileId = file.getId();
        _hmac = file.getHMAC();
        _index = file.getIndex();
        _isDecrypted = file.isDecrypted();
        //_mimeType = file.getMimeType();
        _name = file.getName();
        _size = file.getSize();
        _isStarred = isStarred;
    }

    public boolean isValid() {
        return  _fileId != null && !_fileId.isEmpty() &&
                _bucketId != null && !_bucketId.isEmpty() &&
                _name != null && !_name.isEmpty() &&
                _mimeType != null && !_mimeType.isEmpty() &&
                _created != null && !_created.isEmpty() &&
                _size > 0;
    }

    public String getBucketId() {
        return _bucketId;
    }
    public String getCreated() {
        return _created;
    }
    public String getErasure() {
        return _erasure;
    }
    public String getHmac() {
        return _hmac;
    }
    public String getFileId() {
        return _fileId;
    }
    public String getIndex() {
        return _index;
    }
    public String getMimeType() {
        return _mimeType;
    }
    public String getName() {
        return _name;
    }
    public long getSize() {
        return _size;
    }
    public boolean getDecrypted() {
        return _isDecrypted;
    }
    public boolean getStarred() {
        return _isStarred;
    }
}
