package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۨۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: DARC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11442 extends InputStream implements InterfaceC20818 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] f38503 = new byte[1];

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22731 f38504;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputStream f38505;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12107 f38506;

    @Override // java.io.InputStream, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C11442(C12107 c12107, InputStream inputStream) {
        this.f38504 = new C22731(inputStream);
        this.f38505 = inputStream;
        this.f38506 = c12107;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.f38503;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & 255;
        }
        StringBuilder sbM40153 = C17214.m40153(i, "Invalid return value from read: ", " (");
        sbM40153.append(this.f38506.getName());
        sbM40153.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IllegalStateException(sbM40153.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        C22731 c22731 = this.f38504;
        if (c22731 == null) {
            return -1;
        }
        try {
            int iM50404 = c22731.m50404(i, i2, bArr);
            if (iM50404 == -1) {
                C20010.m45299(this.f38504);
                this.f38504 = null;
            }
            return iM50404;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input. (" + this.f38506.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        C22731 c22731 = this.f38504;
        if (c22731 != null) {
            return c22731.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C20010.m45299(this.f38504);
            this.f38504 = null;
        } finally {
            InputStream inputStream = this.f38505;
            if (inputStream != null) {
                inputStream.close();
                this.f38505 = null;
            }
        }
    }
}
