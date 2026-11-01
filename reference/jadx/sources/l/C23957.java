package l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes.dex */
public final class C23957 implements InterfaceC15241 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3494 f77682;

    public C23957(C3494 c3494) {
        this.f77682 = c3494;
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25907(Object obj) {
        return ((C9846) obj).m24950();
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ܰ */
    public final String mo25908(Object obj) {
        return ((C9846) obj).m24951();
    }

    @Override // l.InterfaceC15241
    /* JADX INFO: renamed from: ۙ */
    public final List mo25906(String str) throws IOException {
        C3494 c3494 = this.f77682;
        try {
            String strSubstring = AbstractC11462.m28608(str).substring(1);
            ArrayList arrayList = new ArrayList();
            String strM611 = null;
            while (true) {
                ObjectListing objectListingM448 = c3494.f12809.m448(new ListObjectsRequest(C3494.m10258(c3494), strSubstring, strM611, "/", 1000));
                Iterator it = objectListingM448.m612().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C9846((String) it.next()));
                }
                for (S3ObjectSummary s3ObjectSummary : objectListingM448.m606()) {
                    if (!s3ObjectSummary.m660().endsWith("/")) {
                        arrayList.add(new C9846(s3ObjectSummary));
                    }
                }
                if (!objectListingM448.m610() || Thread.currentThread().isInterrupted()) {
                    break;
                    break;
                }
                strM611 = objectListingM448.m611();
            }
            return arrayList;
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
