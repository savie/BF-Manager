package l;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C12395 extends C10625 implements InterfaceC1209, InterfaceC10382 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2596 f39876;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12863 f39877;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f39878;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f39879;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f39880;

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1518(C16327 c16327) {
        C2596 c2596 = this.f39876;
        boolean zContains = c2596.f8340.contains(this.f39880);
        LinkedHashSet linkedHashSet = this.f39878;
        if (zContains) {
            linkedHashSet.add(this.f39880);
        }
        C12863 c12863 = this.f39877;
        if (c12863.f41178.m55087(this.f39880)) {
            AbstractC22664 abstractC22664M55143 = c12863.f41178.m55143(this.f39880);
            C14769 c14769M8713 = c2596.m8713(abstractC22664M55143.mo50621());
            if (c16327.f53000 == EnumC17819.IMPLICIT && c14769M8713.m35550()) {
                linkedHashSet.addAll(c14769M8713);
                C14769 c14769M8702 = c2596.m8702(abstractC22664M55143.mo31585());
                LinkedHashSet linkedHashSet2 = this.f39879;
                linkedHashSet2.addAll(c14769M8702);
                linkedHashSet2.addAll(c2596.m8713(abstractC22664M55143.mo50622()));
            }
            AbstractC22664 abstractC22664Mo31585 = abstractC22664M55143.mo31585();
            if (c16327.m38748() == EnumC25033.EXPRESSION) {
                AbstractC22664 abstractC22664 = this.f39880;
                try {
                    this.f39880 = abstractC22664Mo31585;
                    mo5474(c16327.f53001);
                    return;
                } finally {
                    this.f39880 = abstractC22664;
                }
            }
            new C3446(this, abstractC22664Mo31585).mo5474(c16327.f53001);
        }
    }

    @Override // l.InterfaceC1209
    /* JADX INFO: renamed from: ۙ */
    public boolean mo4423() {
        return !this.f39878.isEmpty();
    }

    @Override // l.InterfaceC1209
    /* JADX INFO: renamed from: ۤ */
    public final Set mo4424() {
        return this.f39878;
    }

    @Override // l.InterfaceC1209
    /* JADX INFO: renamed from: ᩷ */
    public final Set mo4425() {
        return this.f39879;
    }

    public C12395(C12863 c12863, C14479 c14479, C8666 c8666) {
        this.f39877 = c12863;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f39878 = linkedHashSet;
        this.f39879 = new LinkedHashSet();
        this.f39880 = c14479.f45575;
        InterfaceC1013 interfaceC1013 = c14479.f45571;
        this.f39876 = interfaceC1013.mo2276();
        mo5474(c8666.f28301);
        if (linkedHashSet.isEmpty()) {
            return;
        }
        interfaceC1013.mo2276().m8700(C14769.m35539((Iterable) linkedHashSet), this);
    }

    @Override // l.InterfaceC10382
    /* JADX INFO: renamed from: ۙ */
    public final void mo2127(C2596 c2596) {
        this.f39878.clear();
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public void mo1954(C12598 c12598) {
        mo5474(c12598.f40436);
        C2596 c2596 = this.f39876;
        boolean zContains = c2596.f8340.contains(this.f39880);
        LinkedHashSet linkedHashSet = this.f39878;
        if (zContains) {
            linkedHashSet.add(this.f39880);
            return;
        }
        C12863 c12863 = this.f39877;
        if (c12863.f41178.m55087(this.f39880)) {
            AbstractC22664 abstractC22664M55143 = c12863.f41178.m55143(this.f39880);
            C14769 c14769M8713 = c2596.m8713(abstractC22664M55143.mo50621());
            if (!c14769M8713.m35550() || c12598.mo6737() == EnumC3649.UNOVERLOADED) {
                return;
            }
            linkedHashSet.addAll(c14769M8713);
            C14769 c14769M8702 = c2596.m8702(abstractC22664M55143.mo31585());
            LinkedHashSet linkedHashSet2 = this.f39879;
            linkedHashSet2.addAll(c14769M8702);
            linkedHashSet2.addAll(c2596.m8713(abstractC22664M55143.mo50622()));
        }
    }

    @Override // l.C23174, l.AbstractC0578
    /* JADX INFO: renamed from: ۙ */
    public final void mo1514(C13256 c13256) {
        new C20600(this).m52092(c13256.f42355);
    }
}
