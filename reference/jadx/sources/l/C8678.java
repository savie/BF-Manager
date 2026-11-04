package l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes4.dex */
public final class C8678 implements InterfaceC17058 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22302 f28330;

    public C8678(C22302 c22302) {
        this.f28330 = c22302;
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12540(Object obj) {
        return ((C5148) obj).m15561();
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ᩷ */
    public final String mo12541(Object obj) {
        return ((C5148) obj).m15562();
    }

    @Override // l.InterfaceC17058
    /* JADX INFO: renamed from: ۙ */
    public final List mo12539(String str) throws IOException {
        C22302 c22302 = this.f28330;
        try {
            String strSubstring = AbstractC7364.m20187(str).substring(1);
            ArrayList arrayList = new ArrayList();
            String strM603 = null;
            while (true) {
                ObjectListing objectListingM442 = c22302.f72198.m442(new ListObjectsRequest(C22302.m50361(c22302), strSubstring, strM603, "/", 1000));
                Iterator it = objectListingM442.m605().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C5148((String) it.next()));
                }
                for (S3ObjectSummary s3ObjectSummary : objectListingM442.m607()) {
                    if (!s3ObjectSummary.m653().endsWith("/")) {
                        arrayList.add(new C5148(s3ObjectSummary));
                    }
                }
                if (!objectListingM442.m604() || Thread.currentThread().isInterrupted()) {
                    break;
                    break;
                }
                strM603 = objectListingM442.m603();
            }
            return arrayList;
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
