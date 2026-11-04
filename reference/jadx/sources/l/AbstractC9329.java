package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9329 extends AbstractC11962 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17929 f30324;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22295 mo24576(AbstractC22295 abstractC22295) {
        return abstractC22295;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9329(C17929 c17929, EnumC10712 enumC10712, AbstractC11962 abstractC11962) {
        super(c17929, enumC10712, abstractC11962);
        this.f30324 = c17929;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3168 m24575(C3168 c3168, C7926 c7926) {
        AbstractC17836 abstractC17836M41689 = AbstractC17836.m41689(c7926.f26345);
        for (AbstractC11781 abstractC11781 : ((C7768) c3168.f10278.f10272).f25562.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            if (abstractC11781.m29602()) {
                abstractC17836M41689.mo7481(abstractC11781);
            }
        }
        C14769 c14769 = c7926.f26343;
        if (c14769 != null) {
            while (c14769.m35550()) {
                abstractC17836M41689.mo7481(((C16239) c14769.f48335).f26659.f73596);
                c14769 = c14769.f48336;
            }
        }
        C3168 c3169 = c3168.f10278;
        C3168 c3168M10350 = c3169.m10350(c7926, ((C7768) c3169.f10272).m21146(abstractC17836M41689));
        c3168M10350.f10276 = true;
        c3168M10350.f10278 = c3169;
        ((C7768) c3168M10350.f10272).f25560 = false;
        return c3168M10350;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24577(C3168 c3168, C3168 c3169) {
        AbstractC22664 abstractC22664M1941;
        AbstractC22664 c7839;
        AbstractC22295 abstractC22295;
        C7926 c7926 = c3168.f10279;
        C24550 c24550 = c7926.f26345;
        C10510 c10510 = (C10510) c24550.f38067;
        AbstractC22295 abstractC22296 = c7926.f26348;
        C18499 c18499 = null;
        C17929 c17929 = this.f30324;
        if (abstractC22296 != null) {
            AbstractC22295 abstractC22295Mo24576 = mo24576(abstractC22296);
            c7839 = c17929.f58718.m1941(abstractC22295Mo24576, c3169, true, false, true);
            if (c7839 == c17929.f58739.f48245) {
                C7312 c7312 = c17929.f58731;
                AbstractC22970 abstractC22970 = c7839.f73596;
                C11040 c11040 = C22843.f74058;
                c7312.m34520(c7926, new C11040("compiler", "invalid.supertype.record", abstractC22970));
            }
            abstractC22295 = abstractC22295Mo24576;
        } else {
            if ((c7926.f26341.f15825 & 16384) != 0) {
                C0310 c0310 = c17929.f58718;
                int i = c7926.f26658;
                C15714 c15714 = c17929.f58722;
                c15714.f51040 = i;
                abstractC22664M1941 = c0310.m1941((AbstractC22295) c15714.m37560(c17929.f58722.m37574(c17929.f58739.f48309), C14769.of((Object) c17929.f58722.m37557(c24550.f38067))), c3169, true, false, false);
            } else if (c24550.f79577 == c17929.f58729.f49838) {
                abstractC22664M1941 = AbstractC22664.f73590;
            } else {
                abstractC22664M1941 = c24550.m54827() ? c17929.f58739.f48245 : c17929.f58739.f48286;
            }
            c7839 = abstractC22664M1941;
            abstractC22295 = null;
        }
        if (c7839.m51067(EnumC21172.ERROR)) {
            c7839 = new C7839(this, c7839.mo31584(), c7839.f73596, c3169, false, abstractC22295);
        }
        c10510.f33442 = c7839;
        C18499 c184910 = new C18499();
        Iterator it = c7926.f26347.iterator();
        while (it.hasNext()) {
            AbstractC22295 abstractC22295Mo24577 = mo24576((AbstractC22295) it.next());
            AbstractC22664 abstractC22664M1942 = c17929.f58718.m1941(abstractC22295Mo24577, c3169, false, true, true);
            if (!abstractC22664M1942.m51067(EnumC21172.CLASS)) {
                if (c18499 == null) {
                    c18499 = new C18499();
                    c18499.m43091(c184910);
                }
                if (abstractC22664M1942.m51067(EnumC21172.ERROR)) {
                    abstractC22664M1942 = new C7839(this, abstractC22664M1942.mo31584(), abstractC22664M1942.f73596, c3169, true, abstractC22295Mo24577);
                }
                c18499.m43089(abstractC22664M1942);
            } else {
                c184910.m43089(abstractC22664M1942);
                if (c18499 != null) {
                    c18499.m43089(abstractC22664M1942);
                }
            }
        }
        C18499 c184911 = new C18499();
        Iterator it2 = c7926.f26342.iterator();
        while (it2.hasNext()) {
            c184911.m43089(c17929.f58718.m1941((AbstractC22295) it2.next(), c3169, false, false, false).f73596);
        }
        if ((c24550.f38071 & 8192) != 0) {
            C14769 c14769Of = C14769.of((Object) c17929.f58739.f48311);
            c10510.f33437 = c14769Of;
            c10510.f33436 = c14769Of;
        } else {
            C14769 c14769M43093 = c184910.m43093();
            c10510.f33437 = c14769M43093;
            if (c18499 != null) {
                c14769M43093 = c18499.m43093();
            }
            c10510.f33436 = c14769M43093;
        }
        if (!c184911.isEmpty()) {
            c24550.f79583 = c184911.m43093();
        }
        c24550.f79581 = true ^ c184911.isEmpty();
    }
}
