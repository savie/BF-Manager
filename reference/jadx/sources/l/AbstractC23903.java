package l;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* JADX INFO: renamed from: l.᩻᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23903 extends AbstractC9855 implements InterfaceC15767, InterfaceC14625 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f77447;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 f77448;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f77449;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14731 f77450;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC10477 f77452;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC11242 f77453;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC13320 f77451 = InterfaceC13320.f44208;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f77454 = null;

    /* JADX INFO: renamed from: ۙ */
    public Object mo18742(C23800 c23800) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo42453(AbstractC23903 abstractC23903, AbstractC0618 abstractC0618, C23800 c23800, boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: ۤۙ */
    public AbstractC9462 mo20272() {
        return null;
    }

    /* JADX INFO: renamed from: ۫ */
    public boolean mo20273() {
        return true;
    }

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC23903 mo10880() {
        return this;
    }

    public AbstractC23903(EnumC10477 enumC10477, long j, AbstractC11242 abstractC11242, AbstractC16579 abstractC16579, AbstractC23903 abstractC23903) {
        this.f77452 = enumC10477;
        this.f77447 = j;
        this.f77449 = abstractC16579;
        this.f77448 = abstractC23903;
        this.f77453 = abstractC11242;
    }

    /* JADX INFO: renamed from: ܿ */
    public long mo20276() {
        return this.f77447;
    }

    /* JADX INFO: renamed from: ۙۙ */
    public C21825 mo20271() {
        C14731 c14731 = this.f77450;
        if (c14731 == null) {
            return C21825.m48588();
        }
        return c14731.m35289();
    }

    /* JADX INFO: renamed from: ܰۙ */
    public C21825 mo50009() {
        C14731 c14731 = this.f77450;
        if (c14731 == null) {
            return C21825.m48588();
        }
        return c14731.m35277();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11867 m52702(AbstractC23903 abstractC23903) {
        for (C11867 c11867 : mo20271()) {
            if (c11867.f75167.f53222 == abstractC23903) {
                return c11867;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m52723() {
        C14731 c14731 = this.f77450;
        if (c14731 == null) {
            return false;
        }
        return c14731.m35276();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52703(C21825 c21825) {
        if (c21825.m48595()) {
            m52694().m35282(c21825);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52715(C21825 c21825) {
        if (c21825.m48595()) {
            m52694().m35290(c21825);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m52710(C21825 c21825) {
        if (c21825.m48595()) {
            m52694().m35286(c21825);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m52699(C21825 c21825) {
        if (c21825.m48595()) {
            m52694().m35278(c21825);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21825 m52729() {
        C14731 c14731 = this.f77450;
        if (c14731 == null) {
            return C21825.m48588();
        }
        return c14731.m35279();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21825 m52697() {
        C14731 c14731 = this.f77450;
        if (c14731 == null) {
            return C21825.m48588();
        }
        return c14731.m35285();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m52695(C21825 c21825) {
        m52694().m35275(c21825);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m52705(C21825 c21825) {
        m52694().m35283(c21825);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21825 m52716() {
        C14731 c14731 = this.f77450;
        if (c14731 == null) {
            return C21825.m48588();
        }
        return c14731.m35289();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52706() {
        C14731 c14731 = this.f77450;
        return (c14731 == null || c14731.m35284()) ? false : true;
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52696() {
        C14731 c14731 = this.f77450;
        return (c14731 == null || c14731.m35292()) ? false : true;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final void m52719() {
        m52694().m35287();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m52711(AbstractC23903 abstractC23903) {
        if (this.f77450 == null && abstractC23903.f77450 == null) {
            return;
        }
        m52694().m35281(abstractC23903.f77450);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m52726(C21825 c21825) {
        if (this.f77450 != null || c21825.m48595()) {
            m52694().m35291(c21825);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m52712(C21825 c21825) {
        if (this.f77450 != null || c21825.m48595()) {
            if (this.f77450 == null) {
                this.f77450 = new C14731(this);
            }
            this.f77450.m35288(c21825);
        }
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    private C14731 m52694() {
        if (this.f77450 == null) {
            this.f77450 = new C14731(this);
        }
        return this.f77450;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C14731 m52709() {
        return this.f77450;
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo1941() {
        throw new AssertionError("Invalid pool entry");
    }

    /* JADX INFO: renamed from: ܰ */
    public AbstractC23903 mo17330(AbstractC23903 abstractC23903) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ */
    public Object mo2879(InterfaceC11203 interfaceC11203, Locale locale) {
        return interfaceC11203.mo4414(this, locale);
    }

    public String toString() {
        return this.f77453.toString();
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m52708() {
        EnumC10477 enumC10477;
        AbstractC11242 abstractC11242 = this.f77448.f77453;
        if (abstractC11242 == null) {
            return null;
        }
        if (!abstractC11242.isEmpty() || (this.f77448.mo20276() & 1048576) != 0 || (enumC10477 = this.f77448.f77452) == EnumC10477.f35867 || enumC10477 == EnumC10477.f35865) {
            return this.f77448;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23903 m52714(AbstractC16579 abstractC16579, C23800 c23800) {
        AbstractC16579 abstractC16579M52372;
        AbstractC11242 abstractC11242 = this.f77448.f77453;
        if (abstractC11242 == null || abstractC11242.isEmpty()) {
            return m52708();
        }
        if (this.f77448.f77449.m39001(EnumC6617.CLASS) && (abstractC16579M52372 = c23800.m52372(this.f77448, abstractC16579)) != null) {
            return abstractC16579M52372.f53222;
        }
        return this.f77448;
    }

    /* JADX INFO: renamed from: ۨ */
    public AbstractC16579 mo50006(C23800 c23800) {
        if (this.f77454 == null) {
            this.f77454 = c23800.m52402(this.f77449);
        }
        return this.f77454;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC16579 m52698(C23800 c23800) {
        AbstractC16579 abstractC16579Mo50006 = mo50006(c23800);
        AbstractC11242 abstractC11242 = this.f77453;
        if (abstractC11242 != abstractC11242.f38032.f21322.f77632 || !this.f77448.m52727()) {
            return abstractC16579Mo50006;
        }
        return new C13757(abstractC16579Mo50006.mo33523().m48597(c23800.m52402(this.f77448.f77449.mo1934())), abstractC16579Mo50006.mo16235(), abstractC16579Mo50006.mo33524(), abstractC16579Mo50006.f53222);
    }

    /* JADX INFO: renamed from: ۜۙ */
    public boolean mo44803() {
        return (this.f77447 & 131072) != 0;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52701() {
        int i = C2735.f10512[mo17325().ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? false : true;
    }

    /* JADX INFO: renamed from: ᩵ۙ */
    public boolean mo22992() {
        if ((mo20276() & 8) != 0) {
            return true;
        }
        if ((this.f77448.mo20276() & 512) == 0 || this.f77452 == EnumC10477.f35879) {
            return false;
        }
        AbstractC11242 abstractC11242 = this.f77453;
        return abstractC11242 != abstractC11242.f38032.f21322.f77533;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52721() {
        return (mo20276() & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52722() {
        return (this.f77447 & 7) == 1;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52717() {
        return (mo20276() & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52707() {
        return (this.f77447 & SkeinEngine.UbiTweak.T1_FIRST) != 0;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52728() {
        if (this.f77448.f77452.m26580(C21059.f68591)) {
            return true;
        }
        AbstractC23903 abstractC23903 = this.f77448;
        return abstractC23903.f77452 == EnumC10477.f35865 && abstractC23903.m52728();
    }

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52713() {
        AbstractC11242 abstractC11242 = this.f77453;
        return abstractC11242 == abstractC11242.f38032.f21322.f77632;
    }

    /* JADX INFO: renamed from: ۗ */
    public AbstractC11242 mo20270() {
        return this.f77453;
    }

    /* JADX INFO: renamed from: ۛ */
    public AbstractC11242 mo50003() {
        return mo20270();
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52725() {
        return this.f77452 == EnumC10477.f35865 && this.f77449.mo1934().m39001(EnumC6617.CLASS);
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52727() {
        return this.f77449.mo1934().m39001(EnumC6617.CLASS) && (mo20276() & 4194816) == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22492 m52720() {
        AbstractC23903 abstractC23903 = this;
        while (abstractC23903 != null && (!abstractC23903.f77452.m26580(C21059.f68585) || !abstractC23903.f77449.m39001(EnumC6617.CLASS))) {
            abstractC23903 = abstractC23903.f77448;
        }
        return (C22492) abstractC23903;
    }

    /* JADX INFO: renamed from: ۟ۙ */
    public C22492 mo44804() {
        AbstractC23903 abstractC23903 = null;
        for (AbstractC23903 abstractC23904 = this; abstractC23904.f77452 != EnumC10477.f35867; abstractC23904 = abstractC23904.f77448) {
            abstractC23903 = abstractC23904;
        }
        return (C22492) abstractC23903;
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C7675 m52724() {
        AbstractC23903 abstractC23903 = this;
        while (abstractC23903.f77452 != EnumC10477.f35867) {
            abstractC23903 = abstractC23903.f77448;
        }
        return (C7675) abstractC23903;
    }

    /* JADX INFO: renamed from: ܰ */
    public boolean mo50008(AbstractC23903 abstractC23903, C23800 c23800) {
        throw new AssertionError("isSubClass " + this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52704(AbstractC0618 abstractC0618, C23800 c23800) {
        AbstractC23903 abstractC23903 = this.f77448;
        if (abstractC23903 != abstractC0618) {
            if (abstractC0618.mo50008(abstractC23903, c23800) && mo42454((AbstractC23903) abstractC0618, c23800)) {
                AbstractC23903 abstractC23903M52693 = m52693((C22492) abstractC0618, c23800);
                C6171.m17175("the result of hiddenInInternal() can't be null", abstractC23903M52693 != null);
                if (abstractC23903M52693 != this) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC23903 m52693(C22492 c22492, C23800 c23800) {
        if (c22492 != this.f77448) {
            for (AbstractC23903 abstractC23903 : c22492.mo20272().m9327(this.f77453)) {
                EnumC10477 enumC10477 = abstractC23903.f77452;
                EnumC10477 enumC10478 = this.f77452;
                if (enumC10477 == enumC10478 && (enumC10478 != EnumC10477.f35879 || ((abstractC23903.mo20276() & 8) != 0 && c23800.m52429(abstractC23903.f77449, this.f77449, true)))) {
                    return abstractC23903;
                }
            }
            AbstractC23903 abstractC23904 = null;
            for (AbstractC16579 abstractC16579 : c23800.m52439(c22492.f77449).m48597(c23800.m52432(c22492.f77449))) {
                if (abstractC16579 != null && abstractC16579.m39001(EnumC6617.CLASS)) {
                    AbstractC23903 abstractC23903M52693 = m52693((C22492) abstractC16579.f53222, c23800);
                    if (abstractC23903M52693 != this) {
                        if (abstractC23903M52693 != null) {
                            abstractC23904 = abstractC23903M52693;
                        }
                    }
                }
            }
            return abstractC23904;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo42454(AbstractC23903 abstractC23903, C23800 c23800) {
        int i = (int) (this.f77447 & 7);
        if (i != 0) {
            if (i != 2) {
                return i != 4 || (abstractC23903.mo20276() & 512) == 0;
            }
            return this.f77448 == abstractC23903;
        }
        C7675 c7675M52724 = m52724();
        AbstractC23903 abstractC23904 = abstractC23903;
        while (abstractC23904 != null && abstractC23904 != this.f77448) {
            while (abstractC23904.f77449.m39001(EnumC6617.TYPEVAR)) {
                abstractC23904 = abstractC23904.f77449.mo18112().f53222;
            }
            if (abstractC23904.f77449.mo1926()) {
                return true;
            }
            if ((abstractC23904.mo20276() & 16777216) == 0 && abstractC23904.m52724() != c7675M52724) {
                return false;
            }
            abstractC23904 = c23800.m52432(abstractC23904.f77449).f53222;
        }
        return (abstractC23903.mo20276() & 512) == 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC23903 mo17326(AbstractC16579 abstractC16579, C23800 c23800) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֡ */
    public void mo49994() {
        InterfaceC13320 interfaceC13320 = this.f77451;
        InterfaceC13320 interfaceC13321 = InterfaceC13320.f44208;
        if (interfaceC13320 != interfaceC13321) {
            this.f77451 = interfaceC13321;
            interfaceC13320.mo1179(this);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m52718() {
        try {
            mo49994();
        } catch (C4146 e) {
            e.f15169.m13416(e);
        }
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۬ */
    public AbstractC23903 mo2880() {
        return this.f77448;
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumC1923 mo17325() {
        return EnumC1923.OTHER;
    }

    /* JADX INFO: renamed from: ᩹ */
    public Set mo35138() {
        m52718();
        return C8360.m21885(mo20276());
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۨۙ, reason: merged with bridge method [inline-methods] */
    public AbstractC11242 mo2883() {
        return this.f77453;
    }

    @Override // l.InterfaceC14625
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public C21825 mo2878() {
        m52718();
        return mo20271();
    }

    /* JADX INFO: renamed from: ܶ */
    public List mo2882() {
        return C21825.m48588();
    }

    @Override // l.InterfaceC9686, l.InterfaceC13338
    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C21825 mo24652() {
        C19003 c19003 = new C19003();
        for (AbstractC16579 abstractC16579 : this.f77449.mo1938()) {
            C6171.m17176(abstractC16579.f53222.mo17325() == EnumC1923.TYPE_PARAMETER);
            c19003.m43723((C16847) abstractC16579.f53222);
        }
        return c19003.m43726();
    }
}
