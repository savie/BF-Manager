package l;

/* JADX INFO: renamed from: l.᩻᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes.dex */
public final class C23944 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4166 f77662;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C0617 f77664 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C0617 f77663 = null;

    public C23944(AbstractC4166 abstractC4166) {
        this.f77662 = abstractC4166;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0617 m52779(C0617 c0617, C0617 c0618) {
        EnumC6989 enumC6989;
        this.f77664 = c0617;
        this.f77663 = null;
        int i = 0;
        AbstractC14730 abstractC14730M35261 = c0618;
        while (abstractC14730M35261 != null) {
            if (abstractC14730M35261 instanceof C0617) {
                C0617 c0619 = (C0617) abstractC14730M35261;
                if (this.f77662.mo2407(this.f77664, c0619)) {
                    this.f77663 = c0619;
                    enumC6989 = EnumC6989.STOP;
                } else {
                    enumC6989 = EnumC6989.CONTINUE;
                }
            } else {
                enumC6989 = EnumC6989.CONTINUE;
            }
            if (enumC6989 != EnumC6989.STOP) {
                if (enumC6989 == EnumC6989.CONTINUE && abstractC14730M35261.mo2831() > 0) {
                    abstractC14730M35261 = abstractC14730M35261.m35261(0);
                    i++;
                } else {
                    while (abstractC14730M35261.m35273() == null && i > 0) {
                        EnumC6989 enumC69810 = EnumC6989.CONTINUE;
                        if (enumC6989 == enumC69810 || enumC6989 == EnumC6989.SKIP_CHILDREN) {
                            if (enumC69810 != EnumC6989.STOP) {
                                enumC6989 = enumC69810;
                            }
                        }
                        AbstractC14730 abstractC14730M35270 = abstractC14730M35261.m35270();
                        i--;
                        if (enumC6989 == EnumC6989.REMOVE) {
                            abstractC14730M35261.m35268();
                        }
                        enumC6989 = enumC69810;
                        abstractC14730M35261 = abstractC14730M35270;
                    }
                    EnumC6989 enumC69811 = EnumC6989.CONTINUE;
                    if (enumC6989 == enumC69811 || enumC6989 == EnumC6989.SKIP_CHILDREN) {
                        if (enumC69811 != EnumC6989.STOP) {
                            enumC6989 = enumC69811;
                            if (abstractC14730M35261 == c0618) {
                                AbstractC14730 abstractC14730M35273 = abstractC14730M35261.m35273();
                                if (enumC6989 == EnumC6989.REMOVE) {
                                    abstractC14730M35261.m35268();
                                }
                                abstractC14730M35261 = abstractC14730M35273;
                            }
                        }
                    } else if (abstractC14730M35261 == c0618) {
                        AbstractC14730 abstractC14730M35274 = abstractC14730M35261.m35273();
                        if (enumC6989 == EnumC6989.REMOVE) {
                            abstractC14730M35261.m35268();
                        }
                        abstractC14730M35261 = abstractC14730M35274;
                    }
                }
            }
            return this.f77663;
        }
        EnumC6989 enumC69812 = EnumC6989.CONTINUE;
        return this.f77663;
    }
}
