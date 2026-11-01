package l;

/* JADX INFO: renamed from: l.ۙᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4807 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14377 f16896;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22447 f16897;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC13981 f16898;

    public C4807(C22447 c22447) {
        this.f16897 = c22447;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13363(C6656 c6656) {
        AbstractC5930 abstractC5930 = c6656.f22477;
        AbstractC11242 abstractC11242 = c6656.f22478;
        C22447 c22447 = this.f16897;
        if (abstractC5930 != null && abstractC11242 != c22447.f73261.f77594) {
            if (c22447.m49862(c6656.f22477, false) != null) {
                m13362(EnumC13981.VAR);
            } else {
                m13362(EnumC13981.EXPLICIT);
            }
        }
        if ((c6656.f22477 != null || abstractC11242 == c22447.f73261.f77594) && (c6656.f22477 == null || abstractC11242 != c22447.f73261.f77594)) {
            return;
        }
        m13362(EnumC13981.IMPLICIT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13362(EnumC13981 enumC13981) {
        EnumC13981 enumC13982;
        EnumC13981 enumC13983 = this.f16898;
        if (enumC13983 == null) {
            this.f16898 = enumC13981;
            return;
        }
        if (enumC13983 == enumC13981 || enumC13983 == (enumC13982 = EnumC13981.ERROR)) {
            return;
        }
        this.f16898 = enumC13982;
        int i = enumC13983.f45978;
        EnumC13981 enumC13984 = EnumC13981.VAR;
        this.f16896 = (EnumC14026.f46129.m33945(this.f16897.f73263) || !(i == enumC13984.f45978 || enumC13981.f45978 == enumC13984.f45978)) ? C22447.f73249[enumC13983.f45978][enumC13981.f45978] : null;
    }
}
