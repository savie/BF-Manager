package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes2.dex */
public final class C24550 extends AbstractC22970 implements InterfaceC3804 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f79575;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public AbstractC17836 f79576;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f79577;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC19728 f79578;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C19723 f79579;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public C14769 f79580;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f79581;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C14769 f79582;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C14769 f79583;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC15976 f79584;

    public C24550(long j, AbstractC19728 abstractC19728, AbstractC22664 abstractC22664, AbstractC11781 abstractC11781) {
        super(EnumC13603.f43213, j, abstractC19728, abstractC22664, abstractC11781);
        this.f79580 = C14769.m35543();
        this.f79581 = false;
        this.f79576 = null;
        this.f79577 = AbstractC22970.m51843(abstractC19728, abstractC11781);
        this.f79578 = AbstractC22970.m51842(abstractC19728, abstractC11781);
        this.f79584 = null;
        this.f79575 = null;
        this.f79579 = C19723.m45415();
        this.f79583 = C14769.m35543();
    }

    public C24550(long j, AbstractC19728 abstractC19728, AbstractC11781 abstractC11781) {
        this(j, abstractC19728, new C10510(null, AbstractC22664.f73590, null), abstractC11781);
        this.f38067.f73596 = this;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩳ */
    public final long mo29591() {
        mo29590();
        return this.f38071;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۛۙ */
    public final AbstractC17836 mo29571() {
        mo29590();
        return this.f79576;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۙۙ */
    public final C14769 mo29568() {
        mo29590();
        return super.mo29568();
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩷ۙ */
    public final C14769 mo29597() {
        mo29590();
        return super.mo29597();
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۤ */
    public final AbstractC22664 mo29576(C24705 c24705) {
        if (this.f38073 == null) {
            this.f38073 = new C10510(c24705.m55132(this.f38067.mo23449()), C14769.m35543(), this, this.f38067.f73595);
        }
        return this.f38073;
    }

    @Override // l.AbstractC11781
    public final String toString() {
        if (this.f38072.isEmpty()) {
            return C7312.m20030("anonymous.class", this.f79578);
        }
        return this.f79577.toString();
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۬ */
    public final AbstractC19728 mo29582() {
        return this.f79577;
    }

    @Override // l.InterfaceC3804, l.InterfaceC6042
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC19728 mo9562() {
        return this.f79577;
    }

    @Override // l.AbstractC22970, l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ܽ */
    public final C14769 mo9561() {
        C14769 c14769Mo9561 = super.mo9561();
        if (!this.f79580.isEmpty()) {
            Iterator it = this.f79580.m35554().iterator();
            while (it.hasNext()) {
                c14769Mo9561 = c14769Mo9561.m35552((C22224) it.next());
            }
        }
        return c14769Mo9561;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ۢ */
    public final AbstractC19728 mo29575() {
        return this.f79578;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo29596(AbstractC11781 abstractC11781, C24705 c24705) {
        if (this == abstractC11781) {
            return true;
        }
        if ((abstractC11781.mo29591() & 512) != 0) {
            AbstractC22664 abstractC22664M55137 = this.f38067;
            while (abstractC22664M55137.m51067(EnumC21172.CLASS)) {
                for (C14769 c14769M55144 = c24705.m55144(abstractC22664M55137); c14769M55144.m35550(); c14769M55144 = c14769M55144.f48336) {
                    if (((AbstractC22664) c14769M55144.f48335).f73596.mo29596(abstractC11781, c24705)) {
                        return true;
                    }
                }
                abstractC22664M55137 = c24705.m55137(abstractC22664M55137);
            }
            return false;
        }
        AbstractC22664 abstractC22664M55138 = this.f38067;
        while (abstractC22664M55138.m51067(EnumC21172.CLASS)) {
            if (abstractC22664M55138.f73596 == abstractC11781) {
                return true;
            }
            abstractC22664M55138 = c24705.m55137(abstractC22664M55138);
        }
        return false;
    }

    @Override // l.AbstractC11781
    /* JADX INFO: renamed from: ܿ */
    public final void mo29590() {
        InterfaceC14852 interfaceC14852 = this.f38070;
        try {
            super.mo29590();
        } catch (C21566 e) {
            e.f68882.m10349(this, interfaceC14852);
            this.f38071 |= 9;
            this.f38067 = new C12748(this, AbstractC22664.f73590);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m54832() {
        m29583();
        AbstractC22664 abstractC22664 = this.f38067;
        if (abstractC22664 instanceof C10510) {
            C10510 c10510 = (C10510) abstractC22664;
            if (c10510.f33437 == null) {
                c10510.f33437 = C14769.m35543();
            }
            C14769 c14769 = c10510.f33436;
            if (c14769 != null) {
                C18499 c18499 = new C18499();
                Iterator it = c14769.iterator();
                while (it.hasNext()) {
                    c18499.m43089(((AbstractC22664) it.next()).mo21362());
                }
                return c18499.m43093();
            }
            return c10510.f33437;
        }
        return C14769.m35543();
    }

    @Override // l.InterfaceC3804
    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC22664 mo12339() {
        m29583();
        AbstractC22664 abstractC22664 = this.f38067;
        if (abstractC22664 instanceof C10510) {
            C10510 c10510 = (C10510) abstractC22664;
            if (c10510.f33442 == null) {
                c10510.f33442 = AbstractC22664.f73590;
            }
            if (c10510.mo31586()) {
                return AbstractC22664.f73590;
            }
            return c10510.f33442.mo21362();
        }
        return AbstractC22664.f73590;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final EnumC5296 mo9558() {
        m29583();
        mo29590();
        long j = this.f38071;
        if ((8192 & j) != 0) {
            return EnumC5296.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC5296.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC5296.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC5296.RECORD;
        }
        return EnumC5296.CLASS;
    }

    @Override // l.AbstractC11781, l.InterfaceC12753
    /* JADX INFO: renamed from: ܳ */
    public final Set mo26692() {
        m29583();
        mo29590();
        return C2417.m8160(this.f38071 & (-8796093022209L));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22224 m54828(C5816 c5816) {
        for (C22224 c22224 : this.f79580) {
            if (c22224.f38072 == c5816.f38072) {
                return c22224;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22224 m54829(C12510 c12510) {
        C22224 c22224 = null;
        for (C22224 c22225 : this.f79580) {
            if (c22225.f38072 == c12510.f40164 && c12510.f26658 == c22225.f71602) {
                c22224 = c22225;
            }
        }
        return c22224;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54831(C22224 c22224, C12510 c12510, C14769 c14769) {
        boolean z;
        if (c22224 != null) {
            C14769 c14769M35541 = C14769.m35541(c22224, this.f79580);
            this.f79580 = c14769M35541;
            this.f79580 = c14769M35541.m35546(new C22224(c12510.f40168, c22224.f71604, c22224.f71600));
            return;
        }
        C14769 c147610 = this.f79580;
        C5816 c5816 = c12510.f40168;
        if (c5816.f38067.m51067(EnumC21172.ARRAY)) {
            C2832 c2832 = (C2832) c5816.f38067;
            c2832.getClass();
            if (c2832 instanceof C9543) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f79580 = c147610.m35546(new C22224(c5816, c14769, z));
    }

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m54825() {
        return this.f79580;
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m54835() {
        return this.f79580;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m54826(C14769 c14769) {
        this.f79580 = c14769;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20212 m54836() {
        m29583();
        if (this.f38069.f38066 == EnumC13603.f43219) {
            return EnumC20212.TOP_LEVEL;
        }
        if (this.f38072.isEmpty()) {
            return EnumC20212.ANONYMOUS;
        }
        if (this.f38069.f38066 == EnumC13603.f43218) {
            return EnumC20212.LOCAL;
        }
        return EnumC20212.MEMBER;
    }

    @Override // l.InterfaceC12753
    /* JADX INFO: renamed from: ۙ */
    public final Object mo7871(AbstractC9024 abstractC9024, Object obj) {
        return abstractC9024.mo8141(this, obj);
    }

    @Override // l.AbstractC22970, l.AbstractC11781
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16953(InterfaceC2087 interfaceC2087, Locale locale) {
        return interfaceC2087.mo7183(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m54837(C24705 c24705) {
        if (c24705.f79936.m37793(this) != null) {
            mo29590();
            if ((this.f38071 & 16384) == 0 || c24705.m55137(this.f38067).f73596 != c24705.f79947.f48309) {
                return;
            }
            mo29590();
            if ((this.f38071 & 1040) != 0 || c24705.m55091(this) == null) {
                return;
            }
            this.f38071 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final void m54833() {
        this.f38066 = EnumC13603.f43213;
        this.f38073 = null;
        this.f79576 = null;
        this.f38071 = 0L;
        AbstractC22664 abstractC22664 = this.f38067;
        if (abstractC22664 instanceof C10510) {
            C10510 c10510 = (C10510) abstractC22664;
            c10510.mo23450(AbstractC22664.f73590);
            c10510.f33439 = -1;
            c10510.f33438 = null;
            c10510.f33441 = null;
            c10510.f33442 = null;
            c10510.f33437 = null;
            c10510.f33436 = null;
        }
        m54824();
    }

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final void m54824() {
        this.f38068 = null;
        this.f79579 = C19723.m45415();
    }

    @Override // l.AbstractC22970
    /* JADX INFO: renamed from: ᩶ۙ */
    public final C19723 mo51845() {
        return this.f79579;
    }

    @Override // l.AbstractC22970
    /* JADX INFO: renamed from: ܿۙ */
    public final boolean mo51844() {
        return (this.f38071 & 8192) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54830(C19723 c19723) {
        C11972.m30026(!this.f79579.m45420());
        this.f79579 = c19723;
    }

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final boolean m54827() {
        return (this.f38071 & 2305843009213693952L) != 0;
    }
}
