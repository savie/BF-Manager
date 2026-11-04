package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E1TJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22904 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22378 f74393;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InputStream f74394;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f74395 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f74392 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C22904(InputStream inputStream, int i) {
        inputStream.getClass();
        this.f74394 = inputStream;
        this.f74393 = new C22378(i);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f74392;
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
        InputStream inputStream = this.f74394;
        if (inputStream == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f74395;
        if (iOException != null) {
            throw iOException;
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.f74393.m50462(i, i3, bArr);
            return i3;
        } catch (IOException e) {
            this.f74395 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        InputStream inputStream = this.f74394;
        if (inputStream == null) {
            throw new C18428("Stream closed");
        }
        IOException iOException = this.f74395;
        if (iOException != null) {
            throw iOException;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f74394;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f74394 = null;
            }
        }
    }
}
