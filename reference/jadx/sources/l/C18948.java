package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ᩴᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18948 extends C16126 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC4130 f61355;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC4130 f61356;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f61357;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC4130 f61358;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f61359;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final LinkedList f61360;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public double f61361;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f61362;

    public C18948() {
        super("Data");
        this.f61360 = new LinkedList();
        this.f61357 = 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4130 m43647(AbstractC21803 abstractC21803, int i, int i2) {
        int iMo31294 = abstractC21803.mo31294();
        int i3 = this.f61357;
        if (iMo31294 != i3) {
            throw new C4836("Tried to queue " + abstractC21803.mo31294() + " channel data to a " + i3 + " channel port.");
        }
        return new C18242(this, abstractC21803, i, i2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m43650() {
        AbstractC4130 abstractC4130 = this.f61355;
        if (abstractC4130 != null) {
            abstractC4130.getClass();
            this.f61355 = null;
        }
        AbstractC4130 abstractC4131 = this.f61358;
        if (abstractC4131 != null) {
            abstractC4131.getClass();
            this.f61358 = null;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m43644() {
        return this.f61356 != null || this.f61360.size() > 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m43646(double d) {
        if (this.f61356 == null) {
            synchronized (this.f61360) {
                AbstractC4130 abstractC4130 = (AbstractC4130) this.f61360.remove();
                this.f61356 = abstractC4130;
                this.f61362 = abstractC4130.f23377;
                abstractC4130.f23376 = abstractC4130.f23375;
            }
        }
        this.f61361 = this.f61356.f15132.mo31293(this.f61362, d);
        double dMo31292 = this.f61356.f15132.mo31292(this.f61362);
        int i = this.f61362 + 1;
        this.f61362 = i;
        AbstractC4130 abstractC4131 = this.f61356;
        if (i >= abstractC4131.f23377 + abstractC4131.f23378) {
            int i2 = abstractC4131.f23376;
            if (i2 > 0) {
                abstractC4131.f23376 = i2 - 1;
                abstractC4131.getClass();
            } else {
                if (this.f61360.size() == 0) {
                    AbstractC4130 abstractC4132 = this.f61356;
                    if (abstractC4132.f23376 < 0) {
                        abstractC4132.getClass();
                    }
                }
                this.f61356.getClass();
                this.f61358 = this.f61356;
                this.f61356 = null;
            }
            AbstractC4130 abstractC4133 = this.f61356;
            this.f61362 = abstractC4133.f23377;
            this.f61355 = abstractC4133;
        }
        this.f61359 = true;
        return dMo31292;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double m43652() {
        return this.f61361;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m43645() {
        synchronized (this.f61360) {
            this.f61360.clear();
            this.f61356 = null;
            this.f61359 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43649(AbstractC21803 abstractC21803, int i, int i2, C15879 c15879) {
        AbstractC4130 abstractC4130M43647 = m43647(abstractC21803, i, i2);
        abstractC4130M43647.f23375 = -1;
        m38175(c15879, abstractC4130M43647);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43648(C15879 c15879) {
        m38175(c15879, new C21770(this));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m43651() {
        return this.f61359;
    }
}
