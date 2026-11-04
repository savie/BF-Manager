package l;

import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* JADX INFO: renamed from: l.ۧܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11781 extends AbstractC25384 implements InterfaceC13564, InterfaceC12753 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC13603 f38066;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f38067;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C25208 f38068;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC11781 f38069;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f38071;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f38072;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC14852 f38070 = InterfaceC14852.f48554;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f38073 = null;

    /* JADX INFO: renamed from: ۙ */
    public Object mo2971(C24705 c24705) {
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo26689(AbstractC11781 abstractC11781, AbstractC22970 abstractC22970, C24705 c24705, boolean z) {
        return false;
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17836 mo29571() {
        return null;
    }

    /* JADX INFO: renamed from: ۟ */
    public boolean mo7873() {
        return true;
    }

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC11781 mo10410() {
        return this;
    }

    public AbstractC11781(EnumC13603 enumC13603, long j, AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781) {
        this.f38066 = enumC13603;
        this.f38071 = j;
        this.f38067 = abstractC22664;
        this.f38069 = abstractC11781;
        this.f38072 = abstractC19728;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long mo29591() {
        return this.f38071;
    }

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C14769 mo29568() {
        C25208 c25208 = this.f38068;
        if (c25208 == null) {
            return C14769.m35543();
        }
        return c25208.m56203();
    }

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C14769 mo29597() {
        C25208 c25208 = this.f38068;
        if (c25208 == null) {
            return C14769.m35543();
        }
        return c25208.m56205();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23892 m29565(AbstractC11781 abstractC11781) {
        for (C23892 c23892 : mo29568()) {
            if (c23892.f69124.f73596 == abstractC11781) {
                return c23892;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m29563() {
        C25208 c25208 = this.f38068;
        if (c25208 == null) {
            return false;
        }
        return c25208.m56198();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29566(C14769 c14769) {
        if (c14769.m35550()) {
            m29557().m56190(c14769);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29595(C14769 c14769) {
        if (c14769.m35550()) {
            m29557().m56204(c14769);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29578(C14769 c14769) {
        if (c14769.m35550()) {
            m29557().m56196(c14769);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m29599(C14769 c14769) {
        if (c14769.m35550()) {
            m29557().m56206(c14769);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C14769 m29574() {
        C25208 c25208 = this.f38068;
        if (c25208 == null) {
            return C14769.m35543();
        }
        return c25208.m56189();
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C14769 m29573() {
        C25208 c25208 = this.f38068;
        if (c25208 == null) {
            return C14769.m35543();
        }
        return c25208.m56195();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m29580(C14769 c14769) {
        m29557().m56197(c14769);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m29592(C14769 c14769) {
        m29557().m56201(c14769);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14769 m29561() {
        C25208 c25208 = this.f38068;
        if (c25208 == null) {
            return C14769.m35543();
        }
        return c25208.m56203();
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29593() {
        C25208 c25208 = this.f38068;
        return (c25208 == null || c25208.m56202()) ? false : true;
    }

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29581() {
        C25208 c25208 = this.f38068;
        return (c25208 == null || c25208.m56200()) ? false : true;
    }

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final void m29584() {
        m29557().m56193();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29577(AbstractC11781 abstractC11781) {
        if (this.f38068 == null && abstractC11781.f38068 == null) {
            return;
        }
        m29557().m56192(abstractC11781.f38068);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m29585(C14769 c14769) {
        if (this.f38068 != null || c14769.m35550()) {
            m29557().m56199(c14769);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29569(C14769 c14769) {
        if (this.f38068 != null || c14769.m35550()) {
            if (this.f38068 == null) {
                this.f38068 = new C25208(this);
            }
            this.f38068.m56194(c14769);
        }
    }

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    private C25208 m29557() {
        if (this.f38068 == null) {
            this.f38068 = new C25208(this);
        }
        return this.f38068;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C25208 m29572() {
        return this.f38068;
    }

    /* JADX INFO: renamed from: ܶ */
    public int mo2973() {
        throw new AssertionError("Invalid pool entry");
    }

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC11781 mo16960(AbstractC11781 abstractC11781) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ */
    public Object mo16953(InterfaceC2087 interfaceC2087, Locale locale) {
        return interfaceC2087.mo7180(this, locale);
    }

    public String toString() {
        return this.f38072.toString();
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 m29579() {
        EnumC13603 enumC13603;
        AbstractC19728 abstractC19728 = this.f38069.f38072;
        if (abstractC19728 == null) {
            return null;
        }
        if (!abstractC19728.isEmpty() || (this.f38069.mo29591() & 1048576) != 0 || (enumC13603 = this.f38069.f38066) == EnumC13603.f43219 || enumC13603 == EnumC13603.f43213) {
            return this.f38069;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC11781 m29594(AbstractC22664 abstractC22664, C24705 c24705) {
        AbstractC22664 abstractC22664M55101;
        AbstractC19728 abstractC19728 = this.f38069.f38072;
        if (abstractC19728 == null || abstractC19728.isEmpty()) {
            return m29579();
        }
        if (this.f38069.f38067.m51067(EnumC21172.CLASS) && (abstractC22664M55101 = c24705.m55101(this.f38069, abstractC22664)) != null) {
            return abstractC22664M55101.f73596;
        }
        return this.f38069;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 mo29576(C24705 c24705) {
        if (this.f38073 == null) {
            this.f38073 = c24705.m55132(this.f38067);
        }
        return this.f38073;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 m29598(C24705 c24705) {
        AbstractC22664 abstractC22664Mo29576 = mo29576(c24705);
        AbstractC19728 abstractC19728 = this.f38072;
        if (abstractC19728 != abstractC19728.f63499.f73707.f49865 || !this.f38069.m29586()) {
            return abstractC22664Mo29576;
        }
        return new C23191(abstractC22664Mo29576.mo50621().m35552(c24705.m55132(this.f38069.f38067.mo23449())), abstractC22664Mo29576.mo31585(), abstractC22664Mo29576.mo50622(), abstractC22664Mo29576.f73596);
    }

    /* JADX INFO: renamed from: ۧۙ */
    public boolean mo9560() {
        return (this.f38071 & 131072) != 0;
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29560() {
        int i = C12615.f40477[mo9558().ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? false : true;
    }

    /* JADX INFO: renamed from: ᩵ۙ */
    public boolean mo7874() {
        if ((mo29591() & 8) != 0) {
            return true;
        }
        if ((this.f38069.mo29591() & 512) == 0 || this.f38066 == EnumC13603.f43218) {
            return false;
        }
        AbstractC19728 abstractC19728 = this.f38072;
        return abstractC19728 != abstractC19728.f63499.f73707.f49836;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29587() {
        return (mo29591() & 512) != 0;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29601() {
        return (this.f38071 & 7) == 1;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29588() {
        return (mo29591() & 16384) != 0;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29562() {
        return (this.f38071 & SkeinEngine.UbiTweak.T1_FIRST) != 0;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29602() {
        if (this.f38069.f38066.m33349(C22114.f71276)) {
            return true;
        }
        AbstractC11781 abstractC11781 = this.f38069;
        return abstractC11781.f38066 == EnumC13603.f43213 && abstractC11781.m29602();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29570() {
        AbstractC19728 abstractC19728 = this.f38072;
        return abstractC19728 == abstractC19728.f63499.f73707.f49865;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC19728 mo29582() {
        return this.f38072;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC19728 mo29575() {
        return mo29582();
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29589() {
        return this.f38066 == EnumC13603.f43213 && this.f38067.mo23449().m51067(EnumC21172.CLASS);
    }

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29586() {
        return this.f38067.mo23449().m51067(EnumC21172.CLASS) && (mo29591() & 4194816) == 0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24550 m29558() {
        AbstractC11781 abstractC11781 = this;
        while (abstractC11781 != null && (!abstractC11781.f38066.m33349(C22114.f71269) || !abstractC11781.f38067.m51067(EnumC21172.CLASS))) {
            abstractC11781 = abstractC11781.f38069;
        }
        return (C24550) abstractC11781;
    }

    /* JADX INFO: renamed from: ᩺ۙ */
    public C24550 mo9564() {
        AbstractC11781 abstractC11781 = null;
        for (AbstractC11781 abstractC11782 = this; abstractC11782.f38066 != EnumC13603.f43219; abstractC11782 = abstractC11782.f38069) {
            abstractC11781 = abstractC11782;
        }
        return (C24550) abstractC11781;
    }

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final C14106 m29564() {
        AbstractC11781 abstractC11781 = this;
        while (abstractC11781.f38066 != EnumC13603.f43219) {
            abstractC11781 = abstractC11781.f38069;
        }
        return (C14106) abstractC11781;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo29596(AbstractC11781 abstractC11781, C24705 c24705) {
        throw new AssertionError("isSubClass " + this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29567(AbstractC22970 abstractC22970, C24705 c24705) {
        AbstractC11781 abstractC11781 = this.f38069;
        if (abstractC11781 != abstractC22970) {
            if (abstractC22970.mo29596(abstractC11781, c24705) && mo26690((AbstractC11781) abstractC22970, c24705)) {
                AbstractC11781 abstractC11781M29556 = m29556((C24550) abstractC22970, c24705);
                C11972.m30025("the result of hiddenInInternal() can't be null", abstractC11781M29556 != null);
                if (abstractC11781M29556 != this) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC11781 m29556(C24550 c24550, C24705 c24705) {
        if (c24550 != this.f38069) {
            for (AbstractC11781 abstractC11781 : c24550.mo29571().m38842(this.f38072)) {
                EnumC13603 enumC13603 = abstractC11781.f38066;
                EnumC13603 enumC13604 = this.f38066;
                if (enumC13603 == enumC13604 && (enumC13604 != EnumC13603.f43218 || ((abstractC11781.mo29591() & 8) != 0 && c24705.m55165(abstractC11781.f38067, this.f38067, true)))) {
                    return abstractC11781;
                }
            }
            AbstractC11781 abstractC11782 = null;
            for (AbstractC22664 abstractC22664 : c24705.m55144(c24550.f38067).m35552(c24705.m55137(c24550.f38067))) {
                if (abstractC22664 != null && abstractC22664.m51067(EnumC21172.CLASS)) {
                    AbstractC11781 abstractC11781M29556 = m29556((C24550) abstractC22664.f73596, c24705);
                    if (abstractC11781M29556 != this) {
                        if (abstractC11781M29556 != null) {
                            abstractC11782 = abstractC11781M29556;
                        }
                    }
                }
            }
            return abstractC11782;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo26690(AbstractC11781 abstractC11781, C24705 c24705) {
        int i = (int) (this.f38071 & 7);
        if (i != 0) {
            if (i != 2) {
                return i != 4 || (abstractC11781.mo29591() & 512) == 0;
            }
            return this.f38069 == abstractC11781;
        }
        C14106 c14106M29564 = m29564();
        AbstractC11781 abstractC11782 = abstractC11781;
        while (abstractC11782 != null && abstractC11782 != this.f38069) {
            while (abstractC11782.f38067.m51067(EnumC21172.TYPEVAR)) {
                abstractC11782 = abstractC11782.f38067.mo19992().f73596;
            }
            if (abstractC11782.f38067.mo9329()) {
                return true;
            }
            if ((abstractC11782.mo29591() & 16777216) == 0 && abstractC11782.m29564() != c14106M29564) {
                return false;
            }
            abstractC11782 = c24705.m55137(abstractC11782.f38067).f73596;
        }
        return (abstractC11781.mo29591() & 512) == 0;
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC11781 mo16954(AbstractC22664 abstractC22664, C24705 c24705) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo29590() {
        InterfaceC14852 interfaceC14852 = this.f38070;
        InterfaceC14852 interfaceC14853 = InterfaceC14852.f48554;
        if (interfaceC14852 != interfaceC14853) {
            this.f38070 = interfaceC14853;
            interfaceC14852.mo11629(this);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29583() {
        try {
            mo29590();
        } catch (C21566 e) {
            e.f68882.m10347(e);
        }
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ֫ */
    public AbstractC11781 mo16951() {
        return this.f38069;
    }

    /* JADX INFO: renamed from: ۙ */
    public EnumC5296 mo9558() {
        return EnumC5296.OTHER;
    }

    /* JADX INFO: renamed from: ܳ */
    public Set mo26692() {
        m29583();
        return C2417.m8160(mo29591());
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۤۙ, reason: merged with bridge method [inline-methods] */
    public AbstractC19728 mo9563() {
        return this.f38072;
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public C14769 mo16957() {
        m29583();
        return mo29568();
    }

    /* JADX INFO: renamed from: ܽ */
    public List mo9561() {
        return C14769.m35543();
    }

    @Override // l.InterfaceC1567, l.InterfaceC12007
    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C14769 mo5575() {
        C18499 c18499 = new C18499();
        for (AbstractC22664 abstractC22664 : this.f38067.mo15882()) {
            C11972.m30026(abstractC22664.f73596.mo9558() == EnumC5296.TYPE_PARAMETER);
            c18499.m43089((C19986) abstractC22664.f73596);
        }
        return c18499.m43093();
    }
}
