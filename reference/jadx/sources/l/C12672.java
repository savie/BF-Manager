package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2708 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12672 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC16905[] f42308;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long[] f42309;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f42310;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f42311;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f42313;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f42315;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean[] f42316;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int[] f42319 = new int[16];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f42312 = new int[16];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f42318 = new int[16];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f42314 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C15682[] f42317 = new C15682[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m31526() {
        return this.f42313;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m31522() {
        return (((long) this.f42314) << 32) | (((long) this.f42313) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m31512() {
        this.f42311 = true;
        this.f42314 = -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m31523() {
        this.f42311 = false;
        this.f42314 = -1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m31510(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax effect end");
        }
        if (this.f42311) {
            this.f42314 = Math.max(this.f42314, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31515(int i, int i2, C15682 c15682) {
        return m31507(i, i2, c15682, true);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m31527(int i, int i2, C15682 c15682) {
        return m31507(i, i2, c15682, !this.f42311);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m31507(int i, int i2, C15682 c15682, boolean z) {
        if (i < 0 || i2 < i) {
            throw new IllegalArgumentException(C2271.m6967("Invalid style range: ", i, i2, ".."));
        }
        C13638.requireNonNull(c15682, "style");
        if (c15682 == C15682.f50915 || i == i2) {
            return -1;
        }
        if (this.f42313 == this.f42319.length) {
            m31509();
        }
        int i3 = this.f42313;
        this.f42313 = i3 + 1;
        int[] iArr = this.f42319;
        iArr[i3] = i;
        this.f42312[i3] = i2;
        this.f42317[i3] = c15682;
        long[] jArr = this.f42309;
        if (jArr != null) {
            jArr[i3] = 0;
        }
        this.f42318[i3] = -1;
        if (z) {
            boolean[] zArr = this.f42316;
            if (zArr != null) {
                zArr[i3] = false;
            }
            m31510(i2);
        } else {
            if (this.f42316 == null) {
                this.f42316 = new boolean[iArr.length];
            }
            this.f42316[i3] = true;
        }
        if (this.f42308 != null) {
            this.f42310[i3] = -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31516(C15765 c15765) {
        if (this.f42313 == this.f42319.length) {
            m31509();
        }
        if (this.f42308 == null) {
            int[] iArr = this.f42319;
            this.f42308 = new InterfaceC16905[iArr.length];
            this.f42315 = new int[iArr.length];
            this.f42310 = new int[iArr.length];
        }
        int i = this.f42313;
        this.f42313 = i + 1;
        boolean[] zArr = this.f42316;
        if (zArr != null) {
            zArr[i] = false;
        }
        this.f42317[i] = null;
        long[] jArr = this.f42309;
        if (jArr != null) {
            jArr[i] = 0;
        }
        this.f42318[i] = -1;
        this.f42308[i] = c15765;
        this.f42315[i] = -1;
        this.f42310[i] = -1;
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31528(int i, int i2) {
        this.f42315[i] = i2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m31531(int i) {
        return this.f42315[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m31524(int i) {
        if (i >= 0 && this.f42308 != null) {
            while (i >= 0) {
                if (this.f42308[i] != null) {
                    return true;
                }
                i = this.f42315[i];
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m31530(int i) {
        return this.f42311 && this.f42314 > i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m31511(int i) {
        InterfaceC16905 interfaceC16905 = this.f42308[i];
        if (interfaceC16905 != null) {
            this.f42310[i] = interfaceC16905.mo37512();
            this.f42308[i] = null;
        }
        return this.f42310[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31518(int i, int i2) {
        this.f42318[i] = i2;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m31521(int i) {
        return this.f42318[i];
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m31525(int i) {
        return this.f42319[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31514(int i) {
        return this.f42312[i];
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C15682 m31513(int i) {
        return this.f42317[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31529(int i, int i2, int i3) {
        C13638.checkIndex(i, this.f42313);
        int[] iArr = this.f42319;
        if (i2 == iArr[i] && i3 == this.f42312[i]) {
            return;
        }
        if (this.f42309 == null) {
            this.f42309 = new long[iArr.length];
        }
        this.f42309[i] = (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31519(int i, int i2, int i3) {
        C13638.checkIndex(i, this.f42313);
        C15682 c15682 = this.f42317[i];
        if (c15682 == null) {
            return;
        }
        if (c15682.m37369() != null) {
            long[] jArr = this.f42309;
            long j = jArr == null ? 0L : jArr[i];
            int i4 = j == 0 ? this.f42319[i] : (int) (j >>> 32);
            int i5 = j == 0 ? this.f42312[i] : (int) j;
            if (i4 < i2 || i5 > i3) {
                C15682[] c15682Arr = this.f42317;
                c15682Arr[i] = c15682Arr[i].m37371((String) null);
            }
        }
        int iMin = Math.min(i3, Math.max(i2, this.f42319[i]));
        this.f42319[i] = iMin;
        int[] iArr = this.f42312;
        iArr[i] = Math.max(iMin, Math.min(i3, iArr[i]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31520(long j) {
        m31508((int) j);
        this.f42314 = (int) (j >> 32);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m31508(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f42313)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Invalid style journal mark: ", ", size=");
            sbM40153.append(this.f42313);
            throw new IllegalArgumentException(sbM40153.toString());
        }
        Arrays.fill(this.f42317, i, i2, (Object) null);
        InterfaceC16905[] interfaceC16905Arr = this.f42308;
        if (interfaceC16905Arr != null) {
            Arrays.fill(interfaceC16905Arr, i, this.f42313, (Object) null);
        }
        boolean[] zArr = this.f42316;
        if (zArr != null) {
            Arrays.fill(zArr, i, this.f42313, false);
        }
        this.f42313 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31517() {
        m31508(0);
        this.f42314 = -1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m31509() {
        int i = this.f42313;
        int iMin = (int) Math.min(2147483647L, ((long) i) + ((long) (i >> 1)));
        if (iMin <= this.f42313) {
            throw new OutOfMemoryError("Syntax style journal capacity exceeded");
        }
        this.f42319 = Arrays.copyOf(this.f42319, iMin);
        this.f42312 = Arrays.copyOf(this.f42312, iMin);
        this.f42318 = Arrays.copyOf(this.f42318, iMin);
        this.f42317 = (C15682[]) Arrays.copyOf(this.f42317, iMin);
        long[] jArr = this.f42309;
        if (jArr != null) {
            this.f42309 = Arrays.copyOf(jArr, iMin);
        }
        boolean[] zArr = this.f42316;
        if (zArr != null) {
            this.f42316 = Arrays.copyOf(zArr, iMin);
        }
        InterfaceC16905[] interfaceC16905Arr = this.f42308;
        if (interfaceC16905Arr != null) {
            this.f42308 = (InterfaceC16905[]) Arrays.copyOf(interfaceC16905Arr, iMin);
            this.f42315 = Arrays.copyOf(this.f42315, iMin);
            this.f42310 = Arrays.copyOf(this.f42310, iMin);
        }
    }
}
