package l;

import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C1069 extends AbstractList {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f3831;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9271 f3832;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractViewOnClickListenerC8526[] f3833;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m4005(AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8526) {
        int i = 0;
        for (int i2 = 0; i2 < this.f3833.length; i2++) {
            if (i2 == 2 && !this.f3831.isEmpty()) {
                int size = this.f3831.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8527 = (AbstractViewOnClickListenerC8526) this.f3831.get(i3);
                    int iMo13033 = abstractViewOnClickListenerC8527.mo13033();
                    if (iMo13033 != 0) {
                        if (abstractViewOnClickListenerC8527 == abstractViewOnClickListenerC8526) {
                            return i;
                        }
                        i += iMo13033;
                    }
                }
            }
            AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8528 = this.f3833[i2];
            int iMo13034 = abstractViewOnClickListenerC8528.mo13033();
            if (iMo13034 != 0) {
                if (abstractViewOnClickListenerC8528 == abstractViewOnClickListenerC8526) {
                    return i;
                }
                i += iMo13034;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized AbstractC13001 m4006(int i) {
        if (this.f3832.f30164.f41656 == i) {
            return this.f3832.f30164;
        }
        int size = this.f3831.size();
        for (int i2 = 0; i2 < size; i2++) {
            C14492 c14492 = (C14492) this.f3831.get(i2);
            if (c14492.f41656 == i) {
                return c14492;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized void m4007() {
        this.f3832.f30164.m32418();
        this.f3831.clear();
        C19518.m45048(new C10017(this));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m4008() {
        int iMo13033;
        iMo13033 = 0;
        for (AbstractViewOnClickListenerC8526 abstractViewOnClickListenerC8526 : this.f3833) {
            iMo13033 += abstractViewOnClickListenerC8526.mo13033();
        }
        int size = this.f3831.size();
        for (int i = 0; i < size; i++) {
            iMo13033 += ((C14492) this.f3831.get(i)).mo13033();
        }
        return iMo13033;
    }

    public C1069(C9271 c9271) {
        this.f3832 = c9271;
        C0873 c0873 = c9271.f30158;
        C17359.requireNonNull(c0873);
        C24740 c24740 = c9271.f30164;
        C17359.requireNonNull(c24740);
        C8287 c8287 = c9271.f30163;
        C17359.requireNonNull(c8287);
        C4052 c4052 = c9271.f30157;
        C17359.requireNonNull(c4052);
        C23994 c23994 = c9271.f30159;
        C17359.requireNonNull(c23994);
        C1750 c1750 = c9271.f30165;
        C17359.requireNonNull(c1750);
        this.f3833 = new AbstractViewOnClickListenerC8526[]{c0873, c24740, c8287, c4052, c23994, c1750};
        this.f3831 = new ArrayList();
        m4007();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m4004(C1069 c1069, C10567 c10567) {
        C9271 c9271 = c1069.f3832;
        C14492 c14492 = new C14492(c9271.f30155, c9271, c10567);
        c14492.m32418();
        c1069.f3831.add(c14492);
    }

    @Override // java.util.AbstractList, java.util.List
    public final synchronized AbstractViewOnClickListenerC8526 get(int i) {
        if (i >= 2) {
            int i2 = i - 2;
            if (i2 < this.f3831.size()) {
                return (AbstractViewOnClickListenerC8526) this.f3831.get(i2);
            }
            i -= this.f3831.size();
        }
        return this.f3833[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3831.size() + this.f3833.length;
    }
}
