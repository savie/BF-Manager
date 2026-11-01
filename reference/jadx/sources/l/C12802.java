package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۬֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12802 extends C1052 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22680 f42638;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f42640;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21825 f42641;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C21825 f42642;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42639 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C21974 f42644 = new C21974();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Map f42643 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8753 m31783(C12802 c12802, C8753 c8753) {
        c12802.getClass();
        c12802.f42641 = C21825.m48588();
        c12802.f42642 = C21825.m48588();
        c12802.f42640 = new HashMap();
        return (C8753) c12802.mo3964(c8753);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3947(C15434 c15434) {
        C22680 c22680 = this.f42638;
        C21825 c21825 = this.f42642;
        try {
            AbstractC11242 abstractC11242M9472 = C3128.m9472(c15434.f50296);
            if (abstractC11242M9472 == c22680.f73845.f77533 || abstractC11242M9472 == c22680.f73845.f77638) {
                this.f42642 = this.f42642.m48597(m31795());
            }
            super.mo3947(c15434);
        } finally {
            this.f42642 = c21825;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22492 m31795() {
        for (C14586 c14586 : this.f42641) {
            if (c14586.f47735.m22847(EnumC18651.f60468)) {
                return ((C8753) c14586.f47735).f30086;
            }
        }
        return null;
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3955(C21452 c21452) {
        C21825 c21825 = this.f42641;
        try {
            if (c21825.m48595() && ((C14586) this.f42641.f70876).f47735.m22847(EnumC18651.f60468)) {
                this.f42641 = this.f42641.m48597(new C14586(c21452));
            }
            super.mo3955(c21452);
        } finally {
            this.f42641 = c21825;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1065(C8753 c8753) throws Throwable {
        C21825 c21825 = this.f42641;
        int i = this.f42639;
        C21974 c21974 = this.f42644;
        Map map = this.f42643;
        C22680 c22680 = this.f42638;
        C22137 c22137M48186 = c22680.f73858.m48186();
        try {
            c22680.f73858.m48202(c8753.f30086.f73415);
            this.f42639 = 0;
            this.f42644 = new C21974();
            HashMap map2 = new HashMap();
            try {
                C22492 c22492 = c8753.f30086;
                if (c22492.f77448.f77452 == EnumC10477.f35879) {
                    this.f42640.put(c22492, c8753);
                }
                if (m31799() != null) {
                    c8753.f30086.f77448 = m31788(false);
                    if (c8753.f30086.m52727()) {
                        AbstractC0618 abstractC0618 = c8753.f30086.f77449.mo1934().f53222;
                        for (AbstractC0806 abstractC0806M31780 = m31780(); abstractC0806M31780 != null && !abstractC0806M31780.f3411.mo22992(); abstractC0806M31780 = abstractC0806M31780.f3408) {
                            if (abstractC0806M31780.f3413.m22847(EnumC18651.f60511)) {
                                if (m31784(abstractC0806M31780.f3412, abstractC0618) == null) {
                                    break;
                                } else {
                                    ((C2217) abstractC0806M31780).m6836(abstractC0618, EnumC3628.CAPTURED_THIS);
                                }
                            }
                        }
                    }
                }
                this.f42641 = this.f42641.m48597(new C14586(c8753));
                super.mo1065(c8753);
                c22680.f73858.m48202(c22137M48186.m49095());
                this.f42641 = c21825;
                this.f42639 = i;
                this.f42644 = c21974;
                this.f42643 = map2;
            } catch (Throwable th) {
                th = th;
                map = map2;
                c22680.f73858.m48202(c22137M48186.m49095());
                this.f42641 = c21825;
                this.f42639 = i;
                this.f42644 = c21974;
                this.f42643 = map;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1262(C3107 c3107) {
        if (m31780() != null && m31793(c3107.f11716)) {
            AbstractC23903 abstractC23903 = c3107.f11716;
            if (abstractC23903.f77452 == EnumC10477.f35878 && abstractC23903.f77448.f77452 == EnumC10477.f35879 && c3107.f30190.mo24292() == null) {
                for (AbstractC0806 abstractC0806M31780 = m31780(); abstractC0806M31780 != null; abstractC0806M31780 = abstractC0806M31780.f3408) {
                    if (abstractC0806M31780.f3413.mo1803() == EnumC18651.f60511) {
                        if (m31784(abstractC0806M31780.f3412, c3107.f11716) == null) {
                            break;
                        } else {
                            ((C2217) abstractC0806M31780).m6836(c3107.f11716, EnumC3628.CAPTURED_VAR);
                        }
                    }
                }
            } else if (c3107.f11716.f77448.f77452 == EnumC10477.f35865) {
                for (AbstractC0806 abstractC0806M31781 = m31780(); abstractC0806M31781 != null && !abstractC0806M31781.f3411.mo22992(); abstractC0806M31781 = abstractC0806M31781.f3408) {
                    if (abstractC0806M31781.f3413.m22847(EnumC18651.f60511)) {
                        AbstractC8774 abstractC8774M31784 = m31784(abstractC0806M31781.f3412, c3107.f11716);
                        if (abstractC8774M31784 == null) {
                            break;
                        }
                        if (C16702.f53496[abstractC8774M31784.mo1803().ordinal()] == 4) {
                            ((C2217) abstractC0806M31781).m6836(((C8753) abstractC8774M31784).f30086, EnumC3628.CAPTURED_THIS);
                        } else {
                            C6171.m17174("bad block kind");
                            throw null;
                        }
                    }
                }
            }
        }
        super.mo1262(c3107);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3959(C22489 c22489) {
        m31782(c22489, "lambda.stat");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C2217 m31782(C22489 c22489, String str) {
        C22680 c22680 = this.f42638;
        C21825 c21825 = this.f42641;
        try {
            C2217 c2217 = new C2217(this, c22489);
            this.f42641 = this.f42641.m48597(new C14586(c22489));
            for (C6656 c6656 : c22489.f73410) {
                c2217.m6836(c6656.f22475, EnumC3628.PARAM);
                C14586 c14586 = (C14586) this.f42641.f70876;
                C6263 c6263 = c6656.f22475;
                if (c14586.f47734 == null) {
                    c14586.f47734 = C21825.m48588();
                }
                c14586.f47734 = c14586.f47734.m48597(c6263);
            }
            c22680.f73859.put(c22489, c2217);
            super.mo3959(c22489);
            c2217.m6831();
            if (c22680.f73843) {
                c22680.f73858.m48198(c22489, c22680.f73841.m51913(str, Boolean.valueOf(c2217.m3375()), c2217.f7990));
            }
            return c2217;
        } finally {
            this.f42641 = c21825;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3961(C23195 c23195) {
        C21825 c21825 = this.f42641;
        try {
            this.f42641 = c21825.m48597(new C14586(c23195));
            super.mo3961(c23195);
        } finally {
            this.f42641 = c21825;
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3932(C8378 c8378) {
        boolean z;
        AbstractC0618 abstractC0618 = c8378.f30190.f53222;
        Iterator it = this.f42641.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C14586 c14586 = (C14586) it.next();
            if (c14586.f47735.m22847(EnumC18651.f60468) && ((C8753) c14586.f47735).f30086 == abstractC0618) {
                z = true;
                break;
            }
        }
        boolean zM52728 = abstractC0618.m52728();
        if ((z && zM52728) || m31790(m31780(), c8378)) {
            AbstractC0618 abstractC0619 = c8378.f30190.mo1934().f53222;
            for (AbstractC0806 abstractC0806M31780 = m31780(); abstractC0806M31780 != null && !abstractC0806M31780.f3411.mo22992(); abstractC0806M31780 = abstractC0806M31780.f3408) {
                if (abstractC0806M31780.f3413.m22847(EnumC18651.f60511)) {
                    if (abstractC0619 != null && m31784(abstractC0806M31780.f3412, abstractC0619) == null) {
                        break;
                    } else {
                        ((C2217) abstractC0806M31780).m6836(abstractC0619, EnumC3628.CAPTURED_THIS);
                    }
                }
            }
        }
        super.mo3932(c8378);
        if (m31780() == null || z || !zM52728) {
            return;
        }
        m31801(abstractC0618, (C2217) m31780());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31801(AbstractC23903 abstractC23903, C2217 c2217) {
        C8753 c8753 = (C8753) this.f42640.get(abstractC23903);
        if (c8753 == null || !c2217.f7987.add(abstractC23903)) {
            return;
        }
        C1512 c1512 = this.f42638.f73853;
        C13638.requireNonNull(c1512);
        new C23758(this, c1512, c2217).mo1065(c8753);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3929(C6966 c6966) {
        boolean z;
        C5040 c5040 = new C5040(this, c6966);
        C22680 c22680 = this.f42638;
        c22680.f73859.put(c6966, c5040);
        C21825 c21825Mo33523 = c6966.m5634(c22680.f73852).mo33523();
        if ((c21825Mo33523.m48595() ? C5040.m14060((AbstractC16579) c21825Mo33523.f70876) : false) || c5040.f17605) {
            z = true;
        } else {
            if (c6966.f23405 != null) {
                z = true;
            } else {
                if (c6966.f23412.f77448 == c22680.f73844.f14258) {
                    z = true;
                } else {
                    boolean z2 = c22680.f73855;
                    AbstractC23903 abstractC23903 = c5040.f3411;
                    if (!z2) {
                        if (((c6966.f23412.mo20276() & 2) == 0 || c22680.f73852.m52399(c22680.f73852.m52402(c6966.f23412.m52720().f77449), c22680.f73852.m52402(abstractC23903.m52720().f77449))) ? false : true) {
                            z = true;
                        } else if (C22680.m50225(c22680, c6966.f23412, abstractC23903)) {
                            z = true;
                        } else {
                            z = true;
                        }
                    } else if (C22680.m50225(c22680, c6966.f23412, abstractC23903) || !c6966.f23409 || (c6966.f23414 == EnumC13901.NEW && c6966.f23410 != EnumC4143.f15156 && (c6966.f23412.f77448.m52728() || c6966.f23412.f77448.m52725()))) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (z) {
            C6451 c6451 = new C6451(c22680, c6966, c5040, m31788(false));
            C22489 c22489M17641 = c6451.m17641();
            AbstractC5930 abstractC5930 = (AbstractC5930) mo3964(c6451.m17642());
            C2217 c2217M31782 = m31782(c22489M17641, "mref.stat.1");
            if (abstractC5930 != null) {
                c2217M31782.f7985 = abstractC5930;
                return;
            }
            return;
        }
        super.mo3929(c6966);
        if (c22680.f73843) {
            C20414 c20414 = c22680.f73858;
            boolean zM3375 = c5040.m3375();
            C9438 c9438 = C2005.f7500;
            c20414.m48198(c6966, new C9438("compiler", "mref.stat", Boolean.valueOf(zM3375), null));
        }
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo1268(C23570 c23570) {
        if (m31780() != null) {
            AbstractC23903 abstractC23903 = c23570.f76355;
            if (abstractC23903.f77452 == EnumC10477.f35878) {
                AbstractC11242 abstractC11242 = abstractC23903.f77453;
                C22680 c22680 = this.f42638;
                if (abstractC11242 == c22680.f73845.f77533 || c23570.f76355.f77453 == c22680.f73845.f77638) {
                    for (AbstractC0806 abstractC0806M31780 = m31780(); abstractC0806M31780 != null && !abstractC0806M31780.f3411.mo22992(); abstractC0806M31780 = abstractC0806M31780.f3408) {
                        if (abstractC0806M31780.f3413.m22847(EnumC18651.f60511)) {
                            C8753 c8753 = (C8753) m31784(abstractC0806M31780.f3412, c23570.f76355);
                            if (c8753 == null) {
                                break;
                            } else {
                                ((C2217) abstractC0806M31780).m6836(c8753.f30086, EnumC3628.CAPTURED_THIS);
                            }
                        }
                    }
                }
            }
        }
        super.mo1268(c23570);
    }

    @Override // l.C1052, l.AbstractC19357
    /* JADX INFO: renamed from: ۙ */
    public final void mo3928(C6656 c6656) {
        AbstractC0806 abstractC0806M31780 = m31780();
        if (abstractC0806M31780 != null && (abstractC0806M31780 instanceof C2217)) {
            C2217 c2217 = (C2217) abstractC0806M31780;
            for (C14586 c14586 : this.f42641) {
                if (!c14586.f47735.m22847(EnumC18651.f60554)) {
                    if (!c14586.f47735.m22847(EnumC18651.f60511)) {
                        break;
                    } else {
                        c2217.m6836(c6656.f22475, EnumC3628.LOCAL_VAR);
                    }
                }
            }
            c6656.f22475.getClass();
        }
        C21825 c21825 = this.f42641;
        try {
            C6263 c6263 = c6656.f22475;
            if (c6263.f77448.f77452 == EnumC10477.f35879) {
                C14586 c14587 = (C14586) c21825.f70876;
                if (c14587.f47734 == null) {
                    c14587.f47734 = C21825.m48588();
                }
                c14587.f47734 = c14587.f47734.m48597(c6263);
            }
            this.f42641 = this.f42641.m48597(new C14586(c6656));
            super.mo3928(c6656);
        } finally {
            this.f42641 = c21825;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 m31788(boolean z) {
        C21825 c21825 = this.f42641;
        while (c21825.m48595()) {
            switch (C16702.f53496[((C14586) c21825.f70876).f47735.mo1803().ordinal()]) {
                case 4:
                    return ((C8753) ((C14586) c21825.f70876).f47735).f30086;
                case 5:
                    if (((C6656) ((C14586) c21825.f70876).f47735).f22475.m52728()) {
                        c21825 = c21825.f70877;
                        continue;
                    } else {
                        return m31787(((C8753) ((C14586) c21825.f70877.f70876).f47735).f30086, ((C6656) ((C14586) c21825.f70876).f47735).f22475.f77447 & 8);
                    }
                    break;
                case 6:
                    return m31787(((C8753) ((C14586) c21825.f70877.f70876).f47735).f30086, ((C21452) ((C14586) c21825.f70876).f47735).f69739 & 8);
                case 7:
                    return ((C23195) ((C14586) c21825.f70876).f47735).f75263;
                case 8:
                    if (!z) {
                        return ((C2217) this.f42638.f73859.get(((C14586) c21825.f70876).f47735)).f7990;
                    }
                    break;
            }
            c21825 = c21825.f70877;
        }
        C6171.m17170();
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC23903 m31787(C22492 c22492, long j) {
        long j2 = j & 8;
        C22680 c22680 = this.f42638;
        if (j2 != 0) {
            C18258 c18258M18327 = c22680.f73848.m18327(c22492);
            if (c18258M18327 != null) {
                this.f42643.put(c22492, c18258M18327);
                return c18258M18327;
            }
            C18258 c18258 = (C18258) this.f42643.get(c22492);
            if (c18258 != null) {
                return c18258;
            }
            C18258 c18259 = new C18258(4106L, c22680.f73845.f77608, new C13757(C21825.m48588(), c22680.f73844.f14293, C21825.m48588(), c22680.f73844.f14240), c22492);
            this.f42643.put(c22492, c18259);
            return c18259;
        }
        Iterator it = c22492.f73417.m9327(c22680.f73845.f77632).iterator();
        if (it.hasNext()) {
            return (AbstractC23903) it.next();
        }
        C6171.m17174("init not found");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC8774 m31799() {
        if (!this.f42641.isEmpty()) {
            for (C21825 c21825 = this.f42641; c21825.m48595(); c21825 = c21825.f70877) {
                int i = C16702.f53496[((C14586) c21825.f70876).f47735.mo1803().ordinal()];
                if (i != 4 && i != 7) {
                    if (i == 8) {
                        return ((C14586) c21825.f70876).f47735;
                    }
                }
            }
            C6171.m17170();
            throw null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC8774 m31784(int i, AbstractC23903 abstractC23903) {
        C21825 c21825;
        int iM48596 = this.f42641.m48596() - 1;
        for (C14586 c14586 : this.f42641) {
            int[] iArr = C16702.f53496;
            AbstractC8774 abstractC8774 = c14586.f47735;
            AbstractC8774 abstractC8775 = c14586.f47735;
            switch (iArr[abstractC8774.mo1803().ordinal()]) {
                case 4:
                    C22492 c22492 = ((C8753) abstractC8775).f30086;
                    C22680 c22680 = this.f42638;
                    if (c22492.mo50008(abstractC23903, c22680.f73852) || abstractC23903.m52704((AbstractC0618) c22492, c22680.f73852)) {
                        if (iM48596 > i) {
                            return null;
                        }
                        return abstractC8775;
                    }
                    break;
                case 5:
                    if ((((C6656) abstractC8775).f22475 == abstractC23903 && abstractC23903.f77448.f77452 == EnumC10477.f35879) || ((c21825 = c14586.f47734) != null && c21825.contains(abstractC23903))) {
                        if (iM48596 > i) {
                            return null;
                        }
                        return abstractC8775;
                    }
                    break;
                    break;
                case 6:
                case 7:
                case 8:
                    C21825 c21826 = c14586.f47734;
                    if (c21826 != null && c21826.contains(abstractC23903)) {
                        if (iM48596 > i) {
                            return null;
                        }
                        return abstractC8775;
                    }
                    break;
                    break;
                default:
                    C6171.m17174("bad decl kind " + abstractC8775.mo1803());
                    throw null;
            }
            iM48596--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC0806 m31780() {
        Iterator it = this.f42641.iterator();
        while (it.hasNext()) {
            AbstractC0806 abstractC0806 = (AbstractC0806) this.f42638.f73859.get(((C14586) it.next()).f47735);
            if (abstractC0806 != null) {
                return abstractC0806;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m31793(AbstractC23903 abstractC23903) {
        EnumC10477 enumC10477 = abstractC23903.f77452;
        return ((enumC10477 != EnumC10477.f35878 && enumC10477 != EnumC10477.f35879) || abstractC23903.mo22992() || abstractC23903.f77453 == this.f42638.f73845.f77632) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m31790(AbstractC0806 abstractC0806, C8378 c8378) {
        if (abstractC0806 == null || c8378.f29093 != null || c8378.f29098 != null || c8378.f30190.mo1934().m39001(EnumC6617.NONE)) {
            return false;
        }
        AbstractC16579 abstractC16579Mo1934 = c8378.f30190.mo1934();
        for (AbstractC16579 abstractC16579Mo1935 = abstractC0806.f3411.m52720().f77449; !abstractC16579Mo1935.m39001(EnumC6617.NONE); abstractC16579Mo1935 = abstractC16579Mo1935.mo1934()) {
            if (abstractC16579Mo1935.f53222.mo50008((AbstractC23903) abstractC16579Mo1934.f53222, this.f42638.f73852)) {
                return true;
            }
        }
        return false;
    }

    public C12802(C22680 c22680) {
        this.f42638 = c22680;
    }
}
