package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۙۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10628 implements InterfaceC7140 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f33710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33711;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f33712;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f33713;

    public C10628(InterfaceC7140 interfaceC7140) {
        AbstractC14621 c24801;
        this.f33712 = C4583.m14375(new C9400(null, 0, 0));
        this.f33713 = new ArrayList();
        this.f33710 = true;
        this.f33711 = interfaceC7140.mo2841();
        Iterator it = interfaceC7140.mo2840().iterator();
        int iMo3033 = 0;
        int i = 0;
        while (it.hasNext()) {
            iMo3033 += ((InterfaceC23331) it.next()).mo3033();
            i++;
            this.f33712.add(new C9400(null, iMo3033, i));
        }
        int[] iArr = new int[iMo3033 + 1];
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < this.f33712.size(); i2++) {
            iArr[((C9400) this.f33712.get(i2)).f30505] = i2;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (InterfaceC23331 interfaceC23331 : interfaceC7140.mo2840()) {
            C9400 c9400 = (C9400) this.f33712.get(i3);
            EnumC22631 enumC22631Mo30864 = interfaceC23331.mo30864();
            if (enumC22631Mo30864 == EnumC22631.f73432 || enumC22631Mo30864 == EnumC22631.f73383) {
                arrayList.add(new C2689(this, c9400, iArr, interfaceC23331));
            } else {
                m27100(c9400, iArr, interfaceC23331);
            }
            i3++;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC21817) it2.next()).perform();
        }
        for (InterfaceC10650 interfaceC10650 : interfaceC7140.mo2842()) {
            C9400 c9401 = (C9400) this.f33712.get(m27098(interfaceC10650.mo15046(), iArr));
            switch (interfaceC10650.mo4171()) {
                case 3:
                    InterfaceC1702 interfaceC1702 = (InterfaceC1702) interfaceC10650;
                    c24801 = new C24801(interfaceC1702.mo6062(), interfaceC1702.mo6063(), interfaceC1702.mo6065(), interfaceC1702.mo6064());
                    break;
                case 4:
                default:
                    throw new C23044(null, "Invalid debug item type: " + interfaceC10650.mo4171(), new Object[0]);
                case 5:
                    c24801 = new C19579(((InterfaceC22585) interfaceC10650).mo26041());
                    break;
                case 6:
                    c24801 = new C1680(((InterfaceC12888) interfaceC10650).mo6025());
                    break;
                case 7:
                    c24801 = new C5409();
                    break;
                case 8:
                    c24801 = new C15103();
                    break;
                case 9:
                    c24801 = new C11374(((InterfaceC5431) interfaceC10650).mo16162());
                    break;
                case 10:
                    c24801 = new C12866(((InterfaceC19601) interfaceC10650).getLineNumber());
                    break;
            }
            ((C7910) c9401.m24748()).add(c24801);
            c24801.f46061 = c9401;
        }
        for (InterfaceC4685 interfaceC4685 : interfaceC7140.mo2839()) {
            C21335 c21335M27104 = m27104(interfaceC4685.mo4114(), iArr);
            C21335 c21335M27105 = m27104(interfaceC4685.mo4115() + interfaceC4685.mo4114(), iArr);
            for (InterfaceC9376 interfaceC9376 : interfaceC4685.mo4116()) {
                this.f33713.add(new C4181(c21335M27104, c21335M27105, interfaceC9376.mo20989(), m27104(interfaceC9376.mo11197(), iArr)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m27103() {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList<C9400> arrayList = this.f33712;
        for (C9400 c9400 : arrayList) {
            AbstractC12384 abstractC12384 = c9400.f30510;
            if (abstractC12384 != null) {
                EnumC22631 enumC22631 = abstractC12384.f39756;
                int i = C13875.f44006[enumC22631.ordinal()];
                if (i == 1 || i == 2) {
                    C9400 c9400M48561 = ((AbstractC6419) abstractC12384).f21639.m48561();
                    AbstractC12384 abstractC12385 = c9400M48561.f30510;
                    if (abstractC12385 == null) {
                        throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d points to the end of the method.", Integer.valueOf(c9400.f30505), Integer.valueOf(c9400.f30506)));
                    }
                    if (abstractC12385.f39756 == EnumC22631.f73424) {
                        int i2 = c9400M48561.f30506 + 1;
                        while (true) {
                            if (i2 >= arrayList.size() - 1) {
                                abstractC12385 = null;
                                break;
                            }
                            AbstractC12384 abstractC12386 = ((C9400) arrayList.get(i2)).f30510;
                            if (abstractC12386.f39756 != EnumC22631.f73424) {
                                abstractC12385 = abstractC12386;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (abstractC12385 != null) {
                        EnumC22631 enumC22632 = abstractC12385.f39756;
                        if (abstractC12385 instanceof AbstractC24319) {
                            if ((enumC22631 == EnumC22631.f73464 && enumC22632 != EnumC22631.f73432) || (enumC22631 == EnumC22631.f73309 && enumC22632 != EnumC22631.f73383)) {
                                throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d refers to the wrong type of payload instruction.", Integer.valueOf(c9400.f30505), Integer.valueOf(c9400.f30506)));
                            }
                            if (!hashSet.add(c9400M48561)) {
                                throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                            }
                            ((AbstractC24319) abstractC12385).f78721 = c9400;
                        }
                    }
                    throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d does not refer to a payload instruction.", Integer.valueOf(c9400.f30505), Integer.valueOf(c9400.f30506)));
                }
            }
        }
        do {
            int i3 = 0;
            z = false;
            while (i3 < arrayList.size()) {
                C9400 c9401 = (C9400) arrayList.get(i3);
                AbstractC12384 abstractC12387 = c9401.f30510;
                if (abstractC12387 != null) {
                    int i4 = C13875.f44006[abstractC12387.f39756.ordinal()];
                    if (i4 == 3) {
                        AbstractC6419 abstractC6419 = (AbstractC6419) abstractC12387;
                        C21335 c21335 = abstractC6419.f21639;
                        int i5 = c21335.m48561().f30505 - abstractC6419.m30863().f30505;
                        if (i5 < -128 || i5 > 127) {
                            m27115(c9401.f30506, (i5 < -32768 || i5 > 32767) ? new C8391(EnumC22631.f73398, c21335) : new C6155(EnumC22631.f73446, c21335));
                            z = true;
                        }
                    } else if (i4 != 4) {
                        if (i4 == 5 || i4 == 6) {
                            if (((AbstractC24319) abstractC12387).f78721 == null) {
                                m27114(i3);
                            }
                            i3--;
                            z = true;
                        } else if (i4 != 7) {
                        }
                        if ((c9401.f30505 & 1) != 0) {
                            int i6 = c9401.f30506 - 1;
                            EnumC22631 enumC22633 = ((C9400) arrayList.get(i6)).f30510.f39756;
                            EnumC22631 enumC22634 = EnumC22631.f73424;
                            if (enumC22633 == enumC22634) {
                                m27114(i6);
                                i3--;
                            } else {
                                m27107(c9401.f30506, new C15849(enumC22634));
                                i3++;
                            }
                            z = true;
                        }
                    } else {
                        AbstractC6419 abstractC64110 = (AbstractC6419) abstractC12387;
                        C21335 c21336 = abstractC64110.f21639;
                        int i7 = c21336.m48561().f30505 - abstractC64110.m30863().f30505;
                        if (i7 < -32768 || i7 > 32767) {
                            m27115(c9401.f30506, new C8391(EnumC22631.f73398, c21336));
                            z = true;
                        }
                    }
                }
                i3++;
            }
        } while (z);
        this.f33710 = false;
    }

    public C10628(int i) {
        this.f33712 = C4583.m14375(new C9400(null, 0, 0));
        this.f33713 = new ArrayList();
        this.f33710 = true;
        this.f33711 = i;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۚ */
    public final int mo2841() {
        return this.f33711;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27112(int i) {
        this.f33711 = i;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۙ */
    public final List mo2840() {
        if (this.f33710) {
            m27103();
        }
        return new C8655(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27108(int i, AbstractC16113 abstractC16113) {
        if (this.f33710) {
            m27103();
        }
        ((C7910) ((C9400) this.f33712.get(i)).m24748()).add(abstractC16113);
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ֫ */
    public final List mo2839() {
        if (this.f33710) {
            m27103();
        }
        return C4681.unmodifiableList(this.f33713);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m27113() {
        if (this.f33710) {
            m27103();
        }
        return this.f33713;
    }

    @Override // l.InterfaceC7140
    /* JADX INFO: renamed from: ۧ */
    public final Iterable mo2842() {
        if (this.f33710) {
            m27103();
        }
        return C16625.m39328(C16625.m39330(this.f33712, new C7164(this)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27111(C21530 c21530, C21335 c21335, C21335 c21336, C21335 c21337) {
        this.f33713.add(new C4181(c21335, c21336, c21530, c21337));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27110(C21335 c21335, C21335 c21336, C21335 c21337) {
        this.f33713.add(new C4181(c21335, c21336, c21337));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27107(int i, AbstractC12384 abstractC12384) {
        ArrayList arrayList = this.f33712;
        if (i >= arrayList.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != arrayList.size() - 1) {
            int i2 = ((C9400) arrayList.get(i)).f30505;
            C9400 c9400 = new C9400(abstractC12384, i2, i);
            arrayList.add(i, c9400);
            abstractC12384.f39755 = c9400;
            int iMo3033 = abstractC12384.mo3033() + i2;
            for (int i3 = i + 1; i3 < arrayList.size(); i3++) {
                C9400 c9401 = (C9400) arrayList.get(i3);
                c9401.f30506++;
                c9401.f30505 = iMo3033;
                AbstractC12384 abstractC12385 = c9401.f30510;
                if (abstractC12385 != null) {
                    iMo3033 = abstractC12385.mo3033() + iMo3033;
                }
            }
            this.f33710 = true;
            return;
        }
        m27109(abstractC12384);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27109(AbstractC12384 abstractC12384) {
        ArrayList arrayList = this.f33712;
        C9400 c9400 = (C9400) j$$ExternalSyntheticOutline0.m(arrayList, 1);
        c9400.f30510 = abstractC12384;
        abstractC12384.f39755 = c9400;
        arrayList.add(new C9400(null, abstractC12384.mo3033() + c9400.f30505, arrayList.size()));
        this.f33710 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27115(int i, AbstractC12384 abstractC12384) {
        ArrayList arrayList = this.f33712;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C9400 c9400 = (C9400) arrayList.get(i);
        abstractC12384.f39755 = c9400;
        c9400.f30510.f39755 = null;
        c9400.f30510 = abstractC12384;
        int iMo3033 = abstractC12384.mo3033() + c9400.f30505;
        for (int i2 = i + 1; i2 < arrayList.size(); i2++) {
            C9400 c9401 = (C9400) arrayList.get(i2);
            c9401.f30505 = iMo3033;
            AbstractC12384 abstractC12385 = c9401.f30510;
            if (abstractC12385 != null) {
                iMo3033 = abstractC12385.mo3033() + iMo3033;
            }
        }
        this.f33710 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27116(AbstractC12384 abstractC12384) {
        if (abstractC12384.m30863().f30510 == abstractC12384) {
            m27114(abstractC12384.m30863().f30506);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27114(int i) {
        ArrayList arrayList = this.f33712;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C9400 c9400 = (C9400) arrayList.get(i);
        c9400.f30510 = null;
        c9400.m24743((C9400) arrayList.get(i + 1));
        arrayList.remove(i);
        int iMo3033 = c9400.f30505;
        while (i < arrayList.size()) {
            C9400 c9401 = (C9400) arrayList.get(i);
            c9401.f30506 = i;
            c9401.f30505 = iMo3033;
            AbstractC12384 abstractC12384 = c9401.f30510;
            if (abstractC12384 != null) {
                iMo3033 = abstractC12384.mo3033() + iMo3033;
            }
            i++;
        }
        this.f33710 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27098(int i, int[] iArr) {
        while (true) {
            if (i >= iArr.length) {
                i = iArr.length - 1;
            }
            int i2 = iArr[i];
            if (i2 >= 0) {
                return i2;
            }
            i--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21335 m27106(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f33712;
            if (i < arrayList.size()) {
                C9400 c9400 = (C9400) arrayList.get(i);
                c9400.getClass();
                C21335 c21335 = new C21335();
                ((C7910) c9400.m24747()).add(c21335);
                return c21335;
            }
        }
        throw new IndexOutOfBoundsException(String.format("instruction index %d out of bounds", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C21335 m27104(int i, int[] iArr) {
        C9400 c9400 = (C9400) this.f33712.get(m27098(i, iArr));
        c9400.getClass();
        C21335 c21335 = new C21335();
        ((C7910) c9400.m24747()).add(c21335);
        return c21335;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m27100(C9400 c9400, int[] iArr, InterfaceC23331 interfaceC23331) {
        C21335 c21335M27104;
        C17098 c17098;
        C16352 c16352;
        switch (C13875.f44005[interfaceC23331.mo30864().f73508.ordinal()]) {
            case 1:
                InterfaceC0956 interfaceC0956 = (InterfaceC0956) interfaceC23331;
                C17341 c17341 = new C17341(interfaceC0956.mo30864(), m27104(interfaceC0956.mo11703() + c9400.f30505, iArr));
                c9400.f30510 = c17341;
                c17341.f39755 = c9400;
                return;
            case 2:
                C15849 c15849 = new C15849(((InterfaceC9158) interfaceC23331).mo30864());
                c9400.f30510 = c15849;
                c15849.f39755 = c9400;
                return;
            case 3:
                InterfaceC2447 interfaceC2447 = (InterfaceC2447) interfaceC23331;
                C23309 c23309 = new C23309(interfaceC2447.mo30864(), interfaceC2447.mo1542(), interfaceC2447.mo1546());
                c9400.f30510 = c23309;
                c23309.f39755 = c9400;
                return;
            case 4:
                InterfaceC8413 interfaceC8413 = (InterfaceC8413) interfaceC23331;
                C3171 c3171 = new C3171(interfaceC8413.mo1542(), interfaceC8413.mo30864());
                c9400.f30510 = c3171;
                c3171.f39755 = c9400;
                return;
            case 5:
                InterfaceC6922 interfaceC6922 = (InterfaceC6922) interfaceC23331;
                C20325 c20325 = new C20325(interfaceC6922.mo30864(), interfaceC6922.mo1542(), interfaceC6922.mo1541());
                c9400.f30510 = c20325;
                c20325.f39755 = c9400;
                return;
            case 6:
                InterfaceC13633 interfaceC13633 = (InterfaceC13633) interfaceC23331;
                C12120 c12120 = new C12120(interfaceC13633.mo30864(), interfaceC13633.mo20338(), interfaceC13633.getReference());
                c9400.f30510 = c12120;
                c12120.f39755 = c9400;
                return;
            case 7:
                InterfaceC4575 interfaceC4575 = (InterfaceC4575) interfaceC23331;
                C6155 c6155 = new C6155(interfaceC4575.mo30864(), m27104(interfaceC4575.mo11703() + c9400.f30505, iArr));
                c9400.f30510 = c6155;
                c6155.f39755 = c9400;
                return;
            case 8:
                InterfaceC21729 interfaceC21729 = (InterfaceC21729) interfaceC23331;
                C24055 c24055 = new C24055(interfaceC21729.mo30864(), interfaceC21729.mo1542(), interfaceC21729.getReference());
                c9400.f30510 = c24055;
                c24055.f39755 = c9400;
                return;
            case 9:
                InterfaceC10540 interfaceC10540 = (InterfaceC10540) interfaceC23331;
                C3917 c3917 = new C3917(interfaceC10540.mo30864(), interfaceC10540.mo1542(), interfaceC10540.mo1546());
                c9400.f30510 = c3917;
                c3917.f39755 = c9400;
                return;
            case 10:
                InterfaceC22475 interfaceC22475 = (InterfaceC22475) interfaceC23331;
                C14357 c14357 = new C14357(interfaceC22475.mo30864(), interfaceC22475.mo1542(), interfaceC22475.mo1545());
                c9400.f30510 = c14357;
                c14357.f39755 = c9400;
                return;
            case 11:
                InterfaceC19491 interfaceC19491 = (InterfaceC19491) interfaceC23331;
                C21071 c21071 = new C21071(interfaceC19491.mo30864(), interfaceC19491.mo1542(), interfaceC19491.mo1546());
                c9400.f30510 = c21071;
                c21071.f39755 = c9400;
                return;
            case 12:
                InterfaceC15015 interfaceC15015 = (InterfaceC15015) interfaceC23331;
                C18087 c18087 = new C18087(interfaceC15015.mo30864(), interfaceC15015.mo1542(), m27104(interfaceC15015.mo11703() + c9400.f30505, iArr));
                c9400.f30510 = c18087;
                c18087.f39755 = c9400;
                return;
            case 13:
                InterfaceC12778 interfaceC12778 = (InterfaceC12778) interfaceC23331;
                C0188 c0188 = new C0188(interfaceC12778.mo1542(), interfaceC12778.mo1541(), interfaceC12778.mo1546(), interfaceC12778.mo30864());
                c9400.f30510 = c0188;
                c0188.f39755 = c9400;
                return;
            case 14:
                InterfaceC5321 interfaceC5321 = (InterfaceC5321) interfaceC23331;
                C7646 c7646 = new C7646(interfaceC5321.mo30864(), interfaceC5321.mo1542(), interfaceC5321.mo1541(), interfaceC5321.getReference());
                c9400.f30510 = c7646;
                c7646.f39755 = c9400;
                return;
            case 15:
                InterfaceC1592 interfaceC1592 = (InterfaceC1592) interfaceC23331;
                C18833 c18833 = new C18833(interfaceC1592.mo1542(), interfaceC1592.mo1541(), interfaceC1592.mo17032(), interfaceC1592.mo30864());
                c9400.f30510 = c18833;
                c18833.f39755 = c9400;
                return;
            case 16:
                InterfaceC11286 interfaceC11286 = (InterfaceC11286) interfaceC23331;
                C9882 c9882 = new C9882(interfaceC11286.mo1542(), interfaceC11286.mo1541(), interfaceC11286.mo1546(), interfaceC11286.mo30864());
                c9400.f30510 = c9882;
                c9882.f39755 = c9400;
                return;
            case 17:
                InterfaceC24713 interfaceC24713 = (InterfaceC24713) interfaceC23331;
                C0934 c0934 = new C0934(interfaceC24713.mo30864(), interfaceC24713.mo1542(), interfaceC24713.mo1541(), m27104(interfaceC24713.mo11703() + c9400.f30505, iArr));
                c9400.f30510 = c0934;
                c0934.f39755 = c9400;
                return;
            case 18:
                InterfaceC16507 interfaceC16507 = (InterfaceC16507) interfaceC23331;
                C9136 c9136 = new C9136(interfaceC16507.mo30864(), interfaceC16507.mo1542(), interfaceC16507.mo1541());
                c9400.f30510 = c9136;
                c9136.f39755 = c9400;
                return;
            case 19:
                InterfaceC17253 interfaceC17253 = (InterfaceC17253) interfaceC23331;
                C2425 c2425 = new C2425(interfaceC17253.mo1542(), interfaceC17253.mo1541(), interfaceC17253.mo8187(), interfaceC17253.mo30864());
                c9400.f30510 = c2425;
                c2425.f39755 = c9400;
                return;
            case 20:
                InterfaceC15761 interfaceC15761 = (InterfaceC15761) interfaceC23331;
                C8391 c8391 = new C8391(interfaceC15761.mo30864(), m27104(interfaceC15761.mo11703() + c9400.f30505, iArr));
                c9400.f30510 = c8391;
                c8391.f39755 = c9400;
                return;
            case 21:
                InterfaceC23221 interfaceC23221 = (InterfaceC23221) interfaceC23331;
                C6900 c6900 = new C6900(interfaceC23221.mo30864(), interfaceC23221.mo1542(), interfaceC23221.getReference());
                c9400.f30510 = c6900;
                c6900.f39755 = c9400;
                return;
            case 22:
                InterfaceC3083 interfaceC3083 = (InterfaceC3083) interfaceC23331;
                C13611 c13611 = new C13611(interfaceC3083.mo30864(), interfaceC3083.mo1542(), interfaceC3083.mo1546());
                c9400.f30510 = c13611;
                c13611.f39755 = c9400;
                return;
            case 23:
                InterfaceC20237 interfaceC20237 = (InterfaceC20237) interfaceC23331;
                int i = c9400.f30505;
                if (interfaceC20237.mo30864() != EnumC22631.f73386) {
                    C9400 c9401 = (C9400) this.f33712.get(m27098(interfaceC20237.mo11703() + i, iArr));
                    C4663 c4663 = new C4663();
                    c4663.f16471 = c9400;
                    ((C7910) c9401.m24747()).add(c4663);
                    c21335M27104 = c4663;
                } else {
                    c21335M27104 = m27104(interfaceC20237.mo11703() + i, iArr);
                }
                C5166 c5166 = new C5166(interfaceC20237.mo30864(), interfaceC20237.mo1542(), c21335M27104);
                c9400.f30510 = c5166;
                c5166.f39755 = c9400;
                return;
            case 24:
                InterfaceC12032 interfaceC12032 = (InterfaceC12032) interfaceC23331;
                C22320 c22320 = new C22320(interfaceC12032.mo30864(), interfaceC12032.mo1542(), interfaceC12032.mo1541());
                c9400.f30510 = c22320;
                c22320.f39755 = c9400;
                return;
            case 25:
                InterfaceC6067 interfaceC6067 = (InterfaceC6067) interfaceC23331;
                C11131 c11131 = new C11131(interfaceC6067.mo30864(), interfaceC6067.mo1655(), interfaceC6067.mo7063(), interfaceC6067.mo7065(), interfaceC6067.mo7061(), interfaceC6067.mo7062(), interfaceC6067.mo7064(), interfaceC6067.getReference());
                c9400.f30510 = c11131;
                c11131.f39755 = c9400;
                return;
            case 26:
                InterfaceC23967 interfaceC23967 = (InterfaceC23967) interfaceC23331;
                C23066 c23066 = new C23066(interfaceC23967.mo30864(), interfaceC23967.mo1655(), interfaceC23967.mo7063(), interfaceC23967.mo7065(), interfaceC23967.mo7061(), interfaceC23967.mo7062(), interfaceC23967.mo7064(), interfaceC23967.mo18517());
                c9400.f30510 = c23066;
                c23066.f39755 = c9400;
                return;
            case 27:
                InterfaceC3829 interfaceC3829 = (InterfaceC3829) interfaceC23331;
                C20082 c20082 = new C20082(interfaceC3829.mo30864(), interfaceC3829.mo1655(), interfaceC3829.mo7063(), interfaceC3829.mo7065(), interfaceC3829.mo7061(), interfaceC3829.mo7062(), interfaceC3829.mo7064(), interfaceC3829.mo17155());
                c9400.f30510 = c20082;
                c20082.f39755 = c9400;
                return;
            case 28:
                InterfaceC14269 interfaceC14269 = (InterfaceC14269) interfaceC23331;
                C15606 c15606 = new C15606(interfaceC14269.mo30864(), interfaceC14269.mo2772(), interfaceC14269.mo1655(), interfaceC14269.getReference());
                c9400.f30510 = c15606;
                c15606.f39755 = c9400;
                return;
            case 29:
                InterfaceC20983 interfaceC20983 = (InterfaceC20983) interfaceC23331;
                C13369 c13369 = new C13369(interfaceC20983.mo2772(), interfaceC20983.mo1655(), interfaceC20983.mo18517(), interfaceC20983.mo30864());
                c9400.f30510 = c13369;
                c13369.f39755 = c9400;
                return;
            case 30:
                InterfaceC17999 interfaceC17999 = (InterfaceC17999) interfaceC23331;
                C5912 c5912 = new C5912(interfaceC17999.mo2772(), interfaceC17999.mo1655(), interfaceC17999.mo17155(), interfaceC17999.mo30864());
                c9400.f30510 = c5912;
                c5912.f39755 = c9400;
                return;
            case 31:
                InterfaceC0100 interfaceC0100 = (InterfaceC0100) interfaceC23331;
                C2183 c2183 = new C2183(interfaceC0100.mo30864(), interfaceC0100.mo1655(), interfaceC0100.mo7063(), interfaceC0100.mo7065(), interfaceC0100.mo7061(), interfaceC0100.mo7062(), interfaceC0100.mo7064(), interfaceC0100.getReference(), interfaceC0100.mo2769());
                c9400.f30510 = c2183;
                c2183.f39755 = c9400;
                return;
            case 32:
                InterfaceC7558 interfaceC7558 = (InterfaceC7558) interfaceC23331;
                C11877 c11877 = new C11877(interfaceC7558.mo30864(), interfaceC7558.mo2772(), interfaceC7558.mo1655(), interfaceC7558.getReference(), interfaceC7558.mo2769());
                c9400.f30510 = c11877;
                c11877.f39755 = c9400;
                return;
            case 33:
                InterfaceC18745 interfaceC18745 = (InterfaceC18745) interfaceC23331;
                C25304 c25304 = new C25304(interfaceC18745.mo30864(), interfaceC18745.mo1542(), interfaceC18745.mo1545());
                c9400.f30510 = c25304;
                c25304.f39755 = c9400;
                return;
            case 34:
                List listMo20143 = ((InterfaceC9794) interfaceC23331).mo20143();
                if (listMo20143.size() == 0) {
                    c17098 = new C17098(null, 0);
                } else {
                    C9400 c9400M27099 = m27099(c9400);
                    int i2 = c9400M27099 == null ? 0 : c9400M27099.f30505;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listMo20143.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m27104(((InterfaceC3939) it.next()).getOffset() + i2, iArr));
                    }
                    c17098 = new C17098(arrayList, ((InterfaceC3939) listMo20143.get(0)).getKey());
                }
                c9400.f30510 = c17098;
                c17098.f39755 = c9400;
                return;
            case 35:
                List<InterfaceC3939> listMo20144 = ((InterfaceC0846) interfaceC23331).mo20143();
                if (listMo20144.size() == 0) {
                    c16352 = new C16352(null);
                } else {
                    C9400 c9400M270910 = m27099(c9400);
                    int i3 = c9400M270910 != null ? c9400M270910.f30505 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC3939 interfaceC3939 : listMo20144) {
                        arrayList2.add(new C22563(interfaceC3939.getKey(), m27104(interfaceC3939.getOffset() + i3, iArr)));
                    }
                    c16352 = new C16352(arrayList2);
                }
                c9400.f30510 = c16352;
                c16352.f39755 = c9400;
                return;
            case 36:
                InterfaceC9904 interfaceC9904 = (InterfaceC9904) interfaceC23331;
                C16595 c16595 = new C16595(interfaceC9904.mo3032(), interfaceC9904.mo3034());
                c9400.f30510 = c16595;
                c16595.f39755 = c9400;
                return;
            default:
                throw new C23044(null, "Instruction format %s not supported", interfaceC23331.mo30864().f73508);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C9400 m27099(C9400 c9400) {
        AbstractC12384 abstractC12384;
        C9400 c9401 = null;
        do {
            for (C21335 c21335 : (C7910) c9400.m24747()) {
                if (c21335 instanceof C4663) {
                    if (c9401 != null) {
                        throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                    }
                    c9401 = ((C4663) c21335).f16471;
                }
            }
            int i = c9400.f30506;
            if (i == 0) {
                break;
            }
            c9400 = (C9400) this.f33712.get(i - 1);
            abstractC12384 = c9400.f30510;
            if (abstractC12384 == null) {
                break;
            }
        } while (abstractC12384.f39756 == EnumC22631.f73424);
        return c9401;
    }
}
