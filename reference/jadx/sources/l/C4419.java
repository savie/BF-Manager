package l;

import bin.mt.json.JSONObject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۙۙ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N75Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4419 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Set f15718;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Set f15719;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f15720;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Set f15721;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Set f15722;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Set f15723;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Set f15724;

    static {
        Object[] objArr = {"function_symbol", "executable_symbol", "requested_address"};
        HashSet hashSet = new HashSet(3);
        for (int i = 0; i < 3; i++) {
            Object obj = objArr[i];
            C13638.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C9023.m23354(obj, "duplicate element: "));
            }
        }
        f15724 = C0561.unmodifiableSet(hashSet);
        Object[] objArr2 = {"function_symbol", "executable_symbol", "executable_mapping"};
        HashSet hashSet2 = new HashSet(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Object obj2 = objArr2[i2];
            C13638.requireNonNull(obj2);
            if (!hashSet2.add(obj2)) {
                throw new IllegalArgumentException(C9023.m23354(obj2, "duplicate element: "));
            }
        }
        f15720 = C0561.unmodifiableSet(hashSet2);
        Object[] objArr3 = {"fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary"};
        HashSet hashSet3 = new HashSet(8);
        for (int i3 = 0; i3 < 8; i3++) {
            Object obj3 = objArr3[i3];
            C13638.requireNonNull(obj3);
            if (!hashSet3.add(obj3)) {
                throw new IllegalArgumentException(C9023.m23354(obj3, "duplicate element: "));
            }
        }
        f15718 = C0561.unmodifiableSet(hashSet3);
        Object[] objArr4 = {"fallthrough", "branch_true", "branch_false", "jump"};
        HashSet hashSet4 = new HashSet(4);
        for (int i4 = 0; i4 < 4; i4++) {
            Object obj4 = objArr4[i4];
            C13638.requireNonNull(obj4);
            if (!hashSet4.add(obj4)) {
                throw new IllegalArgumentException(C9023.m23354(obj4, "duplicate element: "));
            }
        }
        f15723 = C0561.unmodifiableSet(hashSet4);
        Object[] objArr5 = {"outside_function_boundary", "other_function_symbol"};
        HashSet hashSet5 = new HashSet(2);
        for (int i5 = 0; i5 < 2; i5++) {
            Object obj5 = objArr5[i5];
            C13638.requireNonNull(obj5);
            if (!hashSet5.add(obj5)) {
                throw new IllegalArgumentException(C9023.m23354(obj5, "duplicate element: "));
            }
        }
        f15722 = C0561.unmodifiableSet(hashSet5);
        Object[] objArr6 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction"};
        HashSet hashSet6 = new HashSet(7);
        for (int i6 = 0; i6 < 7; i6++) {
            Object obj6 = objArr6[i6];
            C13638.requireNonNull(obj6);
            if (!hashSet6.add(obj6)) {
                throw new IllegalArgumentException(C9023.m23354(obj6, "duplicate element: "));
            }
        }
        f15721 = C0561.unmodifiableSet(hashSet6);
        Object[] objArr7 = {"target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition"};
        HashSet hashSet7 = new HashSet(3);
        for (int i7 = 0; i7 < 3; i7++) {
            Object obj7 = objArr7[i7];
            C13638.requireNonNull(obj7);
            if (!hashSet7.add(obj7)) {
                throw new IllegalArgumentException(C9023.m23354(obj7, "duplicate element: "));
            }
        }
        f15719 = C0561.unmodifiableSet(hashSet7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:352:0x0672  */
    /* JADX WARN: Code duplicated, block: B:375:0x069e  */
    /* JADX WARN: Code duplicated, block: B:376:0x06a0  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m12347(C20212 c20212, C2956 c2956, C7896 c7896) throws C12731 {
        HashSet hashSet;
        HashSet hashSet2;
        char c;
        String str = c2956.f11082;
        long j = c2956.f11084;
        C14247 c14247M34385 = C14247.m34385(str);
        String strM20979 = C7948.m20979(c14247M34385, c7896);
        long j2 = c7896.f25950;
        boolean zEquals = "virtual".equals(c7896.f25953);
        if (zEquals && "thumb".equals(strM20979)) {
            j2 &= -2;
        }
        String strM34390 = c14247M34385.m34390();
        int iM34389 = c14247M34385.m34389(strM20979);
        try {
            String str2 = c2956.f11082;
            int i = c7896.f25954;
            int i2 = c7896.f25949;
            int i3 = c7896.f25952;
            c20212.getClass();
            C5617 c5617M36652 = C15308.m36652(str2, j2, zEquals, strM34390, iM34389, i, i2, i3);
            C11968 c11968 = c5617M36652.f19223;
            C18129 c18129 = c5617M36652.f19229;
            if (c18129 == null || !strM34390.equals(c5617M36652.f19230) || iM34389 != c5617M36652.f19228) {
                throw C5831.m16032();
            }
            C5831.m16041(c18129);
            if (!c18129.f57969) {
                throw C12731.m31625("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c18129.f57971 || !c18129.f57965) {
                throw C12731.m31625("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not in loaded executable file-backed bytes.");
            }
            if (j >= 0) {
                long j3 = c18129.f57972;
                if (j3 > 0) {
                    long j4 = c18129.f57961;
                    if (j4 < j3) {
                        long j5 = c18129.f57968;
                        if (j5 >= j4) {
                            if (m12346(j5 - j4, j3) <= j) {
                                if (c18129.f57962 != zEquals || c18129.f57967 != j2) {
                                    throw C5831.m16032();
                                }
                                long j6 = c18129.f57970;
                                if (j6 < 0 || (zEquals && j6 != j2)) {
                                    throw C5831.m16032();
                                }
                                if (c11968 != null) {
                                    long j7 = c11968.f40105;
                                    long j8 = c11968.f40103;
                                    String str3 = c11968.f40104;
                                    String str4 = c11968.f40107;
                                    long j9 = c11968.f40108;
                                    String str5 = c11968.f40109;
                                    String str6 = c11968.f40110;
                                    if (j8 >= 0) {
                                        long j10 = c11968.f40106;
                                        if (j10 >= 0 && j10 < j && j7 > 0 && j8 < j7 && j6 >= j8 && j6 < j7 && f15724.contains(str6) && f15720.contains(str5) && j9 >= 0 && str4.length() <= 4096) {
                                            boolean zEquals2 = "requested_address".equals(str6);
                                            if ((!zEquals2) != (j9 > 0) || ((!zEquals2 && str3.isEmpty()) || (zEquals2 && (!str3.isEmpty() || !str4.isEmpty() || j9 != 0 || !"executable_mapping".equals(str5))))) {
                                                throw C5831.m16032();
                                            }
                                            long jM12346 = m12346(j8, j9);
                                            if (!zEquals2 && jM12346 != j7) {
                                                throw C5831.m16032();
                                            }
                                            if ("function_symbol".equals(str6) != "function_symbol".equals(str5) || "executable_symbol".equals(str6) != "executable_symbol".equals(str5)) {
                                                throw C5831.m16032();
                                            }
                                            C9664 c9664 = c5617M36652.f19226;
                                            List list = c5617M36652.f19231;
                                            List list2 = c5617M36652.f19227;
                                            List list3 = c5617M36652.f19225;
                                            List list4 = c5617M36652.f19224;
                                            if (c9664 != null) {
                                                int i4 = c9664.f32485;
                                                int i5 = c9664.f32483;
                                                int i6 = c9664.f32489;
                                                if (i6 >= 0 && i6 <= c7896.f25954 && i5 >= 0 && i5 <= c7896.f25952 && i4 == list4.size() && c9664.f32486 == list2.size() && c9664.f32490 == list.size() && c9664.f32488 == list3.size() && i4 <= c7896.f25949) {
                                                    HashSet hashSet3 = new HashSet();
                                                    HashSet hashSet4 = new HashSet();
                                                    Iterator it = list4.iterator();
                                                    List list5 = list4;
                                                    long j11 = -1;
                                                    int i7 = 0;
                                                    long j12 = 0;
                                                    while (it.hasNext()) {
                                                        Iterator it2 = it;
                                                        C3312 c3312 = (C3312) it.next();
                                                        List list6 = list2;
                                                        List list7 = list3;
                                                        long j13 = c3312.f12235;
                                                        int i8 = i6;
                                                        long j14 = j12;
                                                        long j15 = c3312.f12233;
                                                        int i9 = c3312.f12237;
                                                        List list8 = list;
                                                        HashSet hashSet5 = hashSet4;
                                                        long j16 = c3312.f12236;
                                                        if (j13 >= j8 && j13 < j7 && j15 >= 0 && j16 > 0 && i9 > 0) {
                                                            long j17 = j8;
                                                            if (f15718.contains(c3312.f12238) && hashSet3.add(Long.valueOf(j13))) {
                                                                long jM12347 = m12346(j13, j16);
                                                                long jM12348 = m12346(j15, j16);
                                                                if (jM12347 > j7 || jM12348 > j || (j11 >= 0 && j13 < j11)) {
                                                                    throw C5831.m16032();
                                                                }
                                                                String[] strArrSplit = c3312.f12234.split("\\n", -1);
                                                                if (strArrSplit.length != i9) {
                                                                    throw C5831.m16032();
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
                                                                                if (j20 >= j13 && j20 < jM12347 && ((i10 != 0 || j20 == j13) && (j18 < 0 || j20 > j18))) {
                                                                                    HashSet hashSet6 = hashSet5;
                                                                                    if (hashSet6.add(Long.valueOf(j20))) {
                                                                                        i10++;
                                                                                        j18 = j20;
                                                                                        hashSet5 = hashSet6;
                                                                                        j = j19;
                                                                                        strArrSplit = strArr;
                                                                                    }
                                                                                }
                                                                                throw C5831.m16032();
                                                                            } catch (RuntimeException unused) {
                                                                                throw C5831.m16032();
                                                                            }
                                                                        }
                                                                    }
                                                                    throw C5831.m16032();
                                                                }
                                                                long j21 = j;
                                                                HashSet hashSet7 = hashSet5;
                                                                long jM12349 = m12346(j14, j16);
                                                                if (i7 < 0 || i9 < 0 || Integer.MAX_VALUE - i7 < i9) {
                                                                    throw C5831.m16032();
                                                                }
                                                                i7 += i9;
                                                                j12 = jM12349;
                                                                j11 = jM12347;
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
                                                        throw C5831.m16032();
                                                    }
                                                    long j22 = j8;
                                                    List list9 = list;
                                                    HashSet hashSet8 = hashSet4;
                                                    List list10 = list2;
                                                    List<C2794> list11 = list3;
                                                    if (j12 != i6 || i7 != i5) {
                                                        throw C5831.m16032();
                                                    }
                                                    HashSet hashSet9 = new HashSet();
                                                    Iterator it3 = list10.iterator();
                                                    String str8 = null;
                                                    while (true) {
                                                        boolean zHasNext = it3.hasNext();
                                                        Set set = f15723;
                                                        String str9 = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
                                                        if (zHasNext) {
                                                            C4911 c4911 = (C4911) it3.next();
                                                            long j23 = c4911.f17229;
                                                            String str10 = c4911.f17231;
                                                            long j24 = c4911.f17230;
                                                            if (!hashSet3.contains(Long.valueOf(j23)) || !hashSet3.contains(Long.valueOf(j24)) || !set.contains(str10)) {
                                                                break;
                                                            }
                                                            String str11 = j23 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str10 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + j24;
                                                            StringBuilder sb = new StringBuilder();
                                                            sb.append(m12348(j23));
                                                            if ("fallthrough".equals(str10)) {
                                                                c = '0';
                                                            } else if ("branch_true".equals(str10)) {
                                                                c = '1';
                                                            } else {
                                                                c = "branch_false".equals(str10) ? '2' : '3';
                                                            }
                                                            sb.append(c);
                                                            sb.append(m12348(j24));
                                                            String string = sb.toString();
                                                            if (!hashSet9.add(str11) || (str8 != null && str8.compareTo(string) > 0)) {
                                                                throw C5831.m16032();
                                                            }
                                                            str8 = string;
                                                        } else {
                                                            HashSet hashSet10 = new HashSet();
                                                            Iterator it4 = list9.iterator();
                                                            String str12 = null;
                                                            while (it4.hasNext()) {
                                                                C14085 c14085 = (C14085) it4.next();
                                                                long j25 = c14085.f46252;
                                                                String str13 = c14085.f46251;
                                                                long j26 = c14085.f46250;
                                                                String str14 = c14085.f46253;
                                                                if (hashSet8.contains(Long.valueOf(j25)) && set.contains(str13) && f15722.contains(str14) && j26 >= 0) {
                                                                    int size = list5.size();
                                                                    Iterator it5 = it4;
                                                                    int i11 = 0;
                                                                    while (i11 < size) {
                                                                        HashSet hashSet11 = hashSet3;
                                                                        int iM9602 = C3184.m9602(size, i11, 2, i11);
                                                                        int i12 = size;
                                                                        List list12 = list5;
                                                                        HashSet hashSet12 = hashSet8;
                                                                        Set set2 = set;
                                                                        String str15 = str9;
                                                                        if (((C3312) list12.get(iM9602)).f12235 <= j26) {
                                                                            i11 = iM9602 + 1;
                                                                        } else {
                                                                            i12 = iM9602;
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
                                                                        C3312 c3313 = (C3312) list13.get(i11 - 1);
                                                                        if (j26 < m12346(c3313.f12235, c3313.f12236)) {
                                                                        }
                                                                    }
                                                                    if ("outside_function_boundary".equals(str14) && j26 >= j22 && j26 < j7) {
                                                                        throw C5831.m16032();
                                                                    }
                                                                    String str17 = j25 + str16 + str13 + str16 + j26 + str16 + str14;
                                                                    String str18 = m12348(j25) + str14 + m12348(j26);
                                                                    if (!hashSet10.add(str17) || (str12 != null && str12.compareTo(str18) > 0)) {
                                                                        throw C5831.m16032();
                                                                    }
                                                                    str12 = str18;
                                                                    str9 = str16;
                                                                    it4 = it5;
                                                                    set = set3;
                                                                    hashSet8 = hashSet14;
                                                                    list5 = list13;
                                                                    hashSet3 = hashSet13;
                                                                }
                                                                throw C5831.m16032();
                                                            }
                                                            HashSet hashSet15 = hashSet3;
                                                            Set set4 = set;
                                                            String str19 = str9;
                                                            HashSet hashSet16 = hashSet8;
                                                            HashSet hashSet17 = new HashSet();
                                                            String str20 = null;
                                                            for (C2794 c2794 : list11) {
                                                                String str21 = c2794.f10647;
                                                                long j27 = c2794.f10648;
                                                                long j28 = c2794.f10646;
                                                                String str22 = c2794.f10649;
                                                                boolean z = c2794.f10650;
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
                                                                        throw C5831.m16032();
                                                                    }
                                                                    hashSet = hashSet16;
                                                                    if (zContains && z && j27 >= 0 && f15721.contains(str22) && hashSet.contains(Long.valueOf(j28))) {
                                                                        hashSet2 = hashSet15;
                                                                        if (hashSet2.contains(Long.valueOf(j27))) {
                                                                        }
                                                                    }
                                                                    throw C5831.m16032();
                                                                }
                                                                if (z || !"invalid_instruction".equals(str22) || j28 != j22) {
                                                                    throw C5831.m16032();
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
                                                                sb3.append(m12348(j28));
                                                                sb3.append(str22);
                                                                if (!z) {
                                                                    j27 = -1;
                                                                }
                                                                sb3.append(m12348(j27));
                                                                String string3 = sb3.toString();
                                                                if (!hashSet17.add(string2) || (str20 != null && str20.compareTo(string3) > 0)) {
                                                                    throw C5831.m16032();
                                                                }
                                                                str20 = string3;
                                                                hashSet15 = hashSet2;
                                                                set4 = set5;
                                                            }
                                                            String str23 = c9664.f32487;
                                                            String strM16030 = C5831.m16030(str23);
                                                            Iterator it6 = list11.iterator();
                                                            boolean zEquals5 = false;
                                                            boolean zIsEmpty = false;
                                                            boolean zEquals6 = false;
                                                            boolean zEquals7 = false;
                                                            boolean zEquals8 = false;
                                                            boolean zContains2 = false;
                                                            while (it6.hasNext()) {
                                                                String str24 = ((C2794) it6.next()).f10649;
                                                                zEquals5 |= "max_analysis_bytes_reached".equals(str24);
                                                                zIsEmpty |= "max_blocks_reached".equals(str24);
                                                                zEquals6 |= "max_instructions_reached".equals(str24);
                                                                zEquals7 |= "invalid_instruction".equals(str24);
                                                                zEquals8 |= "indirect_target".equals(str24);
                                                                zContains2 |= f15719.contains(str24);
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
                                                            if (strM16030 != null && zIsEmpty && c9664.f32484 == zEquals9) {
                                                                return C5831.m16017(c7896, strM20979, j6, c18129, strM34390, c14247M34385.f46656, c14247M34385.m34392(strM20979), c14247M34385.m34391(strM20979), c5617M36652);
                                                            }
                                                            throw C5831.m16032();
                                                        }
                                                    }
                                                    throw C5831.m16032();
                                                }
                                            }
                                            throw C5831.m16032();
                                        }
                                    }
                                }
                                throw C5831.m16032();
                            }
                            throw C5831.m16032();
                        }
                    }
                }
            }
            throw C5831.m16032();
        } catch (RuntimeException unused2) {
            throw C12731.m31630("NATIVE_ANALYZER_FAILED", "Native ELF function CFG analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12348(long j) {
        return String.format("%016x", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m12346(long j, long j2) throws C12731 {
        if (j < 0 || j2 < 0 || C17492.FOREVER_NS - j < j2) {
            throw C5831.m16032();
        }
        return j + j2;
    }
}
