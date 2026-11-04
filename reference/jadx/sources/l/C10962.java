package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DARC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10962 extends InputStream implements InterfaceC8469 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f34630;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C25135 f34631;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f34632 = new byte[1];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8002 f34633;

    @Override // java.io.InputStream, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C10962(C8002 c8002, InputStream inputStream) {
        this.f34631 = new C25135(inputStream);
        this.f34630 = inputStream;
        this.f34633 = c8002;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.f34632;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & 255;
        }
        StringBuilder sbM12235 = C3769.m12235(i, "Invalid return value from read: ", " (");
        sbM12235.append(this.f34633.getName());
        sbM12235.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IllegalStateException(sbM12235.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        C25135 c25135 = this.f34631;
        if (c25135 == null) {
            return -1;
        }
        try {
            int iM56041 = c25135.m56041(i, i2, bArr);
            if (iM56041 == -1) {
                C5125.m15494(this.f34631);
                this.f34631 = null;
            }
            return iM56041;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input. (" + this.f34633.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        C25135 c25135 = this.f34631;
        if (c25135 != null) {
            return c25135.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C5125.m15494(this.f34631);
            this.f34631 = null;
        } finally {
            InputStream inputStream = this.f34630;
            if (inputStream != null) {
                inputStream.close();
                this.f34630 = null;
            }
        }
    }
}
