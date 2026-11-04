package l;

/* JADX INFO: renamed from: l.ܺۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: A18X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16747 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC0078 f54054;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15496 f54056 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15496 f54055 = null;

    public C16747(AbstractC0078 abstractC0078) {
        this.f54054 = abstractC0078;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15496 m39521(C15496 c15496, C15496 c15497) {
        EnumC7536 enumC7536;
        this.f54056 = c15496;
        this.f54055 = null;
        int i = 0;
        AbstractC17734 abstractC17734M41527 = c15497;
        while (abstractC17734M41527 != null) {
            if (abstractC17734M41527 instanceof C15496) {
                C15496 c15498 = (C15496) abstractC17734M41527;
                if (this.f54054.mo1133(this.f54056, c15498)) {
                    this.f54055 = c15498;
                    enumC7536 = EnumC7536.STOP;
                } else {
                    enumC7536 = EnumC7536.CONTINUE;
                }
            } else {
                enumC7536 = EnumC7536.CONTINUE;
            }
            if (enumC7536 != EnumC7536.STOP) {
                if (enumC7536 == EnumC7536.CONTINUE && abstractC17734M41527.mo9543() > 0) {
                    abstractC17734M41527 = abstractC17734M41527.m41527(0);
                    i++;
                } else {
                    while (abstractC17734M41527.m41541() == null && i > 0) {
                        EnumC7536 enumC7537 = EnumC7536.CONTINUE;
                        if (enumC7536 == enumC7537 || enumC7536 == EnumC7536.SKIP_CHILDREN) {
                            if (enumC7537 != EnumC7536.STOP) {
                                enumC7536 = enumC7537;
                            }
                        }
                        AbstractC17734 abstractC17734M41536 = abstractC17734M41527.m41536();
                        i--;
                        if (enumC7536 == EnumC7536.REMOVE) {
                            abstractC17734M41527.m41532();
                        }
                        enumC7536 = enumC7537;
                        abstractC17734M41527 = abstractC17734M41536;
                    }
                    EnumC7536 enumC7538 = EnumC7536.CONTINUE;
                    if (enumC7536 == enumC7538 || enumC7536 == EnumC7536.SKIP_CHILDREN) {
                        if (enumC7538 != EnumC7536.STOP) {
                            enumC7536 = enumC7538;
                            if (abstractC17734M41527 == c15497) {
                                AbstractC17734 abstractC17734M41541 = abstractC17734M41527.m41541();
                                if (enumC7536 == EnumC7536.REMOVE) {
                                    abstractC17734M41527.m41532();
                                }
                                abstractC17734M41527 = abstractC17734M41541;
                            }
                        }
                    } else if (abstractC17734M41527 == c15497) {
                        AbstractC17734 abstractC17734M41542 = abstractC17734M41527.m41541();
                        if (enumC7536 == EnumC7536.REMOVE) {
                            abstractC17734M41527.m41532();
                        }
                        abstractC17734M41527 = abstractC17734M41542;
                    }
                }
            }
            return this.f54055;
        }
        EnumC7536 enumC7539 = EnumC7536.CONTINUE;
        return this.f54055;
    }
}
