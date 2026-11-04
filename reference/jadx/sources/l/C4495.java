package l;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4495 implements InterfaceC19510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16060;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f16061;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f16062;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f16063 = C8224.m22127();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f16064;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f16065;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final WeakReference f16066;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f16067;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m14219() {
        if (this.f16060) {
            return true;
        }
        this.f16060 = true;
        C24633 c24633 = C8224.f27070;
        int i = this.f16063;
        c24633.getClass();
        C12797.m31690(this);
        try {
            C12797.m31695(i);
            return true;
        } catch (Throwable unused) {
            C12797.m31703(this);
            this.f16060 = false;
            return false;
        }
    }

    public C4495(C6733 c6733) {
        this.f16066 = new WeakReference(c6733.f22436);
        this.f16062 = c6733.f22440;
        this.f16065 = c6733.f22441;
        this.f16064 = c6733.f22439;
        this.f16061 = c6733.f22438;
        this.f16067 = c6733.f22437;
    }

    @Override // l.InterfaceC19510
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14218(int i, int i2) {
        if (i != this.f16063) {
            return;
        }
        synchronized (this) {
            if (this.f16060) {
                this.f16060 = false;
                C8224.f27070.getClass();
                C12797.m31703(this);
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f16066.get();
                if (abstractActivityC17204 != null) {
                    C6733 c6733 = new C6733(abstractActivityC17204, this.f16062, this.f16065, this.f16064, this.f16061, this.f16067);
                    if (i2 == 0) {
                        c6733.m18825(EnumC16427.SHIZUKU);
                    } else {
                        c6733.m18826(EnumC16427.SHIZUKU);
                    }
                }
            }
        }
    }
}
