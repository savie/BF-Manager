package l;

import bin.mt.json.JSONObject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ܽ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N75Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C17931 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f58740;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Set f58741;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Set f58742;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f58743;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Set f58744;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Set f58745;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Set f58746;

    static {
        Object[] objArr = {"function_symbol", "executable_symbol", "requested_address"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C17359.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj));
            }
        }
        f58743 = C4681.unmodifiableSet(hashSet);
        Object[] objArr2 = {"function_symbol", "executable_symbol", "executable_mapping"};
        HashSet hashSet2 = new HashSet(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Object obj2 = objArr2[i2];
            C17359.requireNonNull(obj2);
            if (!hashSet2.add(obj2)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj2));
            }
        }
        f58740 = C4681.unmodifiableSet(hashSet2);
        Object[] objArr3 = {"fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary"};
        HashSet hashSet3 = new HashSet(8);
        for (int i3 = 0; i3 < 8; i3++) {
            Object obj3 = objArr3[i3];
            C17359.requireNonNull(obj3);
            if (!hashSet3.add(obj3)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj3));
            }
        }
        f58742 = C4681.unmodifiableSet(hashSet3);
        Object[] objArr4 = {"fallthrough", "branch_true", "branch_false", "jump"};
        HashSet hashSet4 = new HashSet(4);
        for (int i4 = 0; i4 < 4; i4++) {
            Object obj4 = objArr4[i4];
            C17359.requireNonNull(obj4);
            if (!hashSet4.add(obj4)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj4));
            }
        }
        f58745 = C4681.unmodifiableSet(hashSet4);
        Object[] objArr5 = {"outside_function_boundary", "other_function_symbol"};
        HashSet hashSet5 = new HashSet(2);
        for (int i5 = 0; i5 < 2; i5++) {
            Object obj5 = objArr5[i5];
            C17359.requireNonNull(obj5);
            if (!hashSet5.add(obj5)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj5));
            }
        }
        f58741 = C4681.unmodifiableSet(hashSet5);
        Object[] objArr6 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction"};
        HashSet hashSet6 = new HashSet(7);
        for (int i6 = 0; i6 < 7; i6++) {
            Object obj6 = objArr6[i6];
            C17359.requireNonNull(obj6);
            if (!hashSet6.add(obj6)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj6));
            }
        }
        f58744 = C4681.unmodifiableSet(hashSet6);
        Object[] objArr7 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition"};
        HashSet hashSet7 = new HashSet(3);
        for (int i7 = 0; i7 < 3; i7++) {
            Object obj7 = objArr7[i7];
            C17359.requireNonNull(obj7);
            if (!hashSet7.add(obj7)) {
                throw new IllegalArgumentException(C14483.m34971("duplicate element: ", obj7));
            }
        }
        f58746 = C4681.unmodifiableSet(hashSet7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:352:0x0672  */
    /* JADX WARN: Code duplicated, block: B:375:0x069e  */
    /* JADX WARN: Code duplicated, block: B:376:0x06a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41867(C5033 c5033, C17185 c17185, C10077 c10077) throws C10186 {
        HashSet hashSet;
        HashSet hashSet2;
        char c;
        String str = c17185.f56010;
        long j = c17185.f56015;
        C2270 c2270M7704 = C2270.m7704(str);
        String strM26896 = C10472.m26896(c2270M7704, c10077);
        long j2 = c10077.f32304;
        boolean zEquals = "virtual".equals(c10077.f32306);
        if (zEquals && "thumb".equals(strM26896)) {
            j2 &= -2;
        }
        String strM7706 = c2270M7704.m7706();
        int iM7705 = c2270M7704.m7705(strM26896);
        try {
            String str2 = c17185.f56010;
            int i = c10077.f32305;
            int i2 = c10077.f32303;
            int i3 = c10077.f32307;
            c5033.getClass();
            C4006 c4006M25416 = C9752.m25416(str2, j2, zEquals, strM7706, iM7705, i, i2, i3);
            C6244 c6244 = c4006M25416.f13688;
            C9007 c9007 = c4006M25416.f13686;
            if (c9007 == null || !strM7706.equals(c4006M25416.f13691) || iM7705 != c4006M25416.f13687) {
                throw C15451.m36986();
            }
            C15451.m36994(c9007);
            if (!c9007.f29351) {
                throw C10186.m26300("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c9007.f29348 || !c9007.f29350) {
                throw C10186.m26300("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not in loaded executable file-backed bytes.");
            }
            if (j >= 0) {
                long j3 = c9007.f29353;
                if (j3 > 0) {
                    long j4 = c9007.f29347;
                    if (j4 < j3) {
                        long j5 = c9007.f29344;
                        if (j5 >= j4) {
                            if (m41866(j5 - j4, j3) <= j) {
                                if (c9007.f29352 != zEquals || c9007.f29345 != j2) {
                                    throw C15451.m36986();
                                }
                                long j6 = c9007.f29349;
                                if (j6 < 0 || (zEquals && j6 != j2)) {
                                    throw C15451.m36986();
                                }
                                if (c6244 != null) {
                                    long j7 = c6244.f21196;
                                    long j8 = c6244.f21199;
                                    String str3 = c6244.f21203;
                                    String str4 = c6244.f21198;
                                    long j9 = c6244.f21197;
                                    String str5 = c6244.f21202;
                                    String str6 = c6244.f21200;
                                    if (j8 >= 0) {
                                        long j10 = c6244.f21201;
                                        if (j10 >= 0 && j10 < j && j7 > 0 && j8 < j7 && j6 >= j8 && j6 < j7 && f58743.contains(str6) && f58740.contains(str5) && j9 >= 0 && str4.length() <= 4096) {
                                            boolean zEquals2 = "requested_address".equals(str6);
                                            if ((!zEquals2) != (j9 > 0) || ((!zEquals2 && str3.isEmpty()) || (zEquals2 && (!str3.isEmpty() || !str4.isEmpty() || j9 != 0 || !"executable_mapping".equals(str5))))) {
                                                throw C15451.m36986();
                                            }
                                            long jM41866 = m41866(j8, j9);
                                            if (!zEquals2 && jM41866 != j7) {
                                                throw C15451.m36986();
                                            }
                                            if ("function_symbol".equals(str6) != "function_symbol".equals(str5) || "executable_symbol".equals(str6) != "executable_symbol".equals(str5)) {
                                                throw C15451.m36986();
                                            }
                                            C23398 c23398 = c4006M25416.f13685;
                                            List list = c4006M25416.f13689;
                                            List list2 = c4006M25416.f13690;
                                            List list3 = c4006M25416.f13684;
                                            List list4 = c4006M25416.f13692;
                                            if (c23398 != null) {
                                                int i4 = c23398.f75739;
                                                int i5 = c23398.f75742;
                                                int i6 = c23398.f75745;
                                                if (i6 >= 0 && i6 <= c10077.f32305 && i5 >= 0 && i5 <= c10077.f32307 && i4 == list4.size() && c23398.f75744 == list2.size() && c23398.f75743 == list.size() && c23398.f75740 == list3.size() && i4 <= c10077.f32303) {
                                                    HashSet hashSet3 = new HashSet();
                                                    HashSet hashSet4 = new HashSet();
                                                    Iterator it = list4.iterator();
                                                    List list5 = list4;
                                                    long j11 = -1;
                                                    int i7 = 0;
                                                    long j12 = 0;
                                                    while (it.hasNext()) {
                                                        Iterator it2 = it;
                                                        C3260 c3260 = (C3260) it.next();
                                                        List list6 = list2;
                                                        List list7 = list3;
                                                        long j13 = c3260.f10597;
                                                        int i8 = i6;
                                                        long j14 = j12;
                                                        long j15 = c3260.f10599;
                                                        int i9 = c3260.f10598;
                                                        List list8 = list;
                                                        HashSet hashSet5 = hashSet4;
                                                        long j16 = c3260.f10595;
                                                        if (j13 >= j8 && j13 < j7 && j15 >= 0 && j16 > 0 && i9 > 0) {
                                                            long j17 = j8;
                                                            if (f58742.contains(c3260.f10596) && hashSet3.add(Long.valueOf(j13))) {
                                                                long jM41867 = m41866(j13, j16);
                                                                long jM41868 = m41866(j15, j16);
                                                                if (jM41867 > j7 || jM41868 > j || (j11 >= 0 && j13 < j11)) {
                                                                    throw C15451.m36986();
                                                                }
                                                                String[] strArrSplit = c3260.f10594.split("\\n", -1);
                                                                if (strArrSplit.length != i9) {
                                                                    throw C15451.m36986();
                                                                }
                                                                int i10 = 0;
                                                                long j18 = -1;
                                                                while (i10 < strArrSplit.length) {
                                                                    String str7 = strArrSplit[i10];
                                                                    long j19 = j;
                                                                    int iIndexOf = str7.indexOf(": ");
                                                                    if (iIndexOf > 2 && str7.indexOf(13) < 0 && str7.indexOf(10) < 0 && str7.startsWith("0x")) {
                                                                        String[] strArr = strArrSplit;
                                                                        if (str7.substring(0, iIndexOf).equals(str7.substring(0, iIndexOf).toLowerCase()) && iIndexOf + 2 < str7.length()) {
                                                                            try {
                                                                                long j20 = Long.parseLong(str7.substring(2, iIndexOf), 16);
                                                                                if (j20 >= j13 && j20 < jM41867 && ((i10 != 0 || j20 == j13) && (j18 < 0 || j20 > j18))) {
                                                                                    HashSet hashSet6 = hashSet5;
                                                                                    if (hashSet6.add(Long.valueOf(j20))) {
                                                                                        i10++;
                                                                                        j18 = j20;
                                                                                        hashSet5 = hashSet6;
                                                                                        j = j19;
                                                                                        strArrSplit = strArr;
                                                                                    }
                                                                                }
                                                                                throw C15451.m36986();
                                                                            } catch (RuntimeException unused) {
                                                                                throw C15451.m36986();
                                                                            }
                                                                        }
                                                                    }
                                                                    throw C15451.m36986();
                                                                }
                                                                long j21 = j;
                                                                HashSet hashSet7 = hashSet5;
                                                                long jM41869 = m41866(j14, j16);
                                                                if (i7 < 0 || i9 < 0 || Integer.MAX_VALUE - i7 < i9) {
                                                                    throw C15451.m36986();
                                                                }
                                                                i7 += i9;
                                                                j12 = jM41869;
                                                                j11 = jM41867;
                                                                hashSet4 = hashSet7;
                                                                list2 = list6;
                                                                it = it2;
                                                                list3 = list7;
                                                                i6 = i8;
                                                                list = list8;
                                                                j8 = j17;
                                                                j = j21;
                                                            }
                                                        }
                                                        throw C15451.m36986();
                                                    }
                                                    long j22 = j8;
                                                    List list9 = list;
                                                    HashSet hashSet8 = hashSet4;
                                                    List list10 = list2;
                                                    List<C24144> list11 = list3;
                                                    if (j12 != i6 || i7 != i5) {
                                                        throw C15451.m36986();
                                                    }
                                                    HashSet hashSet9 = new HashSet();
                                                    Iterator it3 = list10.iterator();
                                                    String str8 = null;
                                                    while (true) {
                                                        boolean zHasNext = it3.hasNext();
                                                        Set set = f58745;
                                                        String str9 = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
                                                        if (zHasNext) {
                                                            C20414 c20414 = (C20414) it3.next();
                                                            long j23 = c20414.f65417;
                                                            String str10 = c20414.f65419;
                                                            long j24 = c20414.f65418;
                                                            if (!hashSet3.contains(Long.valueOf(j23)) || !hashSet3.contains(Long.valueOf(j24)) || !set.contains(str10)) {
                                                                break;
                                                            }
                                                            String str11 = j23 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str10 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + j24;
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(m41868(j23));
                                                            if ("fallthrough".equals(str10)) {
                                                                c = '0';
                                                            } else if ("branch_true".equals(str10)) {
                                                                c = '1';
                                                            } else {
                                                                c = "branch_false".equals(str10) ? '2' : '3';
                                                            }
                                                            sb.append(c);
                                                            sb.append(m41868(j24));
                                                            String string = sb.toString();
                                                            if (!hashSet9.add(str11) || (str8 != null && str8.compareTo(string) > 0)) {
                                                                throw C15451.m36986();
                                                            }
                                                            str8 = string;
                                                        } else {
                                                            HashSet hashSet10 = new HashSet();
                                                            Iterator it4 = list9.iterator();
                                                            String str12 = null;
                                                            while (it4.hasNext()) {
                                                                C12209 c12209 = (C12209) it4.next();
                                                                long j25 = c12209.f39239;
                                                                String str13 = c12209.f39238;
                                                                long j26 = c12209.f39241;
                                                                String str14 = c12209.f39240;
                                                                if (hashSet8.contains(Long.valueOf(j25)) && set.contains(str13) && f58741.contains(str14) && j26 >= 0) {
                                                                    int size = list5.size();
                                                                    Iterator it5 = it4;
                                                                    int i11 = 0;
                                                                    while (i11 < size) {
                                                                        HashSet hashSet11 = hashSet3;
                                                                        int iM18182 = C6421.m18182(size, i11, 2, i11);
                                                                        int i12 = size;
                                                                        List list12 = list5;
                                                                        HashSet hashSet12 = hashSet8;
                                                                        Set set2 = set;
                                                                        String str15 = str9;
                                                                        if (((C3260) list12.get(iM18182)).f10597 <= j26) {
                                                                            i11 = iM18182 + 1;
                                                                        } else {
                                                                            i12 = iM18182;
                                                                        }
                                                                        set = set2;
                                                                        hashSet3 = hashSet11;
                                                                        str9 = str15;
                                                                        hashSet8 = hashSet12;
                                                                        list5 = list12;
                                                                        size = i12;
                                                                    }
                                                                    HashSet hashSet13 = hashSet3;
                                                                    String str16 = str9;
                                                                    HashSet hashSet14 = hashSet8;
                                                                    List list13 = list5;
                                                                    Set set3 = set;
                                                                    if (i11 != 0) {
                                                                        C3260 c3261 = (C3260) list13.get(i11 - 1);
                                                                        if (j26 < m41866(c3261.f10597, c3261.f10595)) {
                                                                        }
                                                                    }
                                                                    if ("outside_function_boundary".equals(str14) && j26 >= j22 && j26 < j7) {
                                                                        throw C15451.m36986();
                                                                    }
                                                                    String str17 = j25 + str16 + str13 + str16 + j26 + str16 + str14;
                                                                    String str18 = m41868(j25) + str14 + m41868(j26);
                                                                    if (!hashSet10.add(str17) || (str12 != null && str12.compareTo(str18) > 0)) {
                                                                        throw C15451.m36986();
                                                                    }
                                                                    str12 = str18;
                                                                    str9 = str16;
                                                                    it4 = it5;
                                                                    set = set3;
                                                                    hashSet8 = hashSet14;
                                                                    list5 = list13;
                                                                    hashSet3 = hashSet13;
                                                                }
                                                                throw C15451.m36986();
                                                            }
                                                            HashSet hashSet15 = hashSet3;
                                                            Set set4 = set;
                                                            String str19 = str9;
                                                            HashSet hashSet16 = hashSet8;
                                                            HashSet hashSet17 = new HashSet();
                                                            String str20 = null;
                                                            for (C24144 c24144 : list11) {
                                                                String str21 = c24144.f78150;
                                                                long j27 = c24144.f78152;
                                                                long j28 = c24144.f78154;
                                                                String str22 = c24144.f78151;
                                                                boolean z = c24144.f78153;
                                                                boolean zEquals3 = "decode".equals(str21);
                                                                boolean zEquals4 = "indirect_jump".equals(str21);
                                                                Set set5 = set4;
                                                                boolean zContains = set5.contains(str21);
                                                                if (!zEquals3) {
                                                                    if (zEquals4) {
                                                                        if (!z && "indirect_target".equals(str22)) {
                                                                            hashSet = hashSet16;
                                                                            if (hashSet.contains(Long.valueOf(j28))) {
                                                                                hashSet2 = hashSet15;
                                                                            }
                                                                        }
                                                                        throw C15451.m36986();
                                                                    }
                                                                    hashSet = hashSet16;
                                                                    if (zContains && z && j27 >= 0 && f58744.contains(str22) && hashSet.contains(Long.valueOf(j28))) {
                                                                        hashSet2 = hashSet15;
                                                                        if (hashSet2.contains(Long.valueOf(j27))) {
                                                                        }
                                                                    }
                                                                    throw C15451.m36986();
                                                                }
                                                                if (z || !"invalid_instruction".equals(str22) || j28 != j22) {
                                                                    throw C15451.m36986();
                                                                }
                                                                hashSet2 = hashSet15;
                                                                hashSet = hashSet16;
                                                                StringBuilder sb2 = new StringBuilder();
                                                                sb2.append(j28);
                                                                sb2.append(str19);
                                                                sb2.append(str21);
                                                                sb2.append(str19);
                                                                hashSet16 = hashSet;
                                                                sb2.append(z ? j27 : -1L);
                                                                sb2.append(str19);
                                                                sb2.append(str22);
                                                                String string2 = sb2.toString();
                                                                StringBuilder sb3 = new StringBuilder();
                                                                sb3.append(m41868(j28));
                                                                sb3.append(str22);
                                                                if (!z) {
                                                                    j27 = -1;
                                                                }
                                                                sb3.append(m41868(j27));
                                                                String string3 = sb3.toString();
                                                                if (!hashSet17.add(string2) || (str20 != null && str20.compareTo(string3) > 0)) {
                                                                    throw C15451.m36986();
                                                                }
                                                                str20 = string3;
                                                                hashSet15 = hashSet2;
                                                                set4 = set5;
                                                            }
                                                            String str23 = c23398.f75741;
                                                            String strM36984 = C15451.m36984(str23);
                                                            Iterator it6 = list11.iterator();
                                                            boolean zEquals5 = false;
                                                            boolean zIsEmpty = false;
                                                            boolean zEquals6 = false;
                                                            boolean zEquals7 = false;
                                                            boolean zEquals8 = false;
                                                            boolean zContains2 = false;
                                                            while (it6.hasNext()) {
                                                                String str24 = ((C24144) it6.next()).f78151;
                                                                zEquals5 |= "max_analysis_bytes_reached".equals(str24);
                                                                zIsEmpty |= "max_blocks_reached".equals(str24);
                                                                zEquals6 |= "max_instructions_reached".equals(str24);
                                                                zEquals7 |= "invalid_instruction".equals(str24);
                                                                zEquals8 |= "indirect_target".equals(str24);
                                                                zContains2 |= f58746.contains(str24);
                                                            }
                                                            boolean z2 = zEquals5 || zIsEmpty || zEquals6;
                                                            str23.getClass();
                                                            switch (str23) {
                                                                case "invalid_control_flow_target":
                                                                    if (!z2 && !zEquals7 && !zEquals8 && zContains2) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "max_blocks_reached":
                                                                    break;
                                                                case "complete":
                                                                    zIsEmpty = list11.isEmpty();
                                                                    break;
                                                                case "unresolved_indirect_flow":
                                                                    if (!z2 && !zEquals7 && zEquals8) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "invalid_instruction":
                                                                    if (z2 || !zEquals7) {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "max_instructions_reached":
                                                                    if (zEquals6 && !zIsEmpty && !zEquals5) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "max_analysis_bytes_reached":
                                                                    if (zEquals5 && !zIsEmpty && !zEquals6) {
                                                                        zIsEmpty = true;
                                                                        break;
                                                                    } else {
                                                                        zIsEmpty = false;
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    zIsEmpty = false;
                                                                    break;
                                                            }
                                                            boolean zEquals9 = "complete".equals(str23);
                                                            if (strM36984 != null && zIsEmpty && c23398.f75746 == zEquals9) {
                                                                return C15451.m36975(c10077, strM26896, j6, c9007, strM7706, c2270M7704.f7405, c2270M7704.m7708(strM26896), c2270M7704.m7707(strM26896), c4006M25416);
                                                            }
                                                            throw C15451.m36986();
                                                        }
                                                    }
                                                    throw C15451.m36986();
                                                }
                                            }
                                            throw C15451.m36986();
                                        }
                                    }
                                }
                                throw C15451.m36986();
                            }
                            throw C15451.m36986();
                        }
                    }
                }
            }
            throw C15451.m36986();
        } catch (RuntimeException unused2) {
            throw C10186.m26305("NATIVE_ANALYZER_FAILED", "Native ELF function CFG analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41868(long j) {
        return String.format("%016x", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m41866(long j, long j2) throws C10186 {
        if (j < 0 || j2 < 0 || C25227.FOREVER_NS - j < j2) {
            throw C15451.m36986();
        }
        return j + j2;
    }
}
