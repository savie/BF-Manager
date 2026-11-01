package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۙ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N7S0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4507 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16015;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream f16016;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f16017;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12544() throws IOException {
        int i;
        int i2 = this.f16015;
        int i3 = this.f16017;
        if (i3 > 0) {
            i = i3 - 1;
        } else {
            int i4 = this.f16016.read();
            if (i4 < 0) {
                throw new C0979("Insufficient data");
            }
            i2 = (i2 << 8) | i4;
            i = i3 + 7;
            this.f16015 = i2;
        }
        this.f16017 = i;
        return (i2 & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m12545() throws IOException {
        int i = this.f16015;
        int i2 = this.f16017;
        int i3 = 0;
        while (true) {
            if (i2 <= 0) {
                int i4 = this.f16016.read();
                if (i4 < 0) {
                    throw new C0979("Insufficient data");
                }
                i = (i << 8) | i4;
                i2 += 7;
            } else {
                i2--;
            }
            if (((1 << i2) & i) == 0) {
                this.f16015 = i;
                this.f16017 = i2;
                return i3;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12543(int i) throws IOException {
        int i2 = this.f16015;
        int i3 = this.f16017;
        if (i3 < i) {
            while (i3 < i) {
                int i4 = this.f16016.read();
                if (i4 < 0) {
                    throw new C0979("Insufficient data");
                }
                i2 = (i2 << 8) | i4;
                i3 += 8;
            }
            this.f16015 = i2;
        }
        int i5 = i3 - i;
        this.f16017 = i5;
        return ((1 << i) - 1) & (i2 >>> i5);
    }

    public C4507(InputStream inputStream) {
        this.f16016 = inputStream;
    }
}
