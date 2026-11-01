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

/* JADX INFO: renamed from: l.᩻ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes.dex */
public final class C23672 extends C12733 {
    /* JADX WARN: Type inference failed for: r10v0, types: [l.֨ۨۜ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52124(C6094 c6094, final C14293 c14293, final String str, final String str2, final int i, final InterfaceC16966 interfaceC16966) {
        int iIndexOf = str2.indexOf(58);
        if (iIndexOf == -1) {
            C16737.m39273(new Runnable() { // from class: l.֫ܰۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C10617 c10617 = new C10617("", C7997.m21055("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC16966 interfaceC16967 = interfaceC16966;
                    interfaceC16967.mo16476(c10617);
                    interfaceC16967.mo16480();
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
        final C10972 c10972 = new C10972();
        final ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
        final String strM52115 = m52115(c14293, str, str2, concurrentMapC13783);
        m52123(c6094, (InterfaceC0737) new C21554(new InterfaceC7794() { // from class: l.֨ۨۜ
            @Override // l.InterfaceC7794
            public final List accept(Object obj) {
                return C23672.m52116(c10972, charArray, length, charArray2, length2, i, c14293, str2, concurrentMapC13783, strM52115, (InterfaceC9354) obj);
            }
        }, c6094, str, str2), interfaceC16966, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ ArrayList m52116(C10972 c10972, char[] cArr, int i, char[] cArr2, int i2, int i3, C14293 c14293, String str, ConcurrentMapC13783 concurrentMapC13783, String str2, InterfaceC9354 interfaceC9354) {
        try {
            C2093 c2093 = c10972.get();
            if (!interfaceC9354.mo24001(c2093)) {
                return null;
            }
            C14795 c14795M6635 = c2093.m6635();
            ArrayList<Object[]> arrayListM30152 = C12114.m30152(c14795M6635.getValue(), c14795M6635.length(), cArr, i, cArr2, i2);
            if (arrayListM30152.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object[] objArr : arrayListM30152) {
                int[] iArr = (int[]) objArr[0];
                String str3 = (String) objArr[1];
                if (i3 != 0) {
                    int i4 = iArr[0];
                    int iLastIndexOf = TextUtils.lastIndexOf(c14795M6635, '\n', i4);
                    if (iLastIndexOf == -1) {
                        iLastIndexOf = 0;
                    }
                    String strTrim = c14795M6635.m35461(iLastIndexOf, i4).trim();
                    if (i3 == 1) {
                        if (strTrim.startsWith("iput") || strTrim.startsWith("sput")) {
                        }
                    } else if (i3 != 2 || strTrim.startsWith("iget") || strTrim.startsWith("sget")) {
                    }
                }
                if (m52115(c14293, str3, str, concurrentMapC13783).equals(str2)) {
                    C8500 c8500 = new C8500(0);
                    int i5 = iArr[0];
                    c8500.f29470 = i5;
                    int i6 = iArr[1];
                    c8500.f29473 = i6;
                    c8500.m22225(i5, i6, c14795M6635);
                    arrayList.add(c8500);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m52115(C14293 c14293, String str, String str2, ConcurrentMapC13783 concurrentMapC13783) {
        String str3;
        C1591 c1591M34525;
        String str4 = (String) concurrentMapC13783.get(str);
        if (str4 != null) {
            return str4;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(str);
        loop0: while (true) {
            if (linkedList.isEmpty() && linkedList2.isEmpty()) {
                str3 = str;
                break;
            }
            str3 = (String) (linkedList.isEmpty() ? linkedList2.removeFirst() : linkedList.removeFirst());
            if (str3 != null && hashSet.add(str3) && (c1591M34525 = c14293.m34525(str3)) != null) {
                for (String str5 : c1591M34525.f6444) {
                    if (str5.equals(str2)) {
                        break loop0;
                    }
                }
                for (String str6 : c1591M34525.f6448) {
                    if (str6.equals(str2)) {
                        break loop0;
                    }
                }
                String str7 = c1591M34525.f6446;
                if (str7 != null && !hashSet.contains(str7)) {
                    linkedList.add(str7);
                }
                Collections.addAll(linkedList2, c1591M34525.f6447);
            }
        }
        concurrentMapC13783.put(str, str3);
        return str3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ۢܰۜ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52122(C6094 c6094, String str, InterfaceC16966 interfaceC16966) {
        final char[] charArray = str.toCharArray();
        final int length = charArray.length;
        final C10972 c10972 = new C10972();
        m52123(c6094, (InterfaceC0737) new C18026(new InterfaceC7794() { // from class: l.ۢܰۜ
            @Override // l.InterfaceC7794
            public final List accept(Object obj) {
                int iM30151;
                C10972 c10973 = c10972;
                char[] cArr = charArray;
                int i = length;
                InterfaceC9354 interfaceC9354 = (InterfaceC9354) obj;
                try {
                    C2093 c2093 = c10973.get();
                    if (!interfaceC9354.mo24001(c2093)) {
                        return null;
                    }
                    C14795 c14795M6635 = c2093.m6635();
                    char[] value = c14795M6635.getValue();
                    int length2 = c14795M6635.length();
                    int i2 = C12114.f40568;
                    ArrayList<int[]> arrayList = new ArrayList();
                    int i3 = 0;
                    while (arrayList.size() < 500 && (iM30151 = C12114.m30151(length2, i, i3, value, cArr)) != -1) {
                        int i4 = iM30151 + i;
                        arrayList.add(new int[]{iM30151, i4});
                        i3 = i4;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int[] iArr : arrayList) {
                        C8500 c8500 = new C8500(0);
                        int i5 = iArr[0];
                        c8500.f29470 = i5;
                        int i6 = iArr[1];
                        c8500.f29473 = i6;
                        c8500.m22225(i5, i6, c14795M6635);
                        arrayList2.add(c8500);
                    }
                    return arrayList2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c6094, str), interfaceC16966, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52126(C6094 c6094, final C14293 c14293, final String str, final String str2, boolean z, final InterfaceC16966 interfaceC16966) {
        InterfaceC7794 interfaceC7794;
        String str3;
        C6222 c6222Matcher = C14690.m35219("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c6222Matcher.matches()) {
            C16737.m39273(new Runnable() { // from class: l.ۜۨۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C10617 c10617 = new C10617("", C7997.m21055("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC16966 interfaceC16967 = interfaceC16966;
                    interfaceC16967.mo16476(c10617);
                    interfaceC16967.mo16480();
                }
            });
            return;
        }
        boolean z2 = true;
        String strGroup = c6222Matcher.group(1);
        C13638.requireNonNull(strGroup);
        String strGroup2 = c6222Matcher.group(2);
        C13638.requireNonNull(strGroup2);
        String strGroup3 = c6222Matcher.group(3);
        C13638.requireNonNull(strGroup3);
        C1591 c1591M34525 = c14293.m34525(str);
        if (!z && c1591M34525 != null) {
            String[] strArr = c1591M34525.f6445;
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
                for (String str4 : c1591M34525.f6443) {
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
        final C10972 c10972 = new C10972();
        if (z2) {
            final char[] charArray4 = str.toCharArray();
            interfaceC7794 = new InterfaceC7794() { // from class: l.᩺ۨۜ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    C10972 c10973 = c10972;
                    char[] cArr = charArray4;
                    char[] cArr2 = charArray;
                    char[] cArr3 = charArray2;
                    char[] cArr4 = charArray3;
                    InterfaceC9354 interfaceC9354 = (InterfaceC9354) obj;
                    try {
                        C2093 c2093 = c10973.get();
                        if (!interfaceC9354.mo24001(c2093)) {
                            return null;
                        }
                        C14795 c14795M6635 = c2093.m6635();
                        ArrayList<int[]> arrayListM30154 = C12114.m30154(c14795M6635.getValue(), c14795M6635.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, cArr4, cArr4.length);
                        if (arrayListM30154.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM30154) {
                            C8500 c8500 = new C8500(0);
                            int i2 = iArr[0];
                            c8500.f29470 = i2;
                            int i3 = iArr[1];
                            c8500.f29473 = i3;
                            c8500.m22225(i2, i3, c14795M6635);
                            arrayList.add(c8500);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        } else {
            final C18623 c18623M52120 = m52120(c14293, c1591M34525, str2);
            c18623M52120.add(str);
            final ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
            interfaceC7794 = new InterfaceC7794() { // from class: l.ܶۨۜ
                @Override // l.InterfaceC7794
                public final List accept(Object obj) {
                    C10972 c10973 = c10972;
                    char[] cArr = charArray;
                    char[] cArr2 = charArray2;
                    char[] cArr3 = charArray3;
                    C14293 c14294 = c14293;
                    C18623 c18623 = c18623M52120;
                    ConcurrentMapC13783 concurrentMapC13784 = concurrentMapC13783;
                    InterfaceC9354 interfaceC9354 = (InterfaceC9354) obj;
                    try {
                        C2093 c2093 = c10973.get();
                        if (!interfaceC9354.mo24001(c2093)) {
                            return null;
                        }
                        C14795 c14795M6635 = c2093.m6635();
                        ArrayList<int[]> arrayListM30153 = C12114.m30153(c14795M6635.getValue(), c14795M6635.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, c14294, c18623, concurrentMapC13784);
                        if (arrayListM30153.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int[] iArr : arrayListM30153) {
                            C8500 c8500 = new C8500(0);
                            int i2 = iArr[0];
                            c8500.f29470 = i2;
                            int i3 = iArr[1];
                            c8500.f29473 = i3;
                            c8500.m22225(i2, i3, c14795M6635);
                            arrayList.add(c8500);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        m52123(c6094, (InterfaceC0737) new C18732(interfaceC7794, c6094, str, str2), interfaceC16966, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m52133(C6094 c6094, String str, InterfaceC16966 interfaceC16966) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add(str);
        InterfaceC22762[] interfaceC22762Arr = (InterfaceC22762[]) C9030.stream(c6094.m16559()).map(new C1443(4)).filter(new C13439(2)).toArray(new C9297(2));
        while (true) {
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC22762 interfaceC22762 : interfaceC22762Arr) {
                    boolean zContains = hashSet.contains(interfaceC22762.mo20494());
                    if (!zContains) {
                        Iterator it = interfaceC22762.mo20500().iterator();
                        while (it.hasNext()) {
                            if (hashSet.contains((String) it.next())) {
                                zContains = true;
                                break;
                            }
                        }
                    }
                    if (zContains) {
                        String type = interfaceC22762.getType();
                        if (hashSet2.add(type)) {
                            arrayList.add(type);
                        }
                    }
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
            } else {
                m52123(c6094, (InterfaceC0737) new C8149(new C14415(hashSet2), c6094, str), interfaceC16966, false);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.ۘۨۜ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52125(C6094 c6094, final C14293 c14293, String str, String str2, InterfaceC16966 interfaceC16966) {
        C6222 c6222Matcher = C14690.m35219("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!c6222Matcher.matches()) {
            C16737.m39273(new RunnableC12873(interfaceC16966, str, str2));
            return;
        }
        String strGroup = c6222Matcher.group(1);
        C13638.requireNonNull(strGroup);
        String strM41459 = C17874.m41459(strGroup);
        String strGroup2 = c6222Matcher.group(2);
        C13638.requireNonNull(strGroup2);
        String strM414510 = C17874.m41459(strGroup2);
        String strGroup3 = c6222Matcher.group(3);
        C13638.requireNonNull(strGroup3);
        String str3 = strM41459 + "\\s*\\(\\s*" + strM414510 + "\\s*\\)\\s*" + C17874.m41459(strGroup3);
        final C18623 c18623M52120 = m52120(c14293, c14293.m34525(str), str2);
        c18623M52120.add(str);
        final C21199 c21199M31636 = C12733.m31636(str3, true, true);
        final ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783();
        m52123(c6094, (InterfaceC0737) new C19438(new InterfaceC7794() { // from class: l.ۘۨۜ
            @Override // l.InterfaceC7794
            public final List accept(Object obj) {
                C14293 c14294 = c14293;
                C18623 c18623 = c18623M52120;
                ConcurrentMapC13783 concurrentMapC13784 = concurrentMapC13783;
                C21199 c21199 = c21199M31636;
                try {
                    C7807 c7807Mo24002 = ((InterfaceC9354) obj).mo24002();
                    if (c7807Mo24002 == null || !C23672.m52129(c14294, c18623, c7807Mo24002.getType(), concurrentMapC13784)) {
                        return null;
                    }
                    for (InterfaceC18528 interfaceC18528 : c7807Mo24002.getMethods()) {
                        int iMo25750 = interfaceC18528.mo25750();
                        if (!EnumC15236.PRIVATE.m36501(iMo25750) && !EnumC15236.STATIC.m36501(iMo25750)) {
                            String strM49465 = C22304.m49465((InterfaceC8858) interfaceC18528, true);
                            C6222 c6222 = c21199.get();
                            c6222.m17276reset((CharSequence) strM49465);
                            if (c6222.matches()) {
                                C8500 c8500 = new C8500(3);
                                c8500.f29470 = 0;
                                c8500.f29473 = interfaceC18528.getName().length();
                                c8500.f29466 = interfaceC18528.getName();
                                c8500.f29465 = interfaceC18528.mo9698();
                                StringBuilder sb = new StringBuilder();
                                Iterator it = interfaceC18528.mo9699().iterator();
                                while (it.hasNext()) {
                                    sb.append((CharSequence) it.next());
                                }
                                c8500.f29467 = sb.toString();
                                c8500.m22232(interfaceC18528, c8500.f29470, c8500.f29473);
                                return Collections.singletonList(c8500);
                            }
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c6094, str, str2), interfaceC16966, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18623 m52120(C14293 c14293, C1591 c1591, String str) {
        C1591 c1591M34525;
        C18623 c18623 = new C18623();
        if (c1591 != null) {
            String str2 = c1591.f6449;
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(str2);
            while (!linkedList.isEmpty()) {
                String str3 = (String) linkedList.removeFirst();
                if (str3 != null && hashSet.add(str3) && (c1591M34525 = c14293.m34525(str3)) != null) {
                    if (!str3.equals(str2)) {
                        for (String str4 : c1591M34525.f6443) {
                            if (str4.equals(str)) {
                                c18623.add(c1591M34525.f6449);
                                break;
                            }
                        }
                    }
                    linkedList.add(c1591M34525.f6446);
                    Collections.addAll(linkedList, c1591M34525.f6447);
                }
            }
        }
        return c18623;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52129(C14293 c14293, C18623 c18623, String str, ConcurrentMapC13783 concurrentMapC13783) {
        Boolean boolValueOf = (Boolean) concurrentMapC13783.get(str);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(m52128(c14293, c18623, str, new HashSet()));
            concurrentMapC13783.put(str, boolValueOf);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52128(C14293 c14293, C18623 c18623, String str, HashSet hashSet) {
        if (c18623.contains(str)) {
            return true;
        }
        hashSet.add(str);
        C1591 c1591M34525 = c14293.m34525(str);
        if (c1591M34525 != null) {
            String str2 = c1591M34525.f6446;
            if (str2 != null && !hashSet.contains(str2) && m52128(c14293, c18623, str2, hashSet)) {
                return true;
            }
            for (String str3 : c1591M34525.f6447) {
                if (!hashSet.contains(str3) && m52128(c14293, c18623, str3, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52121(C6094 c6094, String str, String str2, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC16966 interfaceC16966, Predicate predicate) {
        m52123(c6094, (InterfaceC0737) new C12383(i, str, z3, z2, z4, c6094, j, str2, z, predicate), interfaceC16966, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52123(final C6094 c6094, final InterfaceC0737 interfaceC0737, final InterfaceC16966 interfaceC16966, boolean z) {
        final ArrayList arrayList = new ArrayList();
        Runnable runnable = new Runnable() { // from class: l.۬ۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC0737 interfaceC0738 = interfaceC0737;
                InterfaceC7794 interfaceC7794Mo3200 = interfaceC0738.mo3200();
                final InterfaceC16966 interfaceC16967 = interfaceC16966;
                if (interfaceC7794Mo3200 == null) {
                    C16737.m39273(new RunnableC18517(5, interfaceC16967));
                    return;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                interfaceC0738.mo3202(concurrentLinkedQueue);
                interfaceC16967.mo16481(0);
                C8516 c8516 = new C8516(concurrentLinkedQueue.size());
                c8516.m22241(new C4328(interfaceC16967));
                C22959 c22959M50797 = C22959.m50797();
                final ArrayList arrayList2 = arrayList;
                RunnableC17321 runnableC17321 = new RunnableC17321(concurrentLinkedQueue, interfaceC16967, c8516, interfaceC7794Mo3200, arrayList2, c22959M50797);
                C6094 c6095 = c6094;
                c6095.m16553();
                C12733.m31637(C5464.f18831, runnableC17321);
                c6095.m16573();
                C16737.m39273(new Runnable() { // from class: l.ۗܰۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC16966 interfaceC16968 = interfaceC16967;
                        if (interfaceC16968.mo16477()) {
                            C15829.m37616();
                        }
                        interfaceC16968.mo16476(interfaceC0738.mo3201(arrayList2));
                        interfaceC16968.mo16480();
                    }
                });
            }
        };
        if (z) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52131(InterfaceC22762 interfaceC22762, C6222 c6222, boolean z) {
        C6222 c6223 = c6222;
        if (interfaceC22762 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strMo20493 = interfaceC22762.mo20493();
        if (strMo20493 != null) {
            c6223.m17276reset((CharSequence) strMo20493);
            if (!z ? C23709.m52203(c6222) : c6222.matches()) {
                C8500 c8500 = new C8500(1);
                String strM24217 = C9461.m24217(strMo20493);
                int iM31633 = C12733.m31633(c6222.start(), 0, 0, strMo20493);
                c8500.m22226(iM31633 + 9, C12733.m31633(c6222.end(), c6222.start(), iM31633, strMo20493) + 9, C16523.m38890(".source \"", strM24217, "\""));
                arrayList.add(c8500);
            }
        }
        Iterator it = interfaceC22762.getAnnotations().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = 0;
            for (InterfaceC6533 interfaceC6533 : ((InterfaceC3710) it.next()).getElements()) {
                if (m52127(interfaceC6533.getValue(), c6223, z)) {
                    C8500 c8501 = new C8500(2);
                    c8501.m22228(interfaceC6533, c6223);
                    c8501.f29470 = i;
                    c8501.f29473 = i2;
                    arrayList.add(c8501);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC17822 interfaceC17822 : interfaceC22762.getFields()) {
            Iterator it2 = interfaceC17822.getAnnotations().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                int i4 = 0;
                for (InterfaceC6533 interfaceC6534 : ((InterfaceC3710) it2.next()).getElements()) {
                    if (m52127(interfaceC6534.getValue(), c6223, z)) {
                        C8500 c8502 = new C8500(8);
                        c8502.f29466 = interfaceC17822.getName();
                        c8502.f29465 = interfaceC17822.getType();
                        c8502.m22228(interfaceC6534, c6223);
                        c8502.f29470 = i3;
                        c8502.f29473 = i4;
                        arrayList.add(c8502);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC10975 interfaceC10975Mo28399 = interfaceC17822.mo28399();
            if (interfaceC10975Mo28399 != null && m52127(interfaceC10975Mo28399, c6223, z)) {
                C8500 c8503 = new C8500(9);
                c8503.f29466 = interfaceC17822.getName();
                c8503.f29465 = interfaceC17822.getType();
                c8503.m22230(interfaceC17822, c6223);
                arrayList.add(c8503);
            }
        }
        for (InterfaceC18528 interfaceC18528 : interfaceC22762.getMethods()) {
            StringBuilder sb = new StringBuilder();
            Iterator it3 = interfaceC18528.mo9699().iterator();
            while (it3.hasNext()) {
                sb.append((CharSequence) it3.next());
            }
            String string = sb.toString();
            Iterator it4 = interfaceC18528.getParameters().iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                Iterator it5 = ((InterfaceC19234) it4.next()).getAnnotations().iterator();
                while (it5.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC6533 interfaceC6535 : ((InterfaceC3710) it5.next()).getElements()) {
                        if (m52127(interfaceC6535.getValue(), c6223, z)) {
                            C8500 c8504 = new C8500(4);
                            c8504.f29466 = interfaceC18528.getName();
                            c8504.f29465 = interfaceC18528.mo9698();
                            c8504.f29467 = string;
                            c8504.m22228(interfaceC6535, c6223);
                            c8504.f29470 = i5;
                            c8504.f29473 = i6;
                            arrayList.add(c8504);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            Iterator it6 = interfaceC18528.getAnnotations().iterator();
            while (it6.hasNext()) {
                int i7 = 0;
                for (InterfaceC6533 interfaceC6536 : ((InterfaceC3710) it6.next()).getElements()) {
                    if (m52127(interfaceC6536.getValue(), c6223, z)) {
                        C8500 c8505 = new C8500(4);
                        c8505.f29466 = interfaceC18528.getName();
                        c8505.f29465 = interfaceC18528.mo9698();
                        c8505.f29467 = string;
                        c8505.m22228(interfaceC6536, c6223);
                        c8505.f29470 = i5;
                        c8505.f29473 = i7;
                        arrayList.add(c8505);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC7945 interfaceC7945Mo25747 = interfaceC18528.mo25747();
            if (interfaceC7945Mo25747 != null) {
                int i8 = 0;
                for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25747.mo11508()) {
                    if (interfaceC1594.mo5435() != EnumC10297.f35298) {
                        EnumC18057 enumC18057 = interfaceC1594.mo5435().f35328;
                        if ((enumC18057 == EnumC18057.Format21c || enumC18057 == EnumC18057.Format31c) && interfaceC1594.mo5435().f35329 == 0) {
                            String string2 = ((InterfaceC20852) ((InterfaceC13859) interfaceC1594).getReference()).getString();
                            c6223.m17276reset((CharSequence) string2);
                            if (!z ? C23709.m52203(c6222) : c6222.matches()) {
                                C8500 c8506 = new C8500(5);
                                try {
                                    int iMo11507 = interfaceC18528.mo25747().mo11507();
                                    InterfaceC19010 interfaceC19010 = C5370.f18561;
                                    int iM14887 = C5370.m14887(interfaceC18528.mo9699(), EnumC15236.STATIC.m36501(interfaceC18528.mo25750()));
                                    C14795 c14795 = new C14795();
                                    C12283 c12283 = new C12283(new C2093(c14795));
                                    c14795.m35466(interfaceC1594.mo5435().f35326);
                                    c14795.append(' ');
                                    int iMo1140 = ((InterfaceC4685) interfaceC1594).mo1140();
                                    int i9 = iMo11507 - iM14887;
                                    if (iMo1140 >= i9) {
                                        c12283.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                        c12283.m30529(iMo1140 - i9);
                                    } else {
                                        c12283.write(118);
                                        c12283.m30529(iMo1140);
                                    }
                                    c14795.m35466(", \"");
                                    String strM24218 = C9461.m24217(string2);
                                    int iM31634 = C12733.m31633(c6222.start(), 0, 0, string2);
                                    c8506.m22226(c14795.length() + iM31634, c14795.length() + C12733.m31633(c6222.end(), c6222.start(), iM31634, string2), ((Object) c14795) + strM24218 + "\"");
                                } catch (IOException unused) {
                                }
                                c8506.f29466 = interfaceC18528.getName();
                                c8506.f29465 = interfaceC18528.mo9698();
                                c8506.f29467 = string;
                                c8506.f29470 = i8;
                                arrayList.add(c8506);
                            }
                        }
                        i8++;
                        c6223 = c6222;
                    }
                }
            }
            c6223 = c6222;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52127(InterfaceC10975 interfaceC10975, C6222 c6222, boolean z) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 == 23) {
            c6222.m17276reset((CharSequence) ((InterfaceC5060) interfaceC10975).getValue());
            if (z) {
                return c6222.matches();
            }
            return C23709.m52203(c6222);
        }
        if (iMo2656 == 28) {
            Iterator it = ((InterfaceC0390) interfaceC10975).getValue().iterator();
            while (it.hasNext()) {
                if (m52127((InterfaceC10975) it.next(), c6222, z)) {
                    return true;
                }
            }
            return false;
        }
        if (iMo2656 != 29) {
            return false;
        }
        Iterator it2 = ((InterfaceC20147) interfaceC10975).getElements().iterator();
        while (it2.hasNext()) {
            if (m52127(((InterfaceC6533) it2.next()).getValue(), c6222, z)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52130(C18134 c18134, C6222 c6222, boolean z, boolean z2, boolean z3) {
        if (z2) {
            c6222.m17276reset(c18134.m42211());
            if (z) {
                if (c6222.matches()) {
                    return true;
                }
            } else if (C23709.m52203(c6222)) {
                return true;
            }
            c6222.m17276reset(c18134.m42223());
            if (z) {
                if (c6222.matches()) {
                    return true;
                }
            } else if (C23709.m52203(c6222)) {
                return true;
            }
        }
        if (z3) {
            c6222.m17276reset(c18134.m42218());
            if (z) {
                if (c6222.matches()) {
                    return true;
                }
            } else if (C23709.m52203(c6222)) {
                return true;
            }
        }
        c6222.m17276reset(c18134.m42215());
        return z ? c6222.matches() : C23709.m52203(c6222);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52132(InterfaceC22762 interfaceC22762, C6222 c6222, boolean z) {
        boolean z2;
        String strM37076;
        boolean z3;
        int iStart;
        int iEnd;
        int i;
        if (interfaceC22762 != null) {
            InterfaceC20921 interfaceC20921ListIterator = new C19947(c6222.pattern().pattern().toCharArray()).listIterator(0);
            while (true) {
                if (!interfaceC20921ListIterator.hasNext()) {
                    z2 = false;
                    strM37076 = null;
                    break;
                }
                if (interfaceC20921ListIterator.mo1416() == '\\' && interfaceC20921ListIterator.hasNext() && interfaceC20921ListIterator.mo1416() == '.') {
                    String type = interfaceC22762.getType();
                    strM37076 = C15489.m37076(type.substring(1, type.length() - 1).replace('/', '.'), ".");
                    z2 = true;
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC18528 interfaceC18528 : interfaceC22762.getMethods()) {
                if (z2) {
                    StringBuilder sbM23356 = C9023.m23356(strM37076);
                    sbM23356.append(interfaceC18528.getName());
                    c6222.m17276reset((CharSequence) sbM23356.toString());
                    if (!z ? !C23709.m52203(c6222) || c6222.end() <= strM37076.length() : !c6222.matches()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    iEnd = c6222.end() - strM37076.length();
                    i = 0;
                } else {
                    c6222.m17276reset((CharSequence) interfaceC18528.getName());
                    if (z) {
                        if (c6222.matches()) {
                            iStart = c6222.start();
                            iEnd = c6222.end();
                            i = iStart;
                            z3 = true;
                        } else {
                            i = 0;
                            iEnd = 0;
                        }
                    } else if (C23709.m52203(c6222)) {
                        iStart = c6222.start();
                        iEnd = c6222.end();
                        i = iStart;
                        z3 = true;
                    } else {
                        i = 0;
                        iEnd = 0;
                    }
                }
                if (z3) {
                    C8500 c8500 = new C8500(3);
                    c8500.f29470 = i;
                    c8500.f29473 = iEnd;
                    c8500.f29466 = interfaceC18528.getName();
                    c8500.f29465 = interfaceC18528.mo9698();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC18528.mo9699().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    c8500.f29467 = sb.toString();
                    c8500.m22232(interfaceC18528, i, iEnd);
                    arrayList.add(c8500);
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
    public static ArrayList m52118(InterfaceC22762 interfaceC22762, C6222 c6222, boolean z) {
        int iStart;
        int iEnd;
        if (interfaceC22762 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC17822 interfaceC17822 : interfaceC22762.getFields()) {
            c6222.m17276reset((CharSequence) interfaceC17822.getName());
            boolean z2 = true;
            if (!z) {
                if (C23709.m52203(c6222)) {
                    iStart = c6222.start();
                    iEnd = c6222.end();
                } else {
                    z2 = false;
                    iStart = 0;
                    iEnd = 0;
                }
            } else if (c6222.matches()) {
                iStart = c6222.start();
                iEnd = c6222.end();
            } else {
                z2 = false;
                iStart = 0;
                iEnd = 0;
            }
            if (z2) {
                C8500 c8500 = new C8500(7);
                c8500.f29470 = iStart;
                c8500.f29473 = iEnd;
                c8500.f29466 = interfaceC17822.getName();
                c8500.f29465 = interfaceC17822.getType();
                C14795 c14795 = new C14795();
                c14795.m35466(".field ");
                for (EnumC15236 enumC15236 : EnumC15236.m36490(interfaceC17822.mo28400())) {
                    c14795.m35466(enumC15236.toString());
                    c14795.append(' ');
                }
                int length = c14795.length() + iStart;
                int length2 = c14795.length() + iEnd;
                c14795.m35466(interfaceC17822.getName());
                c14795.append(':');
                c14795.m35466(interfaceC17822.getType());
                InterfaceC10975 interfaceC10975Mo28399 = interfaceC17822.mo28399();
                if (interfaceC10975Mo28399 != null) {
                    c14795.m35466(" = ");
                    try {
                        AbstractC14387.m34621(new C12283(new C2093(c14795)), interfaceC10975Mo28399);
                    } catch (IOException unused) {
                    }
                }
                c8500.m22226(length, length2, c14795.toString());
                arrayList.add(c8500);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52117(InterfaceC22762 interfaceC22762, long j) {
        Iterator it;
        Iterator it2;
        InterfaceC23031 interfaceC23031;
        Iterator it3;
        String string;
        InterfaceC10975 interfaceC10975M52119;
        if (interfaceC22762 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = interfaceC22762.getAnnotations().iterator();
        int i = 0;
        while (it4.hasNext()) {
            int i2 = 0;
            for (InterfaceC6533 interfaceC6533 : ((InterfaceC3710) it4.next()).getElements()) {
                InterfaceC10975 interfaceC10975M521110 = m52119(interfaceC6533.getValue(), j);
                if (interfaceC10975M521110 != null) {
                    C8500 c8500 = new C8500(2);
                    c8500.f29470 = i;
                    c8500.f29473 = i2;
                    c8500.m22229(interfaceC6533, interfaceC10975M521110);
                    arrayList.add(c8500);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC17822 interfaceC17822 : interfaceC22762.getFields()) {
            Iterator it5 = interfaceC17822.getAnnotations().iterator();
            int i3 = 0;
            while (it5.hasNext()) {
                int i4 = 0;
                for (InterfaceC6533 interfaceC6534 : ((InterfaceC3710) it5.next()).getElements()) {
                    InterfaceC10975 interfaceC10975M521111 = m52119(interfaceC6534.getValue(), j);
                    if (interfaceC10975M521111 != null) {
                        C8500 c8501 = new C8500(8);
                        c8501.f29466 = interfaceC17822.getName();
                        c8501.f29465 = interfaceC17822.getType();
                        c8501.m22229(interfaceC6534, interfaceC10975M521111);
                        c8501.f29470 = i3;
                        c8501.f29473 = i4;
                        arrayList.add(c8501);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC10975 interfaceC10975Mo28399 = interfaceC17822.mo28399();
            if (interfaceC10975Mo28399 != null && (interfaceC10975M52119 = m52119(interfaceC10975Mo28399, j)) != null) {
                C8500 c8502 = new C8500(9);
                c8502.f29466 = interfaceC17822.getName();
                c8502.f29465 = interfaceC17822.getType();
                c8502.m22231(interfaceC17822, interfaceC10975M52119);
                arrayList.add(c8502);
            }
        }
        Iterator it6 = interfaceC22762.getMethods().iterator();
        while (it6.hasNext()) {
            InterfaceC18528 interfaceC18528 = (InterfaceC18528) it6.next();
            StringBuilder sb = new StringBuilder();
            Iterator it7 = interfaceC18528.mo9699().iterator();
            while (it7.hasNext()) {
                sb.append((CharSequence) it7.next());
            }
            String string2 = sb.toString();
            Iterator it8 = interfaceC18528.getParameters().iterator();
            int i5 = 0;
            while (it8.hasNext()) {
                Iterator it9 = ((InterfaceC19234) it8.next()).getAnnotations().iterator();
                while (it9.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC6533 interfaceC6535 : ((InterfaceC3710) it9.next()).getElements()) {
                        InterfaceC10975 interfaceC10975M521112 = m52119(interfaceC6535.getValue(), j);
                        if (interfaceC10975M521112 != null) {
                            C8500 c8503 = new C8500(4);
                            c8503.f29466 = interfaceC18528.getName();
                            c8503.f29465 = interfaceC18528.mo9698();
                            c8503.f29467 = string2;
                            c8503.m22229(interfaceC6535, interfaceC10975M521112);
                            c8503.f29470 = i5;
                            c8503.f29473 = i6;
                            arrayList.add(c8503);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            char c = 0;
            Iterator it10 = interfaceC18528.getAnnotations().iterator();
            while (it10.hasNext()) {
                int i7 = 0;
                for (InterfaceC6533 interfaceC6536 : ((InterfaceC3710) it10.next()).getElements()) {
                    InterfaceC10975 interfaceC10975M521113 = m52119(interfaceC6536.getValue(), j);
                    if (interfaceC10975M521113 != null) {
                        C8500 c8504 = new C8500(4);
                        c8504.f29466 = interfaceC18528.getName();
                        c8504.f29465 = interfaceC18528.mo9698();
                        c8504.f29467 = string2;
                        c8504.m22229(interfaceC6536, interfaceC10975M521113);
                        c8504.f29470 = i5;
                        c8504.f29473 = i7;
                        arrayList.add(c8504);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC7945 interfaceC7945Mo25747 = interfaceC18528.mo25747();
            if (interfaceC7945Mo25747 != null) {
                int i8 = 0;
                for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25747.mo11508()) {
                    if (interfaceC1594.mo5435() != EnumC10297.f35298) {
                        if (!(interfaceC1594 instanceof InterfaceC3005) && !(interfaceC1594 instanceof C6063)) {
                            int[] iArr = C6032.f20497;
                            int i9 = 1;
                            int i10 = 6;
                            switch (iArr[interfaceC1594.mo5435().f35328.ordinal()]) {
                                case 9:
                                    InterfaceC23031 interfaceC23032 = (InterfaceC23031) interfaceC1594;
                                    Iterator it11 = interfaceC23032.mo16088().iterator();
                                    int i11 = 0;
                                    while (it11.hasNext()) {
                                        Number number = (Number) it11.next();
                                        if (number.longValue() == j) {
                                            C8500 c8505 = new C8500(i10);
                                            int iMo16087 = interfaceC23032.mo16087();
                                            String str = iMo16087 != i9 ? iMo16087 != 2 ? "" : am.aB : am.aI;
                                            try {
                                                C14795 c14795 = new C14795();
                                                it2 = it6;
                                                try {
                                                    C12283 c12283 = new C12283(new C2093(c14795));
                                                    interfaceC23031 = interfaceC23032;
                                                    it3 = it11;
                                                    try {
                                                        C16896.m39570(c12283, number.longValue());
                                                        c12283.write(str, 0, str.length());
                                                        string = c14795.toString();
                                                    } catch (IOException e) {
                                                        e = e;
                                                        string = e.toString();
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    interfaceC23031 = interfaceC23032;
                                                    it3 = it11;
                                                    string = e.toString();
                                                    c8505.m22226(17, string.length() + 17, C16523.m38890(".array-data {... ", string, " ...}"));
                                                    c8505.f29466 = interfaceC18528.getName();
                                                    c8505.f29465 = interfaceC18528.mo9698();
                                                    c8505.f29467 = string2;
                                                    c8505.f29470 = i8;
                                                    c8505.f29473 = i11;
                                                    arrayList.add(c8505);
                                                    i11++;
                                                    i9 = 1;
                                                    i10 = 6;
                                                    interfaceC23032 = interfaceC23031;
                                                    it11 = it3;
                                                    it6 = it2;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                                it2 = it6;
                                            }
                                            c8505.m22226(17, string.length() + 17, C16523.m38890(".array-data {... ", string, " ...}"));
                                            c8505.f29466 = interfaceC18528.getName();
                                            c8505.f29465 = interfaceC18528.mo9698();
                                            c8505.f29467 = string2;
                                            c8505.f29470 = i8;
                                            c8505.f29473 = i11;
                                            arrayList.add(c8505);
                                        } else {
                                            it2 = it6;
                                            interfaceC23031 = interfaceC23032;
                                            it3 = it11;
                                        }
                                        i11++;
                                        i9 = 1;
                                        i10 = 6;
                                        interfaceC23032 = interfaceC23031;
                                        it11 = it3;
                                        it6 = it2;
                                        break;
                                    }
                                    it = it6;
                                    break;
                                case 10:
                                    int i12 = 0;
                                    for (InterfaceC2568 interfaceC2568 : ((InterfaceC5391) interfaceC1594).mo14955()) {
                                        if (interfaceC2568.getKey() == j) {
                                            C8500 c8506 = new C8500(6);
                                            Object[] objArr = new Object[1];
                                            objArr[c] = Integer.valueOf(interfaceC2568.getKey());
                                            c8506.m22226(20, 28, String.format(".packed-switch {... %08x ...}", objArr));
                                            c8506.f29466 = interfaceC18528.getName();
                                            c8506.f29465 = interfaceC18528.mo9698();
                                            c8506.f29467 = string2;
                                            c8506.f29470 = i8;
                                            c8506.f29473 = i12;
                                            arrayList.add(c8506);
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
                                    for (InterfaceC2568 interfaceC2569 : ((InterfaceC5391) interfaceC1594).mo14955()) {
                                        if (interfaceC2569.getKey() == j) {
                                            C8500 c8507 = new C8500(6);
                                            Object[] objArr2 = new Object[1];
                                            objArr2[c] = Integer.valueOf(interfaceC2569.getKey());
                                            c8507.m22226(20, 28, String.format(".sparse-switch {... %08x ...}", objArr2));
                                            c8507.f29466 = interfaceC18528.getName();
                                            c8507.f29465 = interfaceC18528.mo9698();
                                            c8507.f29467 = string2;
                                            c8507.f29470 = i8;
                                            c8507.f29473 = i13;
                                            arrayList.add(c8507);
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
                                    switch (iArr[interfaceC1594.mo5435().f35328.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            if (((InterfaceC6802) interfaceC1594).mo4062() == j) {
                                                C8500 c8508 = new C8500(5);
                                                try {
                                                    int iMo11507 = interfaceC18528.mo25747().mo11507();
                                                    InterfaceC19010 interfaceC19010 = C5370.f18561;
                                                    int iM14887 = C5370.m14887(interfaceC18528.mo9699(), EnumC15236.STATIC.m36501(interfaceC18528.mo25750()));
                                                    System.out.println(interfaceC18528 + " " + iMo11507 + " " + iM14887);
                                                    C14795 c14796 = new C14795();
                                                    C12283 c12284 = new C12283(new C2093(c14796));
                                                    c14796.m35466(interfaceC1594.mo5435().f35326);
                                                    switch (C3209.f12003[interfaceC1594.mo5435().f35328.ordinal()]) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            c14796.append(' ');
                                                            int iMo1140 = ((InterfaceC4685) interfaceC1594).mo1140();
                                                            int i14 = iMo11507 - iM14887;
                                                            if (iMo1140 >= i14) {
                                                                c12284.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c12284.m30529(iMo1140 - i14);
                                                            } else {
                                                                c12284.write(118);
                                                                c12284.m30529(iMo1140);
                                                            }
                                                            c14796.m35466(", ");
                                                            int length = c14796.length();
                                                            C16896.m39570(c12284, ((InterfaceC6802) interfaceC1594).mo4062());
                                                            c8508.m22226(length, c14796.length(), c14796.toString());
                                                            break;
                                                        case 7:
                                                        case 8:
                                                            c14796.append(' ');
                                                            int iMo1141 = ((InterfaceC4685) interfaceC1594).mo1140();
                                                            int i15 = iMo11507 - iM14887;
                                                            if (iMo1141 >= i15) {
                                                                c12284.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c12284.m30529(iMo1141 - i15);
                                                            } else {
                                                                c12284.write(118);
                                                                c12284.m30529(iMo1141);
                                                            }
                                                            c14796.m35466(", ");
                                                            int iMo1144 = ((InterfaceC1157) interfaceC1594).mo1144();
                                                            if (iMo1144 >= i15) {
                                                                c12284.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c12284.m30529(iMo1144 - i15);
                                                            } else {
                                                                c12284.write(118);
                                                                c12284.m30529(iMo1144);
                                                            }
                                                            c14796.m35466(", ");
                                                            int length2 = c14796.length();
                                                            C16896.m39570(c12284, ((InterfaceC6802) interfaceC1594).mo4062());
                                                            c8508.m22226(length2, c14796.length(), c14796.toString());
                                                            break;
                                                    }
                                                } catch (IOException unused) {
                                                }
                                                c8508.f29466 = interfaceC18528.getName();
                                                c8508.f29465 = interfaceC18528.mo9698();
                                                c8508.f29467 = string2;
                                                c8508.f29470 = i8;
                                                arrayList.add(c8508);
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
    public static InterfaceC10975 m52119(InterfaceC10975 interfaceC10975, long j) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 != 0) {
            if (iMo2656 != 6) {
                if (iMo2656 != 2) {
                    if (iMo2656 != 3) {
                        if (iMo2656 != 4) {
                            if (iMo2656 == 28) {
                                Iterator it = ((InterfaceC0390) interfaceC10975).getValue().iterator();
                                while (it.hasNext()) {
                                    InterfaceC10975 interfaceC10975M52119 = m52119((InterfaceC10975) it.next(), j);
                                    if (interfaceC10975M52119 != null) {
                                        return interfaceC10975M52119;
                                    }
                                }
                                return null;
                            }
                            if (iMo2656 != 29) {
                                return null;
                            }
                            Iterator it2 = ((InterfaceC20147) interfaceC10975).getElements().iterator();
                            while (it2.hasNext()) {
                                InterfaceC10975 interfaceC10975M521110 = m52119(((InterfaceC6533) it2.next()).getValue(), j);
                                if (interfaceC10975M521110 != null) {
                                    return interfaceC10975M521110;
                                }
                            }
                            return null;
                        }
                        if (((InterfaceC9564) interfaceC10975).getValue() != j) {
                            return null;
                        }
                    } else if (((InterfaceC17324) interfaceC10975).getValue() != j) {
                        return null;
                    }
                } else if (((InterfaceC2237) interfaceC10975).getValue() != j) {
                    return null;
                }
            } else if (((InterfaceC3212) interfaceC10975).getValue() != j) {
                return null;
            }
        } else if (((InterfaceC12386) interfaceC10975).getValue() != j) {
            return null;
        }
        return interfaceC10975;
    }
}
