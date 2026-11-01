package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۚۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8OU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5188 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f17990;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f17991;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f17992;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f17993;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f17994;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17995;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17996;

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14349(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f17990 = i2;
        this.f17991 = C22122.f71623[3 - i3];
        int i7 = C22122.f71617[i5];
        this.f17993 = i7;
        if (i2 == 2) {
            this.f17993 = i7 / 2;
        } else if (i2 == 0) {
            this.f17993 = i7 / 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 != 1) {
            if (i3 == 2) {
                i6 = 1152;
            } else {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i6 = MLKEMEngine.KyberPolyBytes;
            }
        } else if (i2 == 3) {
            i6 = 1152;
        } else {
            i6 = 576;
        }
        this.f17996 = i6;
        if (i3 == 3) {
            int i9 = i2 == 3 ? C22122.f71619[i4 - 1] : C22122.f71620[i4 - 1];
            this.f17992 = i9;
            this.f17994 = (((i9 * 12) / this.f17993) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? C22122.f71622[i4 - 1] : C22122.f71621[i4 - 1];
                this.f17992 = i10;
                this.f17994 = ((i10 * 144) / this.f17993) + i8;
            } else {
                int i11 = C22122.f71618[i4 - 1];
                this.f17992 = i11;
                this.f17994 = (((i3 == 1 ? 72 : 144) * i11) / this.f17993) + i8;
            }
        }
        this.f17995 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
