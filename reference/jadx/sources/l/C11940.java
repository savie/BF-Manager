package l;

/* JADX INFO: renamed from: l.ۧ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11940 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15515 f38447;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23875 f38448;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC25367 f38449;

    public C11940(C23875 c23875) {
        this.f38448 = c23875;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29907(C12510 c12510) {
        AbstractC22295 abstractC22295 = c12510.f40166;
        AbstractC19728 abstractC19728 = c12510.f40164;
        C23875 c23875 = this.f38448;
        if (abstractC22295 != null && abstractC19728 != c23875.f77285.f49799) {
            if (c23875.m53254(c12510.f40166, false) != null) {
                m29906(EnumC25367.VAR);
            } else {
                m29906(EnumC25367.EXPLICIT);
            }
        }
        if ((c12510.f40166 != null || abstractC19728 == c23875.f77285.f49799) && (c12510.f40166 == null || abstractC19728 != c23875.f77285.f49799)) {
            return;
        }
        m29906(EnumC25367.IMPLICIT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m29906(EnumC25367 enumC25367) {
        EnumC25367 enumC25368;
        EnumC25367 enumC25369 = this.f38449;
        if (enumC25369 == null) {
            this.f38449 = enumC25367;
            return;
        }
        if (enumC25369 == enumC25367 || enumC25369 == (enumC25368 = EnumC25367.ERROR)) {
            return;
        }
        this.f38449 = enumC25368;
        int i = enumC25369.f81903;
        EnumC25367 enumC253610 = EnumC25367.VAR;
        this.f38447 = (EnumC3666.f12556.m11915(this.f38448.f77286) || !(i == enumC253610.f81903 || enumC25367.f81903 == enumC253610.f81903)) ? C23875.f77278[enumC25369.f81903][enumC25367.f81903] : null;
    }
}
