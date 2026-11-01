package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.۠ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: OA5R */
/* JADX INFO: loaded from: classes3.dex */
public final class C8328 extends OutputStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f28854;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f28855;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10983 f28856;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19617 f28857;

    public C8328(C19617 c19617, long j, InterfaceC10983 interfaceC10983) {
        this.f28857 = c19617;
        this.f28854 = j;
        this.f28856 = interfaceC10983;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f28857.f62973) {
            throw new IOException("closed");
        }
        long j = this.f28854;
        if (j != -1 && this.f28855 + ((long) i2) > j) {
            StringBuilder sbM39970 = C17114.m39970("expected ", " bytes but received ", j);
            sbM39970.append(this.f28855);
            sbM39970.append(i2);
            throw new ProtocolException(sbM39970.toString());
        }
        this.f28855 += (long) i2;
        try {
            this.f28856.mo16397(i, i2, bArr);
        } catch (InterruptedIOException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.f28857.f62973) {
            return;
        }
        this.f28856.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        C19617 c19617 = this.f28857;
        if (c19617.f62973) {
            return;
        }
        c19617.f62973 = true;
        this.f28856.close();
        long j = this.f28854;
        if (j == -1 || this.f28855 >= j) {
            return;
        }
        StringBuilder sbM39970 = C17114.m39970("expected ", " bytes but received ", j);
        sbM39970.append(this.f28855);
        throw new ProtocolException(sbM39970.toString());
    }
}
