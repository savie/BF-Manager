package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0618 extends AbstractC23903 {
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo2877() {
        return false;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC14625 mo2880() {
        return this.f77448;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC11242 mo2883() {
        return this.f77453;
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public /* bridge */ /* synthetic */ C21825 mo2878() {
        return super.mo2878();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m2876(AbstractC11242 abstractC11242, AbstractC23903 abstractC23903) {
        if (abstractC23903 == null) {
            return abstractC11242;
        }
        EnumC10477 enumC10477 = abstractC23903.f77452;
        if (enumC10477 != EnumC10477.f35866) {
            if (enumC10477.m26580(C21059.f68591)) {
                return abstractC11242;
            }
            if (abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903.f77449.m39001(EnumC6617.TYPEVAR)) {
                return abstractC11242;
            }
        }
        AbstractC11242 abstractC11242Mo20270 = abstractC23903.mo20270();
        return (abstractC11242Mo20270 == null || abstractC11242Mo20270 == abstractC11242Mo20270.f38032.f21322.f77594) ? abstractC11242 : abstractC11242Mo20270.m28209('.', abstractC11242);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11242 m2875(AbstractC11242 abstractC11242, AbstractC23903 abstractC23903) {
        if (abstractC23903 == null || abstractC23903.f77452.m26580(C21059.f68591)) {
            return abstractC11242;
        }
        EnumC10477 enumC10477 = abstractC23903.f77452;
        EnumC10477 enumC10478 = EnumC10477.f35865;
        if (enumC10477 == enumC10478 && abstractC23903.f77449.m39001(EnumC6617.TYPEVAR)) {
            return abstractC11242;
        }
        char c = abstractC23903.f77452 == enumC10478 ? '$' : '.';
        AbstractC11242 abstractC11242Mo50003 = abstractC23903.mo50003();
        return (abstractC11242Mo50003 == null || abstractC11242Mo50003 == abstractC11242Mo50003.f38032.f21322.f77594) ? abstractC11242 : abstractC11242Mo50003.m28209(c, abstractC11242);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m2881(AbstractC0618 abstractC0618, C23800 c23800) {
        if (this == abstractC0618) {
            return false;
        }
        if (this.f77449.m39001(abstractC0618.f77449.mo1933())) {
            if (this.f77449.m39001(EnumC6617.CLASS)) {
                if (c23800.m52403(abstractC0618.f77449) >= c23800.m52403(this.f77449)) {
                    if (c23800.m52403(abstractC0618.f77449) != c23800.m52403(this.f77449)) {
                        return false;
                    }
                    AbstractC11242 abstractC11242Mo20270 = abstractC0618.mo20270();
                    AbstractC11242 abstractC11242Mo20271 = mo20270();
                    abstractC11242Mo20270.getClass();
                    if (abstractC11242Mo20271.mo28215() - abstractC11242Mo20270.mo28215() >= 0) {
                        return false;
                    }
                }
                return true;
            }
            if (this.f77449.m39001(EnumC6617.TYPEVAR)) {
                return c23800.m52413(this.f77449, abstractC0618.f77449, true);
            }
        }
        return this.f77449.m39001(EnumC6617.TYPEVAR);
    }

    @Override // l.AbstractC23903, l.InterfaceC14625
    /* JADX INFO: renamed from: ܶ */
    public C21825 mo2882() {
        C21825 c21825M48588 = C21825.m48588();
        if (this.f77452 == EnumC10477.f35865 && this.f77449.m39001(EnumC6617.TYPEVAR)) {
            return c21825M48588;
        }
        m52718();
        for (AbstractC23903 abstractC23903 : mo20272().mo3802((Predicate) null, EnumC10167.NON_RECURSIVE)) {
            abstractC23903.m52718();
            if ((abstractC23903.mo20276() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && abstractC23903.f77448 == this && abstractC23903.f77452 != EnumC10477.f35866) {
                c21825M48588 = c21825M48588.m48597(abstractC23903);
            }
        }
        return c21825M48588;
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C16163 mo2884() {
        C6171.m17174("Only on ClassSymbol");
        throw null;
    }

    @Override // l.AbstractC23903
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo2879(InterfaceC11203 interfaceC11203, Locale locale) {
        return interfaceC11203.mo24872(this, (Object) locale);
    }
}
