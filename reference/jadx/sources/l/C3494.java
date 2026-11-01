package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.UploadPartRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۗ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes.dex */
public class C3494 extends AbstractC12233 {

    /* JADX INFO: renamed from: ۛ۬ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f12807;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12808 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4906 f12809;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4801 f12810;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18062 f12811;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private native void m10257();

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo10259() {
        return false;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean mo10271() {
        return false;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo10274(C11018 c11018) {
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo10275() {
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean mo10277() {
        return false;
    }

    public C3494(int i, AbstractC12068 abstractC12068) {
        super(i, abstractC12068);
        this.f12811 = new C18062(new C23957(this), false);
        this.f12810 = C4801.m13334(i, abstractC12068);
        m10257();
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10266(AbstractC12068 abstractC12068) {
        super.mo10266(abstractC12068);
        C4801 c4801M13334 = C4801.m13334(this.f40872, abstractC12068);
        if (this.f12810.equals(c4801M13334)) {
            return;
        }
        this.f12810 = c4801M13334;
        m10257();
        this.f12811.m42059();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m10258(C3494 c3494) {
        return c3494.f12810.f16879;
    }

    static {
        ApplicationC6132.m17119(56);
        f12807 = new short[]{7788, -27370, -27306, -27318, -27385, -27384, -27381, -27375, -27392, -27390, -27384, -27387, -27370, -27391, -27369, -27376, -27381, -27370, -27387, -27389, -27391, -27318, -27385, -27381, -27383};
        SignerFactory.m223(C13975.class, "UnsignedPayloadSignerType");
    }

    public C3494(int i, AbstractC12068 abstractC12068, C17367 c17367) {
        this(i, abstractC12068);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo10276() {
        return this.f12810.f16874 + ":" + this.f12810.f16879;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo10279() {
        URI uriM13335 = this.f12810.m13335();
        if (uriM13335 != null && uriM13335.getHost() != null) {
            return uriM13335.getHost();
        }
        return AbstractC12233.m30340(C17606.m40926(this.f12810.f16874, new ClientConfiguration()));
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo10278() {
        return TextUtils.isEmpty(this.f40874.f40395) ? "/" : AbstractC11462.m28608(this.f40874.f40395);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10267(boolean z) {
        this.f12811.m42059();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 mo10264(String str) {
        C18062 c18062 = this.f12811;
        c18062.getClass();
        C9846 c9846 = (C9846) c18062.m42058(C6730.m18172(str), C6730.m18175(str));
        if (c9846 == null) {
            return null;
        }
        return c9846.m24949();
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList mo10263(String str, boolean z) {
        Collection<C9846> collectionValues = this.f12811.m42057(AbstractC11462.m28608(str)).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C9846 c9846 : collectionValues) {
            if (z || !c9846.m24951().startsWith(".")) {
                arrayList.add(c9846.m24949());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream mo10262(long j, String str) throws IOException {
        GetObjectRequest getObjectRequest = new GetObjectRequest(this.f12810.f16879, str.substring(1));
        if (j > 0) {
            if (C4906.m13637(this.f12810.f16874)) {
                C18062 c18062 = this.f12811;
                c18062.getClass();
                C9846 c9846 = (C9846) c18062.m42058(C6730.m18172(str), C6730.m18175(str));
                long j2 = -1;
                if (c9846 != null && c9846.f33630 != null) {
                    long jM665 = c9846.f33630.m665();
                    if (jM665 > 0 && j < jM665) {
                        j2 = jM665 - 1;
                    }
                }
                if (j2 >= j) {
                    getObjectRequest.m570(j, j2);
                } else {
                    getObjectRequest.m570(j, 9223372036854775806L);
                }
            } else {
                getObjectRequest.m570(j, 9223372036854775806L);
            }
        }
        try {
            return this.f12809.mo437(getObjectRequest).m650();
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10256(C3494 c3494, PutObjectRequest putObjectRequest, AtomicReference atomicReference, InterfaceC10008 interfaceC10008, CountDownLatch countDownLatch) {
        try {
            c3494.f12809.mo436(putObjectRequest);
            try {
                interfaceC10008.close();
            } catch (IOException e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        } catch (AmazonClientException e2) {
            IOException iOException = new IOException(e2.getMessage(), e2);
            while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
            }
            try {
                interfaceC10008.close();
            } catch (IOException e3) {
                while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
                }
            }
        } finally {
            try {
                interfaceC10008.close();
            } catch (IOException e4) {
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            countDownLatch.countDown();
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo10273(final long j, String str) throws IOException {
        if (j <= 2147483647L) {
            C6479 c6479 = new C6479(524288L);
            final InterfaceC10008 interfaceC10008M17674 = c6479.m17674();
            InterfaceC10983 interfaceC10983M3436 = C0834.m3436(c6479.m17673());
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m619(j);
            objectMetadata.m617(C21512.m48160(C6730.m18175(str), true).m48185());
            final PutObjectRequest putObjectRequest = new PutObjectRequest(this.f12810.f16879, str.substring(1), C0834.m3437(interfaceC10008M17674).mo16433(), objectMetadata);
            final AtomicReference atomicReference = new AtomicReference();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C4716.f16636.execute(new Runnable() { // from class: l.ۛ᩸֨
                @Override // java.lang.Runnable
                public final void run() {
                    C3494.m10256(this.f21347, putObjectRequest, atomicReference, interfaceC10008M17674, countDownLatch);
                }
            });
            return new C14785(atomicReference, interfaceC10983M3436, countDownLatch);
        }
        final String strSubstring = str.substring(1);
        ObjectMetadata objectMetadata2 = new ObjectMetadata();
        objectMetadata2.m617(C21512.m48160(C6730.m18175(str), true).m48185());
        try {
            final String strM588 = this.f12809.mo435(new InitiateMultipartUploadRequest(this.f12810.f16879, strSubstring, objectMetadata2)).m588();
            final ArrayList arrayList = new ArrayList();
            C6479 c64710 = new C6479(524288L);
            final InterfaceC10008 interfaceC10008M17675 = c64710.m17674();
            InterfaceC10983 interfaceC10983M3437 = C0834.m3436(c64710.m17673());
            final InputStream inputStreamMo16433 = C0834.m3437(interfaceC10008M17675).mo16433();
            final AtomicReference atomicReference2 = new AtomicReference();
            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
            C4716.f16636.execute(new Runnable() { // from class: l.ۧ᩸֨
                @Override // java.lang.Runnable
                public final void run() {
                    C3494.m10255(this.f38054, j, inputStreamMo16433, strSubstring, strM588, arrayList, atomicReference2, interfaceC10008M17675, countDownLatch2);
                }
            });
            return new C2083(this, atomicReference2, interfaceC10983M3437, countDownLatch2, strSubstring, strM588, arrayList);
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10255(C3494 c3494, long j, InputStream inputStream, String str, String str2, ArrayList arrayList, AtomicReference atomicReference, InterfaceC10008 interfaceC10008, CountDownLatch countDownLatch) {
        long jM9810 = 0;
        int i = 1;
        while (jM9810 < j) {
            try {
                long jMin = Math.min(104857600L, j - jM9810);
                C3307 c3307 = new C3307(jMin, inputStream);
                UploadPartRequest uploadPartRequest = new UploadPartRequest();
                uploadPartRequest.m680(c3494.f12810.f16879);
                uploadPartRequest.m687(str);
                uploadPartRequest.m684(str2);
                uploadPartRequest.m683(i);
                uploadPartRequest.m679(c3307);
                uploadPartRequest.m686(jMin);
                arrayList.add(c3494.f12809.mo438(uploadPartRequest).m694());
                jM9810 += c3307.m9810();
                i++;
            } catch (Throwable th) {
                try {
                    IOException iOException = new IOException(th.getMessage(), th);
                    while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
                    }
                    try {
                        c3494.f12809.mo439(new AbortMultipartUploadRequest(c3494.f12810.f16879, str, str2));
                    } catch (Throwable unused) {
                    }
                    try {
                        interfaceC10008.close();
                    } catch (IOException e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } finally {
                    try {
                        interfaceC10008.close();
                    } catch (IOException e2) {
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                    countDownLatch.countDown();
                }
            }
        }
        try {
            interfaceC10008.close();
        } catch (IOException e3) {
            while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
            }
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo10270(String str, boolean z) throws IOException {
        try {
            String strSubstring = str.substring(1);
            if (!z) {
                this.f12809.m451(new DeleteObjectRequest(this.f12810.f16879, strSubstring));
                return;
            }
            String str2 = strSubstring + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM611 = null;
            while (true) {
                ObjectListing objectListingM448 = this.f12809.m448(new ListObjectsRequest(this.f12810.f16879, str2, strM611, null, 1000));
                List list = (List) C9030.stream(objectListingM448.m606()).map(new C4686(2)).collect(C1890.toList());
                DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(this.f12810.f16879);
                deleteObjectsRequest.m561(list);
                deleteObjectsRequest.m563();
                try {
                    this.f12809.m452(deleteObjectsRequest);
                } catch (MultiObjectDeleteException e) {
                    Iterator it = e.m601().iterator();
                    if (it.hasNext()) {
                        throw new IOException(C16737.m39264(R.string.MT_Protector, ((MultiObjectDeleteException.DeleteError) it.next()).m602()));
                    }
                }
                if (objectListingM448.m610() && !threadCurrentThread.isInterrupted()) {
                    strM611 = objectListingM448.m611();
                }
                return;
            }
        } catch (AmazonClientException e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10265(String str, String str2) throws IOException {
        try {
            C18062 c18062 = this.f12811;
            c18062.getClass();
            C9846 c9846 = (C9846) c18062.m42058(C6730.m18172(str), C6730.m18175(str));
            String strSubstring = str.substring(1);
            String strSubstring2 = str2.substring(1);
            if (!(c9846 != null ? c9846.m24950() : !this.f12809.m453(this.f12810.f16879, strSubstring))) {
                if (this.f12809.m453(this.f12810.f16879, strSubstring2)) {
                    throw new IOException(C16737.m39264(R.string.MT_Protector, strSubstring2));
                }
                this.f12809.m450(new CopyObjectRequest(this.f12810.f16879, C17290.encode(strSubstring, StandardCharsets.UTF_8), this.f12810.f16879, strSubstring2));
                this.f12809.m451(new DeleteObjectRequest(this.f12810.f16879, strSubstring));
                return;
            }
            String str3 = strSubstring + "/";
            String str4 = strSubstring2 + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM611 = null;
            boolean z = true;
            while (true) {
                ObjectListing objectListingM448 = this.f12809.m448(new ListObjectsRequest(this.f12810.f16879, str3, strM611, null, 1000));
                if (z) {
                    if (!objectListingM448.m606().isEmpty() && !this.f12809.m448(new ListObjectsRequest(this.f12810.f16879, str4, null, null, 1)).m606().isEmpty()) {
                        throw new IOException(C16737.m39264(R.string.MT_Protector, str4));
                    }
                    z = false;
                }
                Iterator it = objectListingM448.m606().iterator();
                while (it.hasNext()) {
                    String strM660 = ((S3ObjectSummary) it.next()).m660();
                    this.f12809.m450(new CopyObjectRequest(this.f12810.f16879, C17290.encode(strM660, StandardCharsets.UTF_8), this.f12810.f16879, str4 + strM660.substring(str3.length())));
                    this.f12809.m451(new DeleteObjectRequest(this.f12810.f16879, strM660));
                    if (threadCurrentThread.isInterrupted()) {
                        break;
                    }
                }
                if (objectListingM448.m610() && !threadCurrentThread.isInterrupted()) {
                    strM611 = objectListingM448.m611();
                }
                return;
            }
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo10268(String str) throws IOException {
        try {
            String str2 = str.substring(1) + "/";
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m619(0L);
            this.f12809.mo436(new PutObjectRequest(this.f12810.f16879, str2, new ByteArrayInputStream(new byte[0]), objectMetadata));
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo10272(String str) {
        return this.f12811.m42062(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo10261(String str) {
        C18062 c18062 = this.f12811;
        c18062.getClass();
        return c18062.m42058(C6730.m18172(str), C6730.m18175(str)) != null;
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String mo10260(String str) {
        return this.f12811.m42063(str);
    }

    @Override // l.AbstractC12233
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo10269(String str) {
        this.f12811.m42060(str);
    }
}
