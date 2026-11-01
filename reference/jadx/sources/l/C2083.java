package l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes2.dex */
public final class C2083 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f7690;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7691;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f7692;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3494 f7693;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7694;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10983 f7695;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CountDownLatch f7696;

    public C2083(C3494 c3494, AtomicReference atomicReference, InterfaceC10983 interfaceC10983, CountDownLatch countDownLatch, String str, String str2, ArrayList arrayList) {
        this.f7693 = c3494;
        this.f7690 = atomicReference;
        this.f7695 = interfaceC10983;
        this.f7696 = countDownLatch;
        this.f7694 = str;
        this.f7691 = str2;
        this.f7692 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m6601() throws IOException {
        IOException iOException = (IOException) this.f7690.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m6601();
        this.f7695.writeByte(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m6601();
        this.f7695.mo16397(i, i2, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m6601();
        this.f7695.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m6601();
        this.f7695.close();
        try {
            this.f7696.await();
        } catch (InterruptedException unused) {
        }
        m6601();
        C3494 c3494 = this.f7693;
        String strM10258 = C3494.m10258(c3494);
        ArrayList arrayList = this.f7692;
        String str = this.f7694;
        String str2 = this.f7691;
        try {
            c3494.f12809.mo434(new CompleteMultipartUploadRequest(strM10258, str, str2, arrayList));
        } catch (AmazonClientException e) {
            try {
                c3494.f12809.mo439(new AbortMultipartUploadRequest(C3494.m10258(c3494), str, str2));
            } catch (Throwable unused2) {
            }
            throw new IOException(e.getMessage(), e);
        }
    }
}
