package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes5.dex */
public final class C14211 implements InterfaceC12456 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f44907;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f44908;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15068 f44910;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15068 f44911;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f44912;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f44913;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44914;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44917;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C15068 f44918;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8991 f44919;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f44920;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f44921;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC12456 f44922;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7500[] f44916 = new C7500[8];

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f44915 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f44909 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14211 m34494(int i, int i2, int i3, InterfaceC12456 interfaceC12456, C8991 c8991) {
        C17359.requireNonNull(c8991, "budget");
        if (c8991.m23988()) {
            return new C14211(i, i2, i3, interfaceC12456, c8991);
        }
        return null;
    }

    public C14211(int i, int i2, int i3, InterfaceC12456 interfaceC12456, C8991 c8991) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("End search starts outside the document");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("Non-positive end search stride");
        }
        this.f44908 = i;
        this.f44913 = i2;
        this.f44922 = interfaceC12456;
        this.f44919 = c8991;
        if (!c8991.m23989()) {
            throw new IllegalStateException("End search proof budget exhausted");
        }
        long j = i2;
        long j2 = ((long) i) - j;
        int iMax = (int) Math.max(i3, j2 == 0 ? 1L : (j2 + 1022) / 1023);
        this.f44921 = iMax;
        this.f44918 = new C15068(i);
        this.f44910 = new C15068(i);
        this.f44911 = new C15068(i);
        this.f44916[0] = new C7500(i2, new C15068(i).m36327());
        this.f44907 = j;
        this.f44912 = j + ((long) iMax);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34497(int i) {
        int i2;
        if (this.f44914 || this.f44920) {
            throw new IllegalStateException("End search candidate is already active or finished");
        }
        if (i != this.f44907 || i < this.f44913 || i > (i2 = this.f44908)) {
            throw new IllegalArgumentException("End search candidates are not contiguous");
        }
        C15068 c15068 = this.f44911;
        c15068.m36328(i2);
        c15068.m36322(i);
        this.f44909 = i;
        this.f44920 = true;
        InterfaceC12456 interfaceC12456 = this.f44922;
        if (interfaceC12456 != null) {
            ((C14211) interfaceC12456).m34503(i);
        }
        if (i == i2) {
            c15068.m36321();
            if (interfaceC12456 != null) {
                ((C14211) interfaceC12456).m34496();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34499(boolean z) {
        if (!this.f44920) {
            throw new IllegalStateException("No active end search candidate");
        }
        int i = this.f44909;
        int i2 = this.f44908;
        C15068 c15068 = this.f44911;
        if (!z && i != i2) {
            int i3 = i + 1;
            c15068.m36322(i3);
            InterfaceC12456 interfaceC12456 = this.f44922;
            if (interfaceC12456 != null) {
                ((C14211) interfaceC12456).m34503(i3);
            }
        }
        this.f44910.m36325(c15068);
        C15068 c15069 = this.f44918;
        if (!z) {
            c15069.m36325(c15068);
        }
        this.f44920 = false;
        this.f44909 = -1;
        if (z) {
            this.f44914 = true;
            return;
        }
        if (i == i2) {
            this.f44907 = ((long) i2) + 1;
            this.f44914 = true;
            return;
        }
        int i4 = i + 1;
        long j = i4;
        this.f44907 = j;
        if (j >= this.f44912) {
            if (this.f44915 < 1024) {
                C8991 c8991 = this.f44919;
                if (c8991.m23988()) {
                    C12831 c12831M36327 = c15069.m36327();
                    if (this.f44915 != 1024 && c8991.m23989()) {
                        int i5 = this.f44915;
                        C7500[] c7500Arr = this.f44916;
                        if (i5 == c7500Arr.length) {
                            this.f44916 = (C7500[]) Arrays.copyOf(this.f44916, Math.min(1024, c7500Arr.length << 1));
                        }
                        C7500[] c7500Arr2 = this.f44916;
                        int i6 = this.f44915;
                        this.f44915 = i6 + 1;
                        c7500Arr2[i6] = new C7500(i4, c12831M36327);
                    }
                }
            }
            this.f44912 = j + ((long) this.f44921);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12831 m34502() {
        m34495();
        if (this.f44920) {
            throw new IllegalStateException("End search candidate is still active");
        }
        return this.f44910.m36327();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7500 m34504(int i) {
        m34495();
        if (i < this.f44913 || i > this.f44908) {
            throw new IllegalArgumentException("End search proof offset is outside the trace");
        }
        int i2 = this.f44915 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (this.f44916[i4].f24803 <= i) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return this.f44916[i2];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m34501(int i) {
        m34495();
        return i >= this.f44913 && i <= this.f44908;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m34500() {
        if (this.f44917) {
            return;
        }
        Arrays.fill(this.f44916, 0, this.f44915, (Object) null);
        this.f44919.m23987(this.f44915);
        this.f44915 = 0;
        this.f44917 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34496() {
        m34495();
        if (this.f44920) {
            this.f44911.m36321();
            InterfaceC12456 interfaceC12456 = this.f44922;
            if (interfaceC12456 != null) {
                ((C14211) interfaceC12456).m34496();
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34498(int i, int i2) {
        m34495();
        if (this.f44920) {
            this.f44911.m36323(i, i2);
            InterfaceC12456 interfaceC12456 = this.f44922;
            if (interfaceC12456 != null) {
                ((C14211) interfaceC12456).m34498(i, i2);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34503(int i) {
        m34495();
        if (this.f44920) {
            this.f44911.m36322(i);
            InterfaceC12456 interfaceC12456 = this.f44922;
            if (interfaceC12456 != null) {
                ((C14211) interfaceC12456).m34503(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("No active end search candidate");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m34495() {
        if (this.f44917) {
            throw new IllegalStateException("End search trace has been released");
        }
    }
}
