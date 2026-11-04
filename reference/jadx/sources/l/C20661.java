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

/* JADX INFO: renamed from: l.᩵ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20661 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC2016[] f66252;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f66253;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f66254;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f66255;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f66256;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f66257;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f66258;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f66259;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f66260;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f66261;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11974 f66262;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f66263;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16800[] f66264;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16800 f66265;

    public C20661(AbstractC2016[] abstractC2016Arr, C16800 c16800, C11974 c11974, int i, int i2, int i3) {
        boolean z;
        AbstractC2016[] abstractC2016Arr2 = abstractC2016Arr;
        this.f66252 = abstractC2016Arr2;
        this.f66265 = c16800;
        this.f66262 = c11974;
        int i4 = C9341.f30354;
        C11974 unused = c16800.m39684().f45884;
        this.f66261 = i;
        this.f66260 = i2;
        this.f66256 = i3;
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        arrayList.add(c16800);
        identityHashMap.put(c16800, 0);
        int length = abstractC2016Arr2.length;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = false;
        while (i5 < length) {
            AbstractC2016 abstractC2016 = abstractC2016Arr2[i5];
            if (abstractC2016 instanceof C17677) {
                C17677 c17677 = (C17677) abstractC2016;
                z3 = c17677.f58085.m42929() ? false : z3;
                if (c17677.f58086) {
                    z4 = false;
                }
            } else if (abstractC2016 instanceof C16185) {
                C16185 c16185 = (C16185) abstractC2016;
                C19915 c19915 = c16185.f52535;
                if (c19915 != null) {
                    for (C16800 c16801 : c19915.f64074) {
                        if (c16801 != null && !identityHashMap.containsKey(c16801)) {
                            identityHashMap.put(c16801, Integer.valueOf(arrayList.size()));
                            arrayList.add(c16801);
                        }
                    }
                    z2 = true;
                }
                if (c16185.f52528.isEmpty() && ((c19915 != null || c16185.f52530.f34639.length != 0) && ((z = c16185.f52532) || !c16185.f52531 || c19915 != null))) {
                    z5 = true;
                    if (z) {
                        z6 = true;
                    }
                }
            }
            i5++;
            abstractC2016Arr2 = abstractC2016Arr;
        }
        this.f66264 = (C16800[]) arrayList.toArray(new C16800[0]);
        this.f66255 = identityHashMap;
        this.f66257 = z2;
        this.f66259 = z3;
        this.f66254 = z3 && z4;
        this.f66258 = z4;
        boolean z7 = z3 && z4 && z5;
        this.f66263 = z7;
        this.f66253 = z7 && z6;
    }

    /* JADX WARN: Code duplicated, block: B:288:0x072a  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C20661 m47275(C16800 c16800) {
        boolean z;
        C18292 c18292;
        ArrayList arrayList;
        int i;
        AbstractC2016[] abstractC2016Arr;
        int i2;
        AbstractC2016 c16931;
        C11974 c11974M39679;
        C19915 c19915;
        C23645 c23645;
        int i3;
        int i4;
        IdentityHashMap identityHashMap;
        IdentityHashMap identityHashMap2;
        char c;
        final C16800 c16801;
        C11710 c11710M29387;
        C17359.requireNonNull(c16800, am.N);
        c16800.m39677();
        C18292 c18292M24594 = C9341.m24594(c16800);
        ArrayList arrayList2 = new ArrayList();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        IdentityHashMap identityHashMap4 = new IdentityHashMap();
        arrayList2.add(new C22899(c16800, c16800, c16800.m39688(), null));
        identityHashMap3.put(c16800, 0);
        int i5 = 0;
        while (true) {
            int i6 = 2;
            int i7 = 1;
            if (i5 >= arrayList2.size()) {
                byte b = 1;
                byte[] bArr = new byte[arrayList2.size()];
                ArrayDeque arrayDeque = new ArrayDeque();
                int i8 = 0;
                while (i8 < arrayList2.size()) {
                    if (bArr[i8] == 0) {
                        bArr[i8] = b;
                        arrayDeque.push(new C13202(i8));
                        while (!arrayDeque.isEmpty()) {
                            C13202 c13202 = (C13202) arrayDeque.peek();
                            C22899 c22899 = (C22899) arrayList2.get(c13202.f42157);
                            C15439 c15439 = c22899.f74387;
                            int[] iArr = c22899.f74384;
                            int length = c15439 == null ? iArr.length : Math.min(2, iArr.length);
                            if ((c22899.f74385 instanceof C15308) || (i4 = c13202.f42159) == length) {
                                bArr[c13202.f42157] = 2;
                                arrayDeque.pop();
                            } else {
                                c13202.f42159 = i4 + 1;
                                int i9 = iArr[i4];
                                byte b2 = bArr[i9];
                                if (b2 == 1) {
                                    throw m47273(((C22899) arrayList2.get(i9)).f74385, "Cyclic eager syntax structure");
                                }
                                if (b2 == 0) {
                                    bArr[i9] = 1;
                                    arrayDeque.push(new C13202(i9));
                                }
                            }
                        }
                    }
                    i8++;
                    b = 1;
                }
                int size = arrayList2.size();
                C19161[] c19161Arr = new C19161[size];
                byte[] bArr2 = new byte[arrayList2.size()];
                for (int i10 = 0; i10 < size; i10++) {
                    AbstractC2805 abstractC2805 = ((C22899) arrayList2.get(i10)).f74385;
                    if (abstractC2805 instanceof C13466) {
                        c19161Arr[i10] = ((C13466) abstractC2805).m33116().m37498();
                        bArr2[i10] = 2;
                    } else if (abstractC2805 instanceof C22417) {
                        c19161Arr[i10] = ((C22417) abstractC2805).m50563().m15852();
                        bArr2[i10] = 2;
                    }
                }
                ArrayDeque arrayDeque2 = new ArrayDeque();
                for (int i11 = 0; i11 < size; i11++) {
                    if (bArr2[i11] == 0) {
                        bArr2[i11] = 1;
                        arrayDeque2.push(new C13202(i11));
                        while (!arrayDeque2.isEmpty()) {
                            C13202 c13203 = (C13202) arrayDeque2.peek();
                            C22899 c228910 = (C22899) arrayList2.get(c13203.f42157);
                            int length2 = c228910.f74384.length;
                            AbstractC2805 abstractC2806 = c228910.f74385;
                            if ((abstractC2806 instanceof C6009) || ((abstractC2806 instanceof C19784) && ((C19784) abstractC2806).m45566() != 2)) {
                                length2 = Math.min(length2, 1);
                            }
                            if (c13203.f42159 == length2 || c13203.f42158.m44416()) {
                                int i12 = c13203.f42157;
                                c19161Arr[i12] = c13203.f42158;
                                bArr2[i12] = 2;
                                arrayDeque2.pop();
                            } else {
                                int[] iArr2 = c228910.f74384;
                                int i13 = c13203.f42159;
                                int i14 = iArr2[i13];
                                byte b3 = bArr2[i14];
                                if (b3 == 0) {
                                    bArr2[i14] = 1;
                                    arrayDeque2.push(new C13202(i14));
                                } else {
                                    c13203.f42159 = i13 + 1;
                                    c13203.f42158 = c13203.f42158.m44410(b3 == 1 ? C19161.f61997 : c19161Arr[i14]);
                                }
                            }
                        }
                    }
                }
                int size2 = arrayList2.size();
                AbstractC2016[] abstractC2016Arr2 = new AbstractC2016[size2];
                int i15 = 0;
                while (i15 < size2) {
                    C22899 c228911 = (C22899) arrayList2.get(i15);
                    C19161 c19161 = c19161Arr[i15];
                    C16800 c16802 = c228911.f74386;
                    C15439 c154310 = c228911.f74387;
                    int[] iArr3 = c228911.f74384;
                    AbstractC2805 abstractC2807 = c228911.f74385;
                    if (abstractC2807 instanceof C13466) {
                        C13466 c13466 = (C13466) abstractC2807;
                        List listM33120 = c13466.m33120();
                        int[] iArr4 = new int[listM33120.size()];
                        C11974[] c11974Arr = new C11974[listM33120.size()];
                        C4868[] c4868Arr = new C4868[listM33120.size()];
                        int i16 = 0;
                        while (i16 < listM33120.size()) {
                            C16449 c16449 = (C16449) listM33120.get(i16);
                            iArr4[i16] = c16449.f53346;
                            int i17 = size2;
                            if (c16449.f53343.startsWith("parseColor(")) {
                                C4868 c4868M39004 = c16449.m39004();
                                c4868Arr[i16] = c4868M39004;
                                int iM14924 = c4868M39004.m14924();
                                c11974Arr[i16] = iM14924 == 0 ? C11974.f38541 : c16802.m39679(iM14924);
                            } else {
                                c11974Arr[i16] = c16802.m39679(c16449.f53345);
                            }
                            i16++;
                            size2 = i17;
                        }
                        i = size2;
                        C15703 c15703M33116 = c13466.m33116();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List listM33119 = c13466.m33119();
                        int i18 = 0;
                        c18292 = c18292M24594;
                        while (i18 < listM33119.size()) {
                            ((ArrayList) C11392.computeIfAbsent(linkedHashMap, Integer.valueOf(((C8771) listM33119.get(i18)).m23468()), new C15431(2))).add(Integer.valueOf(iArr3[i18]));
                            i18++;
                            listM33119 = listM33119;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        C3507[] c3507Arr = new C3507[linkedHashMap.size()];
                        Iterator it = linkedHashMap.entrySet().iterator();
                        int i19 = 0;
                        int i20 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            int size3 = ((ArrayList) entry.getValue()).size();
                            Iterator it2 = it;
                            int[] iArr5 = new int[size3];
                            AbstractC2016[] abstractC2016Arr3 = abstractC2016Arr2;
                            int i21 = 0;
                            while (i21 < size3) {
                                iArr5[i21] = ((Integer) ((ArrayList) entry.getValue()).get(i21)).intValue();
                                i21++;
                                i15 = i15;
                            }
                            c3507Arr[i19] = new C3507(((Integer) entry.getKey()).intValue(), i20, iArr5);
                            i20 += size3;
                            i19++;
                            it = it2;
                            abstractC2016Arr2 = abstractC2016Arr3;
                            i15 = i15;
                        }
                        abstractC2016Arr = abstractC2016Arr2;
                        i2 = i15;
                        c16931 = new C17677(c15703M33116, iArr4, c11974Arr, c4868Arr, c3507Arr, c13466.m33118(), c16802.m39684().f45884);
                    } else {
                        c18292 = c18292M24594;
                        arrayList = arrayList2;
                        i = size2;
                        abstractC2016Arr = abstractC2016Arr2;
                        i2 = i15;
                        if (abstractC2807 instanceof C22417) {
                            C22417 c22417 = (C22417) abstractC2807;
                            c16931 = new C25137(c22417.m50563().m15848(), c16802.m39679(c22417.m50561()));
                        } else {
                            boolean z2 = abstractC2807 instanceof C15308;
                            if (z2 || (abstractC2807 instanceof C14278)) {
                                c16931 = new C16931(iArr3[0], z2, c19161);
                            } else if (abstractC2807 instanceof C19784) {
                                C19784 c19784 = (C19784) abstractC2807;
                                int iM45566 = c19784.m45566();
                                int iM45564 = c19784.m45564();
                                c16931 = new C5745(iM45566, iArr3, iM45564 == 0 ? C11974.f38541 : c16802.m39679(iM45564), c19161);
                            } else if (abstractC2807 instanceof C6009) {
                                C6009 c6009 = (C6009) abstractC2807;
                                int length3 = c154310 == null ? iArr3.length - 2 : 0;
                                boolean zM17474 = c6009.m17474();
                                int iMin = Math.min(c154310 == null ? length3 : 1, c6009.m17465());
                                int i22 = c154310 == null ? length3 + (!zM17474 ? 1 : 0) : 0;
                                int[] iArr6 = new int[i22];
                                int i23 = 2;
                                for (int i24 = 0; i24 < i22; i24++) {
                                    if (zM17474 || i24 != iMin) {
                                        i3 = iArr3[i23];
                                        i23++;
                                    } else {
                                        i3 = iArr3[1];
                                    }
                                    iArr6[i24] = i3;
                                }
                                int iM17471 = c6009.m17471();
                                C11974 c11974M396710 = iM17471 == 0 ? C11974.f38541 : c16802.m39679(iM17471);
                                C11974 c11974M396711 = c6009.m17466() == 0 ? c11974M396710 : c16802.m39679(c6009.m17466());
                                BitSet bitSetM17459 = c6009.m17459();
                                if (c154310 == null) {
                                    c19915 = null;
                                } else {
                                    C16800[] c16800Arr = c154310.f50290;
                                    int length4 = c16800Arr.length;
                                    int[] iArr7 = new int[length4];
                                    C16800[] c16800Arr2 = new C16800[length4];
                                    int i25 = 0;
                                    while (i25 < length4) {
                                        int i26 = length4;
                                        int i27 = c154310.f50292[i25];
                                        iArr7[i25] = i27 < 0 ? -1 : iArr3[i27];
                                        c16800Arr2[i25] = c16800Arr[i25];
                                        i25++;
                                        length4 = i26;
                                    }
                                    int iM17482 = c6009.m17482();
                                    if (iM17482 != 0) {
                                        c11974M39679 = c16802.m39679(iM17482);
                                    } else if (c6009.m17466() == 0) {
                                        int iM17472 = c6009.m17471();
                                        c11974M39679 = iM17472 == 0 ? C11974.f38541 : c16802.m39679(iM17472);
                                    } else {
                                        c11974M39679 = c16802.m39679(c6009.m17466());
                                    }
                                    c19915 = new C19915(c154310.f50288, c154310.f50293, c154310.f50291, c154310.f50289, iArr7, c16800Arr2, c11974M39679);
                                }
                                AbstractC2805 abstractC2805M17473 = c6009.m17473();
                                if (abstractC2805M17473 instanceof C13466) {
                                    C13466 c13467 = (C13466) abstractC2805M17473;
                                    if (c13467.m33121().isEmpty()) {
                                        c23645 = null;
                                    } else {
                                        AbstractC2805 abstractC2805M17470 = c6009.m17470();
                                        if (!(abstractC2805M17470 instanceof C13466)) {
                                            throw m47273(c6009, "start exports require a direct end match");
                                        }
                                        C13466 c13468 = (C13466) abstractC2805M17470;
                                        List listM33121 = c13467.m33121();
                                        int[] iArr8 = new int[listM33121.size()];
                                        HashMap map = new HashMap(listM33121.size() * 2);
                                        for (int i28 = 0; i28 < listM33121.size(); i28++) {
                                            C20992 c20992 = (C20992) listM33121.get(i28);
                                            iArr8[i28] = c20992.m47979();
                                            map.put(c20992.m47980(), Integer.valueOf(i28));
                                        }
                                        List listM37495 = c13468.m33116().m37495();
                                        int size4 = listM37495.size();
                                        int[] iArr9 = new int[size4];
                                        int i29 = 0;
                                        while (i29 < size4) {
                                            List list = listM37495;
                                            String str = (String) listM37495.get(i29);
                                            Integer num = (Integer) map.get(str);
                                            if (num == null) {
                                                throw m47273(c6009, C25272.m56409("Undefined scope variable: ", str));
                                            }
                                            iArr9[i29] = num.intValue();
                                            i29++;
                                            listM37495 = list;
                                        }
                                        c23645 = new C23645(iArr8, iArr9, c13468.m33116());
                                    }
                                } else {
                                    c23645 = null;
                                }
                                c16931 = new C16185(iArr3[0], iArr3[1], m47274(iArr6, c19161Arr), c11974M396710, c11974M396711, zM17474, c6009.m17472(), iMin, bitSetM17459 == null ? new BitSet() : (BitSet) bitSetM17459.clone(), c19915, c23645, c19161);
                            } else {
                                c16931 = m47274(iArr3, c19161Arr);
                            }
                            abstractC2016Arr[i2] = c16931;
                            i15 = i2 + 1;
                            size2 = i;
                            c18292M24594 = c18292;
                            arrayList2 = arrayList;
                            abstractC2016Arr2 = abstractC2016Arr;
                        }
                    }
                    abstractC2016Arr[i2] = c16931;
                    i15 = i2 + 1;
                    size2 = i;
                    c18292M24594 = c18292;
                    arrayList2 = arrayList;
                    abstractC2016Arr2 = abstractC2016Arr;
                }
                C18292 c18293 = c18292M24594;
                ArrayList arrayList3 = arrayList2;
                AbstractC2016[] abstractC2016Arr4 = abstractC2016Arr2;
                C11974 c11974M39685 = c16800.m39685();
                int iMax = Math.max(8, Math.min(64, arrayList3.size()));
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((C22899) it3.next()).f74387 != null) {
                        z = true;
                        break;
                    }
                }
                int iHashCode = c16800.hashCode();
                if (z) {
                    iHashCode = (iHashCode * 31) + 1162691140;
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        C15439 c154311 = ((C22899) it4.next()).f74387;
                        if (c154311 != null) {
                            C16800[] c16800Arr3 = c154311.f50290;
                            iHashCode = (iHashCode * 31) + c16800Arr3.length;
                            int length5 = c16800Arr3.length;
                            for (int i30 = 0; i30 < length5; i30++) {
                                C16800 c16803 = c16800Arr3[i30];
                                iHashCode = (iHashCode * 31) + (c16803 == null ? 0 : 1);
                                if (c16803 != null) {
                                    iHashCode = c16803.hashCode() + (iHashCode * 31);
                                }
                            }
                        }
                    }
                }
                return new C20661(abstractC2016Arr4, c16800, c11974M39685, iMax, iHashCode, c18293.m42618());
            }
            C22899 c228912 = (C22899) arrayList2.get(i5);
            int i31 = 0;
            while (i31 < c228912.f74384.length) {
                AbstractC2805 abstractC2808 = (AbstractC2805) c228912.f74388.get(i31);
                Integer numValueOf = (Integer) identityHashMap3.get(abstractC2808);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(arrayList2.size());
                    identityHashMap3.put(abstractC2808, numValueOf);
                    boolean z3 = abstractC2808 instanceof C16800;
                    if (z3) {
                        c16801 = (C16800) abstractC2808;
                        c = 0;
                    } else {
                        c = 0;
                        c16801 = c228912.f74386;
                    }
                    if (z3) {
                        C16800 c16804 = (C16800) abstractC2808;
                        c16804.m39677();
                        c11710M29387 = C11710.m29387(c16804.m39688());
                    } else if (abstractC2808 instanceof C15308) {
                        try {
                            Object[] objArr = new Object[i7];
                            objArr[c] = c16801.m39690(((C15308) abstractC2808).m36764());
                            ArrayList arrayList4 = new ArrayList(i7);
                            Object obj = objArr[c];
                            C17359.requireNonNull(obj);
                            arrayList4.add(obj);
                            c11710M29387 = C11710.m29387(C4681.unmodifiableList(arrayList4));
                        } catch (RuntimeException e) {
                            throw m47273(abstractC2808, e.getMessage());
                        }
                    } else if (abstractC2808 instanceof C14278) {
                        try {
                            Object[] objArr2 = new Object[i7];
                            objArr2[c] = (AbstractC2805) C11392.computeIfAbsent((Map) C11392.computeIfAbsent(identityHashMap4, c16801, new C24125(i7)), ((C14278) abstractC2808).m34691(), new Function() { // from class: l.᩷ܶᩴ
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo10608andThen(Function function) {
                                    return C24247.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C24247.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return C9341.m24592((AbstractC2805) c16801, (String) obj2);
                                }
                            });
                            ArrayList arrayList5 = new ArrayList(i7);
                            Object obj2 = objArr2[c];
                            C17359.requireNonNull(obj2);
                            arrayList5.add(obj2);
                            c11710M29387 = C11710.m29387(C4681.unmodifiableList(arrayList5));
                        } catch (RuntimeException e2) {
                            throw m47273(abstractC2808, e2.getMessage());
                        }
                    } else if (abstractC2808 instanceof C22022) {
                        C22022 c22022 = (C22022) abstractC2808;
                        if (c22022.m49805().isEmpty()) {
                            throw m47273(abstractC2808, "Empty competition");
                        }
                        c11710M29387 = C11710.m29387(c22022.m49805());
                    } else {
                        if (abstractC2808 instanceof C19784) {
                            C19784 c19785 = (C19784) abstractC2808;
                            if (c19785.m45566() < 0 || c19785.m45566() > i6) {
                                throw m47273(c19785, "Invalid group type");
                            }
                            c11710M29387 = C11710.m29387(c19785.m45567());
                        } else if (abstractC2808 instanceof C6009) {
                            C6009 c60010 = (C6009) abstractC2808;
                            C7567 c7567M17480 = c60010.m17480();
                            if (c7567M17480 != null) {
                                C7567 c7567M20671 = c7567M17480.m20671(c16801);
                                int iM20676 = c7567M20671.m20676();
                                int i32 = (!c7567M20671.m20675() || c7567M20671.m20673() == null) ? -1 : iM20676;
                                int i33 = c7567M20671.m20675() ? iM20676 + (i32 < 0 ? 0 : 1) : 1;
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList6 = new ArrayList(i33 + 2);
                                AbstractC2805 abstractC2805M17474 = c60010.m17473();
                                C17359.requireNonNull(abstractC2805M17474, "start");
                                arrayList6.add(abstractC2805M17474);
                                AbstractC2805 abstractC2805M17471 = c60010.m17470();
                                C17359.requireNonNull(abstractC2805M17471, "end");
                                arrayList6.add(abstractC2805M17471);
                                C16800[] c16800Arr4 = new C16800[i33];
                                int[] iArr10 = new int[i33];
                                String[] strArr = c7567M20671.m20675() ? new String[iM20676] : null;
                                int i34 = 0;
                                while (i34 < i33) {
                                    String strM20677 = c7567M20671.m20675() ? i34 < iM20676 ? c7567M20671.m20677(i34) : c7567M20671.m20673() : c7567M20671.m20678();
                                    C17359.requireNonNull(strM20677);
                                    C16800 c16800M42619 = c18292M24594.m42619(strM20677);
                                    c16800Arr4[i34] = c16800M42619;
                                    if (c7567M20671.m20675() && i34 < iM20676) {
                                        strArr[i34] = c7567M20671.m20670(i34);
                                    }
                                    if (c16800M42619 == null) {
                                        iArr10[i34] = -1;
                                    } else {
                                        iArr10[i34] = arrayList6.size();
                                        arrayList6.add(c16800M42619);
                                    }
                                    i34++;
                                }
                                c11710M29387 = new C11710(arrayList6, new C15439(c7567M20671.m20675() ? c7567M20671.m20669() : -1, c7567M20671.m20674(), strArr, i32, c16800Arr4, iArr10));
                            } else {
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList7 = new ArrayList(((ArrayList) c60010.m17475()).size() + 2);
                                AbstractC2805 abstractC2805M17475 = c60010.m17473();
                                C17359.requireNonNull(abstractC2805M17475, "start");
                                arrayList7.add(abstractC2805M17475);
                                AbstractC2805 abstractC2805M17472 = c60010.m17470();
                                C17359.requireNonNull(abstractC2805M17472, "end");
                                arrayList7.add(abstractC2805M17472);
                                arrayList7.addAll(c60010.m17475());
                                c11710M29387 = C11710.m29387(arrayList7);
                            }
                        } else {
                            identityHashMap = identityHashMap3;
                            identityHashMap2 = identityHashMap4;
                            if (abstractC2808 instanceof C13466) {
                                C13466 c13469 = (C13466) abstractC2808;
                                ArrayList arrayList8 = new ArrayList(c13469.m33119().size());
                                Iterator it5 = c13469.m33119().iterator();
                                while (it5.hasNext()) {
                                    arrayList8.add(((C8771) it5.next()).m23470());
                                }
                                c11710M29387 = C11710.m29387(arrayList8);
                            } else {
                                if (!(abstractC2808 instanceof C22417)) {
                                    throw m47273(abstractC2808, "Unknown syntax rule");
                                }
                                c11710M29387 = C11710.m29387(Collections.EMPTY_LIST);
                            }
                        }
                        arrayList2.add(new C22899(c16801, abstractC2808, c11710M29387.f37891, c11710M29387.f37890));
                    }
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                    arrayList2.add(new C22899(c16801, abstractC2808, c11710M29387.f37891, c11710M29387.f37890));
                } else {
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                }
                c228912.f74384[i31] = numValueOf.intValue();
                i31++;
                i6 = 2;
                i7 = 1;
                identityHashMap3 = identityHashMap;
                identityHashMap4 = identityHashMap2;
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m47287() {
        return this.f66260;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m47282() {
        return !this.f66257 || C9341.m24611(this.f66256);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m47286() {
        return this.f66257;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47277() {
        return this.f66264.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16800 m47280(int i) {
        C16800[] c16800Arr = this.f66264;
        return c16800Arr[C17359.checkIndex(i, c16800Arr.length)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47278(C16800 c16800) {
        Integer num = (Integer) this.f66255.get(c16800);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16207 m47279(CharSequence charSequence, InterfaceC7509 interfaceC7509) {
        C17359.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        return new C16207(this, charSequence, interfaceC7509);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47276() {
        return this.f66259;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m47281() {
        return this.f66254;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m47283() {
        return this.f66258;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m47284() {
        return this.f66263;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m47285() {
        return this.f66253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10964 m47274(int[] iArr, C19161[] c19161Arr) {
        int length = iArr.length;
        C19161[] c19161Arr2 = new C19161[length];
        C19161 c19161M44410 = C19161.f61998;
        for (int i = 0; i < length; i++) {
            C19161 c19161 = c19161Arr[iArr[i]];
            c19161Arr2[i] = c19161;
            c19161M44410 = c19161M44410.m44410(c19161);
        }
        return new C10964(iArr, c19161Arr2, c19161M44410);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m47273(AbstractC2805 abstractC2805, String str) {
        String str2;
        StringBuilder sbM10405 = C3188.m10405(str, ": ");
        sbM10405.append(abstractC2805.getClass().getSimpleName());
        if (abstractC2805.f9224 == null) {
            str2 = "";
        } else {
            str2 = " at " + abstractC2805.f9224;
        }
        sbM10405.append(str2);
        return new IllegalArgumentException(sbM10405.toString());
    }
}
