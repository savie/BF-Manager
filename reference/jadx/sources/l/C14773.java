package l;

/* JADX INFO: renamed from: l.ܳ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C14773 extends AbstractC17449 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f48299;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f48300;

    @Override // l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1767(Object obj, AbstractC16579 abstractC16579) {
        throw new AssertionError();
    }

    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ Object mo4812(C5954 c5954, Object obj) {
        return Boolean.FALSE;
    }

    @Override // l.AbstractC18154, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9280(C10894 c10894, Object obj) {
        AbstractC16579 abstractC16579 = c10894.f53121;
        AbstractC16579 abstractC165710 = (AbstractC16579) obj;
        boolean zM39001 = abstractC165710.m39001(EnumC6617.FORALL);
        C23800 c23800 = this.f48300;
        boolean z = false;
        if (!zM39001) {
            if (!this.f48299) {
                z = abstractC165710.m39001(EnumC6617.METHOD) && c23800.m52430(((C13757) abstractC16579).f45367, abstractC165710.mo33523());
            }
            return Boolean.valueOf(z);
        }
        C10894 c10895 = (C10894) abstractC165710;
        return Boolean.valueOf(c23800.m52391(c10894, c10895) && ((Boolean) abstractC16579.mo1928(this, c23800.m52371(c10895.f53121, c10895.f37076, c10894.f37076))).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final Object mo6581(C13757 c13757, Object obj) {
        boolean z;
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        if (abstractC16579.m39001(EnumC6617.METHOD)) {
            if (this.f48300.m52430(c13757.f45367, abstractC16579.mo33523())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C14773(C23800 c23800, boolean z) {
        this.f48300 = c23800;
        this.f48299 = z;
    }
}
