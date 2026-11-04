package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8441 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22626(CharSequence charSequence, CharSequence charSequence2, InterfaceC14186 interfaceC14186, InterfaceC14186 interfaceC14187, EnumC6950 enumC6950, EnumC11203 enumC11203, C15087 c15087) {
        InterfaceC14186 interfaceC14188 = interfaceC14186;
        InterfaceC21646 interfaceC21646M37877 = C15899.m37877(m22625(0, interfaceC14186.mo14499(), charSequence, interfaceC14188), m22625(0, interfaceC14187.mo14499(), charSequence2, interfaceC14187), enumC6950, c15087);
        ArrayList<InterfaceC8966> arrayList = new ArrayList();
        Iterator itMo3129 = interfaceC21646M37877.mo3127().f53297.mo3129();
        while (itMo3129.hasNext()) {
            C22547 c22547 = (C22547) itMo3129.next();
            int i = c22547.f72892;
            int i2 = c22547.f72894;
            int i3 = c22547.f72891;
            int i4 = c22547.f72893;
            C10612 c10612M22629 = m22629(interfaceC14188, i, i3);
            C10612 c10612M226210 = m22629(interfaceC14187, i2, i4);
            arrayList.add(new C7475(i, i3, i2, i4, c10612M22629.f33696, c10612M22629.f33697, c10612M226210.f33696, c10612M226210.f33697, null));
            interfaceC14188 = interfaceC14186;
        }
        if (enumC11203 == EnumC11203.NONE) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i5 = 0;
        for (InterfaceC8966 interfaceC8966 : arrayList) {
            try {
                arrayList2.addAll(m22628(interfaceC8966, charSequence, charSequence2, enumC6950, enumC11203, c15087, i5 < 3));
            } catch (C22392 unused) {
                arrayList2.add(interfaceC8966);
                i5++;
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m22628(InterfaceC8966 interfaceC8966, CharSequence charSequence, CharSequence charSequence2, EnumC6950 enumC6950, EnumC11203 enumC11203, C15087 c15087, boolean z) {
        InterfaceC3746 interfaceC3746M6134;
        InterfaceC3746 interfaceC3746M46791;
        if (enumC11203 == EnumC11203.NONE) {
            return Collections.singletonList(interfaceC8966);
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(interfaceC8966.mo9807(), interfaceC8966.mo9796());
        CharSequence charSequenceSubSequence2 = charSequence2.subSequence(interfaceC8966.mo9803(), interfaceC8966.mo9801());
        if (interfaceC8966.mo20528() == interfaceC8966.mo20522() || interfaceC8966.mo20524() == interfaceC8966.mo20518()) {
            if (C5238.m15738(charSequenceSubSequence, charSequenceSubSequence2, enumC6950)) {
                return Collections.singletonList(new C7475(interfaceC8966, Collections.EMPTY_LIST));
            }
            return Collections.singletonList(interfaceC8966);
        }
        if (!z) {
            return Collections.singletonList(interfaceC8966);
        }
        if (enumC11203 == EnumC11203.WORDS) {
            c15087.m36345();
            ArrayList arrayListM42250 = C18137.m42250(charSequenceSubSequence);
            ArrayList arrayListM42251 = C18137.m42250(charSequenceSubSequence2);
            InterfaceC21646 interfaceC21646M24309 = new C0984(C14932.m35914(arrayListM42250, arrayListM42251, c15087), charSequenceSubSequence, charSequenceSubSequence2, arrayListM42250, arrayListM42251).m24309();
            ArrayList<C20154> arrayListM37448 = new C15678(interfaceC21646M24309, charSequenceSubSequence, charSequenceSubSequence2, arrayListM42250, arrayListM42251).m37448();
            ArrayList arrayList = new ArrayList(arrayListM37448.size());
            for (C20154 c20154 : arrayListM37448) {
                C22547 c22547 = c20154.f64751;
                C22547 c22548 = c20154.f64752;
                int i = c22548.f72892;
                CharSequence charSequenceSubSequence3 = charSequenceSubSequence.subSequence(c22547.f72892, c22547.f72891);
                CharSequence charSequenceSubSequence4 = charSequenceSubSequence2.subSequence(c22547.f72894, c22547.f72893);
                int i2 = c22548.f72893;
                int i3 = c22548.f72894;
                int i4 = c22548.f72891;
                List listSubList = arrayListM42250.subList(i, i4);
                List listSubList2 = arrayListM42251.subList(i3, i2);
                ArrayList arrayList2 = arrayListM42250;
                InterfaceC21646 interfaceC21646 = interfaceC21646M24309;
                ArrayList arrayList3 = arrayList;
                InterfaceC21646 interfaceC21646M10570 = new C3221(charSequenceSubSequence3, charSequenceSubSequence4, listSubList, listSubList2, c22547.f72892, c22547.f72894, C14932.m35915(C14932.m35913(interfaceC21646M24309, i, i4, i3, i2)), c15087).m10570();
                int i5 = C23359.f75645[enumC6950.ordinal()];
                if (i5 == 1) {
                    interfaceC3746M46791 = new C20375(interfaceC21646M10570, charSequenceSubSequence3, charSequenceSubSequence4).m46791();
                } else if (i5 == 2) {
                    interfaceC3746M46791 = new C14407(new C20375(interfaceC21646M10570, charSequenceSubSequence3, charSequenceSubSequence4).m46791(), charSequenceSubSequence3, charSequenceSubSequence4).m34847();
                } else if (i5 == 3) {
                    interfaceC3746M46791 = new C12170(interfaceC21646M10570, charSequenceSubSequence3, charSequenceSubSequence4).m30435();
                } else {
                    throw new IllegalArgumentException(enumC6950.name());
                }
                ArrayList arrayListM22627 = m22627(interfaceC3746M46791);
                Iterator it = listSubList.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    if (((InterfaceC6205) it.next()) instanceof C3967) {
                        i6++;
                    }
                }
                Iterator it2 = listSubList2.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    if (((InterfaceC6205) it2.next()) instanceof C3967) {
                        i7++;
                    }
                }
                arrayList3.add(new C24105(arrayListM22627, c22547, i6, i7));
                arrayListM42250 = arrayList2;
                arrayList = arrayList3;
                interfaceC21646M24309 = interfaceC21646;
            }
            ArrayList arrayList4 = arrayList;
            int iMo9807 = interfaceC8966.mo9807();
            int iMo9803 = interfaceC8966.mo9803();
            int iMo20528 = interfaceC8966.mo20528();
            int iMo20524 = interfaceC8966.mo20524();
            ArrayList arrayList5 = new ArrayList();
            int i8 = 0;
            int i9 = iMo20528;
            int i10 = iMo20524;
            while (i8 < arrayList4.size()) {
                C24105 c24105 = (C24105) arrayList4.get(i8);
                C22547 c22549 = c24105.f77932;
                int iMo20522 = i8 != arrayList4.size() + (-1) ? c24105.f77931 + i9 : interfaceC8966.mo20522();
                int iMo20518 = i8 != arrayList4.size() + (-1) ? c24105.f77930 + i10 : interfaceC8966.mo20518();
                arrayList5.add(new C7475(i9, iMo20522, i10, iMo20518, c22549.f72892 + iMo9807, c22549.f72891 + iMo9807, c22549.f72894 + iMo9803, c22549.f72893 + iMo9803, c24105.f77929));
                i8++;
                iMo9807 = iMo9807;
                i9 = iMo20522;
                i10 = iMo20518;
            }
            return arrayList5;
        }
        if (enumC11203 != EnumC11203.CHARS) {
            throw new IllegalArgumentException(enumC11203.name());
        }
        if (enumC6950 == EnumC6950.DEFAULT) {
            interfaceC3746M6134 = C1730.m6136(charSequenceSubSequence, charSequenceSubSequence2, c15087);
        } else if (enumC6950 == EnumC6950.TRIM_WHITESPACES) {
            interfaceC3746M6134 = new C14407(C1730.m6136(charSequenceSubSequence, charSequenceSubSequence2, c15087), charSequenceSubSequence, charSequenceSubSequence2).m34847();
        } else {
            interfaceC3746M6134 = C1730.m6134(charSequenceSubSequence, charSequenceSubSequence2, c15087);
        }
        return Collections.singletonList(new C7475(interfaceC8966, m22627(interfaceC3746M6134)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22627(InterfaceC3746 interfaceC3746) {
        ArrayList arrayList = new ArrayList();
        Iterator itMo3129 = interfaceC3746.mo3127().f53297.mo3129();
        while (itMo3129.hasNext()) {
            C22547 c22547 = (C22547) itMo3129.next();
            arrayList.add(new C3000(c22547.f72892, c22547.f72891, c22547.f72894, c22547.f72893));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10612 m22629(InterfaceC14186 interfaceC14186, int i, int i2) {
        int iMo14501;
        if (i == i2) {
            if (i < interfaceC14186.mo14499()) {
                iMo14501 = interfaceC14186.mo14502(i);
            } else {
                iMo14501 = interfaceC14186.mo14501(interfaceC14186.mo14499() - 1);
            }
            return new C10612(iMo14501, iMo14501);
        }
        return new C10612(interfaceC14186.mo14502(i), interfaceC14186.mo14501(i2 - 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m22625(int i, int i2, CharSequence charSequence, InterfaceC14186 interfaceC14186) {
        ArrayList arrayList = new ArrayList(i2 - i);
        while (i < i2) {
            arrayList.add(new C3901(interfaceC14186.mo14502(i), interfaceC14186.mo14500(i), charSequence));
            i++;
        }
        return arrayList;
    }
}
