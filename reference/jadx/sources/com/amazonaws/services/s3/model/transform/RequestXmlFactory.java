package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.model.PartETag;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestXmlFactory {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m699(List list) {
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.m483("CompleteMultipartUpload");
        if (list != null) {
            Collections.sort(list, new Comparator() { // from class: com.amazonaws.services.s3.model.transform.RequestXmlFactory.1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    PartETag partETag = (PartETag) obj;
                    PartETag partETag2 = (PartETag) obj2;
                    if (partETag.m638() < partETag2.m638()) {
                        return -1;
                    }
                    return partETag.m638() > partETag2.m638() ? 1 : 0;
                }
            });
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PartETag partETag = (PartETag) it.next();
                xmlWriter.m483("Part");
                xmlWriter.m483("PartNumber");
                xmlWriter.m484(Integer.toString(partETag.m638()));
                xmlWriter.m482();
                xmlWriter.m483("ETag");
                xmlWriter.m484(partETag.m637());
                xmlWriter.m482();
                xmlWriter.m482();
            }
        }
        xmlWriter.m482();
        return xmlWriter.m485();
    }
}
