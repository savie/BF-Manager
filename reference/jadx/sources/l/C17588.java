package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.ܽ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OA5R */
/* JADX INFO: loaded from: classes4.dex */
public final class C17588 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11573 f57110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f57111;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f57112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16096 f57113;

    public C17588(C16096 c16096, long j, InterfaceC11573 interfaceC11573) {
        this.f57113 = c16096;
        this.f57112 = j;
        this.f57110 = interfaceC11573;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f57113.f52143) {
            throw new IOException("closed");
        }
        long j = this.f57112;
        if (j != -1 && this.f57111 + ((long) i2) > j) {
            StringBuilder sbM8289 = C2458.m8289("expected ", " bytes but received ", j);
            sbM8289.append(this.f57111);
            sbM8289.append(i2);
            throw new ProtocolException(sbM8289.toString());
        }
        this.f57111 += (long) i2;
        try {
            this.f57110.mo6452(i, i2, bArr);
        } catch (InterruptedIOException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.f57113.f52143) {
            return;
        }
        this.f57110.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        C16096 c16096 = this.f57113;
        if (c16096.f52143) {
            return;
        }
        c16096.f52143 = true;
        this.f57110.close();
        long j = this.f57112;
        if (j == -1 || this.f57111 >= j) {
            return;
        }
        StringBuilder sbM8289 = C2458.m8289("expected ", " bytes but received ", j);
        sbM8289.append(this.f57111);
        throw new ProtocolException(sbM8289.toString());
    }
}
