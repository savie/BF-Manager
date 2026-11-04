package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩳܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 26UL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19238 extends AbstractC1339 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7810 f62239;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5311 f62240;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f62241;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f62242;

    public C19238(Object obj, final int i, final char[] cArr, final int i2, final int i3, C10046 c10046) {
        super(0, obj);
        int i4 = 0;
        boolean z = true;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            char c = cArr[i5];
            i4 = c == '\n' ? i4 + 1 : i4;
            if (c > 255) {
                z = false;
            }
        }
        this.f62242 = i;
        this.f62241 = z;
        this.f4794 = i3;
        this.f4792 = i4;
        if (c10046 == null) {
            this.f62239 = null;
            this.f62240 = new C5311(i, cArr, i2, i3, i4, z);
        } else {
            this.f62239 = c10046.m25965(i3, i4, z, new Supplier() { // from class: l.ܿܿ᩸
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C19238.m44567(this.f60173, i, cArr, i2, i3);
                }
            });
            this.f62240 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C5311 m44567(C19238 c19238, int i, char[] cArr, int i2, int i3) {
        return new C5311(i, cArr, i2, i3, c19238.f4792, c19238.f62241);
    }

    public C19238(Object obj, C7810 c7810) {
        super(0, obj);
        this.f62239 = c7810;
        this.f62240 = null;
        this.f62242 = c7810.f26024;
        this.f62241 = c7810.f26025;
        this.f4794 = c7810.f26023;
        this.f4792 = c7810.f26022;
    }

    public C19238(Object obj, C5311 c5311) {
        super(0, obj);
        this.f62239 = null;
        this.f62240 = c5311;
        this.f62242 = c5311.m15958();
        this.f62241 = c5311.m15956();
        this.f4794 = c5311.m15961();
        this.f4792 = c5311.m15957();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m44569() {
        return this.f62242;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m44575() {
        return this.f62241;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object m44576() {
        C7810 c7810 = this.f62239;
        return c7810 == null ? this.f62240 : c7810;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8051 m44573() {
        C5311 c5311 = this.f62240;
        if (c5311 != null) {
            return new C8051(c5311, null);
        }
        C7810 c7810 = this.f62239;
        return new C8051(null, c7810.f26019.f32208.m2111(c7810));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final char m44568(int i) {
        C5311 c5311 = this.f62240;
        if (c5311 != null) {
            return c5311.m15950(i);
        }
        C8051 c8051M44573 = m44573();
        try {
            char cM15950 = c8051M44573.f26678.m15950(i);
            c8051M44573.close();
            return cM15950;
        } catch (Throwable th) {
            try {
                c8051M44573.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44571(char[] cArr, int i, int i2) {
        C5311 c5311 = this.f62240;
        if (c5311 != null) {
            c5311.m15953(0, i, cArr, i2);
            return;
        }
        C8051 c8051M44573 = m44573();
        try {
            c8051M44573.f26678.m15953(0, i, cArr, i2);
            c8051M44573.close();
        } catch (Throwable th) {
            try {
                c8051M44573.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19238 m44570(Object obj, final int i, final int i2, final char[] cArr, final int i3) {
        C8051 c8051M44573 = m44573();
        try {
            final C5311 c5311 = c8051M44573.f26678;
            C7810 c7810 = this.f62239;
            if (c7810 != null) {
                int iM15959 = this.f4792 - (c5311.m15959(i2) - c5311.m15959(i));
                boolean z = this.f62241;
                for (int i4 = 0; i4 < i3; i4++) {
                    char c = cArr[i4];
                    if (c == '\n') {
                        iM15959++;
                    }
                    if (c > 255) {
                        z = false;
                    }
                }
                C19238 c19238 = new C19238(obj, c7810.f26019.m25965((this.f4794 - (i2 - i)) + i3, iM15959, z, new Supplier() { // from class: l.֡ܿ᩸
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return c5311.m15960(i, i2, cArr, i3);
                    }
                }));
                c8051M44573.close();
                return c19238;
            }
            C19238 c19239 = new C19238(obj, c5311.m15960(i, i2, cArr, i3));
            c8051M44573.close();
            return c19239;
        } catch (Throwable th) {
            try {
                c8051M44573.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44574(int i) {
        C5311 c5311 = this.f62240;
        if (c5311 != null) {
            return c5311.m15959(i);
        }
        C8051 c8051M44573 = m44573();
        try {
            int iM15959 = c8051M44573.f26678.m15959(i);
            c8051M44573.close();
            return iM15959;
        } catch (Throwable th) {
            try {
                c8051M44573.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m44572(int i) {
        C5311 c5311 = this.f62240;
        if (c5311 != null) {
            return c5311.m15955(i);
        }
        C8051 c8051M44573 = m44573();
        try {
            int iM15955 = c8051M44573.f26678.m15955(i);
            c8051M44573.close();
            return iM15955;
        } catch (Throwable th) {
            try {
                c8051M44573.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
