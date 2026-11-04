package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Predicate;
import org.simpleframework.xml.core.Entry;

/* JADX INFO: renamed from: l.ܿۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes.dex */
public final class C18282 {

    /* JADX INFO: renamed from: ۠ܿۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f59625;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final RuntimeException f59626;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12887 f59627;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15473 f59628;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m42587(C14069 c14069, String str, String str2, C4156 c4156) {
        if (m42583(str)) {
            return this.f59627.m31926(c14069, str2, false, c4156).f27565;
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        C13061 c13061 = (C13061) m42459(abstractC22044M42549, c4156).get(str2);
        if (c13061 != null) {
            return m42441(m42567(abstractC22044M42549, c13061));
        }
        if (m42561(abstractC22044M42549, str2) != null) {
            throw C18723.m43532(c14069.f44556, str);
        }
        return this.f59627.m31926(c14069, str2, false, c4156).f27565;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m42589(C14069 c14069, String str, boolean z, C4156 c4156) {
        if (m42583(str)) {
            return c14069.f44551;
        }
        if (!z) {
            m42531(c14069, str, c4156);
        }
        C16790 c16790M42482 = m42482(c14069, str, m42549(c14069, str), c4156);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C23330 c23330 : c14069.f44551) {
            if (!c16790M42482.f54173.contains(c23330.f75565) && !c16790M42482.f54177.containsKey(c23330.f75565)) {
                arrayList.add(c23330);
                hashSet.add(c23330.f75565);
            }
        }
        for (C13061 c13061 : c16790M42482.f54174.values()) {
            if (!c16790M42482.f54173.contains(c13061.f41795) && hashSet.add(c13061.f41795)) {
                arrayList.add(new C23330(c13061.f41796, -1, -1, c13061.f41795));
            }
        }
        C12884.sort(arrayList, C2661.comparing(new C6081(1)));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C0231 m42590(C14069 c14069, C9353 c9353) {
        AbstractC22044 abstractC22044M42549 = m42549(c14069, c9353.f30380);
        if (m42548(abstractC22044M42549).contains(c9353.f30382)) {
            throw m42562();
        }
        C15298 c15298 = (C15298) m42552(abstractC22044M42549).get(c9353.f30382);
        ArrayList arrayList = new ArrayList(c9353.f30381);
        C12884.sort(arrayList, C2661.comparingInt(new C9334(1)));
        m42569(arrayList);
        m42494(c14069, abstractC22044M42549, c15298, c9353.f30382);
        if (c15298 == null || !"zip_entry".equals(c15298.f50010)) {
            return m42461(c14069, abstractC22044M42549, c9353, arrayList);
        }
        return m42462(abstractC22044M42549, c9353, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5977 m42592(C14069 c14069, C22606 c22606, OutputStream outputStream) {
        long jM42446;
        String str = c22606.f73064;
        m42439(str);
        m42539(c14069, c22606.f73062, str);
        C0099 c0099M42553 = m42553(c14069, c22606.f73062, str);
        String str2 = c22606.f73062;
        if (c0099M42553.f1039) {
            throw m42478(c14069, str2, str, "directory");
        }
        if (c0099M42553.f1037) {
            throw m42478(c14069, str2, str, "axml_entry");
        }
        if (m42583(str2)) {
            if (c0099M42553.f1038) {
                long jM42447 = m42446(c14069, c22606.f73062, str, outputStream);
                return new C5977(c14069.f44556, c22606.f73062, str, jM42447, null);
            }
            String str3 = c22606.f73062;
            C10186 c10186M26300 = C10186.m26300("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m42491(c10186M26300, c14069, str3, str);
            throw c10186M26300;
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, c22606.f73062);
        if (m42548(abstractC22044M42549).contains(str)) {
            String str4 = c22606.f73062;
            C10186 c10186M26301 = C10186.m26300("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m42491(c10186M26301, c14069, str4, str);
            throw c10186M26301;
        }
        C15298 c15298 = (C15298) m42552(abstractC22044M42549).get(str);
        int i = m42584(abstractC22044M42549).f42979;
        if (c15298 != null) {
            String str5 = c22606.f73062;
            AbstractC22044 abstractC22044M49876 = m42543(abstractC22044M42549).m49876(C18326.m42779(str)).m49876("data.bin");
            if ("axml".equals(c15298.f50010) || m42512(abstractC22044M49876, m42523(abstractC22044M49876))) {
                throw m42478(c14069, str5, str, "axml_entry");
            }
            String str6 = c22606.f73062;
            AbstractC22044 abstractC22044M49877 = m42543(abstractC22044M42549).m49876(C18326.m42779(str)).m49876("data.bin");
            m42523(abstractC22044M49877);
            try {
                try {
                    jM42446 = m42445(c14069, str6, str, abstractC22044M49877.mo4290(), outputStream);
                } catch (RuntimeException e) {
                    if (m42576(e)) {
                        throw m42477(c14069, str6, str, e);
                    }
                    throw e;
                }
            } catch (IOException e2) {
                throw m42477(c14069, str6, str, e2);
            }
        } else {
            if (!c0099M42553.f1038) {
                String str7 = c22606.f73062;
                C10186 c10186M26302 = C10186.m26300("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                m42491(c10186M26302, c14069, str7, str);
                throw c10186M26302;
            }
            jM42446 = m42446(c14069, c22606.f73062, str, outputStream);
        }
        String str8 = c22606.f73062;
        Integer numValueOf = Integer.valueOf(i);
        return new C5977(c14069.f44556, str8, str, jM42446, numValueOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native synchronized C6198 m42593(C14069 c14069);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C6198 m42594(C14069 c14069, C7863 c7863, C4156 c4156) {
        AbstractC22044 abstractC22044M42549 = m42549(c14069, c7863.f26190);
        if ("smali_class".equals(c7863.f26195)) {
            return m42468(c14069, abstractC22044M42549, c7863, c4156);
        }
        if ("smali_method".equals(c7863.f26195)) {
            return m42560(c14069, abstractC22044M42549, c7863, c4156);
        }
        if (!"axml".equals(c7863.f26195) && !"zip_entry".equals(c7863.f26195)) {
            throw m42527(c7863.f26195);
        }
        return m42467(c14069, abstractC22044M42549, c7863);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C7358 m42595(C14069 c14069, String str, String str2) {
        C18459 c18459;
        c18459 = new C18459();
        m42603(c14069, str, str2, c18459);
        return new C7358(c18459.toString(), "full_source", false, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C15892 m42597(C14069 c14069, C24272 c24272) {
        C17711 c17711M11566;
        try {
            AbstractC22044 abstractC22044M42549 = m42549(c14069, c24272.f78583);
            c17711M11566 = C3541.m11566(this.f59628.m37042(c14069, this, c24272.f78583), c24272, m42608(c14069, c24272.f78583));
            HashMap map = new HashMap();
            for (String str : c17711M11566.f58197) {
                map.put(str, new C24996(str, null));
            }
            for (C1260 c1260 : c17711M11566.f58199) {
                map.put(c1260.f4542, new C24996(C15022.m36182(c1260.f4544), c1260));
            }
            this.f59628.m37041(c14069.f44556, c24272.f78583);
            try {
                m42499(abstractC22044M42549, new ArrayList(map.values()));
                C16965.m40015(abstractC22044M42549);
            } catch (IOException e) {
                throw m42473(e);
            }
        } catch (C10186 e2) {
            C15561.m37286(e2, c24272, -1);
            throw e2;
        }
        return new C15892(c14069.f44556, c17711M11566.f58195, c24272.f78583, c17711M11566.f58196, c17711M11566.f58198);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C18876 m42598(C14069 c14069, C23526 c23526) {
        C2050 c2050M56084;
        try {
            AbstractC22044 abstractC22044M42549 = m42549(c14069, c23526.f76018);
            c2050M56084 = C25171.m56084(this.f59628.m37042(c14069, this, c23526.f76018), c23526);
            ArrayList arrayList = new ArrayList();
            for (C1260 c1260 : c2050M56084.f6815) {
                arrayList.add(new C24996(C15022.m36182(c1260.f4544), c1260));
            }
            this.f59628.m37041(c14069.f44556, c23526.f76018);
            try {
                m42499(abstractC22044M42549, arrayList);
                C16965.m40015(abstractC22044M42549);
            } catch (IOException e) {
                throw m42473(e);
            }
        } catch (C10186 e2) {
            e2.f32602.put("workspaceId", c14069.f44556).put("editSessionId", c23526.f76018);
            throw e2;
        }
        return new C18876(c14069.f44556, c23526.f76018, c2050M56084.f6816);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C23352 m42601(C14069 c14069, C12337 c12337, C4156 c4156) {
        AbstractC22044 abstractC22044M42549 = m42549(c14069, c12337.f39619);
        if ("smali_class".equals(c12337.f39620)) {
            return m42568(c14069, abstractC22044M42549, c12337);
        }
        if ("smali_method".equals(c12337.f39620)) {
            return m42487(c14069, abstractC22044M42549, c12337, c4156);
        }
        if (!"axml".equals(c12337.f39620) && !"zip_entry".equals(c12337.f39620)) {
            throw m42527(c12337.f39620);
        }
        return m42486(c14069, abstractC22044M42549, c12337);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C24844 m42602(C14069 c14069, String str) {
        AbstractC22044 abstractC22044M42549;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<C5452> arrayListM42457;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayListM42548;
        String str2;
        abstractC22044M42549 = m42549(c14069, str);
        m42442(c14069, abstractC22044M42549, (C4156) null);
        C6198 c6198M42551 = m42551(c14069, str);
        if (c6198M42551.f21105 > 0) {
            throw m42479(c14069, str, c6198M42551);
        }
        ArrayList<C13061> arrayList6 = new ArrayList(m42536(abstractC22044M42549).values());
        C12884.sort(arrayList6, C8627.thenComparing(C2661.comparing(new C17252()), new C15760()));
        arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C13061 c13061 : arrayList6) {
            String strM42779 = C18326.m42779(m42441(m42567(abstractC22044M42549, c13061)));
            C18744 c18744M42565 = m42565(abstractC22044M42549, c13061, strM42779);
            if (c18744M42565 == null) {
                throw m42479(c14069, str, m42551(c14069, str));
            }
            arrayList.add(new C1723(c13061.f41797, c13061.f41796, c18744M42565.f60901, strM42779));
            hashSet.add(c13061.f41796);
        }
        arrayList2 = new ArrayList();
        for (C6812 c6812 : m42585(abstractC22044M42549)) {
            String str3 = c6812.f22676;
            if (str3 == null || (str2 = c6812.f22677) == null) {
                throw m42471();
            }
            arrayList2.add(new C12909(str3, str2));
            hashSet.add(c6812.f22677);
        }
        C12884.sort(arrayList2, C8627.thenComparing(C2661.comparing(new C14359(2)), new C6361(2)));
        arrayList3 = new ArrayList(hashSet);
        C12884.sort(arrayList3, C15870.m37839());
        arrayListM42457 = m42457(c14069, abstractC22044M42549);
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        for (C5452 c5452 : arrayListM42457) {
            if (c5452.f19043) {
                arrayList5.add(c5452.f19045);
            } else {
                arrayList4.add(c5452.f19045);
            }
        }
        arrayListM42548 = m42548(abstractC22044M42549);
        C12884.sort(arrayList4, new C0187(0));
        C12884.sort(arrayList5, new C0187(0));
        C12884.sort(arrayListM42548, new C0187(0));
        return new C24844(str, m42584(abstractC22044M42549).f42979, abstractC22044M42549.m49876("cache").m49876("dex_build"), arrayList, arrayList2, arrayList3, arrayListM42457, arrayList4, arrayList5, arrayListM42548);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42603(C14069 c14069, String str, String str2, C18459 c18459) {
        c18459.m43009(0);
        if (!m42583(str)) {
            AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
            C19774 c19774M42566 = m42566(c14069, abstractC22044M42549, str2);
            if (c19774M42566.f63622 || "missing".equals(c19774M42566.f63623)) {
                throw m42562();
            }
            if (!"axml".equals(c19774M42566.f63623)) {
                throw C10186.m26300("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if (((C15298) m42552(abstractC22044M42549).get(str2)) != null) {
                m42504(m42543(abstractC22044M42549).m49876(C18326.m42779(str2)).m49876("text.xml"), c18459);
                return;
            }
        }
        m42570(c14069, str, str2, c18459);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m42605(C14069 c14069, String str) {
        if (m42583(str)) {
            return c14069.f44532;
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        HashSet hashSet = new HashSet(m42548(abstractC22044M42549));
        HashMap mapM42552 = m42552(abstractC22044M42549);
        boolean zIsEmpty = m42559(c14069, abstractC22044M42549).isEmpty();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (C19291 c19291 : c14069.f44532) {
            hashSet2.add(c19291.f62362);
            if (!hashSet.contains(c19291.f62362)) {
                C15298 c15298 = (C15298) mapM42552.get(c19291.f62362);
                if (c15298 != null) {
                    arrayList.add(C19291.m44659(c19291.f62362, m42450(abstractC22044M42549, c15298)));
                } else if (zIsEmpty || !"resources.arsc".equals(c19291.f62362)) {
                    arrayList.add(c19291);
                } else {
                    arrayList.add(C19291.m44659(c19291.f62362, null));
                }
            }
        }
        ArrayList<C15298> arrayList2 = new ArrayList();
        for (C15298 c15299 : mapM42552.values()) {
            if (!hashSet2.contains(c15299.f50009) && !hashSet.contains(c15299.f50009)) {
                arrayList2.add(c15299);
            }
        }
        C12884.sort(arrayList2, C2661.comparing(new C12031()));
        for (C15298 c152910 : arrayList2) {
            arrayList.add(C19291.m44659(c152910.f50009, m42450(abstractC22044M42549, c152910)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized C10823 m42606(C14069 c14069, String str, String str2) {
        try {
            if (m42583(str)) {
                return null;
            }
            AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
            if (m42548(abstractC22044M42549).contains(str2)) {
                throw m42562();
            }
            C15298 c15298 = (C15298) m42552(abstractC22044M42549).get(str2);
            if (c15298 == null) {
                return null;
            }
            if ("zip_entry".equals(c15298.f50010)) {
                try {
                    return new C10823(m42543(abstractC22044M42549).m49876(C18326.m42779(str2)).m49876("data.bin").m49865());
                } catch (IOException e) {
                    throw m42473(e);
                }
            }
            String strM42441 = m42441(m42543(abstractC22044M42549).m49876(C18326.m42779(str2)).m49876("text.xml"));
            String strM42779 = C18326.m42779(strM42441);
            C7557 c7557M42525 = m42525(abstractC22044M42549, str2, strM42779);
            if (c7557M42525 != null) {
                return new C10823(c7557M42525.f24924);
            }
            C0845 c0845M42463 = m42463(c14069, abstractC22044M42549.getName(), str2, strM42441, strM42779);
            C17384 c17384 = c0845M42463.f3167;
            if (c17384 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c17384);
                throw m42480(c14069, str, true, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed for saved edit session overlay.", m42448(arrayList), (String) null, (String) null);
            }
            try {
                m42497(abstractC22044M42549, str2, c0845M42463.f3166);
                return new C10823(c0845M42463.f3166.f71038);
            } catch (IOException e2) {
                throw m42473(e2);
            }
            throw th;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m42608(C14069 c14069, String str) {
        if (m42583(str)) {
            return new ArrayList();
        }
        return m42559(c14069, m42549(c14069, str));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final synchronized C10823 m42609(C14069 c14069, String str) {
        if (m42583(str)) {
            return null;
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        ArrayList arrayListM42559 = m42559(c14069, abstractC22044M42549);
        if (arrayListM42559.isEmpty()) {
            return null;
        }
        return new C10823(m42519(c14069, abstractC22044M42549, arrayListM42559));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized int m42610(C14069 c14069, String str) {
        if (m42583(str)) {
            return 0;
        }
        return m42584(m42549(c14069, str)).f42979;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C7358 m42611(C14069 c14069, String str, String str2) {
        if (!m42583(str)) {
            AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
            if (m42548(abstractC22044M42549).contains(str2)) {
                throw m42562();
            }
            C15298 c15298 = (C15298) m42552(abstractC22044M42549).get(str2);
            if (c15298 != null) {
                if ("axml".equals(c15298.f50010)) {
                    throw C18723.m43541(c14069.f44556, str, str2);
                }
                try {
                    InputStream inputStreamMo4290 = m42543(abstractC22044M42549).m49876(C18326.m42779(str2)).m49876("data.bin").mo4290();
                    try {
                        byte[] bArrM42516 = m42516(inputStreamMo4290, 10485776);
                        C7358 c7358M42469 = m42469(c14069, str, str2, bArrM42516, bArrM42516.length > 10485760);
                        if (inputStreamMo4290 != null) {
                            inputStreamMo4290.close();
                        }
                        return c7358M42469;
                    } catch (Throwable th) {
                        if (inputStreamMo4290 != null) {
                            try {
                                inputStreamMo4290.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw m42473(e);
                }
            }
        }
        return m42542(c14069, str, str2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C8412 m42612(C14069 c14069, String str, String str2, C4156 c4156) {
        if (m42583(str)) {
            return this.f59627.m31926(c14069, str2, true, c4156);
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        C13061 c13061 = (C13061) m42459(abstractC22044M42549, c4156).get(str2);
        if (c13061 == null) {
            if (m42561(abstractC22044M42549, str2) != null) {
                throw C18723.m43532(c14069.f44556, str);
            }
            return this.f59627.m31926(c14069, str2, true, c4156);
        }
        String strM42441 = m42441(m42567(abstractC22044M42549, c13061));
        C22737 c22737M42600 = m42600(c14069, str, new C23330(c13061.f41796, -1, -1, c13061.f41795), c4156);
        return new C8412(strM42441, C12777.m31668(c22737M42600), C12777.m31665(c22737M42600));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C17536 m42613(C14069 c14069, String str, C4156 c4156) {
        if (m42583(str)) {
            return new C17536(new ArrayList(c14069.f44553), new HashMap(), new HashSet());
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        C16790 c16790M42482 = m42482(c14069, str, abstractC22044M42549, c4156);
        ArrayList arrayListM42456 = m42456(c14069, c16790M42482);
        HashMap map = new HashMap();
        for (C13061 c13061 : c16790M42482.f54177.values()) {
            map.put(c13061.f41795, m42567(abstractC22044M42549, c13061));
        }
        return new C17536(arrayListM42456, map, new HashSet(c16790M42482.f54173));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C22737 m42614(C14069 c14069, String str, C23330 c23330, C4156 c4156) {
        if (m42583(str)) {
            return this.f59627.m31928(c14069, c23330, c4156);
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        C16790 c16790M42482 = m42482(c14069, str, abstractC22044M42549, c4156);
        C13061 c13061 = (C13061) c16790M42482.f54177.get(c23330.f75565);
        if (c13061 == null) {
            if (c16790M42482.f54173.contains(c23330.f75565)) {
                throw C18723.m43532(c14069.f44556, str);
            }
            return this.f59627.m31928(c14069, c23330, c4156);
        }
        String strM42441 = m42441(m42567(abstractC22044M42549, c13061));
        String strM42779 = C18326.m42779(strM42441);
        C18744 c18744M42565 = m42565(abstractC22044M42549, c13061, strM42779);
        if (c18744M42565 != null) {
            return c18744M42565.f60901;
        }
        m42443(c14069, abstractC22044M42549, c13061, strM42441);
        C18744 c18744M42566 = m42565(abstractC22044M42549, c13061, strM42779);
        if (c18744M42566 == null) {
            throw m42479(c14069, str, m42551(c14069, str));
        }
        return c18744M42566.f60901;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized HashMap m42615(C14069 c14069, String str) {
        HashMap map = new HashMap();
        if (m42583(str)) {
            return map;
        }
        for (C15298 c15298 : m42552(m42549(c14069, str)).values()) {
            map.put(c15298.f50009, c15298.f50010);
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized C22758 m42616(C14069 c14069, String str, String str2) {
        if (m42583(str)) {
            return null;
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        if (m42548(abstractC22044M42549).contains(str2)) {
            throw m42562();
        }
        C15298 c15298 = (C15298) m42552(abstractC22044M42549).get(str2);
        if (c15298 != null && "zip_entry".equals(c15298.f50010)) {
            AbstractC22044 abstractC22044M49876 = m42543(abstractC22044M42549).m49876(C18326.m42779(str2)).m49876("data.bin");
            if (!abstractC22044M49876.mo4304()) {
                throw m42473(new IOException("ZIP entry overlay data is missing"));
            }
            return new C22758(abstractC22044M49876);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42604(C14069 c14069, String str) {
        if (m42583(str)) {
            return;
        }
        try {
            AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
            C13523 c13523M42584 = m42584(abstractC22044M42549);
            int i = c13523M42584.f42979;
            m42575(abstractC22044M42549.m49876("state.json"), JSON.object().add("revision", i).add("createdAt", c13523M42584.f42978).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        } catch (IOException | RuntimeException | C10186 e) {
            C20653.m47272("MT MCP edit session build touch failed, workspaceId=" + c14069.f44556 + ", editSessionId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C8434 m42596(C14069 c14069, C18304 c18304) {
        C19159 c19159;
        C19159 c191510;
        C1260 c1260M4576;
        try {
            AbstractC22044 abstractC22044M42549 = m42549(c14069, c18304.f59694);
            C22363 c22363M38929 = C16395.m38929(this.f59628.m37042(c14069, this, c18304.f59694), m42458(c18304));
            C19159 c191511 = c22363M38929.f72391;
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap map = new HashMap();
                for (C1260 c1260 : m42608(c14069, c18304.f59694)) {
                    map.put(c1260.f4542, c1260);
                }
                Iterator it = c22363M38929.f72392.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    C13412 c13412 = (C13412) it.next();
                    boolean zEquals = c13412.f42730.equals(c13412.f42728);
                    Iterator it2 = it;
                    c191510 = c191511;
                    try {
                        arrayList.add(new C2468(c13412.f42725, c13412.f42727, c13412.f42726, c13412.f42730, !zEquals));
                        if (zEquals) {
                            i2++;
                        } else {
                            i++;
                            int i3 = (int) Long.parseLong(c13412.f42727.substring(2), 16);
                            C1260 c1261 = (C1260) map.get(C15022.m36182(C1260.m4572(i3, c13412.f42726)));
                            if (c13412.f42730.equals(c13412.f42724) && (c1261 == null || !c1261.m4578())) {
                                arrayList2.add(new C24996(C15022.m36182(C1260.m4572(i3, c13412.f42726)), null));
                            } else {
                                if (c1261 == null) {
                                    c1260M4576 = C1260.m4574(i3, c13412.f42726, c13412.f42728, c13412.f42730, c13412.f42729);
                                } else {
                                    c1260M4576 = c1261.m4576(c13412.f42728, c13412.f42729, c13412.f42730);
                                }
                                arrayList2.add(new C24996(C15022.m36182(c1260M4576.f4544), c1260M4576));
                            }
                        }
                        it = it2;
                        c191511 = c191510;
                    } catch (C10186 e) {
                        e = e;
                        c19159 = c191510;
                        m42490(e, c14069.f44556, c18304, c19159);
                        throw e;
                    }
                }
                if (i == 0) {
                    return new C8434(c14069.f44556, c18304.f59694, false, 0, i2, arrayList);
                }
                try {
                    this.f59628.m37041(c14069.f44556, c18304.f59694);
                    m42499(abstractC22044M42549, arrayList2);
                    C16965.m40015(abstractC22044M42549);
                    return new C8434(c14069.f44556, c18304.f59694, true, i, i2, arrayList);
                } catch (IOException e2) {
                    throw m42473(e2);
                }
            } catch (C10186 e3) {
                e = e3;
                c191510 = c191511;
            }
        } catch (C10186 e4) {
            e = e4;
            c19159 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c5 A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ca A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2 A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0204 A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0208 A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x021b A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0196 A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:93:0x019f A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01be A[Catch: all -> 0x024c, TryCatch #5 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5977 m42591(C14069 c14069, C19622 c19622, InterfaceC5626 interfaceC5626) throws Throwable {
        int i;
        boolean z;
        long jM42447;
        boolean z2;
        int iM42444;
        IOException iOException;
        C10186 c10186;
        try {
            try {
                String str = c19622.f63239;
                m42439(str);
                AbstractC22044 abstractC22044M42549 = m42549(c14069, c19622.f63237);
                m42539(c14069, c19622.f63237, str);
                C0099 c0099M42553 = m42553(c14069, c19622.f63237, str);
                String str2 = c19622.f63237;
                if (c0099M42553.f1039) {
                    throw m42478(c14069, str2, str, "directory");
                }
                if (!c0099M42553.f1037) {
                    boolean zContains = m42548(abstractC22044M42549).contains(str);
                    C15298 c15298 = (C15298) m42552(abstractC22044M42549).get(str);
                    if (c15298 != null) {
                        String str3 = c19622.f63237;
                        AbstractC22044 abstractC22044M49876 = m42543(abstractC22044M42549).m49876(C18326.m42779(str)).m49876("data.bin");
                        if ("axml".equals(c15298.f50010) || m42512(abstractC22044M49876, m42523(abstractC22044M49876))) {
                            throw m42478(c14069, str3, str, "axml_entry");
                        }
                    }
                    if (!zContains && ((c15298 != null || c0099M42553.f1038) && !c19622.f63238)) {
                        String str4 = c19622.f63237;
                        C10186 c10186M26298 = C10186.m26298(null, "FILE_ALREADY_EXISTS", "Workspace ZIP entry already exists.", "warning");
                        m42491(c10186M26298, c14069, str4, str);
                        throw c10186M26298;
                    }
                    C8303 c8303 = new C8303(Entry.DEFAULT_NAME, str, null, c15298 != null);
                    int i2 = m42584(abstractC22044M42549).f42979;
                    try {
                        try {
                            AbstractC22044 abstractC22044M42484 = m42484(abstractC22044M42549);
                            AbstractC22044 abstractC22044M49877 = abstractC22044M42484.m49876("overlay.next");
                            abstractC22044M49877.m49853();
                            i = i2;
                            try {
                                abstractC22044M49877.m49876("meta.json").m49849(JSON.object().add("targetType", "zip_entry").add("entryName", str).add("encoding", C2448.f7850).add("lineEnding", "lf").toString().getBytes(StandardCharsets.UTF_8));
                                jM42447 = m42447(abstractC22044M49877.m49876("data.bin"), interfaceC5626, c14069, c19622.f63237, str);
                                try {
                                    try {
                                        try {
                                            if (m42512(abstractC22044M49877.m49876("data.bin"), jM42447)) {
                                                throw m42478(c14069, c19622.f63237, str, "axml_entry");
                                            }
                                            interfaceC5626.mo16610(jM42447);
                                            m42501(abstractC22044M42549, c8303, abstractC22044M42484);
                                            AbstractC22044 abstractC22044M42579 = m42579(abstractC22044M42549, str);
                                            abstractC22044M42579.mo49834();
                                            if (abstractC22044M42579.mo2934() || !abstractC22044M49877.mo4301(abstractC22044M42579)) {
                                                throw new IOException("Unable to publish ZIP entry overlay");
                                            }
                                            AbstractC22044 abstractC22044M42529 = m42529(abstractC22044M42549, str);
                                            if (abstractC22044M42529.mo2934()) {
                                                abstractC22044M42529.mo4296();
                                            }
                                            ArrayList arrayListM42548 = m42548(abstractC22044M42549);
                                            arrayListM42548.remove(str);
                                            m42581(abstractC22044M42549, arrayListM42548);
                                            m42544(abstractC22044M42549, str);
                                            iM42444 = m42444(abstractC22044M42549, m42584(abstractC22044M42549));
                                            try {
                                                m42574(abstractC22044M42549, c8303);
                                            } catch (IOException e) {
                                                e = e;
                                                z2 = true;
                                                if (z2) {
                                                    C20653.m47272("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c19622.f63237, e);
                                                }
                                                if (!m42513(abstractC22044M42549, e)) {
                                                    throw m42521(c14069, c19622.f63237, str);
                                                }
                                                if (e instanceof C10186) {
                                                    c10186 = (C10186) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c10186.f32601)) {
                                                        throw c10186;
                                                    }
                                                }
                                                throw m42526(e);
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                z = true;
                                                if (!m42576(e)) {
                                                    throw e;
                                                }
                                                iOException = new IOException("Edit session storage backend failed", e);
                                                if (z) {
                                                    C20653.m47272("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c19622.f63237, e);
                                                }
                                                if (!m42513(abstractC22044M42549, iOException)) {
                                                    throw m42521(c14069, c19622.f63237, str);
                                                }
                                                throw m42526(e);
                                            } catch (C10186 e3) {
                                                e = e3;
                                                z2 = true;
                                                if (z2) {
                                                    C20653.m47272("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c19622.f63237, e);
                                                }
                                                if (!m42513(abstractC22044M42549, e)) {
                                                    throw m42521(c14069, c19622.f63237, str);
                                                }
                                                if (e instanceof C10186) {
                                                    c10186 = (C10186) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c10186.f32601)) {
                                                        throw c10186;
                                                    }
                                                }
                                                throw m42526(e);
                                            }
                                            m42522(abstractC22044M42549);
                                            return new C5977(c14069.f44556, c19622.f63237, str, jM42447, Integer.valueOf(iM42444));
                                        } catch (C24250 e4) {
                                            e = e4;
                                            if (!m42513(abstractC22044M42549, e)) {
                                                throw m42521(c14069, c19622.f63237, str);
                                            }
                                            throw e.f78541;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        z2 = false;
                                        iM42444 = i;
                                    } catch (RuntimeException e6) {
                                        e = e6;
                                        z = false;
                                        iM42444 = i;
                                        if (!m42576(e)) {
                                            throw e;
                                        }
                                        iOException = new IOException("Edit session storage backend failed", e);
                                        if (z && m42514(abstractC22044M42549, c8303, iOException)) {
                                            C20653.m47272("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c19622.f63237, e);
                                            m42522(abstractC22044M42549);
                                            return new C5977(c14069.f44556, c19622.f63237, str, jM42447, Integer.valueOf(iM42444));
                                        }
                                        if (!m42513(abstractC22044M42549, iOException)) {
                                            throw m42521(c14069, c19622.f63237, str);
                                        }
                                        throw m42526(e);
                                    } catch (C10186 e7) {
                                        e = e7;
                                        z2 = false;
                                        iM42444 = i;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                } catch (RuntimeException e9) {
                                    e = e9;
                                } catch (C10186 e10) {
                                    e = e10;
                                }
                                z2 = false;
                            } catch (IOException e11) {
                                e = e11;
                                z2 = false;
                                jM42447 = 0;
                            } catch (RuntimeException e12) {
                                e = e12;
                                z = false;
                                jM42447 = 0;
                                iM42444 = i;
                                if (!m42576(e)) {
                                    throw e;
                                }
                                iOException = new IOException("Edit session storage backend failed", e);
                                if (z) {
                                    C20653.m47272("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c19622.f63237, e);
                                    m42522(abstractC22044M42549);
                                    return new C5977(c14069.f44556, c19622.f63237, str, jM42447, Integer.valueOf(iM42444));
                                }
                                if (!m42513(abstractC22044M42549, iOException)) {
                                    throw m42521(c14069, c19622.f63237, str);
                                }
                                throw m42526(e);
                            } catch (C10186 e13) {
                                e = e13;
                                z2 = false;
                                jM42447 = 0;
                            }
                        } catch (C24250 e14) {
                            e = e14;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i = i2;
                        z2 = false;
                        jM42447 = 0;
                        iM42444 = i;
                        if (z2) {
                            C20653.m47272("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c19622.f63237, e);
                            m42522(abstractC22044M42549);
                            return new C5977(c14069.f44556, c19622.f63237, str, jM42447, Integer.valueOf(iM42444));
                        }
                        if (!m42513(abstractC22044M42549, e)) {
                            throw m42521(c14069, c19622.f63237, str);
                        }
                        if (e instanceof C10186) {
                            c10186 = (C10186) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c10186.f32601)) {
                                throw c10186;
                            }
                        }
                        throw m42526(e);
                    } catch (RuntimeException e16) {
                        e = e16;
                        i = i2;
                    } catch (C10186 e17) {
                        e = e17;
                        i = i2;
                        z2 = false;
                        jM42447 = 0;
                        iM42444 = i;
                        if (z2) {
                            C20653.m47272("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c19622.f63237, e);
                            m42522(abstractC22044M42549);
                            return new C5977(c14069.f44556, c19622.f63237, str, jM42447, Integer.valueOf(iM42444));
                        }
                        if (!m42513(abstractC22044M42549, e)) {
                            throw m42521(c14069, c19622.f63237, str);
                        }
                        if (e instanceof C10186) {
                            c10186 = (C10186) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c10186.f32601)) {
                                throw c10186;
                            }
                        }
                        throw m42526(e);
                    }
                    iM42444 = i;
                    if (z2 && m42514(abstractC22044M42549, c8303, e)) {
                        C20653.m47272("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c19622.f63237, e);
                        m42522(abstractC22044M42549);
                        return new C5977(c14069.f44556, c19622.f63237, str, jM42447, Integer.valueOf(iM42444));
                    }
                    if (!m42513(abstractC22044M42549, e)) {
                        throw m42521(c14069, c19622.f63237, str);
                    }
                    if (e instanceof C10186) {
                        c10186 = (C10186) e;
                        if (!"EDIT_SESSION_STORAGE_FAILED".equals(c10186.f32601)) {
                            throw c10186;
                        }
                    }
                    throw m42526(e);
                }
                throw m42478(c14069, str2, str, "axml_entry");
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static {
        ApplicationC23172.m52091(132);
        f59625 = new short[]{4928, 14828, 14823, 14766, 14821, 14816, 14837, 14816, 14766, 14820, 14821, 14824, 14837, 14814, 14834, 14820, 14834, 14834, 14824, 14830, 14831, 14834, 14788, 14789, 14792, 14805, 14814, 14802, 14788, 14802, 14802, 14792, 14798, 14799, 14814, 14786, 14803, 14788, 14784, 14805, 14788, 14814, 14791, 14784, 14792, 14797, 14788, 14789, 14804, 14831, 14816, 14819, 14829, 14820, 14753, 14837, 14830, 14753, 14816, 14829, 14829, 14830, 14818, 14816, 14837, 14820, 14753, 14820, 14821, 14824, 14837, 14753, 14834, 14820, 14834, 14834, 14824, 14830, 14831, 14753, 14824, 14821, 14796, 14805, 14753, 14796, 14786, 14801, 14753, 14820, 14821, 14824, 14837, 14753, 14834, 14820, 14834, 14834, 14824, 14830, 14831, 14753, 14835, 14830, 14829, 14829, 14819, 14816, 14818, 14826, 14753, 14821, 14820, 14829, 14820, 14837, 14820, 14753, 14823, 14816, 14824, 14829, 14820, 14821, 14765, 14753, 14820, 14821, 14824, 14837, 14802, 14820, 14834, 14834, 14824, 14830, 14831, 14792, 14821, 14780, 14796, 14805, 14753, 14796, 14786, 14801, 14753, 14820, 14821, 14824, 14837, 14753, 14834, 14820, 14834, 14834, 14824, 14830, 14831, 14753, 14835, 14830, 14829, 14829, 14819, 14816, 14818, 14826, 14753, 14821, 14820, 14829, 14820, 14837, 14820, 14753, 14823, 14816, 14824, 14829, 14820, 14821, 14765, 14753, 14820, 14821, 14824, 14837, 14802, 14820, 14834, 14834, 14824, 14830, 14831, 14792, 14821, 14780};
        f59626 = new RuntimeException();
    }

    public C18282(C12887 c12887, C15473 c15473, C22780 c22780) {
        this.f59627 = c12887;
        this.f59628 = c15473;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m42583(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42440(AbstractC22044 abstractC22044) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        abstractC22044.m49853();
        abstractC22044.m49876("overlay").m49876("dex").m49853();
        m42543(abstractC22044).m49853();
        abstractC22044.m49876("overlay").m49876("resource_value").m49853();
        abstractC22044.m49876("cache").m49876("dex").m49853();
        abstractC22044.m49876("cache").m49876(Entry.DEFAULT_NAME).m49853();
        abstractC22044.m49876("cache").m49876("dex_build").m49853();
        abstractC22044.m49876("deleted").m49853();
        abstractC22044.m49876("failures").m49853();
        m42533(abstractC22044, new ArrayList());
        m42581(abstractC22044, new ArrayList());
        m42545(abstractC22044, new ArrayList());
        m42555(abstractC22044, new ArrayList());
        m42575(abstractC22044.m49876("state.json"), JSON.object().add("revision", 0).add("createdAt", jCurrentTimeMillis).add("lastAccessedAt", jCurrentTimeMillis).toString().getBytes(StandardCharsets.UTF_8), ".state");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m42578(AbstractC22044 abstractC22044) {
        ArrayList arrayList = new ArrayList();
        if (abstractC22044.mo4281()) {
            for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
                if (abstractC22045.mo4281() && !abstractC22045.m49860() && m42541(abstractC22045.getName())) {
                    arrayList.add(new C4858(m42537(abstractC22045), abstractC22045, abstractC22045.getName()));
                }
            }
        }
        C12884.sort(arrayList, C8627.thenComparing(C2661.comparingLong(new C1591()), new C3082()));
        int size = arrayList.size() - 9;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C4858) arrayList.get(i)).f16953);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42493(C14069 c14069, ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC22044 abstractC22044 = (AbstractC22044) it.next();
            this.f59628.m37041(c14069.f44556, abstractC22044.getName());
            if (abstractC22044.mo2934()) {
                m42532(abstractC22044);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m42532(AbstractC22044 abstractC22044) throws IOException {
        if (abstractC22044.mo2934()) {
            if (abstractC22044.mo4281() && !abstractC22044.m49860()) {
                Iterator it = abstractC22044.mo4299(true).iterator();
                while (it.hasNext()) {
                    m42532((AbstractC22044) it.next());
                }
            }
            if (abstractC22044.mo2934() && !abstractC22044.mo4296()) {
                throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42458(C18304 c18304) {
        ArrayList arrayList = c18304.f59696;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C21288 c21288 = (C21288) arrayList.get(i);
            arrayList2.add(new C15649(c21288.f67883, i, c21288.f67886, c21288.f67885, c21288.f67884));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42569(ArrayList arrayList) throws C10186 {
        Iterator it = arrayList.iterator();
        C1151 c1151 = null;
        while (it.hasNext()) {
            C1151 c1152 = (C1151) it.next();
            if (c1151 != null && c1151.m4252() > c1152.f4255) {
                long j = c1151.f4255;
                throw C10186.m26302("PATCH_OVERLAP", "Patch ranges must not overlap.", "warning", JSON.array(), JSON.object().add("firstRange", JSON.object().add("byteOffset", j).add("endByteOffset", c1151.m4252())).add("secondRange", JSON.object().add("byteOffset", c1152.f4255).add("endByteOffset", c1152.m4252())));
            }
            c1151 = c1152;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42494(C14069 c14069, AbstractC22044 abstractC22044, C15298 c15298, String str) throws C10186 {
        if ("resources.arsc".equals(str)) {
            throw m42474(str, "resources_arsc");
        }
        if (c14069.f44549.contains(str) || str.toLowerCase(Locale.ROOT).endsWith(".dex")) {
            throw m42474(str, "dex_entry");
        }
        if (c15298 != null && "axml".equals(c15298.f50010)) {
            throw m42474(str, "axml_entry");
        }
        if (c15298 != null && !"zip_entry".equals(c15298.f50010)) {
            throw m42474(str, "not_raw_zip_entry");
        }
        if (c15298 != null && !m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("data.bin").mo4304()) {
            throw m42474(str, "not_raw_zip_entry");
        }
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22941.getEntry(str);
                if (entry == null) {
                    if (c15298 == null) {
                        throw m42562();
                    }
                } else {
                    if (entry.isDirectory()) {
                        throw m42474(str, "directory");
                    }
                    if (m42510(c14069, c22941, entry, str)) {
                        throw m42474(str, "axml_entry");
                    }
                }
                c22941.close();
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw m42473(new IOException("Failed to inspect ZIP entry for patch.", e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0231 m42462(AbstractC22044 abstractC22044, C9353 c9353, ArrayList arrayList) throws C10186 {
        String str = c9353.f30382;
        AbstractC22044 abstractC22044M49876 = m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("data.bin");
        long jMo4285 = abstractC22044M49876.mo4285();
        m42488(arrayList, jMo4285);
        ArrayList arrayList2 = new ArrayList();
        try {
            C13961 c13961M49855 = abstractC22044M49876.m49855("rw");
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C1151 c1151 = (C1151) it.next();
                    byte[] bArr = c1151.f4257;
                    int i = c1151.f4255;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    c13961M49855.seek(i);
                    c13961M49855.readFully(bArr2, 0, length);
                    if (!Arrays.equals(bArr2, c1151.f4257)) {
                        throw m42476(c9353, c1151, bArr2);
                    }
                    arrayList2.add(new C1875(i, bArr2, c1151.f4256));
                    throw e;
                }
                c13961M49855.close();
                try {
                    m42540(abstractC22044M49876, arrayList2);
                    AbstractC22044 abstractC22044M42529 = m42529(abstractC22044, str);
                    if (abstractC22044M42529.mo2934()) {
                        abstractC22044M42529.mo4296();
                    }
                    m42544(abstractC22044, str);
                    ArrayList arrayListM42548 = m42548(abstractC22044);
                    arrayListM42548.remove(str);
                    m42581(abstractC22044, arrayListM42548);
                    m42444(abstractC22044, m42584(abstractC22044));
                    return m42460(c9353, jMo4285, arrayList2, m42584(abstractC22044).f42979);
                } catch (Exception e) {
                    IOException iOException = new IOException("Failed to patch ZIP entry overlay.", e);
                    try {
                        m42573(abstractC22044M49876, arrayList2);
                    } catch (IOException e2) {
                        iOException.addSuppressed(e2);
                    }
                    throw m42473(iOException);
                }
            } catch (Throwable th) {
                try {
                    c13961M49855.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C10186 e3) {
            throw e3;
        } catch (Exception e4) {
            throw m42473(new IOException("Failed to read ZIP entry overlay for patch.", e4));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0231 m42461(C14069 c14069, AbstractC22044 abstractC22044, C9353 c9353, ArrayList arrayList) throws C10186 {
        C21266 c21266;
        String str = c9353.f30382;
        try {
            c21266 = m42528(c14069, abstractC22044, str);
        } catch (C10186 e) {
            String str2 = e.f32601;
            if (!"NOT_TEXT_ENTRY".equals(str2) && !"ENTRY_TEXT_TOO_LARGE".equals(str2)) {
                throw e;
            }
            c21266 = new C21266(C2448.f7850, "lf");
        }
        AbstractC22044 abstractC22044M49857 = abstractC22044.m49857(".patch_bytes");
        try {
            try {
                try {
                    C22941 c22941 = new C22941(c14069.m34234());
                    try {
                        C8002 entry = c22941.getEntry(str);
                        if (entry == null) {
                            throw m42562();
                        }
                        long size = entry.getSize();
                        if (size >= 0) {
                            m42488(arrayList, size);
                        }
                        abstractC22044M49857.mo49834();
                        InputStream inputStreamM51727 = c22941.m51727(entry);
                        try {
                            OutputStream outputStreamMo4289 = abstractC22044M49857.mo4289(false);
                            try {
                                C5604 c5604M42464 = m42464(inputStreamM51727, outputStreamMo4289, c9353, arrayList);
                                ArrayList arrayList2 = c5604M42464.f19433;
                                long j = c5604M42464.f19432;
                                if (outputStreamMo4289 != null) {
                                    outputStreamMo4289.close();
                                }
                                inputStreamM51727.close();
                                if (size < 0) {
                                    m42488(arrayList, j);
                                }
                                m42498(abstractC22044, str, abstractC22044M49857, c21266);
                                c22941.close();
                                m42572(abstractC22044M49857);
                                return m42460(c9353, j, arrayList2, m42584(abstractC22044).f42979);
                            } catch (Throwable th) {
                                if (outputStreamMo4289 != null) {
                                    try {
                                        outputStreamMo4289.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                inputStreamM51727.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            c22941.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    m42572(abstractC22044M49857);
                    throw th7;
                }
            } catch (Exception e2) {
                m42572(abstractC22044M49857);
                throw m42473(new IOException("Failed to patch ZIP entry.", e2));
            }
        } catch (C10186 e3) {
            m42572(abstractC22044M49857);
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42488(ArrayList arrayList, long j) throws C10186 {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1151 c1151 = (C1151) it.next();
            long jM4252 = c1151.m4252();
            long j2 = c1151.f4255;
            if (jM4252 < j2 || jM4252 > j) {
                throw m42472(j2, jM4252, j);
            }
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m42540(AbstractC22044 abstractC22044, ArrayList arrayList) {
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1875 c1875 = (C1875) it.next();
                c13961M49855.seek(c1875.f6305);
                c13961M49855.write(c1875.f6304);
            }
            c13961M49855.m34031();
            c13961M49855.close();
        } catch (Throwable th) {
            try {
                c13961M49855.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42573(AbstractC22044 abstractC22044, ArrayList arrayList) {
        C13961 c13961M49855 = abstractC22044.m49855("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1875 c1875 = (C1875) it.next();
                c13961M49855.seek(c1875.f6305);
                byte[] bArr = c1875.f6306;
                c13961M49855.write(bArr, 0, bArr.length);
            }
            c13961M49855.m34031();
            c13961M49855.close();
        } catch (Throwable th) {
            try {
                c13961M49855.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5604 m42464(InputStream inputStream, OutputStream outputStream, C9353 c9353, ArrayList arrayList) throws C10186, IOException {
        int i = 8192;
        byte[] bArr = new byte[8192];
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C1151 c1151 = (C1151) it.next();
            int i2 = c1151.f4255;
            byte[] bArr2 = c1151.f4256;
            byte[] bArr3 = c1151.f4257;
            long j2 = i2;
            long j3 = j;
            while (j3 < j2) {
                long j4 = i;
                int i3 = i2;
                int i4 = inputStream.read(bArr, 0, (int) Math.min(j4, j2 - j3));
                if (i4 < 0) {
                    throw m42472(i3, c1151.m4252(), j3);
                }
                outputStream.write(bArr, 0, i4);
                j3 += (long) i4;
                i2 = i3;
                i = 8192;
            }
            int i5 = i2;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = inputStream.read(bArr4, i6, length - i6);
                if (i7 < 0) {
                    throw m42472(i5, c1151.m4252(), j3 + ((long) i6));
                }
                i6 += i7;
            }
            long j5 = j3 + ((long) length);
            if (!Arrays.equals(bArr4, bArr3)) {
                throw m42476(c9353, c1151, bArr4);
            }
            outputStream.write(bArr2);
            arrayList2.add(new C1875(i5, bArr4, bArr2));
            i = 8192;
            j = j5;
        }
        while (true) {
            int i8 = inputStream.read(bArr);
            if (i8 < 0) {
                return new C5604(arrayList2, j);
            }
            outputStream.write(bArr, 0, i8);
            j += (long) i8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0231 m42460(C9353 c9353, long j, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            C1875 c1875 = (C1875) it.next();
            byte[] bArr = c1875.f6304;
            length += bArr.length;
            arrayList2.add(new C18130(c1875.f6305, c1875.f6306, bArr));
        }
        return new C0231(c9353.f30383, c9353.f30380, c9353.f30382, j, length, i, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42474(String str, String str2) {
        return C10186.m26302("PATCH_UNSUPPORTED_ENTRY", "ZIP entry cannot be patched as raw bytes.", "fatal", JSON.array(), C22121.m50076("entryName", str, "reason", str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42472(long j, long j2, long j3) {
        return C10186.m26302("PATCH_RANGE_OUT_OF_ENTRY", "Patch range is outside the ZIP entry.", "warning", JSON.array(), JSON.object().add("byteOffset", j).add("endByteOffset", j2).add("entrySize", j3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42476(C9353 c9353, C1151 c1151, byte[] bArr) {
        JSONArray jSONArrayArray = JSON.array();
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c9353.f30383).add("editSessionId", c9353.f30380).add("locator", C4375.m13906("zip_entry", c9353.f30382, (String) null, (String) null, (String) null, (String) null));
        int i = c1151.f4255;
        return C10186.m26302("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", jSONArrayArray.add(C2729.m9064(jSONObjectAdd.add("byteOffset", i).add("maxBytes", bArr.length), "mt_apk_read_bytes", "retry", "Read actual bytes at the mismatched patch window before retrying mt_apk_patch_bytes.")), JSON.object().add("byteOffset", i).add("expectedHex", m42455(c1151.f4257)).add("actualHex", m42455(bArr)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42455(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42519(C14069 c14069, AbstractC22044 abstractC22044, ArrayList arrayList) throws C10186 {
        if (!c14069.f44540) {
            throw C10186.m26305("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
        }
        C2751 c2751 = c14069.f44537;
        if (c2751 == null) {
            String str = c14069.f44545;
            if (str == null) {
                str = "Failed to parse resources.arsc";
            }
            throw C10186.m26305("RESOURCE_TABLE_PARSE_FAILED", str);
        }
        byte[] bArrM4573 = C1260.m4573(arrayList, c2751.m9099());
        try {
            byte[] bArrM40017 = C16965.m40017(abstractC22044, bArrM4573);
            if (bArrM40017 != null) {
                return bArrM40017;
            }
            C23001 c23001M13665 = C4287.m13665(c2751.m9101(), C1260.m4565(arrayList));
            c23001M13665.m51897();
            C6178 c6178 = new C6178((int) Math.min(2147483647L, c2751.m9100() + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
            c23001M13665.m51893(c6178, (C3374) null);
            byte[] bArrM17796 = c6178.m17796();
            try {
                C16965.m40016(abstractC22044, bArrM4573, bArrM17796);
            } catch (IOException unused) {
            }
            return bArrM17796;
        } catch (Exception e) {
            throw C10186.m26305("RESOURCE_COMPILE_FAILED", e.getMessage() == null ? "Failed to materialize resources.arsc" : e.getMessage());
        } catch (OutOfMemoryError unused2) {
            throw C18723.m43530();
        } catch (C10186 e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42575(AbstractC22044 abstractC22044, byte[] bArr, String str) {
        abstractC22044.mo49834();
        AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(str);
        try {
            abstractC22044M49862.m49849(bArr);
            abstractC22044M49862.m49848(abstractC22044, false, true, null);
        } finally {
            m42572(abstractC22044M49862);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42518(C8303 c8303, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("phase", str).add("targetKind", c8303.f27269).add("target", c8303.f27270);
        String str2 = c8303.f27272;
        return jSONObjectAdd.add("dexEntryName", str2 == null ? JSON.NULL : JSON.value(str2)).add("overlayExisted", c8303.f27273).add("deletedExisted", c8303.f27267).add("failuresExisted", c8303.f27268).add("stateExisted", c8303.f27271).toString().getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42507(AbstractC22044 abstractC22044, byte[] bArr, String str) {
        abstractC22044.mo49834();
        AbstractC22044 abstractC22044M49862 = abstractC22044.m49862(str);
        try {
            abstractC22044M49862.mo4298().mo8791();
            abstractC22044M49862.m49849(bArr);
            abstractC22044M49862.mo4298().mo8789(abstractC22044);
        } finally {
            m42572(abstractC22044M49862);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42505(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, AbstractC22044 abstractC22046) throws IOException {
        for (C1907 c1907 : abstractC22044.mo4298().mo8792()) {
            String name = c1907.m6565().getName();
            if (!"transaction.json".equals(name) && !"committed".equals(name)) {
                m42532(c1907.m6565());
            }
        }
        m42532(abstractC22045);
        m42532(abstractC22046);
        if (abstractC22044.mo2934() && !abstractC22044.mo4296()) {
            throw new IOException("Unable to delete committed transaction directory");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C8303 m42554(AbstractC22044 abstractC22044, String str) throws IOException {
        JSONObject jSONObjectAsObject = JSON.parse(m42441(abstractC22044)).asObject();
        if (jSONObjectAsObject.getInt("schemaVersion", -1) != 1) {
            throw new IOException("Unsupported delete transaction schema");
        }
        String string = jSONObjectAsObject.getString("phase", null);
        String string2 = jSONObjectAsObject.getString("targetKind", null);
        String string3 = jSONObjectAsObject.getString("target", null);
        String string4 = jSONObjectAsObject.getString("dexEntryName", null);
        if (!str.equals(string) || ((!"dex".equals(string2) && !Entry.DEFAULT_NAME.equals(string2)) || string3 == null || string3.isEmpty() || ("dex".equals(string2) && (string4 == null || string4.isEmpty())))) {
            throw new IOException("Invalid delete transaction journal");
        }
        C8303 c8303 = new C8303(string2, string3, string4, m42508(jSONObjectAsObject, "overlayExisted"));
        c8303.f27267 = m42508(jSONObjectAsObject, "deletedExisted");
        c8303.f27268 = m42508(jSONObjectAsObject, "failuresExisted");
        c8303.f27271 = m42508(jSONObjectAsObject, "stateExisted");
        return c8303;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42508(JSONObject jSONObject, String str) throws IOException {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw new IOException("Invalid delete transaction boolean field: ".concat(str));
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m42582(AbstractC22044 abstractC22044, C8303 c8303) throws IOException {
        AbstractC22044 abstractC22044M42530 = m42530(abstractC22044, c8303);
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(".delete_transaction").m49876("overlay.backup");
        if (c8303.f27273) {
            if (!abstractC22044M49876.mo2934()) {
                if (!abstractC22044M42530.mo2934()) {
                    throw new IOException("Delete transaction overlay backup is missing");
                }
                return;
            }
            if (abstractC22044M42530.mo2934()) {
                m42532(abstractC22044M42530);
            }
            abstractC22044M42530.mo49834();
            if (!abstractC22044M49876.mo4301(abstractC22044M42530)) {
                throw new IOException("Unable to restore delete transaction overlay");
            }
            return;
        }
        if (abstractC22044M42530.mo2934()) {
            m42532(abstractC22044M42530);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42506(AbstractC22044 abstractC22044, AbstractC22044 abstractC22045, boolean z) throws IOException {
        if (z) {
            if (!abstractC22045.mo4304()) {
                throw new IOException("Delete transaction backup is missing");
            }
            m42575(abstractC22044, abstractC22045.m49865(), ".delete_restore");
        } else if (abstractC22044.mo2934() && !abstractC22044.mo4296()) {
            throw new IOException("Unable to remove delete transaction file");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42484(AbstractC22044 abstractC22044) throws C10186, IOException {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(".delete_transaction");
        if (abstractC22044M49876.mo2934()) {
            m42557(abstractC22044);
            if (abstractC22044M49876.mo2934()) {
                throw new IOException("Previous delete transaction cleanup is incomplete");
            }
        }
        abstractC22044M49876.m49853();
        return abstractC22044M49876;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42514(AbstractC22044 abstractC22044, C8303 c8303, Exception exc) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(".delete_transaction").m49876("committed");
        if (!abstractC22044M49876.mo2934()) {
            return false;
        }
        try {
            C8303 c8303M42554 = m42554(abstractC22044M49876, "committed");
            String str = c8303M42554.f27272;
            if (c8303.f27269.equals(c8303M42554.f27269) && c8303.f27270.equals(c8303M42554.f27270)) {
                String str2 = c8303.f27272;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
            exc.addSuppressed(new IOException("Committed delete marker target mismatch"));
            return true;
        } catch (Exception e) {
            exc.addSuppressed(e);
            return true;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m42557(AbstractC22044 abstractC22044) throws C10186 {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(".delete_transaction");
        if (abstractC22044M49876.mo2934()) {
            AbstractC22044 abstractC22044M49877 = abstractC22044.m49876(".delete_transaction").m49876("transaction.json");
            AbstractC22044 abstractC22044M49878 = abstractC22044.m49876(".delete_transaction").m49876("committed");
            if (!abstractC22044M49878.mo2934()) {
                if (!abstractC22044M49877.mo4304()) {
                    try {
                        m42532(abstractC22044M49876);
                        return;
                    } catch (IOException e) {
                        C20653.m47272("MT MCP stale delete transaction directory cleanup failed, editSessionId=" + abstractC22044.getName(), e);
                        return;
                    }
                }
                try {
                    C8303 c8303M42554 = m42554(abstractC22044M49877, "prepared");
                    String str = c8303M42554.f27269;
                    m42582(abstractC22044, c8303M42554);
                    m42506(abstractC22044.m49876("deleted").m49876("dex".equals(str) ? "dex.json" : "entry.json"), abstractC22044M49876.m49876("deleted.backup"), c8303M42554.f27267);
                    m42506(abstractC22044.m49876("failures").m49876("dex".equals(str) ? "dex.json" : "entry.json"), abstractC22044M49876.m49876("failures.backup"), c8303M42554.f27268);
                    m42506(abstractC22044.m49876("state.json"), abstractC22044M49876.m49876("state.backup"), c8303M42554.f27271);
                    m42500(abstractC22044, c8303M42554);
                    m42532(abstractC22044M49877);
                    m42532(abstractC22044M49876);
                    return;
                } catch (C10186 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m42473(e3);
                }
            }
            C8303 c8303M42555 = null;
            try {
                try {
                    if (abstractC22044M49878.mo4304()) {
                        c8303M42555 = m42554(abstractC22044M49878, "committed");
                    }
                } catch (Exception e4) {
                    C20653.m47272("MT MCP committed delete marker is unreadable, editSessionId=" + abstractC22044.getName(), e4);
                }
                if (c8303M42555 == null && abstractC22044M49877.mo4304()) {
                    try {
                        c8303M42555 = m42554(abstractC22044M49877, "prepared");
                    } catch (Exception e5) {
                        C20653.m47272("MT MCP prepared delete journal is unreadable after commit, editSessionId=" + abstractC22044.getName(), e5);
                    }
                }
                if (c8303M42555 == null) {
                    m42532(abstractC22044.m49876("cache"));
                } else {
                    m42500(abstractC22044, c8303M42555);
                }
                m42505(abstractC22044M49876, abstractC22044M49877, abstractC22044M49878);
            } catch (Exception e6) {
                C20653.m47272("MT MCP committed delete transaction cleanup failed, editSessionId=" + abstractC22044.getName(), e6);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42574(AbstractC22044 abstractC22044, C8303 c8303) {
        m42507(abstractC22044.m49876(".delete_transaction").m49876("committed"), m42518(c8303, "committed"), ".delete_commit");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42530(AbstractC22044 abstractC22044, C8303 c8303) {
        String str = c8303.f27269;
        String str2 = c8303.f27270;
        if ("dex".equals(str)) {
            String str3 = c8303.f27272;
            C3192.m10507(str2);
            return abstractC22044.m49876("overlay").m49876("dex").m49876(str3).m49876(C18326.m42779(str2).concat(".smali"));
        }
        return m42543(abstractC22044).m49876(C18326.m42779(str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42500(AbstractC22044 abstractC22044, C8303 c8303) throws IOException {
        String str = c8303.f27269;
        String str2 = c8303.f27270;
        if ("dex".equals(str)) {
            String str3 = c8303.f27272;
            C3192.m10507(str2);
            m42532(abstractC22044.m49876("cache").m49876("dex").m49876(str3).m49876(C18326.m42779(str2).concat(".bin")));
            return;
        }
        m42532(m42529(abstractC22044, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42513(AbstractC22044 abstractC22044, Exception exc) {
        try {
            m42557(abstractC22044);
            return true;
        } catch (C10186 e) {
            exc.addSuppressed(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m42522(AbstractC22044 abstractC22044) {
        try {
            m42557(abstractC22044);
        } catch (IOException e) {
            e = e;
            C20653.m47272("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC22044.getName(), e);
        } catch (RuntimeException e2) {
            if (!m42576(e2)) {
                throw e2;
            }
            C20653.m47272("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC22044.getName(), e2);
        } catch (C10186 e3) {
            e = e3;
            C20653.m47272("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC22044.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42490(C10186 c10186, String str, C18304 c18304, C19159 c19159) {
        JSONValue jSONValueValue;
        String str2 = c18304.f59694;
        ArrayList arrayList = c18304.f59696;
        JSONObject jSONObject = c10186.f32602;
        JSONArray jSONArray = c10186.f32599;
        int i = jSONObject.getInt("failedEditIndex", -1);
        boolean z = jSONObject.getBoolean("_suppressResourceRetry", false);
        jSONObject.remove("_suppressResourceRetry");
        C21288 c21288 = (i < 0 || i >= arrayList.size()) ? null : (C21288) arrayList.get(i);
        String string = jSONObject.getString("resourceId", c21288 == null ? null : c21288.f67883);
        String string2 = jSONObject.getString("variant", c21288 != null ? c21288.f67886 : null);
        JSONObject jSONObjectPut = jSONObject.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i >= 0 ? JSON.value(i) : JSON.NULL);
        if (string == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, string));
        }
        jSONObjectPut.put("locator", jSONValueValue).put("variant", string2 == null ? JSON.NULL : JSON.value(string2));
        if (jSONObject.get("resourceNamePolicy") == null || jSONObject.get("resourceNamePolicy").isNull()) {
            jSONObject.put("resourceNamePolicy", c19159 == null ? JSON.NULL : c19159.m44398());
        }
        if (z || jSONArray.size() != 0) {
            return;
        }
        String str3 = c10186.f32601;
        if ((!"STALE_TARGET_VERSION".equals(str3) && !"INVALID_VALUE_XML".equals(str3) && !"UNSUPPORTED_VALUE_XML".equals(str3) && !"UNSUPPORTED_STYLED_TEXT_XML".equals(str3) && !"APP_NAME_REFERENCES_NOT_ACCEPTED".equals(str3) && !"RESOURCE_VARIANT_NOT_FOUND".equals(str3)) || string == null || string2 == null) {
            return;
        }
        jSONArray.add(C2729.m9064(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("reads", JSON.array().add(JSON.object().add("locator", C4375.m13906("resource", (String) null, (String) null, (String) null, (String) null, string)).add("variant", string2))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 2000).add("resolveDepth", 0), "mt_apk_resource_read", "retry", "Re-read the resource value for the latest valueXml/targetVersion or available variants"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6198 m42468(C14069 c14069, AbstractC22044 abstractC22044, C7863 c7863, C4156 c4156) throws C10186 {
        String strM42453;
        ArrayList arrayList = c7863.f26194;
        String str = c7863.f26190;
        String str2 = c7863.f26195;
        if (!"smali_class".equals(str2)) {
            throw C10186.m26301("Invalid targetType", "targetType", JSON.value(str2), JSON.array("smali_class"), JSON.object().add("targetType", "smali_class"));
        }
        String strM42520 = m42520(c7863.f26191);
        m42571(c14069, c7863, str, c7863.f26195, strM42520, (m42561(abstractC22044, strM42520) == null && !(((C13061) m42459(abstractC22044, c4156).get(strM42520)) == null && m42534(c14069, strM42520) == 0)) ? m42535(C1173.m4319(m42587(c14069, abstractC22044.getName(), strM42520, c4156))) : "missing");
        C0405 c0405 = (C0405) arrayList.get(0);
        String str3 = c0405.f1950;
        if ("write_target".equals(str3)) {
            strM42453 = C1173.m4319(c0405.f1949);
        } else {
            if (!m42556(str3)) {
                throw C10186.m26301("Invalid mode", "edits[0].mode", JSON.value(str3), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m42561(abstractC22044, strM42520) != null) {
                throw C18723.m43532(c14069.f44556, abstractC22044.getName());
            }
            strM42453 = m42453(c14069, c7863, abstractC22044.getName(), c7863.f26195, strM42520, C1173.m4319(m42587(c14069, abstractC22044.getName(), strM42520, c4156)));
        }
        String str4 = strM42453;
        String strM42535 = m42535(str4);
        String str5 = c7863.f26195;
        arrayList.size();
        return m42466(c14069, abstractC22044, strM42520, str4, str, str5, strM42520, strM42535);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C6198 m42560(C14069 c14069, AbstractC22044 abstractC22044, C7863 c7863, C4156 c4156) throws C10186 {
        String strM42453;
        String str = c14069.f44556;
        String str2 = c7863.f26191;
        ArrayList arrayList = c7863.f26194;
        String str3 = c7863.f26190;
        String strM13950 = C4375.m13950(str2);
        String strM13981 = C4375.m13981(str2);
        if (m42561(abstractC22044, strM13950) != null) {
            throw C18723.m43532(str, str3);
        }
        String strM4319 = C1173.m4319(m42587(c14069, str3, strM13950, c4156));
        C4574 c4574M50677 = C22474.m50676(strM13950, strM4319).m50677(strM13981);
        if (c4574M50677 == null) {
            throw C18723.m43540(str, str3, strM13950);
        }
        int i = c4574M50677.f16278;
        String strM4318 = C1173.m4318(i, c4574M50677.f16279, strM4319);
        m42571(c14069, c7863, str3, c7863.f26195, c7863.f26191, m42535(strM4318));
        C0405 c0405 = (C0405) arrayList.get(0);
        if ("write_target".equals(c0405.f1950)) {
            String strM43110 = C1173.m4319(c0405.f1949);
            if (strM43110.endsWith("\n")) {
                strM43110 = C1402.m5124(1, 0, strM43110);
            }
            if (strM43110.isEmpty() || strM43110.endsWith("\n")) {
                throw m42481(c14069, c7863, "Smali text must contain one complete .method block.");
            }
            String[] strArrSplit = strM43110.split("\n", -1);
            String strTrim = C22474.m50675(strArrSplit[0]).trim();
            String strTrim2 = C22474.m50675(strArrSplit[strArrSplit.length - 1]).trim();
            if (!m42546(strTrim) || !".end method".equals(strTrim2)) {
                throw m42481(c14069, c7863, "Smali text must contain one complete .method block.");
            }
            int length = strArrSplit.length;
            String str4 = strM43110;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                String[] strArr = strArrSplit;
                String strTrim3 = C22474.m50675(strArrSplit[i2]).trim();
                if (m42546(strTrim3)) {
                    i3++;
                } else if (".end method".equals(strTrim3)) {
                    i4++;
                }
                i2++;
                strArrSplit = strArr;
            }
            if (i3 != 1 || i4 != 1) {
                throw m42481(c14069, c7863, "Smali text must contain one complete .method block.");
            }
            String str5 = C4574.m14371(1, strTrim).f16280;
            if (str5.indexOf(40) < 0 || !strM13981.equals(str5)) {
                throw m42481(c14069, c7863, "Smali .method signature does not match locator target.");
            }
            strM42453 = str4;
        } else {
            strM42453 = m42453(c14069, c7863, str3, c7863.f26195, c7863.f26191, strM4318);
        }
        String strM42452 = m42452(strM4319, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c4574M50677.f16279), strM42453);
        String strM42535 = strM42453.isEmpty() ? "missing" : m42535(strM42453);
        String str6 = c7863.f26195;
        String str7 = c7863.f26191;
        arrayList.size();
        return m42466(c14069, abstractC22044, strM13950, strM42452, str3, str6, str7, strM42535);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6198 m42467(C14069 c14069, AbstractC22044 abstractC22044, C7863 c7863) throws C10186 {
        String strM42535;
        String strM42453;
        String strReplace;
        String str;
        C4156 c4156;
        String str2;
        C22012 c22012;
        String str3 = c14069.f44556;
        String str4 = c7863.f26191;
        String str5 = c7863.f26190;
        ArrayList arrayList = c7863.f26194;
        String str6 = c7863.f26195;
        if (str4 == null || str4.isEmpty() || str4.indexOf(0) >= 0 || str4.endsWith("/")) {
            throw C10186.m26301("Invalid target", "target", str4 != null ? JSON.value(str4) : null, JSON.array(), JSON.object().add("target", "res/layout/activity_main.xml"));
        }
        if ("resources.arsc".equals(str4)) {
            throw C10186.m26300("RESOURCE_TABLE_TEXT_EDIT_UNSUPPORTED", "resources.arsc must be edited with mt_apk_resource_edit.");
        }
        C19774 c19774M42566 = m42566(c14069, abstractC22044, str4);
        boolean z = c19774M42566.f63622;
        String str7 = c19774M42566.f63623;
        if (!((z || "missing".equals(str7)) ? true : str6.equals(str7))) {
            if (!"zip_entry".equals(str6)) {
                throw C10186.m26300("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if ("axml".equals(str7)) {
                throw C18723.m43541(str3, str5, str4);
            }
            if ("too_large".equals(str7)) {
                throw C10186.m26300("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
            }
            throw C18723.m43538(str3, str5, str4);
        }
        if (z || "missing".equals(str7)) {
            strM42535 = "missing";
        } else {
            strM42535 = m42535(C1173.m4319(("axml".equals(str6) ? m42595(c14069, abstractC22044.getName(), str4) : m42611(c14069, abstractC22044.getName(), str4)).f24201));
        }
        m42571(c14069, c7863, str5, c7863.f26195, str4, strM42535);
        String str8 = c7863.f26195;
        C0405 c0405 = (C0405) arrayList.get(0);
        String str9 = c0405.f1950;
        if ("write_target".equals(str9)) {
            strM42453 = C1173.m4319(c0405.f1949);
        } else {
            if (!m42556(str9)) {
                throw C10186.m26301("Invalid mode", "edits[0].mode", JSON.value(str9), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m42548(abstractC22044).contains(str4)) {
                throw m42562();
            }
            strM42453 = m42453(c14069, c7863, abstractC22044.getName(), str8, str4, C1173.m4319("axml".equals(str8) ? m42595(c14069, abstractC22044.getName(), str4).f24201 : m42611(c14069, abstractC22044.getName(), str4).f24201));
        }
        String str10 = strM42453;
        String strM42536 = m42535(str10);
        if ("axml".equals(str6)) {
            Charset charset = StandardCharsets.UTF_8;
            if (str10.getBytes(charset).length > 2097152) {
                throw C10186.m26300("AXML_SOURCE_TOO_LARGE", "AXML source is too large to edit.");
            }
            String strM42779 = C18326.m42779(str10);
            C7557 c7557M42525 = m42525(abstractC22044, str4, strM42779);
            if (c7557M42525 != null) {
                c22012 = new C22012(strM42779, c7557M42525.f24924);
            } else {
                C0845 c0845M42463 = m42463(c14069, str5, str4, str10, strM42779);
                C17384 c17384 = c0845M42463.f3167;
                if (c17384 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c17384);
                    throw m42480(c14069, str5, false, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed; edit_text candidate was not saved.", m42448(arrayList2), (String) null, (String) null);
                }
                c22012 = c0845M42463.f3166;
            }
            C22012 c22013 = c22012;
            m42502(abstractC22044, new C8303(Entry.DEFAULT_NAME, str4, null, m42543(abstractC22044).m49876(C18326.m42779(str4)).mo2934()), str10.getBytes(charset), c7863.f26195, new C21266(C2448.f7850, "lf"));
            try {
                m42497(abstractC22044, str4, c22013);
            } catch (Exception e) {
                C20653.m47272("MT MCP AXML edit cache publish failed, editSessionId=".concat(str5), e);
            }
            str = c7863.f26195;
            arrayList.size();
            c4156 = null;
            str2 = strM42536;
        } else {
            C21266 c21266M42528 = m42528(c14069, abstractC22044, str4);
            int i = c21266M42528.f67827;
            try {
                C9982 c9982 = new C9982();
                m42489(c9982, i);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c9982, C2448.m8272(i));
                try {
                    String str11 = c21266M42528.f67828;
                    if ("lf".equals(str11)) {
                        strReplace = str10;
                    } else {
                        strReplace = str10.replace("\n", "crlf".equals(str11) ? "\r\n" : "\r");
                    }
                    outputStreamWriter.write(strReplace);
                    outputStreamWriter.close();
                    byte[] bArrCopyOf = c9982.f32079;
                    int length = bArrCopyOf.length;
                    int i2 = c9982.f32081;
                    if (length != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                    }
                    byte[] bArr = bArrCopyOf;
                    if (bArr.length > 10485760) {
                        throw C10186.m26300("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    String strM42537 = m42535(m42469(c14069, str5, str4, bArr, false).f24201);
                    m42502(abstractC22044, new C8303(Entry.DEFAULT_NAME, str4, null, m42543(abstractC22044).m49876(C18326.m42779(str4)).mo2934()), bArr, c7863.f26195, c21266M42528);
                    str = c7863.f26195;
                    arrayList.size();
                    c4156 = null;
                    str2 = strM42537;
                } catch (Throwable th) {
                    try {
                        outputStreamWriter.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                throw m42473(e2);
            }
        }
        return m42465(c14069, str5, str, str4, str2, c4156);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final synchronized C6198 m42607(C14069 c14069, String str) {
        m42549(c14069, str);
        return m42551(c14069, str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m42531(C14069 c14069, String str, C4156 c4156) throws C10186 {
        if (m42583(str)) {
            return;
        }
        m42442(c14069, m42549(c14069, str), c4156);
        C6198 c6198M42465 = m42465(c14069, str, (String) null, (String) null, (String) null, c4156);
        if (c6198M42465.f21105 > 0) {
            throw m42479(c14069, str, c6198M42465);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m42588(C14069 c14069, String str, C4156 c4156) {
        if (m42583(str)) {
            return c14069.f44553;
        }
        m42531(c14069, str, c4156);
        return m42456(c14069, m42482(c14069, str, m42549(c14069, str), c4156));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42511(C17536 c17536, C23330 c23330, C0560 c0560, char[] cArr) throws C10186 {
        AbstractC22044 abstractC22044M41193 = c17536.m41193(c23330.f75565);
        if (abstractC22044M41193 == null) {
            return false;
        }
        c0560.m2567();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC22044M41193.mo4290(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i != -1) {
                        c0560.write(cArr, 0, i);
                    } else {
                        inputStreamReader.close();
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw m42473(e);
            }
        } catch (IOException e) {
            throw m42473(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42456(C14069 c14069, C16790 c16790) throws C10186 {
        HashSet hashSet = new HashSet(c14069.f44549);
        HashMap map = new HashMap();
        HashMap map2 = c16790.f54174;
        HashSet hashSet2 = c16790.f54173;
        int i = 0;
        int i2 = 0;
        for (C13061 c13061 : map2.values()) {
            String str = c13061.f41796;
            String str2 = c13061.f41795;
            if (!hashSet.contains(str)) {
                throw m42471();
            }
            if (!hashSet2.contains(str2) && !c14069.f44552.containsKey(str2)) {
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str, arrayList);
                }
                arrayList.add(c13061);
                i2++;
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C12884.sort((ArrayList) it.next(), C2661.comparing(new C3828()));
        }
        ArrayList arrayList2 = new ArrayList(c14069.f44553.size() + i2);
        for (String str3 : c14069.f44549) {
            while (i < c14069.f44553.size() && str3.equals(((C23330) c14069.f44553.get(i)).f75564)) {
                int i3 = i + 1;
                C23330 c23330 = (C23330) c14069.f44553.get(i);
                if (!hashSet2.contains(c23330.f75565)) {
                    C13061 c13062 = (C13061) c16790.f54177.get(c23330.f75565);
                    if (c13062 != null) {
                        arrayList2.add(new C23330(c13062.f41796, -1, -1, c13062.f41795));
                    } else {
                        arrayList2.add(c23330);
                    }
                }
                i = i3;
            }
            ArrayList<C13061> arrayList3 = (ArrayList) map.get(str3);
            if (arrayList3 != null) {
                for (C13061 c13063 : arrayList3) {
                    arrayList2.add(new C23330(c13063.f41796, -1, -1, c13063.f41795));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C22737 m42599(C14069 c14069, String str, C23330 c23330) {
        return m42600(c14069, str, c23330, (C4156) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C22737 m42600(C14069 c14069, String str, C23330 c23330, C4156 c4156) {
        if (m42583(str)) {
            return C12887.m31924(c14069, c23330);
        }
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        C16790 c16790M42482 = m42482(c14069, str, abstractC22044M42549, c4156);
        C13061 c13061 = (C13061) c16790M42482.f54177.get(c23330.f75565);
        if (c13061 != null) {
            String strM42441 = m42441(m42567(abstractC22044M42549, c13061));
            String strM42779 = C18326.m42779(strM42441);
            C18744 c18744M42565 = m42565(abstractC22044M42549, c13061, strM42779);
            if (c18744M42565 != null) {
                return c18744M42565.f60901;
            }
            m42443(c14069, abstractC22044M42549, c13061, strM42441);
            C18744 c18744M42566 = m42565(abstractC22044M42549, c13061, strM42779);
            if (c18744M42566 == null) {
                throw m42479(c14069, str, m42551(c14069, str));
            }
            return c18744M42566.f60901;
        }
        if (c16790M42482.f54173.contains(c23330.f75565)) {
            throw C18723.m43532(c14069.f44556, str);
        }
        return C12887.m31924(c14069, c23330);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C6198 m42551(C14069 c14069, String str) {
        return m42465(c14069, str, (String) null, (String) null, (String) null, (C4156) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6198 m42465(C14069 c14069, String str, String str2, String str3, String str4, C4156 c4156) throws C10186 {
        AbstractC22044 abstractC22044M42549 = m42549(c14069, str);
        HashMap mapM42459 = m42459(abstractC22044M42549, c4156);
        ArrayList arrayList = new ArrayList();
        for (C17384 c17384 : m42547(abstractC22044M42549)) {
            C13061 c13061 = (C13061) mapM42459.get(c17384.f56532);
            if (c13061 != null && c13061.f41796.equals(c17384.f56534)) {
                if (c17384.f56531.equals(C18326.m42779(m42441(m42567(abstractC22044M42549, c13061))))) {
                    arrayList.add(c17384);
                }
            }
        }
        HashMap mapM42552 = m42552(abstractC22044M42549);
        for (C17384 c17385 : m42550(abstractC22044M42549)) {
            C15298 c15298 = (C15298) mapM42552.get(c17385.f56535);
            if (c15298 != null && "axml".equals(c15298.f50010)) {
                String strM42441 = m42441(m42543(abstractC22044M42549).m49876(C18326.m42779(c15298.f50009)).m49876("text.xml"));
                String str5 = c17385.f56531;
                if (str5 != null && str5.equals(C18326.m42779(strM42441))) {
                    arrayList.add(c17385);
                }
            }
        }
        int i = 0;
        for (C13061 c13062 : m42459(abstractC22044M42549, c4156).values()) {
            String strM42779 = C18326.m42779(m42441(m42567(abstractC22044M42549, c13062)));
            if (m42565(abstractC22044M42549, c13062, strM42779) == null && !m42515(abstractC22044M42549, c13062, strM42779)) {
                i++;
            }
        }
        int i2 = i;
        for (C15298 c15299 : m42552(abstractC22044M42549).values()) {
            String str6 = c15299.f50010;
            String str7 = c15299.f50009;
            if ("axml".equals(str6)) {
                String strM427710 = C18326.m42779(m42441(m42543(abstractC22044M42549).m49876(C18326.m42779(str7)).m49876("text.xml")));
                if (m42525(abstractC22044M42549, str7, strM427710) == null && !m42577(abstractC22044M42549, str7, strM427710)) {
                    i2++;
                }
            }
        }
        return new C6198(c14069.f44556, str, str2, str3, str4, i2, arrayList.size(), arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m42442(C14069 c14069, AbstractC22044 abstractC22044, C4156 c4156) throws C10186 {
        int i;
        int iM42443 = 0;
        for (C13061 c13061 : m42459(abstractC22044, c4156).values()) {
            String strM42441 = m42441(m42567(abstractC22044, c13061));
            String strM42779 = C18326.m42779(strM42441);
            if (m42565(abstractC22044, c13061, strM42779) == null && !m42515(abstractC22044, c13061, strM42779)) {
                iM42443 += m42443(c14069, abstractC22044, c13061, strM42441);
            }
        }
        for (C15298 c15298 : m42552(abstractC22044).values()) {
            String str = c15298.f50010;
            final String str2 = c15298.f50009;
            if ("axml".equals(str)) {
                String strM42442 = m42441(m42543(abstractC22044).m49876(C18326.m42779(str2)).m49876("text.xml"));
                String strM427710 = C18326.m42779(strM42442);
                if (m42525(abstractC22044, str2, strM427710) == null && !m42577(abstractC22044, str2, strM427710)) {
                    final String strM427711 = C18326.m42779(strM42442);
                    if (m42525(abstractC22044, str2, strM427711) != null || m42577(abstractC22044, str2, strM427711)) {
                        i = 0;
                    } else {
                        C0845 c0845M42463 = m42463(c14069, abstractC22044.getName(), str2, strM42442, strM427711);
                        final C17384 c17384 = c0845M42463.f3167;
                        if (c17384 == null) {
                            try {
                                m42497(abstractC22044, str2, c0845M42463.f3166);
                                try {
                                    ArrayList arrayListM42550 = m42550(abstractC22044);
                                    C1170.removeIf(arrayListM42550, new Predicate() { // from class: l.ܰ֫ۚ
                                        @Override // java.util.function.Predicate
                                        public /* synthetic */ Predicate and(Predicate predicate) {
                                            return C19025.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* JADX INFO: renamed from: negate */
                                        public /* synthetic */ Predicate mo7134negate() {
                                            return C19025.$default$negate(this);
                                        }

                                        public /* synthetic */ Predicate or(Predicate predicate) {
                                            return C19025.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            C17384 c17385 = (C17384) obj;
                                            if (str2.equals(c17385.f56535)) {
                                                return strM427711.equals(c17385.f56531);
                                            }
                                            return false;
                                        }
                                    });
                                    m42555(abstractC22044, arrayListM42550);
                                    i = 1;
                                } catch (IOException e) {
                                    throw m42473(e);
                                }
                            } catch (IOException e2) {
                                throw m42473(e2);
                            }
                        } else {
                            try {
                                ArrayList arrayListM42551 = m42550(abstractC22044);
                                C1170.removeIf(arrayListM42551, new Predicate() { // from class: l.᩵֫ۚ
                                    @Override // java.util.function.Predicate
                                    public /* synthetic */ Predicate and(Predicate predicate) {
                                        return C19025.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* JADX INFO: renamed from: negate */
                                    public /* synthetic */ Predicate mo7134negate() {
                                        return C19025.$default$negate(this);
                                    }

                                    public /* synthetic */ Predicate or(Predicate predicate) {
                                        return C19025.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        String str3;
                                        C17384 c17385 = (C17384) obj;
                                        C17384 c17386 = c17384;
                                        String str4 = c17386.f56535;
                                        return str4 != null && str4.equals(c17385.f56535) && (str3 = c17386.f56531) != null && str3.equals(c17385.f56531);
                                    }
                                });
                                arrayListM42551.add(c17384);
                                m42555(abstractC22044, arrayListM42551);
                                i = 0;
                            } catch (IOException e3) {
                                throw m42473(e3);
                            }
                        }
                    }
                    iM42443 += i;
                }
            }
        }
        return iM42443;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9793 m42470(C14069 c14069, C13061 c13061, String str, String str2) throws C10186 {
        try {
            String str3 = c13061.f41796;
            C7118 c7118 = new C7118();
            c7118.f23465 = c14069.m34233(str3);
            C8850 c8850M19516 = c7118.m19516();
            try {
                C7447 c7447M44161 = C19051.m44161(str, c8850M19516, c7118);
                if (c7447M44161 == null || !c13061.f41797.equals(c7447M44161.getType())) {
                    String str4 = c13061.f41797;
                    return new C9793(null, new C17384("smali_class", str4, str4, c13061.f41796, str2, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile did not produce target class.", null, null));
                }
                try {
                    C22781 c22781 = new C22781();
                    c8850M19516.m52043(c22781);
                    return new C9793(new C2337(str2, c22781.m51385()), null);
                } catch (IOException e) {
                    throw m42473(e);
                }
            } catch (C4511 e2) {
                String message = e2.getMessage() == null ? "Smali compile failed." : e2.getMessage();
                int i = e2.f16093;
                Integer numValueOf = i > 0 ? Integer.valueOf(i - 1) : null;
                int i2 = e2.f16098;
                Integer numValueOf2 = i2 >= 0 ? Integer.valueOf(i2) : null;
                String str5 = c13061.f41797;
                return new C9793(null, new C17384("smali_class", str5, str5, c13061.f41796, str2, "SMALI_COMPILE_FAILED_IN_SESSION", message, numValueOf, numValueOf2));
            }
        } catch (OutOfMemoryError unused) {
            throw C18723.m43530();
        }
        throw C18723.m43530();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C18744 m42565(AbstractC22044 abstractC22044, C13061 c13061, String str) {
        AbstractC22044 abstractC22044M42485 = m42485(abstractC22044, c13061);
        if (!abstractC22044M42485.mo4304()) {
            return null;
        }
        try {
            C20348 c20348 = new C20348(abstractC22044M42485.m49865());
            if (c20348.readInt() == 1296388931 && c20348.readInt() == 1 && str.equals(c20348.m46756())) {
                byte[] bArrM46748 = c20348.m46748();
                if (c20348.available() == 0) {
                    for (C22737 c22737 : (AbstractC8696) C24975.m55778((InputStream) new ByteArrayInputStream(bArrM46748)).mo4327()) {
                        if (c13061.f41797.equals(c22737.getType())) {
                            return new C18744(c22737, bArrM46748);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        AbstractC22044 abstractC22044M42486 = m42485(abstractC22044, c13061);
        if (!abstractC22044M42486.mo2934()) {
            return null;
        }
        abstractC22044M42486.mo4296();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42503(AbstractC22044 abstractC22044, C13061 c13061, C2337 c2337) {
        C6178 c6178 = new C6178(c2337.f7554.length + 96);
        c6178.writeInt(1296388931);
        c6178.writeInt(1);
        c6178.m17786((CharSequence) c2337.f7555);
        c6178.m17806(c2337.f7554);
        AbstractC22044 abstractC22044M42485 = m42485(abstractC22044, c13061);
        abstractC22044M42485.mo49834();
        abstractC22044M42485.m49844(c6178);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42571(C14069 c14069, C7863 c7863, String str, String str2, String str3, String str4) throws C10186 {
        JSONArray jSONArrayM42558;
        String str5 = c14069.f44556;
        if (str4.equals(c7863.f26193)) {
            return;
        }
        JSONObject jSONObjectAdd = m42449(str5, str, str2, str3).add("currentTargetVersion", str4);
        if ("missing".equals(str4)) {
            jSONArrayM42558 = JSON.array();
        } else {
            jSONArrayM42558 = m42558(str5, str, str2, str3);
        }
        throw C10186.m26302("TARGET_VERSION_MISMATCH", "targetVersion does not match current target text. Re-read the target and retry with data.targetVersion.", "warning", jSONArrayM42558, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42535(String str) {
        return C15022.m36182(C15022.m36183().digest(str.getBytes(StandardCharsets.UTF_8))).substring(0, 16);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C23352 m42568(C14069 c14069, AbstractC22044 abstractC22044, C12337 c12337) throws C10186 {
        String str = c14069.f44556;
        String str2 = c12337.f39621;
        String str3 = c12337.f39619;
        String strM42520 = m42520(str2);
        if (m42561(abstractC22044, strM42520) != null) {
            throw C18723.m43532(str, str3);
        }
        C13061 c13061 = (C13061) m42536(abstractC22044).get(strM42520);
        int iM42534 = m42534(c14069, strM42520);
        boolean z = true;
        if (c13061 == null && iM42534 > 1) {
            throw C10186.m26300("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        boolean z2 = iM42534 > 0;
        if (c13061 == null && !z2) {
            throw C18723.m43532(str, str3);
        }
        String str4 = (c13061 != null ? c13061 : new C13061(m42438(c14069, strM42520).f75564, strM42520)).f41796;
        C8303 c8303 = new C8303("dex", strM42520, str4, c13061 != null);
        m42584(abstractC22044);
        try {
            m42501(abstractC22044, c8303, m42484(abstractC22044));
            if (z2) {
                m42580(abstractC22044, strM42520, str4);
            } else {
                ArrayList arrayListM42585 = m42585(abstractC22044);
                C1170.removeIf(arrayListM42585, new C11285(strM42520));
                m42533(abstractC22044, arrayListM42585);
            }
            ArrayList arrayListM42547 = m42547(abstractC22044);
            C1170.removeIf(arrayListM42547, new C16506(strM42520));
            m42545(abstractC22044, arrayListM42547);
            m42444(abstractC22044, m42584(abstractC22044));
            try {
                m42574(abstractC22044, c8303);
            } catch (IOException e) {
                e = e;
                if (z || !m42514(abstractC22044, c8303, e)) {
                    m42513(abstractC22044, e);
                    if (e instanceof C10186) {
                        throw ((C10186) e);
                    }
                    throw m42473(e);
                }
                C20653.m47272("MT MCP delete commit completed after storage error, editSessionId=".concat(str3), e);
            } catch (C10186 e2) {
                e = e2;
                if (z) {
                }
                m42513(abstractC22044, e);
                if (e instanceof C10186) {
                    throw ((C10186) e);
                }
                throw m42473(e);
            }
        } catch (IOException | C10186 e3) {
            e = e3;
            z = false;
        }
        m42522(abstractC22044);
        return new C23352(c12337.f39622, str3, c12337.f39620, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23352 m42487(C14069 c14069, AbstractC22044 abstractC22044, C12337 c12337, C4156 c4156) throws C10186 {
        C2337 c2337;
        String str = c14069.f44556;
        String str2 = c12337.f39621;
        String str3 = c12337.f39619;
        String strM13950 = C4375.m13950(str2);
        String strM13981 = C4375.m13981(str2);
        if (m42561(abstractC22044, strM13950) != null) {
            throw C18723.m43532(str, str3);
        }
        String strM4319 = C1173.m4319(m42587(c14069, str3, strM13950, c4156));
        C4574 c4574M50677 = C22474.m50676(strM13950, strM4319).m50677(strM13981);
        if (c4574M50677 != null) {
            int i = c4574M50677.f16278;
            boolean z = false;
            String strM42452 = m42452(strM4319, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c4574M50677.f16279), "");
            String strM42454 = m42454(c14069, abstractC22044, strM13950);
            C13061 c13061 = new C13061(strM42454, strM13950);
            String strM42779 = C18326.m42779(strM42452);
            if (m42565(abstractC22044, c13061, strM42779) == null) {
                C9793 c9793M42470 = m42470(c14069, c13061, strM42452, strM42779);
                C17384 c17384 = c9793M42470.f31571;
                if (c17384 == null) {
                    c2337 = c9793M42470.f31570;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c17384);
                    throw m42480(c14069, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; delete candidate was not saved.", m42448(arrayList), c12337.f39620, c12337.f39621);
                }
            } else {
                c2337 = null;
            }
            C8303 c8303 = new C8303("dex", strM13950, strM42454, m42567(abstractC22044, c13061).mo4304());
            m42584(abstractC22044);
            try {
                m42501(abstractC22044, c8303, m42484(abstractC22044));
                AbstractC22044 abstractC22044M42567 = m42567(abstractC22044, c13061);
                abstractC22044M42567.mo49834();
                abstractC22044M42567.m49849(strM42452.getBytes(StandardCharsets.UTF_8));
                ArrayList arrayListM42585 = m42585(abstractC22044);
                C1170.removeIf(arrayListM42585, new C11285(strM13950));
                m42533(abstractC22044, arrayListM42585);
                ArrayList arrayListM42547 = m42547(abstractC22044);
                C1170.removeIf(arrayListM42547, new C16506(strM13950));
                m42545(abstractC22044, arrayListM42547);
                m42444(abstractC22044, m42584(abstractC22044));
                try {
                    m42574(abstractC22044, c8303);
                } catch (IOException | C10186 e) {
                    e = e;
                    z = true;
                    if (!z || !m42514(abstractC22044, c8303, e)) {
                        m42513(abstractC22044, e);
                        if (e instanceof C10186) {
                            throw ((C10186) e);
                        }
                        throw m42473(e);
                    }
                    C20653.m47272("MT MCP method delete commit completed after storage error, editSessionId=".concat(str3), e);
                }
            } catch (IOException e2) {
                e = e2;
            } catch (C10186 e3) {
                e = e3;
            }
            m42522(abstractC22044);
            if (c2337 != null) {
                try {
                    m42503(abstractC22044, c13061, c2337);
                } catch (Exception e4) {
                    try {
                        AbstractC22044 abstractC22044M42485 = m42485(abstractC22044, c13061);
                        if (abstractC22044M42485.mo2934()) {
                            abstractC22044M42485.mo4296();
                        }
                    } catch (RuntimeException e5) {
                        e4.addSuppressed(e5);
                    }
                    C20653.m47272("MT MCP delete cache publish failed, editSessionId=".concat(str3), e4);
                }
            }
            return new C23352(c12337.f39622, str3, c12337.f39620, str2);
        }
        throw C18723.m43540(str, str3, strM13950);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42453(C14069 c14069, C7863 c7863, String str, String str2, String str3, String str4) throws C10186 {
        ArrayList arrayList = c7863.f26194;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C0405 c0405 = (C0405) arrayList.get(i);
            String str5 = c0405.f1950;
            if (!m42556(str5)) {
                throw C10186.m26301("Invalid mode", C14442.m34864(i, "edits[", "].mode"), JSON.value(str5), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            arrayList2.add(new C9528(str5, c0405.f1948, c0405.f1949));
        }
        try {
            return C1173.m4319(C4530.m14252(str4, arrayList2));
        } catch (C2817 e) {
            int i2 = e.f9261;
            String strM34864 = C14442.m34864(i2, "edits[", "]");
            int i3 = C20982.f67092[e.f9260.ordinal()];
            if (i3 == 1) {
                throw m42475("TEXT_MATCH_NOT_FOUND", C14483.m34972(strM34864, ".matchText was not found in current text. Re-read the target and retry with current text."), c14069.f44556, str, str2, str3, e.f9261);
            }
            if (i3 == 2) {
                throw m42475("TEXT_MATCH_AMBIGUOUS", C14483.m34972(strM34864, ".matchText appears multiple times in current text; provide a longer matchText with surrounding context that appears only once."), c14069.f44556, str, str2, str3, e.f9261);
            }
            if (i3 == 3) {
                throw m42475("TEXT_MATCH_OVERLAP", C12669.m31437(e.f9259, "]; match ranges must not overlap.", C3188.m10405(strM34864, " overlaps edits[")), c14069.f44556, str, str2, str3, e.f9261);
            }
            if (i3 == 4) {
                throw C10186.m26301("Invalid mode", C14483.m34972(strM34864, ".mode"), JSON.value(((C0405) arrayList.get(i2)).f1950), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42475(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        return C10186.m26302(str, str2, "warning", m42558(str3, str4, str5, str6), m42449(str3, str4, str5, str6).add("failedEditIndex", i));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m42556(String str) {
        return "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42449(String str, String str2, String str3, String str4) {
        return C22121.m50076("workspaceId", str, "editSessionId", str2).add("targetType", str3).add("target", str4).add("locator", C4375.m13905(str3, str4)).add("failures", JSON.array());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONArray m42558(String str, String str2, String str3, String str4) {
        return JSON.array().add(C2729.m9064(C22121.m50076("workspaceId", str, "editSessionId", str2).add("locator", C4375.m13905(str3, str4)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read current target text and targetVersion"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m42546(String str) {
        return str.startsWith(".method") && str.length() > 7 && Character.isWhitespace(str.charAt(7));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42451(String str) throws C10186 {
        int iIndexOf = str.indexOf(35);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith(".class")) {
            return null;
        }
        if (strTrim.length() > 6 && !Character.isWhitespace(strTrim.charAt(6))) {
            return null;
        }
        String[] strArrSplit = strTrim.split("\\s+");
        if (strArrSplit.length < 2) {
            throw C10186.m26300("SMALI_CLASS_MISMATCH", "Smali .class directive is invalid.");
        }
        return m42520(strArrSplit[strArrSplit.length - 1]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42481(C14069 c14069, C7863 c7863, String str) {
        return C10186.m26302("DEX_METHOD_MISMATCH", str, "fatal", JSON.array(), JSON.object().add("workspaceId", c14069.f44556).add("editSessionId", c7863.f26190).add("locator", C4375.m13905(c7863.f26195, c7863.f26191)).add("failures", JSON.array()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23330 m42438(C14069 c14069, String str) throws C10186 {
        C23330 c23330 = null;
        for (C23330 c23331 : c14069.f44551) {
            if (str.equals(C3192.m10509(c23331.f75565))) {
                c23330 = c23331;
            }
        }
        if (c23330 != null) {
            return c23330;
        }
        throw C18723.m43532(c14069.f44556, "");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m42534(C14069 c14069, String str) {
        return ((Integer) C11392.getOrDefault(c14069.f44539, C3192.m10507(str), 0)).intValue();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42549(C14069 c14069, String str) throws C10186 {
        if (m42583(str)) {
            throw C10186.m26300("EDIT_SESSION_REQUIRED", "editSessionId is required for edit session tools.");
        }
        if (m42541(str)) {
            AbstractC22044 abstractC22044M49876 = c14069.f44536.m49876("edit_sessions").m49876(str);
            if (!abstractC22044M49876.mo4281()) {
                throw C10186.m26300("EDIT_SESSION_NOT_FOUND", "Edit session was not found.");
            }
            m42557(abstractC22044M49876);
            return abstractC22044M49876;
        }
        throw C10186.m26301("Invalid editSessionId", "editSessionId", JSON.value(str), JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42499(AbstractC22044 abstractC22044, ArrayList arrayList) throws IOException {
        byte[] bArrM49865;
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("overlay").m49876("resource_value");
        ArrayList<C11569> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            bArrM49865 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = ((C24996) it.next()).f80935;
            AbstractC22044 abstractC22044M4569 = C1260.m4569(abstractC22044M49876, str);
            boolean zMo4304 = abstractC22044M4569.mo4304();
            if (abstractC22044M4569.mo4304()) {
                bArrM49865 = abstractC22044M4569.m49865();
            }
            arrayList2.add(new C11569(str, zMo4304, bArrM49865));
        }
        AbstractC22044 abstractC22044M49877 = abstractC22044.m49876("state.json");
        boolean zMo4305 = abstractC22044M49877.mo4304();
        bArrM49865 = abstractC22044M49877.mo4304() ? abstractC22044M49877.m49865() : null;
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C24996 c24996 = (C24996) it2.next();
                C1260 c1260 = c24996.f80934;
                if (c1260 != null) {
                    c1260.m4577(abstractC22044M49876);
                } else {
                    AbstractC22044 abstractC22044M45610 = C1260.m4569(abstractC22044M49876, c24996.f80935);
                    if (abstractC22044M45610.mo2934() && !abstractC22044M45610.mo4296()) {
                        throw new IOException("Unable to delete resource patch");
                    }
                }
            }
            m42444(abstractC22044, m42584(abstractC22044));
        } catch (IOException | C10186 e) {
            try {
                for (C11569 c11569 : arrayList2) {
                    AbstractC22044 abstractC22044M45611 = C1260.m4569(abstractC22044M49876, c11569.f36368);
                    if (c11569.f36369) {
                        m42575(abstractC22044M45611, c11569.f36367, ".resource_patch_restore");
                    } else {
                        AbstractC22044 abstractC22044M45612 = C1260.m4569(abstractC22044M49876, c11569.f36368);
                        if (abstractC22044M45612.mo2934() && !abstractC22044M45612.mo4296()) {
                            throw new IOException("Unable to delete resource patch");
                        }
                    }
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            try {
                if (zMo4305) {
                    m42575(abstractC22044M49877, bArrM49865, ".state_restore");
                    throw e;
                }
                if (!abstractC22044M49877.mo2934()) {
                    throw e;
                }
                if (abstractC22044M49877.mo4296()) {
                    throw e;
                }
                throw new IOException("Unable to restore edit session state");
            } catch (IOException e3) {
                e.addSuppressed(e3);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42543(AbstractC22044 abstractC22044) {
        return abstractC22044.m49876("overlay").m49876(Entry.DEFAULT_NAME);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42567(AbstractC22044 abstractC22044, C13061 c13061) {
        return abstractC22044.m49876("overlay").m49876("dex").m49876(c13061.f41796).m49876(C18326.m42779(c13061.f41797).concat(".smali"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42485(AbstractC22044 abstractC22044, C13061 c13061) {
        return abstractC22044.m49876("cache").m49876("dex").m49876(c13061.f41796).m49876(C18326.m42779(c13061.f41797).concat(".bin"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42529(AbstractC22044 abstractC22044, String str) {
        return abstractC22044.m49876("cache").m49876(Entry.DEFAULT_NAME).m49876(C18326.m42779(str).concat(".bin"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42501(AbstractC22044 abstractC22044, C8303 c8303, AbstractC22044 abstractC22045) throws IOException {
        boolean z;
        boolean z2;
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("deleted");
        String str = c8303.f27269;
        AbstractC22044 abstractC22044M49877 = abstractC22044M49876.m49876("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC22044 abstractC22044M49878 = abstractC22045.m49876("deleted.backup");
        boolean z3 = true;
        if (abstractC22044M49877.mo4304()) {
            abstractC22044M49878.m49849(abstractC22044M49877.m49865());
            z = true;
        } else {
            z = false;
        }
        c8303.f27267 = z;
        AbstractC22044 abstractC22044M49879 = abstractC22044.m49876("failures").m49876("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC22044 abstractC22044M498710 = abstractC22045.m49876("failures.backup");
        if (abstractC22044M49879.mo4304()) {
            abstractC22044M498710.m49849(abstractC22044M49879.m49865());
            z2 = true;
        } else {
            z2 = false;
        }
        c8303.f27268 = z2;
        AbstractC22044 abstractC22044M498711 = abstractC22044.m49876("state.json");
        AbstractC22044 abstractC22044M498712 = abstractC22045.m49876("state.backup");
        if (abstractC22044M498711.mo4304()) {
            abstractC22044M498712.m49849(abstractC22044M498711.m49865());
        } else {
            z3 = false;
        }
        c8303.f27271 = z3;
        m42507(abstractC22044.m49876(".delete_transaction").m49876("transaction.json"), m42518(c8303, "prepared"), ".delete_txn");
        if (c8303.f27273) {
            AbstractC22044 abstractC22044M42530 = m42530(abstractC22044, c8303);
            AbstractC22044 abstractC22044M498713 = abstractC22045.m49876("overlay.backup");
            if (!abstractC22044M42530.mo2934() || abstractC22044M498713.mo2934() || !abstractC22044M42530.mo4301(abstractC22044M498713)) {
                throw new IOException("Unable to stage delete transaction overlay");
            }
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42548(AbstractC22044 abstractC22044) throws C10186 {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("deleted").m49876("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC22044M49876.mo4304()) {
            try {
                JSONValue jSONValue = JSON.parse(m42441(abstractC22044M49876));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((JSONValue) it.next()).asObject().getString("entryName", null));
                    }
                    C1170.removeIf(arrayList, new C23326(1));
                    return arrayList;
                }
            } catch (Exception e) {
                throw m42473(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static ArrayList m42585(AbstractC22044 abstractC22044) throws C10186 {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("deleted").m49876("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC22044M49876.mo4304()) {
            try {
                JSONValue jSONValue = JSON.parse(m42441(abstractC22044M49876));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C6812(jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null)));
                    }
                }
            } catch (Exception e) {
                throw m42473(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42547(AbstractC22044 abstractC22044) throws C10186 {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("failures").m49876("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC22044M49876.mo4304()) {
            try {
                JSONValue jSONValue = JSON.parse(m42441(abstractC22044M49876));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C17384(jSONObjectAsObject.getString("targetType", "smali_class"), jSONObjectAsObject.getString("target", jSONObjectAsObject.getString("className", null)), jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null), jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), jSONObjectAsObject.getString("message", "Smali compile failed."), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m42473(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m42550(AbstractC22044 abstractC22044) throws C10186 {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("failures").m49876("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC22044M49876.mo4304()) {
            try {
                JSONValue jSONValue = JSON.parse(m42441(abstractC22044M49876));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C17384(jSONObjectAsObject.getString("targetType", null), jSONObjectAsObject.getString("target", null), null, null, jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", null), jSONObjectAsObject.getString("message", null), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m42473(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m42537(AbstractC22044 abstractC22044) {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("state.json");
        if (abstractC22044M49876.mo4304()) {
            try {
                long j = JSON.parse(m42441(abstractC22044M49876)).asObject().getLong("lastAccessedAt", -1L);
                if (j >= 0) {
                    return j;
                }
            } catch (Exception unused) {
            }
            return abstractC22044M49876.mo4286();
        }
        return abstractC22044.mo4286();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C13523 m42584(AbstractC22044 abstractC22044) throws C10186 {
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("state.json");
        if (!abstractC22044M49876.mo4304()) {
            throw m42473(new IOException("Edit session state is missing."));
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(m42441(abstractC22044M49876)).asObject();
            int i = jSONObjectAsObject.getInt("revision", -1);
            if (i < 0) {
                throw new NumberFormatException("negative revision");
            }
            long jMo4286 = jSONObjectAsObject.getLong("createdAt", -1L);
            if (jMo4286 < 0) {
                jMo4286 = abstractC22044.mo4286();
            }
            long jM42537 = jSONObjectAsObject.getLong("lastAccessedAt", -1L);
            if (jM42537 < 0) {
                jM42537 = m42537(abstractC22044);
            }
            return new C13523(jMo4286, i, jM42537);
        } catch (Exception e) {
            throw m42473(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ArrayList m42559(C14069 c14069, AbstractC22044 abstractC22044) {
        int i = m42584(abstractC22044).f42979;
        String str = c14069.f44556;
        String name = abstractC22044.getName();
        C15473 c15473 = this.f59628;
        ArrayList arrayListM37037 = c15473.m37037(i, str, name);
        if (arrayListM37037 != null) {
            return arrayListM37037;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("overlay").m49876("resource_value");
        if (abstractC22044M49876.mo4281()) {
            for (AbstractC22044 abstractC22045 : abstractC22044M49876.mo4299(true)) {
                if (abstractC22045.mo4304() && C1260.m4571(abstractC22045.getName())) {
                    arrayList.add(C1260.m4575(abstractC22045));
                }
            }
        }
        return c15473.m37038(i, c14069.f44556, abstractC22044.getName(), C1260.m4565(arrayList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m42444(AbstractC22044 abstractC22044, C13523 c13523) throws C10186 {
        int i = c13523.f42979;
        if (i == Integer.MAX_VALUE) {
            throw m42473(new IOException("Edit session revision overflow."));
        }
        int i2 = i + 1;
        long j = c13523.f42978;
        m42575(abstractC22044.m49876("state.json"), JSON.object().add("revision", i2).add("createdAt", j).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16790 m42482(C14069 c14069, String str, AbstractC22044 abstractC22044, C4156 c4156) throws C10186 {
        if (c4156 == null) {
            return m42483(abstractC22044, c14069.f44556, str);
        }
        Object objM13309 = c4156.m13309("apk.edit.sessionClassView");
        if (objM13309 instanceof C16790) {
            C16790 c16790 = (C16790) objM13309;
            if (c16790.f54175.equals(c14069.f44556) && c16790.f54176.equals(str)) {
                return c16790;
            }
        }
        C16790 c16790M42483 = m42483(abstractC22044, c14069.f44556, str);
        c4156.m13312(c16790M42483, "apk.edit.sessionClassView");
        return c16790M42483;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16790 m42483(AbstractC22044 abstractC22044, String str, String str2) throws C10186 {
        HashMap mapM42536 = m42536(abstractC22044);
        HashMap map = new HashMap();
        for (C13061 c13061 : mapM42536.values()) {
            map.put(c13061.f41795, c13061);
        }
        HashSet hashSet = new HashSet();
        Iterator it = m42585(abstractC22044).iterator();
        while (it.hasNext()) {
            hashSet.add(C3192.m10507(((C6812) it.next()).f22676));
        }
        return new C16790(str, str2, mapM42536, map, hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42454(C14069 c14069, AbstractC22044 abstractC22044, String str) throws C10186 {
        C13061 c13061 = (C13061) m42536(abstractC22044).get(str);
        if (c13061 != null) {
            return c13061.f41796;
        }
        C6812 c6812M42561 = m42561(abstractC22044, str);
        if (c6812M42561 != null) {
            return c6812M42561.f22677;
        }
        int iM42534 = m42534(c14069, str);
        ArrayList arrayList = c14069.f44549;
        if (iM42534 > 1) {
            throw C10186.m26300("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        if (iM42534 == 1) {
            return m42438(c14069, str).f75564;
        }
        if (arrayList.isEmpty()) {
            throw C10186.m26300("NO_DEX_IN_WORKSPACE", "Workspace has no dex file for new Smali.");
        }
        return (String) C1170.stream(arrayList).max(C15870.m37839()).orElse((String) j$$ExternalSyntheticOutline0.m(arrayList, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m42459(AbstractC22044 abstractC22044, C4156 c4156) throws C10186 {
        if (c4156 == null) {
            return m42536(abstractC22044);
        }
        String strM5125 = C1402.m5125(abstractC22044, new StringBuilder("apk.edit.overlayRefs:"));
        Object objM13309 = c4156.m13309(strM5125);
        if (objM13309 != null) {
            return (HashMap) objM13309;
        }
        HashMap mapM42536 = m42536(abstractC22044);
        c4156.m13312(mapM42536, strM5125);
        return mapM42536;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m42536(AbstractC22044 abstractC22044) throws C10186 {
        HashMap map = new HashMap();
        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876("overlay").m49876("dex");
        if (abstractC22044M49876.mo4281()) {
            for (AbstractC22044 abstractC22045 : abstractC22044M49876.mo4299(true)) {
                if (abstractC22045.mo4281()) {
                    String name = abstractC22045.getName();
                    for (AbstractC22044 abstractC22046 : abstractC22045.mo4299(true)) {
                        if (!abstractC22046.mo4281() && abstractC22046.getName().endsWith(".smali")) {
                            try {
                                String strM42538 = m42538(abstractC22046);
                                if (!abstractC22046.getName().equals(C18326.m42779(strM42538).concat(".smali"))) {
                                    throw m42471();
                                }
                                map.put(strM42538, new C13061(name, strM42538));
                            } catch (IOException | C10186 unused) {
                                throw m42471();
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String m42538(AbstractC22044 abstractC22044) throws C10186, IOException {
        String strM42451;
        BufferedReader bufferedReaderM49863 = abstractC22044.m49863();
        do {
            try {
                String line = bufferedReaderM49863.readLine();
                if (line != null) {
                    strM42451 = m42451(line);
                } else {
                    bufferedReaderM49863.close();
                    throw C10186.m26300("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM49863.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (strM42451 == null);
        bufferedReaderM49863.close();
        return strM42451;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m42533(AbstractC22044 abstractC22044, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6812 c6812 = (C6812) it.next();
            jSONArrayArray.add(JSON.object().add("className", c6812.f22676).add("dexEntryName", c6812.f22677));
        }
        abstractC22044.m49876("deleted").m49876("dex.json").m49849(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6812 m42561(AbstractC22044 abstractC22044, String str) {
        for (C6812 c6812 : m42585(abstractC22044)) {
            if (str.equals(c6812.f22676)) {
                return c6812;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m42580(AbstractC22044 abstractC22044, final String str, String str2) throws C10186 {
        ArrayList arrayListM42585 = m42585(abstractC22044);
        C1170.removeIf(arrayListM42585, new Predicate() { // from class: l.᩻֫ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C6812) obj).f22676);
            }
        });
        arrayListM42585.add(new C6812(str, str2));
        m42533(abstractC22044, arrayListM42585);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m42545(AbstractC22044 abstractC22044, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17384 c17384 = (C17384) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c17384.f56533).add("target", c17384.f56535).add("className", c17384.f56532).add("dexEntryName", c17384.f56534).add("textHash", c17384.f56531).add("errorCode", c17384.f56539).add("message", c17384.f56536);
            Integer num = c17384.f56537;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c17384.f56538;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC22044.m49876("failures").m49876("dex.json").m49849(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42515(AbstractC22044 abstractC22044, C13061 c13061, String str) {
        for (C17384 c17384 : m42547(abstractC22044)) {
            if (c13061.f41797.equals(c17384.f56532) && c13061.f41796.equals(c17384.f56534) && str.equals(c17384.f56531)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C0845 m42463(C14069 c14069, String str, String str2, String str3, String str4) throws C10186 {
        Integer num;
        Integer numValueOf;
        try {
            try {
                C6178 c6178 = new C6178();
                C22173 c22173 = new C22173(this.f59628.m37039(c14069, this, str));
                c22173.m50145(true);
                c22173.m50142(str3);
                c22173.m50144(c6178);
                int size = c6178.size();
                if (size > 2097152) {
                    return new C0845(null, new C17384("axml", str2, null, null, str4, "AXML_ENCODED_TOO_LARGE", "Encoded AXML is too large.", null, null));
                }
                try {
                    return new C0845(new C22012(str4, Arrays.copyOf(c6178.m17808(), size)), null);
                } catch (C10254 e) {
                    e = e;
                    if (e.m26443() != null) {
                        int iM24888 = e.m26443().m24888();
                        int iM24885 = e.m26443().m24885();
                        Integer numValueOf2 = iM24888 > 0 ? Integer.valueOf(iM24888 - 1) : null;
                        numValueOf = iM24885 > 0 ? Integer.valueOf(iM24885 - 1) : null;
                        num = numValueOf2;
                    } else {
                        num = null;
                        numValueOf = null;
                    }
                    return new C0845(null, new C17384("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", num, numValueOf));
                } catch (Exception e2) {
                    e = e2;
                    return new C0845(null, new C17384("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", null, null));
                }
            } catch (OutOfMemoryError unused) {
                throw C18723.m43530();
            }
        } catch (C10254 e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C7557 m42525(AbstractC22044 abstractC22044, String str, String str2) {
        AbstractC22044 abstractC22044M42529 = m42529(abstractC22044, str);
        if (!abstractC22044M42529.mo4304()) {
            return null;
        }
        try {
            C20348 c20348 = new C20348(abstractC22044M42529.m49865());
            if (c20348.readInt() == 1296384323 && c20348.readInt() == 1 && str.equals(c20348.m46756()) && str2.equals(c20348.m46756())) {
                byte[] bArrM46748 = c20348.m46748();
                if (c20348.available() == 0) {
                    return new C7557(bArrM46748);
                }
            }
        } catch (Exception unused) {
        }
        AbstractC22044 abstractC22044M425210 = m42529(abstractC22044, str);
        if (!abstractC22044M425210.mo2934()) {
            return null;
        }
        abstractC22044M425210.mo4296();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42497(AbstractC22044 abstractC22044, String str, C22012 c22012) {
        C6178 c6178 = new C6178(c22012.f71038.length + 128);
        c6178.writeInt(1296384323);
        c6178.writeInt(1);
        c6178.m17786((CharSequence) str);
        c6178.m17786((CharSequence) c22012.f71039);
        c6178.m17806(c22012.f71038);
        AbstractC22044 abstractC22044M42529 = m42529(abstractC22044, str);
        abstractC22044M42529.mo49834();
        abstractC22044M42529.m49844(c6178);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42502(AbstractC22044 abstractC22044, C8303 c8303, byte[] bArr, String str, C21266 c21266) throws C10186 {
        C13523 c13523M42584 = m42584(abstractC22044);
        try {
            AbstractC22044 abstractC22044M42484 = m42484(abstractC22044);
            AbstractC22044 abstractC22044M49876 = abstractC22044M42484.m49876("overlay.next");
            String str2 = c8303.f27269;
            String str3 = c8303.f27270;
            boolean zEquals = "dex".equals(str2);
            if (zEquals) {
                abstractC22044M49876.m49849(bArr);
            } else {
                abstractC22044M49876.m49853();
                m42496(abstractC22044M49876.m49876("meta.json"), str3, str, c21266);
                abstractC22044M49876.m49876("axml".equals(str) ? "text.xml" : "data.bin").m49849(bArr);
            }
            m42501(abstractC22044, c8303, abstractC22044M42484);
            AbstractC22044 abstractC22044M42530 = m42530(abstractC22044, c8303);
            abstractC22044M42530.mo49834();
            if (abstractC22044M42530.mo2934() || !abstractC22044M49876.mo4301(abstractC22044M42530)) {
                throw new IOException("Unable to publish text overlay");
            }
            if (zEquals) {
                ArrayList arrayListM42585 = m42585(abstractC22044);
                C1170.removeIf(arrayListM42585, new C11285(str3));
                m42533(abstractC22044, arrayListM42585);
                ArrayList arrayListM42547 = m42547(abstractC22044);
                C1170.removeIf(arrayListM42547, new C16506(str3));
                m42545(abstractC22044, arrayListM42547);
            } else {
                ArrayList arrayListM42548 = m42548(abstractC22044);
                arrayListM42548.remove(str3);
                m42581(abstractC22044, arrayListM42548);
                m42544(abstractC22044, str3);
            }
            m42444(abstractC22044, c13523M42584);
            m42574(abstractC22044, c8303);
            m42522(abstractC22044);
        } catch (IOException e) {
            e = e;
            if (0 != 0 || !m42514(abstractC22044, c8303, e)) {
                m42513(abstractC22044, e);
                if (e instanceof C10186) {
                    throw ((C10186) e);
                }
                throw m42473(e);
            }
            C20653.m47272("MT MCP text edit commit completed after storage error, editSessionId=" + abstractC22044.getName(), e);
        } catch (RuntimeException e2) {
            if (!m42576(e2)) {
                throw e2;
            }
            IOException iOException = new IOException("Edit session storage backend failed", e2);
            if (0 == 0 || !m42514(abstractC22044, c8303, iOException)) {
                m42513(abstractC22044, iOException);
                throw m42473(iOException);
            }
            C20653.m47272("MT MCP text edit commit completed after backend error, editSessionId=" + abstractC22044.getName(), e2);
        } catch (C10186 e3) {
            e = e3;
            if (0 != 0) {
            }
            m42513(abstractC22044, e);
            if (e instanceof C10186) {
                throw ((C10186) e);
            }
            throw m42473(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42496(AbstractC22044 abstractC22044, String str, String str2, C21266 c21266) {
        abstractC22044.m49849(C22121.m50076("targetType", str2, "entryName", str).add("encoding", c21266.f67827).add("lineEnding", c21266.f67828).toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static HashMap m42552(AbstractC22044 abstractC22044) throws C10186 {
        HashMap map = new HashMap();
        AbstractC22044 abstractC22044M42543 = m42543(abstractC22044);
        if (abstractC22044M42543.mo4281()) {
            for (AbstractC22044 abstractC22045 : abstractC22044M42543.mo4299(true)) {
                if (abstractC22045.mo4281()) {
                    try {
                        JSONObject jSONObjectAsObject = JSON.parse(m42441(abstractC22045.m49876("meta.json"))).asObject();
                        String string = jSONObjectAsObject.getString("targetType", null);
                        String string2 = jSONObjectAsObject.getString("entryName", null);
                        int i = jSONObjectAsObject.getInt("encoding", C2448.f7850);
                        String string3 = jSONObjectAsObject.getString("lineEnding", "lf");
                        if (string2 == null || string == null) {
                            throw new IOException("Missing entry overlay metadata");
                        }
                        if (!"axml".equals(string) && !"zip_entry".equals(string)) {
                            throw new IOException("Invalid entry overlay target type");
                        }
                        if (!"lf".equals(string3) && !"crlf".equals(string3) && !"cr".equals(string3)) {
                            throw new IOException("Invalid entry overlay line ending");
                        }
                        C15298 c15298 = new C15298(string2, i, string, string3);
                        if (!C18326.m42779(string2).equals(abstractC22045.getName())) {
                            throw m42471();
                        }
                        map.put(string2, c15298);
                    } catch (Exception unused) {
                        throw m42471();
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Long m42450(AbstractC22044 abstractC22044, C15298 c15298) {
        String str = c15298.f50010;
        String str2 = c15298.f50009;
        if ("zip_entry".equals(str)) {
            return Long.valueOf(m42543(abstractC22044).m49876(C18326.m42779(str2)).m49876("data.bin").mo4285());
        }
        C7557 c7557M42525 = m42525(abstractC22044, str2, C18326.m42779(m42441(m42543(abstractC22044).m49876(C18326.m42779(str2)).m49876("text.xml"))));
        if (c7557M42525 == null) {
            return null;
        }
        return Long.valueOf(c7557M42525.f24924.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m42457(C14069 c14069, AbstractC22044 abstractC22044) throws C10186 {
        ArrayList<C15298> arrayList = new ArrayList(m42552(abstractC22044).values());
        C12884.sort(arrayList, C2661.comparing(new C23220()));
        ArrayList arrayList2 = new ArrayList();
        for (C15298 c15298 : arrayList) {
            String str = c15298.f50010;
            String str2 = c15298.f50009;
            if ("zip_entry".equals(str)) {
                AbstractC22044 abstractC22044M49876 = m42543(abstractC22044).m49876(C18326.m42779(str2)).m49876("data.bin");
                arrayList2.add(new C5452(m42523(abstractC22044M49876), abstractC22044M49876, str2, m42586(c14069, str2)));
            } else {
                C7557 c7557M42525 = m42525(abstractC22044, str2, C18326.m42779(m42441(m42543(abstractC22044).m49876(C18326.m42779(str2)).m49876("text.xml"))));
                if (c7557M42525 == null) {
                    throw m42473(new IOException("Missing valid AXML cache for build."));
                }
                arrayList2.add(new C5452(str2, m42586(c14069, str2), c7557M42525.f24924));
            }
        }
        ArrayList arrayListM42559 = m42559(c14069, abstractC22044);
        if (!arrayListM42559.isEmpty()) {
            arrayList2.add(new C5452("resources.arsc", m42586(c14069, "resources.arsc"), m42519(c14069, abstractC22044, arrayListM42559)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static long m42523(AbstractC22044 abstractC22044) throws C10186 {
        try {
            if (!abstractC22044.mo4304()) {
                throw new IOException("ZIP entry overlay data is missing");
            }
            long jMo4285 = abstractC22044.mo4285();
            if (jMo4285 < 0 || jMo4285 > 9007199254740991L) {
                throw new IOException("ZIP entry overlay size is unavailable or unsupported");
            }
            return jMo4285;
        } catch (IOException e) {
            throw m42526(e);
        } catch (RuntimeException e2) {
            if (!m42576(e2)) {
                throw e2;
            }
            throw m42526(e2);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C7358 m42542(C14069 c14069, String str, String str2) throws C10186 {
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22941.getEntry(str2);
                if (entry == null) {
                    throw m42562();
                }
                if (!entry.isDirectory()) {
                    if (m42510(c14069, c22941, entry, str2)) {
                        throw C18723.m43541(c14069.f44556, str, str2);
                    }
                    InputStream inputStreamM51727 = c22941.m51727(entry);
                    try {
                        byte[] bArrM42516 = m42516(inputStreamM51727, 10485776);
                        inputStreamM51727.close();
                        C7358 c7358M42469 = m42469(c14069, str, str2, bArrM42516, bArrM42516.length > 10485760 || (entry.getSize() >= 0 && entry.getSize() > 10485760));
                        c22941.close();
                        return c7358M42469;
                    } catch (Throwable th) {
                        try {
                            inputStreamM51727.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                throw C10186.m26305("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
            } catch (Throwable th3) {
                try {
                    c22941.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw C10186.m26305("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m42570(C14069 c14069, String str, String str2, C18459 c18459) throws C10186 {
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22941.getEntry(str2);
                if (entry == null) {
                    throw m42562();
                }
                if (entry.isDirectory()) {
                    throw C10186.m26305("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                }
                if (entry.getSize() > 2097152) {
                    throw C10186.m26305("AXML_TOO_LARGE", "AXML entry is too large to decode");
                }
                m42492(c14069, str, c22941, entry, str2, c18459);
                c22941.close();
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw C10186.m26305("AXML_DECODE_FAILED", e2.getMessage() == null ? "Failed to decode AXML" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42510(C14069 c14069, C22941 c22941, C8002 c8002, String str) {
        C8630 c8630M34230 = c14069.m34230();
        int iM23260 = c8630M34230.m23260(str);
        if (iM23260 == 2) {
            return true;
        }
        if (iM23260 == 1) {
            return false;
        }
        try {
            InputStream inputStreamM51727 = c22941.m51727(c8002);
            try {
                boolean zM35979 = C14955.m35979(c8002.getSize(), inputStreamM51727);
                c8630M34230.m23262(str, zM35979);
                inputStreamM51727.close();
                c8630M34230.m23261();
                return zM35979;
            } catch (Throwable th) {
                try {
                    inputStreamM51727.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c8630M34230.m23261();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42492(C14069 c14069, String str, C22941 c22941, C8002 c8002, String str2, C18459 c18459) throws IOException {
        C8630 c8630M34230 = c14069.m34230();
        int iM23260 = c8630M34230.m23260(str2);
        if (iM23260 == 1) {
            throw new IOException("Not a binary AXML file");
        }
        C15473 c15473 = this.f59628;
        if (iM23260 == 2) {
            C10649.m27152(c22941, c8002, c15473.m37039(c14069, this, str), c18459);
            return;
        }
        C2664 c2664M23263 = c8630M34230.m23263();
        c2664M23263.m8819(str2);
        try {
            if (!C10649.m27149(c22941, c8002, c15473.m37039(c14069, this, str), c18459, c2664M23263)) {
                throw new IOException("Not a binary AXML file");
            }
            c8630M34230.m23261();
        } catch (Throwable th) {
            c8630M34230.m23261();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42517(C8002 c8002, C22941 c22941) throws IOException {
        if (c8002.getSize() >= 0 && c8002.getSize() > 10485760) {
            return new byte[10485761];
        }
        InputStream inputStreamM51727 = c22941.m51727(c8002);
        try {
            byte[] bArrM42516 = m42516(inputStreamM51727, 10485761);
            inputStreamM51727.close();
            return bArrM42516;
        } catch (Throwable th) {
            try {
                inputStreamM51727.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C21266 m42528(C14069 c14069, AbstractC22044 abstractC22044, String str) throws C10186 {
        C21266 c21266;
        C15298 c15298 = (C15298) m42552(abstractC22044).get(str);
        if (c15298 != null && "zip_entry".equals(c15298.f50010)) {
            return new C21266(c15298.f50007, c15298.f50008);
        }
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22941.getEntry(str);
                String str2 = "lf";
                if (entry == null || m42548(abstractC22044).contains(str)) {
                    c21266 = new C21266(C2448.f7850, "lf");
                } else {
                    byte[] bArrM42517 = m42517(entry, c22941);
                    if (bArrM42517.length > 10485760) {
                        throw C10186.m26300("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    if (bArrM42517.length == 0) {
                        c21266 = new C21266(C2448.f7850, "lf");
                    } else {
                        int iM8273 = C2448.m8273(bArrM42517.length, bArrM42517);
                        if (iM8273 < 0) {
                            iM8273 = C2448.f7850;
                        }
                        String strM7171 = C2083.m7171(bArrM42517, false);
                        if (strM7171 == null) {
                            throw C10186.m26300("NOT_TEXT_ENTRY", "ZIP entry is not text.");
                        }
                        int length = strM7171.length();
                        for (int i = 0; i < length; i++) {
                            char cCharAt = strM7171.charAt(i);
                            if (cCharAt == '\r') {
                                int i2 = i + 1;
                                if (i2 < length && strM7171.charAt(i2) == '\n') {
                                    str2 = "crlf";
                                    break;
                                }
                                str2 = "cr";
                                break;
                            }
                            if (cCharAt == '\n') {
                                break;
                            }
                        }
                        C21266 c21267 = new C21266(iM8273, str2);
                        c22941.close();
                        return c21267;
                    }
                }
                c22941.close();
                return c21266;
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C10186 e) {
            throw e;
        } catch (Exception e2) {
            throw C10186.m26305("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42489(C9982 c9982, int i) {
        if (i == C2448.f7861) {
            c9982.write(new byte[]{-17, -69, -65}, 0, 3);
            return;
        }
        if (i == C2448.f7858) {
            c9982.write(new byte[]{-2, -1}, 0, 2);
            return;
        }
        if (i == C2448.f7859) {
            c9982.write(new byte[]{-1, -2}, 0, 2);
        } else if (i == C2448.f7857) {
            c9982.write(new byte[]{0, 0, -2, -1}, 0, 4);
        } else if (i == C2448.f7864) {
            c9982.write(new byte[]{-1, -2, 0, 0}, 0, 4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7358 m42469(C14069 c14069, String str, String str2, byte[] bArr, boolean z) throws C10186 {
        String strM7171 = C2083.m7171(bArr, z);
        if (strM7171 != null) {
            return new C7358(C1173.m4319(strM7171), z ? "entry_prefix" : "full_source", z, z ? "entry_text_byte_cap" : null, null);
        }
        throw C18723.m43538(c14069.f44556, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C23352 m42486(C14069 c14069, AbstractC22044 abstractC22044, C12337 c12337) throws C10186 {
        boolean z;
        String str = c12337.f39619;
        String str2 = c12337.f39621;
        String str3 = c12337.f39620;
        if ("resources.arsc".equals(str2)) {
            throw C10186.m26300("RESOURCE_TABLE_DELETE_UNSUPPORTED", "resources.arsc cannot be deleted.");
        }
        if (C15870.m37838(str2) > 0) {
            throw C10186.m26300("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
        }
        if (m42548(abstractC22044).contains(str2)) {
            throw m42562();
        }
        C15298 c15298 = (C15298) m42552(abstractC22044).get(str2);
        if (c15298 != null && "axml".equals(str3) && !"axml".equals(c15298.f50010)) {
            throw C10186.m26300("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
        }
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22941.getEntry(str2);
                boolean z2 = true;
                if (entry != null) {
                    if (entry.isDirectory()) {
                        throw C10186.m26305("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                    if (c15298 == null && "axml".equals(str3) && !m42510(c14069, c22941, entry, str2)) {
                        throw C10186.m26300("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
                    }
                    c22941.close();
                    z = true;
                } else {
                    c22941.close();
                    z = false;
                }
                if (c15298 == null && !z) {
                    throw m42562();
                }
                C8303 c8303 = new C8303(Entry.DEFAULT_NAME, str2, null, c15298 != null);
                m42584(abstractC22044);
                try {
                    m42501(abstractC22044, c8303, m42484(abstractC22044));
                    if (z) {
                        ArrayList arrayListM42548 = m42548(abstractC22044);
                        arrayListM42548.remove(str2);
                        arrayListM42548.add(str2);
                        m42581(abstractC22044, arrayListM42548);
                    } else {
                        ArrayList arrayListM42549 = m42548(abstractC22044);
                        arrayListM42549.remove(str2);
                        m42581(abstractC22044, arrayListM42549);
                    }
                    m42544(abstractC22044, str2);
                    m42444(abstractC22044, m42584(abstractC22044));
                    try {
                        m42574(abstractC22044, c8303);
                    } catch (IOException e) {
                        e = e;
                        if (z2 || !m42514(abstractC22044, c8303, e)) {
                            m42513(abstractC22044, e);
                            if (e instanceof C10186) {
                                throw ((C10186) e);
                            }
                            throw m42473(e);
                        }
                        C20653.m47272("MT MCP entry delete commit completed after storage error, editSessionId=".concat(str), e);
                    } catch (C10186 e2) {
                        e = e2;
                        if (z2) {
                        }
                        m42513(abstractC22044, e);
                        if (e instanceof C10186) {
                            throw ((C10186) e);
                        }
                        throw m42473(e);
                    }
                } catch (IOException | C10186 e3) {
                    e = e3;
                    z2 = false;
                }
                m42522(abstractC22044);
                return new C23352(c12337.f39622, str, str3, str2);
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C10186 e4) {
            throw e4;
        } catch (Exception e5) {
            throw C10186.m26305("ENTRY_READ_FAILED", e5.getMessage() == null ? "Failed to read entry" : e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m42581(AbstractC22044 abstractC22044, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add(JSON.object().add("entryName", (String) it.next()));
        }
        abstractC22044.m49876("deleted").m49876("entry.json").m49849(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C19774 m42566(C14069 c14069, AbstractC22044 abstractC22044, String str) throws C10186 {
        C19774 c19774;
        if (m42548(abstractC22044).contains(str)) {
            return new C19774("missing", true);
        }
        C15298 c15298 = (C15298) m42552(abstractC22044).get(str);
        if (c15298 != null) {
            String str2 = c15298.f50010;
            return (!"zip_entry".equals(str2) || m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("data.bin").mo4285() <= 10485760) ? new C19774(str2, false) : new C19774("too_large", false);
        }
        abstractC22044.getName();
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22941.getEntry(str);
                if (entry == null) {
                    c19774 = new C19774("missing", false);
                } else if (entry.isDirectory()) {
                    c19774 = new C19774("directory", false);
                } else {
                    if (m42510(c14069, c22941, entry, str)) {
                        C19774 c19775 = new C19774("axml", false);
                        c22941.close();
                        return c19775;
                    }
                    byte[] bArrM42517 = m42517(entry, c22941);
                    if (bArrM42517.length > 10485760) {
                        c19774 = new C19774("too_large", false);
                    } else {
                        c19774 = (bArrM42517.length != 0 && C2083.m7171(bArrM42517, false) == null) ? new C19774("binary", false) : new C19774("zip_entry", false);
                    }
                }
                c22941.close();
                return c19774;
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            throw C10186.m26305("ENTRY_READ_FAILED", e.getMessage() == null ? "Failed to read entry" : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m42555(AbstractC22044 abstractC22044, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17384 c17384 = (C17384) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c17384.f56533).add("target", c17384.f56535).add("textHash", c17384.f56531).add("errorCode", c17384.f56539).add("message", c17384.f56536);
            Integer num = c17384.f56537;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c17384.f56538;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC22044.m49876("failures").m49876("entry.json").m49849(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m42577(AbstractC22044 abstractC22044, String str, String str2) {
        for (C17384 c17384 : m42550(abstractC22044)) {
            if (str.equals(c17384.f56535) && str2.equals(c17384.f56531)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m42544(AbstractC22044 abstractC22044, String str) throws C10186 {
        ArrayList arrayListM42550 = m42550(abstractC22044);
        C1170.removeIf(arrayListM42550, new C14676(1, str));
        m42555(abstractC22044, arrayListM42550);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42495(AbstractC22044 abstractC22044, String str) throws IOException {
        AbstractC22044 abstractC22044M49876 = m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("meta.json");
        AbstractC22044 abstractC22044M49877 = m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("text.xml");
        AbstractC22044 abstractC22044M49878 = m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("data.bin");
        if (abstractC22044M49876.mo2934() && !abstractC22044M49876.mo4296()) {
            throw new IOException("Unable to delete entry overlay metadata");
        }
        if (abstractC22044M49877.mo2934() && !abstractC22044M49877.mo4296()) {
            throw new IOException("Unable to delete AXML source overlay");
        }
        if (abstractC22044M49878.mo2934() && !abstractC22044M49878.mo4296()) {
            throw new IOException("Unable to delete ZIP entry data overlay");
        }
        AbstractC22044 abstractC22044M49879 = m42543(abstractC22044).m49876(C18326.m42779(str));
        if (abstractC22044M49879.mo2934() && !abstractC22044M49879.mo4296()) {
            throw new IOException("Unable to delete entry overlay directory");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42498(AbstractC22044 abstractC22044, String str, AbstractC22044 abstractC22045, C21266 c21266) throws C10186 {
        boolean z = false;
        try {
            m42543(abstractC22044).m49876(C18326.m42779(str)).m49853();
            abstractC22045.m49848(m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("data.bin"), false, true, null);
            try {
                m42496(m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("meta.json"), str, "zip_entry", c21266);
                AbstractC22044 abstractC22044M49876 = m42543(abstractC22044).m49876(C18326.m42779(str)).m49876("text.xml");
                if (abstractC22044M49876.mo2934() && !abstractC22044M49876.mo4296()) {
                    throw new IOException("Unable to remove stale AXML source overlay");
                }
                AbstractC22044 abstractC22044M42529 = m42529(abstractC22044, str);
                if (abstractC22044M42529.mo2934()) {
                    abstractC22044M42529.mo4296();
                }
                m42544(abstractC22044, str);
                ArrayList arrayListM42548 = m42548(abstractC22044);
                arrayListM42548.remove(str);
                m42581(abstractC22044, arrayListM42548);
                m42444(abstractC22044, m42584(abstractC22044));
            } catch (Exception e) {
                e = e;
                z = true;
                if (z) {
                    try {
                        m42495(abstractC22044, str);
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                }
                throw m42473(new IOException("Failed to publish patched ZIP entry overlay.", e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC22044 m42579(AbstractC22044 abstractC22044, String str) {
        return m42543(abstractC22044).m49876(C18326.m42779(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42439(String str) throws C10186 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0) {
            throw C10186.m26301("Invalid entryName", "entryName", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("entryName", "assets/data.bin"));
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m42539(C14069 c14069, String str, String str2) throws C10186 {
        if (str2.endsWith("/")) {
            throw m42478(c14069, str, str2, "directory");
        }
        if ("resources.arsc".equals(str2)) {
            throw m42478(c14069, str, str2, "resources_arsc");
        }
        if (c14069.f44549.contains(str2) || C15870.m37838(str2) > 0) {
            throw m42478(c14069, str, str2, "dex_entry");
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C0099 m42553(C14069 c14069, String str, String str2) throws C10186 {
        C0099 c0099;
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            try {
                C8002 entry = c22941.getEntry(str2);
                if (entry != null) {
                    if (!entry.isDirectory()) {
                        InputStream inputStreamM51727 = c22941.m51727(entry);
                        try {
                            long size = entry.getSize();
                            if (size < 0) {
                                throw new IOException("Workspace entry size is unavailable");
                            }
                            C17998 c17998 = new C17998(inputStreamM51727);
                            boolean zM35979 = C14955.m35979(size, c17998);
                            C17998.m41972(c17998);
                            c0099 = new C0099(true, false, zM35979);
                            inputStreamM51727.close();
                        } catch (Throwable th) {
                            try {
                                inputStreamM51727.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        c0099 = new C0099(true, true, false);
                    }
                } else {
                    c0099 = new C0099(false, false, false);
                }
                c22941.close();
                return c0099;
            } catch (Throwable th3) {
                try {
                    c22941.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e) {
            throw m42477(c14069, str, str2, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m42512(AbstractC22044 abstractC22044, long j) throws C10186 {
        try {
            InputStream inputStreamMo4290 = abstractC22044.mo4290();
            try {
                if (j < 0) {
                    throw new IOException("Workspace entry size is unavailable");
                }
                C17998 c17998 = new C17998(inputStreamMo4290);
                boolean zM35979 = C14955.m35979(j, c17998);
                C17998.m41972(c17998);
                if (inputStreamMo4290 != null) {
                    inputStreamMo4290.close();
                }
                return zM35979;
            } catch (Throwable th) {
                if (inputStreamMo4290 != null) {
                    try {
                        inputStreamMo4290.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw m42526(e);
        } catch (RuntimeException e2) {
            if (!m42576(e2)) {
                throw e2;
            }
            throw m42526(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m42447(AbstractC22044 abstractC22044, InterfaceC5626 interfaceC5626, C14069 c14069, String str, String str2) throws C10186 {
        try {
            try {
                C9048 c9048 = new C9048(abstractC22044.mo4289(false));
                try {
                    try {
                        try {
                            long jMo16609 = interfaceC5626.mo16609(c9048);
                            c9048.close();
                            long j = c9048.f29438;
                            if (jMo16609 == j) {
                                if (m42523(abstractC22044) == j) {
                                    return j;
                                }
                                throw m42473(new IOException("ZIP entry candidate size does not match bytes written"));
                            }
                            C10186 c10186M26305 = C10186.m26305("WORKSPACE_ENTRY_SOURCE_INVALID", "Source byte count does not match bytes written.");
                            m42491(c10186M26305, c14069, str, str2);
                            throw c10186M26305;
                        } catch (IOException e) {
                            throw new C24250(e);
                        }
                    } catch (C4112 e2) {
                        throw m42563(e2.f13978);
                    } catch (C6350 unused) {
                        throw m42437(c14069, str, str2);
                    }
                } catch (Throwable th) {
                    try {
                        c9048.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw m42563(e3);
            } catch (RuntimeException e4) {
                if (!m42576(e4)) {
                    throw e4;
                }
                throw m42563((Exception) e4);
            }
        } catch (C4112 e5) {
            throw m42563(e5.f13978);
        } catch (C6350 unused2) {
            throw m42437(c14069, str, str2);
        } catch (C14552 e6) {
            throw m42563((Exception) e6.f45861);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m42446(C14069 c14069, String str, String str2, OutputStream outputStream) throws C10186 {
        try {
            C22941 c22941 = new C22941(c14069.m34234());
            Throwable th = null;
            try {
                try {
                    try {
                        C8002 entry = c22941.getEntry(str2);
                        if (entry == null) {
                            C10186 c10186M26300 = C10186.m26300("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                            m42491(c10186M26300, c14069, str, str2);
                            throw c10186M26300;
                        }
                        if (entry.getSize() > 9007199254740991L) {
                            throw m42437(c14069, str, str2);
                        }
                        try {
                            long jM42445 = m42445(c14069, str, str2, c22941.m51727(entry), outputStream);
                            try {
                                c22941.close();
                                return jM42445;
                            } catch (Exception e) {
                                throw m42477(c14069, str, str2, e);
                            }
                        } catch (IOException e2) {
                            throw m42477(c14069, str, str2, e2);
                        } catch (RuntimeException e3) {
                            if (!m42576(e3)) {
                                throw e3;
                            }
                            throw m42477(c14069, str, str2, e3);
                        }
                    } catch (Throwable th2) {
                        try {
                            c22941.close();
                        } catch (Exception e4) {
                            if (0 != 0) {
                                th.addSuppressed(e4);
                            } else {
                                throw m42477(c14069, str, str2, e4);
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e5) {
                    e = e5;
                    throw e;
                } catch (RuntimeException e6) {
                    e = e6;
                    throw e;
                }
            } catch (Error e7) {
                e = e7;
                throw e;
            } catch (C10186 e8) {
                e = e8;
                throw e;
            }
        } catch (Exception e9) {
            throw m42477(c14069, str, str2, e9);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m42445(C14069 c14069, String str, String str2, InputStream inputStream, OutputStream outputStream) throws C10186 {
        try {
            C3366 c3366 = new C3366(inputStream);
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                while (true) {
                    int i = c3366.read(bArr);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = c3366.read();
                        if (i2 < 0) {
                            break;
                        }
                        if (j == 9007199254740991L) {
                            throw m42437(c14069, str, str2);
                        }
                        outputStream.write(i2);
                        j++;
                    } else {
                        long j2 = i;
                        if (j > 9007199254740991L - j2) {
                            throw m42437(c14069, str, str2);
                        }
                        outputStream.write(bArr, 0, i);
                        j += j2;
                    }
                }
                c3366.close();
                return j;
            } catch (Throwable th) {
                try {
                    c3366.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12315 e) {
            throw m42477(c14069, str, str2, e.f39584);
        } catch (C20520 e2) {
            throw m42477(c14069, str, str2, e2.f65729);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m42576(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10186 m42526(Exception exc) {
        C10186 c10186M26305 = C10186.m26305("EDIT_SESSION_STORAGE_FAILED", "Edit session storage failed.");
        c10186M26305.f32602.put("backendReason", exc.getClass().getSimpleName());
        return c10186M26305;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m42563(Exception exc) {
        C10186 c10186M26305 = C10186.m26305("EDIT_SESSION_STORAGE_FAILED", "Edit session storage backend failed");
        c10186M26305.f32602.put("backendReason", exc.getClass().getSimpleName());
        return c10186M26305;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42478(C14069 c14069, String str, String str2, String str3) {
        C10186 c10186M26300 = C10186.m26300("WORKSPACE_ENTRY_UNSUPPORTED", "Workspace ZIP entry is not supported by this copy operation.");
        m42491(c10186M26300, c14069, str, str2);
        c10186M26300.f32602.put("backendReason", str3);
        return c10186M26300;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10186 m42437(C14069 c14069, String str, String str2) {
        C10186 c10186M26305 = C10186.m26305("WORKSPACE_ENTRY_TOO_LARGE", "Workspace ZIP entry exceeds the supported JSON integer range.");
        m42491(c10186M26305, c14069, str, str2);
        return c10186M26305;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C10186 m42521(C14069 c14069, String str, String str2) {
        C10186 c10186M26300 = C10186.m26300("FILE_OPERATION_STATE_UNKNOWN", "The workspace entry copy may have changed the edit session, but its final state is unknown.");
        m42491(c10186M26300, c14069, str, str2);
        c10186M26300.f32602.put("backendReason", "rollback_failed").put("changed", true).put("operationMode", "atomic").put("stateKnown", false);
        return c10186M26300;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42477(C14069 c14069, String str, String str2, Exception exc) {
        C10186 c10186M26305 = C10186.m26305("WORKSPACE_ENTRY_READ_FAILED", "Failed to read workspace ZIP entry.");
        m42491(c10186M26305, c14069, str, str2);
        c10186M26305.f32602.put("backendReason", exc.getClass().getSimpleName());
        return c10186M26305;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42491(C10186 c10186, C14069 c14069, String str, String str2) {
        c10186.f32602.put("workspaceId", c14069.f44556).put("editSessionId", str == null ? JSON.NULL : JSON.value(str)).put("entryName", str2);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m42586(C14069 c14069, String str) {
        Iterator it = c14069.f44532.iterator();
        while (it.hasNext()) {
            if (str.equals(((C19291) it.next()).f62362)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m42516(InputStream inputStream, int i) throws IOException {
        C9982 c9982 = new C9982(Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int i2 = inputStream.read(bArr, 0, Math.min(8192, i));
            if (i2 == -1) {
                break;
            }
            c9982.write(bArr, 0, i2);
            i -= i2;
        }
        byte[] bArr2 = c9982.f32079;
        int length = bArr2.length;
        int i3 = c9982.f32081;
        return length == i3 ? bArr2 : Arrays.copyOf(bArr2, i3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m42562() {
        return C10186.m26300("ENTRY_NOT_FOUND", "ZIP entry not found");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42479(C14069 c14069, String str, C6198 c6198) {
        boolean z;
        ArrayList arrayList = c6198.f21101;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if ("axml".equals(((C17384) it.next()).f56533)) {
                z = true;
                break;
            }
        }
        return m42480(c14069, str, true, z ? "EDIT_TEXT_PREPARE_FAILED_IN_SESSION" : "SMALI_COMPILE_FAILED_IN_SESSION", z ? "Saved edit session has AXML encode failures." : "Smali compile failed in saved edit session.", m42448(arrayList), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42480(C14069 c14069, String str, boolean z, String str2, String str3, JSONArray jSONArray, String str4, String str5) {
        JSONValue jSONValue;
        JSONObject jSONObjectObject = JSON.object();
        if (c14069 != null) {
            jSONObjectObject.add("workspaceId", c14069.f44556);
        }
        if (str != null) {
            jSONObjectObject.add("editSessionId", str);
        }
        if (str4 != null && str5 != null) {
            jSONObjectObject.add("locator", C4375.m13905(str4, str5));
        }
        if (jSONArray != null) {
            jSONObjectObject.add("overlaySaved", z).add("failures", jSONArray);
            if (str4 == null && jSONArray.size() > 0 && (jSONValue = jSONArray.get(0).asObject().get("locator")) != null && !jSONValue.isNull()) {
                jSONObjectObject.add("locator", jSONValue);
            }
        }
        return C10186.m26302(str2, str3, "fatal", JSON.array(), jSONObjectObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m42448(ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17384 c17384 = (C17384) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("locator", C4375.m13967(c17384.f56533, c17384.f56535)).add("className", c17384.f56532).add("dexEntryName", c17384.f56534).add("textHash", c17384.f56531).add("errorCode", c17384.f56539).add("message", c17384.f56536);
            Integer num = c17384.f56537;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c17384.f56538;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42443(C14069 c14069, AbstractC22044 abstractC22044, final C13061 c13061, String str) throws C10186 {
        final String strM42779 = C18326.m42779(str);
        if (m42565(abstractC22044, c13061, strM42779) != null || m42515(abstractC22044, c13061, strM42779)) {
            return 0;
        }
        C9793 c9793M42470 = m42470(c14069, c13061, str, strM42779);
        C17384 c17384 = c9793M42470.f31571;
        if (c17384 != null) {
            String str2 = c17384.f56536;
            Integer num = c17384.f56537;
            Integer num2 = c17384.f56538;
            try {
                ArrayList arrayListM42547 = m42547(abstractC22044);
                C1170.removeIf(arrayListM42547, new Predicate() { // from class: l.ۛ֫ۚ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C17384 c17385 = (C17384) obj;
                        C13061 c13062 = c13061;
                        if (c13062.f41797.equals(c17385.f56532) && c13062.f41796.equals(c17385.f56534)) {
                            return strM42779.equals(c17385.f56531);
                        }
                        return false;
                    }
                });
                String str3 = c13061.f41797;
                arrayListM42547.add(new C17384("smali_class", str3, str3, c13061.f41796, strM42779, "SMALI_COMPILE_FAILED_IN_SESSION", str2, num, num2));
                m42545(abstractC22044, arrayListM42547);
                return 0;
            } catch (IOException e) {
                throw m42473(e);
            }
        }
        try {
            m42503(abstractC22044, c13061, c9793M42470.f31570);
            try {
                ArrayList arrayListM42548 = m42547(abstractC22044);
                C1170.removeIf(arrayListM42548, new Predicate() { // from class: l.᩺֫ۚ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19025.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo7134negate() {
                        return C19025.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19025.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C17384 c17385 = (C17384) obj;
                        C13061 c13062 = c13061;
                        if (c13062.f41797.equals(c17385.f56532) && c13062.f41796.equals(c17385.f56534)) {
                            return strM42779.equals(c17385.f56531);
                        }
                        return false;
                    }
                });
                m42545(abstractC22044, arrayListM42548);
                return 1;
            } catch (IOException e2) {
                throw m42473(e2);
            }
        } catch (IOException e3) {
            throw m42473(e3);
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static String m42441(AbstractC22044 abstractC22044) throws C10186 {
        try {
            return new String(abstractC22044.m49865(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw m42473(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42504(AbstractC22044 abstractC22044, C18459 c18459) throws C10186 {
        C9375 c9375 = new C9375();
        c9375.m24691(c18459);
        char[] cArr = new char[8192];
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC22044.mo4290(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i == -1) {
                        c9375.m24688();
                        inputStreamReader.close();
                        return;
                    } else {
                        for (int i2 = 0; i2 < i; i2++) {
                            c9375.m24689(cArr[i2]);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw m42473(e);
            }
        } catch (IOException e) {
            throw m42473(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42572(AbstractC22044 abstractC22044) {
        if (abstractC22044.mo2934()) {
            abstractC22044.mo4296();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6198 m42466(C14069 c14069, AbstractC22044 abstractC22044, String str, String str2, String str3, String str4, String str5, String str6) throws C10186 {
        C2337 c2337;
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str2.split("\\n", -1);
        int length = strArrSplit.length;
        if (length > 0 && strArrSplit[length - 1].isEmpty()) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            String strM5124 = strArrSplit[i];
            if (strM5124.endsWith("\r")) {
                strM5124 = C1402.m5124(1, 0, strM5124);
            }
            arrayList.add(strM5124);
        }
        Iterator it = arrayList.iterator();
        String str7 = null;
        while (it.hasNext()) {
            String strM42451 = m42451((String) it.next());
            if (strM42451 != null) {
                if (str7 != null) {
                    throw C10186.m26300("SMALI_CLASS_MISMATCH", "Smali text must contain only one .class directive.");
                }
                str7 = strM42451;
            }
        }
        if (str7 == null) {
            throw C10186.m26300("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
        }
        if (!str.equals(str7)) {
            throw C10186.m26300("SMALI_CLASS_MISMATCH", "Smali .class descriptor does not match target class.");
        }
        String strM42454 = m42454(c14069, abstractC22044, str);
        C13061 c13061 = new C13061(strM42454, str);
        String strM42779 = C18326.m42779(str2);
        C18744 c18744M42565 = m42565(abstractC22044, c13061, strM42779);
        if (c18744M42565 == null) {
            C9793 c9793M42470 = m42470(c14069, c13061, str2, strM42779);
            C17384 c17384 = c9793M42470.f31571;
            if (c17384 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c17384);
                throw m42480(c14069, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; edit_text candidate was not saved.", m42448(arrayList2), str4, str5);
            }
            c2337 = c9793M42470.f31570;
        } else {
            c2337 = new C2337(strM42779, c18744M42565.f60902);
        }
        m42502(abstractC22044, new C8303("dex", str, strM42454, m42567(abstractC22044, c13061).mo4304()), str2.getBytes(StandardCharsets.UTF_8), (String) null, (C21266) null);
        try {
            m42503(abstractC22044, c13061, c2337);
        } catch (Exception e) {
            C20653.m47272("MT MCP text edit cache publish failed, editSessionId=".concat(str3), e);
        }
        return m42465(c14069, str3, str4, str5, str6, (C4156) null);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m42520(String str) throws C10186 {
        if (str == null || str.isEmpty()) {
            throw m42564(str);
        }
        String strM37840 = C15870.m37840(str);
        if (!strM37840.startsWith("L") || !strM37840.endsWith(l.b) || strM37840.length() <= 3 || strM37840.indexOf(92) >= 0 || strM37840.indexOf("..") >= 0 || strM37840.indexOf("//") >= 0 || strM37840.indexOf(91) >= 0 || strM37840.indexOf(40) >= 0 || strM37840.indexOf(41) >= 0 || strM37840.indexOf(59) != strM37840.length() - 1) {
            throw m42564(str);
        }
        String strM5124 = C1402.m5124(1, 1, strM37840);
        if (strM5124.startsWith("/") || strM5124.endsWith("/")) {
            throw m42564(str);
        }
        return strM37840;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m42564(String str) {
        return C10186.m26302("INVALID_SMALI_CLASS_DESCRIPTOR", "Invalid Smali class descriptor.", "fatal", JSON.array(), JSON.object().add("badValue", str == null ? JSON.NULL : JSON.value(str)));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C10186 m42527(String str) {
        return C10186.m26301("Invalid targetType", "targetType", JSON.value(str), JSON.array("smali_class", "smali_method", "axml", "zip_entry"), JSON.object().add("targetType", "zip_entry"));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m42541(String str) {
        if (str != null && str.length() == 8) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42471() {
        return C10186.m26305("EDIT_SESSION_STORAGE_FAILED", "Edit session overlay is corrupt.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m42473(Exception exc) {
        return C10186.m26305("EDIT_SESSION_STORAGE_FAILED", exc.getMessage() == null ? "Edit session storage failed." : exc.getMessage());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m42524() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8).toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42452(String str, int i, int i2, String str2) {
        C23504 c23504;
        if (str.isEmpty()) {
            c23504 = new C23504(new C16044[]{new C16044(str, 0, 0)});
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) == '\n') {
                    arrayList.add(new C16044(str, i3, i4));
                    i3 = i4 + 1;
                }
            }
            if (i3 < str.length()) {
                arrayList.add(new C16044(str, i3, str.length()));
            }
            c23504 = new C23504((C16044[]) arrayList.toArray(new C16044[0]));
        }
        int iM52693 = c23504.m52693();
        int iMax = Math.max(0, Math.min(i, iM52693));
        int iMax2 = Math.max(iMax, Math.min(i2, iM52693));
        if (iMax >= iMax2) {
            return C1173.m4319(str);
        }
        int length = iMax == iM52693 ? str.length() : c23504.m52694(iMax).f52046;
        int i5 = c23504.m52694(iMax2 - 1).f52045;
        if (i5 < str.length() && str.charAt(i5) == '\n') {
            i5++;
        }
        String strM4319 = C1173.m4319(str2);
        StringBuilder sb = new StringBuilder(strM4319.length() + (str.length() - (i5 - length)) + 1);
        sb.append((CharSequence) str, 0, length);
        if (!strM4319.isEmpty()) {
            sb.append(strM4319);
            if (i5 < str.length() && !strM4319.endsWith("\n")) {
                sb.append('\n');
            }
        }
        sb.append((CharSequence) str, i5, str.length());
        return C1173.m4319(sb.toString());
    }
}
