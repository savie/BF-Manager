package l;

/* JADX INFO: renamed from: l.᩻ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes2.dex */
public final class C23758 extends AbstractC17035 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2217 f76863;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12802 f76864;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23758(C12802 c12802, C1512 c1512, C2217 c2217) {
        super(c1512);
        this.f76864 = c12802;
        this.f76863 = c2217;
    }

    @Override // l.AbstractC17035
    /* JADX INFO: renamed from: ۙ */
    public final void mo39804(C22492 c22492) {
        this.f76864.m31801(c22492, this.f76863);
    }

    @Override // l.AbstractC17035
    /* JADX INFO: renamed from: ۙ */
    public final void mo39805(AbstractC23903 abstractC23903) {
        if (abstractC23903.f77452 == EnumC10477.f35878 && abstractC23903.f77448.f77452 == EnumC10477.f35879 && ((C6263) abstractC23903).m17332() == null) {
            C12802 c12802 = this.f76864;
            for (AbstractC0806 abstractC0806M31780 = c12802.m31780(); abstractC0806M31780 != null; abstractC0806M31780 = abstractC0806M31780.f3408) {
                if (abstractC0806M31780.f3413.mo1803() == EnumC18651.f60511) {
                    if (c12802.m31784(abstractC0806M31780.f3412, abstractC23903) == null) {
                        return;
                    } else {
                        ((C2217) abstractC0806M31780).m6836(abstractC23903, EnumC3628.CAPTURED_VAR);
                    }
                }
            }
        }
    }
}
