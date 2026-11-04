package l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۬ܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes4.dex */
public final class C13898 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44068;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f44069;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f44070;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22302 f44071;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f44072;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11573 f44073;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CountDownLatch f44074;

    public C13898(C22302 c22302, AtomicReference atomicReference, InterfaceC11573 interfaceC11573, CountDownLatch countDownLatch, String str, String str2, ArrayList arrayList) {
        this.f44071 = c22302;
        this.f44072 = atomicReference;
        this.f44073 = interfaceC11573;
        this.f44074 = countDownLatch;
        this.f44068 = str;
        this.f44070 = str2;
        this.f44069 = arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33846() throws IOException {
        IOException iOException = (IOException) this.f44072.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m33846();
        this.f44073.writeByte(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m33846();
        this.f44073.mo6452(i, i2, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m33846();
        this.f44073.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m33846();
        this.f44073.close();
        try {
            this.f44074.await();
        } catch (InterruptedException unused) {
        }
        m33846();
        C22302 c22302 = this.f44071;
        String strM50361 = C22302.m50361(c22302);
        ArrayList arrayList = this.f44069;
        String str = this.f44068;
        String str2 = this.f44070;
        try {
            c22302.f72198.mo428(new CompleteMultipartUploadRequest(strM50361, str, str2, arrayList));
        } catch (AmazonClientException e) {
            try {
                c22302.f72198.mo433(new AbortMultipartUploadRequest(C22302.m50361(c22302), str, str2));
            } catch (Throwable unused2) {
            }
            throw new IOException(e.getMessage(), e);
        }
    }
}
