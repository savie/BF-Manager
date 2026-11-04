package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.᩶ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes.dex */
public final class C21439 extends AbstractC14681 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11172 f68392;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21439(C11172 c11172, AbstractC19728 abstractC19728, EnumC3539 enumC3539, EnumSet enumSet) {
        super(c11172, abstractC19728, enumC3539, enumSet);
        this.f68392 = c11172;
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ۙ */
    public final void mo2564(int i, AbstractC11781 abstractC11781) {
        EnumC13603 enumC13603 = abstractC11781.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43213;
        C11172 c11172 = this.f68392;
        if (enumC13603 == enumC13604) {
            C24550 c24550 = (C24550) abstractC11781;
            boolean z = true;
            c11172.f35188 = true;
            try {
                C10510 c10510 = (C10510) c24550.f38067;
                if (c24550 != c11172.f35192) {
                    z = false;
                }
                C11972.m30026(z);
                AbstractC19728 abstractC19728M50345 = c11172.f35205.m50345(c11172.m28138());
                byte[] bArrMo42394 = abstractC19728M50345.mo42394();
                int iMo42398 = abstractC19728M50345.mo42398();
                int iMo42395 = abstractC19728M50345.mo42395();
                c11172.f35191 = bArrMo42394;
                c11172.f35207 = iMo42398;
                c11172.f35211 = iMo42398 + iMo42395;
                c10510.f33438 = c11172.m28119();
                c10510.f33442 = c11172.m28134();
                C18499 c18499 = new C18499();
                while (c11172.f35207 != c11172.f35211) {
                    c18499.m43089(c11172.m28134());
                }
                c10510.f33437 = c18499.m43093();
                return;
            } finally {
                c11172.f35188 = false;
            }
        }
        C14769 c14769Mo50622 = abstractC11781.f38067.mo50622();
        AbstractC22664 abstractC22664M50340 = c11172.f35205.m50340(c11172.m28138());
        abstractC11781.f38067 = abstractC22664M50340;
        if (abstractC11781.f38066 == EnumC13603.f43218 && abstractC22664M50340.mo50622().isEmpty()) {
            abstractC11781.f38067.mo15883().f75157 = c14769Mo50622;
        }
    }
}
