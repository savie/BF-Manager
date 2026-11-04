package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 31KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6718 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC12683 f22344;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f22345;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f22352;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22354 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f22353 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22348 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f22350 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float[] f22355 = new float[9];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float[] f22347 = new float[9];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2243[] f22349 = new C2243[16];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f22346 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22351 = 0;

    public C6718(EnumC12683 enumC12683) {
        this.f22344 = enumC12683;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18755(C2243 c2243) {
        int i = 0;
        while (true) {
            int i2 = this.f22346;
            if (i < i2) {
                if (this.f22349[i] == c2243) {
                    return;
                } else {
                    i++;
                }
            } else {
                C2243[] c2243Arr = this.f22349;
                if (i2 >= c2243Arr.length) {
                    this.f22349 = (C2243[]) Arrays.copyOf(c2243Arr, c2243Arr.length * 2);
                }
                C2243[] c2243Arr2 = this.f22349;
                int i3 = this.f22346;
                c2243Arr2[i3] = c2243;
                this.f22346 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18758(C2243 c2243) {
        int i = this.f22346;
        int i2 = 0;
        while (i2 < i) {
            if (this.f22349[i2] == c2243) {
                while (i2 < i - 1) {
                    C2243[] c2243Arr = this.f22349;
                    int i3 = i2 + 1;
                    c2243Arr[i2] = c2243Arr[i3];
                    i2 = i3;
                }
                this.f22346--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18757(C17158 c17158, C2243 c2243) {
        int i = this.f22346;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22349[i2].mo7656(c17158, c2243, false);
        }
        this.f22346 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18756(C17158 c17158, float f) {
        this.f22345 = f;
        this.f22350 = true;
        int i = this.f22346;
        this.f22353 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22349[i2].m7657(c17158, this, false);
        }
        this.f22346 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18754() {
        this.f22344 = EnumC12683.UNKNOWN;
        this.f22348 = 0;
        this.f22354 = -1;
        this.f22353 = -1;
        this.f22345 = 0.0f;
        this.f22350 = false;
        int i = this.f22346;
        for (int i2 = 0; i2 < i; i2++) {
            this.f22349[i2] = null;
        }
        this.f22346 = 0;
        this.f22351 = 0;
        this.f22352 = false;
        Arrays.fill(this.f22347, 0.0f);
    }

    public final String toString() {
        return "" + this.f22354;
    }
}
