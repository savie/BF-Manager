package l;

/* JADX INFO: renamed from: l.۫ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public class C12221 extends C7281 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5870 f40851;

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ C13757 mo6581(C13757 c13757, Object obj) {
        return (C13757) mo6581(c13757, (AbstractC16579) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12221(C5870 c5870, EnumC9729 enumC9729, AbstractC23903 abstractC23903, EnumC11678 enumC11678) {
        super(c5870, enumC9729, abstractC23903, enumC11678 == null ? EnumC11678.f39281 : enumC11678);
        this.f40851 = c5870;
    }

    @Override // l.C7281
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC16579 mo19417(C10104 c10104, AbstractC16579 abstractC16579) {
        AbstractC16579 abstractC16579Mo19417 = super.mo19417(c10104, (Object) abstractC16579);
        AbstractC5930 abstractC5930 = c10104.f34494;
        if (abstractC16579Mo19417 != AbstractC16579.f53219) {
            return abstractC16579Mo19417;
        }
        boolean z = abstractC5930.m22847(EnumC18651.f60512) || abstractC5930.m22847(EnumC18651.f60511);
        C5870 c5870 = this.f40851;
        if (abstractC16579 == null || (z && !c5870.f20040.m52404(abstractC16579))) {
            abstractC16579 = AbstractC16579.f53218;
        }
        C6761 c6761 = c5870.f20041;
        C13638.requireNonNull(c6761);
        c10104.m25713((C1116) new C16454(this, c6761, this.f24203, abstractC16579));
        return (AbstractC16579) c10104.mo1928(this, (Object) null);
    }

    @Override // l.AbstractC3877, l.AbstractC7717, l.InterfaceC15874
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC16579 mo6581(C13757 c13757, AbstractC16579 abstractC16579) {
        EnumC6617 enumC6617 = EnumC6617.METHOD;
        if (c13757.m39001(enumC6617)) {
            C12926 c12926 = this.f24203;
            if (c12926.f42954 == EnumC9729.CHECK) {
                AbstractC16579 abstractC165710 = c12926.f42951.f77449;
                AbstractC16579 abstractC16579Mo16234 = abstractC165710.m39001(EnumC6617.ERROR) ? ((C5954) abstractC165710).mo16234() : null;
                if (abstractC16579Mo16234 != null && abstractC16579Mo16234.m39001(enumC6617)) {
                    C21825 c21825M30333 = m30333(c13757.f45367, abstractC16579Mo16234.mo33523());
                    AbstractC16579 abstractC165711 = (AbstractC16579) c13757.f45368.mo1928(this, abstractC16579Mo16234.mo16235());
                    C21825 c21825M30334 = m30333(c13757.f45366, abstractC16579Mo16234.mo33524());
                    return (c21825M30333 == c13757.f45367 && abstractC165711 == c13757.f45368 && c21825M30334 == c13757.f45366) ? c13757 : new C13757(c21825M30333, abstractC165711, c21825M30334, c13757.f53222);
                }
            }
        }
        return super.mo6581(c13757, (Object) abstractC16579);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21825 m30333(C21825 c21825, C21825 c21826) {
        if (!c21825.m48595()) {
            return c21825;
        }
        AbstractC16579 abstractC16579 = null;
        C21825 c21825M30333 = m30333(c21825.f70877, c21826 != null ? c21826.f70877 : null);
        AbstractC16579 abstractC165710 = (AbstractC16579) c21825.f70876;
        if (c21826 != null && c21826.m48595()) {
            abstractC16579 = (AbstractC16579) c21826.f70876;
        }
        AbstractC16579 abstractC165711 = (AbstractC16579) m20360(abstractC16579, abstractC165710);
        return (c21825M30333 == c21825.f70877 && abstractC165711 == c21825.f70876) ? c21825 : c21825M30333.m48597(abstractC165711);
    }
}
