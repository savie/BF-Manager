package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 31KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15075 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumC22836 f49147;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f49148;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f49149;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f49146 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f49153 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f49150 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49155 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float[] f49156 = new float[9];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float[] f49151 = new float[9];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13664[] f49145 = new C13664[16];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f49152 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f49154 = 0;

    public C15075(EnumC22836 enumC22836) {
        this.f49147 = enumC22836;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36154(C13664 c13664) {
        int i = 0;
        while (true) {
            int i2 = this.f49152;
            if (i < i2) {
                if (this.f49145[i] == c13664) {
                    return;
                } else {
                    i++;
                }
            } else {
                C13664[] c13664Arr = this.f49145;
                if (i2 >= c13664Arr.length) {
                    this.f49145 = (C13664[]) Arrays.copyOf(c13664Arr, c13664Arr.length * 2);
                }
                C13664[] c13664Arr2 = this.f49145;
                int i3 = this.f49152;
                c13664Arr2[i3] = c13664;
                this.f49152 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36155(C13664 c13664) {
        int i = this.f49152;
        int i2 = 0;
        while (i2 < i) {
            if (this.f49145[i2] == c13664) {
                while (i2 < i - 1) {
                    C13664[] c13664Arr = this.f49145;
                    int i3 = i2 + 1;
                    c13664Arr[i2] = c13664Arr[i3];
                    i2 = i3;
                }
                this.f49152--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36153(C5196 c5196, C13664 c13664) {
        int i = this.f49152;
        for (int i2 = 0; i2 < i; i2++) {
            this.f49145[i2].mo17938(c5196, c13664, false);
        }
        this.f49152 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36152(C5196 c5196, float f) {
        this.f49148 = f;
        this.f49155 = true;
        int i = this.f49152;
        this.f49153 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f49145[i2].m33372(c5196, this, false);
        }
        this.f49152 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36151() {
        this.f49147 = EnumC22836.UNKNOWN;
        this.f49150 = 0;
        this.f49146 = -1;
        this.f49153 = -1;
        this.f49148 = 0.0f;
        this.f49155 = false;
        int i = this.f49152;
        for (int i2 = 0; i2 < i; i2++) {
            this.f49145[i2] = null;
        }
        this.f49152 = 0;
        this.f49154 = 0;
        this.f49149 = false;
        Arrays.fill(this.f49151, 0.0f);
    }

    public final String toString() {
        return "" + this.f49146;
    }
}
