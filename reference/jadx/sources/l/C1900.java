package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.֫ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1900 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f7170;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20889[] f7171;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC0489[] f7172;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f7173;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15682 f7174;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f7175;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f7176;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f7177;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f7178;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f7179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f7180;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f7181;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f7182;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C20889 f7183;

    public C1900(AbstractC0489[] abstractC0489Arr, C20889 c20889, C15682 c15682, int i, int i2, int i3) {
        boolean z;
        AbstractC0489[] abstractC0489Arr2 = abstractC0489Arr;
        this.f7172 = abstractC0489Arr2;
        this.f7183 = c20889;
        this.f7174 = c15682;
        int i4 = C12859.f42771;
        C15682 unused = c20889.m46951().f12082;
        this.f7181 = i;
        this.f7179 = i2;
        this.f7175 = i3;
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        arrayList.add(c20889);
        identityHashMap.put(c20889, 0);
        int length = abstractC0489Arr2.length;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = false;
        while (i5 < length) {
            AbstractC0489 abstractC0489 = abstractC0489Arr2[i5];
            if (abstractC0489 instanceof C6134) {
                C6134 c6134 = (C6134) abstractC0489;
                z3 = c6134.f20946.m35225() ? false : z3;
                if (c6134.f20941) {
                    z4 = false;
                }
            } else if (abstractC0489 instanceof C11074) {
                C11074 c11074 = (C11074) abstractC0489;
                C7545 c7545 = c11074.f37586;
                if (c7545 != null) {
                    for (C20889 c208810 : c7545.f25046) {
                        if (c208810 != null && !identityHashMap.containsKey(c208810)) {
                            identityHashMap.put(c208810, Integer.valueOf(arrayList.size()));
                            arrayList.add(c208810);
                        }
                    }
                    z2 = true;
                }
                if (c11074.f37585.isEmpty() && ((c7545 != null || c11074.f37588.f30687.length != 0) && ((z = c11074.f37583) || !c11074.f37587 || c7545 != null))) {
                    z5 = true;
                    if (z) {
                        z6 = true;
                    }
                }
            }
            i5++;
            abstractC0489Arr2 = abstractC0489Arr;
        }
        this.f7171 = (C20889[]) arrayList.toArray(new C20889[0]);
        this.f7176 = identityHashMap;
        this.f7170 = z2;
        this.f7180 = z3;
        this.f7177 = z3 && z4;
        this.f7182 = z4;
        boolean z7 = z3 && z4 && z5;
        this.f7178 = z7;
        this.f7173 = z7 && z6;
    }

    /* JADX WARN: Code duplicated, block: B:287:0x072d  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C1900 m6195(C20889 c20889) {
        boolean z;
        int i;
        C13565 c13565;
        ArrayList arrayList;
        AbstractC0489[] abstractC0489Arr;
        int i2;
        AbstractC0489 c17423;
        AbstractC0489 abstractC0489M6194;
        C15682 c15682M46955;
        C7545 c7545;
        C23774 c23774;
        int i3;
        int i4;
        IdentityHashMap identityHashMap;
        IdentityHashMap identityHashMap2;
        C16718 c16718M39207;
        C13638.requireNonNull(c20889, am.N);
        c20889.m46959();
        C13565 c13565M31875 = C12859.m31875(c20889);
        ArrayList arrayList2 = new ArrayList();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        IdentityHashMap identityHashMap4 = new IdentityHashMap();
        arrayList2.add(new C10368(c20889, c20889, c20889.m46968(), null));
        int i5 = 0;
        identityHashMap3.put(c20889, 0);
        int i6 = 0;
        while (true) {
            int i7 = 2;
            int i8 = 1;
            if (i6 >= arrayList2.size()) {
                byte b = 1;
                byte[] bArr = new byte[arrayList2.size()];
                ArrayDeque arrayDeque = new ArrayDeque();
                int i9 = 0;
                while (i9 < arrayList2.size()) {
                    if (bArr[i9] == 0) {
                        bArr[i9] = b;
                        arrayDeque.push(new C16013(i9));
                        while (!arrayDeque.isEmpty()) {
                            C16013 c16013 = (C16013) arrayDeque.peek();
                            C10368 c10368 = (C10368) arrayList2.get(c16013.f51831);
                            C20951 c20951 = c10368.f35532;
                            int[] iArr = c10368.f35529;
                            int length = c20951 == null ? iArr.length : Math.min(2, iArr.length);
                            if ((c10368.f35531 instanceof C19478) || (i4 = c16013.f51833) == length) {
                                bArr[c16013.f51831] = 2;
                                arrayDeque.pop();
                            } else {
                                c16013.f51833 = i4 + 1;
                                int i10 = iArr[i4];
                                byte b2 = bArr[i10];
                                if (b2 == 1) {
                                    throw m6193(((C10368) arrayList2.get(i10)).f35531, "Cyclic eager syntax structure");
                                }
                                if (b2 == 0) {
                                    bArr[i10] = 1;
                                    arrayDeque.push(new C16013(i10));
                                }
                            }
                        }
                    }
                    i9++;
                    b = 1;
                }
                int size = arrayList2.size();
                C3399[] c3399Arr = new C3399[size];
                byte[] bArr2 = new byte[arrayList2.size()];
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC6839 abstractC6839 = ((C10368) arrayList2.get(i11)).f35531;
                    if (abstractC6839 instanceof C10037) {
                        c3399Arr[i11] = ((C10037) abstractC6839).m25330().m22407();
                        bArr2[i11] = 2;
                    } else if (abstractC6839 instanceof C17797) {
                        c3399Arr[i11] = ((C17797) abstractC6839).m41375().m47832();
                        bArr2[i11] = 2;
                    }
                }
                ArrayDeque arrayDeque2 = new ArrayDeque();
                for (int i12 = 0; i12 < size; i12++) {
                    if (bArr2[i12] == 0) {
                        bArr2[i12] = 1;
                        arrayDeque2.push(new C16013(i12));
                        while (!arrayDeque2.isEmpty()) {
                            C16013 c16014 = (C16013) arrayDeque2.peek();
                            C10368 c10369 = (C10368) arrayList2.get(c16014.f51831);
                            int length2 = c10369.f35529.length;
                            AbstractC6839 abstractC68310 = c10369.f35531;
                            if ((abstractC68310 instanceof C7214) || ((abstractC68310 instanceof C8189) && ((C8189) abstractC68310).m21481() != 2)) {
                                length2 = Math.min(length2, 1);
                            }
                            if (c16014.f51833 == length2 || c16014.f51832.m10081()) {
                                int i13 = c16014.f51831;
                                c3399Arr[i13] = c16014.f51832;
                                bArr2[i13] = 2;
                                arrayDeque2.pop();
                            } else {
                                int[] iArr2 = c10369.f35529;
                                int i14 = c16014.f51833;
                                int i15 = iArr2[i14];
                                byte b3 = bArr2[i15];
                                if (b3 == 0) {
                                    bArr2[i15] = 1;
                                    arrayDeque2.push(new C16013(i15));
                                } else {
                                    c16014.f51833 = i14 + 1;
                                    c16014.f51832 = c16014.f51832.m10078(b3 == 1 ? C3399.f12541 : c3399Arr[i15]);
                                }
                            }
                        }
                    }
                }
                int size2 = arrayList2.size();
                AbstractC0489[] abstractC0489Arr2 = new AbstractC0489[size2];
                int i16 = 0;
                while (i16 < size2) {
                    C10368 c103610 = (C10368) arrayList2.get(i16);
                    C3399 c3399 = c3399Arr[i16];
                    C20889 c208810 = c103610.f35530;
                    C20951 c20952 = c103610.f35532;
                    int[] iArr3 = c103610.f35529;
                    AbstractC6839 abstractC68311 = c103610.f35531;
                    if (abstractC68311 instanceof C10037) {
                        C10037 c10037 = (C10037) abstractC68311;
                        List listM25329 = c10037.m25329();
                        int[] iArr4 = new int[listM25329.size()];
                        C15682[] c15682Arr = new C15682[listM25329.size()];
                        C23006[] c23006Arr = new C23006[listM25329.size()];
                        int i17 = 0;
                        while (i17 < listM25329.size()) {
                            C12154 c12154 = (C12154) listM25329.get(i17);
                            iArr4[i17] = c12154.f40680;
                            int i18 = size2;
                            if (c12154.f40679.startsWith("parseColor(")) {
                                C23006 c23006M30236 = c12154.m30236();
                                c23006Arr[i17] = c23006M30236;
                                int iM50880 = c23006M30236.m50880();
                                c15682Arr[i17] = iM50880 == 0 ? C15682.f50915 : c208810.m46955(iM50880);
                            } else {
                                c15682Arr[i17] = c208810.m46955(c12154.f40677);
                            }
                            i17++;
                            size2 = i18;
                        }
                        i = size2;
                        C8626 c8626M25330 = c10037.m25330();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List listM25334 = c10037.m25334();
                        int i19 = 0;
                        c13565 = c13565M31875;
                        while (i19 < listM25334.size()) {
                            ((ArrayList) C9735.computeIfAbsent(linkedHashMap, Integer.valueOf(((C23068) listM25334.get(i19)).m51041()), new C19540(0))).add(Integer.valueOf(iArr3[i19]));
                            i19++;
                            listM25334 = listM25334;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        C14602[] c14602Arr = new C14602[linkedHashMap.size()];
                        Iterator it = linkedHashMap.entrySet().iterator();
                        int i20 = 0;
                        int i21 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            int size3 = ((ArrayList) entry.getValue()).size();
                            Iterator it2 = it;
                            int[] iArr5 = new int[size3];
                            AbstractC0489[] abstractC0489Arr3 = abstractC0489Arr2;
                            int i22 = 0;
                            while (i22 < size3) {
                                iArr5[i22] = ((Integer) ((ArrayList) entry.getValue()).get(i22)).intValue();
                                i22++;
                                i16 = i16;
                            }
                            c14602Arr[i20] = new C14602(((Integer) entry.getKey()).intValue(), i21, iArr5);
                            i21 += size3;
                            i20++;
                            it = it2;
                            abstractC0489Arr2 = abstractC0489Arr3;
                            i16 = i16;
                        }
                        abstractC0489Arr = abstractC0489Arr2;
                        i2 = i16;
                        abstractC0489M6194 = new C6134(c8626M25330, iArr4, c15682Arr, c23006Arr, c14602Arr, c10037.m25321(), c208810.m46951().f12082);
                    } else {
                        i = size2;
                        c13565 = c13565M31875;
                        arrayList = arrayList2;
                        abstractC0489Arr = abstractC0489Arr2;
                        i2 = i16;
                        if (abstractC68311 instanceof C17797) {
                            C17797 c17797 = (C17797) abstractC68311;
                            abstractC0489M6194 = new C12485(c17797.m41375().m47830(), c208810.m46955(c17797.m41379()));
                        } else {
                            boolean z2 = abstractC68311 instanceof C19478;
                            if (z2 || (abstractC68311 instanceof C14189)) {
                                c17423 = new C17423(iArr3[0], z2, c3399);
                            } else if (abstractC68311 instanceof C8189) {
                                C8189 c8189 = (C8189) abstractC68311;
                                int iM21481 = c8189.m21481();
                                int iM21482 = c8189.m21482();
                                c17423 = new C20246(iM21481, iArr3, iM21482 == 0 ? C15682.f50915 : c208810.m46955(iM21482), c3399);
                            } else if (abstractC68311 instanceof C7214) {
                                C7214 c7214 = (C7214) abstractC68311;
                                int length3 = c20952 == null ? iArr3.length - 2 : 0;
                                boolean zM19173 = c7214.m19173();
                                int iMin = Math.min(c20952 == null ? length3 : 1, c7214.m19166());
                                int i23 = c20952 == null ? length3 + (!zM19173 ? 1 : 0) : 0;
                                int[] iArr6 = new int[i23];
                                int i24 = 2;
                                for (int i25 = 0; i25 < i23; i25++) {
                                    if (zM19173 || i25 != iMin) {
                                        i3 = iArr3[i24];
                                        i24++;
                                    } else {
                                        i3 = iArr3[1];
                                    }
                                    iArr6[i25] = i3;
                                }
                                int iM19174 = c7214.m19174();
                                C15682 c15682M46956 = iM19174 == 0 ? C15682.f50915 : c208810.m46955(iM19174);
                                C15682 c15682M46957 = c7214.m19163() == 0 ? c15682M46956 : c208810.m46955(c7214.m19163());
                                BitSet bitSetM19155 = c7214.m19155();
                                if (c20952 == null) {
                                    c7545 = null;
                                } else {
                                    C20889[] c20889Arr = c20952.f68285;
                                    int length4 = c20889Arr.length;
                                    int[] iArr7 = new int[length4];
                                    C20889[] c20889Arr2 = new C20889[length4];
                                    int i26 = 0;
                                    while (i26 < length4) {
                                        int i27 = length4;
                                        int i28 = c20952.f68284[i26];
                                        iArr7[i26] = i28 < 0 ? -1 : iArr3[i28];
                                        c20889Arr2[i26] = c20889Arr[i26];
                                        i26++;
                                        length4 = i27;
                                    }
                                    int iM19175 = c7214.m19175();
                                    if (iM19175 != 0) {
                                        c15682M46955 = c208810.m46955(iM19175);
                                    } else if (c7214.m19163() == 0) {
                                        int iM19176 = c7214.m19174();
                                        c15682M46955 = iM19176 == 0 ? C15682.f50915 : c208810.m46955(iM19176);
                                    } else {
                                        c15682M46955 = c208810.m46955(c7214.m19163());
                                    }
                                    c7545 = new C7545(c20952.f68281, c20952.f68280, c20952.f68282, c20952.f68283, iArr7, c20889Arr2, c15682M46955);
                                }
                                AbstractC6839 abstractC6839M19171 = c7214.m19171();
                                if (abstractC6839M19171 instanceof C10037) {
                                    C10037 c10038 = (C10037) abstractC6839M19171;
                                    if (c10038.m25332().isEmpty()) {
                                        c23774 = null;
                                    } else {
                                        AbstractC6839 abstractC6839M19152 = c7214.m19152();
                                        if (!(abstractC6839M19152 instanceof C10037)) {
                                            throw m6193(c7214, "start exports require a direct end match");
                                        }
                                        C10037 c10039 = (C10037) abstractC6839M19152;
                                        List listM25332 = c10038.m25332();
                                        int[] iArr8 = new int[listM25332.size()];
                                        HashMap map = new HashMap(listM25332.size() * 2);
                                        int i29 = 0;
                                        while (i29 < listM25332.size()) {
                                            C1487 c1487 = (C1487) listM25332.get(i29);
                                            iArr8[i29] = c1487.m5133();
                                            map.put(c1487.m5134(), Integer.valueOf(i29));
                                            i29++;
                                            listM25332 = listM25332;
                                        }
                                        List listM22413 = c10039.m25330().m22413();
                                        int size4 = listM22413.size();
                                        int[] iArr9 = new int[size4];
                                        int i30 = 0;
                                        while (i30 < size4) {
                                            List list = listM22413;
                                            String str = (String) listM22413.get(i30);
                                            Integer num = (Integer) map.get(str);
                                            if (num == null) {
                                                throw m6193(c7214, C0252.m1693("Undefined scope variable: ", str));
                                            }
                                            iArr9[i30] = num.intValue();
                                            i30++;
                                            listM22413 = list;
                                        }
                                        c23774 = new C23774(iArr8, iArr9, c10039.m25330());
                                    }
                                } else {
                                    c23774 = null;
                                }
                                abstractC0489M6194 = new C11074(iArr3[0], iArr3[1], m6194(iArr6, c3399Arr), c15682M46956, c15682M46957, zM19173, c7214.m19172(), iMin, bitSetM19155 == null ? new BitSet() : (BitSet) bitSetM19155.clone(), c7545, c23774, c3399);
                            } else {
                                abstractC0489M6194 = m6194(iArr3, c3399Arr);
                            }
                            abstractC0489M6194 = c17423;
                        }
                    }
                    abstractC0489Arr[i2] = abstractC0489M6194;
                    i16 = i2 + 1;
                    size2 = i;
                    c13565M31875 = c13565;
                    arrayList2 = arrayList;
                    abstractC0489Arr2 = abstractC0489Arr;
                }
                C13565 c13566 = c13565M31875;
                ArrayList arrayList3 = arrayList2;
                AbstractC0489[] abstractC0489Arr4 = abstractC0489Arr2;
                C15682 c15682M46969 = c20889.m46969();
                int iMax = Math.max(8, Math.min(64, arrayList3.size()));
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((C10368) it3.next()).f35532 != null) {
                        z = true;
                        break;
                    }
                }
                int iHashCode = c20889.hashCode();
                if (z) {
                    iHashCode = (iHashCode * 31) + 1162691140;
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        C20951 c20953 = ((C10368) it4.next()).f35532;
                        if (c20953 != null) {
                            C20889[] c20889Arr3 = c20953.f68285;
                            iHashCode = (iHashCode * 31) + c20889Arr3.length;
                            int length5 = c20889Arr3.length;
                            for (int i31 = 0; i31 < length5; i31++) {
                                C20889 c208811 = c20889Arr3[i31];
                                iHashCode = (iHashCode * 31) + (c208811 == null ? 0 : 1);
                                if (c208811 != null) {
                                    iHashCode = c208811.hashCode() + (iHashCode * 31);
                                }
                            }
                        }
                    }
                }
                return new C1900(abstractC0489Arr4, c20889, c15682M46969, iMax, iHashCode, c13566.m33158());
            }
            C10368 c103611 = (C10368) arrayList2.get(i6);
            int i32 = 0;
            while (i32 < c103611.f35529.length) {
                AbstractC6839 abstractC68312 = (AbstractC6839) c103611.f35528.get(i32);
                Integer numValueOf = (Integer) identityHashMap3.get(abstractC68312);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(arrayList2.size());
                    identityHashMap3.put(abstractC68312, numValueOf);
                    boolean z3 = abstractC68312 instanceof C20889;
                    final C20889 c208812 = z3 ? (C20889) abstractC68312 : c103611.f35530;
                    if (z3) {
                        C20889 c208813 = (C20889) abstractC68312;
                        c208813.m46959();
                        c16718M39207 = C16718.m39207(c208813.m46968());
                    } else if (abstractC68312 instanceof C19478) {
                        try {
                            Object[] objArr = new Object[i8];
                            objArr[i5] = c208812.m46962(((C19478) abstractC68312).m44540());
                            ArrayList arrayList4 = new ArrayList(i8);
                            Object obj = objArr[i5];
                            C13638.requireNonNull(obj);
                            arrayList4.add(obj);
                            c16718M39207 = C16718.m39207(C0561.unmodifiableList(arrayList4));
                        } catch (RuntimeException e) {
                            throw m6193(abstractC68312, e.getMessage());
                        }
                    } else if (abstractC68312 instanceof C14189) {
                        try {
                            Object[] objArr2 = new Object[i8];
                            objArr2[0] = (AbstractC6839) C9735.computeIfAbsent((Map) C9735.computeIfAbsent(identityHashMap4, c208812, new C18834(i5)), ((C14189) abstractC68312).m34281(), new Function() { // from class: l.۠ܶۚ
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo33696andThen(Function function) {
                                    return C4277.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C4277.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return C12859.m31874((AbstractC6839) c208812, (String) obj2);
                                }
                            });
                            ArrayList arrayList5 = new ArrayList(i8);
                            Object obj2 = objArr2[0];
                            C13638.requireNonNull(obj2);
                            arrayList5.add(obj2);
                            c16718M39207 = C16718.m39207(C0561.unmodifiableList(arrayList5));
                        } catch (RuntimeException e2) {
                            throw m6193(abstractC68312, e2.getMessage());
                        }
                    } else if (abstractC68312 instanceof C21594) {
                        C21594 c21594 = (C21594) abstractC68312;
                        if (c21594.m48307().isEmpty()) {
                            throw m6193(abstractC68312, "Empty competition");
                        }
                        c16718M39207 = C16718.m39207(c21594.m48307());
                    } else {
                        if (abstractC68312 instanceof C8189) {
                            C8189 c81810 = (C8189) abstractC68312;
                            if (c81810.m21481() < 0 || c81810.m21481() > i7) {
                                throw m6193(c81810, "Invalid group type");
                            }
                            c16718M39207 = C16718.m39207(c81810.m21484());
                        } else if (abstractC68312 instanceof C7214) {
                            C7214 c7215 = (C7214) abstractC68312;
                            C4660 c4660M19153 = c7215.m19153();
                            if (c4660M19153 != null) {
                                C4660 c4660M12857 = c4660M19153.m12857(c208812);
                                int iM12861 = c4660M12857.m12861();
                                int i33 = (!c4660M12857.m12859() || c4660M12857.m12860() == null) ? -1 : iM12861;
                                int i34 = c4660M12857.m12859() ? iM12861 + (i33 < 0 ? 0 : 1) : 1;
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList6 = new ArrayList(i34 + 2);
                                AbstractC6839 abstractC6839M19172 = c7215.m19171();
                                C13638.requireNonNull(abstractC6839M19172, "start");
                                arrayList6.add(abstractC6839M19172);
                                AbstractC6839 abstractC6839M19153 = c7215.m19152();
                                C13638.requireNonNull(abstractC6839M19153, "end");
                                arrayList6.add(abstractC6839M19153);
                                C20889[] c20889Arr4 = new C20889[i34];
                                int[] iArr10 = new int[i34];
                                String[] strArr = c4660M12857.m12859() ? new String[iM12861] : null;
                                int i35 = 0;
                                while (i35 < i34) {
                                    String strM12862 = c4660M12857.m12859() ? i35 < iM12861 ? c4660M12857.m12862(i35) : c4660M12857.m12860() : c4660M12857.m12854();
                                    C13638.requireNonNull(strM12862);
                                    C20889 c20889M33159 = c13565M31875.m33159(strM12862);
                                    c20889Arr4[i35] = c20889M33159;
                                    if (c4660M12857.m12859() && i35 < iM12861) {
                                        strArr[i35] = c4660M12857.m12856(i35);
                                    }
                                    if (c20889M33159 == null) {
                                        iArr10[i35] = -1;
                                    } else {
                                        iArr10[i35] = arrayList6.size();
                                        arrayList6.add(c20889M33159);
                                    }
                                    i35++;
                                }
                                c16718M39207 = new C16718(arrayList6, new C20951(c4660M12857.m12859() ? c4660M12857.m12855() : -1, c4660M12857.m12863(), strArr, i33, c20889Arr4, iArr10));
                            } else {
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList7 = new ArrayList(((ArrayList) c7215.m19161()).size() + 2);
                                AbstractC6839 abstractC6839M19173 = c7215.m19171();
                                C13638.requireNonNull(abstractC6839M19173, "start");
                                arrayList7.add(abstractC6839M19173);
                                AbstractC6839 abstractC6839M19154 = c7215.m19152();
                                C13638.requireNonNull(abstractC6839M19154, "end");
                                arrayList7.add(abstractC6839M19154);
                                arrayList7.addAll(c7215.m19161());
                                c16718M39207 = C16718.m39207(arrayList7);
                            }
                        } else {
                            identityHashMap = identityHashMap3;
                            identityHashMap2 = identityHashMap4;
                            if (abstractC68312 instanceof C10037) {
                                C10037 c100310 = (C10037) abstractC68312;
                                ArrayList arrayList8 = new ArrayList(c100310.m25334().size());
                                Iterator it5 = c100310.m25334().iterator();
                                while (it5.hasNext()) {
                                    arrayList8.add(((C23068) it5.next()).m51043());
                                }
                                c16718M39207 = C16718.m39207(arrayList8);
                            } else {
                                if (!(abstractC68312 instanceof C17797)) {
                                    throw m6193(abstractC68312, "Unknown syntax rule");
                                }
                                c16718M39207 = C16718.m39207(Collections.EMPTY_LIST);
                            }
                        }
                        arrayList2.add(new C10368(c208812, abstractC68312, c16718M39207.f53549, c16718M39207.f53548));
                    }
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                    arrayList2.add(new C10368(c208812, abstractC68312, c16718M39207.f53549, c16718M39207.f53548));
                } else {
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                }
                c103611.f35529[i32] = numValueOf.intValue();
                i32++;
                i5 = 0;
                i7 = 2;
                i8 = 1;
                identityHashMap3 = identityHashMap;
                identityHashMap4 = identityHashMap2;
            }
            i6++;
            i5 = 0;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m6197() {
        return this.f7179;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m6204() {
        return !this.f7170 || C12859.m31892(this.f7175);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m6206() {
        return this.f7170;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6199() {
        return this.f7171.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20889 m6202(int i) {
        C20889[] c20889Arr = this.f7171;
        return c20889Arr[C13638.checkIndex(i, c20889Arr.length)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6200(C20889 c20889) {
        Integer num = (Integer) this.f7176.get(c20889);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12237 m6201(CharSequence charSequence, InterfaceC5614 interfaceC5614) {
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        return new C12237(this, charSequence, interfaceC5614);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m6198() {
        return this.f7180;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m6205() {
        return this.f7177;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m6196() {
        return this.f7182;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m6207() {
        return this.f7178;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m6203() {
        return this.f7173;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8957 m6194(int[] iArr, C3399[] c3399Arr) {
        int length = iArr.length;
        C3399[] c3399Arr2 = new C3399[length];
        C3399 c3399M10078 = C3399.f12540;
        for (int i = 0; i < length; i++) {
            C3399 c3399 = c3399Arr[iArr[i]];
            c3399Arr2[i] = c3399;
            c3399M10078 = c3399M10078.m10078(c3399);
        }
        return new C8957(iArr, c3399Arr2, c3399M10078);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m6193(AbstractC6839 abstractC6839, String str) {
        String str2;
        StringBuilder sbM8976 = C3012.m8976(str, ": ");
        sbM8976.append(abstractC6839.getClass().getSimpleName());
        if (abstractC6839.f23038 == null) {
            str2 = "";
        } else {
            str2 = " at " + abstractC6839.f23038;
        }
        sbM8976.append(str2);
        return new IllegalArgumentException(sbM8976.toString());
    }
}
