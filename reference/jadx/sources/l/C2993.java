package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A797 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2993 implements InterfaceC5386 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f9726 = new String[0];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f9731;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f9739;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21794 f9740;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f9741 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f9729 = new HashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f9743 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f9727 = new HashSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f9732 = new HashSet();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final HashMap f9728 = new HashMap();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashMap f9735 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f9742 = new HashSet();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashSet f9733 = new HashSet();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashSet f9736 = new HashSet();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f9734 = new HashSet();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashSet f9730 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet f9737 = new HashSet();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f9738 = new ArrayDeque();

    public C2993(String str, C15080 c15080) {
        this.f9739 = str;
        this.f9740 = c15080;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9790(String str, C19401 c19401) {
        this.f9741.put(str, c19401);
        String str2 = c19401.f62698;
        if (str2 != null) {
            this.f9732.add(str2);
        }
        for (String str3 : c19401.f62700) {
            this.f9727.add(str3);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C19401 m9777(String str) {
        C14179 c14179Mo36340;
        HashMap map = this.f9729;
        C19401 c19401 = (C19401) map.get(str);
        if (c19401 != null) {
            return c19401;
        }
        C19401 c19402 = (C19401) this.f9741.get(str);
        if (!this.f9731 && (c19402 == null || !c19402.f62694)) {
            HashSet hashSet = this.f9743;
            if (c19402 != null || !hashSet.contains(str)) {
                try {
                    c14179Mo36340 = this.f9740.mo36340(str, this.f9739);
                    if (c14179Mo36340.f44837 == EnumC4640.FOUND) {
                        C19401 c19401M44856 = C19401.m44856(c14179Mo36340.f44836);
                        map.put(str, c19401M44856);
                        String str2 = c19401M44856.f62698;
                        if (str2 != null) {
                            this.f9732.add(str2);
                        }
                        for (String str3 : c19401M44856.f62700) {
                            this.f9727.add(str3);
                        }
                        return c19401M44856;
                    }
                } catch (RuntimeException unused) {
                    c14179Mo36340 = C14179.f44835;
                }
                if (c14179Mo36340.f44837 == EnumC4640.UNAVAILABLE) {
                    this.f9731 = true;
                } else if (c19402 != null) {
                    c19402.f62694 = true;
                } else {
                    hashSet.add(str);
                }
            }
        }
        return c19402;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m9787(String str) {
        C19401 c19401 = (C19401) this.f9741.get(str);
        return c19401 != null && m9777(str) == c19401;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC12843 m9756(String str, String str2, String str3, C9704 c9704, boolean z) {
        C1502 c1502 = c9704.f31337;
        if (str3.equals(str2)) {
            return EnumC12843.CONTRACT;
        }
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            if (str.equals(str2)) {
                if (z && c1502.f5237 && m9778(str2, str3)) {
                    return EnumC12843.CONTRACT;
                }
                return EnumC12843.NONE;
            }
            C19401 c19401M9777 = m9777(str);
            if (c19401M9777 == null) {
                return EnumC12843.NONE;
            }
            if (str.equals(str3) && c1502.f5237) {
                return EnumC12843.CONTRACT;
            }
            if (c19401M9777.m44868() && (c19401M9777.m44863() || c19401M9777.m44865() || (!c19401M9777.m44867() && m9776(str, str2)))) {
                C1502 c1502M5356 = C1502.m5356(str, c19401M9777.m44864(), true);
                HashSet hashSet2 = c9704.f31335;
                String str4 = c1502.f5236;
                if (str4 != null) {
                    if (str4.equals(str)) {
                        return EnumC12843.POSSIBLE;
                    }
                    if (m9785(str, c1502M5356, hashSet2)) {
                        return EnumC12843.NONE;
                    }
                } else if (m9785(str, c1502M5356, hashSet2)) {
                    return EnumC12843.CONTRACT;
                }
                if (!c19401M9777.m44867() && m9776(str, str2)) {
                    return EnumC12843.NONE;
                }
            }
            str = c19401M9777.f62698;
        }
        return EnumC12843.NONE;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C9704 m9771(String str) {
        HashMap map = this.f9728;
        C9704 c9704 = (C9704) map.get(str);
        if (c9704 != null) {
            return c9704;
        }
        C19401 c19401M9777 = m9777(str);
        boolean z = c19401M9777 != null && c19401M9777.m44862();
        C1502 c1502M9774 = z ? C1502.f5233 : m9774(str);
        HashSet hashSet = new HashSet();
        if (!z) {
            m9760(str, c1502M9774, hashSet);
        }
        C9704 c9705 = new C9704(z, c1502M9774, hashSet);
        map.put(str, c9705);
        return c9705;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C1502 m9774(String str) {
        C19401 c19401M9777;
        C19401 c19401M9778 = m9777(str);
        if (c19401M9778 == null) {
            return C1502.f5233;
        }
        if (c19401M9778.m44868()) {
            return C1502.m5356(str, c19401M9778.m44864(), !c19401M9778.m44866());
        }
        if (c19401M9778.m44866()) {
            if (!c19401M9778.m44869() && (c19401M9777 = m9777("Ljava/lang/Object;")) != null && c19401M9777.m44868() && c19401M9777.m44863()) {
                return C1502.m5356("Ljava/lang/Object;", c19401M9777.m44864(), true);
            }
            return m9775(str);
        }
        String str2 = c19401M9778.f62698;
        HashSet hashSet = this.f9736;
        hashSet.clear();
        while (str2 != null && hashSet.add(str2)) {
            C19401 c19401M9779 = m9777(str2);
            if (c19401M9779 == null) {
                break;
            }
            if (c19401M9779.m44868() && m9761(str, str2, c19401M9779)) {
                C1502 c1502M5356 = C1502.m5356(str2, c19401M9779.m44864(), true);
                hashSet.clear();
                return c1502M5356;
            }
            str2 = c19401M9779.f62698;
        }
        hashSet.clear();
        return m9775(str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C1502 m9775(String str) {
        HashSet<String> hashSet = new HashSet();
        boolean zM9783 = m9783(str, hashSet, new HashSet());
        if (hashSet.isEmpty()) {
            return zM9783 ? C1502.f5232 : C1502.f5233;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str2 : hashSet) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!str2.equals(str3)) {
                        HashSet hashSet2 = this.f9733;
                        hashSet2.clear();
                        boolean zM9781 = m9781(str3, str2, hashSet2);
                        hashSet2.clear();
                        if (zM9781) {
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
            C19401 c19401M9777 = m9777(str5);
            if (c19401M9777 != null && c19401M9777.m44864()) {
                i++;
                str4 = str5;
            }
        }
        return new C1502((String[]) arrayList.toArray(new String[arrayList.size()]), i == 1 ? str4 : null, false, false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9783(String str, HashSet hashSet, HashSet hashSet2) {
        C19401 c19401M9777 = m9777(str);
        int i = 0;
        if (!hashSet2.add(str) || c19401M9777 == null) {
            return false;
        }
        boolean zM44869 = c19401M9777.m44869();
        if (c19401M9777.m44866()) {
            if (c19401M9777.m44868()) {
                hashSet.add(str);
            }
            String[] strArr = c19401M9777.f62700;
            int length = strArr.length;
            while (i < length) {
                zM44869 |= m9783(strArr[i], hashSet, hashSet2);
                i++;
            }
            return zM44869;
        }
        String[] strArr2 = c19401M9777.f62700;
        int length2 = strArr2.length;
        while (i < length2) {
            zM44869 |= m9783(strArr2[i], hashSet, hashSet2);
            i++;
        }
        String str2 = c19401M9777.f62698;
        return str2 != null ? m9783(str2, hashSet, hashSet2) | zM44869 : zM44869;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9760(String str, C1502 c1502, HashSet hashSet) {
        C19401 c19401M9777;
        ArrayDeque arrayDeque = this.f9738;
        arrayDeque.clear();
        for (String str2 : c1502.f5235) {
            if (hashSet.add(str2)) {
                arrayDeque.addLast(str2);
            }
        }
        if (c1502.f5234) {
            String[] strArr = c1502.f5235;
            if (strArr.length == 1 && (c19401M9777 = m9777(strArr[0])) != null && c19401M9777.m44863()) {
                HashSet hashSet2 = this.f9730;
                hashSet2.clear();
                m9758(str, hashSet);
                hashSet2.clear();
            }
        }
        while (!arrayDeque.isEmpty()) {
            String str3 = (String) arrayDeque.removeFirst();
            C19401 c19401M9778 = m9777(str3);
            if (c19401M9778 != null) {
                HashSet hashSet3 = this.f9734;
                hashSet3.clear();
                String str4 = c19401M9778.f62698;
                if (str4 != null) {
                    m9757(str4, str3, hashSet);
                }
                if (c19401M9778.m44863()) {
                    for (String str5 : c19401M9778.f62700) {
                        m9757(str5, str3, hashSet);
                    }
                }
                hashSet3.clear();
            }
        }
        arrayDeque.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9758(String str, HashSet hashSet) {
        C19401 c19401M9777;
        if (this.f9730.add(str) && (c19401M9777 = m9777(str)) != null) {
            int i = 0;
            if (c19401M9777.m44866()) {
                if (c19401M9777.m44868() && hashSet.add(str)) {
                    this.f9738.addLast(str);
                }
                String[] strArr = c19401M9777.f62700;
                int length = strArr.length;
                while (i < length) {
                    m9758(strArr[i], hashSet);
                    i++;
                }
                return;
            }
            String[] strArr2 = c19401M9777.f62700;
            int length2 = strArr2.length;
            while (i < length2) {
                m9758(strArr2[i], hashSet);
                i++;
            }
            String str2 = c19401M9777.f62698;
            if (str2 != null) {
                m9758(str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9757(String str, String str2, HashSet hashSet) {
        C19401 c19401M9777;
        if (this.f9734.add(str) && (c19401M9777 = m9777(str)) != null) {
            if (c19401M9777.m44868() && m9761(str2, str, c19401M9777) && hashSet.add(str)) {
                this.f9738.addLast(str);
            }
            String str3 = c19401M9777.f62698;
            if (str3 != null) {
                m9757(str3, str2, hashSet);
            }
            for (String str4 : c19401M9777.f62700) {
                m9757(str4, str2, hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9785(String str, C1502 c1502, HashSet hashSet) {
        HashSet hashSet2 = this.f9737;
        hashSet2.clear();
        m9760(str, c1502, hashSet2);
        boolean zM9766 = m9766(hashSet2, hashSet);
        hashSet2.clear();
        return zM9766;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9784(String str, C1502 c1502, String str2, C1502 c1503) {
        if (!c1502.f5237 && !c1503.f5237) {
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        if (c1502.f5237 && m9778(str2, str) && m9768(c1503, str)) {
            return true;
        }
        return c1503.f5237 && m9778(str, str2) && m9768(c1502, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9768(C1502 c1502, String str) {
        if (c1502.f5237) {
            return true;
        }
        C19401 c19401M9777 = m9777(str);
        if (c19401M9777 != null) {
            String[] strArr = c1502.f5235;
            if (strArr.length != 0) {
                for (String str2 : strArr) {
                    C19401 c19401M9778 = m9777(str2);
                    if (c19401M9778 != null) {
                        if (c19401M9778.m44863()) {
                            return true;
                        }
                        if (!c19401M9777.m44866() && c1502.f5234 && c19401M9778.m44865()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9766(HashSet hashSet, HashSet hashSet2) {
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
    private boolean m9762(String str, C1502 c1502, String str2, C1502 c1503) {
        if (m9787(str2) && c1503.f5235.length == 0 && m9788(str, str2) && m9764(str2, c1503, c1502)) {
            return true;
        }
        return m9787(str) && c1502.f5235.length == 0 && m9788(str2, str) && m9764(str, c1502, c1503);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9763(String str, C1502 c1502, String str2, C9704 c9704, boolean z) {
        C10450 c10450;
        boolean z2 = m9787(str2) && c9704.f31337.f5235.length == 0;
        boolean z3 = m9787(str) && c1502.f5235.length == 0;
        if (z2 || z3) {
            if (c9704.f31339 == null) {
                HashSet hashSet = new HashSet();
                m9759(str2, hashSet, new HashSet());
                c9704.f31339 = new C10450(m9755(str2), hashSet);
            }
            C10450 c10451 = c9704.f31339;
            String str3 = c10451.f33255;
            HashSet hashSet2 = c10451.f33254;
            if (str3 != null || !hashSet2.isEmpty()) {
                if (!z) {
                    if (str.equals(str2)) {
                        c10450 = c10451;
                    } else {
                        HashSet hashSet3 = new HashSet();
                        m9759(str, hashSet3, new HashSet());
                        c10450 = new C10450(m9755(str), hashSet3);
                    }
                    if (z2) {
                    }
                    if (z3) {
                        if (m9765(str, c1502, c10450, str2, c9704.f31337, c10451)) {
                            return true;
                        }
                    }
                } else {
                    HashSet hashSet4 = this.f9743;
                    if (str3 == null || hashSet4.contains(str3)) {
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            if (!hashSet4.contains((String) it.next())) {
                            }
                        }
                        if (str3 != null || !hashSet2.isEmpty()) {
                            if (str.equals(str2)) {
                                c10450 = c10451;
                            } else {
                                HashSet hashSet5 = new HashSet();
                                m9759(str, hashSet5, new HashSet());
                                c10450 = new C10450(m9755(str), hashSet5);
                            }
                            if (z2 || !m9765(str2, c9704.f31337, c10451, str, c1502, c10450)) {
                                if (z3) {
                                    if (m9765(str, c1502, c10450, str2, c9704.f31337, c10451)) {
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
    private boolean m9765(String str, C1502 c1502, C10450 c10450, String str2, C1502 c1503, C10450 c10451) {
        C19401 c19401;
        boolean zEquals;
        if (c1502.f5235.length != 0 || !m9787(str2) || (c19401 = (C19401) this.f9741.get(str)) == null) {
            return false;
        }
        HashSet hashSet = c10450.f33254;
        String str3 = c10450.f33255;
        HashSet hashSet2 = c10450.f33254;
        boolean z = !hashSet.isEmpty() && hashSet2.equals(c10451.f33254);
        if (c19401.m44866()) {
            return z && m9767(c1503);
        }
        if (str3 == null) {
            zEquals = c10451.f33255 == null;
        } else {
            zEquals = str3.equals(c10451.f33255);
        }
        if (zEquals && hashSet2.equals(c10451.f33254)) {
            if (z && m9767(c1503)) {
                return true;
            }
            if (str3 != null && m9786(c1503, str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m9759(String str, HashSet hashSet, HashSet hashSet2) {
        String str2;
        if (hashSet2.add(str)) {
            C19401 c19401M9777 = m9777(str);
            if (c19401M9777 == null) {
                if (m9779(str)) {
                    hashSet.add(str);
                    return;
                }
                return;
            }
            for (String str3 : c19401M9777.f62700) {
                m9759(str3, hashSet, hashSet2);
            }
            if (c19401M9777.m44866() || (str2 = c19401M9777.f62698) == null) {
                return;
            }
            m9759(str2, hashSet, hashSet2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9764(String str, C1502 c1502, C1502 c1503) {
        if (c1502.f5235.length != 0) {
            return false;
        }
        HashSet hashSet = this.f9730;
        hashSet.clear();
        boolean zM9782 = m9782(str, hashSet);
        hashSet.clear();
        if (zM9782 && m9767(c1503)) {
            return true;
        }
        String strM9755 = m9755(str);
        return strM9755 != null && m9786(c1503, strM9755);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9782(String str, HashSet hashSet) {
        String str2;
        if (!hashSet.add(str)) {
            return false;
        }
        C19401 c19401M9777 = m9777(str);
        if (c19401M9777 == null) {
            return m9779(str);
        }
        for (String str3 : c19401M9777.f62700) {
            if (m9782(str3, hashSet)) {
                return true;
            }
        }
        return (c19401M9777.m44866() || (str2 = c19401M9777.f62698) == null || !m9782(str2, hashSet)) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m9755(String str) {
        HashSet hashSet = this.f9736;
        hashSet.clear();
        while (str != null && hashSet.add(str)) {
            C19401 c19401M9777 = m9777(str);
            if (c19401M9777 == null) {
                if (!m9772(str)) {
                    str = null;
                }
                hashSet.clear();
                return str;
            }
            if (c19401M9777.m44866()) {
                hashSet.clear();
                return null;
            }
            str = c19401M9777.f62698;
        }
        hashSet.clear();
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9786(C1502 c1502, String str) {
        String str2;
        C19401 c19401M9777;
        String[] strArr = c1502.f5235;
        return strArr.length == 0 || (c1502.f5234 && strArr.length == 1 && (c19401M9777 = m9777((str2 = strArr[0]))) != null && (c19401M9777.m44863() || c19401M9777.m44865() || (!c19401M9777.m44867() && m9776(str2, str))));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9767(C1502 c1502) {
        String[] strArr = c1502.f5235;
        if (strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            C19401 c19401M9777 = m9777(str);
            if (c19401M9777 != null && c19401M9777.m44863()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9780(String str, String str2) {
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
                C19401 c19401M9777 = m9777(str3);
                if (c19401M9777 == null) {
                    if (m9779(str3) && (zEquals || str3.equals(str2))) {
                        return true;
                    }
                } else {
                    for (String str4 : c19401M9777.f62700) {
                        arrayDeque.addLast(str4);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m9773(String str, String str2) {
        boolean zEquals = str.equals(str2);
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            C19401 c19401M9777 = m9777(str);
            if (c19401M9777 == null) {
                return m9772(str) && (zEquals || str.equals(str2));
            }
            str = c19401M9777.f62698;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9779(String str) {
        return m9777(str) == null && this.f9727.contains(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m9772(String str) {
        return m9777(str) == null && this.f9732.contains(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m9761(String str, String str2, C19401 c19401) {
        C19401 c19401M9777 = m9777(str);
        if (c19401.m44863() || c19401.m44865()) {
            return true;
        }
        return c19401M9777 != null && c19401M9777.m44867() == c19401.m44867() && m9776(str, str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m9776(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == str2.lastIndexOf(47) && str.regionMatches(0, str2, 0, iLastIndexOf + 1);
    }

    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC12843 mo9789(String str, String str2, String str3, String str4) {
        String str5;
        C1502 c1502M9775;
        C1502 c1502M9776;
        if (!this.f9739.equals(str4)) {
            return EnumC12843.NONE;
        }
        C9704 c9704M9771 = m9771(str3);
        C1502 c1502 = c9704M9771.f31337;
        if (c9704M9771.f31333) {
            return EnumC12843.NONE;
        }
        C19401 c19401M9777 = m9777(str);
        C19401 c19401M9778 = m9777(str2);
        if (c19401M9777 == null) {
            return EnumC12843.NONE;
        }
        boolean zM9779 = m9779(str2);
        boolean zM9772 = m9772(str2);
        if (c19401M9778 == null || !c19401M9778.m44866()) {
            if (zM9779) {
                if (str.equals(str2) || !m9778(str, str2)) {
                    return EnumC12843.NONE;
                }
                return (str3.equals(str2) || (c1502.f5235.length == 0 && m9780(str3, str2))) ? EnumC12843.CONTRACT : EnumC12843.NONE;
            }
            if (c19401M9778 == null && !zM9772) {
                return EnumC12843.NONE;
            }
            if (c19401M9777.m44866() || str.equals(str2) || !m9778(str, str2) || (str5 = c19401M9777.f62698) == null) {
                return EnumC12843.NONE;
            }
            if (zM9772) {
                if (c1502.f5235.length == 0 && m9773(str3, str2)) {
                    return EnumC12843.CONTRACT;
                }
                return m9756(str5, str2, str3, c9704M9771, false);
            }
            C1502 c1502M9774 = m9774(str2);
            if (c1502M9774.f5235.length == 0) {
                if (c1502M9774.f5237) {
                    if (!m9784(str2, c1502M9774, str3, c1502)) {
                        return EnumC12843.NONE;
                    }
                    return m9756(str5, str2, str3, c9704M9771, true);
                }
                String strM9755 = m9755(str2);
                if (strM9755 == null) {
                    return EnumC12843.NONE;
                }
                if (c1502.f5235.length == 0 && (m9773(str2, str3) || m9762(str2, c1502M9774, str3, c1502) || m9763(str2, c1502M9774, str3, c9704M9771, false))) {
                    return EnumC12843.CONTRACT;
                }
                return m9756(str5, strM9755, str3, c9704M9771, false);
            }
            C1502 c1502M9777 = m9774(str2);
            HashSet hashSet = new HashSet();
            m9760(str2, c1502M9777, hashSet);
            if (hashSet.isEmpty()) {
                c1502M9775 = C1502.f5233;
            } else {
                HashSet hashSet2 = new HashSet();
                String str6 = str5;
                while (true) {
                    if (str6 != null && hashSet2.add(str6)) {
                        C19401 c19401M9779 = m9777(str6);
                        if (c19401M9779 != null) {
                            if (c19401M9779.m44868()) {
                                C1502 c1502M5356 = C1502.m5356(str6, c19401M9779.m44864(), true);
                                if (m9785(str6, c1502M5356, hashSet)) {
                                    c1502M9775 = c1502M5356;
                                }
                            }
                            str6 = c19401M9779.f62698;
                        }
                    }
                    c1502M9775 = m9775(str5);
                    if (!m9785(str5, c1502M9775, hashSet)) {
                        c1502M9775 = C1502.f5233;
                    }
                }
            }
            C1502 c1503 = c1502M9775;
            str2 = str5;
            c1502M9776 = c1503;
        } else {
            if (str.equals(str2) || !m9778(str, str2)) {
                return EnumC12843.NONE;
            }
            c1502M9776 = m9775(str2);
            if (c1502M9776.f5237 && str3.equals(str2)) {
                return EnumC12843.CONTRACT;
            }
            if (c1502M9776.f5235.length == 0 && c1502.f5235.length == 0 && (m9784(str2, c1502M9776, str3, c1502) || m9780(str2, str3) || m9762(str2, c1502M9776, str3, c1502) || m9763(str2, c1502M9776, str3, c9704M9771, false))) {
                return EnumC12843.CONTRACT;
            }
        }
        String str7 = c1502.f5236;
        if (str7 == null) {
            return m9785(str2, c1502M9776, c9704M9771.f31335) ? EnumC12843.CONTRACT : EnumC12843.NONE;
        }
        if (!str7.equals(c1502M9776.f5236)) {
            return EnumC12843.NONE;
        }
        return EnumC12843.EXACT;
    }

    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9791(String str, String str2) {
        if (!this.f9739.equals(str2)) {
            return false;
        }
        C9704 c9704M9771 = m9771(str);
        if (!c9704M9771.f31333) {
            return c9704M9771.f31337.f5236 != null;
        }
        C19401 c19401M9777 = m9777(str);
        return c19401M9777 != null && c19401M9777.m44864();
    }

    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9792(String str, String str2, String str3) {
        if (!this.f9739.equals(str3)) {
            return false;
        }
        C9704 c9704M9771 = m9771(str2);
        HashMap map = c9704M9771.f31338;
        C1502 c1502 = c9704M9771.f31337;
        if (c9704M9771.f31333) {
            return false;
        }
        String str4 = c1502.f5236;
        String str5 = c1502.f5236;
        if (str4 == null) {
            return false;
        }
        C19401 c19401M9777 = m9777(str);
        if (c19401M9777 != null && c19401M9777.m44862()) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C1502 c1502M9774 = m9774(str);
        boolean z = (c1502M9774.f5237 || c1502.f5237) ? false : true;
        boolean zEquals = str5.equals(c1502M9774.f5236);
        if (!zEquals) {
            zEquals = m9784(str, c1502M9774, str2, c1502);
        }
        if (!zEquals && m9779(str)) {
            zEquals = !m9788(str2, str) ? false : m9767(m9774(str2));
        }
        if (!zEquals && m9772(str)) {
            zEquals = !m9788(str2, str) ? false : m9786(m9774(str2), str);
        }
        if (!zEquals && z) {
            zEquals = m9762(str, c1502M9774, str2, c1502);
        }
        if (!zEquals && z && m9788(str2, str)) {
            zEquals = m9785(str, c1502M9774, c9704M9771.f31335);
        }
        if (!zEquals) {
            if (c9704M9771.f31334 == null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                ArrayDeque arrayDeque = new ArrayDeque();
                for (Map.Entry entry : this.f9741.entrySet()) {
                    if (m9787((String) entry.getKey()) && !((C19401) entry.getValue()).m44866()) {
                        String str6 = (String) entry.getKey();
                        C1502 c1502M9775 = m9774(str6);
                        if (str5.equals(c1502M9775.f5236)) {
                            hashSet2.clear();
                            m9760(str6, c1502M9775, hashSet2);
                            hashSet4.clear();
                            arrayDeque.clear();
                            arrayDeque.addLast(str6);
                            while (!arrayDeque.isEmpty()) {
                                String str7 = (String) arrayDeque.removeFirst();
                                if (hashSet4.add(str7)) {
                                    C19401 c19401M9778 = m9777(str7);
                                    if (c19401M9778 == null) {
                                        if ((m9779(str7) && m9767(c1502M9775)) || (m9772(str7) && m9786(c1502M9775, str7))) {
                                            hashSet.add(str7);
                                        }
                                    } else {
                                        hashSet3.clear();
                                        C1502 c1502M9776 = m9774(str7);
                                        m9760(str7, c1502M9776, hashSet3);
                                        if (m9766(hashSet2, hashSet3) || m9764(str7, c1502M9776, c1502M9775)) {
                                            hashSet.add(str7);
                                        }
                                        String str8 = c19401M9778.f62698;
                                        if (str8 != null) {
                                            arrayDeque.addLast(str8);
                                        }
                                        for (String str9 : c19401M9778.f62700) {
                                            arrayDeque.addLast(str9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                c9704M9771.f31334 = hashSet;
            }
            zEquals = c9704M9771.f31334.contains(str);
        }
        map.put(str, Boolean.valueOf(zEquals));
        return zEquals;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d0 A[PHI: r2
      0x00d0: PHI (r2v8 boolean) = (r2v7 boolean), (r2v9 boolean) binds: [B:52:0x00a9, B:60:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC5386
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo9793(String str, String str2, String str3) {
        C1502 c1502M9774;
        boolean zM9786;
        boolean zM9763;
        boolean z = false;
        if (this.f9739.equals(str3)) {
            C9704 c9704M9771 = m9771(str2);
            HashSet hashSet = c9704M9771.f31335;
            HashMap map = c9704M9771.f31336;
            C1502 c1502 = c9704M9771.f31337;
            C19401 c19401M9777 = m9777(str);
            if (!c9704M9771.f31333 && (c19401M9777 == null || !c19401M9777.m44862())) {
                Boolean bool = (Boolean) map.get(str);
                if (bool != null) {
                    return bool.booleanValue();
                }
                C1502 c1502M9775 = m9774(str);
                boolean zM9784 = m9784(str, c1502M9775, str2, c1502);
                if (zM9784 || !m9779(str)) {
                    if (zM9784 || !m9772(str)) {
                        if (zM9784 || !hashSet.isEmpty()) {
                            if (!zM9784) {
                                zM9784 = m9785(str, c1502M9775, hashSet);
                            }
                        } else if (!m9779(str2)) {
                            if (m9772(str2)) {
                                if (!m9788(str, str2) ? false : m9786(m9774(str), str2)) {
                                    zM9784 = true;
                                }
                            }
                        } else if (m9788(str, str2)) {
                            c1502M9774 = m9774(str);
                            zM9786 = m9767(c1502M9774);
                            zM9784 = zM9786;
                        }
                    } else if (m9788(str2, str)) {
                        zM9786 = m9786(m9774(str2), str);
                        zM9784 = zM9786;
                    }
                    zM9784 = false;
                } else if (m9788(str2, str)) {
                    c1502M9774 = m9774(str2);
                    zM9786 = m9767(c1502M9774);
                    zM9784 = zM9786;
                } else {
                    zM9784 = false;
                }
                if (zM9784) {
                    zM9763 = zM9784;
                } else {
                    if (!c1502M9775.f5237 && !c1502.f5237) {
                        z = true;
                    }
                    if (z) {
                        zM9784 = m9762(str, c1502M9775, str2, c1502);
                    }
                    if (zM9784) {
                        zM9763 = zM9784;
                    } else if (z) {
                        zM9763 = m9763(str, c1502M9775, str2, c9704M9771, false);
                    } else {
                        zM9763 = m9763(str, c1502M9775, str2, c9704M9771, true);
                    }
                }
                map.put(str, Boolean.valueOf(zM9763));
                return zM9763;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m9778(String str, String str2) {
        HashSet hashSet = this.f9742;
        hashSet.clear();
        boolean zM9781 = m9781(str, str2, hashSet);
        hashSet.clear();
        return zM9781;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m9781(String str, String str2, HashSet hashSet) {
        C19401 c19401M9777;
        if (str.equals(str2)) {
            return true;
        }
        if (!hashSet.add(str) || (c19401M9777 = m9777(str)) == null) {
            return false;
        }
        String str3 = c19401M9777.f62698;
        if (str3 != null && (str3.equals(str2) || m9781(c19401M9777.f62698, str2, hashSet))) {
            return true;
        }
        for (String str4 : c19401M9777.f62700) {
            if (str4.equals(str2) || m9781(str4, str2, hashSet)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m9788(String str, String str2) {
        HashMap map = this.f9735;
        HashMap map2 = (HashMap) map.get(str);
        Boolean bool = map2 == null ? null : (Boolean) map2.get(str2);
        if (bool != null) {
            return bool.booleanValue();
        }
        HashSet hashSet = this.f9742;
        hashSet.clear();
        boolean zM9781 = m9781(str, str2, hashSet);
        hashSet.clear();
        HashMap map3 = (HashMap) map.get(str);
        if (map3 == null) {
            map3 = new HashMap();
            map.put(str, map3);
        }
        map3.put(str2, Boolean.valueOf(zM9781));
        return zM9781;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9769(InterfaceC8631 interfaceC8631) {
        int iMo13184 = interfaceC8631.mo13184();
        if (EnumC2536.ABSTRACT.m8459(iMo13184)) {
            return false;
        }
        return interfaceC8631.mo13175() != null || EnumC2536.NATIVE.m8459(iMo13184);
    }
}
