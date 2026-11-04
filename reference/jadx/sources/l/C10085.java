package l;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10085 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32323;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f32324;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream f32325;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f32326;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f32327 = new byte[32768];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f32328 = 18;

    public C10085(long j, InputStream inputStream) {
        this.f32325 = inputStream;
        this.f32324 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26042() throws IOException {
        long j = this.f32328;
        long j2 = this.f32324;
        if (j >= j2) {
            throw new C9339("TGA input exceeds byte limit");
        }
        int i = this.f32323;
        int i2 = this.f32326;
        byte[] bArr = this.f32327;
        if (i == i2) {
            int iMin = (int) Math.min(bArr.length, j2 - j);
            InputStream inputStream = this.f32325;
            int i3 = inputStream.read(bArr, 0, iMin);
            this.f32326 = i3;
            this.f32323 = 0;
            if (i3 == 0) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    throw new EOFException("Truncated TGA pixels");
                }
                this.f32328++;
                return i4;
            }
            if (i3 < 0) {
                throw new EOFException("Truncated TGA pixels");
            }
        }
        this.f32328++;
        int i5 = this.f32323;
        this.f32323 = i5 + 1;
        return bArr[i5] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26043(long j) throws IOException {
        if (j < 18 || j > this.f32324) {
            throw new IOException("Invalid TGA offset");
        }
        long j2 = this.f32328 - ((long) this.f32323);
        int i = this.f32326;
        if (i > 0 && j >= j2 && j <= ((long) i) + j2) {
            this.f32323 = (int) (j - j2);
            this.f32328 = j;
        } else {
            C19853.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) this.f32325).getChannel()).position(j);
            this.f32328 = j;
            this.f32326 = 0;
            this.f32323 = 0;
        }
    }
}
