package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7Y5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7930 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f26044;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public OutputStream f26045;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20935(OutputStream outputStream) {
        this.f26045 = outputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20934(InputStream inputStream) {
        this.f26044 = inputStream;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m20937() {
        return this.f26044.read();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20933(int i, int i2, byte[] bArr) throws IOException {
        do {
            int i3 = this.f26044.read(bArr, i, i2);
            if (i3 < 0) {
                throw new IOException("End of IO Stream Read");
            }
            i += i3;
            i2 -= i3;
        } while (i2 > 0);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20936() {
        try {
            OutputStream outputStream = this.f26045;
            if (outputStream != null) {
                outputStream.close();
            }
            this.f26045 = null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20932() {
        try {
            InputStream inputStream = this.f26044;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f26044 = null;
        } catch (Exception unused) {
        }
        m20936();
    }
}
