package l;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۛ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C6398 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f21709;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21710;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InputStream f21711;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f21713 = new byte[32768];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f21712 = 18;

    public C6398(InputStream inputStream) {
        this.f21711 = inputStream;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17545() throws IOException {
        long j = this.f21712;
        if (j >= 268435456) {
            throw new C24038("TGA input exceeds byte limit");
        }
        int i = this.f21710;
        int i2 = this.f21709;
        byte[] bArr = this.f21713;
        if (i == i2) {
            int iMin = (int) Math.min(bArr.length, 268435456 - j);
            InputStream inputStream = this.f21711;
            int i3 = inputStream.read(bArr, 0, iMin);
            this.f21709 = i3;
            this.f21710 = 0;
            if (i3 == 0) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    throw new EOFException("Truncated TGA pixels");
                }
                this.f21712++;
                return i4;
            }
            if (i3 < 0) {
                throw new EOFException("Truncated TGA pixels");
            }
        }
        this.f21712++;
        int i5 = this.f21710;
        this.f21710 = i5 + 1;
        return bArr[i5] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17546(long j) throws IOException {
        if (j < 18 || j > 268435456) {
            throw new IOException("Invalid TGA offset");
        }
        long j2 = this.f21712 - ((long) this.f21710);
        int i = this.f21709;
        if (i > 0 && j >= j2 && j <= ((long) i) + j2) {
            this.f21710 = (int) (j - j2);
            this.f21712 = j;
        } else {
            C6001.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) this.f21711).getChannel()).position(j);
            this.f21712 = j;
            this.f21709 = 0;
            this.f21710 = 0;
        }
    }
}
