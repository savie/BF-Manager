package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.֨֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0830 extends C21953 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f3126;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public double f3127;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedList f3128;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f3129;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC20967 f3130;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f3131;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC20967 f3132;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC20967 f3133;

    public C0830() {
        super("Data");
        this.f3128 = new LinkedList();
        this.f3126 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20967 m3325(AbstractC8909 abstractC8909, int i, int i2) {
        int iMo1152 = abstractC8909.mo1152();
        int i3 = this.f3126;
        if (iMo1152 != i3) {
            throw new C23205("Tried to queue " + abstractC8909.mo1152() + " channel data to a " + i3 + " channel port.");
        }
        return new C9778(this, abstractC8909, i, i2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m3331() {
        AbstractC20967 abstractC20967 = this.f3130;
        if (abstractC20967 != null) {
            abstractC20967.getClass();
            this.f3130 = null;
        }
        AbstractC20967 abstractC20968 = this.f3132;
        if (abstractC20968 != null) {
            abstractC20968.getClass();
            this.f3132 = null;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m3329() {
        return this.f3133 != null || this.f3128.size() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m3324(double d) {
        if (this.f3133 == null) {
            synchronized (this.f3128) {
                AbstractC20967 abstractC20967 = (AbstractC20967) this.f3128.remove();
                this.f3133 = abstractC20967;
                this.f3131 = abstractC20967.f58918;
                abstractC20967.f58919 = abstractC20967.f58920;
            }
        }
        this.f3127 = this.f3133.f67056.mo1151(this.f3131, d);
        double dMo1150 = this.f3133.f67056.mo1150(this.f3131);
        int i = this.f3131 + 1;
        this.f3131 = i;
        AbstractC20967 abstractC20968 = this.f3133;
        if (i >= abstractC20968.f58918 + abstractC20968.f58921) {
            int i2 = abstractC20968.f58919;
            if (i2 > 0) {
                abstractC20968.f58919 = i2 - 1;
                abstractC20968.getClass();
            } else {
                if (this.f3128.size() == 0) {
                    AbstractC20967 abstractC20969 = this.f3133;
                    if (abstractC20969.f58919 < 0) {
                        abstractC20969.getClass();
                    }
                }
                this.f3133.getClass();
                this.f3132 = this.f3133;
                this.f3133 = null;
            }
            AbstractC20967 abstractC209610 = this.f3133;
            this.f3131 = abstractC209610.f58918;
            this.f3130 = abstractC209610;
        }
        this.f3129 = true;
        return dMo1150;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m3330() {
        return this.f3127;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m3332() {
        synchronized (this.f3128) {
            this.f3128.clear();
            this.f3133 = null;
            this.f3129 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3327(AbstractC8909 abstractC8909, int i, int i2, C4930 c4930) {
        AbstractC20967 abstractC20967M3325 = m3325(abstractC8909, i, i2);
        abstractC20967M3325.f58920 = -1;
        m49678(c4930, abstractC20967M3325);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3326(C4930 c4930) {
        m49678(c4930, new C18729(this));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m3328() {
        return this.f3129;
    }
}
