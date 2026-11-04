package l;

import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܰ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C14818 extends C3369 {
    /* JADX WARN: Type inference failed for: r11v0, types: [l.ۖۗۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35683(C20283 c20283, final C24604 c24604, final String str, final String str2, final boolean z, final int i, final InterfaceC23507 interfaceC23507) {
        int iIndexOf = str2.indexOf(58);
        if (iIndexOf == -1) {
            C21576.m49068(new Runnable() { // from class: l.ۘۗۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C1878 c1878 = new C1878("", ExternalValue$$ExternalSyntheticOutline0.m("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC23507 interfaceC23508 = interfaceC23507;
                    interfaceC23508.mo19225(c1878);
                    interfaceC23508.mo19229();
                }
            });
            return;
        }
        String strSubstring = str2.substring(0, iIndexOf);
        String strSubstring2 = str2.substring(iIndexOf + 1);
        final char[] charArray = strSubstring.toCharArray();
        final int length = charArray.length;
        final char[] charArray2 = strSubstring2.toCharArray();
        final int length2 = charArray2.length;
        final C4378 c4378 = new C4378();
        final ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
        final String strM35673 = m35673(c24604, str, str2, z, concurrentMapC17249);
        m35681(c20283, (InterfaceC16047) new C20040(new InterfaceC11572() { // from class: l.ۖۗۧ
            @Override // l.InterfaceC11572
            public final List accept(Object obj) {
                return C14818.m35674(c4378, charArray, length, charArray2, length2, z, i, c24604, str2, concurrentMapC17249, strM35673, (InterfaceC14906) obj);
            }
        }, c20283, str, str2), interfaceC23507, false);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35674(C4378 c4378, char[] cArr, int i, char[] cArr2, int i2, boolean z, int i3, C24604 c24604, String str, ConcurrentMapC17249 concurrentMapC17249, String str2, InterfaceC14906 interfaceC14906) {
        char cCharAt;
        char cCharAt2;
        EnumC22631 enumC22631;
        try {
            C0560 c0560 = c4378.get();
            if (interfaceC14906.mo10205(c0560)) {
                C18459 c18459M2566 = c0560.m2566();
                ArrayList<Object[]> arrayListM18114 = C6375.m18114(c18459M2566.getValue(), c18459M2566.length(), cArr, i, cArr2, i2);
                if (!arrayListM18114.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object[] objArr : arrayListM18114) {
                        int[] iArr = (int[]) objArr[0];
                        String str3 = (String) objArr[1];
                        int i4 = iArr[0];
                        int iLastIndexOf = TextUtils.lastIndexOf(c18459M2566, '\n', i4) + 1;
                        while (iLastIndexOf < i4 && (c18459M2566.charAt(iLastIndexOf) == ' ' || c18459M2566.charAt(iLastIndexOf) == '\t')) {
                            iLastIndexOf++;
                        }
                        int i5 = iLastIndexOf + 4;
                        if (i5 < i4 && (((cCharAt = c18459M2566.charAt(iLastIndexOf)) == 'i' || cCharAt == 's') && c18459M2566.charAt(iLastIndexOf + 3) == 't' && ((cCharAt2 = c18459M2566.charAt(i5)) == '-' || cCharAt2 == ' ' || cCharAt2 == '\t'))) {
                            int i6 = iLastIndexOf + 1;
                            if (c18459M2566.charAt(i6) == 'g' && c18459M2566.charAt(iLastIndexOf + 2) == 'e') {
                                enumC22631 = cCharAt == 's' ? EnumC22631.f73423 : EnumC22631.f73299;
                            } else if (c18459M2566.charAt(i6) == 'p' && c18459M2566.charAt(iLastIndexOf + 2) == 'u') {
                                enumC22631 = cCharAt == 's' ? EnumC22631.f73282 : EnumC22631.f73247;
                            } else {
                                enumC22631 = null;
                            }
                        } else {
                            enumC22631 = null;
                        }
                        if (enumC22631 != null) {
                            try {
                                if (z != (enumC22631 == EnumC22631.f73423 || enumC22631 == EnumC22631.f73282)) {
                                }
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                        if (i3 != 1 || enumC22631 == EnumC22631.f73247 || enumC22631 == EnumC22631.f73282) {
                            if (i3 != 2 || enumC22631 == EnumC22631.f73299 || enumC22631 == EnumC22631.f73423) {
                                if (m35673(c24604, str3, str, z, concurrentMapC17249).equals(str2)) {
                                    C15301 c15301 = new C15301(0);
                                    int i7 = iArr[0];
                                    c15301.f50019 = i7;
                                    int i8 = iArr[1];
                                    c15301.f50022 = i8;
                                    c15301.m36738(i7, i8, c18459M2566);
                                    arrayList.add(c15301);
                                }
                            }
                        }
                    }
                    try {
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return arrayList;
                    } catch (Throwable unused2) {
                        return null;
                    }
                }
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35673(C24604 c24604, String str, String str2, boolean z, ConcurrentMapC17249 concurrentMapC17249) {
        String str3;
        C4466 c4466M54927;
        String str4 = (String) concurrentMapC17249.get(str);
        if (str4 != null) {
            return str4;
        }
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            str3 = (String) linkedList.removeFirst();
            if (str3 != null && hashSet.add(str3) && (c4466M54927 = c24604.m54927(str3)) != null) {
                String[] strArr = c4466M54927.f15977;
                for (String str5 : z ? c4466M54927.f15982 : c4466M54927.f15981) {
                    if (str5.equals(str2)) {
                        concurrentMapC17249.put(str, str3);
                        return str3;
                    }
                }
                String str6 = c4466M54927.f15980;
                if (str6 != null && !hashSet.contains(str6)) {
                    linkedList.addFirst(str6);
                }
                if (z) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length >= 0) {
                            linkedList.addFirst(strArr[length]);
                        }
                    }
                }
            }
        }
        str3 = str;
        concurrentMapC17249.put(str, str3);
        return str3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ܿۗۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35680(C20283 c20283, String str, InterfaceC23507 interfaceC23507) {
        final char[] charArray = str.toCharArray();
        final int length = charArray.length;
        final C4378 c4378 = new C4378();
        m35681(c20283, (InterfaceC16047) new C15564(new InterfaceC11572() { // from class: l.ܿۗۧ
            @Override // l.InterfaceC11572
            public final List accept(Object obj) {
                int iM18113;
                C4378 c4379 = c4378;
                char[] cArr = charArray;
                int i = length;
                InterfaceC14906 interfaceC14906 = (InterfaceC14906) obj;
                try {
                    C0560 c0560 = c4379.get();
                    if (!interfaceC14906.mo10205(c0560)) {
                        return null;
                    }
                    C18459 c18459M2566 = c0560.m2566();
                    char[] value = c18459M2566.getValue();
                    int length2 = c18459M2566.length();
                    int i2 = C6375.f21529;
                    ArrayList<int[]> arrayList = new ArrayList();
                    int i3 = 0;
                    while (arrayList.size() < 500 && (iM18113 = C6375.m18113(length2, i, i3, value, cArr)) != -1) {
                        int i4 = iM18113 + i;
                        arrayList.add(new int[]{iM18113, i4});
                        i3 = i4;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int[] iArr : arrayList) {
                        C15301 c15301 = new C15301(0);
                        int i5 = iArr[0];
                        c15301.f50019 = i5;
                        int i6 = iArr[1];
                        c15301.f50022 = i6;
                        c15301.m36738(i5, i6, c18459M2566);
                        arrayList2.add(c15301);
                    }
                    return arrayList2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c20283, str), interfaceC23507, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35684(C20283 c20283, final C24604 c24604, final String str, final String str2, boolean z, final InterfaceC23507 interfaceC23507) {
        InterfaceC11572 interfaceC11572;
        String str3;
        C4245 c4245Matcher = C18415.m42925("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c4245Matcher.matches()) {
            C21576.m49068(new Runnable() { // from class: l.ۙ᩵ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C1878 c1878 = new C1878("", ExternalValue$$ExternalSyntheticOutline0.m("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC23507 interfaceC23508 = interfaceC23507;
                    interfaceC23508.mo19225(c1878);
                    interfaceC23508.mo19229();
                }
            });
            return;
        }
        boolean z2 = true;
        String strGroup = c4245Matcher.group(1);
        C17359.requireNonNull(strGroup);
        String strGroup2 = c4245Matcher.group(2);
        C17359.requireNonNull(strGroup2);
        String strGroup3 = c4245Matcher.group(3);
        C17359.requireNonNull(strGroup3);
        C4466 c4466M54927 = c24604.m54927(str);
        if (!z && c4466M54927 != null) {
            String[] strArr = c4466M54927.f15976;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str3 = null;
                    break;
                }
                str3 = strArr[i];
                if (str3.equals(str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (str3 == null) {
                for (String str4 : c4466M54927.f15978) {
                    if (str4.equals(str2)) {
                        z2 = false;
                        str3 = str4;
                        break;
                    }
                }
            }
            if (str3 == null && !strGroup.equals("<init>") && !strGroup.equals("<clinit>")) {
                z2 = false;
            }
        }
        final char[] charArray = ("->" + strGroup + MotionUtils.EASING_TYPE_FORMAT_START).toCharArray();
        final char[] charArray2 = strGroup2.toCharArray();
        final char[] charArray3 = strGroup3.toCharArray();
        final C4378 c4378 = new C4378();
        if (z2) {
            final char[] charArray4 = str.toCharArray();
            interfaceC11572 = new InterfaceC11572() { // from class: l.᩷᩵ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    C4378 c4379 = c4378;
                    char[] cArr = charArray4;
                    char[] cArr2 = charArray;
                    char[] cArr3 = charArray2;
                    char[] cArr4 = charArray3;
                    InterfaceC14906 interfaceC14906 = (InterfaceC14906) obj;
                    try {
                        C0560 c0560 = c4379.get();
                        if (!interfaceC14906.mo10205(c0560)) {
                            return null;
                        }
                        C18459 c18459M2566 = c0560.m2566();
                        ArrayList<int[]> arrayListM18116 = C6375.m18116(c18459M2566.getValue(), c18459M2566.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, cArr4, cArr4.length);
                        if (arrayListM18116.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM18116) {
                            C15301 c15301 = new C15301(0);
                            int i2 = iArr[0];
                            c15301.f50019 = i2;
                            int i3 = iArr[1];
                            c15301.f50022 = i3;
                            c15301.m36738(i2, i3, c18459M2566);
                            arrayList.add(c15301);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        } else {
            final C18037 c18037M35678 = m35678(c24604, c4466M54927, str2);
            c18037M35678.add(str);
            final ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
            interfaceC11572 = new InterfaceC11572() { // from class: l.ۤ᩵ۧ
                @Override // l.InterfaceC11572
                public final List accept(Object obj) {
                    C4378 c4379 = c4378;
                    char[] cArr = charArray;
                    char[] cArr2 = charArray2;
                    char[] cArr3 = charArray3;
                    C24604 c24605 = c24604;
                    C18037 c18037 = c18037M35678;
                    ConcurrentMapC17249 concurrentMapC172410 = concurrentMapC17249;
                    InterfaceC14906 interfaceC14906 = (InterfaceC14906) obj;
                    try {
                        C0560 c0560 = c4379.get();
                        if (!interfaceC14906.mo10205(c0560)) {
                            return null;
                        }
                        C18459 c18459M2566 = c0560.m2566();
                        ArrayList<int[]> arrayListM18115 = C6375.m18115(c18459M2566.getValue(), c18459M2566.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, c24605, c18037, concurrentMapC172410);
                        if (arrayListM18115.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM18115) {
                            C15301 c15301 = new C15301(0);
                            int i2 = iArr[0];
                            c15301.f50019 = i2;
                            int i3 = iArr[1];
                            c15301.f50022 = i3;
                            c15301.m36738(i2, i3, c18459M2566);
                            arrayList.add(c15301);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        m35681(c20283, (InterfaceC16047) new C13327(interfaceC11572, c20283, str, str2), interfaceC23507, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m35691(C20283 c20283, String str, InterfaceC23507 interfaceC23507) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add(str);
        InterfaceC10122[] interfaceC10122Arr = (InterfaceC10122[]) C1170.stream(c20283.m46593()).map(new C23173(4)).filter(new C23024()).toArray(new C14315());
        while (true) {
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC10122 interfaceC10122 : interfaceC10122Arr) {
                    boolean zContains = hashSet.contains(interfaceC10122.mo20397());
                    if (!zContains) {
                        Iterator it = interfaceC10122.mo20402().iterator();
                        while (it.hasNext()) {
                            if (hashSet.contains((String) it.next())) {
                                zContains = true;
                                break;
                            }
                        }
                    }
                    if (zContains) {
                        String type = interfaceC10122.getType();
                        if (hashSet2.add(type)) {
                            arrayList.add(type);
                        }
                    }
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
            } else {
                m35681(c20283, (InterfaceC16047) new C5870(new C21029(hashSet2), c20283, str), interfaceC23507, false);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.۬ۗۧ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35682(C20283 c20283, final C24604 c24604, String str, String str2, InterfaceC23507 interfaceC23507) {
        C4245 c4245Matcher = C18415.m42925("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c4245Matcher.matches()) {
            C21576.m49068(new RunnableC1760(interfaceC23507, str, str2));
            return;
        }
        String strGroup = c4245Matcher.group(1);
        C17359.requireNonNull(strGroup);
        String strM40798 = C17370.m40798(strGroup);
        String strGroup2 = c4245Matcher.group(2);
        C17359.requireNonNull(strGroup2);
        String strM40799 = C17370.m40798(strGroup2);
        String strGroup3 = c4245Matcher.group(3);
        C17359.requireNonNull(strGroup3);
        String str3 = strM40798 + "\\s*\\(\\s*" + strM40799 + "\\s*\\)\\s*" + C17370.m40798(strGroup3);
        final C18037 c18037M35678 = m35678(c24604, c24604.m54927(str), str2);
        c18037M35678.add(str);
        final C24999 c24999M11068 = C3369.m11068(str3, true, true);
        final ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249();
        m35681(c20283, (InterfaceC16047) new C2141(new InterfaceC11572() { // from class: l.۬ۗۧ
            @Override // l.InterfaceC11572
            public final List accept(Object obj) {
                C24604 c24605 = c24604;
                C18037 c18037 = c18037M35678;
                ConcurrentMapC17249 concurrentMapC172410 = concurrentMapC17249;
                C24999 c24999 = c24999M11068;
                try {
                    C22737 c22737Mo10207 = ((InterfaceC14906) obj).mo10207();
                    if (c22737Mo10207 == null || !C14818.m35688(c24605, c18037, c22737Mo10207.getType(), concurrentMapC172410)) {
                        return null;
                    }
                    for (InterfaceC8631 interfaceC8631 : c22737Mo10207.getMethods()) {
                        int iMo13184 = interfaceC8631.mo13184();
                        if (!EnumC2536.PRIVATE.m8459(iMo13184) && !EnumC2536.STATIC.m8459(iMo13184)) {
                            String strM35306 = C14684.m35306((InterfaceC4859) interfaceC8631, true);
                            C4245 c4245 = c24999.get();
                            c4245.m13568reset((CharSequence) strM35306);
                            if (c4245.matches()) {
                                C15301 c15301 = new C15301(3);
                                c15301.f50019 = 0;
                                c15301.f50022 = interfaceC8631.getName().length();
                                c15301.f50018 = interfaceC8631.getName();
                                c15301.f50020 = interfaceC8631.mo6802();
                                StringBuilder sb = new StringBuilder();
                                Iterator it = interfaceC8631.mo6805().iterator();
                                while (it.hasNext()) {
                                    sb.append((CharSequence) it.next());
                                }
                                c15301.f50014 = sb.toString();
                                c15301.m36742(interfaceC8631, c15301.f50019, c15301.f50022);
                                return Collections.singletonList(c15301);
                            }
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c20283, str, str2), interfaceC23507, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18037 m35678(C24604 c24604, C4466 c4466, String str) {
        C4466 c4466M54927;
        C18037 c18037 = new C18037(0);
        if (c4466 != null) {
            String str2 = c4466.f15979;
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(str2);
            while (!linkedList.isEmpty()) {
                String str3 = (String) linkedList.removeFirst();
                if (str3 != null && hashSet.add(str3) && (c4466M54927 = c24604.m54927(str3)) != null) {
                    if (!str3.equals(str2)) {
                        for (String str4 : c4466M54927.f15978) {
                            if (str4.equals(str)) {
                                c18037.add(c4466M54927.f15979);
                                break;
                            }
                        }
                    }
                    linkedList.add(c4466M54927.f15980);
                    Collections.addAll(linkedList, c4466M54927.f15977);
                }
            }
        }
        return c18037;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35688(C24604 c24604, C18037 c18037, String str, ConcurrentMapC17249 concurrentMapC17249) {
        Boolean boolValueOf = (Boolean) concurrentMapC17249.get(str);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(m35687(c24604, c18037, str, new HashSet()));
            concurrentMapC17249.put(str, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35687(C24604 c24604, C18037 c18037, String str, HashSet hashSet) {
        if (c18037.contains(str)) {
            return true;
        }
        hashSet.add(str);
        C4466 c4466M54927 = c24604.m54927(str);
        if (c4466M54927 != null) {
            String str2 = c4466M54927.f15980;
            if (str2 != null && !hashSet.contains(str2) && m35687(c24604, c18037, str2, hashSet)) {
                return true;
            }
            for (String str3 : c4466M54927.f15977) {
                if (!hashSet.contains(str3) && m35687(c24604, c18037, str3, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35679(C20283 c20283, String str, String str2, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC23507 interfaceC23507, Predicate predicate) {
        m35681(c20283, (InterfaceC16047) new C12581(i, str, z3, z2, z4, c20283, j, str2, z, predicate), interfaceC23507, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35681(final C20283 c20283, final InterfaceC16047 interfaceC16047, final InterfaceC23507 interfaceC23507, boolean z) {
        final ArrayList arrayList = new ArrayList();
        Runnable runnable = new Runnable() { // from class: l.ۜۗۧ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC16047 interfaceC16048 = interfaceC16047;
                InterfaceC11572 interfaceC11572Mo7395 = interfaceC16048.mo7395();
                InterfaceC23507 interfaceC23508 = interfaceC23507;
                if (interfaceC11572Mo7395 == null) {
                    C21576.m49068(new RunnableC20701(3, interfaceC23508));
                    return;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                interfaceC16048.mo7396(concurrentLinkedQueue);
                interfaceC23508.mo19230(0);
                C3374 c3374 = new C3374(concurrentLinkedQueue.size());
                c3374.m11078(new C15953(interfaceC23508));
                C24720 c24720M55195 = C24720.m55195();
                ArrayList arrayList2 = arrayList;
                RunnableC6616 runnableC6616 = new RunnableC6616(concurrentLinkedQueue, interfaceC23508, c3374, interfaceC11572Mo7395, arrayList2, c24720M55195);
                C20283 c20284 = c20283;
                c20284.m46621();
                C3369.m11069(C11138.f35105, runnableC6616);
                c20284.m46573();
                C21576.m49068(new RunnableC2532(interfaceC23508, interfaceC16048, arrayList2, 1));
            }
        };
        if (z) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35689(InterfaceC10122 interfaceC10122, C4245 c4245, boolean z) {
        C4245 c4246 = c4245;
        if (interfaceC10122 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo20400 = interfaceC10122.mo20400();
        if (strMo20400 != null) {
            c4246.m13568reset((CharSequence) strMo20400);
            if (!z ? C7680.m20920(c4245) : c4245.matches()) {
                C15301 c15301 = new C15301(1);
                String strM11834 = C3652.m11834(strMo20400);
                int iM11065 = C3369.m11065(c4245.start(), 0, 0, strMo20400);
                c15301.m36739(iM11065 + 9, C3369.m11065(c4245.end(), c4245.start(), iM11065, strMo20400) + 9, C14442.m34865(".source \"", strM11834, "\""));
                arrayList.add(c15301);
            }
        }
        Iterator it = interfaceC10122.getAnnotations().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = 0;
            for (InterfaceC19073 interfaceC19073 : ((InterfaceC7886) it.next()).getElements()) {
                if (m35686(interfaceC19073.getValue(), c4246, z)) {
                    C15301 c15302 = new C15301(2);
                    c15302.m36743(interfaceC19073, c4246);
                    c15302.f50019 = i;
                    c15302.f50022 = i2;
                    arrayList.add(c15302);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC2665 interfaceC2665 : interfaceC10122.getFields()) {
            Iterator it2 = interfaceC2665.getAnnotations().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                int i4 = 0;
                for (InterfaceC19073 interfaceC19074 : ((InterfaceC7886) it2.next()).getElements()) {
                    if (m35686(interfaceC19074.getValue(), c4246, z)) {
                        C15301 c15303 = new C15301(8);
                        c15303.f50018 = interfaceC2665.getName();
                        c15303.f50020 = interfaceC2665.getType();
                        c15303.m36743(interfaceC19074, c4246);
                        c15303.f50019 = i3;
                        c15303.f50022 = i4;
                        arrayList.add(c15303);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC16791 interfaceC16791Mo8822 = interfaceC2665.mo8822();
            if (interfaceC16791Mo8822 != null && m35686(interfaceC16791Mo8822, c4246, z)) {
                C15301 c15304 = new C15301(9);
                c15304.f50018 = interfaceC2665.getName();
                c15304.f50020 = interfaceC2665.getType();
                c15304.m36740(interfaceC2665, c4246);
                arrayList.add(c15304);
            }
        }
        for (InterfaceC8631 interfaceC8631 : interfaceC10122.getMethods()) {
            StringBuilder sb = new StringBuilder();
            Iterator it3 = interfaceC8631.mo6805().iterator();
            while (it3.hasNext()) {
                sb.append((CharSequence) it3.next());
            }
            String string = sb.toString();
            Iterator it4 = interfaceC8631.getParameters().iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                Iterator it5 = ((InterfaceC13851) it4.next()).getAnnotations().iterator();
                while (it5.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC19073 interfaceC19075 : ((InterfaceC7886) it5.next()).getElements()) {
                        if (m35686(interfaceC19075.getValue(), c4246, z)) {
                            C15301 c15305 = new C15301(4);
                            c15305.f50018 = interfaceC8631.getName();
                            c15305.f50020 = interfaceC8631.mo6802();
                            c15305.f50014 = string;
                            c15305.m36743(interfaceC19075, c4246);
                            c15305.f50019 = i5;
                            c15305.f50022 = i6;
                            arrayList.add(c15305);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            Iterator it6 = interfaceC8631.getAnnotations().iterator();
            while (it6.hasNext()) {
                int i7 = 0;
                for (InterfaceC19073 interfaceC19076 : ((InterfaceC7886) it6.next()).getElements()) {
                    if (m35686(interfaceC19076.getValue(), c4246, z)) {
                        C15301 c15306 = new C15301(4);
                        c15306.f50018 = interfaceC8631.getName();
                        c15306.f50020 = interfaceC8631.mo6802();
                        c15306.f50014 = string;
                        c15306.m36743(interfaceC19076, c4246);
                        c15306.f50019 = i5;
                        c15306.f50022 = i7;
                        arrayList.add(c15306);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC7140 interfaceC7140Mo13175 = interfaceC8631.mo13175();
            if (interfaceC7140Mo13175 != null) {
                int i8 = 0;
                for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13175.mo2840()) {
                    if (interfaceC23331.mo30864() != EnumC22631.f73424) {
                        EnumC7011 enumC7011 = interfaceC23331.mo30864().f73508;
                        if ((enumC7011 == EnumC7011.Format21c || enumC7011 == EnumC7011.Format31c) && interfaceC23331.mo30864().f73513 == 0) {
                            String string2 = ((InterfaceC22759) ((InterfaceC6177) interfaceC23331).getReference()).getString();
                            c4246.m13568reset((CharSequence) string2);
                            if (!z ? C7680.m20920(c4245) : c4245.matches()) {
                                C15301 c15307 = new C15301(5);
                                try {
                                    int iMo2841 = interfaceC8631.mo13175().mo2841();
                                    InterfaceC6163 interfaceC6163 = C4244.f15461;
                                    int iM13548 = C4244.m13548(interfaceC8631.mo6805(), EnumC2536.STATIC.m8459(interfaceC8631.mo13184()));
                                    C18459 c18459 = new C18459();
                                    C2161 c2161 = new C2161(new C0560(c18459));
                                    c18459.m43010(interfaceC23331.mo30864().f73509);
                                    c18459.append(' ');
                                    int iMo1542 = ((InterfaceC12142) interfaceC23331).mo1542();
                                    int i9 = iMo2841 - iM13548;
                                    if (iMo1542 >= i9) {
                                        c2161.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                        c2161.m7440(iMo1542 - i9);
                                    } else {
                                        c2161.write(118);
                                        c2161.m7440(iMo1542);
                                    }
                                    c18459.m43010(", \"");
                                    String strM11835 = C3652.m11834(string2);
                                    int iM11066 = C3369.m11065(c4245.start(), 0, 0, string2);
                                    c15307.m36739(c18459.length() + iM11066, c18459.length() + C3369.m11065(c4245.end(), c4245.start(), iM11066, string2), ((Object) c18459) + strM11835 + "\"");
                                } catch (IOException unused) {
                                }
                                c15307.f50018 = interfaceC8631.getName();
                                c15307.f50020 = interfaceC8631.mo6802();
                                c15307.f50014 = string;
                                c15307.f50019 = i8;
                                arrayList.add(c15307);
                            }
                        }
                        i8++;
                        c4246 = c4245;
                    }
                }
            }
            c4246 = c4245;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35686(InterfaceC16791 interfaceC16791, C4245 c4245, boolean z) {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 == 23) {
            c4245.m13568reset((CharSequence) ((InterfaceC14553) interfaceC16791).getValue());
            if (z) {
                return c4245.matches();
            }
            return C7680.m20920(c4245);
        }
        if (iMo5414 == 28) {
            Iterator it = ((InterfaceC13062) interfaceC16791).getValue().iterator();
            while (it.hasNext()) {
                if (m35686((InterfaceC16791) it.next(), c4245, z)) {
                    return true;
                }
            }
            return false;
        }
        if (iMo5414 != 29) {
            return false;
        }
        Iterator it2 = ((InterfaceC15299) interfaceC16791).getElements().iterator();
        while (it2.hasNext()) {
            if (m35686(((InterfaceC19073) it2.next()).getValue(), c4245, z)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35685(C13216 c13216, C4245 c4245, boolean z, boolean z2, boolean z3) {
        if (z2) {
            c4245.m13568reset(c13216.m32735());
            if (z) {
                if (c4245.matches()) {
                    return true;
                }
            } else if (C7680.m20920(c4245)) {
                return true;
            }
            c4245.m13568reset(c13216.m32750());
            if (z) {
                if (c4245.matches()) {
                    return true;
                }
            } else if (C7680.m20920(c4245)) {
                return true;
            }
        }
        if (z3) {
            c4245.m13568reset(c13216.m32737());
            if (z) {
                if (c4245.matches()) {
                    return true;
                }
            } else if (C7680.m20920(c4245)) {
                return true;
            }
        }
        c4245.m13568reset(c13216.m32740());
        return z ? c4245.matches() : C7680.m20920(c4245);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m35690(InterfaceC10122 interfaceC10122, C4245 c4245, boolean z) {
        boolean z2;
        String strM34972;
        boolean z3;
        int iStart;
        int iEnd;
        int i;
        if (interfaceC10122 != null) {
            InterfaceC8360 interfaceC8360ListIterator = new C14171(c4245.pattern().pattern().toCharArray()).listIterator(0);
            while (true) {
                if (!interfaceC8360ListIterator.hasNext()) {
                    z2 = false;
                    strM34972 = null;
                    break;
                }
                if (interfaceC8360ListIterator.mo5320() == '\\' && interfaceC8360ListIterator.hasNext() && interfaceC8360ListIterator.mo5320() == '.') {
                    String type = interfaceC10122.getType();
                    strM34972 = C14483.m34972(type.substring(1, type.length() - 1).replace('/', '.'), ".");
                    z2 = true;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC8631 interfaceC8631 : interfaceC10122.getMethods()) {
                if (z2) {
                    StringBuilder sbM27333 = C10732.m27333(strM34972);
                    sbM27333.append(interfaceC8631.getName());
                    c4245.m13568reset((CharSequence) sbM27333.toString());
                    if (!z ? !C7680.m20920(c4245) || c4245.end() <= strM34972.length() : !c4245.matches()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    iEnd = c4245.end() - strM34972.length();
                    i = 0;
                } else {
                    c4245.m13568reset((CharSequence) interfaceC8631.getName());
                    if (z) {
                        if (c4245.matches()) {
                            iStart = c4245.start();
                            iEnd = c4245.end();
                            i = iStart;
                            z3 = true;
                        } else {
                            i = 0;
                            iEnd = 0;
                        }
                    } else if (C7680.m20920(c4245)) {
                        iStart = c4245.start();
                        iEnd = c4245.end();
                        i = iStart;
                        z3 = true;
                    } else {
                        i = 0;
                        iEnd = 0;
                    }
                }
                if (z3) {
                    C15301 c15301 = new C15301(3);
                    c15301.f50019 = i;
                    c15301.f50022 = iEnd;
                    c15301.f50018 = interfaceC8631.getName();
                    c15301.f50020 = interfaceC8631.mo6802();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC8631.mo6805().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    c15301.f50014 = sb.toString();
                    c15301.m36742(interfaceC8631, i, iEnd);
                    arrayList.add(c15301);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35676(InterfaceC10122 interfaceC10122, C4245 c4245, boolean z) {
        int iStart;
        int iEnd;
        if (interfaceC10122 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2665 interfaceC2665 : interfaceC10122.getFields()) {
            c4245.m13568reset((CharSequence) interfaceC2665.getName());
            boolean z2 = true;
            if (!z) {
                if (C7680.m20920(c4245)) {
                    iStart = c4245.start();
                    iEnd = c4245.end();
                } else {
                    z2 = false;
                    iStart = 0;
                    iEnd = 0;
                }
            } else if (c4245.matches()) {
                iStart = c4245.start();
                iEnd = c4245.end();
            } else {
                z2 = false;
                iStart = 0;
                iEnd = 0;
            }
            if (z2) {
                C15301 c15301 = new C15301(7);
                c15301.f50019 = iStart;
                c15301.f50022 = iEnd;
                c15301.f50018 = interfaceC2665.getName();
                c15301.f50020 = interfaceC2665.getType();
                C18459 c18459 = new C18459();
                c18459.m43010(".field ");
                for (EnumC2536 enumC2536 : EnumC2536.m8453(interfaceC2665.mo8823())) {
                    c18459.m43010(enumC2536.toString());
                    c18459.append(' ');
                }
                int length = c18459.length() + iStart;
                int length2 = c18459.length() + iEnd;
                c18459.m43010(interfaceC2665.getName());
                c18459.append(':');
                c18459.m43010(interfaceC2665.getType());
                InterfaceC16791 interfaceC16791Mo8822 = interfaceC2665.mo8822();
                if (interfaceC16791Mo8822 != null) {
                    c18459.m43010(" = ");
                    try {
                        AbstractC3589.m11645(new C2161(new C0560(c18459)), interfaceC16791Mo8822);
                    } catch (IOException unused) {
                    }
                }
                c15301.m36739(length, length2, c18459.toString());
                arrayList.add(c15301);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35675(InterfaceC10122 interfaceC10122, long j) {
        Iterator it;
        Iterator it2;
        InterfaceC9904 interfaceC9904;
        Iterator it3;
        String string;
        InterfaceC16791 interfaceC16791M35677;
        if (interfaceC10122 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = interfaceC10122.getAnnotations().iterator();
        int i = 0;
        while (it4.hasNext()) {
            int i2 = 0;
            for (InterfaceC19073 interfaceC19073 : ((InterfaceC7886) it4.next()).getElements()) {
                InterfaceC16791 interfaceC16791M35678 = m35677(interfaceC19073.getValue(), j);
                if (interfaceC16791M35678 != null) {
                    C15301 c15301 = new C15301(2);
                    c15301.f50019 = i;
                    c15301.f50022 = i2;
                    c15301.m36744(interfaceC19073, interfaceC16791M35678);
                    arrayList.add(c15301);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC2665 interfaceC2665 : interfaceC10122.getFields()) {
            Iterator it5 = interfaceC2665.getAnnotations().iterator();
            int i3 = 0;
            while (it5.hasNext()) {
                int i4 = 0;
                for (InterfaceC19073 interfaceC19074 : ((InterfaceC7886) it5.next()).getElements()) {
                    InterfaceC16791 interfaceC16791M35679 = m35677(interfaceC19074.getValue(), j);
                    if (interfaceC16791M35679 != null) {
                        C15301 c15302 = new C15301(8);
                        c15302.f50018 = interfaceC2665.getName();
                        c15302.f50020 = interfaceC2665.getType();
                        c15302.m36744(interfaceC19074, interfaceC16791M35679);
                        c15302.f50019 = i3;
                        c15302.f50022 = i4;
                        arrayList.add(c15302);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC16791 interfaceC16791Mo8822 = interfaceC2665.mo8822();
            if (interfaceC16791Mo8822 != null && (interfaceC16791M35677 = m35677(interfaceC16791Mo8822, j)) != null) {
                C15301 c15303 = new C15301(9);
                c15303.f50018 = interfaceC2665.getName();
                c15303.f50020 = interfaceC2665.getType();
                c15303.m36741(interfaceC2665, interfaceC16791M35677);
                arrayList.add(c15303);
            }
        }
        Iterator it6 = interfaceC10122.getMethods().iterator();
        while (it6.hasNext()) {
            InterfaceC8631 interfaceC8631 = (InterfaceC8631) it6.next();
            StringBuilder sb = new StringBuilder();
            Iterator it7 = interfaceC8631.mo6805().iterator();
            while (it7.hasNext()) {
                sb.append((CharSequence) it7.next());
            }
            String string2 = sb.toString();
            Iterator it8 = interfaceC8631.getParameters().iterator();
            int i5 = 0;
            while (it8.hasNext()) {
                Iterator it9 = ((InterfaceC13851) it8.next()).getAnnotations().iterator();
                while (it9.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC19073 interfaceC19075 : ((InterfaceC7886) it9.next()).getElements()) {
                        InterfaceC16791 interfaceC16791M356710 = m35677(interfaceC19075.getValue(), j);
                        if (interfaceC16791M356710 != null) {
                            C15301 c15304 = new C15301(4);
                            c15304.f50018 = interfaceC8631.getName();
                            c15304.f50020 = interfaceC8631.mo6802();
                            c15304.f50014 = string2;
                            c15304.m36744(interfaceC19075, interfaceC16791M356710);
                            c15304.f50019 = i5;
                            c15304.f50022 = i6;
                            arrayList.add(c15304);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            char c = 0;
            Iterator it10 = interfaceC8631.getAnnotations().iterator();
            while (it10.hasNext()) {
                int i7 = 0;
                for (InterfaceC19073 interfaceC19076 : ((InterfaceC7886) it10.next()).getElements()) {
                    InterfaceC16791 interfaceC16791M356711 = m35677(interfaceC19076.getValue(), j);
                    if (interfaceC16791M356711 != null) {
                        C15301 c15305 = new C15301(4);
                        c15305.f50018 = interfaceC8631.getName();
                        c15305.f50020 = interfaceC8631.mo6802();
                        c15305.f50014 = string2;
                        c15305.m36744(interfaceC19076, interfaceC16791M356711);
                        c15305.f50019 = i5;
                        c15305.f50022 = i7;
                        arrayList.add(c15305);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC7140 interfaceC7140Mo13175 = interfaceC8631.mo13175();
            if (interfaceC7140Mo13175 != null) {
                int i8 = 0;
                for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13175.mo2840()) {
                    if (interfaceC23331.mo30864() != EnumC22631.f73424) {
                        if (!(interfaceC23331 instanceof InterfaceC20347) && !(interfaceC23331 instanceof C16663)) {
                            int[] iArr = C24516.f79499;
                            int i9 = 1;
                            int i10 = 6;
                            switch (iArr[interfaceC23331.mo30864().f73508.ordinal()]) {
                                case 9:
                                    InterfaceC9904 interfaceC9905 = (InterfaceC9904) interfaceC23331;
                                    Iterator it11 = interfaceC9905.mo3034().iterator();
                                    int i11 = 0;
                                    while (it11.hasNext()) {
                                        Number number = (Number) it11.next();
                                        if (number.longValue() == j) {
                                            C15301 c15306 = new C15301(i10);
                                            int iMo3032 = interfaceC9905.mo3032();
                                            String str = iMo3032 != i9 ? iMo3032 != 2 ? "" : am.aB : am.aI;
                                            try {
                                                C18459 c18459 = new C18459();
                                                it2 = it6;
                                                try {
                                                    C2161 c2161 = new C2161(new C0560(c18459));
                                                    interfaceC9904 = interfaceC9905;
                                                    it3 = it11;
                                                    try {
                                                        C11529.m29030(c2161, number.longValue());
                                                        c2161.write(str, 0, str.length());
                                                        string = c18459.toString();
                                                    } catch (IOException e) {
                                                        e = e;
                                                        string = e.toString();
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    interfaceC9904 = interfaceC9905;
                                                    it3 = it11;
                                                    string = e.toString();
                                                    c15306.m36739(17, string.length() + 17, C14442.m34865(".array-data {... ", string, " ...}"));
                                                    c15306.f50018 = interfaceC8631.getName();
                                                    c15306.f50020 = interfaceC8631.mo6802();
                                                    c15306.f50014 = string2;
                                                    c15306.f50019 = i8;
                                                    c15306.f50022 = i11;
                                                    arrayList.add(c15306);
                                                    i11++;
                                                    i9 = 1;
                                                    i10 = 6;
                                                    interfaceC9905 = interfaceC9904;
                                                    it11 = it3;
                                                    it6 = it2;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                                it2 = it6;
                                            }
                                            c15306.m36739(17, string.length() + 17, C14442.m34865(".array-data {... ", string, " ...}"));
                                            c15306.f50018 = interfaceC8631.getName();
                                            c15306.f50020 = interfaceC8631.mo6802();
                                            c15306.f50014 = string2;
                                            c15306.f50019 = i8;
                                            c15306.f50022 = i11;
                                            arrayList.add(c15306);
                                        } else {
                                            it2 = it6;
                                            interfaceC9904 = interfaceC9905;
                                            it3 = it11;
                                        }
                                        i11++;
                                        i9 = 1;
                                        i10 = 6;
                                        interfaceC9905 = interfaceC9904;
                                        it11 = it3;
                                        it6 = it2;
                                        break;
                                    }
                                    it = it6;
                                    break;
                                case 10:
                                    int i12 = 0;
                                    for (InterfaceC3939 interfaceC3939 : ((InterfaceC14379) interfaceC23331).mo20143()) {
                                        if (interfaceC3939.getKey() == j) {
                                            C15301 c15307 = new C15301(6);
                                            Object[] objArr = new Object[1];
                                            objArr[c] = Integer.valueOf(interfaceC3939.getKey());
                                            c15307.m36739(20, 28, String.format(".packed-switch {... %08x ...}", objArr));
                                            c15307.f50018 = interfaceC8631.getName();
                                            c15307.f50020 = interfaceC8631.mo6802();
                                            c15307.f50014 = string2;
                                            c15307.f50019 = i8;
                                            c15307.f50022 = i12;
                                            arrayList.add(c15307);
                                            it = it6;
                                        } else {
                                            i12++;
                                        }
                                        break;
                                    }
                                    it = it6;
                                    break;
                                case 11:
                                    int i13 = 0;
                                    for (InterfaceC3939 interfaceC39310 : ((InterfaceC14379) interfaceC23331).mo20143()) {
                                        if (interfaceC39310.getKey() == j) {
                                            C15301 c15308 = new C15301(6);
                                            Object[] objArr2 = new Object[1];
                                            objArr2[c] = Integer.valueOf(interfaceC39310.getKey());
                                            c15308.m36739(20, 28, String.format(".sparse-switch {... %08x ...}", objArr2));
                                            c15308.f50018 = interfaceC8631.getName();
                                            c15308.f50020 = interfaceC8631.mo6802();
                                            c15308.f50014 = string2;
                                            c15308.f50019 = i8;
                                            c15308.f50022 = i13;
                                            arrayList.add(c15308);
                                            it = it6;
                                        } else {
                                            i13++;
                                        }
                                        break;
                                    }
                                    it = it6;
                                    break;
                                default:
                                    it = it6;
                                    switch (iArr[interfaceC23331.mo30864().f73508.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            if (((InterfaceC18855) interfaceC23331).mo1545() == j) {
                                                C15301 c15309 = new C15301(5);
                                                try {
                                                    int iMo2841 = interfaceC8631.mo13175().mo2841();
                                                    InterfaceC6163 interfaceC6163 = C4244.f15461;
                                                    int iM13548 = C4244.m13548(interfaceC8631.mo6805(), EnumC2536.STATIC.m8459(interfaceC8631.mo13184()));
                                                    System.out.println(interfaceC8631 + " " + iMo2841 + " " + iM13548);
                                                    C18459 c184510 = new C18459();
                                                    C2161 c2162 = new C2161(new C0560(c184510));
                                                    c184510.m43010(interfaceC23331.mo30864().f73509);
                                                    switch (C8107.f26772[interfaceC23331.mo30864().f73508.ordinal()]) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            c184510.append(' ');
                                                            int iMo1542 = ((InterfaceC12142) interfaceC23331).mo1542();
                                                            int i14 = iMo2841 - iM13548;
                                                            if (iMo1542 >= i14) {
                                                                c2162.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c2162.m7440(iMo1542 - i14);
                                                            } else {
                                                                c2162.write(118);
                                                                c2162.m7440(iMo1542);
                                                            }
                                                            c184510.m43010(", ");
                                                            int length = c184510.length();
                                                            C11529.m29030(c2162, ((InterfaceC18855) interfaceC23331).mo1545());
                                                            c15309.m36739(length, c184510.length(), c184510.toString());
                                                            break;
                                                        case 7:
                                                        case 8:
                                                            c184510.append(' ');
                                                            int iMo1543 = ((InterfaceC12142) interfaceC23331).mo1542();
                                                            int i15 = iMo2841 - iM13548;
                                                            if (iMo1543 >= i15) {
                                                                c2162.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c2162.m7440(iMo1543 - i15);
                                                            } else {
                                                                c2162.write(118);
                                                                c2162.m7440(iMo1543);
                                                            }
                                                            c184510.m43010(", ");
                                                            int iMo1541 = ((InterfaceC18109) interfaceC23331).mo1541();
                                                            if (iMo1541 >= i15) {
                                                                c2162.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c2162.m7440(iMo1541 - i15);
                                                            } else {
                                                                c2162.write(118);
                                                                c2162.m7440(iMo1541);
                                                            }
                                                            c184510.m43010(", ");
                                                            int length2 = c184510.length();
                                                            C11529.m29030(c2162, ((InterfaceC18855) interfaceC23331).mo1545());
                                                            c15309.m36739(length2, c184510.length(), c184510.toString());
                                                            break;
                                                    }
                                                } catch (IOException unused) {
                                                }
                                                c15309.f50018 = interfaceC8631.getName();
                                                c15309.f50020 = interfaceC8631.mo6802();
                                                c15309.f50014 = string2;
                                                c15309.f50019 = i8;
                                                arrayList.add(c15309);
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            it = it6;
                        }
                        i8++;
                        c = 0;
                        it6 = it;
                    }
                }
            }
            it6 = it6;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC16791 m35677(InterfaceC16791 interfaceC16791, long j) {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 != 0) {
            if (iMo5414 != 6) {
                if (iMo5414 != 2) {
                    if (iMo5414 != 3) {
                        if (iMo5414 != 4) {
                            if (iMo5414 == 28) {
                                Iterator it = ((InterfaceC13062) interfaceC16791).getValue().iterator();
                                while (it.hasNext()) {
                                    InterfaceC16791 interfaceC16791M35677 = m35677((InterfaceC16791) it.next(), j);
                                    if (interfaceC16791M35677 != null) {
                                        return interfaceC16791M35677;
                                    }
                                }
                                return null;
                            }
                            if (iMo5414 != 29) {
                                return null;
                            }
                            Iterator it2 = ((InterfaceC15299) interfaceC16791).getElements().iterator();
                            while (it2.hasNext()) {
                                InterfaceC16791 interfaceC16791M35678 = m35677(((InterfaceC19073) it2.next()).getValue(), j);
                                if (interfaceC16791M35678 != null) {
                                    return interfaceC16791M35678;
                                }
                            }
                            return null;
                        }
                        if (((InterfaceC3367) interfaceC16791).getValue() != j) {
                            return null;
                        }
                    } else if (((InterfaceC11570) interfaceC16791).getValue() != j) {
                        return null;
                    }
                } else if (((InterfaceC4113) interfaceC16791).getValue() != j) {
                    return null;
                }
            } else if (((InterfaceC20521) interfaceC16791).getValue() != j) {
                return null;
            }
        } else if (((InterfaceC1876) interfaceC16791).getValue() != j) {
            return null;
        }
        return interfaceC16791;
    }
}
