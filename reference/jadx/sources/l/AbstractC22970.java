package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22970 extends AbstractC11781 {
    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean mo51844() {
        return false;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC12753 mo16951() {
        return this.f38069;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ᩹ */
    public AbstractC19728 mo9563() {
        return this.f38072;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۧ */
    public /* bridge */ /* synthetic */ C14769 mo16957() {
        return super.mo16957();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC19728 m51843(AbstractC19728 abstractC19728, AbstractC11781 abstractC11781) {
        if (abstractC11781 == null) {
            return abstractC19728;
        }
        EnumC13603 enumC13603 = abstractC11781.f38066;
        if (enumC13603 != EnumC13603.f43208) {
            if (enumC13603.m33349(C22114.f71276)) {
                return abstractC19728;
            }
            if (abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781.f38067.m51067(EnumC21172.TYPEVAR)) {
                return abstractC19728;
            }
        }
        AbstractC19728 abstractC19728Mo29582 = abstractC11781.mo29582();
        return (abstractC19728Mo29582 == null || abstractC19728Mo29582 == abstractC19728Mo29582.f63499.f73707.f49799) ? abstractC19728 : abstractC19728Mo29582.m45428('.', abstractC19728);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC19728 m51842(AbstractC19728 abstractC19728, AbstractC11781 abstractC11781) {
        if (abstractC11781 == null || abstractC11781.f38066.m33349(C22114.f71276)) {
            return abstractC19728;
        }
        EnumC13603 enumC13603 = abstractC11781.f38066;
        EnumC13603 enumC13604 = EnumC13603.f43213;
        if (enumC13603 == enumC13604 && abstractC11781.f38067.m51067(EnumC21172.TYPEVAR)) {
            return abstractC19728;
        }
        char c = abstractC11781.f38066 == enumC13604 ? '$' : '.';
        AbstractC19728 abstractC19728Mo29575 = abstractC11781.mo29575();
        return (abstractC19728Mo29575 == null || abstractC19728Mo29575 == abstractC19728Mo29575.f63499.f73707.f49799) ? abstractC19728 : abstractC19728Mo29575.m45428(c, abstractC19728);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51846(AbstractC22970 abstractC22970, C24705 c24705) {
        if (this == abstractC22970) {
            return false;
        }
        if (this.f38067.m51067(abstractC22970.f38067.mo9097())) {
            if (this.f38067.m51067(EnumC21172.CLASS)) {
                if (c24705.m55172(abstractC22970.f38067) >= c24705.m55172(this.f38067)) {
                    if (c24705.m55172(abstractC22970.f38067) != c24705.m55172(this.f38067)) {
                        return false;
                    }
                    AbstractC19728 abstractC19728Mo29582 = abstractC22970.mo29582();
                    AbstractC19728 abstractC19728Mo29583 = mo29582();
                    abstractC19728Mo29582.getClass();
                    if (abstractC19728Mo29583.mo42396() - abstractC19728Mo29582.mo42396() >= 0) {
                        return false;
                    }
                }
                return true;
            }
            if (this.f38067.m51067(EnumC21172.TYPEVAR)) {
                return c24705.m55131(this.f38067, abstractC22970.f38067, true);
            }
        }
        return this.f38067.m51067(EnumC21172.TYPEVAR);
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ܽ */
    public C14769 mo9561() {
        C14769 c14769M35543 = C14769.m35543();
        if (this.f38066 == EnumC13603.f43213 && this.f38067.m51067(EnumC21172.TYPEVAR)) {
            return c14769M35543;
        }
        m29583();
        for (AbstractC11781 abstractC11781 : mo29571().mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            abstractC11781.m29583();
            if ((abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && abstractC11781.f38069 == this && abstractC11781.f38066 != EnumC13603.f43208) {
                c14769M35543 = c14769M35543.m35552(abstractC11781);
            }
        }
        return c14769M35543;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C19723 mo51845() {
        C11972.m30024("Only on ClassSymbol");
        throw null;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙ */
    public Object mo16953(InterfaceC2087 interfaceC2087, Locale locale) {
        return interfaceC2087.mo7182(this, (Object) locale);
    }
}
