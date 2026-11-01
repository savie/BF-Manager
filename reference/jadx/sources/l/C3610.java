package l;

import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۘ֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q78Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C3610 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14952 f13264;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11040 f13265;

    public C3610(C7221 c7221, C14578 c14578, C14952 c14952, C11040 c11040) {
        this.f13264 = c14952;
        this.f13265 = c11040;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0434 m10698(C21956 c21956, C14196 c14196) throws C12731 {
        ArrayList arrayList = new ArrayList();
        String str = c14196.f46556;
        int i = c14196.f46557;
        int i2 = 0;
        for (C9878 c9878 : this.f13264.m35885(c21956, str)) {
            if (c9878.f33725.startsWith(c14196.f46549)) {
                if (i2 >= i && arrayList.size() < c14196.f46554) {
                    arrayList.add(c9878);
                }
                i2++;
            }
        }
        int size = arrayList.size() + i;
        C0434 c0434 = new C0434(c21956.f71244, "zip_entries", c14196.f46549, arrayList.size(), i2, c14196.f46554, size < i2, size, null, null, null, 0);
        c0434.f1997.addAll(arrayList);
        try {
            c0434.f2000.putAll(C12451.m30925(c21956.f71232.m46690("cache"), c21956.f71229, c21956.f71222, arrayList));
            return c0434;
        } catch (IOException unused) {
            throw C2664.m8200(c21956.f71219, c21956.f71236);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0434 m10695(C21956 c21956, C14196 c14196) {
        ArrayList<C5032> arrayListM35870;
        String str = c14196.f46549;
        String strReplace = str == null ? "" : str.replace('.', '/');
        ArrayList arrayList = new ArrayList();
        C14952 c14952 = this.f13264;
        String str2 = c14196.f46556;
        synchronized (c14952) {
            arrayListM35870 = c14952.m35870(c21956, str2, false, (C15283) null);
        }
        int i = 0;
        for (C5032 c5032 : arrayListM35870) {
            if (!strReplace.isEmpty()) {
                String strM48798 = C21966.m48798(c5032.f17548);
                String strM6825 = C2209.m6825(strM48798);
                if (strM48798.startsWith(strReplace) || strM6825.replace('.', '/').startsWith(strReplace)) {
                }
            }
            if (i >= c14196.f46557 && arrayList.size() < c14196.f46554) {
                C7807 c7807M35874 = this.f13264.m35874(c21956, c14196.f46556, c5032);
                int i2 = 0;
                for (InterfaceC17822 interfaceC17822 : c7807M35874.getFields()) {
                    i2++;
                }
                int i3 = 0;
                for (InterfaceC18528 interfaceC18528 : c7807M35874.getMethods()) {
                    i3++;
                }
                String type = c7807M35874.getType();
                arrayList.add(new C1876(type, i2, i3, C2209.m6825(type)));
            }
            i++;
        }
        int size = c14196.f46557 + arrayList.size();
        C0434 c0434 = new C0434(c21956.f71244, "dex_classes", c14196.f46549, arrayList.size(), i, c14196.f46554, size < i, size, null, null, null, 0);
        c0434.f2006.addAll(arrayList);
        return c0434;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0434 m10696(C21956 c21956, C14196 c14196, C15283 c15283) {
        String str = c14196.f46552;
        int i = c14196.f46553;
        C20555 c20555M35892 = this.f13264.m35892(c21956, c14196.f46556, str, c15283);
        C12089 c12089M30083 = C12089.m30083(str, c20555M35892.f66556);
        LinkedHashMap linkedHashMap = c20555M35892.f66557;
        LinkedHashMap linkedHashMap2 = c20555M35892.f66555;
        ArrayList<C0093> arrayList = c12089M30083.f40452;
        for (C0093 c0093 : arrayList) {
            String str2 = c0093.f1011;
            String str3 = c0093.f1010;
            if (e.s.equals(str2)) {
                C16322 c16322 = (C16322) linkedHashMap.get(str3);
                if (c16322 != null) {
                    c0093.f1013 = c16322;
                }
            } else if ("field".equals(c0093.f1011)) {
                c0093.f1016 = (C15617) linkedHashMap2.get(str3);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (int i3 = i; i3 < size && i2 < c14196.f46550; i3++) {
            C0093 c0094 = (C0093) arrayList.get(i3);
            if ("field".equals(c0094.f1011)) {
                arrayList2.add(c0094);
            } else {
                arrayList3.add(c0094);
            }
            i2++;
        }
        int i4 = i + i2;
        C0434 c0434 = new C0434(c21956.f71244, "dex_class_outline", "", i2, size, c14196.f46550, i4 < size, 0, str, C2209.m6825(str), c12089M30083, i4);
        c0434.f2012.addAll(arrayList2);
        c0434.f1998.addAll(arrayList3);
        return c0434;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0434 m10697(C21956 c21956, C14196 c14196) throws C12731 {
        String str = c14196.f46556;
        C11040 c11040 = this.f13265;
        C14952 c14952 = this.f13264;
        C22703 c22703M27844 = c11040.m27844(c21956, c14952, str);
        try {
            String str2 = c14196.f46549;
            int i = c14196.f46557;
            int i2 = c14196.f46554;
            HashSet hashSet = new HashSet();
            Iterator it = c14952.m35885(c21956, str).iterator();
            while (it.hasNext()) {
                hashSet.add(((C9878) it.next()).f33725);
            }
            C23678 c23678M50316 = c22703M27844.m50316(i, i2, str2, hashSet);
            ArrayList arrayList = c23678M50316.f76610;
            C0434 c0434 = new C0434(c21956.f71244, "resource_table", c14196.f46549, arrayList.size(), c23678M50316.f76607, c14196.f46554, c23678M50316.f76608, c23678M50316.f76609, null, null, null, 0);
            c0434.f2008.addAll(arrayList);
            return c0434;
        } catch (C12731 e) {
            if (C14952.m35723(str)) {
                C11040.m27837(c21956, e);
            }
            throw e;
        }
    }
}
