package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2987 implements InterfaceC22827 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f11198 = new String[0];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f11206;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5187 f11208;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f11212;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f11200 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f11202 = new HashMap();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final HashSet f11215 = new HashSet();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashSet f11201 = new HashSet();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f11204 = new HashSet();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final HashMap f11205 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f11210 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashSet f11211 = new HashSet();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashSet f11199 = new HashSet();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashSet f11209 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f11214 = new HashSet();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashSet f11207 = new HashSet();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f11213 = new HashSet();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f11203 = new ArrayDeque();

    public C2987(String str, C3775 c3775) {
        this.f11212 = str;
        this.f11208 = c3775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8936(String str, C23450 c23450) {
        this.f11200.put(str, c23450);
        String str2 = c23450.f75944;
        if (str2 != null) {
            this.f11204.add(str2);
        }
        for (String str3 : c23450.f75942) {
            this.f11201.add(str3);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C23450 m8920(String str) {
        C11538 c11538Mo11019;
        HashMap map = this.f11202;
        C23450 c23450 = (C23450) map.get(str);
        if (c23450 != null) {
            return c23450;
        }
        C23450 c23451 = (C23450) this.f11200.get(str);
        if (!this.f11206 && (c23451 == null || !c23451.f75943)) {
            HashSet hashSet = this.f11215;
            if (c23451 != null || !hashSet.contains(str)) {
                try {
                    c11538Mo11019 = this.f11208.mo11019(str, this.f11212);
                    if (c11538Mo11019.f38773 == EnumC2364.FOUND) {
                        C23450 c23450M51670 = C23450.m51670(c11538Mo11019.f38772);
                        map.put(str, c23450M51670);
                        String str2 = c23450M51670.f75944;
                        if (str2 != null) {
                            this.f11204.add(str2);
                        }
                        for (String str3 : c23450M51670.f75942) {
                            this.f11201.add(str3);
                        }
                        return c23450M51670;
                    }
                } catch (RuntimeException unused) {
                    c11538Mo11019 = C11538.f38770;
                }
                if (c11538Mo11019.f38773 == EnumC2364.UNAVAILABLE) {
                    this.f11206 = true;
                } else if (c23451 != null) {
                    c23451.f75943 = true;
                } else {
                    hashSet.add(str);
                }
            }
        }
        return c23451;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m8902(String str) {
        C23450 c23450 = (C23450) this.f11200.get(str);
        return c23450 != null && m8920(str) == c23450;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC6598 m8905(String str, String str2, String str3, C9339 c9339, boolean z) {
        C1576 c1576 = c9339.f31689;
        if (str3.equals(str2)) {
            return EnumC6598.CONTRACT;
        }
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            if (str.equals(str2)) {
                if (z && c1576.f6326 && m8921(str2, str3)) {
                    return EnumC6598.CONTRACT;
                }
                return EnumC6598.NONE;
            }
            C23450 c23450M8920 = m8920(str);
            if (c23450M8920 == null) {
                return EnumC6598.NONE;
            }
            if (str.equals(str3) && c1576.f6326) {
                return EnumC6598.CONTRACT;
            }
            if (c23450M8920.m51681() && (c23450M8920.m51680() || c23450M8920.m51675() || (!c23450M8920.m51678() && m8934(str, str2)))) {
                C1576 c1576M5380 = C1576.m5380(str, c23450M8920.m51679(), true);
                HashSet hashSet2 = c9339.f31686;
                String str4 = c1576.f6329;
                if (str4 != null) {
                    if (str4.equals(str)) {
                        return EnumC6598.POSSIBLE;
                    }
                    if (m8931(str, c1576M5380, hashSet2)) {
                        return EnumC6598.NONE;
                    }
                } else if (m8931(str, c1576M5380, hashSet2)) {
                    return EnumC6598.CONTRACT;
                }
                if (!c23450M8920.m51678() && m8934(str, str2)) {
                    return EnumC6598.NONE;
                }
            }
            str = c23450M8920.f75944;
        }
        return EnumC6598.NONE;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C9339 m8924(String str) {
        HashMap map = this.f11205;
        C9339 c9339 = (C9339) map.get(str);
        if (c9339 != null) {
            return c9339;
        }
        C23450 c23450M8920 = m8920(str);
        boolean z = c23450M8920 != null && c23450M8920.m51677();
        C1576 c1576M8901 = z ? C1576.f6324 : m8901(str);
        HashSet hashSet = new HashSet();
        if (!z) {
            m8909(str, c1576M8901, hashSet);
        }
        C9339 c93310 = new C9339(z, c1576M8901, hashSet);
        map.put(str, c93310);
        return c93310;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C1576 m8901(String str) {
        C23450 c23450M8920;
        C23450 c23450M8921 = m8920(str);
        if (c23450M8921 == null) {
            return C1576.f6324;
        }
        if (c23450M8921.m51681()) {
            return C1576.m5380(str, c23450M8921.m51679(), !c23450M8921.m51682());
        }
        if (c23450M8921.m51682()) {
            if (!c23450M8921.m51676() && (c23450M8920 = m8920("Ljava/lang/Object;")) != null && c23450M8920.m51681() && c23450M8920.m51680()) {
                return C1576.m5380("Ljava/lang/Object;", c23450M8920.m51679(), true);
            }
            return m8933(str);
        }
        String str2 = c23450M8921.f75944;
        HashSet hashSet = this.f11209;
        hashSet.clear();
        while (str2 != null && hashSet.add(str2)) {
            C23450 c23450M8922 = m8920(str2);
            if (c23450M8922 == null) {
                break;
            }
            if (c23450M8922.m51681() && m8910(str, str2, c23450M8922)) {
                C1576 c1576M5380 = C1576.m5380(str2, c23450M8922.m51679(), true);
                hashSet.clear();
                return c1576M5380;
            }
            str2 = c23450M8922.f75944;
        }
        hashSet.clear();
        return m8933(str);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private C1576 m8933(String str) {
        HashSet<String> hashSet = new HashSet();
        boolean zM8929 = m8929(str, hashSet, new HashSet());
        if (hashSet.isEmpty()) {
            return zM8929 ? C1576.f6325 : C1576.f6324;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str2 : hashSet) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!str2.equals(str3)) {
                        HashSet hashSet2 = this.f11199;
                        hashSet2.clear();
                        boolean zM8927 = m8927(str3, str2, hashSet2);
                        hashSet2.clear();
                        if (zM8927) {
                            break;
                        }
                    }
                } else {
                    arrayList.add(str2);
                    break;
                }
            }
        }
        int i = 0;
        String str4 = null;
        for (String str5 : arrayList) {
            C23450 c23450M8920 = m8920(str5);
            if (c23450M8920 != null && c23450M8920.m51679()) {
                i++;
                str4 = str5;
            }
        }
        return new C1576((String[]) arrayList.toArray(new String[arrayList.size()]), i == 1 ? str4 : null, false, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8929(String str, HashSet hashSet, HashSet hashSet2) {
        C23450 c23450M8920 = m8920(str);
        int i = 0;
        if (!hashSet2.add(str) || c23450M8920 == null) {
            return false;
        }
        boolean zM51676 = c23450M8920.m51676();
        if (c23450M8920.m51682()) {
            if (c23450M8920.m51681()) {
                hashSet.add(str);
            }
            String[] strArr = c23450M8920.f75942;
            int length = strArr.length;
            while (i < length) {
                zM51676 |= m8929(strArr[i], hashSet, hashSet2);
                i++;
            }
            return zM51676;
        }
        String[] strArr2 = c23450M8920.f75942;
        int length2 = strArr2.length;
        while (i < length2) {
            zM51676 |= m8929(strArr2[i], hashSet, hashSet2);
            i++;
        }
        String str2 = c23450M8920.f75944;
        return str2 != null ? m8929(str2, hashSet, hashSet2) | zM51676 : zM51676;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8909(String str, C1576 c1576, HashSet hashSet) {
        C23450 c23450M8920;
        ArrayDeque arrayDeque = this.f11203;
        arrayDeque.clear();
        for (String str2 : c1576.f6328) {
            if (hashSet.add(str2)) {
                arrayDeque.addLast(str2);
            }
        }
        if (c1576.f6327) {
            String[] strArr = c1576.f6328;
            if (strArr.length == 1 && (c23450M8920 = m8920(strArr[0])) != null && c23450M8920.m51680()) {
                HashSet hashSet2 = this.f11207;
                hashSet2.clear();
                m8907(str, hashSet);
                hashSet2.clear();
            }
        }
        while (!arrayDeque.isEmpty()) {
            String str3 = (String) arrayDeque.removeFirst();
            C23450 c23450M8921 = m8920(str3);
            if (c23450M8921 != null) {
                HashSet hashSet3 = this.f11214;
                hashSet3.clear();
                String str4 = c23450M8921.f75944;
                if (str4 != null) {
                    m8906(str4, str3, hashSet);
                }
                if (c23450M8921.m51680()) {
                    for (String str5 : c23450M8921.f75942) {
                        m8906(str5, str3, hashSet);
                    }
                }
                hashSet3.clear();
            }
        }
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8907(String str, HashSet hashSet) {
        C23450 c23450M8920;
        if (this.f11207.add(str) && (c23450M8920 = m8920(str)) != null) {
            int i = 0;
            if (c23450M8920.m51682()) {
                if (c23450M8920.m51681() && hashSet.add(str)) {
                    this.f11203.addLast(str);
                }
                String[] strArr = c23450M8920.f75942;
                int length = strArr.length;
                while (i < length) {
                    m8907(strArr[i], hashSet);
                    i++;
                }
                return;
            }
            String[] strArr2 = c23450M8920.f75942;
            int length2 = strArr2.length;
            while (i < length2) {
                m8907(strArr2[i], hashSet);
                i++;
            }
            String str2 = c23450M8920.f75944;
            if (str2 != null) {
                m8907(str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8906(String str, String str2, HashSet hashSet) {
        C23450 c23450M8920;
        if (this.f11214.add(str) && (c23450M8920 = m8920(str)) != null) {
            if (c23450M8920.m51681() && m8910(str2, str, c23450M8920) && hashSet.add(str)) {
                this.f11203.addLast(str);
            }
            String str3 = c23450M8920.f75944;
            if (str3 != null) {
                m8906(str3, str2, hashSet);
            }
            for (String str4 : c23450M8920.f75942) {
                m8906(str4, str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8931(String str, C1576 c1576, HashSet hashSet) {
        HashSet hashSet2 = this.f11213;
        hashSet2.clear();
        m8909(str, c1576, hashSet2);
        boolean zM8915 = m8915(hashSet2, hashSet);
        hashSet2.clear();
        return zM8915;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8930(String str, C1576 c1576, String str2, C1576 c1577) {
        if (!c1576.f6326 && !c1577.f6326) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (c1576.f6326 && m8921(str2, str) && m8917(c1577, str)) {
            return true;
        }
        return c1577.f6326 && m8921(str, str2) && m8917(c1576, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8917(C1576 c1576, String str) {
        if (c1576.f6326) {
            return true;
        }
        C23450 c23450M8920 = m8920(str);
        if (c23450M8920 != null) {
            String[] strArr = c1576.f6328;
            if (strArr.length != 0) {
                for (String str2 : strArr) {
                    C23450 c23450M8921 = m8920(str2);
                    if (c23450M8921 != null) {
                        if (c23450M8921.m51680()) {
                            return true;
                        }
                        if (!c23450M8920.m51682() && c1576.f6327 && c23450M8921.m51675()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8915(HashSet hashSet, HashSet hashSet2) {
        HashSet hashSet3 = hashSet.size() <= hashSet2.size() ? hashSet : hashSet2;
        if (hashSet3 == hashSet) {
            hashSet = hashSet2;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            if (hashSet.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8911(String str, C1576 c1576, String str2, C1576 c1577) {
        if (m8902(str2) && c1577.f6328.length == 0 && m8903(str, str2) && m8913(str2, c1577, c1576)) {
            return true;
        }
        return m8902(str) && c1576.f6328.length == 0 && m8903(str2, str) && m8913(str, c1576, c1577);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8912(String str, C1576 c1576, String str2, C9339 c9339, boolean z) {
        C14278 c14278;
        boolean z2 = m8902(str2) && c9339.f31689.f6328.length == 0;
        boolean z3 = m8902(str) && c1576.f6328.length == 0;
        if (z2 || z3) {
            if (c9339.f31687 == null) {
                HashSet hashSet = new HashSet();
                m8908(str2, hashSet, new HashSet());
                c9339.f31687 = new C14278(m8904(str2), hashSet);
            }
            C14278 c14279 = c9339.f31687;
            String str3 = c14279.f46799;
            HashSet hashSet2 = c14279.f46798;
            if (str3 != null || !hashSet2.isEmpty()) {
                if (!z) {
                    if (str.equals(str2)) {
                        c14278 = c14279;
                    } else {
                        HashSet hashSet3 = new HashSet();
                        m8908(str, hashSet3, new HashSet());
                        c14278 = new C14278(m8904(str), hashSet3);
                    }
                    if (z2) {
                    }
                    if (z3) {
                        if (m8914(str, c1576, c14278, str2, c9339.f31689, c14279)) {
                            return true;
                        }
                    }
                } else {
                    HashSet hashSet4 = this.f11215;
                    if (str3 == null || hashSet4.contains(str3)) {
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            if (!hashSet4.contains((String) it.next())) {
                            }
                        }
                        if (str3 != null || !hashSet2.isEmpty()) {
                            if (str.equals(str2)) {
                                c14278 = c14279;
                            } else {
                                HashSet hashSet5 = new HashSet();
                                m8908(str, hashSet5, new HashSet());
                                c14278 = new C14278(m8904(str), hashSet5);
                            }
                            if (z2 || !m8914(str2, c9339.f31689, c14279, str, c1576, c14278)) {
                                if (z3) {
                                    if (m8914(str, c1576, c14278, str2, c9339.f31689, c14279)) {
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8914(String str, C1576 c1576, C14278 c14278, String str2, C1576 c1577, C14278 c14279) {
        C23450 c23450;
        boolean zEquals;
        if (c1576.f6328.length != 0 || !m8902(str2) || (c23450 = (C23450) this.f11200.get(str)) == null) {
            return false;
        }
        HashSet hashSet = c14278.f46798;
        String str3 = c14278.f46799;
        HashSet hashSet2 = c14278.f46798;
        boolean z = !hashSet.isEmpty() && hashSet2.equals(c14279.f46798);
        if (c23450.m51682()) {
            return z && m8916(c1577);
        }
        if (str3 == null) {
            zEquals = c14279.f46799 == null;
        } else {
            zEquals = str3.equals(c14279.f46799);
        }
        if (zEquals && hashSet2.equals(c14279.f46798)) {
            if (z && m8916(c1577)) {
                return true;
            }
            if (str3 != null && m8932(c1577, str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8908(String str, HashSet hashSet, HashSet hashSet2) {
        String str2;
        if (hashSet2.add(str)) {
            C23450 c23450M8920 = m8920(str);
            if (c23450M8920 == null) {
                if (m8925(str)) {
                    hashSet.add(str);
                    return;
                }
                return;
            }
            for (String str3 : c23450M8920.f75942) {
                m8908(str3, hashSet, hashSet2);
            }
            if (c23450M8920.m51682() || (str2 = c23450M8920.f75944) == null) {
                return;
            }
            m8908(str2, hashSet, hashSet2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8913(String str, C1576 c1576, C1576 c1577) {
        if (c1576.f6328.length != 0) {
            return false;
        }
        HashSet hashSet = this.f11207;
        hashSet.clear();
        boolean zM8928 = m8928(str, hashSet);
        hashSet.clear();
        if (zM8928 && m8916(c1577)) {
            return true;
        }
        String strM8904 = m8904(str);
        return strM8904 != null && m8932(c1577, strM8904);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8928(String str, HashSet hashSet) {
        String str2;
        if (!hashSet.add(str)) {
            return false;
        }
        C23450 c23450M8920 = m8920(str);
        if (c23450M8920 == null) {
            return m8925(str);
        }
        for (String str3 : c23450M8920.f75942) {
            if (m8928(str3, hashSet)) {
                return true;
            }
        }
        return (c23450M8920.m51682() || (str2 = c23450M8920.f75944) == null || !m8928(str2, hashSet)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m8904(String str) {
        HashSet hashSet = this.f11209;
        hashSet.clear();
        while (str != null && hashSet.add(str)) {
            C23450 c23450M8920 = m8920(str);
            if (c23450M8920 == null) {
                if (!m8922(str)) {
                    str = null;
                }
                hashSet.clear();
                return str;
            }
            if (c23450M8920.m51682()) {
                hashSet.clear();
                return null;
            }
            str = c23450M8920.f75944;
        }
        hashSet.clear();
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8932(C1576 c1576, String str) {
        String str2;
        C23450 c23450M8920;
        String[] strArr = c1576.f6328;
        return strArr.length == 0 || (c1576.f6327 && strArr.length == 1 && (c23450M8920 = m8920((str2 = strArr[0]))) != null && (c23450M8920.m51680() || c23450M8920.m51675() || (!c23450M8920.m51678() && m8934(str2, str))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8916(C1576 c1576) {
        String[] strArr = c1576.f6328;
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            C23450 c23450M8920 = m8920(str);
            if (c23450M8920 != null && c23450M8920.m51680()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8926(String str, String str2) {
        boolean zEquals = str.equals(str2);
        HashSet hashSet = new HashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(str);
        while (true) {
            if (arrayDeque.isEmpty()) {
                return false;
            }
            String str3 = (String) arrayDeque.removeFirst();
            if (hashSet.add(str3)) {
                C23450 c23450M8920 = m8920(str3);
                if (c23450M8920 == null) {
                    if (m8925(str3) && (zEquals || str3.equals(str2))) {
                        return true;
                    }
                } else {
                    for (String str4 : c23450M8920.f75942) {
                        arrayDeque.addLast(str4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m8923(String str, String str2) {
        boolean zEquals = str.equals(str2);
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            C23450 c23450M8920 = m8920(str);
            if (c23450M8920 == null) {
                return m8922(str) && (zEquals || str.equals(str2));
            }
            str = c23450M8920.f75944;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8925(String str) {
        return m8920(str) == null && this.f11201.contains(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m8922(String str) {
        return m8920(str) == null && this.f11204.contains(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8910(String str, String str2, C23450 c23450) {
        C23450 c23450M8920 = m8920(str);
        if (c23450.m51680() || c23450.m51675()) {
            return true;
        }
        return c23450M8920 != null && c23450M8920.m51678() == c23450.m51678() && m8934(str, str2);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m8934(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == str2.lastIndexOf(47) && str.regionMatches(0, str2, 0, iLastIndexOf + 1);
    }

    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC6598 mo8935(String str, String str2, String str3, String str4) {
        String str5;
        C1576 c1576M8933;
        C1576 c1576M8934;
        if (!this.f11212.equals(str4)) {
            return EnumC6598.NONE;
        }
        C9339 c9339M8924 = m8924(str3);
        C1576 c1576 = c9339M8924.f31689;
        if (c9339M8924.f31688) {
            return EnumC6598.NONE;
        }
        C23450 c23450M8920 = m8920(str);
        C23450 c23450M8921 = m8920(str2);
        if (c23450M8920 == null) {
            return EnumC6598.NONE;
        }
        boolean zM8925 = m8925(str2);
        boolean zM8922 = m8922(str2);
        if (c23450M8921 == null || !c23450M8921.m51682()) {
            if (zM8925) {
                if (str.equals(str2) || !m8921(str, str2)) {
                    return EnumC6598.NONE;
                }
                return (str3.equals(str2) || (c1576.f6328.length == 0 && m8926(str3, str2))) ? EnumC6598.CONTRACT : EnumC6598.NONE;
            }
            if (c23450M8921 == null && !zM8922) {
                return EnumC6598.NONE;
            }
            if (c23450M8920.m51682() || str.equals(str2) || !m8921(str, str2) || (str5 = c23450M8920.f75944) == null) {
                return EnumC6598.NONE;
            }
            if (zM8922) {
                if (c1576.f6328.length == 0 && m8923(str3, str2)) {
                    return EnumC6598.CONTRACT;
                }
                return m8905(str5, str2, str3, c9339M8924, false);
            }
            C1576 c1576M8901 = m8901(str2);
            if (c1576M8901.f6328.length == 0) {
                if (c1576M8901.f6326) {
                    if (!m8930(str2, c1576M8901, str3, c1576)) {
                        return EnumC6598.NONE;
                    }
                    return m8905(str5, str2, str3, c9339M8924, true);
                }
                String strM8904 = m8904(str2);
                if (strM8904 == null) {
                    return EnumC6598.NONE;
                }
                if (c1576.f6328.length == 0 && (m8923(str2, str3) || m8911(str2, c1576M8901, str3, c1576) || m8912(str2, c1576M8901, str3, c9339M8924, false))) {
                    return EnumC6598.CONTRACT;
                }
                return m8905(str5, strM8904, str3, c9339M8924, false);
            }
            C1576 c1576M8902 = m8901(str2);
            HashSet hashSet = new HashSet();
            m8909(str2, c1576M8902, hashSet);
            if (hashSet.isEmpty()) {
                c1576M8933 = C1576.f6324;
            } else {
                HashSet hashSet2 = new HashSet();
                String str6 = str5;
                while (true) {
                    if (str6 != null && hashSet2.add(str6)) {
                        C23450 c23450M8922 = m8920(str6);
                        if (c23450M8922 != null) {
                            if (c23450M8922.m51681()) {
                                C1576 c1576M5380 = C1576.m5380(str6, c23450M8922.m51679(), true);
                                if (m8931(str6, c1576M5380, hashSet)) {
                                    c1576M8933 = c1576M5380;
                                }
                            }
                            str6 = c23450M8922.f75944;
                        }
                    }
                    c1576M8933 = m8933(str5);
                    if (!m8931(str5, c1576M8933, hashSet)) {
                        c1576M8933 = C1576.f6324;
                    }
                }
            }
            C1576 c1577 = c1576M8933;
            str2 = str5;
            c1576M8934 = c1577;
        } else {
            if (str.equals(str2) || !m8921(str, str2)) {
                return EnumC6598.NONE;
            }
            c1576M8934 = m8933(str2);
            if (c1576M8934.f6326 && str3.equals(str2)) {
                return EnumC6598.CONTRACT;
            }
            if (c1576M8934.f6328.length == 0 && c1576.f6328.length == 0 && (m8930(str2, c1576M8934, str3, c1576) || m8926(str2, str3) || m8911(str2, c1576M8934, str3, c1576) || m8912(str2, c1576M8934, str3, c9339M8924, false))) {
                return EnumC6598.CONTRACT;
            }
        }
        String str7 = c1576.f6329;
        if (str7 == null) {
            return m8931(str2, c1576M8934, c9339M8924.f31686) ? EnumC6598.CONTRACT : EnumC6598.NONE;
        }
        if (!str7.equals(c1576M8934.f6329)) {
            return EnumC6598.NONE;
        }
        return EnumC6598.EXACT;
    }

    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8937(String str, String str2) {
        if (!this.f11212.equals(str2)) {
            return false;
        }
        C9339 c9339M8924 = m8924(str);
        if (!c9339M8924.f31688) {
            return c9339M8924.f31689.f6329 != null;
        }
        C23450 c23450M8920 = m8920(str);
        return c23450M8920 != null && c23450M8920.m51679();
    }

    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8938(String str, String str2, String str3) {
        if (!this.f11212.equals(str3)) {
            return false;
        }
        C9339 c9339M8924 = m8924(str2);
        HashMap map = c9339M8924.f31691;
        C1576 c1576 = c9339M8924.f31689;
        if (c9339M8924.f31688) {
            return false;
        }
        String str4 = c1576.f6329;
        String str5 = c1576.f6329;
        if (str4 == null) {
            return false;
        }
        C23450 c23450M8920 = m8920(str);
        if (c23450M8920 != null && c23450M8920.m51677()) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C1576 c1576M8901 = m8901(str);
        boolean z = (c1576M8901.f6326 || c1576.f6326) ? false : true;
        boolean zEquals = str5.equals(c1576M8901.f6329);
        if (!zEquals) {
            zEquals = m8930(str, c1576M8901, str2, c1576);
        }
        if (!zEquals && m8925(str)) {
            zEquals = !m8903(str2, str) ? false : m8916(m8901(str2));
        }
        if (!zEquals && m8922(str)) {
            zEquals = !m8903(str2, str) ? false : m8932(m8901(str2), str);
        }
        if (!zEquals && z) {
            zEquals = m8911(str, c1576M8901, str2, c1576);
        }
        if (!zEquals && z && m8903(str2, str)) {
            zEquals = m8931(str, c1576M8901, c9339M8924.f31686);
        }
        if (!zEquals) {
            if (c9339M8924.f31690 == null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                ArrayDeque arrayDeque = new ArrayDeque();
                for (Map.Entry entry : this.f11200.entrySet()) {
                    if (m8902((String) entry.getKey()) && !((C23450) entry.getValue()).m51682()) {
                        String str6 = (String) entry.getKey();
                        C1576 c1576M8902 = m8901(str6);
                        if (str5.equals(c1576M8902.f6329)) {
                            hashSet2.clear();
                            m8909(str6, c1576M8902, hashSet2);
                            hashSet4.clear();
                            arrayDeque.clear();
                            arrayDeque.addLast(str6);
                            while (!arrayDeque.isEmpty()) {
                                String str7 = (String) arrayDeque.removeFirst();
                                if (hashSet4.add(str7)) {
                                    C23450 c23450M8921 = m8920(str7);
                                    if (c23450M8921 == null) {
                                        if ((m8925(str7) && m8916(c1576M8902)) || (m8922(str7) && m8932(c1576M8902, str7))) {
                                            hashSet.add(str7);
                                        }
                                    } else {
                                        hashSet3.clear();
                                        C1576 c1576M8903 = m8901(str7);
                                        m8909(str7, c1576M8903, hashSet3);
                                        if (m8915(hashSet2, hashSet3) || m8913(str7, c1576M8903, c1576M8902)) {
                                            hashSet.add(str7);
                                        }
                                        String str8 = c23450M8921.f75944;
                                        if (str8 != null) {
                                            arrayDeque.addLast(str8);
                                        }
                                        for (String str9 : c23450M8921.f75942) {
                                            arrayDeque.addLast(str9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                c9339M8924.f31690 = hashSet;
            }
            zEquals = c9339M8924.f31690.contains(str);
        }
        map.put(str, Boolean.valueOf(zEquals));
        return zEquals;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d0 A[PHI: r2
      0x00d0: PHI (r2v8 boolean) = (r2v7 boolean), (r2v9 boolean) binds: [B:52:0x00a9, B:60:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC22827
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo8939(String str, String str2, String str3) {
        C1576 c1576M8901;
        boolean zM8932;
        boolean zM8912;
        boolean z = false;
        if (this.f11212.equals(str3)) {
            C9339 c9339M8924 = m8924(str2);
            HashSet hashSet = c9339M8924.f31686;
            HashMap map = c9339M8924.f31692;
            C1576 c1576 = c9339M8924.f31689;
            C23450 c23450M8920 = m8920(str);
            if (!c9339M8924.f31688 && (c23450M8920 == null || !c23450M8920.m51677())) {
                Boolean bool = (Boolean) map.get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                C1576 c1576M8902 = m8901(str);
                boolean zM8930 = m8930(str, c1576M8902, str2, c1576);
                if (zM8930 || !m8925(str)) {
                    if (zM8930 || !m8922(str)) {
                        if (zM8930 || !hashSet.isEmpty()) {
                            if (!zM8930) {
                                zM8930 = m8931(str, c1576M8902, hashSet);
                            }
                        } else if (!m8925(str2)) {
                            if (m8922(str2)) {
                                if (!m8903(str, str2) ? false : m8932(m8901(str), str2)) {
                                    zM8930 = true;
                                }
                            }
                        } else if (m8903(str, str2)) {
                            c1576M8901 = m8901(str);
                            zM8932 = m8916(c1576M8901);
                            zM8930 = zM8932;
                        }
                    } else if (m8903(str2, str)) {
                        zM8932 = m8932(m8901(str2), str);
                        zM8930 = zM8932;
                    }
                    zM8930 = false;
                } else if (m8903(str2, str)) {
                    c1576M8901 = m8901(str2);
                    zM8932 = m8916(c1576M8901);
                    zM8930 = zM8932;
                } else {
                    zM8930 = false;
                }
                if (zM8930) {
                    zM8912 = zM8930;
                } else {
                    if (!c1576M8902.f6326 && !c1576.f6326) {
                        z = true;
                    }
                    if (z) {
                        zM8930 = m8911(str, c1576M8902, str2, c1576);
                    }
                    if (zM8930) {
                        zM8912 = zM8930;
                    } else if (z) {
                        zM8912 = m8912(str, c1576M8902, str2, c9339M8924, false);
                    } else {
                        zM8912 = m8912(str, c1576M8902, str2, c9339M8924, true);
                    }
                }
                map.put(str, Boolean.valueOf(zM8912));
                return zM8912;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m8921(String str, String str2) {
        HashSet hashSet = this.f11211;
        hashSet.clear();
        boolean zM8927 = m8927(str, str2, hashSet);
        hashSet.clear();
        return zM8927;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m8927(String str, String str2, HashSet hashSet) {
        C23450 c23450M8920;
        if (str.equals(str2)) {
            return true;
        }
        if (!hashSet.add(str) || (c23450M8920 = m8920(str)) == null) {
            return false;
        }
        String str3 = c23450M8920.f75944;
        if (str3 != null && (str3.equals(str2) || m8927(c23450M8920.f75944, str2, hashSet))) {
            return true;
        }
        for (String str4 : c23450M8920.f75942) {
            if (str4.equals(str2) || m8927(str4, str2, hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m8903(String str, String str2) {
        HashMap map = this.f11210;
        HashMap map2 = (HashMap) map.get(str);
        Boolean bool = map2 == null ? null : (Boolean) map2.get(str2);
        if (bool != null) {
            return bool.booleanValue();
        }
        HashSet hashSet = this.f11211;
        hashSet.clear();
        boolean zM8927 = m8927(str, str2, hashSet);
        hashSet.clear();
        HashMap map3 = (HashMap) map.get(str);
        if (map3 == null) {
            map3 = new HashMap();
            map.put(str, map3);
        }
        map3.put(str2, Boolean.valueOf(zM8927));
        return zM8927;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8918(InterfaceC18528 interfaceC18528) {
        int iMo25750 = interfaceC18528.mo25750();
        if (EnumC15236.ABSTRACT.m36501(iMo25750)) {
            return false;
        }
        return interfaceC18528.mo25747() != null || EnumC15236.NATIVE.m36501(iMo25750);
    }
}
