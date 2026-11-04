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

/* JADX INFO: renamed from: l.᩷᩶۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes.dex */
public class C22302 extends AbstractC18881 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72195 = 0;

    /* JADX INFO: renamed from: ܽ۬ۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f72196;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C11113 f72197;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C10915 f72198;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16312 f72199;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private native void m50357();

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo35574() {
        return false;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܰ */
    public final void mo35578() {
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo35581() {
        return false;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo35583() {
        return false;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final void mo35585(C6178 c6178) {
    }

    public C22302(int i, AbstractC0148 abstractC0148) {
        super(i, abstractC0148);
        this.f72199 = new C16312(new C8678(this), false);
        this.f72197 = C11113.m28063(i, abstractC0148);
        m50357();
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35572(AbstractC0148 abstractC0148) {
        super.mo35572(abstractC0148);
        C11113 c11113M28063 = C11113.m28063(this.f61288, abstractC0148);
        if (this.f72197.equals(c11113M28063)) {
            return;
        }
        this.f72197 = c11113M28063;
        m50357();
        this.f72199.m38698();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m50361(C22302 c22302) {
        return c22302.f72197.f35043;
    }

    static {
        ApplicationC23172.m52091(161);
        f72196 = new short[]{1067, -13198, -13262, -13266, -13213, -13204, -13201, -13195, -13212, -13210, -13204, -13215, -13198, -13211, -13197, -13196, -13201, -13198, -13215, -13209, -13211, -13266, -13213, -13201, -13203};
        SignerFactory.m217(C23048.class, "UnsignedPayloadSignerType");
    }

    public C22302(int i, AbstractC0148 abstractC0148, C20348 c20348) {
        this(i, abstractC0148);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܶ */
    public final String mo35579() {
        return this.f72197.f35044 + ":" + this.f72197.f35043;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ܽ */
    public final String mo35580() {
        URI uriM28064 = this.f72197.m28064();
        if (uriM28064 != null && uriM28064.getHost() != null) {
            return uriM28064.getHost();
        }
        return AbstractC18881.m43784(C9423.m24795(this.f72197.f35044, new ClientConfiguration()));
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۘ */
    public final String mo35569() {
        return TextUtils.isEmpty(this.f61289.f1128) ? "/" : AbstractC7364.m20187(this.f61289.f1128);
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final void mo20837(boolean z) {
        this.f72199.m38698();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2386 mo20831(String str) {
        C16312 c16312 = this.f72199;
        c16312.getClass();
        C5148 c5148 = (C5148) c16312.m38697(C11293.m28556(str), C11293.m28558(str));
        if (c5148 == null) {
            return null;
        }
        return c5148.m15560();
    }

    @Override // l.AbstractC7629
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo20830(String str, boolean z) {
        Collection<C5148> collectionValues = this.f72199.m38703(AbstractC7364.m20187(str)).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C5148 c5148 : collectionValues) {
            if (z || !c5148.m15562().startsWith(".")) {
                arrayList.add(c5148.m15560());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo35570(long j, String str) throws IOException {
        GetObjectRequest getObjectRequest = new GetObjectRequest(this.f72197.f35043, str.substring(1));
        if (j > 0) {
            if (C10915.m27689(this.f72197.f35044)) {
                C16312 c16312 = this.f72199;
                c16312.getClass();
                C5148 c5148 = (C5148) c16312.m38697(C11293.m28556(str), C11293.m28558(str));
                long j2 = -1;
                if (c5148 != null && c5148.f17948 != null) {
                    long jM658 = c5148.f17948.m658();
                    if (jM658 > 0 && j < jM658) {
                        j2 = jM658 - 1;
                    }
                }
                if (j2 >= j) {
                    getObjectRequest.m563(j, j2);
                } else {
                    getObjectRequest.m563(j, 9223372036854775806L);
                }
            } else {
                getObjectRequest.m563(j, 9223372036854775806L);
            }
        }
        try {
            return this.f72198.mo431(getObjectRequest).m644();
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50360(C22302 c22302, PutObjectRequest putObjectRequest, AtomicReference atomicReference, InterfaceC13810 interfaceC13810, CountDownLatch countDownLatch) {
        try {
            c22302.f72198.mo430(putObjectRequest);
            try {
                interfaceC13810.close();
            } catch (IOException e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        } catch (AmazonClientException e2) {
            IOException iOException = new IOException(e2.getMessage(), e2);
            while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
            }
            try {
                interfaceC13810.close();
            } catch (IOException e3) {
                while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
                }
            }
        } finally {
            try {
                interfaceC13810.close();
            } catch (IOException e4) {
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            countDownLatch.countDown();
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩷ */
    public final OutputStream mo35584(final long j, String str) throws IOException {
        if (j <= 2147483647L) {
            C0387 c0387 = new C0387(524288L);
            InterfaceC13810 interfaceC13810M2194 = c0387.m2194();
            InterfaceC11573 interfaceC11573M35106 = C14556.m35106(c0387.m2193());
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m612(j);
            objectMetadata.m609(C8969.m23952(C11293.m28558(str), true).m23975());
            PutObjectRequest putObjectRequest = new PutObjectRequest(this.f72197.f35043, str.substring(1), C14556.m35108(interfaceC13810M2194).mo4183(), objectMetadata);
            AtomicReference atomicReference = new AtomicReference();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C5261.f18540.execute(new RunnableC1395(this, putObjectRequest, atomicReference, interfaceC13810M2194, countDownLatch, 1));
            return new C7187(atomicReference, interfaceC11573M35106, countDownLatch);
        }
        final String strSubstring = str.substring(1);
        ObjectMetadata objectMetadata2 = new ObjectMetadata();
        objectMetadata2.m609(C8969.m23952(C11293.m28558(str), true).m23975());
        try {
            final String strM583 = this.f72198.mo429(new InitiateMultipartUploadRequest(this.f72197.f35043, strSubstring, objectMetadata2)).m583();
            final ArrayList arrayList = new ArrayList();
            C0387 c0388 = new C0387(524288L);
            final InterfaceC13810 interfaceC13810M2195 = c0388.m2194();
            InterfaceC11573 interfaceC11573M35107 = C14556.m35106(c0388.m2193());
            final InputStream inputStreamMo4183 = C14556.m35108(interfaceC13810M2195).mo4183();
            final AtomicReference atomicReference2 = new AtomicReference();
            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
            C5261.f18540.execute(new Runnable() { // from class: l.ۖܰ۫
                @Override // java.lang.Runnable
                public final void run() {
                    C22302.m50359(this.f9066, j, inputStreamMo4183, strSubstring, strM583, arrayList, atomicReference2, interfaceC13810M2195, countDownLatch2);
                }
            });
            return new C13898(this, atomicReference2, interfaceC11573M35107, countDownLatch2, strSubstring, strM583, arrayList);
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50359(C22302 c22302, long j, InputStream inputStream, String str, String str2, ArrayList arrayList, AtomicReference atomicReference, InterfaceC13810 interfaceC13810, CountDownLatch countDownLatch) {
        long jM50064 = 0;
        int i = 1;
        while (jM50064 < j) {
            try {
                long jMin = Math.min(104857600L, j - jM50064);
                C22104 c22104 = new C22104(jMin, inputStream);
                UploadPartRequest uploadPartRequest = new UploadPartRequest();
                uploadPartRequest.m674(c22302.f72197.f35043);
                uploadPartRequest.m684(str);
                uploadPartRequest.m678(str2);
                uploadPartRequest.m677(i);
                uploadPartRequest.m673(c22104);
                uploadPartRequest.m683(jMin);
                arrayList.add(c22302.f72198.mo432(uploadPartRequest).m688());
                jM50064 += c22104.m50064();
                i++;
            } catch (Throwable th) {
                try {
                    IOException iOException = new IOException(th.getMessage(), th);
                    while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
                    }
                    try {
                        c22302.f72198.mo433(new AbortMultipartUploadRequest(c22302.f72197.f35043, str, str2));
                    } catch (Throwable unused) {
                    }
                    try {
                        interfaceC13810.close();
                    } catch (IOException e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } finally {
                    try {
                        interfaceC13810.close();
                    } catch (IOException e2) {
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                    countDownLatch.countDown();
                }
            }
        }
        try {
            interfaceC13810.close();
        } catch (IOException e3) {
            while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
            }
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۤ */
    public final void mo35575(String str, boolean z) throws IOException {
        int i = 1;
        try {
            String strSubstring = str.substring(1);
            if (!z) {
                this.f72198.m445(new DeleteObjectRequest(this.f72197.f35043, strSubstring));
                return;
            }
            String str2 = strSubstring + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM603 = null;
            while (true) {
                ObjectListing objectListingM442 = this.f72198.m442(new ListObjectsRequest(this.f72197.f35043, str2, strM603, null, 1000));
                List list = (List) C1170.stream(objectListingM442.m607()).map(new C0948(i)).collect(C2025.toList());
                DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(this.f72197.f35043);
                deleteObjectsRequest.m554(list);
                deleteObjectsRequest.m555();
                try {
                    this.f72198.m446(deleteObjectsRequest);
                } catch (MultiObjectDeleteException e) {
                    Iterator it = e.m595().iterator();
                    if (it.hasNext()) {
                        throw new IOException(C21576.m49059(R.string.MT_Protector, ((MultiObjectDeleteException.DeleteError) it.next()).m596()));
                    }
                }
                if (objectListingM442.m604() && !threadCurrentThread.isInterrupted()) {
                    strM603 = objectListingM442.m603();
                }
                return;
            }
        } catch (AmazonClientException e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۙ */
    public final void mo35571(String str, String str2) throws IOException {
        try {
            C16312 c16312 = this.f72199;
            c16312.getClass();
            C5148 c5148 = (C5148) c16312.m38697(C11293.m28556(str), C11293.m28558(str));
            String strSubstring = str.substring(1);
            String strSubstring2 = str2.substring(1);
            if (!(c5148 != null ? c5148.m15561() : !this.f72198.m447(this.f72197.f35043, strSubstring))) {
                if (this.f72198.m447(this.f72197.f35043, strSubstring2)) {
                    throw new IOException(C21576.m49059(R.string.MT_Protector, strSubstring2));
                }
                this.f72198.m444(new CopyObjectRequest(this.f72197.f35043, C22837.encode(strSubstring, StandardCharsets.UTF_8), this.f72197.f35043, strSubstring2));
                this.f72198.m445(new DeleteObjectRequest(this.f72197.f35043, strSubstring));
                return;
            }
            String str3 = strSubstring + "/";
            String str4 = strSubstring2 + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM603 = null;
            boolean z = true;
            while (true) {
                ObjectListing objectListingM442 = this.f72198.m442(new ListObjectsRequest(this.f72197.f35043, str3, strM603, null, 1000));
                if (z) {
                    if (!objectListingM442.m607().isEmpty() && !this.f72198.m442(new ListObjectsRequest(this.f72197.f35043, str4, null, null, 1)).m607().isEmpty()) {
                        throw new IOException(C21576.m49059(R.string.MT_Protector, str4));
                    }
                    z = false;
                }
                Iterator it = objectListingM442.m607().iterator();
                while (it.hasNext()) {
                    String strM653 = ((S3ObjectSummary) it.next()).m653();
                    this.f72198.m444(new CopyObjectRequest(this.f72197.f35043, C22837.encode(strM653, StandardCharsets.UTF_8), this.f72197.f35043, str4 + strM653.substring(str3.length())));
                    this.f72198.m445(new DeleteObjectRequest(this.f72197.f35043, strM653));
                    if (threadCurrentThread.isInterrupted()) {
                        break;
                    }
                }
                if (objectListingM442.m604() && !threadCurrentThread.isInterrupted()) {
                    strM603 = objectListingM442.m603();
                }
                return;
            }
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩴ */
    public final void mo35582(String str) throws IOException {
        try {
            String str2 = str.substring(1) + "/";
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m612(0L);
            this.f72198.mo430(new PutObjectRequest(this.f72197.f35043, str2, new ByteArrayInputStream(new byte[0]), objectMetadata));
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo35573(String str) {
        return this.f72199.m38701(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo35586(String str) {
        C16312 c16312 = this.f72199;
        c16312.getClass();
        return c16312.m38697(C11293.m28556(str), C11293.m28558(str)) != null;
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۫ */
    public final String mo35577(String str) {
        return this.f72199.m38702(str);
    }

    @Override // l.AbstractC18881
    /* JADX INFO: renamed from: ۧ */
    public final void mo35576(String str) {
        this.f72199.m38699(str);
    }
}
