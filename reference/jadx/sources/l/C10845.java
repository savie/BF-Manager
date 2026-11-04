package l;

import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۤۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q78Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C10845 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18282 f34342;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15473 f34343;

    public C10845(C20893 c20893, C12887 c12887, C18282 c18282, C15473 c15473) {
        this.f34342 = c18282;
        this.f34343 = c15473;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3960 m27575(C14069 c14069, C19050 c19050) throws C10186 {
        ArrayList arrayList = new ArrayList();
        String str = c19050.f61738;
        int i = c19050.f61736;
        int i2 = 0;
        for (C19291 c19291 : this.f34342.m42605(c14069, str)) {
            if (c19291.f62362.startsWith(c19050.f61735)) {
                if (i2 >= i && arrayList.size() < c19050.f61733) {
                    arrayList.add(c19291);
                }
                i2++;
            }
        }
        int size = arrayList.size() + i;
        C3960 c3960 = new C3960(c14069.f44556, "zip_entries", arrayList.size(), i2, c19050.f61733, size < i2, size, null, null, null, 0);
        c3960.f13540.addAll(arrayList);
        try {
            c3960.f13537.putAll(C22933.m51687(c14069.f44536.m49876("cache"), c14069.f44537, c14069.f44532, arrayList));
            return c3960;
        } catch (IOException unused) {
            throw C18723.m43535(c14069.f44548, c14069.f44531);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3960 m27572(C14069 c14069, C19050 c19050) {
        ArrayList<C23330> arrayListM42589;
        String str = c19050.f61735;
        String strReplace = str == null ? "" : str.replace('.', '/');
        ArrayList arrayList = new ArrayList();
        C18282 c18282 = this.f34342;
        String str2 = c19050.f61738;
        synchronized (c18282) {
            arrayListM42589 = c18282.m42589(c14069, str2, false, (C4156) null);
        }
        int i = 0;
        for (C23330 c23330 : arrayListM42589) {
            if (!strReplace.isEmpty()) {
                String strM10509 = C3192.m10509(c23330.f75565);
                String strM37841 = C15870.m37841(strM10509);
                if (strM10509.startsWith(strReplace) || strM37841.replace('.', '/').startsWith(strReplace)) {
                }
            }
            if (i >= c19050.f61736 && arrayList.size() < c19050.f61733) {
                C22737 c22737M42599 = this.f34342.m42599(c14069, c19050.f61738, c23330);
                int i2 = 0;
                for (InterfaceC2665 interfaceC2665 : c22737M42599.getFields()) {
                    i2++;
                }
                int i3 = 0;
                for (InterfaceC8631 interfaceC8631 : c22737M42599.getMethods()) {
                    i3++;
                }
                String type = c22737M42599.getType();
                arrayList.add(new C5430(type, i2, i3, C15870.m37841(type)));
            }
            i++;
        }
        int size = c19050.f61736 + arrayList.size();
        C3960 c3960 = new C3960(c14069.f44556, "dex_classes", arrayList.size(), i, c19050.f61733, size < i, size, null, null, null, 0);
        c3960.f13539.addAll(arrayList);
        return c3960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3960 m27573(C14069 c14069, C19050 c19050, C4156 c4156) {
        String str = c19050.f61731;
        int i = c19050.f61737;
        C8412 c8412M42612 = this.f34342.m42612(c14069, c19050.f61738, str, c4156);
        C22474 c22474M50676 = C22474.m50676(str, c8412M42612.f27565);
        LinkedHashMap linkedHashMap = c8412M42612.f27566;
        LinkedHashMap linkedHashMap2 = c8412M42612.f27564;
        ArrayList<C4574> arrayList = c22474M50676.f72713;
        for (C4574 c4574 : arrayList) {
            String str2 = c4574.f16284;
            String str3 = c4574.f16280;
            if (e.s.equals(str2)) {
                C21728 c21728 = (C21728) linkedHashMap.get(str3);
                if (c21728 != null) {
                    c4574.f16282 = c21728;
                }
            } else if ("field".equals(c4574.f16284)) {
                c4574.f16283 = (C6921) linkedHashMap2.get(str3);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (int i3 = i; i3 < size && i2 < c19050.f61739; i3++) {
            C4574 c4575 = (C4574) arrayList.get(i3);
            if ("field".equals(c4575.f16284)) {
                arrayList2.add(c4575);
            } else {
                arrayList3.add(c4575);
            }
            i2++;
        }
        int i4 = i + i2;
        C3960 c3960 = new C3960(c14069.f44556, "dex_class_outline", i2, size, c19050.f61739, i4 < size, 0, str, C15870.m37841(str), c22474M50676, i4);
        c3960.f13533.addAll(arrayList2);
        c3960.f13525.addAll(arrayList3);
        return c3960;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3960 m27574(C14069 c14069, C19050 c19050) throws C10186 {
        String str = c19050.f61738;
        C15473 c15473 = this.f34343;
        C18282 c18282 = this.f34342;
        C7972 c7972M37042 = c15473.m37042(c14069, c18282, str);
        try {
            String str2 = c19050.f61732;
            String str3 = c19050.f61730;
            int i = c19050.f61736;
            int i2 = c19050.f61733;
            HashSet hashSet = new HashSet();
            Iterator it = c18282.m42605(c14069, str).iterator();
            while (it.hasNext()) {
                hashSet.add(((C19291) it.next()).f62362);
            }
            C11700 c11700M21750 = c7972M37042.m21750(str2, str3, i, i2, hashSet);
            ArrayList arrayList = c11700M21750.f37865;
            C3960 c3960 = new C3960(c14069.f44556, "resource_table", arrayList.size(), c11700M21750.f37866, c19050.f61733, c11700M21750.f37863, c11700M21750.f37864, null, null, null, 0);
            c3960.f13536.addAll(arrayList);
            return c3960;
        } catch (C10186 e) {
            if (C18282.m42583(str)) {
                C15473.m37035(c14069, e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3960 m27576(C14069 c14069, C19050 c19050) throws C10186 {
        C18282 c18282 = this.f34342;
        try {
            return this.f34343.m37042(c14069, c18282, c19050.f61738).m21748(c19050);
        } catch (C10186 e) {
            if (C18282.m42583(c19050.f61738)) {
                C15473.m37035(c14069, e);
            }
            throw e;
        }
    }
}
