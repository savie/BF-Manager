package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15714 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C13477 f51038 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17206 f51039;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f51040;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24705 f51041;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C19113 f51042;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15252 f51043;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14764 f51044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15714 m37502(C4747 c4747) {
        C13477 c13477 = f51038;
        C15714 c15714 = (C15714) c4747.m14643(c13477);
        if (c15714 != null) {
            return c15714;
        }
        C15714 c15715 = new C15714();
        c15715.f51040 = -1;
        c15715.f51039 = new C17206(c15715);
        c4747.m14646(c13477, c15715);
        c15715.f51040 = -1;
        c15715.f51042 = null;
        c15715.f51043 = C15252.m36599(c4747);
        c15715.f51044 = C14764.m35506(c4747);
        c15715.f51041 = C24705.m55066(c4747);
        return c15715;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15714 m37530(C19113 c19113) {
        C15252 c15252 = this.f51043;
        C24705 c24705 = this.f51041;
        C14764 c14764 = this.f51044;
        C15714 c15714 = new C15714();
        c15714.f51039 = new C17206(c15714);
        c15714.f51040 = 0;
        c15714.f51042 = c19113;
        c15714.f51043 = c15252;
        c15714.f51041 = c24705;
        c15714.f51044 = c14764;
        return c15714;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37551(int i) {
        this.f51040 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37552(InterfaceC5075 interfaceC5075) {
        this.f51040 = interfaceC5075 == null ? -1 : interfaceC5075.mo7189();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19113 m37578(C14769 c14769) {
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            AbstractC8036 abstractC8036 = (AbstractC8036) it.next();
            C11972.m30027((abstractC8036 instanceof C7926) || (abstractC8036 instanceof C10360) || (abstractC8036 instanceof C11852) || (abstractC8036 instanceof C14835) || (abstractC8036 instanceof C22953) || (abstractC8036 instanceof C13891) || ((abstractC8036 instanceof C11106) && (((C11106) abstractC8036).f35018 instanceof C13891)), new C11140(1, abstractC8036));
        }
        C19113 c19113 = new C19113();
        c19113.f61853 = null;
        c19113.f61862 = null;
        c19113.f61860 = null;
        c19113.f61857 = c14769;
        c19113.f26658 = this.f51040;
        return c19113;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7926 m37514(C4395 c4395, AbstractC19728 abstractC19728, C14769 c14769, AbstractC22295 abstractC22295, C14769 c147610, C14769 c147611) {
        return m37515(c4395, abstractC19728, c14769, abstractC22295, c147610, C14769.m35543(), c147611);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7926 m37515(C4395 c4395, AbstractC19728 abstractC19728, C14769 c14769, AbstractC22295 abstractC22295, C14769 c147610, C14769 c147611, C14769 c147612) {
        C7926 c7926 = new C7926();
        c7926.f26341 = c4395;
        c7926.f26346 = abstractC19728;
        c7926.f26343 = c14769;
        c7926.f26348 = abstractC22295;
        c7926.f26347 = c147610;
        c7926.f26342 = c147611;
        c7926.f26344 = c147612;
        c7926.f26345 = null;
        c7926.f26658 = this.f51040;
        return c7926;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6633 m37511(C4395 c4395, AbstractC19728 abstractC19728, AbstractC22295 abstractC22295, C14769 c14769, C12510 c12510, C14769 c147610, C14769 c147611, C4197 c4197, AbstractC22295 abstractC22296) {
        C6633 c6633 = new C6633(c4395, abstractC19728, abstractC22295, c14769, c12510, c147610, c147611, c4197, abstractC22296, null);
        c6633.f26658 = this.f51040;
        return c6633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12510 m37520(C4395 c4395, AbstractC19728 abstractC19728, AbstractC22295 abstractC22295, AbstractC22295 abstractC22296) {
        C12510 c12510 = new C12510(c4395, abstractC19728, abstractC22295, abstractC22296, null, false);
        c12510.f26658 = this.f51040;
        return c12510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12510 m37521(C4395 c4395, AbstractC19728 abstractC19728, AbstractC22295 abstractC22295, AbstractC22295 abstractC22296, boolean z) {
        C12510 c12510 = new C12510(c4395, abstractC19728, abstractC22295, abstractC22296, null, z);
        c12510.f26658 = this.f51040;
        return c12510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12510 m37522(C4395 c4395, AbstractC22295 abstractC22295, AbstractC22295 abstractC22296) {
        C12510 c12510 = new C12510(c4395, null, abstractC22296, null, null, false);
        c12510.f40169 = abstractC22295;
        if (abstractC22295.m21911(EnumC21461.f68523)) {
            c12510.f40164 = ((C5887) abstractC22295).f20169;
        } else {
            c12510.f40164 = ((C23041) abstractC22295).f74774;
        }
        c12510.f26658 = this.f51040;
        return c12510;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22953 m37558() {
        C22953 c22953 = new C22953();
        c22953.f26658 = this.f51040;
        return c22953;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4197 m37506(long j, C14769 c14769) {
        C4197 c4197 = new C4197();
        c4197.f15343 = -1;
        c4197.f15344 = c14769;
        c4197.f15345 = j;
        c4197.f26658 = this.f51040;
        return c4197;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20057 m37540(C14769 c14769, AbstractC22295 abstractC22295, C14769 c147610, AbstractC19969 abstractC19969) {
        C20057 c20057 = new C20057();
        c20057.f64457 = c14769;
        c20057.f64458 = abstractC22295;
        c20057.f64455 = c147610;
        c20057.f64456 = abstractC19969;
        c20057.f26658 = this.f51040;
        return c20057;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15493 m37577(AbstractC22295 abstractC22295, C14769 c14769) {
        C15493 c15493 = new C15493();
        c15493.f50424 = -1;
        c15493.f50422 = abstractC22295;
        c15493.f50421 = c14769;
        c15493.f26658 = this.f51040;
        return c15493;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21351 m37542(EnumC24528 enumC24528, C14769 c14769, C14769 c147610, AbstractC8036 abstractC8036) {
        C21351 c21351 = new C21351(enumC24528, c14769, c147610, abstractC8036);
        c21351.f26658 = this.f51040;
        return c21351;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13256 m37561(AbstractC22295 abstractC22295, C14769 c14769) {
        C13256 c13256 = new C13256();
        c13256.f42354 = -1;
        c13256.f42352 = abstractC22295;
        c13256.f42355 = c14769;
        c13256.f26658 = this.f51040;
        return c13256;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11764 m37518(C14769 c14769, C4197 c4197, C14769 c147610, C4197 c4198) {
        C11764 c11764 = new C11764();
        c11764.f38022 = c4197;
        c11764.f38025 = c147610;
        c11764.f38024 = c4198;
        c11764.f38023 = c14769;
        c11764.f26658 = this.f51040;
        return c11764;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0468 m37503(C12510 c12510, C4197 c4197) {
        C0468 c0468 = new C0468();
        c0468.f2080 = c12510;
        c0468.f2079 = c4197;
        c0468.f26658 = this.f51040;
        return c0468;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10162 m37517(AbstractC22295 abstractC22295, AbstractC22295 abstractC22296, AbstractC22295 abstractC22297) {
        C10162 c10162 = new C10162();
        c10162.f32546 = abstractC22295;
        c10162.f32544 = abstractC22296;
        c10162.f32545 = abstractC22297;
        c10162.f26658 = this.f51040;
        return c10162;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2158 m37504(AbstractC22295 abstractC22295, AbstractC19969 abstractC19969, AbstractC19969 abstractC199610) {
        C2158 c2158 = new C2158();
        c2158.f7114 = abstractC22295;
        c2158.f7115 = abstractC19969;
        c2158.f7116 = abstractC199610;
        c2158.f26658 = this.f51040;
        return c2158;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11106 m37567(AbstractC22295 abstractC22295) {
        C11106 c11106 = new C11106();
        c11106.f35018 = abstractC22295;
        c11106.f26658 = this.f51040;
        return c11106;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14637 m37525(AbstractC19728 abstractC19728) {
        C14637 c14637 = new C14637();
        c14637.f47895 = abstractC19728;
        c14637.f47896 = null;
        c14637.f26658 = this.f51040;
        return c14637;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4307 m37559(AbstractC22295 abstractC22295) {
        C4307 c4307 = new C4307();
        c4307.f15611 = abstractC22295;
        c4307.f15610 = null;
        c4307.f26658 = this.f51040;
        return c4307;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11018 m37553(AbstractC22295 abstractC22295) {
        C11018 c11018 = new C11018();
        c11018.f34795 = abstractC22295;
        c11018.f26658 = this.f51040;
        return c11018;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2070 m37576(AbstractC22295 abstractC22295) {
        C2070 c2070 = new C2070();
        c2070.f6892 = abstractC22295;
        c2070.f26658 = this.f51040;
        return c2070;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24533 m37550(AbstractC22295 abstractC22295, C14769 c14769, C14769 c147610) {
        C24533 c24533 = new C24533();
        if (c14769 == null) {
            c14769 = C14769.m35543();
        }
        c24533.f79552 = c14769;
        c24533.f79554 = abstractC22295;
        c24533.f79555 = c147610;
        c24533.f26658 = this.f51040;
        return c24533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18565 m37539(AbstractC22295 abstractC22295, C14769 c14769, AbstractC22295 abstractC22296, C14769 c147610, C7926 c7926, boolean z) {
        C18565 c18565;
        if (z) {
            c18565 = new C24666(abstractC22295, c14769, abstractC22296, c147610, c7926);
        } else {
            c18565 = new C18565(abstractC22295, c14769, abstractC22296, c147610, c7926);
        }
        c18565.f26658 = this.f51040;
        return c18565;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21549 m37573(AbstractC22295 abstractC22295, C14769 c14769, C14769 c147610) {
        C21549 c21549 = new C21549();
        c21549.f68829 = abstractC22295;
        c21549.f68830 = c14769;
        c21549.f68828 = C14769.m35543();
        c21549.f68831 = C14769.m35543();
        c21549.f68827 = c147610;
        c21549.f26658 = this.f51040;
        return c21549;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16327 m37571(AbstractC8036 abstractC8036, C14769 c14769) {
        C16327 c16327 = new C16327();
        c16327.f52998 = true;
        c16327.f52999 = c14769;
        c16327.f53001 = abstractC8036;
        if (c14769.isEmpty() || ((C12510) c14769.f48335).f40166 != null) {
            c16327.f53000 = EnumC17819.EXPLICIT;
        } else {
            c16327.f53000 = EnumC17819.IMPLICIT;
        }
        c16327.f26658 = this.f51040;
        return c16327;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20605 m37541(AbstractC22295 abstractC22295, AbstractC22295 abstractC22296) {
        C20605 c20605 = new C20605();
        c20605.f66030 = abstractC22295;
        c20605.f66031 = abstractC22296;
        c20605.f26658 = this.f51040;
        return c20605;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12400 m37519(EnumC21461 enumC21461, AbstractC8036 abstractC8036, AbstractC8036 abstractC8037) {
        C12400 c12400 = new C12400();
        c12400.f62401 = enumC21461;
        c12400.f39896 = (AbstractC22295) abstractC8036;
        c12400.f39895 = (AbstractC22295) abstractC8037;
        c12400.f62402 = null;
        c12400.f26658 = this.f51040;
        return c12400;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3561 m37505(EnumC21461 enumC21461, AbstractC22295 abstractC22295) {
        C3561 c3561 = new C3561();
        c3561.f62401 = enumC21461;
        c3561.f12203 = abstractC22295;
        c3561.f26658 = this.f51040;
        return c3561;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6435 m37510(EnumC21461 enumC21461, AbstractC22295 abstractC22295, AbstractC22295 abstractC22296) {
        C6435 c6435 = new C6435();
        c6435.f62401 = enumC21461;
        c6435.f21672 = abstractC22295;
        c6435.f21671 = abstractC22296;
        c6435.f62402 = null;
        c6435.f26658 = this.f51040;
        return c6435;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16985 m37533(AbstractC8036 abstractC8036, AbstractC22295 abstractC22295) {
        C16985 c16985 = new C16985();
        c16985.f55514 = abstractC8036;
        c16985.f55515 = abstractC22295;
        c16985.f26658 = this.f51040;
        return c16985;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9416 m37516() {
        C9416 c9416 = new C9416();
        c9416.f26658 = this.f51040;
        return c9416;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16129 m37570(AbstractC22295 abstractC22295, AbstractC22295 abstractC22296) {
        C16129 c16129 = new C16129(abstractC22295, abstractC22296);
        c16129.f26658 = this.f51040;
        return c16129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23041 m37544(AbstractC22295 abstractC22295, AbstractC19728 abstractC19728) {
        C23041 c23041 = new C23041(abstractC22295, abstractC19728, null);
        c23041.f26658 = this.f51040;
        return c23041;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5887 m37565(AbstractC19728 abstractC19728) {
        C5887 c5887 = new C5887(abstractC19728, null);
        c5887.f26658 = this.f51040;
        return c5887;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23787 m37547(EnumC21172 enumC21172, Object obj) {
        C23787 c23787 = new C23787();
        c23787.f77042 = enumC21172;
        c23787.f77043 = obj;
        c23787.f26658 = this.f51040;
        return c23787;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14089 m37524(EnumC21172 enumC21172) {
        C14089 c14089 = new C14089();
        c14089.f44595 = enumC21172;
        c14089.f26658 = this.f51040;
        return c14089;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23589 m37563(AbstractC22295 abstractC22295) {
        C23589 c23589 = new C23589();
        c23589.f76594 = abstractC22295;
        c23589.f26658 = this.f51040;
        return c23589;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C25191 m37560(AbstractC22295 abstractC22295, C14769 c14769) {
        C25191 c25191 = new C25191();
        c25191.f81425 = abstractC22295;
        c25191.f81424 = c14769;
        c25191.f26658 = this.f51040;
        return c25191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24445 m37548(C18477 c18477, AbstractC8036 abstractC8036) {
        C24445 c24445 = new C24445();
        C11972.m30021(c18477);
        c24445.f79358 = c18477;
        c24445.f79357 = abstractC8036;
        c24445.f26658 = this.f51040;
        return c24445;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18477 m37538(EnumC18670 enumC18670) {
        C18477 c18477 = new C18477();
        c18477.f60145 = enumC18670;
        c18477.f26658 = this.f51040;
        return c18477;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17621 m37535(AbstractC8036 abstractC8036, C14769 c14769) {
        C17621 c17621 = new C17621(EnumC21461.f68479, abstractC8036, c14769);
        c17621.f26658 = this.f51040;
        return c17621;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17621 m37556(AbstractC8036 abstractC8036, C14769 c14769) {
        C17621 c17621 = new C17621(EnumC21461.f68474, abstractC8036, c14769);
        c17621.f26658 = this.f51040;
        return c17621;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4395 m37564(long j, C14769 c14769) {
        C4395 c4395 = new C4395();
        c4395.f15825 = j;
        c4395.f15824 = c14769;
        c4395.f26658 = ((j & (-4611677222334353921L)) == 0 && c14769.isEmpty()) ? -1 : this.f51040;
        return c4395;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4395 m37507(long j) {
        return m37564(j, C14769.m35543());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14835 m37529(C4395 c4395, EnumC24287 enumC24287, AbstractC22295 abstractC22295, C14769 c14769) {
        C14835 c14835 = new C14835(c4395, enumC24287, abstractC22295, c14769);
        c14835.f26658 = this.f51040;
        return c14835;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16875 m37532(AbstractC22295 abstractC22295, C14769 c14769) {
        C16875 c16875 = new C16875();
        C11972.m30026(c14769 != null && c14769.m35550());
        c16875.f55197 = c14769;
        c16875.f55198 = abstractC22295;
        c16875.f26658 = this.f51040;
        return c16875;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13891 m37568() {
        return m37569(C14769.m35543());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13891 m37569(C14769 c14769) {
        C13891 c13891 = new C13891();
        c13891.f44048 = c14769;
        c13891.f26658 = this.f51040;
        return c13891;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14747 m37554(AbstractC22295 abstractC22295, C14769 c14769) {
        C14747 c14747 = new C14747(abstractC22295, c14769);
        c14747.f26658 = this.f51040;
        return c14747;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7926 m37513(C4395 c4395, C14769 c14769) {
        return m37514(c4395, this.f51043.f49799, C14769.m35543(), (AbstractC22295) null, C14769.m35543(), c14769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14747 m37526(C12510 c12510, AbstractC22295 abstractC22295) {
        C14747 c14747 = new C14747(abstractC22295, C14769.of((Object) c12510));
        c14747.f26658 = this.f51040;
        return c14747;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5887 m37508(AbstractC11781 abstractC11781) {
        AbstractC19728 abstractC19728Mo29575 = abstractC11781.f38072;
        if (abstractC19728Mo29575 == this.f51043.f49799) {
            abstractC19728Mo29575 = abstractC11781.mo29575();
        }
        C5887 c5887 = new C5887(abstractC19728Mo29575, abstractC11781);
        c5887.f26658 = this.f51040;
        c5887.f26659 = abstractC11781.f38067;
        return c5887;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23041 m37543(AbstractC22295 abstractC22295, AbstractC11781 abstractC11781) {
        C23041 c23041 = new C23041(abstractC22295, abstractC11781.f38072, abstractC11781);
        c23041.f26658 = this.f51040;
        c23041.f26659 = abstractC11781.f38067;
        return c23041;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14769 m37555(C14769 c14769) {
        C18499 c18499 = new C18499();
        while (c14769.m35550()) {
            c18499.m43089(m37508((AbstractC11781) ((C12510) c14769.f48335).f40168));
            c14769 = c14769.f48336;
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5887 m37566(AbstractC22664 abstractC22664) {
        return m37508((AbstractC11781) new C5816(16L, this.f51043.f49836, abstractC22664, abstractC22664.f73596));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23041 m37545(AbstractC22664 abstractC22664) {
        return m37543(m37557(abstractC22664), new C5816(16L, this.f51043.f49836, abstractC22664, abstractC22664.f73596));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5887 m37509(C24550 c24550, AbstractC22664 abstractC22664) {
        return m37508((AbstractC11781) new C5816(16L, this.f51043.f49851, abstractC22664, c24550));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24533 m37575(AbstractC22295 abstractC22295, C14769 c14769) {
        C24533 c24533M37550 = m37550(abstractC22295, (C14769) null, c14769);
        c24533M37550.f26659 = abstractC22295.f26659.mo31585();
        return c24533M37550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24533 m37549(AbstractC22295 abstractC22295) {
        C24533 c24533M37550 = m37550(abstractC22295, (C14769) null, C14769.m35543());
        c24533M37550.f26659 = abstractC22295.f26659.mo31585();
        return c24533M37550;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22295 m37557(AbstractC22664 abstractC22664) {
        AbstractC22295 abstractC22295;
        AbstractC22295 abstractC22295M37524;
        AbstractC22295 abstractC22295M37574;
        if (abstractC22664 == null) {
            return null;
        }
        switch (C16460.f53375[abstractC22664.mo9097().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                abstractC22295M37524 = m37524(abstractC22664.mo9097());
                break;
            case 10:
                abstractC22295M37524 = m37508((AbstractC11781) abstractC22664.f73596);
                break;
            case 11:
                C10729 c10729 = (C10729) abstractC22664;
                EnumC18670 enumC18670 = c10729.f34073;
                abstractC22295M37524 = m37548(m37538(enumC18670), (AbstractC8036) (enumC18670 != EnumC18670.UNBOUND ? m37557(c10729.f34074) : null));
                break;
            case 12:
                int i = C16460.f53376[abstractC22664.mo5501().ordinal()];
                if (i == 1) {
                    C18499 c18499 = new C18499();
                    Iterator it = ((C6783) abstractC22664).m18913().iterator();
                    while (it.hasNext()) {
                        c18499.m43089(m37557((AbstractC22664) it.next()));
                    }
                    C14769 c14769M43093 = c18499.m43093();
                    C23699 c23699 = new C23699();
                    c23699.f76826 = c14769M43093;
                    c23699.f26658 = this.f51040;
                    abstractC22295 = c23699;
                } else if (i == 2) {
                    C18499 c184910 = new C18499();
                    Iterator it2 = ((C1562) abstractC22664).m5502().iterator();
                    while (it2.hasNext()) {
                        c184910.m43089(m37557((AbstractC22664) it2.next()));
                    }
                    C14769 c14769M43094 = c184910.m43093();
                    C17731 c17731 = new C17731();
                    c17731.f58264 = c14769M43094;
                    c17731.f26658 = this.f51040;
                    abstractC22295 = c17731;
                } else {
                    AbstractC22664 abstractC22664Mo23449 = abstractC22664.mo23449();
                    if (abstractC22664Mo23449.m51067(EnumC21172.CLASS) && abstractC22664.f73596.f38069.f38066 == EnumC13603.f43213) {
                        abstractC22295M37574 = m37543(m37557(abstractC22664Mo23449), abstractC22664.f73596);
                    } else {
                        abstractC22295M37574 = m37574(abstractC22664.f73596);
                    }
                    abstractC22295M37524 = abstractC22295M37574;
                    if (!abstractC22664.mo15882().isEmpty()) {
                        abstractC22295M37524 = m37560(abstractC22295M37574, m37562(abstractC22664.mo15882()));
                    }
                }
                abstractC22295M37524 = abstractC22295;
                break;
            case 13:
                abstractC22295M37524 = m37563(m37557(this.f51041.m55120(abstractC22664)));
                break;
            case 14:
                abstractC22295M37524 = m37524(EnumC21172.ERROR);
                break;
            default:
                throw new AssertionError("unexpected type: " + abstractC22664);
        }
        return abstractC22295M37524.mo38749(abstractC22664);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14769 m37562(C14769 c14769) {
        C18499 c18499 = new C18499();
        while (c14769.m35550()) {
            c18499.m43089(m37557((AbstractC22664) c14769.f48335));
            c14769 = c14769.f48336;
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12510 m37523(C5816 c5816, AbstractC22295 abstractC22295) {
        C12510 c12510 = new C12510(m37564(c5816.f38071, m37527(c5816.mo29568())), c5816.f38072, m37557(c5816.f38067), abstractC22295, c5816, false);
        c12510.f26658 = this.f51040;
        c12510.f26659 = c5816.f38067;
        return c12510;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m37527(C14769 c14769) {
        if (c14769 == null) {
            return C14769.m35543();
        }
        C18499 c18499 = new C18499();
        while (c14769.m35550()) {
            c18499.m43089(m37536((AbstractC21654) c14769.f48335));
            c14769 = c14769.f48336;
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23787 m37546(Object obj) {
        C23787 c23787M37547;
        AbstractC22664 abstractC22664Mo23624;
        C14764 c14764 = this.f51044;
        if (obj instanceof String) {
            c23787M37547 = m37547(EnumC21172.CLASS, obj);
            abstractC22664Mo23624 = c14764.f48282.mo23624(obj);
        } else if (obj instanceof Integer) {
            c23787M37547 = m37547(EnumC21172.INT, obj);
            abstractC22664Mo23624 = c14764.f48253.mo23624(obj);
        } else if (obj instanceof Long) {
            c23787M37547 = m37547(EnumC21172.LONG, obj);
            abstractC22664Mo23624 = c14764.f48256.mo23624(obj);
        } else if (obj instanceof Byte) {
            c23787M37547 = m37547(EnumC21172.BYTE, obj);
            abstractC22664Mo23624 = c14764.f48293.mo23624(obj);
        } else if (obj instanceof Character) {
            char cCharAt = ((Character) obj).toString().charAt(0);
            c23787M37547 = m37547(EnumC21172.CHAR, Integer.valueOf(cCharAt));
            abstractC22664Mo23624 = c14764.f48296.mo23624(Integer.valueOf(cCharAt));
        } else if (obj instanceof Double) {
            c23787M37547 = m37547(EnumC21172.DOUBLE, obj);
            abstractC22664Mo23624 = c14764.f48249.mo23624(obj);
        } else if (obj instanceof Float) {
            c23787M37547 = m37547(EnumC21172.FLOAT, obj);
            abstractC22664Mo23624 = c14764.f48239.mo23624(obj);
        } else if (obj instanceof Short) {
            c23787M37547 = m37547(EnumC21172.SHORT, obj);
            abstractC22664Mo23624 = c14764.f48316.mo23624(obj);
        } else if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            c23787M37547 = m37547(EnumC21172.BOOLEAN, Integer.valueOf(zBooleanValue ? 1 : 0));
            abstractC22664Mo23624 = c14764.f48255.mo23624(Integer.valueOf(zBooleanValue ? 1 : 0));
        } else {
            throw new AssertionError(obj);
        }
        c23787M37547.f26659 = abstractC22664Mo23624;
        return c23787M37547;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17621 m37536(AbstractC21654 abstractC21654) {
        return this.f51039.m40422((C23892) abstractC21654);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17621 m37537(C24638 c24638) {
        return this.f51039.m40421(c24638);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6633 m37512(C10377 c10377, AbstractC22664 abstractC22664, C4197 c4197) {
        C4395 c4395M37564 = m37564(c10377.f38071, m37527(c10377.mo29568()));
        AbstractC19728 abstractC19728 = c10377.f38072;
        AbstractC22295 abstractC22295M37557 = abstractC19728 != this.f51043.f49865 ? m37557(abstractC22664.mo31585()) : null;
        C18499 c18499 = new C18499();
        for (C14769 c14769Mo15882 = abstractC22664.mo15882(); c14769Mo15882.m35550(); c14769Mo15882 = c14769Mo15882.f48336) {
            Object obj = c14769Mo15882.f48335;
            AbstractC19728 abstractC19729 = ((AbstractC22664) obj).f73596.f38072;
            C17969 c17969 = (C17969) obj;
            C14769 c14769M37562 = m37562(this.f51041.m55097(c17969));
            C14769 c14769M35543 = C14769.m35543();
            C16239 c16239 = new C16239();
            c16239.f52784 = abstractC19729;
            c16239.f52785 = c14769M37562;
            c16239.f52783 = c14769M35543;
            c16239.f26658 = this.f51040;
            c16239.f26659 = c17969;
            c18499.m43089(c16239);
        }
        C6633 c6633 = new C6633(c4395M37564, abstractC19728, abstractC22295M37557, c18499.m43093(), null, m37528(abstractC22664.mo50621(), c10377), m37562(abstractC22664.mo50622()), c4197, null, c10377);
        c6633.f26658 = this.f51040;
        c6633.f26659 = abstractC22664;
        return c6633;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m37528(C14769 c14769, C10377 c10377) {
        C18499 c18499 = new C18499();
        C10377 c10378 = c10377.f38066 == EnumC13603.f43218 ? c10377 : null;
        if (c10378 != null && c10378.f33013 != null && c14769.m35551() == c10378.f33013.m35551()) {
            Iterator it = c10377.f33013.iterator();
            while (it.hasNext()) {
                c18499.m43089(m37523((C5816) it.next(), (AbstractC22295) null));
            }
        } else {
            int i = 0;
            while (c14769.m35550()) {
                c18499.m43089(m37523(new C5816(8589934592L, m37572(i), (AbstractC22664) c14769.f48335, c10377), (AbstractC22295) null));
                c14769 = c14769.f48336;
                i++;
            }
        }
        return c18499.m43093();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16129 m37531(C5816 c5816, C24533 c24533) {
        C16129 c16129 = new C16129(m37574(c5816), c24533);
        c16129.f26659 = ((C2832) c5816.f38067).f9333;
        return c16129;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16985 m37534(AbstractC22664 abstractC22664, AbstractC22295 abstractC22295) {
        C16985 c16985M37533 = m37533((AbstractC8036) m37557(abstractC22664), abstractC22295);
        c16985M37533.f26659 = abstractC22664;
        return c16985M37533;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r0.hasNext() == false) goto L39;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC22295 m37574(l.AbstractC11781 r5) {
        /*
            r4 = this;
            l.ᩳܰۘ r0 = r4.f51042
            l.ᩴۢۘ r1 = r5.f38072
            l.ܳۢۘ r2 = r4.f51043
            l.ᩴۢۘ r2 = r2.f49799
            if (r1 == r2) goto L99
            l.ۧܿ᩺ r2 = r5.f38069
            if (r2 == 0) goto L99
            l.ܰܿ᩺ r3 = r4.f51044
            l.ۤܿ᩺ r3 = r3.f48284
            if (r2 == r3) goto L99
            l.۬ۘ᩺ r2 = r2.f38066
            l.۬ۘ᩺ r3 = l.EnumC13603.f43218
            if (r2 == r3) goto L99
            l.۬ۘ᩺ r3 = l.EnumC13603.f43205
            if (r2 != r3) goto L20
            goto L99
        L20:
            l.۬ۘ᩺ r2 = r5.f38066
            l.۬ۘ᩺ r3 = l.EnumC13603.f43213
            if (r2 != r3) goto L8e
            if (r0 == 0) goto L8e
            l.᩸᩶᩺ r2 = r0.f61854
            java.lang.Iterable r1 = r2.m38842(r1)
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r0 = r1.next()
            l.ۧܿ᩺ r0 = (l.AbstractC11781) r0
            if (r0 != r5) goto L8e
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L8e
            goto L99
        L47:
            l.۬᩶᩺ r1 = r0.f61858
            r1.mo29590()
            l.ܽ᩶᩺ r1 = r1.f44616
            l.ᩴۢۘ r2 = r5.f38072
            java.lang.Iterable r1 = r1.m38842(r2)
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6d
            java.lang.Object r0 = r1.next()
            l.ۧܿ᩺ r0 = (l.AbstractC11781) r0
            if (r0 != r5) goto L8e
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L8e
            goto L99
        L6d:
            l.ܺ᩶᩺ r0 = r0.f61861
            l.ᩴۢۘ r1 = r5.f38072
            java.lang.Iterable r0 = r0.m38842(r1)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            l.ۧܿ᩺ r1 = (l.AbstractC11781) r1
            if (r1 != r5) goto L8e
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L8e
            goto L99
        L8e:
            l.ۧܿ᩺ r0 = r5.f38069
            l.᩷᩶ۘ r0 = r4.m37574(r0)
            l.᩸᩶ۘ r5 = r4.m37543(r0, r5)
            return r5
        L99:
            l.ۚ᩶ۘ r5 = r4.m37508(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15714.m37574(l.ۧܿ᩺):l.᩷᩶ۘ");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m37572(int i) {
        C15252 c15252 = this.f51043;
        return c15252.f49864.m51194(C13645.m33382(i, "x"));
    }
}
