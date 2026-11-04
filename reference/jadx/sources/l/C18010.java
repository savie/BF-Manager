package l;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ܿ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8OU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18010 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58963;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f58964;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f58965;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f58966;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f58967;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f58968;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f58969;

    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41989(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f58965 = i2;
        this.f58969 = C0111.f1058[3 - i3];
        int i7 = C0111.f1057[i5];
        this.f58967 = i7;
        if (i2 == 2) {
            this.f58967 = i7 / 2;
        } else if (i2 == 0) {
            this.f58967 = i7 / 4;
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
        this.f58966 = i6;
        if (i3 == 3) {
            int i9 = i2 == 3 ? C0111.f1055[i4 - 1] : C0111.f1059[i4 - 1];
            this.f58963 = i9;
            this.f58964 = (((i9 * 12) / this.f58967) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? C0111.f1060[i4 - 1] : C0111.f1056[i4 - 1];
                this.f58963 = i10;
                this.f58964 = ((i10 * 144) / this.f58967) + i8;
            } else {
                int i11 = C0111.f1061[i4 - 1];
                this.f58963 = i11;
                this.f58964 = (((i3 == 1 ? 72 : 144) * i11) / this.f58967) + i8;
            }
        }
        this.f58968 = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
