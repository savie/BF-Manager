package l;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2461 implements InterfaceC23342 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f9803 = C3872.m11205();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f9804;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9805;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f9806;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f9807;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f9808;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f9809;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f9810;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m7538() {
        if (this.f9805) {
            return true;
        }
        this.f9805 = true;
        C11635 c11635 = C3872.f14474;
        int i = this.f9803;
        c11635.getClass();
        C1468.m5101(this);
        try {
            C1468.m5106(i);
            return true;
        } catch (Throwable unused) {
            C1468.m5112(this);
            this.f9805 = false;
            return false;
        }
    }

    public C2461(C13752 c13752) {
        this.f9809 = new WeakReference(c13752.f45340);
        this.f9807 = c13752.f45343;
        this.f9806 = c13752.f45339;
        this.f9810 = c13752.f45341;
        this.f9808 = c13752.f45344;
        this.f9804 = c13752.f45342;
    }

    @Override // l.InterfaceC23342
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7537(int i, int i2) {
        if (i != this.f9803) {
            return;
        }
        synchronized (this) {
            if (this.f9805) {
                this.f9805 = false;
                C3872.f14474.getClass();
                C1468.m5112(this);
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f9809.get();
                if (abstractActivityC12483 != null) {
                    C13752 c13752 = new C13752(abstractActivityC12483, this.f9807, this.f9806, this.f9810, this.f9808, this.f9804);
                    if (i2 == 0) {
                        c13752.m33510(EnumC23589.SHIZUKU);
                    } else {
                        c13752.m33511(EnumC23589.SHIZUKU);
                    }
                }
            }
        }
    }
}
