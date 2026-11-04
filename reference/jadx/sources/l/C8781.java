package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I3GH */
/* JADX INFO: loaded from: classes4.dex */
public class C8781 implements InterfaceC15161 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15714 f28566;

    public C8781(C15714 c15714) {
        this.f28566 = c15714;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8036 mo23491(AbstractC8036 abstractC8036, Object obj) {
        if (abstractC8036 == null) {
            return null;
        }
        if (AbstractC8036.m21910()) {
            return (AbstractC8036) AbstractC8036.m21908(new C2815(this, abstractC8036, obj));
        }
        return (AbstractC8036) abstractC8036.mo2282(this, obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14769 m23492(Object obj, C14769 c14769) {
        if (c14769 == null || c14769.isEmpty()) {
            return c14769;
        }
        C18499 c18499 = new C18499();
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            c18499.m43089(mo23491((AbstractC8036) it.next(), obj));
        }
        return c18499.m43093();
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5876(C16875 c16875, Object obj) {
        C14769 c14769M23492 = m23492(obj, c16875.f55197);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c16875.f55198, obj);
        int i = c16875.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37532(abstractC22295, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5879(C17621 c17621, Object obj) {
        AbstractC8036 abstractC8036Mo23491 = mo23491(c17621.f57962, obj);
        C14769 c14769M23492 = m23492(obj, c17621.f57964);
        EnumC22621 enumC22621Mo2283 = c17621.mo2283();
        EnumC22621 enumC22621 = EnumC22621.TYPE_ANNOTATION;
        C15714 c15714 = this.f28566;
        if (enumC22621Mo2283 == enumC22621) {
            c15714.f51040 = c17621.f26658;
            C17621 c17621M37556 = c15714.m37556(abstractC8036Mo23491, c14769M23492);
            c17621M37556.f57963 = c17621.f57963;
            return c17621M37556;
        }
        c15714.f51040 = c17621.f26658;
        C17621 c17621M37535 = c15714.m37535(abstractC8036Mo23491, c14769M23492);
        c17621M37535.f57963 = c17621.f57963;
        return c17621M37535;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5845(C3451 c3451, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c3451.f11254, obj);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c3451.f11255, obj);
        int i = c3451.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C3451 c3452 = new C3451();
        c3452.f11254 = abstractC22295;
        c3452.f11255 = abstractC22296;
        c3452.f26658 = c15714.f51040;
        return c3452;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5885(C20605 c20605, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c20605.f66030, obj);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c20605.f66031, obj);
        int i = c20605.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37541(abstractC22295, abstractC22296);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5865(C12400 c12400, Object obj) {
        AbstractC8036 abstractC8036Mo23491 = mo23491(c12400.f39896, obj);
        AbstractC8036 abstractC8036Mo23492 = mo23491(c12400.f39895, obj);
        int i = c12400.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37519(c12400.f62401, abstractC8036Mo23491, abstractC8036Mo23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5854(C6435 c6435, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c6435.f21672, obj);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c6435.f21671, obj);
        int i = c6435.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37510(c6435.f62401, abstractC22295, abstractC22296);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5847(C4197 c4197, Object obj) {
        C14769 c14769M23492 = m23492(obj, c4197.f15344);
        int i = c4197.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37506(c4197.f15345, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5870(C14637 c14637, Object obj) {
        int i = c14637.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37525(c14637.f47895);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5848(C4307 c4307, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c4307.f15611, obj);
        int i = c4307.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37559(abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5887(C21351 c21351, Object obj) {
        AbstractC8036 abstractC8036;
        C14769 c14769M23492 = m23492(obj, c21351.f68007);
        C14769 c14769M23493 = m23492(obj, c21351.f68009);
        EnumC24528 enumC24528 = c21351.f68011;
        if (enumC24528 == EnumC24528.RULE) {
            abstractC8036 = ((c21351.f68008 instanceof AbstractC22295) && ((AbstractC19969) c21351.f68009.f48335).m21911(EnumC21461.f68481)) ? ((C4307) c21351.f68009.f48335).f15611 : (AbstractC8036) c21351.f68009.f48335;
        } else {
            abstractC8036 = null;
        }
        int i = c21351.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37542(enumC24528, c14769M23492, c14769M23493, abstractC8036);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5839(C0468 c0468, Object obj) {
        C12510 c12510 = (C12510) mo23491((AbstractC8036) c0468.f2080, obj);
        C4197 c4197 = (C4197) mo23491((AbstractC8036) c0468.f2079, obj);
        int i = c0468.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37503(c12510, c4197);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5858(C7926 c7926, Object obj) {
        C4395 c4395 = (C4395) mo23491((AbstractC8036) c7926.f26341, obj);
        C14769 c14769M23492 = m23492(obj, c7926.f26343);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c7926.f26348, obj);
        C14769 c14769M23493 = m23492(obj, c7926.f26347);
        C14769 c14769M23494 = m23492(obj, c7926.f26344);
        int i = c7926.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37514(c4395, c7926.f26346, c14769M23492, abstractC22295, c14769M23493, c14769M23494);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5860(C10162 c10162, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c10162.f32546, obj);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c10162.f32544, obj);
        AbstractC22295 abstractC22297 = (AbstractC22295) mo23491(c10162.f32545, obj);
        int i = c10162.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37517(abstractC22295, abstractC22296, abstractC22297);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5841(C1214 c1214, Object obj) {
        int i = c1214.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        AbstractC19728 abstractC19728 = c1214.f4446;
        C1214 c1215 = new C1214();
        c1215.f4446 = abstractC19728;
        c1215.f4447 = null;
        c1215.f26658 = c15714.f51040;
        return c1215;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5859(C8671 c8671, Object obj) {
        AbstractC19969 abstractC19969 = (AbstractC19969) mo23491(c8671.f28313, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c8671.f28314, obj);
        int i = c8671.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C8671 c8672 = new C8671();
        c8672.f28313 = abstractC19969;
        c8672.f28314 = abstractC22295;
        c8672.f26658 = c15714.f51040;
        return c8672;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo23490(C13891 c13891, Object obj) {
        C14769 c14769M23492 = m23492(obj, c13891.f44048);
        int i = c13891.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37569(c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5862(C11106 c11106, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c11106.f35018, obj);
        int i = c11106.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37567(abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5857(C7180 c7180, Object obj) {
        C12510 c12510 = (C12510) mo23491((AbstractC8036) c7180.f23710, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c7180.f23711, obj);
        AbstractC19969 abstractC19969 = (AbstractC19969) mo23491(c7180.f23709, obj);
        int i = c7180.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C7180 c7181 = new C7180();
        c7181.f23710 = c12510;
        c7181.f23711 = abstractC22295;
        c7181.f23709 = abstractC19969;
        c7181.f26658 = c15714.f51040;
        return c7181;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5884(C20057 c20057, Object obj) {
        C14769 c14769M23492 = m23492(obj, c20057.f64457);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c20057.f64458, obj);
        C14769 c14769M23493 = m23492(obj, c20057.f64455);
        AbstractC19969 abstractC19969 = (AbstractC19969) mo23491(c20057.f64456, obj);
        int i = c20057.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37540(c14769M23492, abstractC22295, c14769M23493, abstractC19969);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5853(C5887 c5887, Object obj) {
        int i = c5887.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37565(c5887.f20169);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5844(C2158 c2158, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c2158.f7114, obj);
        AbstractC19969 abstractC19969 = (AbstractC19969) mo23491(c2158.f7115, obj);
        AbstractC19969 abstractC199610 = (AbstractC19969) mo23491(c2158.f7116, obj);
        int i = c2158.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37504(abstractC22295, abstractC19969, abstractC199610);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5864(C11852 c11852, Object obj) {
        AbstractC8036 abstractC8036Mo23491 = mo23491(c11852.f38181, obj);
        int i = c11852.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        boolean z = c11852.f38180;
        C11852 c11853 = new C11852();
        c11853.f38181 = abstractC8036Mo23491;
        c11853.f38180 = z;
        c11853.f26658 = c15714.f51040;
        return c11853;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5873(C16129 c16129, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c16129.f52413, obj);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c16129.f52412, obj);
        int i = c16129.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37570(abstractC22295, abstractC22296);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5878(C17073 c17073, Object obj) {
        AbstractC19969 abstractC19969 = (AbstractC19969) mo23491(c17073.f55742, obj);
        int i = c17073.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        AbstractC19728 abstractC19728 = c17073.f55743;
        C17073 c17074 = new C17073();
        c17074.f55743 = abstractC19728;
        c17074.f55742 = abstractC19969;
        c17074.f26658 = c15714.f51040;
        return c17074;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5894(C23787 c23787, Object obj) {
        int i = c23787.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37547(c23787.f77042, c23787.f77043);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5856(C6633 c6633, Object obj) {
        C4395 c4395 = (C4395) mo23491((AbstractC8036) c6633.f22144, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c6633.f22147, obj);
        C14769 c14769M23492 = m23492(obj, c6633.f22154);
        C14769 c14769M23493 = m23492(obj, c6633.f22145);
        C12510 c12510 = (C12510) mo23491((AbstractC8036) c6633.f22149, obj);
        C14769 c14769M23494 = m23492(obj, c6633.f22146);
        C4197 c4197 = (C4197) mo23491((AbstractC8036) c6633.f22148, obj);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c6633.f22151, obj);
        int i = c6633.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37511(c4395, c6633.f22150, abstractC22295, c14769M23492, c12510, c14769M23493, c14769M23494, c4197, abstractC22296);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5897(C24533 c24533, Object obj) {
        C14769 c14769M23492 = m23492(obj, c24533.f79552);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c24533.f79554, obj);
        C14769 c14769M23493 = m23492(obj, c24533.f79555);
        int i = c24533.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37550(abstractC22295, c14769M23492, c14769M23493);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5849(C4395 c4395, Object obj) {
        C14769 c14769M23492 = m23492(obj, c4395.f15824);
        int i = c4395.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37564(c4395.f15825, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5888(C21549 c21549, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c21549.f68829, obj);
        C14769 c14769M23492 = m23492(obj, c21549.f68830);
        C14769 c14769M23493 = m23492(obj, c21549.f68827);
        int i = c21549.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37573(abstractC22295, c14769M23492, c14769M23493);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public C18565 mo5881(C18565 c18565, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c18565.f60321, obj);
        C14769 c14769M23492 = m23492(obj, c18565.f60320);
        AbstractC22295 abstractC22296 = (AbstractC22295) mo23491(c18565.f60323, obj);
        C14769 c14769M23493 = m23492(obj, c18565.f60325);
        C7926 c7926 = (C7926) mo23491((AbstractC8036) c18565.f60319, obj);
        int i = c18565.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37539(abstractC22295, c14769M23492, abstractC22296, c14769M23493, c7926, false);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public C16327 mo5875(C16327 c16327, Object obj) {
        C14769 c14769M23492 = m23492(obj, c16327.f52999);
        AbstractC8036 abstractC8036Mo23491 = mo23491(c16327.f53001, obj);
        int i = c16327.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37571(abstractC8036Mo23491, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5842(C1412 c1412, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c1412.f4986, obj);
        int i = c1412.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C1412 c1413 = new C1412();
        c1413.f4986 = abstractC22295;
        c1413.f26658 = c15714.f51040;
        return c1413;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5861(C11018 c11018, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c11018.f34795, obj);
        int i = c11018.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37553(abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5891(C23041 c23041, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c23041.f74776, obj);
        int i = c23041.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37544(abstractC22295, c23041.f74774);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public AbstractC8036 mo5867(C12598 c12598, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c12598.f40436, obj);
        C14769 c14769M23492 = m23492(obj, c12598.f40437);
        int i = c12598.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C12598 c12599 = new C12598(c12598.f40435, c12598.f40431, abstractC22295, c14769M23492);
        c12599.f26658 = c15714.f51040;
        return c12599;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5890(C22953 c22953, Object obj) {
        int i = c22953.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37558();
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5872(C15493 c15493, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c15493.f50422, obj);
        C14769 c14769M23492 = m23492(obj, c15493.f50421);
        int i = c15493.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37577(abstractC22295, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5868(C13256 c13256, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c13256.f42352, obj);
        C14769 c14769M23492 = m23492(obj, c13256.f42355);
        int i = c13256.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37561(abstractC22295, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5852(C5799 c5799, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c5799.f19919, obj);
        C4197 c4197 = (C4197) mo23491((AbstractC8036) c5799.f19918, obj);
        int i = c5799.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C5799 c57910 = new C5799();
        c57910.f19919 = abstractC22295;
        c57910.f19918 = c4197;
        c57910.f26658 = c15714.f51040;
        return c57910;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5843(C2070 c2070, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c2070.f6892, obj);
        int i = c2070.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37576(abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5882(C19113 c19113, Object obj) {
        C14769 c14769M23492 = m23492(obj, c19113.f61857);
        int i = c19113.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37578(c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo23488(C10360 c10360, Object obj) {
        C14769 c14769M23492 = m23492(obj, c10360.f32979);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c10360.f32980, obj);
        int i = c10360.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C11972.m30021(c14769M23492);
        C11972.m30021(abstractC22295);
        C10360 c10361 = new C10360();
        c10361.f32979 = c14769M23492;
        c10361.f32980 = abstractC22295;
        c10361.f26658 = c15714.f51040;
        return c10361;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5863(C11764 c11764, Object obj) {
        C14769 c14769M23492 = m23492(obj, c11764.f38023);
        C4197 c4197 = (C4197) mo23491((AbstractC8036) c11764.f38022, obj);
        C14769 c14769M23493 = m23492(obj, c11764.f38025);
        C4197 c4198 = (C4197) mo23491((AbstractC8036) c11764.f38024, obj);
        int i = c11764.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37518(c14769M23492, c4197, c14769M23493, c4198);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5898(C25191 c25191, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c25191.f81425, obj);
        C14769 c14769M23492 = m23492(obj, c25191.f81424);
        int i = c25191.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37560(abstractC22295, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5893(C23699 c23699, Object obj) {
        C14769 c14769M23492 = m23492(obj, c23699.f76826);
        int i = c23699.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C23699 c236910 = new C23699();
        c236910.f76826 = c14769M23492;
        c236910.f26658 = c15714.f51040;
        return c236910;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5880(C17731 c17731, Object obj) {
        C14769 c14769M23492 = m23492(obj, c17731.f58264);
        int i = c17731.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C17731 c17732 = new C17731();
        c17732.f58264 = c14769M23492;
        c17732.f26658 = c15714.f51040;
        return c17732;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5892(C23589 c23589, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c23589.f76594, obj);
        int i = c23589.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37563(abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5877(C16985 c16985, Object obj) {
        AbstractC8036 abstractC8036Mo23491 = mo23491(c16985.f55514, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c16985.f55515, obj);
        int i = c16985.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37533(abstractC8036Mo23491, abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5869(C14089 c14089, Object obj) {
        int i = c14089.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37524(c14089.f44595);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5874(C16239 c16239, Object obj) {
        C14769 c14769M23492 = m23492(obj, c16239.f52783);
        C14769 c14769M23493 = m23492(obj, c16239.f52785);
        int i = c16239.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        AbstractC19728 abstractC19728 = c16239.f52784;
        C16239 c162310 = new C16239();
        c162310.f52784 = abstractC19728;
        c162310.f52785 = c14769M23493;
        c162310.f52783 = c14769M23492;
        c162310.f26658 = c15714.f51040;
        return c162310;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5899(C25279 c25279, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c25279.f81646, obj);
        AbstractC8036 abstractC8036Mo23491 = mo23491(c25279.f81647, obj);
        int i = c25279.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C25279 c252710 = new C25279();
        c252710.f81646 = abstractC22295;
        c252710.f81647 = abstractC8036Mo23491;
        c252710.f26658 = c15714.f51040;
        return c252710;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5895(C24335 c24335, Object obj) {
        C12510 c12510 = (C12510) mo23491((AbstractC8036) c24335.f78930, obj);
        int i = c24335.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C24335 c24336 = new C24335();
        c24336.f78930 = c12510;
        c24336.f26658 = c15714.f51040;
        return c24336;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo23489(C13344 c13344, Object obj) {
        AbstractC2903 abstractC2903 = (AbstractC2903) mo23491(c13344.f42553, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c13344.f42552, obj);
        int i = c13344.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C13344 c13345 = new C13344();
        c13345.f42553 = abstractC2903;
        c13345.f42552 = abstractC22295;
        c13345.f26658 = c15714.f51040;
        return c13345;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo23487(C9614 c9614, Object obj) {
        AbstractC2903 abstractC2903 = (AbstractC2903) mo23491(c9614.f31095, obj);
        int i = c9614.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C9614 c9615 = new C9614();
        c9615.f31095 = abstractC2903;
        c9615.f26658 = c15714.f51040;
        return c9615;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo23486(C9416 c9416) {
        int i = c9416.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37516();
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5846(C3561 c3561, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c3561.f12203, obj);
        int i = c3561.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37505(c3561.f62401, abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public C12510 mo5866(C12510 c12510, Object obj) {
        C4395 c4395 = (C4395) mo23491((AbstractC8036) c12510.f40170, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c12510.f40166, obj);
        AbstractC22295 abstractC22296 = c12510.f40169;
        C15714 c15714 = this.f28566;
        if (abstractC22296 == null) {
            AbstractC22295 abstractC22297 = (AbstractC22295) mo23491(c12510.f40171, obj);
            c15714.f51040 = c12510.f26658;
            return c15714.m37520(c4395, c12510.f40164, abstractC22295, abstractC22297);
        }
        AbstractC22295 abstractC22298 = (AbstractC22295) mo23491(abstractC22296, obj);
        c15714.f51040 = c12510.f26658;
        return c15714.m37522(c4395, abstractC22298, abstractC22295);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5855(C6545 c6545, Object obj) {
        AbstractC19969 abstractC19969 = (AbstractC19969) mo23491(c6545.f21978, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c6545.f21979, obj);
        int i = c6545.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C6545 c6546 = new C6545();
        c6546.f21979 = abstractC22295;
        c6546.f21978 = abstractC19969;
        c6546.f26658 = c15714.f51040;
        return c6546;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5896(C24445 c24445, Object obj) {
        C18477 c18477 = c24445.f79358;
        int i = c18477.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C18477 c18477M37538 = c15714.m37538(c18477.f60145);
        AbstractC8036 abstractC8036Mo23491 = mo23491(c24445.f79357, obj);
        c15714.f51040 = c24445.f26658;
        return c15714.m37548(c18477M37538, abstractC8036Mo23491);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5871(C14835 c14835, Object obj) {
        C4395 c4395 = (C4395) mo23491((AbstractC8036) c14835.f48525, obj);
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c14835.f48522, (Object) null);
        C14769 c14769M23492 = m23492((Object) null, c14835.f48523);
        int i = c14835.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        return c15714.m37529(c4395, c14835.mo13304(), abstractC22295, c14769M23492);
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5851(C5141 c5141, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c5141.f17908, obj);
        C14769 c14769M23492 = m23492(obj, c5141.f17909);
        int i = c5141.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C5141 c5142 = new C5141();
        c5142.f17908 = abstractC22295;
        c5142.f17909 = c14769M23492;
        c5142.f26658 = c15714.f51040;
        return c5142;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5840(C0666 c0666, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c0666.f2536, obj);
        C14769 c14769M23492 = m23492(obj, c0666.f2537);
        int i = c0666.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C0666 c0667 = new C0666();
        c0667.f2536 = abstractC22295;
        c0667.f2537 = c14769M23492;
        c0667.f26658 = c15714.f51040;
        return c0667;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5850(C5053 c5053, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c5053.f17632, obj);
        C14769 c14769M23492 = m23492(obj, c5053.f17631);
        int i = c5053.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C5053 c5054 = new C5053();
        c5054.f17632 = abstractC22295;
        c5054.f17631 = c14769M23492;
        c5054.f26658 = c15714.f51040;
        return c5054;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5889(C22207 c22207, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c22207.f71540, obj);
        int i = c22207.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        boolean z = c22207.f71542;
        boolean z2 = c22207.f71543;
        C22207 c22208 = new C22207();
        c22208.f71542 = z;
        c22208.f71543 = z2;
        c22208.f71540 = abstractC22295;
        c22208.f26658 = c15714.f51040;
        return c22208;
    }

    @Override // l.InterfaceC15161
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5886(C20715 c20715, Object obj) {
        AbstractC22295 abstractC22295 = (AbstractC22295) mo23491(c20715.f66388, obj);
        int i = c20715.f26658;
        C15714 c15714 = this.f28566;
        c15714.f51040 = i;
        C20715 c20716 = new C20715();
        c20716.f66388 = abstractC22295;
        c20716.f26658 = c15714.f51040;
        return c20716;
    }
}
