package l;

/* JADX INFO: renamed from: l.᩻ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C24967 extends AbstractC5313 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f80855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24705 f80856;

    @Override // l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1766(Object obj, AbstractC22664 abstractC22664) {
        throw new AssertionError();
    }

    @Override // l.AbstractC1100, l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4102(C5291 c5291, Object obj) {
        AbstractC22664 abstractC22664 = c5291.f72657;
        AbstractC22664 abstractC22665 = (AbstractC22664) obj;
        boolean zM51067 = abstractC22665.m51067(EnumC21172.FORALL);
        C24705 c24705 = this.f80856;
        boolean z = false;
        if (!zM51067) {
            if (!this.f80855) {
                z = abstractC22665.m51067(EnumC21172.METHOD) && c24705.m55162(((C23191) abstractC22664).f75155, abstractC22665.mo50621());
            }
            return Boolean.valueOf(z);
        }
        C5291 c5292 = (C5291) abstractC22665;
        return Boolean.valueOf(c24705.m55112(c5291, c5292) && ((Boolean) abstractC22664.mo9324(this, c24705.m55103(c5292.f72657, c5292.f18620, c5291.f18620))).booleanValue());
    }

    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo10772(C12748 c12748, Object obj) {
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // l.AbstractC14040, l.InterfaceC4764
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2231(C23191 c23191, Object obj) {
        boolean z;
        AbstractC22664 abstractC22664 = (AbstractC22664) obj;
        if (abstractC22664.m51067(EnumC21172.METHOD)) {
            if (this.f80856.m55162(c23191.f75155, abstractC22664.mo50621())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C24967(C24705 c24705, boolean z) {
        this.f80856 = c24705;
        this.f80855 = z;
    }
}
