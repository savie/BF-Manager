package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܿ֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1TJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17015 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f54365;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0432 f54366;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f54368 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f54367 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C17015(InputStream inputStream, int i) {
        inputStream.getClass();
        this.f54365 = inputStream;
        this.f54366 = new C0432(i);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f54367;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.f54365;
        if (inputStream == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f54368;
        if (iOException != null) {
            throw iOException;
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.f54366.m2253(i, i3, bArr);
            return i3;
        } catch (IOException e) {
            this.f54368 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        InputStream inputStream = this.f54365;
        if (inputStream == null) {
            throw new C21599("Stream closed");
        }
        IOException iOException = this.f54368;
        if (iOException != null) {
            throw iOException;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f54365;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f54365 = null;
            }
        }
    }
}
