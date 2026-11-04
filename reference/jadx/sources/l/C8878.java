package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7Y5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8878 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f29002;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public OutputStream f29003;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23760(OutputStream outputStream) {
        this.f29003 = outputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23759(InputStream inputStream) {
        this.f29002 = inputStream;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m23762() {
        return this.f29002.read();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23758(int i, int i2, byte[] bArr) throws IOException {
        do {
            int i3 = this.f29002.read(bArr, i, i2);
            if (i3 < 0) {
                throw new IOException("End of IO Stream Read");
            }
            i += i3;
            i2 -= i3;
        } while (i2 > 0);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m23761() {
        try {
            OutputStream outputStream = this.f29003;
            if (outputStream != null) {
                outputStream.close();
            }
            this.f29003 = null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23757() {
        try {
            InputStream inputStream = this.f29002;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f29002 = null;
        } catch (Exception unused) {
        }
        m23761();
    }
}
