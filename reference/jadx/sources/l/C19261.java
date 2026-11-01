package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1LP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19261 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44206(CharSequence charSequence, CharSequence charSequence2, InterfaceC10587 interfaceC10587, InterfaceC10587 interfaceC10588, EnumC8678 enumC8678, EnumC15734 enumC15734, C16936 c16936) {
        InterfaceC10587 interfaceC10589 = interfaceC10587;
        InterfaceC13409 interfaceC13409M23876 = C9301.m23876(m44205(0, interfaceC10587.mo20433(), charSequence, interfaceC10589), m44205(0, interfaceC10588.mo20433(), charSequence2, interfaceC10588), enumC8678, c16936);
        ArrayList<InterfaceC19759> arrayList = new ArrayList();
        Iterator itMo11890 = interfaceC13409M23876.mo11886().f31762.mo11890();
        while (itMo11890.hasNext()) {
            C20464 c20464 = (C20464) itMo11890.next();
            int i = c20464.f66401;
            int i2 = c20464.f66399;
            int i3 = c20464.f66400;
            int i4 = c20464.f66402;
            C16231 c16231M44209 = m44209(interfaceC10589, i, i3);
            C16231 c16231M442010 = m44209(interfaceC10588, i2, i4);
            arrayList.add(new C9176(i, i3, i2, i4, c16231M44209.f52359, c16231M44209.f52360, c16231M442010.f52359, c16231M442010.f52360, null));
            interfaceC10589 = interfaceC10587;
        }
        if (enumC15734 == EnumC15734.NONE) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i5 = 0;
        for (InterfaceC19759 interfaceC19759 : arrayList) {
            try {
                arrayList2.addAll(m44208(interfaceC19759, charSequence, charSequence2, enumC8678, enumC15734, c16936, i5 < 3));
            } catch (C20672 unused) {
                arrayList2.add(interfaceC19759);
                i5++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m44208(InterfaceC19759 interfaceC19759, CharSequence charSequence, CharSequence charSequence2, EnumC8678 enumC8678, EnumC15734 enumC15734, C16936 c16936, boolean z) {
        InterfaceC4941 interfaceC4941M15900;
        InterfaceC4941 interfaceC4941M33298;
        if (enumC15734 == EnumC15734.NONE) {
            return Collections.singletonList(interfaceC19759);
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(interfaceC19759.mo22124(), interfaceC19759.mo22126());
        CharSequence charSequenceSubSequence2 = charSequence2.subSequence(interfaceC19759.mo22129(), interfaceC19759.mo22123());
        if (interfaceC19759.mo23602() == interfaceC19759.mo23600() || interfaceC19759.mo23598() == interfaceC19759.mo23594()) {
            if (C7266.m19396(charSequenceSubSequence, charSequenceSubSequence2, enumC8678)) {
                return Collections.singletonList(new C9176(interfaceC19759, Collections.EMPTY_LIST));
            }
            return Collections.singletonList(interfaceC19759);
        }
        if (!z) {
            return Collections.singletonList(interfaceC19759);
        }
        if (enumC15734 == EnumC15734.WORDS) {
            c16936.m39631();
            ArrayList arrayListM10945 = C3737.m10945(charSequenceSubSequence);
            ArrayList arrayListM10946 = C3737.m10945(charSequenceSubSequence2);
            InterfaceC13409 interfaceC13409M42950 = new C17849(C1413.m4943(arrayListM10945, arrayListM10946, c16936), charSequenceSubSequence, charSequenceSubSequence2, arrayListM10945, arrayListM10946).m42950();
            ArrayList<C0210> arrayListM38707 = new C16439(interfaceC13409M42950, charSequenceSubSequence, charSequenceSubSequence2, arrayListM10945, arrayListM10946).m38707();
            ArrayList arrayList = new ArrayList(arrayListM38707.size());
            for (C0210 c0210 : arrayListM38707) {
                C20464 c20464 = c0210.f1378;
                C20464 c20465 = c0210.f1379;
                int i = c20465.f66401;
                CharSequence charSequenceSubSequence3 = charSequenceSubSequence.subSequence(c20464.f66401, c20464.f66400);
                CharSequence charSequenceSubSequence4 = charSequenceSubSequence2.subSequence(c20464.f66399, c20464.f66402);
                int i2 = c20465.f66402;
                int i3 = c20465.f66399;
                int i4 = c20465.f66400;
                List listSubList = arrayListM10945.subList(i, i4);
                List listSubList2 = arrayListM10946.subList(i3, i2);
                ArrayList arrayList2 = arrayListM10945;
                InterfaceC13409 interfaceC13409 = interfaceC13409M42950;
                ArrayList arrayList3 = arrayList;
                InterfaceC13409 interfaceC13409M12400 = new C4443(charSequenceSubSequence3, charSequenceSubSequence4, listSubList, listSubList2, c20464.f66401, c20464.f66399, C1413.m4944(C1413.m4942(interfaceC13409M42950, i, i4, i3, i2)), c16936).m12400();
                int i5 = C2949.f11054[enumC8678.ordinal()];
                if (i5 == 1) {
                    interfaceC4941M33298 = new C13617(interfaceC13409M12400, charSequenceSubSequence3, charSequenceSubSequence4).m33298();
                } else if (i5 == 2) {
                    interfaceC4941M33298 = new C0915(new C13617(interfaceC13409M12400, charSequenceSubSequence3, charSequenceSubSequence4).m33298(), charSequenceSubSequence3, charSequenceSubSequence4).m3636();
                } else if (i5 == 3) {
                    interfaceC4941M33298 = new C11500(interfaceC13409M12400, charSequenceSubSequence3, charSequenceSubSequence4).m28690();
                } else {
                    throw new IllegalArgumentException(enumC8678.name());
                }
                ArrayList arrayListM44207 = m44207(interfaceC4941M33298);
                Iterator it = listSubList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    if (((InterfaceC2326) it.next()) instanceof C22083) {
                        i6++;
                    }
                }
                Iterator it2 = listSubList2.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    if (((InterfaceC2326) it2.next()) instanceof C22083) {
                        i7++;
                    }
                }
                arrayList3.add(new C5149(arrayListM44207, c20464, i6, i7));
                arrayListM10945 = arrayList2;
                arrayList = arrayList3;
                interfaceC13409M42950 = interfaceC13409;
            }
            ArrayList arrayList4 = arrayList;
            int iMo22124 = interfaceC19759.mo22124();
            int iMo22129 = interfaceC19759.mo22129();
            int iMo23602 = interfaceC19759.mo23602();
            int iMo23598 = interfaceC19759.mo23598();
            ArrayList arrayList5 = new ArrayList();
            int i8 = 0;
            int i9 = iMo23602;
            int i10 = iMo23598;
            while (i8 < arrayList4.size()) {
                C5149 c5149 = (C5149) arrayList4.get(i8);
                C20464 c20466 = c5149.f17883;
                int iMo23600 = i8 != arrayList4.size() + (-1) ? c5149.f17886 + i9 : interfaceC19759.mo23600();
                int iMo23594 = i8 != arrayList4.size() + (-1) ? c5149.f17885 + i10 : interfaceC19759.mo23594();
                arrayList5.add(new C9176(i9, iMo23600, i10, iMo23594, c20466.f66401 + iMo22124, c20466.f66400 + iMo22124, c20466.f66399 + iMo22129, c20466.f66402 + iMo22129, c5149.f17884));
                i8++;
                iMo22124 = iMo22124;
                i9 = iMo23600;
                i10 = iMo23594;
            }
            return arrayList5;
        }
        if (enumC15734 != EnumC15734.CHARS) {
            throw new IllegalArgumentException(enumC15734.name());
        }
        if (enumC8678 == EnumC8678.DEFAULT) {
            interfaceC4941M15900 = C5772.m15894(charSequenceSubSequence, charSequenceSubSequence2, c16936);
        } else if (enumC8678 == EnumC8678.TRIM_WHITESPACES) {
            interfaceC4941M15900 = new C0915(C5772.m15894(charSequenceSubSequence, charSequenceSubSequence2, c16936), charSequenceSubSequence, charSequenceSubSequence2).m3636();
        } else {
            interfaceC4941M15900 = C5772.m15900(charSequenceSubSequence, charSequenceSubSequence2, c16936);
        }
        return Collections.singletonList(new C9176(interfaceC19759, m44207(interfaceC4941M15900)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44207(InterfaceC4941 interfaceC4941) {
        ArrayList arrayList = new ArrayList();
        Iterator itMo11890 = interfaceC4941.mo11886().f31762.mo11890();
        while (itMo11890.hasNext()) {
            C20464 c20464 = (C20464) itMo11890.next();
            arrayList.add(new C8470(c20464.f66401, c20464.f66400, c20464.f66399, c20464.f66402));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16231 m44209(InterfaceC10587 interfaceC10587, int i, int i2) {
        int iMo20435;
        if (i == i2) {
            if (i < interfaceC10587.mo20433()) {
                iMo20435 = interfaceC10587.mo20436(i);
            } else {
                iMo20435 = interfaceC10587.mo20435(interfaceC10587.mo20433() - 1);
            }
            return new C16231(iMo20435, iMo20435);
        }
        return new C16231(interfaceC10587.mo20436(i), interfaceC10587.mo20435(i2 - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44205(int i, int i2, CharSequence charSequence, InterfaceC10587 interfaceC10587) {
        ArrayList arrayList = new ArrayList(i2 - i);
        while (i < i2) {
            arrayList.add(new C5025(interfaceC10587.mo20436(i), interfaceC10587.mo20434(i), charSequence));
            i++;
        }
        return arrayList;
    }
}
