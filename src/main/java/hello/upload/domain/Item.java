package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private long id;
    private String itemName;
    private UploadFile attachFile;
    private List<UploadFile> imageFiles;
}
