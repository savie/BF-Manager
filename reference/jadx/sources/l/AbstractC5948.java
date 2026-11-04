package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩸᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5948 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14618 f20371;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20372;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1195 f20373;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15291 f20376;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC12931 f20377;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14618 f20378;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23497 f20374 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23497 f20379 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23497 f20381 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C23497 f20375 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC5670 f20380 = EnumC5670.unknown;

    public AbstractC5948(C15291 c15291, AbstractC12931 abstractC12931, int i) {
        this.f20376 = c15291;
        this.f20377 = abstractC12931;
        this.f20372 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17322() {
        boolean zM39783 = EnumC16856.m39783(this.f20372);
        C15291 c15291 = this.f20376;
        if (zM39783) {
            this.f20371 = new C14618(c15291, EnumC13127.f41939);
            this.f20372 &= ~EnumC16856.f54382.m39816();
        }
        if (EnumC16856.m39793(this.f20372)) {
            this.f20378 = new C14618(c15291, EnumC13127.f41943);
            this.f20372 &= ~EnumC16856.f54352.m39816();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC12931 m17326() {
        return this.f20377;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17324(C7660 c7660) {
        C1195 c1195 = this.f20373;
        if (c1195 != null && c7660.f67820 != c1195.f4357.f67820) {
            this.f20377.mo4165("The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC5202.f18151.m15637(), this.f20380.m16664());
        }
        this.f20373 = new C1195(this.f20376, EnumC13127.f41976, c7660);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17325(C7660 c7660, long j) {
        C1195 c1195 = this.f20373;
        if (c1195 != null && c7660.f67820 != c1195.f4357.f67820) {
            this.f20377.mo4166(j, "The new attribute \"{0}\" overwrites an already declared one in the \"{1}\" structure.", EnumC5202.f18151.m15637(), this.f20380.m16664());
        }
        this.f20373 = new C1195(this.f20376, EnumC13127.f41976, c7660);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11562 m17321(InterfaceC3359... interfaceC3359Arr) {
        C11562 c11562 = new C11562();
        for (InterfaceC3359 interfaceC3359 : interfaceC3359Arr) {
            if (interfaceC3359 != null) {
                c11562.m29081(interfaceC3359);
            }
        }
        C23497 c23497 = this.f20374;
        if (c23497 != null) {
            c11562.m29081(c23497);
        }
        C23497 c23498 = this.f20379;
        if (c23498 != null) {
            c11562.m29081(c23498);
        }
        C23497 c23499 = this.f20381;
        if (c23499 != null) {
            c11562.m29081(c23499);
        }
        C23497 c234910 = this.f20375;
        if (c234910 != null) {
            c11562.m29081(c234910);
        }
        return c11562;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17323(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12381 c12381 = (C12381) it.next();
                boolean z = c12381.f39752;
                boolean z2 = c12381 instanceof C22817;
                C15291 c15291 = this.f20376;
                if (z2) {
                    C22817 c22817 = (C22817) c12381;
                    if (z) {
                        if (this.f20375 == null) {
                            this.f20375 = new C23497(c15291, EnumC13127.f41944);
                        }
                        this.f20375.m52689(c22817);
                    } else {
                        if (this.f20381 == null) {
                            this.f20381 = new C23497(c15291, EnumC13127.f41948);
                        }
                        this.f20381.m52689(c22817);
                    }
                } else if (z) {
                    if (this.f20379 == null) {
                        this.f20379 = new C23497(c15291, EnumC13127.f41964);
                    }
                    this.f20379.m52689(c12381);
                } else {
                    if (this.f20374 == null) {
                        this.f20374 = new C23497(c15291, EnumC13127.f41971);
                    }
                    this.f20374.m52689(c12381);
                }
            }
        }
    }
}
