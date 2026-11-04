package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩺۟ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24145 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f78155;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InputStream f78156;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f78157;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54115() throws IOException {
        int i;
        int i2 = this.f78155;
        int i3 = this.f78157;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            int i4 = this.f78156.read();
            if (i4 < 0) {
                throw new C7736("Insufficient data");
            }
            i2 = (i2 << 8) | i4;
            i = i3 + 7;
            this.f78155 = i2;
        }
        this.f78157 = i;
        return (i2 & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m54116() throws IOException {
        int i = this.f78155;
        int i2 = this.f78157;
        int i3 = 0;
        while (true) {
            if (i2 <= 0) {
                int i4 = this.f78156.read();
                if (i4 < 0) {
                    throw new C7736("Insufficient data");
                }
                i = (i << 8) | i4;
                i2 += 7;
            } else {
                i2--;
            }
            if (((1 << i2) & i) == 0) {
                this.f78155 = i;
                this.f78157 = i2;
                return i3;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m54114(int i) throws IOException {
        int i2 = this.f78155;
        int i3 = this.f78157;
        if (i3 < i) {
            while (i3 < i) {
                int i4 = this.f78156.read();
                if (i4 < 0) {
                    throw new C7736("Insufficient data");
                }
                i2 = (i2 << 8) | i4;
                i3 += 8;
            }
            this.f78155 = i2;
        }
        int i5 = i3 - i;
        this.f78157 = i5;
        return ((1 << i) - 1) & (i2 >>> i5);
    }

    public C24145(InputStream inputStream) {
        this.f78156 = inputStream;
    }
}
