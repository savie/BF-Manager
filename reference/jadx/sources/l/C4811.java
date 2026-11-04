package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۙۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: UITV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4811 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f16836 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f16839 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f16838 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f16837 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f16840 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1345 m14831(AbstractC1566 abstractC1566) {
        return (C1345) this.f16836.get(abstractC1566);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1345 m14830(C1345 c1345) {
        synchronized (this.f16836) {
            C1345 c1346 = (C1345) this.f16836.put(c1345.getType(), c1345);
            if (c1346 != null) {
                c1345 = c1346;
            }
        }
        return c1345;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21965 m14834(int i) {
        C21965 c21965;
        synchronized (this.f16837) {
            c21965 = (C21965) this.f16837.get(Integer.valueOf(i));
        }
        return c21965;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14836(int i, C21965 c21965) {
        synchronized (this.f16837) {
            this.f16837.put(Integer.valueOf(i), c21965);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21965 m14835(C21965 c21965) {
        synchronized (this.f16838) {
            C21965 c21966 = (C21965) this.f16838.get(c21965);
            if (c21966 != null) {
                return c21966;
            }
            this.f16838.put(c21965, c21965);
            return c21965;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14022 m14833(C14022 c14022) {
        synchronized (this.f16839) {
            C14022 c14023 = (C14022) this.f16839.get(c14022);
            if (c14023 != null) {
                return c14023;
            }
            this.f16839.put(c14022, c14022);
            return c14022;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10776 m14832(String str) {
        return (C10776) this.f16840.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14837(C10776 c10776) {
        this.f16840.put(c10776.m27469(), c10776);
    }
}
