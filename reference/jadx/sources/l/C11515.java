package l;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C11515 extends C0225 implements InterfaceC7987, InterfaceC18383 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f38709;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f38710;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C19524 f38711;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f38712;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5870 f38713;

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3959(C22489 c22489) {
        C19524 c19524 = this.f38711;
        boolean zContains = c19524.f62771.contains(this.f38709);
        LinkedHashSet linkedHashSet = this.f38710;
        if (zContains) {
            linkedHashSet.add(this.f38709);
        }
        C5870 c5870 = this.f38713;
        if (c5870.f20040.m52404(this.f38709)) {
            AbstractC16579 abstractC16579M52431 = c5870.f20040.m52431(this.f38709);
            C21825 c21825M44585 = c19524.m44585(abstractC16579M52431.mo33523());
            if (c22489.f73411 == EnumC5555.IMPLICIT && c21825M44585.m48595()) {
                linkedHashSet.addAll(c21825M44585);
                C21825 c21825M44599 = c19524.m44599(abstractC16579M52431.mo16235());
                LinkedHashSet linkedHashSet2 = this.f38712;
                linkedHashSet2.addAll(c21825M44599);
                linkedHashSet2.addAll(c19524.m44585(abstractC16579M52431.mo33524()));
            }
            AbstractC16579 abstractC16579Mo16235 = abstractC16579M52431.mo16235();
            if (c22489.m49993() == EnumC9897.EXPRESSION) {
                AbstractC16579 abstractC16579 = this.f38709;
                try {
                    this.f38709 = abstractC16579Mo16235;
                    mo7248(c22489.f73408);
                    return;
                } finally {
                    this.f38709 = abstractC16579;
                }
            }
            new C4458(this, abstractC16579Mo16235).mo7248(c22489.f73408);
        }
    }

    @Override // l.InterfaceC7987
    /* JADX INFO: renamed from: ۙ */
    public boolean mo21044() {
        return !this.f38710.isEmpty();
    }

    @Override // l.InterfaceC7987
    /* JADX INFO: renamed from: ۨ */
    public final Set mo21045() {
        return this.f38710;
    }

    @Override // l.InterfaceC7987
    /* JADX INFO: renamed from: ܰ */
    public final Set mo21046() {
        return this.f38712;
    }

    public C11515(C5870 c5870, C1116 c1116, C10104 c10104) {
        this.f38713 = c5870;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f38710 = linkedHashSet;
        this.f38712 = new LinkedHashSet();
        this.f38709 = c1116.f5036;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        this.f38711 = interfaceC18195.mo4574();
        mo7248(c10104.f34494);
        if (linkedHashSet.isEmpty()) {
            return;
        }
        interfaceC18195.mo4574().m44595(C21825.m48583((Iterable) linkedHashSet), this);
    }

    @Override // l.InterfaceC18383
    /* JADX INFO: renamed from: ۙ */
    public final void mo969(C19524 c19524) {
        this.f38710.clear();
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public void mo3929(C6966 c6966) {
        mo7248(c6966.f23408);
        C19524 c19524 = this.f38711;
        boolean zContains = c19524.f62771.contains(this.f38709);
        LinkedHashSet linkedHashSet = this.f38710;
        if (zContains) {
            linkedHashSet.add(this.f38709);
            return;
        }
        C5870 c5870 = this.f38713;
        if (c5870.f20040.m52404(this.f38709)) {
            AbstractC16579 abstractC16579M52431 = c5870.f20040.m52431(this.f38709);
            C21825 c21825M44585 = c19524.m44585(abstractC16579M52431.mo33523());
            if (!c21825M44585.m48595() || c6966.mo17205() == EnumC13317.UNOVERLOADED) {
                return;
            }
            linkedHashSet.addAll(c21825M44585);
            C21825 c21825M44599 = c19524.m44599(abstractC16579M52431.mo16235());
            LinkedHashSet linkedHashSet2 = this.f38712;
            linkedHashSet2.addAll(c21825M44599);
            linkedHashSet2.addAll(c19524.m44585(abstractC16579M52431.mo33524()));
        }
    }

    @Override // l.C22220, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3934(C9789 c9789) {
        new C13632(this).m49334(c9789.f33505);
    }
}
