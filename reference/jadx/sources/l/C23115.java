package l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6F5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23115 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f74970 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f74971;

    public C23115(ContextThemeWrapper contextThemeWrapper) {
        this.f74971 = contextThemeWrapper.getApplicationContext();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map m52049(C15655 c15655, C25133 c25133) {
        int iIntValue;
        String str;
        Context context = this.f74971;
        C10258.m26450(c25133);
        HashSet<String> hashSet = new HashSet();
        List<C20131> list = c15655.f50877;
        for (C20131 c20131 : list) {
            C10258.m26450(c25133);
            String str2 = (String) c20131.f64695.get("resource-id");
            if (m52048(str2) && !str2.startsWith("android:") && (str = (String) c20131.f64695.get("package")) != null && !str.isEmpty()) {
                hashSet.add(str);
            }
        }
        HashMap map = this.f74970;
        map.keySet().retainAll(hashSet);
        HashMap map2 = new HashMap();
        for (String str3 : hashSet) {
            C10258.m26450(c25133);
            try {
                ArrayList<C22369> arrayListM52046 = m52046(context.getPackageManager().getApplicationInfo(str3, 0));
                C11180 c11180 = (C11180) map.get(str3);
                if (c11180 == null || !c11180.f35251.equals(arrayListM52046)) {
                    HashMap map3 = new HashMap();
                    for (C22369 c22369 : arrayListM52046) {
                        C10258.m26450(c25133);
                        C10258 c10258M26448 = C10258.m26448(c22369.f72419, context.getCacheDir(), c25133);
                        if (c10258M26448 != null) {
                            try {
                                m52047(c10258M26448.f32758, map3, c25133);
                            } catch (Throwable th) {
                                try {
                                    c10258M26448.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        if (c10258M26448 != null) {
                            c10258M26448.close();
                        }
                    }
                    if (!arrayListM52046.equals(m52046(context.getPackageManager().getApplicationInfo(str3, 0)))) {
                        throw new IOException("APK changed during resource ID lookup");
                    }
                    C11180 c11181 = new C11180(arrayListM52046, map3);
                    map.put(str3, c11181);
                    c11180 = c11181;
                }
                map2.put(str3, c11180.f35252);
            } catch (InterruptedIOException e) {
                throw e;
            } catch (Exception unused) {
                if (0 == 0) {
                    map.remove(str3);
                } else {
                    map.put(str3, new C11180(null, Collections.EMPTY_MAP));
                }
            }
        }
        HashMap map4 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C10258.m26450(c25133);
            C20131 c20132 = (C20131) list.get(i);
            String str4 = (String) c20132.f64695.get("resource-id");
            if (m52048(str4)) {
                if (str4.startsWith("android:")) {
                    Resources system = Resources.getSystem();
                    iIntValue = system.getIdentifier(str4, null, null);
                    if (iIntValue != 0) {
                        try {
                            if (!str4.equals(system.getResourceName(iIntValue))) {
                            }
                        } catch (Resources.NotFoundException unused2) {
                        }
                    }
                } else {
                    Map map5 = (Map) map2.get(c20132.f64695.get("package"));
                    iIntValue = map5 != null ? ((Integer) C11392.getOrDefault(map5, str4, 0)).intValue() : 0;
                }
                if (iIntValue != 0) {
                    map4.put(Integer.valueOf(i), String.format(Locale.ROOT, "0x%08x", Integer.valueOf(iIntValue)));
                }
            }
        }
        return C4681.unmodifiableMap(map4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52050() {
        this.f74970.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52048(String str) {
        if (str == null) {
            return false;
        }
        int iIndexOf = str.indexOf(58);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(47, i);
        return iIndexOf > 0 && iIndexOf2 > i && iIndexOf2 < str.length() - 1 && str.indexOf(58, i) < 0 && str.indexOf(47, iIndexOf2 + 1) < 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m52046(ApplicationInfo applicationInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C22369(applicationInfo.sourceDir));
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(new C22369(str));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52047(AbstractC21094 abstractC21094, HashMap map, C25133 c25133) throws IOException {
        if (abstractC21094.mo10510() < 12 || abstractC21094.mo10514(0) != 2 || abstractC21094.mo10513(4) != abstractC21094.mo10510()) {
            throw new IOException("Invalid resource table header");
        }
        int iMo10514 = abstractC21094.mo10514(2);
        if (iMo10514 < 12 || iMo10514 > abstractC21094.mo10510()) {
            throw new IOException("Invalid resource table header size");
        }
        int i = 0;
        while (true) {
            int i2 = 24;
            int i3 = 16;
            int i4 = 8;
            if (iMo10514 < abstractC21094.mo10510()) {
                C10258.m26450(c25133);
                if (abstractC21094.m48154(iMo10514) < 8) {
                    throw new IOException("Truncated resource table chunk");
                }
                int iMo10515 = abstractC21094.mo10514(iMo10514 + 2);
                int iMo10513 = abstractC21094.mo10513(iMo10514 + 4);
                if (iMo10515 < 8 || iMo10513 < iMo10515 || iMo10513 > abstractC21094.m48154(iMo10514)) {
                    throw new IOException("Invalid resource table chunk");
                }
                if (abstractC21094.mo10514(iMo10514) == 512) {
                    i++;
                    if (iMo10515 < 284) {
                        throw new IOException("Invalid resource package header");
                    }
                    int iMo10516 = abstractC21094.mo10513(iMo10514 + 8);
                    if (iMo10516 <= 0 || iMo10516 > 255 || (iMo10515 >= 288 && abstractC21094.mo10513(iMo10514 + 284) != 0)) {
                        throw new IOException("Unsupported dynamic resource package or type ID offset");
                    }
                    int i5 = iMo10515 + iMo10514;
                    for (int i6 = iMo10514 + iMo10513; i5 < i6; i6 = i6) {
                        C10258.m26450(c25133);
                        int i7 = i6 - i5;
                        if (i7 < i4) {
                            throw new IOException("Truncated resource package chunk");
                        }
                        int iMo10517 = abstractC21094.mo10514(i5 + 2);
                        int iMo10518 = abstractC21094.mo10513(i5 + 4);
                        if (iMo10517 < i4 || iMo10518 < iMo10517 || iMo10518 > i7) {
                            throw new IOException("Invalid resource package chunk");
                        }
                        int iMo10519 = abstractC21094.mo10514(i5);
                        if (iMo10519 == 514 || iMo10519 == 513) {
                            if (iMo10517 < i3) {
                                throw new IOException("Invalid resource type header");
                            }
                            int iMo105110 = abstractC21094.mo10513(i5 + 12);
                            if (iMo105110 < 0 || iMo105110 > 65536) {
                                throw new IOException("Invalid resource type entry count");
                            }
                            if (iMo10519 == 513) {
                                if (iMo10517 < i2) {
                                    throw new IOException("Invalid resource config header");
                                }
                                int iMo105111 = abstractC21094.mo10513(i5 + 16);
                                byte bMo10516 = abstractC21094.mo10516(i5 + 9);
                                if ((((long) iMo105110) * ((long) (((bMo10516 & 1) != 0 || (bMo10516 & 2) == 0) ? 4 : 2))) + ((long) iMo10517) > iMo105111 || iMo105111 > iMo10518) {
                                    throw new IOException("Invalid resource entry offsets");
                                }
                            }
                        }
                        i5 += iMo10518;
                        i2 = 24;
                        i3 = 16;
                        i4 = 8;
                    }
                }
                iMo10514 += iMo10513;
            } else {
                if (i == abstractC21094.mo10513(8)) {
                    C24296 c24296 = new C24296(abstractC21094);
                    c24296.m54313();
                    if (c24296.mo15674() != i) {
                        throw new IOException("Incomplete resource table");
                    }
                    for (C7887 c7887 : c24296.mo15672()) {
                        for (InterfaceC15344 interfaceC15344 : c7887.mo19822()) {
                            C10258.m26450(c25133);
                            if ("id".equals(interfaceC15344.getTypeName())) {
                                if (interfaceC15344.mo35833() <= 0 || interfaceC15344.mo35833() > 255) {
                                    throw new IOException("Invalid resource type ID");
                                }
                                for (InterfaceC2731 interfaceC2731 : interfaceC15344.mo33925()) {
                                    if (interfaceC2731.mo9069() > 65535) {
                                        throw new IOException("Invalid resource entry ID");
                                    }
                                    for (int i8 = 0; i8 <= interfaceC2731.mo9069(); i8++) {
                                        C10258.m26450(c25133);
                                        String strMo9070 = interfaceC2731.mo9070(i8);
                                        if (strMo9070 != null) {
                                            if (!interfaceC2731.mo9075(i8)) {
                                                throw new IOException("Invalid resource entry");
                                            }
                                            String str = c7887.getPackageName() + ":id/" + strMo9070;
                                            int iMo27607 = (c7887.mo27607() << 24) | (interfaceC15344.mo35833() << 16) | i8;
                                            Integer num = (Integer) map.get(str);
                                            if (num != null && num.intValue() != iMo27607) {
                                                iMo27607 = 0;
                                            }
                                            map.put(str, Integer.valueOf(iMo27607));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                throw new IOException("Resource package count mismatch");
            }
        }
    }
}
