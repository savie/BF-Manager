package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
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

/* JADX INFO: renamed from: l.ܶۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes.dex */
public final class C14952 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final RuntimeException f48772;

    /* JADX INFO: renamed from: ܺ᩸ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f48773;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14578 f48774;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11040 f48775;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized HashMap m35866(C21956 c21956, String str) {
        HashMap map = new HashMap();
        if (m35723(str)) {
            return map;
        }
        for (C5966 c5966 : m35806(m35851(c21956, str)).values()) {
            map.put(c5966.f20323, c5966.f20320);
        }
        return map;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized C12317 m35867(C21956 c21956, String str, String str2) {
        if (m35723(str)) {
            return null;
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        if (m35850(abstractC20745M35851).contains(str2)) {
            throw m35833();
        }
        C5966 c5966 = (C5966) m35806(abstractC20745M35851).get(str2);
        if (c5966 != null && "zip_entry".equals(c5966.f20320)) {
            AbstractC20745 abstractC20745M46690 = m35859(abstractC20745M35851).m46690(C18810.m43407(str2)).m46690("data.bin");
            if (!abstractC20745M46690.mo33971()) {
                throw m35757(new IOException("ZIP entry overlay data is missing"));
            }
            return new C12317(abstractC20745M46690);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized String m35868(C21956 c21956, String str, String str2, C15283 c15283) {
        if (m35723(str)) {
            return this.f48774.m35048(c21956, str2, false, c15283).f66556;
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        C10906 c10906 = (C10906) m35745(abstractC20745M35851, c15283).get(str2);
        if (c10906 != null) {
            return m35814(m35839(abstractC20745M35851, c10906));
        }
        if (m35840(abstractC20745M35851, str2) != null) {
            throw C2664.m8197(c21956.f71244, str);
        }
        return this.f48774.m35048(c21956, str2, false, c15283).f66556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m35870(C21956 c21956, String str, boolean z, C15283 c15283) {
        if (m35723(str)) {
            return c21956.f71240;
        }
        if (!z) {
            m35826(c21956, str, c15283);
        }
        C3143 c3143M35747 = m35747(c21956, str, m35851(c21956, str), c15283);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C5032 c5032 : c21956.f71240) {
            if (!c3143M35747.f11854.contains(c5032.f17548) && !c3143M35747.f11853.containsKey(c5032.f17548)) {
                arrayList.add(c5032);
                hashSet.add(c5032.f17548);
            }
        }
        for (C10906 c10906 : c3143M35747.f11856.values()) {
            if (!c3143M35747.f11854.contains(c10906.f37095) && hashSet.add(c10906.f37095)) {
                arrayList.add(new C5032(c10906.f37096, -1, -1, c10906.f37095));
            }
        }
        C23846.sort(arrayList, C7618.comparing(new C7831(3)));
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5022 m35872(C21956 c21956, String str, String str2) {
        C14795 c14795;
        c14795 = new C14795();
        m35883(c21956, str, str2, c14795);
        return new C5022(c14795.toString(), "full_source", false, null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C6079 m35873(C21956 c21956, C2905 c2905) {
        AbstractC20745 abstractC20745M35851 = m35851(c21956, c2905.f10948);
        if (m35850(abstractC20745M35851).contains(c2905.f10950)) {
            throw m35833();
        }
        C5966 c5966 = (C5966) m35806(abstractC20745M35851).get(c2905.f10950);
        ArrayList arrayList = new ArrayList(c2905.f10949);
        C23846.sort(arrayList, C7618.comparingInt(new C23378()));
        m35841(arrayList);
        m35793(c21956, abstractC20745M35851, c5966, c2905.f10950);
        if (c5966 == null || !"zip_entry".equals(c5966.f20320)) {
            return m35751(c21956, abstractC20745M35851, c2905, arrayList);
        }
        return m35750(abstractC20745M35851, c2905, arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C8902 m35876(C21956 c21956, C0083 c0083, C15283 c15283) {
        AbstractC20745 abstractC20745M35851 = m35851(c21956, c0083.f991);
        if ("smali_class".equals(c0083.f992)) {
            return m35832(c21956, abstractC20745M35851, c0083);
        }
        if ("smali_method".equals(c0083.f992)) {
            return m35754(c21956, abstractC20745M35851, c0083, c15283);
        }
        if (!"axml".equals(c0083.f992) && !"zip_entry".equals(c0083.f992)) {
            throw m35819(c0083.f992);
        }
        return m35753(c21956, abstractC20745M35851, c0083);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public native synchronized C15958 m35877(C21956 c21956);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C15958 m35878(C21956 c21956, C23368 c23368, C15283 c15283) {
        AbstractC20745 abstractC20745M35851 = m35851(c21956, c23368.f75695);
        if ("smali_class".equals(c23368.f75694)) {
            return m35769(c21956, abstractC20745M35851, c23368, c15283);
        }
        if ("smali_method".equals(c23368.f75694)) {
            return m35836(c21956, abstractC20745M35851, c23368, c15283);
        }
        if (!"axml".equals(c23368.f75694) && !"zip_entry".equals(c23368.f75694)) {
            throw m35819(c23368.f75694);
        }
        return m35768(c21956, abstractC20745M35851, c23368);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C18779 m35879(C21956 c21956, String str) {
        AbstractC20745 abstractC20745M35851;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList<C15252> arrayListM35744;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayListM35850;
        String str2;
        abstractC20745M35851 = m35851(c21956, str);
        m35730(c21956, abstractC20745M35851, (C15283) null);
        C15958 c15958M35853 = m35853(c21956, str);
        if (c15958M35853.f51713 > 0) {
            throw m35763(c21956, str, c15958M35853);
        }
        ArrayList<C10906> arrayList6 = new ArrayList(m35813(abstractC20745M35851).values());
        C23846.sort(arrayList6, C21023.thenComparing(C7618.comparing(new C2915()), new C4554()));
        arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (C10906 c10906 : arrayList6) {
            String strM43407 = C18810.m43407(m35814(m35839(abstractC20745M35851, c10906)));
            C18666 c18666M35838 = m35838(abstractC20745M35851, c10906, strM43407);
            if (c18666M35838 == null) {
                throw m35763(c21956, str, m35853(c21956, str));
            }
            arrayList.add(new C21601(c10906.f37097, c10906.f37096, c18666M35838.f60590, strM43407));
            hashSet.add(c10906.f37096);
        }
        arrayList2 = new ArrayList();
        for (C20783 c20783 : m35863(abstractC20745M35851)) {
            String str3 = c20783.f67587;
            if (str3 == null || (str2 = c20783.f67588) == null) {
                throw m35755();
            }
            arrayList2.add(new C23013(str3, str2));
            hashSet.add(c20783.f67588);
        }
        C23846.sort(arrayList2, C21023.thenComparing(C7618.comparing(new C16485(3)), new C3105(3)));
        arrayList3 = new ArrayList(hashSet);
        C23846.sort(arrayList3, C2209.m6823());
        arrayListM35744 = m35744(c21956, abstractC20745M35851);
        arrayList4 = new ArrayList();
        arrayList5 = new ArrayList();
        for (C15252 c15252 : arrayListM35744) {
            if (c15252.f49726) {
                arrayList5.add(c15252.f49727);
            } else {
                arrayList4.add(c15252.f49727);
            }
        }
        arrayListM35850 = m35850(abstractC20745M35851);
        C23846.sort(arrayList4, new C20865());
        C23846.sort(arrayList5, new C20865());
        C23846.sort(arrayListM35850, new C20865());
        return new C18779(str, m35854(abstractC20745M35851).f51282, abstractC20745M35851.m46690("cache").m46690("dex_build"), arrayList, arrayList2, arrayList3, arrayListM35744, arrayList4, arrayList5, arrayListM35850);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C22744 m35881(C21956 c21956, C13135 c13135, OutputStream outputStream) {
        long jM35733;
        String str = c13135.f43742;
        m35726(str);
        m35716(c21956, c13135.f43740, str);
        C21488 c21488M35808 = m35808(c21956, c13135.f43740, str);
        String str2 = c13135.f43740;
        if (c21488M35808.f69818) {
            throw m35762(c21956, str2, str, "directory");
        }
        if (c21488M35808.f69816) {
            throw m35762(c21956, str2, str, "axml_entry");
        }
        if (m35723(str2)) {
            if (c21488M35808.f69817) {
                long jM35734 = m35733(c21956, c13135.f43740, str, outputStream);
                return new C22744(c21956.f71244, c13135.f43740, str, jM35734, null);
            }
            String str3 = c13135.f43740;
            C12731 c12731M31625 = C12731.m31625("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m35776(c12731M31625, c21956, str3, str);
            throw c12731M31625;
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, c13135.f43740);
        if (m35850(abstractC20745M35851).contains(str)) {
            String str4 = c13135.f43740;
            C12731 c12731M31626 = C12731.m31625("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
            m35776(c12731M31626, c21956, str4, str);
            throw c12731M31626;
        }
        C5966 c5966 = (C5966) m35806(abstractC20745M35851).get(str);
        int i = m35854(abstractC20745M35851).f51282;
        if (c5966 != null) {
            String str5 = c13135.f43740;
            AbstractC20745 abstractC20745M46690 = m35859(abstractC20745M35851).m46690(C18810.m43407(str)).m46690("data.bin");
            if ("axml".equals(c5966.f20320) || m35797(abstractC20745M46690, m35816(abstractC20745M46690))) {
                throw m35762(c21956, str5, str, "axml_entry");
            }
            String str6 = c13135.f43740;
            AbstractC20745 abstractC20745M46691 = m35859(abstractC20745M35851).m46690(C18810.m43407(str)).m46690("data.bin");
            m35816(abstractC20745M46691);
            try {
                try {
                    jM35733 = m35732(c21956, str6, str, abstractC20745M46691.mo33970(), outputStream);
                } catch (RuntimeException e) {
                    if (m35848(e)) {
                        throw m35761(c21956, str6, str, e);
                    }
                    throw e;
                }
            } catch (IOException e2) {
                throw m35761(c21956, str6, str, e2);
            }
        } else {
            if (!c21488M35808.f69817) {
                String str7 = c13135.f43740;
                C12731 c12731M31627 = C12731.m31625("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                m35776(c12731M31627, c21956, str7, str);
                throw c12731M31627;
            }
            jM35733 = m35733(c21956, c13135.f43740, str, outputStream);
        }
        String str8 = c13135.f43740;
        Integer numValueOf = Integer.valueOf(i);
        return new C22744(c21956.f71244, str8, str, jM35733, numValueOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C23719 m35882(C21956 c21956, C20545 c20545) {
        C1866 c1866M9760;
        try {
            AbstractC20745 abstractC20745M35851 = m35851(c21956, c20545.f66541);
            c1866M9760 = C3277.m9760(this.f48775.m27844(c21956, this, c20545.f66541), c20545);
            ArrayList arrayList = new ArrayList();
            for (C17763 c17763 : c1866M9760.f7089) {
                arrayList.add(new C9495(C22253.m49424(c17763.f56343), c17763));
            }
            this.f48775.m27843(c21956.f71244, c20545.f66541);
            try {
                m35782(abstractC20745M35851, arrayList);
                C4626.m12771(abstractC20745M35851);
            } catch (IOException e) {
                throw m35757(e);
            }
        } catch (C12731 e2) {
            e2.f42468.put("workspaceId", c21956.f71244).put("editSessionId", c20545.f66541);
            throw e2;
        }
        return new C23719(c21956.f71244, c20545.f66541, c1866M9760.f7090);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35883(C21956 c21956, String str, String str2, C14795 c14795) {
        c14795.m35465(0);
        if (!m35723(str)) {
            AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
            C17255 c17255M35837 = m35837(c21956, abstractC20745M35851, str2);
            if (c17255M35837.f54968 || "missing".equals(c17255M35837.f54969)) {
                throw m35833();
            }
            if (!"axml".equals(c17255M35837.f54969)) {
                throw C12731.m31625("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if (((C5966) m35806(abstractC20745M35851).get(str2)) != null) {
                m35787(m35859(abstractC20745M35851).m46690(C18810.m43407(str2)).m46690("text.xml"), c14795);
                return;
            }
        }
        m35846(c21956, str, str2, c14795);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final synchronized C16550 m35884(C21956 c21956, String str) {
        if (m35723(str)) {
            return null;
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        ArrayList arrayListM35831 = m35831(c21956, abstractC20745M35851);
        if (arrayListM35831.isEmpty()) {
            return null;
        }
        return new C16550(m35805(c21956, abstractC20745M35851, arrayListM35831));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m35885(C21956 c21956, String str) {
        if (m35723(str)) {
            return c21956.f71222;
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        HashSet hashSet = new HashSet(m35850(abstractC20745M35851));
        HashMap mapM35806 = m35806(abstractC20745M35851);
        boolean zIsEmpty = m35831(c21956, abstractC20745M35851).isEmpty();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (C9878 c9878 : c21956.f71222) {
            hashSet2.add(c9878.f33725);
            if (!hashSet.contains(c9878.f33725)) {
                C5966 c5966 = (C5966) mapM35806.get(c9878.f33725);
                if (c5966 != null) {
                    arrayList.add(C9878.m24971(c9878.f33725, m35736(abstractC20745M35851, c5966)));
                } else if (zIsEmpty || !"resources.arsc".equals(c9878.f33725)) {
                    arrayList.add(c9878);
                } else {
                    arrayList.add(C9878.m24971(c9878.f33725, null));
                }
            }
        }
        ArrayList<C5966> arrayList2 = new ArrayList();
        for (C5966 c5967 : mapM35806.values()) {
            if (!hashSet2.contains(c5967.f20323) && !hashSet.contains(c5967.f20323)) {
                arrayList2.add(c5967);
            }
        }
        C23846.sort(arrayList2, C7618.comparing(new C2437()));
        for (C5966 c5968 : arrayList2) {
            arrayList.add(C9878.m24971(c5968.f20323, m35736(abstractC20745M35851, c5968)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized C16550 m35886(C21956 c21956, String str, String str2) {
        try {
            if (m35723(str)) {
                return null;
            }
            AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
            if (m35850(abstractC20745M35851).contains(str2)) {
                throw m35833();
            }
            C5966 c5966 = (C5966) m35806(abstractC20745M35851).get(str2);
            if (c5966 == null) {
                return null;
            }
            if ("zip_entry".equals(c5966.f20320)) {
                try {
                    return new C16550(m35859(abstractC20745M35851).m46690(C18810.m43407(str2)).m46690("data.bin").m46727());
                } catch (IOException e) {
                    throw m35757(e);
                }
            }
            String strM35814 = m35814(m35859(abstractC20745M35851).m46690(C18810.m43407(str2)).m46690("text.xml"));
            String strM43407 = C18810.m43407(strM35814);
            C17960 c17960M35820 = m35820(abstractC20745M35851, str2, strM43407);
            if (c17960M35820 != null) {
                return new C16550(c17960M35820.f57449);
            }
            C19372 c19372M35770 = m35770(c21956, abstractC20745M35851.getName(), str2, strM35814, strM43407);
            C19485 c19485 = c19372M35770.f62436;
            if (c19485 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c19485);
                throw m35764(c21956, str, true, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed for saved edit session overlay.", m35734(arrayList), (String) null, (String) null);
            }
            try {
                m35780(abstractC20745M35851, str2, c19372M35770.f62435);
                return new C16550(c19372M35770.f62435.f1697);
            } catch (IOException e2) {
                throw m35757(e2);
            }
            throw th;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized int m35888(C21956 c21956, String str) {
        if (m35723(str)) {
            return 0;
        }
        return m35854(m35851(c21956, str)).f51282;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C4367 m35889(C21956 c21956, String str, C15283 c15283) {
        if (m35723(str)) {
            return new C4367(new ArrayList(c21956.f71221), new HashMap(), new HashSet());
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        C3143 c3143M35747 = m35747(c21956, str, abstractC20745M35851, c15283);
        ArrayList arrayListM35743 = m35743(c21956, c3143M35747);
        HashMap map = new HashMap();
        for (C10906 c10906 : c3143M35747.f11853.values()) {
            map.put(c10906.f37095, m35839(abstractC20745M35851, c10906));
        }
        return new C4367(arrayListM35743, map, new HashSet(c3143M35747.f11854));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C5022 m35890(C21956 c21956, String str, String str2) {
        if (!m35723(str)) {
            AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
            if (m35850(abstractC20745M35851).contains(str2)) {
                throw m35833();
            }
            C5966 c5966 = (C5966) m35806(abstractC20745M35851).get(str2);
            if (c5966 != null) {
                if ("axml".equals(c5966.f20320)) {
                    throw C2664.m8193(c21956.f71244, str, str2);
                }
                try {
                    InputStream inputStreamMo33970 = m35859(abstractC20745M35851).m46690(C18810.m43407(str2)).m46690("data.bin").mo33970();
                    try {
                        byte[] bArrM35802 = m35802(inputStreamMo33970, 10485776);
                        C5022 c5022M35748 = m35748(c21956, str, str2, bArrM35802, bArrM35802.length > 10485760);
                        if (inputStreamMo33970 != null) {
                            inputStreamMo33970.close();
                        }
                        return c5022M35748;
                    } catch (Throwable th) {
                        if (inputStreamMo33970 != null) {
                            try {
                                inputStreamMo33970.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw m35757(e);
                }
            }
        }
        return m35858(c21956, str, str2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C7807 m35891(C21956 c21956, String str, C5032 c5032, C15283 c15283) {
        if (m35723(str)) {
            return this.f48774.m35047(c21956, c5032, c15283);
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        C3143 c3143M35747 = m35747(c21956, str, abstractC20745M35851, c15283);
        C10906 c10906 = (C10906) c3143M35747.f11853.get(c5032.f17548);
        if (c10906 == null) {
            if (c3143M35747.f11854.contains(c5032.f17548)) {
                throw C2664.m8197(c21956.f71244, str);
            }
            return this.f48774.m35047(c21956, c5032, c15283);
        }
        String strM35814 = m35814(m35839(abstractC20745M35851, c10906));
        String strM43407 = C18810.m43407(strM35814);
        C18666 c18666M35838 = m35838(abstractC20745M35851, c10906, strM43407);
        if (c18666M35838 != null) {
            return c18666M35838.f60590;
        }
        m35729(c21956, abstractC20745M35851, c10906, strM35814);
        C18666 c18666M35839 = m35838(abstractC20745M35851, c10906, strM43407);
        if (c18666M35839 == null) {
            throw m35763(c21956, str, m35853(c21956, str));
        }
        return c18666M35839.f60590;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C20555 m35892(C21956 c21956, String str, String str2, C15283 c15283) {
        if (m35723(str)) {
            return this.f48774.m35048(c21956, str2, true, c15283);
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        C10906 c10906 = (C10906) m35745(abstractC20745M35851, c15283).get(str2);
        if (c10906 == null) {
            if (m35840(abstractC20745M35851, str2) != null) {
                throw C2664.m8197(c21956.f71244, str);
            }
            return this.f48774.m35048(c21956, str2, true, c15283);
        }
        String strM35814 = m35814(m35839(abstractC20745M35851, c10906));
        C7807 c7807M35875 = m35875(c21956, str, new C5032(c10906.f37096, -1, -1, c10906.f37095), c15283);
        return new C20555(strM35814, C22851.m50591(c7807M35875), C22851.m50580(c7807M35875));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m35893(C21956 c21956, String str) {
        if (m35723(str)) {
            return new ArrayList();
        }
        return m35831(c21956, m35851(c21956, str));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final synchronized void m35887(C21956 c21956, String str) {
        if (m35723(str)) {
            return;
        }
        try {
            AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
            C15845 c15845M35854 = m35854(abstractC20745M35851);
            int i = c15845M35854.f51282;
            m35845(abstractC20745M35851.m46690("state.json"), JSON.object().add("revision", i).add("createdAt", c15845M35854.f51281).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        } catch (IOException | RuntimeException | C12731 e) {
            C0577.m2747("MT MCP edit session build touch failed, workspaceId=" + c21956.f71244 + ", editSessionId=" + str, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C4398 m35871(C21956 c21956, C5728 c5728) {
        C14942 c14942;
        C14942 c14943;
        C17763 c17763M41328;
        try {
            AbstractC20745 abstractC20745M35851 = m35851(c21956, c5728.f19492);
            C20586 c20586M23852 = C9298.m23852(this.f48775.m27844(c21956, this, c5728.f19492), m35742(c5728));
            C14942 c14944 = c20586M23852.f67077;
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap map = new HashMap();
                for (C17763 c17763 : m35893(c21956, c5728.f19492)) {
                    map.put(c17763.f56350, c17763);
                }
                Iterator it = c20586M23852.f67078.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    C12120 c12120 = (C12120) it.next();
                    boolean zEquals = c12120.f40583.equals(c12120.f40585);
                    Iterator it2 = it;
                    c14943 = c14944;
                    try {
                        arrayList.add(new C3256(c12120.f40586, c12120.f40588, c12120.f40582, c12120.f40583, !zEquals));
                        if (zEquals) {
                            i2++;
                        } else {
                            i++;
                            int i3 = (int) Long.parseLong(c12120.f40588.substring(2), 16);
                            if (c12120.f40583.equals(c12120.f40584)) {
                                arrayList2.add(new C9495(C22253.m49424(C17763.m41324(i3, c12120.f40582)), null));
                            } else {
                                C17763 c17764 = (C17763) map.get(C22253.m49424(C17763.m41324(i3, c12120.f40582)));
                                if (c17764 == null) {
                                    c17763M41328 = C17763.m41326(i3, c12120.f40582, c12120.f40585, c12120.f40583, c12120.f40587);
                                } else {
                                    c17763M41328 = c17764.m41328(c12120.f40585, c12120.f40587, c12120.f40583);
                                }
                                arrayList2.add(new C9495(C22253.m49424(c17763M41328.f56343), c17763M41328));
                            }
                        }
                        it = it2;
                        c14944 = c14943;
                    } catch (C12731 e) {
                        e = e;
                        c14942 = c14943;
                        m35775(e, c21956.f71244, c5728, c14942);
                        throw e;
                    }
                }
                if (i == 0) {
                    return new C4398(c21956.f71244, c5728.f19492, false, 0, i2, arrayList);
                }
                try {
                    this.f48775.m27843(c21956.f71244, c5728.f19492);
                    m35782(abstractC20745M35851, arrayList2);
                    C4626.m12771(abstractC20745M35851);
                    return new C4398(c21956.f71244, c5728.f19492, true, i, i2, arrayList);
                } catch (IOException e2) {
                    throw m35757(e2);
                }
            } catch (C12731 e3) {
                e = e3;
                c14943 = c14944;
            }
        } catch (C12731 e4) {
            e = e4;
            c14942 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c5 A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ca A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01d2 A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0204 A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0208 A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x021b A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0196 A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:93:0x019f A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01be A[Catch: all -> 0x024c, TryCatch #4 {all -> 0x024c, blocks: (B:45:0x0136, B:46:0x013a, B:111:0x01ea, B:89:0x0190, B:91:0x0196, B:93:0x019f, B:96:0x01a6, B:97:0x01b8, B:99:0x01be, B:100:0x01c4, B:101:0x01c5, B:102:0x01c9, B:103:0x01ca, B:107:0x01d2, B:110:0x01d9, B:114:0x01fe, B:116:0x0204, B:118:0x0208, B:122:0x021a, B:121:0x0216, B:123:0x021b, B:124:0x0221, B:127:0x0225, B:129:0x022b, B:130:0x0231, B:131:0x0232, B:132:0x0234, B:139:0x024a, B:55:0x014a, B:56:0x0151, B:57:0x0152, B:58:0x015c, B:133:0x0235, B:134:0x023d, B:135:0x023e, B:136:0x0246), top: B:144:0x000d }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C22744 m35880(C21956 c21956, C3961 c3961, InterfaceC18428 interfaceC18428) throws Throwable {
        int i;
        boolean z;
        long jM35731;
        boolean z2;
        int iM35728;
        IOException iOException;
        C12731 c12731;
        try {
            try {
                String str = c3961.f14723;
                m35726(str);
                AbstractC20745 abstractC20745M35851 = m35851(c21956, c3961.f14721);
                m35716(c21956, c3961.f14721, str);
                C21488 c21488M35808 = m35808(c21956, c3961.f14721, str);
                String str2 = c3961.f14721;
                if (c21488M35808.f69818) {
                    throw m35762(c21956, str2, str, "directory");
                }
                if (!c21488M35808.f69816) {
                    boolean zContains = m35850(abstractC20745M35851).contains(str);
                    C5966 c5966 = (C5966) m35806(abstractC20745M35851).get(str);
                    if (c5966 != null) {
                        String str3 = c3961.f14721;
                        AbstractC20745 abstractC20745M46690 = m35859(abstractC20745M35851).m46690(C18810.m43407(str)).m46690("data.bin");
                        if ("axml".equals(c5966.f20320) || m35797(abstractC20745M46690, m35816(abstractC20745M46690))) {
                            throw m35762(c21956, str3, str, "axml_entry");
                        }
                    }
                    if (!zContains && ((c5966 != null || c21488M35808.f69817) && !c3961.f14722)) {
                        String str4 = c3961.f14721;
                        C12731 c12731M31623 = C12731.m31623(null, "FILE_ALREADY_EXISTS", "Workspace ZIP entry already exists.", "warning");
                        m35776(c12731M31623, c21956, str4, str);
                        throw c12731M31623;
                    }
                    C7377 c7377 = new C7377(Entry.DEFAULT_NAME, str, null, c5966 != null);
                    int i2 = m35854(abstractC20745M35851).f51282;
                    try {
                        try {
                            AbstractC20745 abstractC20745M35771 = m35771(abstractC20745M35851);
                            AbstractC20745 abstractC20745M46691 = abstractC20745M35771.m46690("overlay.next");
                            abstractC20745M46691.m46739();
                            i = i2;
                            try {
                                abstractC20745M46691.m46690("meta.json").m46703(JSON.object().add("targetType", "zip_entry").add("entryName", str).add("encoding", C22037.f71424).add("lineEnding", "lf").toString().getBytes(StandardCharsets.UTF_8));
                                jM35731 = m35731(abstractC20745M46691.m46690("data.bin"), interfaceC18428, c21956, c3961.f14721, str);
                                try {
                                    try {
                                        try {
                                            if (m35797(abstractC20745M46691.m46690("data.bin"), jM35731)) {
                                                throw m35762(c21956, c3961.f14721, str, "axml_entry");
                                            }
                                            interfaceC18428.mo1685(jM35731);
                                            m35784(abstractC20745M35851, c7377, abstractC20745M35771);
                                            AbstractC20745 abstractC20745M35719 = m35719(abstractC20745M35851, str);
                                            abstractC20745M35719.mo46720();
                                            if (abstractC20745M35719.mo33975() || !abstractC20745M46691.mo24646(abstractC20745M35719)) {
                                                throw new IOException("Unable to publish ZIP entry overlay");
                                            }
                                            AbstractC20745 abstractC20745M35821 = m35821(abstractC20745M35851, str);
                                            if (abstractC20745M35821.mo33975()) {
                                                abstractC20745M35821.mo24647();
                                            }
                                            ArrayList arrayListM35850 = m35850(abstractC20745M35851);
                                            arrayListM35850.remove(str);
                                            m35721(abstractC20745M35851, arrayListM35850);
                                            m35860(abstractC20745M35851, str);
                                            iM35728 = m35728(abstractC20745M35851, m35854(abstractC20745M35851));
                                            try {
                                                m35844(abstractC20745M35851, c7377);
                                            } catch (IOException e) {
                                                e = e;
                                                z2 = true;
                                                if (z2) {
                                                    C0577.m2747("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c3961.f14721, e);
                                                }
                                                if (!m35798(abstractC20745M35851, e)) {
                                                    throw m35828(c21956, c3961.f14721, str);
                                                }
                                                if (e instanceof C12731) {
                                                    c12731 = (C12731) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c12731.f42472)) {
                                                        throw c12731;
                                                    }
                                                }
                                                throw m35818(e);
                                            } catch (RuntimeException e2) {
                                                e = e2;
                                                z = true;
                                                if (!m35848(e)) {
                                                    throw e;
                                                }
                                                iOException = new IOException("Edit session storage backend failed", e);
                                                if (z) {
                                                    C0577.m2747("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c3961.f14721, e);
                                                }
                                                if (!m35798(abstractC20745M35851, iOException)) {
                                                    throw m35828(c21956, c3961.f14721, str);
                                                }
                                                throw m35818(e);
                                            } catch (C12731 e3) {
                                                e = e3;
                                                z2 = true;
                                                if (z2) {
                                                    C0577.m2747("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c3961.f14721, e);
                                                }
                                                if (!m35798(abstractC20745M35851, e)) {
                                                    throw m35828(c21956, c3961.f14721, str);
                                                }
                                                if (e instanceof C12731) {
                                                    c12731 = (C12731) e;
                                                    if (!"EDIT_SESSION_STORAGE_FAILED".equals(c12731.f42472)) {
                                                        throw c12731;
                                                    }
                                                }
                                                throw m35818(e);
                                            }
                                            m35829(abstractC20745M35851);
                                            return new C22744(c21956.f71244, c3961.f14721, str, jM35731, Integer.valueOf(iM35728));
                                        } catch (C12835 e4) {
                                            e = e4;
                                            if (!m35798(abstractC20745M35851, e)) {
                                                throw m35828(c21956, c3961.f14721, str);
                                            }
                                            throw e.f42708;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        z2 = false;
                                        iM35728 = i;
                                    } catch (RuntimeException e6) {
                                        e = e6;
                                        z = false;
                                        iM35728 = i;
                                        if (!m35848(e)) {
                                            throw e;
                                        }
                                        iOException = new IOException("Edit session storage backend failed", e);
                                        if (z && m35799(abstractC20745M35851, c7377, iOException)) {
                                            C0577.m2747("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c3961.f14721, e);
                                            m35829(abstractC20745M35851);
                                            return new C22744(c21956.f71244, c3961.f14721, str, jM35731, Integer.valueOf(iM35728));
                                        }
                                        if (!m35798(abstractC20745M35851, iOException)) {
                                            throw m35828(c21956, c3961.f14721, str);
                                        }
                                        throw m35818(e);
                                    } catch (C12731 e7) {
                                        e = e7;
                                        z2 = false;
                                        iM35728 = i;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                } catch (RuntimeException e9) {
                                    e = e9;
                                } catch (C12731 e10) {
                                    e = e10;
                                }
                                z2 = false;
                            } catch (IOException e11) {
                                e = e11;
                                z2 = false;
                                jM35731 = 0;
                            } catch (RuntimeException e12) {
                                e = e12;
                                z = false;
                                jM35731 = 0;
                                iM35728 = i;
                                if (!m35848(e)) {
                                    throw e;
                                }
                                iOException = new IOException("Edit session storage backend failed", e);
                                if (z) {
                                    C0577.m2747("MT MCP workspace entry copy commit completed after backend error, editSessionId=" + c3961.f14721, e);
                                    m35829(abstractC20745M35851);
                                    return new C22744(c21956.f71244, c3961.f14721, str, jM35731, Integer.valueOf(iM35728));
                                }
                                if (!m35798(abstractC20745M35851, iOException)) {
                                    throw m35828(c21956, c3961.f14721, str);
                                }
                                throw m35818(e);
                            } catch (C12731 e13) {
                                e = e13;
                                z2 = false;
                                jM35731 = 0;
                            }
                        } catch (C12835 e14) {
                            e = e14;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        i = i2;
                        z2 = false;
                        jM35731 = 0;
                        iM35728 = i;
                        if (z2) {
                            C0577.m2747("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c3961.f14721, e);
                            m35829(abstractC20745M35851);
                            return new C22744(c21956.f71244, c3961.f14721, str, jM35731, Integer.valueOf(iM35728));
                        }
                        if (!m35798(abstractC20745M35851, e)) {
                            throw m35828(c21956, c3961.f14721, str);
                        }
                        if (e instanceof C12731) {
                            c12731 = (C12731) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c12731.f42472)) {
                                throw c12731;
                            }
                        }
                        throw m35818(e);
                    } catch (RuntimeException e16) {
                        e = e16;
                        i = i2;
                    } catch (C12731 e17) {
                        e = e17;
                        i = i2;
                        z2 = false;
                        jM35731 = 0;
                        iM35728 = i;
                        if (z2) {
                            C0577.m2747("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c3961.f14721, e);
                            m35829(abstractC20745M35851);
                            return new C22744(c21956.f71244, c3961.f14721, str, jM35731, Integer.valueOf(iM35728));
                        }
                        if (!m35798(abstractC20745M35851, e)) {
                            throw m35828(c21956, c3961.f14721, str);
                        }
                        if (e instanceof C12731) {
                            c12731 = (C12731) e;
                            if (!"EDIT_SESSION_STORAGE_FAILED".equals(c12731.f42472)) {
                                throw c12731;
                            }
                        }
                        throw m35818(e);
                    }
                    iM35728 = i;
                    if (z2 && m35799(abstractC20745M35851, c7377, e)) {
                        C0577.m2747("MT MCP workspace entry copy commit completed after storage error, editSessionId=" + c3961.f14721, e);
                        m35829(abstractC20745M35851);
                        return new C22744(c21956.f71244, c3961.f14721, str, jM35731, Integer.valueOf(iM35728));
                    }
                    if (!m35798(abstractC20745M35851, e)) {
                        throw m35828(c21956, c3961.f14721, str);
                    }
                    if (e instanceof C12731) {
                        c12731 = (C12731) e;
                        if (!"EDIT_SESSION_STORAGE_FAILED".equals(c12731.f42472)) {
                            throw c12731;
                        }
                    }
                    throw m35818(e);
                }
                throw m35762(c21956, str2, str, "axml_entry");
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static {
        ApplicationC6132.m17119(131);
        f48773 = new short[]{5670, 1360, 1371, 1298, 1369, 1372, 1353, 1372, 1298, 1368, 1369, 1364, 1353, 1378, 1358, 1368, 1358, 1358, 1364, 1362, 1363, 1358, 1400, 1401, 1396, 1385, 1378, 1390, 1400, 1390, 1390, 1396, 1394, 1395, 1378, 1406, 1391, 1400, 1404, 1385, 1400, 1378, 1403, 1404, 1396, 1393, 1400, 1401, 1384, 1363, 1372, 1375, 1361, 1368, 1309, 1353, 1362, 1309, 1372, 1361, 1361, 1362, 1374, 1372, 1353, 1368, 1309, 1368, 1369, 1364, 1353, 1309, 1358, 1368, 1358, 1358, 1364, 1362, 1363, 1309, 1364, 1369, 1392, 1385, 1309, 1392, 1406, 1389, 1309, 1368, 1369, 1364, 1353, 1309, 1358, 1368, 1358, 1358, 1364, 1362, 1363, 1309, 1359, 1362, 1361, 1361, 1375, 1372, 1374, 1366, 1309, 1369, 1368, 1361, 1368, 1353, 1368, 1309, 1371, 1372, 1364, 1361, 1368, 1369, 1297, 1309, 1368, 1369, 1364, 1353, 1390, 1368, 1358, 1358, 1364, 1362, 1363, 1396, 1369, 1280, 1392, 1385, 1309, 1392, 1406, 1389, 1309, 1368, 1369, 1364, 1353, 1309, 1358, 1368, 1358, 1358, 1364, 1362, 1363, 1309, 1359, 1362, 1361, 1361, 1375, 1372, 1374, 1366, 1309, 1369, 1368, 1361, 1368, 1353, 1368, 1309, 1371, 1372, 1364, 1361, 1368, 1369, 1297, 1309, 1368, 1369, 1364, 1353, 1390, 1368, 1358, 1358, 1364, 1362, 1363, 1396, 1369, 1280};
        f48772 = new RuntimeException();
    }

    public C14952(C14578 c14578, C11040 c11040, C6433 c6433) {
        this.f48774 = c14578;
        this.f48775 = c11040;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m35723(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m35727(AbstractC20745 abstractC20745) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        abstractC20745.m46739();
        abstractC20745.m46690("overlay").m46690("dex").m46739();
        m35859(abstractC20745).m46739();
        abstractC20745.m46690("overlay").m46690("resource_value").m46739();
        abstractC20745.m46690("cache").m46690("dex").m46739();
        abstractC20745.m46690("cache").m46690(Entry.DEFAULT_NAME).m46739();
        abstractC20745.m46690("cache").m46690("dex_build").m46739();
        abstractC20745.m46690("deleted").m46739();
        abstractC20745.m46690("failures").m46739();
        m35825(abstractC20745, new ArrayList());
        m35721(abstractC20745, new ArrayList());
        m35861(abstractC20745, new ArrayList());
        m35809(abstractC20745, new ArrayList());
        m35845(abstractC20745.m46690("state.json"), JSON.object().add("revision", 0).add("createdAt", jCurrentTimeMillis).add("lastAccessedAt", jCurrentTimeMillis).toString().getBytes(StandardCharsets.UTF_8), ".state");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35718(AbstractC20745 abstractC20745) {
        ArrayList arrayList = new ArrayList();
        if (abstractC20745.mo33974()) {
            for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
                if (abstractC20746.mo33974() && !abstractC20746.m46723() && m35717(abstractC20746.getName())) {
                    arrayList.add(new C20078(m35815(abstractC20746), abstractC20746, abstractC20746.getName()));
                }
            }
        }
        C23846.sort(arrayList, C21023.thenComparing(C7618.comparingLong(new C1026()), new C13022()));
        int size = arrayList.size() - 9;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C20078) arrayList.get(i)).f65224);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35792(C21956 c21956, ArrayList arrayList) throws IOException {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
            this.f48775.m27843(c21956.f71244, abstractC20745.getName());
            if (abstractC20745.mo33975()) {
                m35824(abstractC20745);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m35824(AbstractC20745 abstractC20745) throws IOException {
        if (abstractC20745.mo33975()) {
            if (abstractC20745.mo33974() && !abstractC20745.m46723()) {
                Iterator it = abstractC20745.mo33983(true).iterator();
                while (it.hasNext()) {
                    m35824((AbstractC20745) it.next());
                }
            }
            if (abstractC20745.mo33975() && !abstractC20745.mo24647()) {
                throw new IOException(C17922.m41615(abstractC20745, new StringBuilder("Unable to delete ")));
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35742(C5728 c5728) {
        ArrayList arrayList = c5728.f19494;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C17017 c17017 = (C17017) arrayList.get(i);
            arrayList2.add(new C16353(i, c17017.f54371, c17017.f54370, c17017.f54373, c17017.f54372));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35841(ArrayList arrayList) throws C12731 {
        Iterator it = arrayList.iterator();
        C9257 c9257 = null;
        while (it.hasNext()) {
            C9257 c9258 = (C9257) it.next();
            if (c9257 != null && c9257.m23782() > c9258.f31470) {
                long j = c9257.f31470;
                throw C12731.m31627("PATCH_OVERLAP", "Patch ranges must not overlap.", "warning", JSON.array(), JSON.object().add("firstRange", JSON.object().add("byteOffset", j).add("endByteOffset", c9257.m23782())).add("secondRange", JSON.object().add("byteOffset", c9258.f31470).add("endByteOffset", c9258.m23782())));
            }
            c9257 = c9258;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35793(C21956 c21956, AbstractC20745 abstractC20745, C5966 c5966, String str) throws C12731 {
        if ("resources.arsc".equals(str)) {
            throw m35758(str, "resources_arsc");
        }
        if (c21956.f71224.contains(str) || str.toLowerCase(Locale.ROOT).endsWith(".dex")) {
            throw m35758(str, "dex_entry");
        }
        if (c5966 != null && "axml".equals(c5966.f20320)) {
            throw m35758(str, "axml_entry");
        }
        if (c5966 != null && !"zip_entry".equals(c5966.f20320)) {
            throw m35758(str, "not_raw_zip_entry");
        }
        if (c5966 != null && !m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("data.bin").mo33971()) {
            throw m35758(str, "not_raw_zip_entry");
        }
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2455.getEntry(str);
                if (entry == null) {
                    if (c5966 == null) {
                        throw m35833();
                    }
                } else {
                    if (entry.isDirectory()) {
                        throw m35758(str, "directory");
                    }
                    if (m35801(c21956, c2455, entry, str)) {
                        throw m35758(str, "axml_entry");
                    }
                }
                c2455.close();
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw m35757(new IOException("Failed to inspect ZIP entry for patch.", e2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6079 m35750(AbstractC20745 abstractC20745, C2905 c2905, ArrayList arrayList) throws C12731 {
        String str = c2905.f10950;
        AbstractC20745 abstractC20745M46690 = m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("data.bin");
        long jMo33964 = abstractC20745M46690.mo33964();
        m35774(arrayList, jMo33964);
        ArrayList arrayList2 = new ArrayList();
        try {
            C1388 c1388M46710 = abstractC20745M46690.m46710("rw");
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C9257 c9257 = (C9257) it.next();
                    byte[] bArr = c9257.f31472;
                    int i = c9257.f31470;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    c1388M46710.seek(i);
                    c1388M46710.m4864(bArr2, 0, length);
                    if (!Arrays.equals(bArr2, c9257.f31472)) {
                        throw m35760(c2905, c9257, bArr2);
                    }
                    arrayList2.add(new C14434(i, bArr2, c9257.f31471));
                    throw e;
                }
                c1388M46710.close();
                try {
                    m35715(abstractC20745M46690, arrayList2);
                    AbstractC20745 abstractC20745M35821 = m35821(abstractC20745, str);
                    if (abstractC20745M35821.mo33975()) {
                        abstractC20745M35821.mo24647();
                    }
                    m35860(abstractC20745, str);
                    ArrayList arrayListM35850 = m35850(abstractC20745);
                    arrayListM35850.remove(str);
                    m35721(abstractC20745, arrayListM35850);
                    m35728(abstractC20745, m35854(abstractC20745));
                    return m35749(c2905, jMo33964, arrayList2, m35854(abstractC20745).f51282);
                } catch (Exception e) {
                    IOException iOException = new IOException("Failed to patch ZIP entry overlay.", e);
                    try {
                        m35843(abstractC20745M46690, arrayList2);
                    } catch (IOException e2) {
                        iOException.addSuppressed(e2);
                    }
                    throw m35757(iOException);
                }
            } catch (Throwable th) {
                try {
                    c1388M46710.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12731 e3) {
            throw e3;
        } catch (Exception e4) {
            throw m35757(new IOException("Failed to read ZIP entry overlay for patch.", e4));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6079 m35751(C21956 c21956, AbstractC20745 abstractC20745, C2905 c2905, ArrayList arrayList) throws C12731 {
        C22713 c22713;
        String str = c2905.f10950;
        try {
            c22713 = m35823(c21956, abstractC20745, str);
        } catch (C12731 e) {
            String str2 = e.f42472;
            if (!"NOT_TEXT_ENTRY".equals(str2) && !"ENTRY_TEXT_TOO_LARGE".equals(str2)) {
                throw e;
            }
            c22713 = new C22713(C22037.f71424, "lf");
        }
        AbstractC20745 abstractC20745M46688 = abstractC20745.m46688(".patch_bytes");
        try {
            try {
                try {
                    C2455 c2455 = new C2455(c21956.m48787());
                    try {
                        C12107 entry = c2455.getEntry(str);
                        if (entry == null) {
                            throw m35833();
                        }
                        long size = entry.getSize();
                        if (size >= 0) {
                            m35774(arrayList, size);
                        }
                        abstractC20745M46688.mo46720();
                        InputStream inputStreamM7471 = c2455.m7471(entry);
                        try {
                            OutputStream outputStreamMo33976 = abstractC20745M46688.mo33976(false);
                            try {
                                C23606 c23606M35773 = m35773(inputStreamM7471, outputStreamMo33976, c2905, arrayList);
                                ArrayList arrayList2 = c23606M35773.f76472;
                                long j = c23606M35773.f76471;
                                if (outputStreamMo33976 != null) {
                                    outputStreamMo33976.close();
                                }
                                inputStreamM7471.close();
                                if (size < 0) {
                                    m35774(arrayList, j);
                                }
                                m35781(abstractC20745, str, abstractC20745M46688, c22713);
                                c2455.close();
                                m35842(abstractC20745M46688);
                                return m35749(c2905, j, arrayList2, m35854(abstractC20745).f51282);
                            } catch (Throwable th) {
                                if (outputStreamMo33976 != null) {
                                    try {
                                        outputStreamMo33976.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                inputStreamM7471.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            c2455.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    m35842(abstractC20745M46688);
                    throw th7;
                }
            } catch (C12731 e2) {
                m35842(abstractC20745M46688);
                throw e2;
            }
        } catch (Exception e3) {
            m35842(abstractC20745M46688);
            throw m35757(new IOException("Failed to patch ZIP entry.", e3));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35774(ArrayList arrayList, long j) throws C12731 {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9257 c9257 = (C9257) it.next();
            long jM23782 = c9257.m23782();
            long j2 = c9257.f31470;
            if (jM23782 < j2 || jM23782 > j) {
                throw m35756(j2, jM23782, j);
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m35715(AbstractC20745 abstractC20745, ArrayList arrayList) throws IOException {
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14434 c14434 = (C14434) it.next();
                c1388M46710.seek(c14434.f47314);
                c1388M46710.write(c14434.f47313);
            }
            c1388M46710.m4869();
            c1388M46710.close();
        } catch (Throwable th) {
            try {
                c1388M46710.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35843(AbstractC20745 abstractC20745, ArrayList arrayList) throws IOException {
        C1388 c1388M46710 = abstractC20745.m46710("rw");
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14434 c14434 = (C14434) it.next();
                c1388M46710.seek(c14434.f47314);
                byte[] bArr = c14434.f47315;
                c1388M46710.write(bArr, 0, bArr.length);
            }
            c1388M46710.m4869();
            c1388M46710.close();
        } catch (Throwable th) {
            try {
                c1388M46710.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23606 m35773(InputStream inputStream, OutputStream outputStream, C2905 c2905, ArrayList arrayList) throws C12731, IOException {
        int i = 8192;
        byte[] bArr = new byte[8192];
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C9257 c9257 = (C9257) it.next();
            int i2 = c9257.f31470;
            byte[] bArr2 = c9257.f31471;
            byte[] bArr3 = c9257.f31472;
            long j2 = i2;
            long j3 = j;
            while (j3 < j2) {
                long j4 = i;
                int i3 = i2;
                int i4 = inputStream.read(bArr, 0, (int) Math.min(j4, j2 - j3));
                if (i4 < 0) {
                    throw m35756(i3, c9257.m23782(), j3);
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
                    throw m35756(i5, c9257.m23782(), j3 + ((long) i6));
                }
                i6 += i7;
            }
            long j5 = j3 + ((long) length);
            if (!Arrays.equals(bArr4, bArr3)) {
                throw m35760(c2905, c9257, bArr4);
            }
            outputStream.write(bArr2);
            arrayList2.add(new C14434(i5, bArr4, bArr2));
            i = 8192;
            j = j5;
        }
        while (true) {
            int i8 = inputStream.read(bArr);
            if (i8 < 0) {
                return new C23606(arrayList2, j);
            }
            outputStream.write(bArr, 0, i8);
            j += (long) i8;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6079 m35749(C2905 c2905, long j, ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            C14434 c14434 = (C14434) it.next();
            byte[] bArr = c14434.f47313;
            length += bArr.length;
            arrayList2.add(new C17368(c14434.f47314, c14434.f47315, bArr));
        }
        return new C6079(c2905.f10947, c2905.f10948, c2905.f10950, j, length, i, arrayList2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35758(String str, String str2) {
        return C12731.m31627("PATCH_UNSUPPORTED_ENTRY", "ZIP entry cannot be patched as raw bytes.", "fatal", JSON.array(), C3184.m9603("entryName", str, "reason", str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35756(long j, long j2, long j3) {
        return C12731.m31627("PATCH_RANGE_OUT_OF_ENTRY", "Patch range is outside the ZIP entry.", "warning", JSON.array(), JSON.object().add("byteOffset", j).add("endByteOffset", j2).add("entrySize", j3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35760(C2905 c2905, C9257 c9257, byte[] bArr) {
        JSONArray jSONArrayArray = JSON.array();
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c2905.f10947).add("editSessionId", c2905.f10948).add("locator", C17638.m41044("zip_entry", c2905.f10950, (String) null, (String) null, (String) null, (String) null));
        int i = c9257.f31470;
        return C12731.m31627("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", jSONArrayArray.add(C11320.m28376(jSONObjectAdd.add("byteOffset", i).add("maxBytes", bArr.length), "mt_apk_read_bytes", "retry", "Read actual bytes at the mismatched patch window before retrying mt_apk_patch_bytes.")), JSON.object().add("byteOffset", i).add("expectedHex", m35741(c9257.f31472)).add("actualHex", m35741(bArr)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35741(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.ROOT, "%02X", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m35805(C21956 c21956, AbstractC20745 abstractC20745, ArrayList arrayList) throws C12731 {
        if (!c21956.f71225) {
            throw C12731.m31630("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
        }
        C7886 c7886 = c21956.f71229;
        if (c7886 == null) {
            String str = c21956.f71237;
            if (str == null) {
                str = "Failed to parse resources.arsc";
            }
            throw C12731.m31630("RESOURCE_TABLE_PARSE_FAILED", str);
        }
        byte[] bArrM41325 = C17763.m41325(arrayList, c7886.m20807());
        try {
            byte[] bArrM12773 = C4626.m12773(abstractC20745, bArrM41325);
            if (bArrM12773 != null) {
                return bArrM12773;
            }
            C22785 c22785M50435 = C22785.m50435(c7886.m20809(), EnumC6556.CREATE);
            Iterator it = C17763.m41319(arrayList).iterator();
            while (it.hasNext()) {
                C1098.m4101(c22785M50435, (C17763) it.next());
            }
            c22785M50435.m50445();
            C11018 c11018 = new C11018((int) Math.min(2147483647L, c7886.m20808() + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS));
            c22785M50435.m50441(c11018, (C8516) null);
            byte[] bArrM27773 = c11018.m27773();
            try {
                C4626.m12772(abstractC20745, bArrM41325, bArrM27773);
            } catch (IOException unused) {
            }
            return bArrM27773;
        } catch (OutOfMemoryError unused2) {
            throw C2664.m8203();
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw C12731.m31630("RESOURCE_COMPILE_FAILED", e2.getMessage() == null ? "Failed to materialize resources.arsc" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35845(AbstractC20745 abstractC20745, byte[] bArr, String str) {
        abstractC20745.mo46720();
        AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(str);
        try {
            abstractC20745M46733.m46703(bArr);
            abstractC20745M46733.m46702(abstractC20745, false, true, null);
        } finally {
            m35842(abstractC20745M46733);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m35803(C7377 c7377, String str) {
        JSONObject jSONObjectAdd = JSON.object().add("schemaVersion", 1).add("phase", str).add("targetKind", c7377.f24462).add("target", c7377.f24468);
        String str2 = c7377.f24467;
        return jSONObjectAdd.add("dexEntryName", str2 == null ? JSON.NULL : JSON.value(str2)).add("overlayExisted", c7377.f24463).add("deletedExisted", c7377.f24464).add("failuresExisted", c7377.f24466).add("stateExisted", c7377.f24465).toString().getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35790(AbstractC20745 abstractC20745, byte[] bArr, String str) {
        abstractC20745.mo46720();
        AbstractC20745 abstractC20745M46733 = abstractC20745.m46733(str);
        try {
            abstractC20745M46733.mo33989().mo8393();
            abstractC20745M46733.m46703(bArr);
            abstractC20745M46733.mo33989().mo8391(abstractC20745);
        } finally {
            m35842(abstractC20745M46733);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35788(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, AbstractC20745 abstractC20747) throws IOException {
        for (C5928 c5928 : abstractC20745.mo33989().mo8397()) {
            String name = c5928.m16195().getName();
            if (!"transaction.json".equals(name) && !"committed".equals(name)) {
                m35824(c5928.m16195());
            }
        }
        m35824(abstractC20746);
        m35824(abstractC20747);
        if (abstractC20745.mo33975() && !abstractC20745.mo24647()) {
            throw new IOException("Unable to delete committed transaction directory");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C7377 m35807(AbstractC20745 abstractC20745, String str) throws IOException {
        JSONObject jSONObjectAsObject = JSON.parse(m35814(abstractC20745)).asObject();
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
        C7377 c7377 = new C7377(string2, string3, string4, m35794(jSONObjectAsObject, "overlayExisted"));
        c7377.f24464 = m35794(jSONObjectAsObject, "deletedExisted");
        c7377.f24466 = m35794(jSONObjectAsObject, "failuresExisted");
        c7377.f24465 = m35794(jSONObjectAsObject, "stateExisted");
        return c7377;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35794(JSONObject jSONObject, String str) throws IOException {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isBoolean()) {
            throw new IOException("Invalid delete transaction boolean field: ".concat(str));
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m35722(AbstractC20745 abstractC20745, C7377 c7377) throws IOException {
        AbstractC20745 abstractC20745M35822 = m35822(abstractC20745, c7377);
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(".delete_transaction").m46690("overlay.backup");
        if (c7377.f24463) {
            if (!abstractC20745M46690.mo33975()) {
                if (!abstractC20745M35822.mo33975()) {
                    throw new IOException("Delete transaction overlay backup is missing");
                }
                return;
            }
            if (abstractC20745M35822.mo33975()) {
                m35824(abstractC20745M35822);
            }
            abstractC20745M35822.mo46720();
            if (!abstractC20745M46690.mo24646(abstractC20745M35822)) {
                throw new IOException("Unable to restore delete transaction overlay");
            }
            return;
        }
        if (abstractC20745M35822.mo33975()) {
            m35824(abstractC20745M35822);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35789(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, boolean z) throws IOException {
        if (z) {
            if (!abstractC20746.mo33971()) {
                throw new IOException("Delete transaction backup is missing");
            }
            m35845(abstractC20745, abstractC20746.m46727(), ".delete_restore");
        } else if (abstractC20745.mo33975() && !abstractC20745.mo24647()) {
            throw new IOException("Unable to remove delete transaction file");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35771(AbstractC20745 abstractC20745) throws C12731, IOException {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(".delete_transaction");
        if (abstractC20745M46690.mo33975()) {
            m35855(abstractC20745);
            if (abstractC20745M46690.mo33975()) {
                throw new IOException("Previous delete transaction cleanup is incomplete");
            }
        }
        abstractC20745M46690.m46739();
        return abstractC20745M46690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35799(AbstractC20745 abstractC20745, C7377 c7377, Exception exc) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(".delete_transaction").m46690("committed");
        if (!abstractC20745M46690.mo33975()) {
            return false;
        }
        try {
            C7377 c7377M35807 = m35807(abstractC20745M46690, "committed");
            String str = c7377M35807.f24467;
            if (c7377.f24462.equals(c7377M35807.f24462) && c7377.f24468.equals(c7377M35807.f24468)) {
                String str2 = c7377.f24467;
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35844(AbstractC20745 abstractC20745, C7377 c7377) {
        m35790(abstractC20745.m46690(".delete_transaction").m46690("committed"), m35803(c7377, "committed"), ".delete_commit");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m35855(AbstractC20745 abstractC20745) throws C12731 {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(".delete_transaction");
        if (abstractC20745M46690.mo33975()) {
            AbstractC20745 abstractC20745M46691 = abstractC20745.m46690(".delete_transaction").m46690("transaction.json");
            AbstractC20745 abstractC20745M46692 = abstractC20745.m46690(".delete_transaction").m46690("committed");
            if (!abstractC20745M46692.mo33975()) {
                if (!abstractC20745M46691.mo33971()) {
                    try {
                        m35824(abstractC20745M46690);
                        return;
                    } catch (IOException e) {
                        C0577.m2747("MT MCP stale delete transaction directory cleanup failed, editSessionId=" + abstractC20745.getName(), e);
                        return;
                    }
                }
                try {
                    C7377 c7377M35807 = m35807(abstractC20745M46691, "prepared");
                    String str = c7377M35807.f24462;
                    m35722(abstractC20745, c7377M35807);
                    m35789(abstractC20745.m46690("deleted").m46690("dex".equals(str) ? "dex.json" : "entry.json"), abstractC20745M46690.m46690("deleted.backup"), c7377M35807.f24464);
                    m35789(abstractC20745.m46690("failures").m46690("dex".equals(str) ? "dex.json" : "entry.json"), abstractC20745M46690.m46690("failures.backup"), c7377M35807.f24466);
                    m35789(abstractC20745.m46690("state.json"), abstractC20745M46690.m46690("state.backup"), c7377M35807.f24465);
                    m35783(abstractC20745, c7377M35807);
                    m35824(abstractC20745M46691);
                    m35824(abstractC20745M46690);
                    return;
                } catch (C12731 e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw m35757(e3);
                }
            }
            C7377 c7377M35808 = null;
            try {
                try {
                    if (abstractC20745M46692.mo33971()) {
                        c7377M35808 = m35807(abstractC20745M46692, "committed");
                    }
                } catch (Exception e4) {
                    C0577.m2747("MT MCP committed delete marker is unreadable, editSessionId=" + abstractC20745.getName(), e4);
                }
                if (c7377M35808 == null && abstractC20745M46691.mo33971()) {
                    try {
                        c7377M35808 = m35807(abstractC20745M46691, "prepared");
                    } catch (Exception e5) {
                        C0577.m2747("MT MCP prepared delete journal is unreadable after commit, editSessionId=" + abstractC20745.getName(), e5);
                    }
                }
                if (c7377M35808 == null) {
                    m35824(abstractC20745.m46690("cache"));
                } else {
                    m35783(abstractC20745, c7377M35808);
                }
                m35788(abstractC20745M46690, abstractC20745M46691, abstractC20745M46692);
            } catch (Exception e6) {
                C0577.m2747("MT MCP committed delete transaction cleanup failed, editSessionId=" + abstractC20745.getName(), e6);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35822(AbstractC20745 abstractC20745, C7377 c7377) {
        String str = c7377.f24462;
        String str2 = c7377.f24468;
        if ("dex".equals(str)) {
            String str3 = c7377.f24467;
            C21966.m48796(str2);
            return abstractC20745.m46690("overlay").m46690("dex").m46690(str3).m46690(C18810.m43407(str2).concat(".smali"));
        }
        return m35859(abstractC20745).m46690(C18810.m43407(str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35783(AbstractC20745 abstractC20745, C7377 c7377) throws IOException {
        String str = c7377.f24462;
        String str2 = c7377.f24468;
        if ("dex".equals(str)) {
            String str3 = c7377.f24467;
            C21966.m48796(str2);
            m35824(abstractC20745.m46690("cache").m46690("dex").m46690(str3).m46690(C18810.m43407(str2).concat(".bin")));
            return;
        }
        m35824(m35821(abstractC20745, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35798(AbstractC20745 abstractC20745, Exception exc) {
        try {
            m35855(abstractC20745);
            return true;
        } catch (C12731 e) {
            exc.addSuppressed(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m35829(AbstractC20745 abstractC20745) {
        try {
            m35855(abstractC20745);
        } catch (IOException e) {
            e = e;
            C0577.m2747("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC20745.getName(), e);
        } catch (RuntimeException e2) {
            if (!m35848(e2)) {
                throw e2;
            }
            C0577.m2747("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC20745.getName(), e2);
        } catch (C12731 e3) {
            e = e3;
            C0577.m2747("MT MCP delete transaction cleanup failed, editSessionId=" + abstractC20745.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35775(C12731 c12731, String str, C5728 c5728, C14942 c14942) {
        JSONValue jSONValueValue;
        String str2 = c5728.f19492;
        ArrayList arrayList = c5728.f19494;
        JSONObject jSONObject = c12731.f42468;
        JSONArray jSONArray = c12731.f42471;
        int i = jSONObject.getInt("failedEditIndex", -1);
        boolean z = jSONObject.getBoolean("_suppressResourceRetry", false);
        jSONObject.remove("_suppressResourceRetry");
        C17017 c17017 = (i < 0 || i >= arrayList.size()) ? null : (C17017) arrayList.get(i);
        String string = jSONObject.getString("resourceId", c17017 == null ? null : c17017.f54371);
        String string2 = jSONObject.getString("variant", c17017 != null ? c17017.f54370 : null);
        JSONObject jSONObjectPut = jSONObject.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i >= 0 ? JSON.value(i) : JSON.NULL);
        if (string == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, string));
        }
        jSONObjectPut.put("locator", jSONValueValue).put("variant", string2 == null ? JSON.NULL : JSON.value(string2));
        if (jSONObject.get("resourceNamePolicy") == null || jSONObject.get("resourceNamePolicy").isNull()) {
            jSONObject.put("resourceNamePolicy", c14942 == null ? JSON.NULL : c14942.m35686());
        }
        if (z || jSONArray.size() != 0) {
            return;
        }
        String str3 = c12731.f42472;
        if ((!"STALE_TARGET_VERSION".equals(str3) && !"INVALID_VALUE_XML".equals(str3) && !"UNSUPPORTED_VALUE_XML".equals(str3) && !"UNSUPPORTED_STYLED_TEXT_XML".equals(str3) && !"APP_NAME_REFERENCES_NOT_ACCEPTED".equals(str3) && !"RESOURCE_VARIANT_NOT_FOUND".equals(str3)) || string == null || string2 == null) {
            return;
        }
        jSONArray.add(C11320.m28376(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("reads", JSON.array().add(JSON.object().add("locator", C17638.m41044("resource", (String) null, (String) null, (String) null, (String) null, string)).add("variant", string2))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 2000).add("resolveDepth", 0), "mt_apk_resource_read", "retry", "Re-read the resource value for the latest valueXml/targetVersion or available variants"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15958 m35769(C21956 c21956, AbstractC20745 abstractC20745, C23368 c23368, C15283 c15283) throws C12731 {
        String strM35740;
        ArrayList arrayList = c23368.f75698;
        String str = c23368.f75695;
        String str2 = c23368.f75694;
        if (!"smali_class".equals(str2)) {
            throw C12731.m31626("Invalid targetType", "targetType", JSON.value(str2), JSON.array("smali_class"), JSON.object().add("targetType", "smali_class"));
        }
        String strM35827 = m35827(c23368.f75697);
        m35847(c21956, c23368, str, c23368.f75694, strM35827, (m35840(abstractC20745, strM35827) == null && !(((C10906) m35745(abstractC20745, c15283).get(strM35827)) == null && m35811(c21956, strM35827) == 0)) ? m35812(C7521.m20038(m35868(c21956, abstractC20745.getName(), strM35827, c15283))) : "missing");
        C10668 c10668 = (C10668) arrayList.get(0);
        String str3 = c10668.f36388;
        if ("write_target".equals(str3)) {
            strM35740 = C7521.m20038(c10668.f36387);
        } else {
            if (!m35810(str3)) {
                throw C12731.m31626("Invalid mode", "edits[0].mode", JSON.value(str3), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m35840(abstractC20745, strM35827) != null) {
                throw C2664.m8197(c21956.f71244, abstractC20745.getName());
            }
            strM35740 = m35740(c21956, c23368, abstractC20745.getName(), c23368.f75694, strM35827, C7521.m20038(m35868(c21956, abstractC20745.getName(), strM35827, c15283)));
        }
        String str4 = strM35740;
        String strM35812 = m35812(str4);
        String str5 = c23368.f75694;
        arrayList.size();
        return m35767(c21956, abstractC20745, strM35827, str4, str, str5, strM35827, strM35812);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C15958 m35836(C21956 c21956, AbstractC20745 abstractC20745, C23368 c23368, C15283 c15283) throws C12731 {
        String strM35740;
        String str = c21956.f71244;
        String str2 = c23368.f75697;
        ArrayList arrayList = c23368.f75698;
        String str3 = c23368.f75695;
        String strM41098 = C17638.m41098(str2);
        String strM41100 = C17638.m41100(str2);
        if (m35840(abstractC20745, strM41098) != null) {
            throw C2664.m8197(str, str3);
        }
        String strM20038 = C7521.m20038(m35868(c21956, str3, strM41098, c15283));
        C0093 c0093M30084 = C12089.m30083(strM41098, strM20038).m30084(strM41100);
        if (c0093M30084 == null) {
            throw C2664.m8205(str, str3, strM41098);
        }
        int i = c0093M30084.f1015;
        String strM20037 = C7521.m20037(i, c0093M30084.f1014, strM20038);
        m35847(c21956, c23368, str3, c23368.f75694, c23368.f75697, m35812(strM20037));
        C10668 c10668 = (C10668) arrayList.get(0);
        if ("write_target".equals(c10668.f36388)) {
            String strM20039 = C7521.m20038(c10668.f36387);
            if (strM20039.endsWith("\n")) {
                strM20039 = C20630.m46498(1, 0, strM20039);
            }
            if (strM20039.isEmpty() || strM20039.endsWith("\n")) {
                throw m35765(c21956, c23368, "Smali text must contain one complete .method block.");
            }
            String[] strArrSplit = strM20039.split("\n", -1);
            String strTrim = C12089.m30082(strArrSplit[0]).trim();
            String strTrim2 = C12089.m30082(strArrSplit[strArrSplit.length - 1]).trim();
            if (!m35862(strTrim) || !".end method".equals(strTrim2)) {
                throw m35765(c21956, c23368, "Smali text must contain one complete .method block.");
            }
            int length = strArrSplit.length;
            String str4 = strM20039;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                String[] strArr = strArrSplit;
                String strTrim3 = C12089.m30082(strArrSplit[i2]).trim();
                if (m35862(strTrim3)) {
                    i3++;
                } else if (".end method".equals(strTrim3)) {
                    i4++;
                }
                i2++;
                strArrSplit = strArr;
            }
            if (i3 != 1 || i4 != 1) {
                throw m35765(c21956, c23368, "Smali text must contain one complete .method block.");
            }
            String str5 = C0093.m1053(1, strTrim).f1010;
            if (str5.indexOf(40) < 0 || !strM41100.equals(str5)) {
                throw m35765(c21956, c23368, "Smali .method signature does not match locator target.");
            }
            strM35740 = str4;
        } else {
            strM35740 = m35740(c21956, c23368, str3, c23368.f75694, c23368.f75697, strM20037);
        }
        String strM35738 = m35738(strM20038, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c0093M30084.f1014), strM35740);
        String strM35812 = strM35740.isEmpty() ? "missing" : m35812(strM35740);
        String str6 = c23368.f75694;
        String str7 = c23368.f75697;
        arrayList.size();
        return m35767(c21956, abstractC20745, strM41098, strM35738, str3, str6, str7, strM35812);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15958 m35768(C21956 c21956, AbstractC20745 abstractC20745, C23368 c23368) throws C12731 {
        String strM35812;
        String strM35740;
        String strReplace;
        String str;
        C15283 c15283;
        String str2;
        C0321 c0321;
        String str3 = c21956.f71244;
        String str4 = c23368.f75697;
        String str5 = c23368.f75695;
        ArrayList arrayList = c23368.f75698;
        String str6 = c23368.f75694;
        if (str4 == null || str4.isEmpty() || str4.indexOf(0) >= 0 || str4.endsWith("/")) {
            throw C12731.m31626("Invalid target", "target", str4 != null ? JSON.value(str4) : null, JSON.array(), JSON.object().add("target", "res/layout/activity_main.xml"));
        }
        if ("resources.arsc".equals(str4)) {
            throw C12731.m31625("RESOURCE_TABLE_TEXT_EDIT_UNSUPPORTED", "resources.arsc must be edited with mt_apk_resource_edit.");
        }
        C17255 c17255M35837 = m35837(c21956, abstractC20745, str4);
        boolean z = c17255M35837.f54968;
        String str7 = c17255M35837.f54969;
        if (!((z || "missing".equals(str7)) ? true : str6.equals(str7))) {
            if (!"zip_entry".equals(str6)) {
                throw C12731.m31625("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
            }
            if ("axml".equals(str7)) {
                throw C2664.m8193(str3, str5, str4);
            }
            if ("too_large".equals(str7)) {
                throw C12731.m31625("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
            }
            throw C2664.m8202(str3, str5, str4);
        }
        if (z || "missing".equals(str7)) {
            strM35812 = "missing";
        } else {
            strM35812 = m35812(C7521.m20038(("axml".equals(str6) ? m35872(c21956, abstractC20745.getName(), str4) : m35890(c21956, abstractC20745.getName(), str4)).f17472));
        }
        m35847(c21956, c23368, str5, c23368.f75694, str4, strM35812);
        String str8 = c23368.f75694;
        C10668 c10668 = (C10668) arrayList.get(0);
        String str9 = c10668.f36388;
        if ("write_target".equals(str9)) {
            strM35740 = C7521.m20038(c10668.f36387);
        } else {
            if (!m35810(str9)) {
                throw C12731.m31626("Invalid mode", "edits[0].mode", JSON.value(str9), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), JSON.object().add("mode", "replace_match"));
            }
            if (m35850(abstractC20745).contains(str4)) {
                throw m35833();
            }
            strM35740 = m35740(c21956, c23368, abstractC20745.getName(), str8, str4, C7521.m20038("axml".equals(str8) ? m35872(c21956, abstractC20745.getName(), str4).f17472 : m35890(c21956, abstractC20745.getName(), str4).f17472));
        }
        String str10 = strM35740;
        String strM35813 = m35812(str10);
        if ("axml".equals(str6)) {
            Charset charset = StandardCharsets.UTF_8;
            if (str10.getBytes(charset).length > 2097152) {
                throw C12731.m31625("AXML_SOURCE_TOO_LARGE", "AXML source is too large to edit.");
            }
            String strM43407 = C18810.m43407(str10);
            C17960 c17960M35820 = m35820(abstractC20745, str4, strM43407);
            if (c17960M35820 != null) {
                c0321 = new C0321(strM43407, c17960M35820.f57449);
            } else {
                C19372 c19372M35770 = m35770(c21956, str5, str4, str10, strM43407);
                C19485 c19485 = c19372M35770.f62436;
                if (c19485 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c19485);
                    throw m35764(c21956, str5, false, "EDIT_TEXT_PREPARE_FAILED_IN_SESSION", "AXML encode failed; edit_text candidate was not saved.", m35734(arrayList2), (String) null, (String) null);
                }
                c0321 = c19372M35770.f62435;
            }
            C0321 c0322 = c0321;
            m35785(abstractC20745, new C7377(Entry.DEFAULT_NAME, str4, null, m35859(abstractC20745).m46690(C18810.m43407(str4)).mo33975()), str10.getBytes(charset), c23368.f75694, new C22713(C22037.f71424, "lf"));
            try {
                m35780(abstractC20745, str4, c0322);
            } catch (Exception e) {
                C0577.m2747("MT MCP AXML edit cache publish failed, editSessionId=".concat(str5), e);
            }
            str = c23368.f75694;
            arrayList.size();
            c15283 = null;
            str2 = strM35813;
        } else {
            C22713 c22713M35823 = m35823(c21956, abstractC20745, str4);
            int i = c22713M35823.f73973;
            try {
                C19551 c19551 = new C19551();
                m35777(c19551, i);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c19551, C22037.m48953(i));
                try {
                    String str11 = c22713M35823.f73974;
                    if ("lf".equals(str11)) {
                        strReplace = str10;
                    } else {
                        strReplace = str10.replace("\n", "crlf".equals(str11) ? "\r\n" : "\r");
                    }
                    outputStreamWriter.write(strReplace);
                    outputStreamWriter.close();
                    byte[] bArrCopyOf = c19551.f62829;
                    int length = bArrCopyOf.length;
                    int i2 = c19551.f62830;
                    if (length != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                    }
                    byte[] bArr = bArrCopyOf;
                    if (bArr.length > 10485760) {
                        throw C12731.m31625("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    String strM35814 = m35812(m35748(c21956, str5, str4, bArr, false).f17472);
                    m35785(abstractC20745, new C7377(Entry.DEFAULT_NAME, str4, null, m35859(abstractC20745).m46690(C18810.m43407(str4)).mo33975()), bArr, c23368.f75694, c22713M35823);
                    str = c23368.f75694;
                    arrayList.size();
                    c15283 = null;
                    str2 = strM35814;
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
                throw m35757(e2);
            }
        }
        return m35766(c21956, str5, str, str4, str2, c15283);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final synchronized C15958 m35865(C21956 c21956, String str) {
        m35851(c21956, str);
        return m35853(c21956, str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m35826(C21956 c21956, String str, C15283 c15283) throws C12731 {
        if (m35723(str)) {
            return;
        }
        m35730(c21956, m35851(c21956, str), c15283);
        C15958 c15958M35766 = m35766(c21956, str, (String) null, (String) null, (String) null, c15283);
        if (c15958M35766.f51713 > 0) {
            throw m35763(c21956, str, c15958M35766);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized ArrayList m35869(C21956 c21956, String str, C15283 c15283) {
        if (m35723(str)) {
            return c21956.f71221;
        }
        m35826(c21956, str, c15283);
        return m35743(c21956, m35747(c21956, str, m35851(c21956, str), c15283));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35796(C4367 c4367, C5032 c5032, C2093 c2093, char[] cArr) throws C12731 {
        AbstractC20745 abstractC20745M12222 = c4367.m12222(c5032.f17548);
        if (abstractC20745M12222 == null) {
            return false;
        }
        c2093.m6636();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC20745M12222.mo33970(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i != -1) {
                        c2093.write(cArr, 0, i);
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
                throw m35757(e);
            }
        } catch (IOException e) {
            throw m35757(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35743(C21956 c21956, C3143 c3143) throws C12731 {
        HashSet hashSet = new HashSet(c21956.f71224);
        HashMap map = new HashMap();
        HashMap map2 = c3143.f11856;
        HashSet hashSet2 = c3143.f11854;
        int i = 0;
        int i2 = 0;
        for (C10906 c10906 : map2.values()) {
            String str = c10906.f37096;
            String str2 = c10906.f37095;
            if (!hashSet.contains(str)) {
                throw m35755();
            }
            if (!hashSet2.contains(str2) && !c21956.f71233.containsKey(str2)) {
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(str, arrayList);
                }
                arrayList.add(c10906);
                i2++;
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C23846.sort((ArrayList) it.next(), C7618.comparing(new C3848()));
        }
        ArrayList arrayList2 = new ArrayList(c21956.f71221.size() + i2);
        for (String str3 : c21956.f71224) {
            while (i < c21956.f71221.size() && str3.equals(((C5032) c21956.f71221.get(i)).f17547)) {
                int i3 = i + 1;
                C5032 c5032 = (C5032) c21956.f71221.get(i);
                if (!hashSet2.contains(c5032.f17548)) {
                    C10906 c10907 = (C10906) c3143.f11853.get(c5032.f17548);
                    if (c10907 != null) {
                        arrayList2.add(new C5032(c10907.f37096, -1, -1, c10907.f37095));
                    } else {
                        arrayList2.add(c5032);
                    }
                }
                i = i3;
            }
            ArrayList<C10906> arrayList3 = (ArrayList) map.get(str3);
            if (arrayList3 != null) {
                for (C10906 c10908 : arrayList3) {
                    arrayList2.add(new C5032(c10908.f37096, -1, -1, c10908.f37095));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C7807 m35874(C21956 c21956, String str, C5032 c5032) {
        return m35875(c21956, str, c5032, (C15283) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C7807 m35875(C21956 c21956, String str, C5032 c5032, C15283 c15283) {
        if (m35723(str)) {
            return C14578.m35045(c21956, c5032);
        }
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        C3143 c3143M35747 = m35747(c21956, str, abstractC20745M35851, c15283);
        C10906 c10906 = (C10906) c3143M35747.f11853.get(c5032.f17548);
        if (c10906 != null) {
            String strM35814 = m35814(m35839(abstractC20745M35851, c10906));
            String strM43407 = C18810.m43407(strM35814);
            C18666 c18666M35838 = m35838(abstractC20745M35851, c10906, strM43407);
            if (c18666M35838 != null) {
                return c18666M35838.f60590;
            }
            m35729(c21956, abstractC20745M35851, c10906, strM35814);
            C18666 c18666M35839 = m35838(abstractC20745M35851, c10906, strM43407);
            if (c18666M35839 == null) {
                throw m35763(c21956, str, m35853(c21956, str));
            }
            return c18666M35839.f60590;
        }
        if (c3143M35747.f11854.contains(c5032.f17548)) {
            throw C2664.m8197(c21956.f71244, str);
        }
        return C14578.m35045(c21956, c5032);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C15958 m35853(C21956 c21956, String str) {
        return m35766(c21956, str, (String) null, (String) null, (String) null, (C15283) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15958 m35766(C21956 c21956, String str, String str2, String str3, String str4, C15283 c15283) throws C12731 {
        AbstractC20745 abstractC20745M35851 = m35851(c21956, str);
        HashMap mapM35745 = m35745(abstractC20745M35851, c15283);
        ArrayList arrayList = new ArrayList();
        for (C19485 c19485 : m35852(abstractC20745M35851)) {
            C10906 c10906 = (C10906) mapM35745.get(c19485.f62710);
            if (c10906 != null && c10906.f37096.equals(c19485.f62712)) {
                if (c19485.f62709.equals(C18810.m43407(m35814(m35839(abstractC20745M35851, c10906))))) {
                    arrayList.add(c19485);
                }
            }
        }
        HashMap mapM35806 = m35806(abstractC20745M35851);
        for (C19485 c19486 : m35856(abstractC20745M35851)) {
            C5966 c5966 = (C5966) mapM35806.get(c19486.f62707);
            if (c5966 != null && "axml".equals(c5966.f20320)) {
                String strM35814 = m35814(m35859(abstractC20745M35851).m46690(C18810.m43407(c5966.f20323)).m46690("text.xml"));
                String str5 = c19486.f62709;
                if (str5 != null && str5.equals(C18810.m43407(strM35814))) {
                    arrayList.add(c19486);
                }
            }
        }
        int i = 0;
        for (C10906 c10907 : m35745(abstractC20745M35851, c15283).values()) {
            String strM43407 = C18810.m43407(m35814(m35839(abstractC20745M35851, c10907)));
            if (m35838(abstractC20745M35851, c10907, strM43407) == null && !m35800(abstractC20745M35851, c10907, strM43407)) {
                i++;
            }
        }
        int i2 = i;
        for (C5966 c5967 : m35806(abstractC20745M35851).values()) {
            String str6 = c5967.f20320;
            String str7 = c5967.f20323;
            if ("axml".equals(str6)) {
                String strM43408 = C18810.m43407(m35814(m35859(abstractC20745M35851).m46690(C18810.m43407(str7)).m46690("text.xml")));
                if (m35820(abstractC20745M35851, str7, strM43408) == null && !m35849(abstractC20745M35851, str7, strM43408)) {
                    i2++;
                }
            }
        }
        return new C15958(c21956.f71244, str, str2, str3, str4, i2, arrayList.size(), arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m35730(C21956 c21956, AbstractC20745 abstractC20745, C15283 c15283) throws C12731 {
        int i;
        int iM35729 = 0;
        for (C10906 c10906 : m35745(abstractC20745, c15283).values()) {
            String strM35814 = m35814(m35839(abstractC20745, c10906));
            String strM43407 = C18810.m43407(strM35814);
            if (m35838(abstractC20745, c10906, strM43407) == null && !m35800(abstractC20745, c10906, strM43407)) {
                iM35729 += m35729(c21956, abstractC20745, c10906, strM35814);
            }
        }
        for (C5966 c5966 : m35806(abstractC20745).values()) {
            String str = c5966.f20320;
            final String str2 = c5966.f20323;
            if ("axml".equals(str)) {
                String strM35815 = m35814(m35859(abstractC20745).m46690(C18810.m43407(str2)).m46690("text.xml"));
                String strM43408 = C18810.m43407(strM35815);
                if (m35820(abstractC20745, str2, strM43408) == null && !m35849(abstractC20745, str2, strM43408)) {
                    final String strM43409 = C18810.m43407(strM35815);
                    if (m35820(abstractC20745, str2, strM43409) != null || m35849(abstractC20745, str2, strM43409)) {
                        i = 0;
                    } else {
                        C19372 c19372M35770 = m35770(c21956, abstractC20745.getName(), str2, strM35815, strM43409);
                        final C19485 c19485 = c19372M35770.f62436;
                        if (c19485 == null) {
                            try {
                                m35780(abstractC20745, str2, c19372M35770.f62435);
                                try {
                                    ArrayList arrayListM35856 = m35856(abstractC20745);
                                    C9030.removeIf(arrayListM35856, new Predicate() { // from class: l.ۜۢ֨
                                        @Override // java.util.function.Predicate
                                        public /* synthetic */ Predicate and(Predicate predicate) {
                                            return C8512.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* JADX INFO: renamed from: negate */
                                        public /* synthetic */ Predicate mo9645negate() {
                                            return C8512.$default$negate(this);
                                        }

                                        public /* synthetic */ Predicate or(Predicate predicate) {
                                            return C8512.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            C19485 c19486 = (C19485) obj;
                                            if (str2.equals(c19486.f62707)) {
                                                return strM43409.equals(c19486.f62709);
                                            }
                                            return false;
                                        }
                                    });
                                    m35809(abstractC20745, arrayListM35856);
                                    i = 1;
                                } catch (IOException e) {
                                    throw m35757(e);
                                }
                            } catch (IOException e2) {
                                throw m35757(e2);
                            }
                        } else {
                            try {
                                ArrayList arrayListM35857 = m35856(abstractC20745);
                                C9030.removeIf(arrayListM35857, new Predicate() { // from class: l.ۨۢ֨
                                    @Override // java.util.function.Predicate
                                    public /* synthetic */ Predicate and(Predicate predicate) {
                                        return C8512.$default$and(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    /* JADX INFO: renamed from: negate */
                                    public /* synthetic */ Predicate mo9645negate() {
                                        return C8512.$default$negate(this);
                                    }

                                    public /* synthetic */ Predicate or(Predicate predicate) {
                                        return C8512.$default$or(this, predicate);
                                    }

                                    @Override // java.util.function.Predicate
                                    public final boolean test(Object obj) {
                                        String str3;
                                        C19485 c19486 = (C19485) obj;
                                        C19485 c19487 = c19485;
                                        String str4 = c19487.f62707;
                                        return str4 != null && str4.equals(c19486.f62707) && (str3 = c19487.f62709) != null && str3.equals(c19486.f62709);
                                    }
                                });
                                arrayListM35857.add(c19485);
                                m35809(abstractC20745, arrayListM35857);
                                i = 0;
                            } catch (IOException e3) {
                                throw m35757(e3);
                            }
                        }
                    }
                    iM35729 += i;
                }
            }
        }
        return iM35729;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8083 m35752(C21956 c21956, C10906 c10906, String str, String str2) throws C12731 {
        try {
            C8255 c8255M35857 = m35857(c21956, c10906.f37096);
            C8485 c8485M21646 = c8255M35857.m21646();
            try {
                C19213 c19213M18449 = C6843.m18449(str, c8485M21646, c8255M35857);
                if (c19213M18449 == null || !c10906.f37097.equals(c19213M18449.getType())) {
                    String str3 = c10906.f37097;
                    return new C8083(null, new C19485("smali_class", str3, str3, c10906.f37096, str2, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile did not produce target class.", null, null));
                }
                try {
                    C16246 c16246 = new C16246();
                    c8485M21646.m37936(c16246);
                    return new C8083(new C10200(str2, c16246.m38374()), null);
                } catch (IOException e) {
                    throw m35757(e);
                }
            } catch (C22085 e2) {
                String message = e2.getMessage() == null ? "Smali compile failed." : e2.getMessage();
                int i = e2.f71538;
                Integer numValueOf = i > 0 ? Integer.valueOf(i - 1) : null;
                int i2 = e2.f71540;
                Integer numValueOf2 = i2 >= 0 ? Integer.valueOf(i2) : null;
                String str4 = c10906.f37097;
                return new C8083(null, new C19485("smali_class", str4, str4, c10906.f37096, str2, "SMALI_COMPILE_FAILED_IN_SESSION", message, numValueOf, numValueOf2));
            }
        } catch (OutOfMemoryError unused) {
            throw C2664.m8203();
        }
        throw C2664.m8203();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18666 m35838(AbstractC20745 abstractC20745, C10906 c10906, String str) {
        AbstractC20745 abstractC20745M35772 = m35772(abstractC20745, c10906);
        if (!abstractC20745M35772.mo33971()) {
            return null;
        }
        try {
            C17367 c17367 = new C17367(abstractC20745M35772.m46727());
            if (c17367.readInt() == 1296388931 && c17367.readInt() == 1 && str.equals(c17367.m40442())) {
                byte[] bArrM40451 = c17367.m40451();
                if (c17367.available() == 0) {
                    for (C7807 c7807 : (AbstractC18494) C17684.m41160((InputStream) new ByteArrayInputStream(bArrM40451)).mo34148()) {
                        if (c10906.f37097.equals(c7807.getType())) {
                            return new C18666(c7807, bArrM40451);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        AbstractC20745 abstractC20745M35773 = m35772(abstractC20745, c10906);
        if (!abstractC20745M35773.mo33975()) {
            return null;
        }
        abstractC20745M35773.mo24647();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35786(AbstractC20745 abstractC20745, C10906 c10906, C10200 c10200) {
        C11018 c11018 = new C11018(c10200.f34838.length + 96);
        c11018.writeInt(1296388931);
        c11018.writeInt(1);
        c11018.m27782((CharSequence) c10200.f34839);
        c11018.m27794(c10200.f34838);
        AbstractC20745 abstractC20745M35772 = m35772(abstractC20745, c10906);
        abstractC20745M35772.mo46720();
        abstractC20745M35772.m46697(c11018);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35847(C21956 c21956, C23368 c23368, String str, String str2, String str3, String str4) throws C12731 {
        JSONArray jSONArrayM35830;
        String str5 = c21956.f71244;
        if (str4.equals(c23368.f75696)) {
            return;
        }
        JSONObject jSONObjectAdd = m35735(str5, str, str2, str3).add("currentTargetVersion", str4);
        if ("missing".equals(str4)) {
            jSONArrayM35830 = JSON.array();
        } else {
            jSONArrayM35830 = m35830(str5, str, str2, str3);
        }
        throw C12731.m31627("TARGET_VERSION_MISMATCH", "targetVersion does not match current target text. Re-read the target and retry with data.targetVersion.", "warning", jSONArrayM35830, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m35812(String str) {
        return C22253.m49424(C22253.m49425().digest(str.getBytes(StandardCharsets.UTF_8))).substring(0, 16);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C8902 m35832(C21956 c21956, AbstractC20745 abstractC20745, C0083 c0083) throws C12731 {
        String str = c21956.f71244;
        String str2 = c0083.f993;
        String str3 = c0083.f991;
        String strM35827 = m35827(str2);
        if (m35840(abstractC20745, strM35827) != null) {
            throw C2664.m8197(str, str3);
        }
        C10906 c10906 = (C10906) m35813(abstractC20745).get(strM35827);
        int iM35811 = m35811(c21956, strM35827);
        boolean z = true;
        if (c10906 == null && iM35811 > 1) {
            throw C12731.m31625("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        boolean z2 = iM35811 > 0;
        if (c10906 == null && !z2) {
            throw C2664.m8197(str, str3);
        }
        String str4 = (c10906 != null ? c10906 : new C10906(m35724(c21956, strM35827).f17547, strM35827)).f37096;
        C7377 c7377 = new C7377("dex", strM35827, str4, c10906 != null);
        m35854(abstractC20745);
        try {
            m35784(abstractC20745, c7377, m35771(abstractC20745));
            if (z2) {
                m35720(abstractC20745, strM35827, str4);
            } else {
                ArrayList arrayListM35863 = m35863(abstractC20745);
                C9030.removeIf(arrayListM35863, new C14206(strM35827));
                m35825(abstractC20745, arrayListM35863);
            }
            ArrayList arrayListM35852 = m35852(abstractC20745);
            C9030.removeIf(arrayListM35852, new C17389(1, strM35827));
            m35861(abstractC20745, arrayListM35852);
            m35728(abstractC20745, m35854(abstractC20745));
            try {
                m35844(abstractC20745, c7377);
            } catch (IOException e) {
                e = e;
                if (z || !m35799(abstractC20745, c7377, e)) {
                    m35798(abstractC20745, e);
                    if (e instanceof C12731) {
                        throw ((C12731) e);
                    }
                    throw m35757(e);
                }
                C0577.m2747("MT MCP delete commit completed after storage error, editSessionId=".concat(str3), e);
            } catch (C12731 e2) {
                e = e2;
                if (z) {
                }
                m35798(abstractC20745, e);
                if (e instanceof C12731) {
                    throw ((C12731) e);
                }
                throw m35757(e);
            }
        } catch (IOException | C12731 e3) {
            e = e3;
            z = false;
        }
        m35829(abstractC20745);
        return new C8902(c0083.f990, str3, c0083.f992, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8902 m35754(C21956 c21956, AbstractC20745 abstractC20745, C0083 c0083, C15283 c15283) throws C12731 {
        C10200 c10200;
        String str = c21956.f71244;
        String str2 = c0083.f993;
        String str3 = c0083.f991;
        String strM41098 = C17638.m41098(str2);
        String strM41100 = C17638.m41100(str2);
        if (m35840(abstractC20745, strM41098) != null) {
            throw C2664.m8197(str, str3);
        }
        String strM20038 = C7521.m20038(m35868(c21956, str3, strM41098, c15283));
        C0093 c0093M30084 = C12089.m30083(strM41098, strM20038).m30084(strM41100);
        if (c0093M30084 != null) {
            int i = c0093M30084.f1015;
            boolean z = false;
            String strM35738 = m35738(strM20038, Math.max(0, i - 1), Math.max(Math.max(0, i - 1), c0093M30084.f1014), "");
            String strM35739 = m35739(c21956, abstractC20745, strM41098);
            C10906 c10906 = new C10906(strM35739, strM41098);
            String strM43407 = C18810.m43407(strM35738);
            if (m35838(abstractC20745, c10906, strM43407) == null) {
                C8083 c8083M35752 = m35752(c21956, c10906, strM35738, strM43407);
                C19485 c19485 = c8083M35752.f28310;
                if (c19485 == null) {
                    c10200 = c8083M35752.f28309;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c19485);
                    throw m35764(c21956, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; delete candidate was not saved.", m35734(arrayList), c0083.f992, c0083.f993);
                }
            } else {
                c10200 = null;
            }
            C7377 c7377 = new C7377("dex", strM41098, strM35739, m35839(abstractC20745, c10906).mo33971());
            m35854(abstractC20745);
            try {
                m35784(abstractC20745, c7377, m35771(abstractC20745));
                AbstractC20745 abstractC20745M35839 = m35839(abstractC20745, c10906);
                abstractC20745M35839.mo46720();
                abstractC20745M35839.m46703(strM35738.getBytes(StandardCharsets.UTF_8));
                ArrayList arrayListM35863 = m35863(abstractC20745);
                C9030.removeIf(arrayListM35863, new C14206(strM41098));
                m35825(abstractC20745, arrayListM35863);
                ArrayList arrayListM35852 = m35852(abstractC20745);
                C9030.removeIf(arrayListM35852, new C17389(1, strM41098));
                m35861(abstractC20745, arrayListM35852);
                m35728(abstractC20745, m35854(abstractC20745));
                try {
                    m35844(abstractC20745, c7377);
                } catch (IOException | C12731 e) {
                    e = e;
                    z = true;
                    if (!z || !m35799(abstractC20745, c7377, e)) {
                        m35798(abstractC20745, e);
                        if (e instanceof C12731) {
                            throw ((C12731) e);
                        }
                        throw m35757(e);
                    }
                    C0577.m2747("MT MCP method delete commit completed after storage error, editSessionId=".concat(str3), e);
                }
            } catch (IOException e2) {
                e = e2;
            } catch (C12731 e3) {
                e = e3;
            }
            m35829(abstractC20745);
            if (c10200 != null) {
                try {
                    m35786(abstractC20745, c10906, c10200);
                } catch (Exception e4) {
                    try {
                        AbstractC20745 abstractC20745M35772 = m35772(abstractC20745, c10906);
                        if (abstractC20745M35772.mo33975()) {
                            abstractC20745M35772.mo24647();
                        }
                    } catch (RuntimeException e5) {
                        e4.addSuppressed(e5);
                    }
                    C0577.m2747("MT MCP delete cache publish failed, editSessionId=".concat(str3), e4);
                }
            }
            return new C8902(c0083.f990, str3, c0083.f992, str2);
        }
        throw C2664.m8205(str, str3, strM41098);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35740(C21956 c21956, C23368 c23368, String str, String str2, String str3, String str4) throws C12731 {
        ArrayList arrayList = c23368.f75698;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C10668 c10668 = (C10668) arrayList.get(i);
            String str5 = c10668.f36388;
            if (!m35810(str5)) {
                throw C12731.m31626("Invalid mode", C2271.m6966(i, "edits[", "].mode"), JSON.value(str5), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            arrayList2.add(new C2094(str5, c10668.f36386, c10668.f36387));
        }
        try {
            return C7521.m20038(C11869.m29590(str4, arrayList2));
        } catch (C9857 e) {
            int i2 = e.f33666;
            String strM6966 = C2271.m6966(i2, "edits[", "]");
            int i3 = C22900.f74450[e.f33664.ordinal()];
            if (i3 == 1) {
                throw m35759("TEXT_MATCH_NOT_FOUND", C15489.m37076(strM6966, ".matchText was not found in current text. Re-read the target and retry with current text."), c21956.f71244, str, str2, str3, e.f33666);
            }
            if (i3 == 2) {
                throw m35759("TEXT_MATCH_AMBIGUOUS", C15489.m37076(strM6966, ".matchText appears multiple times in current text; provide a longer matchText with surrounding context that appears only once."), c21956.f71244, str, str2, str3, e.f33666);
            }
            if (i3 == 3) {
                throw m35759("TEXT_MATCH_OVERLAP", C12441.m30911(e.f33665, "]; match ranges must not overlap.", C3012.m8976(strM6966, " overlaps edits[")), c21956.f71244, str, str2, str3, e.f33666);
            }
            if (i3 == 4) {
                throw C12731.m31626("Invalid mode", C15489.m37076(strM6966, ".mode"), JSON.value(((C10668) arrayList.get(i2)).f36388), JSON.array("replace_match", "insert_before_match", "insert_after_match"), JSON.object());
            }
            throw new IncompatibleClassChangeError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35759(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        return C12731.m31627(str, str2, "warning", m35830(str3, str4, str5, str6), m35735(str3, str4, str5, str6).add("failedEditIndex", i));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m35810(String str) {
        return "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m35735(String str, String str2, String str3, String str4) {
        return C3184.m9603("workspaceId", str, "editSessionId", str2).add("targetType", str3).add("target", str4).add("locator", C17638.m41043(str3, str4)).add("failures", JSON.array());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static JSONArray m35830(String str, String str2, String str3, String str4) {
        return JSON.array().add(C11320.m28376(C3184.m9603("workspaceId", str, "editSessionId", str2).add("locator", C17638.m41043(str3, str4)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "retry", "Read current target text and targetVersion"));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m35862(String str) {
        return str.startsWith(".method") && str.length() > 7 && Character.isWhitespace(str.charAt(7));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35737(String str) throws C12731 {
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
            throw C12731.m31625("SMALI_CLASS_MISMATCH", "Smali .class directive is invalid.");
        }
        return m35827(strArrSplit[strArrSplit.length - 1]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35765(C21956 c21956, C23368 c23368, String str) {
        return C12731.m31627("DEX_METHOD_MISMATCH", str, "fatal", JSON.array(), JSON.object().add("workspaceId", c21956.f71244).add("editSessionId", c23368.f75695).add("locator", C17638.m41043(c23368.f75694, c23368.f75697)).add("failures", JSON.array()));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C8255 m35857(C21956 c21956, String str) throws C12731 {
        int i;
        C17684 c17684;
        C8255 c8255 = new C8255();
        synchronized (c21956.f71243) {
            Reference reference = (Reference) c21956.f71243.get(str);
            if (reference == null || (c17684 = (C17684) reference.get()) == null) {
                try {
                    BufferedInputStream bufferedInputStreamM46719 = c21956.m48785(str).m46719();
                    try {
                        C7474 c7474M19961 = C7474.m19961(C10665.m26865(bufferedInputStreamM46719));
                        bufferedInputStreamM46719.close();
                        i = c7474M19961.f24881;
                    } catch (Throwable th) {
                        try {
                            bufferedInputStreamM46719.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    throw C2664.m8200(c21956.f71219, c21956.f71236);
                }
            } else {
                i = c17684.mo34147().f24881;
            }
        }
        c8255.f28708 = i;
        return c8255;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C5032 m35724(C21956 c21956, String str) throws C12731 {
        C5032 c5032 = null;
        for (C5032 c5033 : c21956.f71240) {
            if (str.equals(C21966.m48798(c5033.f17548))) {
                c5032 = c5033;
            }
        }
        if (c5032 != null) {
            return c5032;
        }
        throw C2664.m8197(c21956.f71244, "");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m35811(C21956 c21956, String str) {
        return ((Integer) C9735.getOrDefault(c21956.f71230, C21966.m48796(str), 0)).intValue();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35851(C21956 c21956, String str) throws C12731 {
        if (m35723(str)) {
            throw C12731.m31625("EDIT_SESSION_REQUIRED", "editSessionId is required for edit session tools.");
        }
        if (m35717(str)) {
            AbstractC20745 abstractC20745M46690 = c21956.f71232.m46690("edit_sessions").m46690(str);
            if (!abstractC20745M46690.mo33974()) {
                throw C12731.m31625("EDIT_SESSION_NOT_FOUND", "Edit session was not found.");
            }
            m35855(abstractC20745M46690);
            return abstractC20745M46690;
        }
        throw C12731.m31626("Invalid editSessionId", "editSessionId", JSON.value(str), JSON.array(), JSON.object().add("editSessionId", "ab12cd34"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35782(AbstractC20745 abstractC20745, ArrayList arrayList) throws IOException {
        byte[] bArrM46727;
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("overlay").m46690("resource_value");
        ArrayList<C1732> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            bArrM46727 = null;
            if (!it.hasNext()) {
                break;
            }
            String str = ((C9495) it.next()).f32130;
            AbstractC20745 abstractC20745M41321 = C17763.m41321(abstractC20745M46690, str);
            boolean zMo33971 = abstractC20745M41321.mo33971();
            if (abstractC20745M41321.mo33971()) {
                bArrM46727 = abstractC20745M41321.m46727();
            }
            arrayList2.add(new C1732(str, zMo33971, bArrM46727));
        }
        AbstractC20745 abstractC20745M46691 = abstractC20745.m46690("state.json");
        boolean zMo33972 = abstractC20745M46691.mo33971();
        bArrM46727 = abstractC20745M46691.mo33971() ? abstractC20745M46691.m46727() : null;
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C9495 c9495 = (C9495) it2.next();
                C17763 c17763 = c9495.f32129;
                if (c17763 != null) {
                    c17763.m41329(abstractC20745M46690);
                } else {
                    AbstractC20745 abstractC20745M41322 = C17763.m41321(abstractC20745M46690, c9495.f32130);
                    if (abstractC20745M41322.mo33975() && !abstractC20745M41322.mo24647()) {
                        throw new IOException("Unable to delete resource patch");
                    }
                }
            }
            m35728(abstractC20745, m35854(abstractC20745));
        } catch (IOException | C12731 e) {
            try {
                for (C1732 c1732 : arrayList2) {
                    AbstractC20745 abstractC20745M41323 = C17763.m41321(abstractC20745M46690, c1732.f6839);
                    if (c1732.f6840) {
                        m35845(abstractC20745M41323, c1732.f6838, ".resource_patch_restore");
                    } else {
                        AbstractC20745 abstractC20745M41324 = C17763.m41321(abstractC20745M46690, c1732.f6839);
                        if (abstractC20745M41324.mo33975() && !abstractC20745M41324.mo24647()) {
                            throw new IOException("Unable to delete resource patch");
                        }
                    }
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            try {
                if (zMo33972) {
                    m35845(abstractC20745M46691, bArrM46727, ".state_restore");
                    throw e;
                }
                if (!abstractC20745M46691.mo33975()) {
                    throw e;
                }
                if (abstractC20745M46691.mo24647()) {
                    throw e;
                }
                throw new IOException("Unable to restore edit session state");
            } catch (IOException e3) {
                e.addSuppressed(e3);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35839(AbstractC20745 abstractC20745, C10906 c10906) {
        return abstractC20745.m46690("overlay").m46690("dex").m46690(c10906.f37096).m46690(C18810.m43407(c10906.f37097).concat(".smali"));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35859(AbstractC20745 abstractC20745) {
        return abstractC20745.m46690("overlay").m46690(Entry.DEFAULT_NAME);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35772(AbstractC20745 abstractC20745, C10906 c10906) {
        return abstractC20745.m46690("cache").m46690("dex").m46690(c10906.f37096).m46690(C18810.m43407(c10906.f37097).concat(".bin"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35821(AbstractC20745 abstractC20745, String str) {
        return abstractC20745.m46690("cache").m46690(Entry.DEFAULT_NAME).m46690(C18810.m43407(str).concat(".bin"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35784(AbstractC20745 abstractC20745, C7377 c7377, AbstractC20745 abstractC20746) throws IOException {
        boolean z;
        boolean z2;
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("deleted");
        String str = c7377.f24462;
        AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC20745 abstractC20745M46692 = abstractC20746.m46690("deleted.backup");
        boolean z3 = true;
        if (abstractC20745M46691.mo33971()) {
            abstractC20745M46692.m46703(abstractC20745M46691.m46727());
            z = true;
        } else {
            z = false;
        }
        c7377.f24464 = z;
        AbstractC20745 abstractC20745M46693 = abstractC20745.m46690("failures").m46690("dex".equals(str) ? "dex.json" : "entry.json");
        AbstractC20745 abstractC20745M46694 = abstractC20746.m46690("failures.backup");
        if (abstractC20745M46693.mo33971()) {
            abstractC20745M46694.m46703(abstractC20745M46693.m46727());
            z2 = true;
        } else {
            z2 = false;
        }
        c7377.f24466 = z2;
        AbstractC20745 abstractC20745M46695 = abstractC20745.m46690("state.json");
        AbstractC20745 abstractC20745M46696 = abstractC20746.m46690("state.backup");
        if (abstractC20745M46695.mo33971()) {
            abstractC20745M46696.m46703(abstractC20745M46695.m46727());
        } else {
            z3 = false;
        }
        c7377.f24465 = z3;
        m35790(abstractC20745.m46690(".delete_transaction").m46690("transaction.json"), m35803(c7377, "prepared"), ".delete_txn");
        if (c7377.f24463) {
            AbstractC20745 abstractC20745M35822 = m35822(abstractC20745, c7377);
            AbstractC20745 abstractC20745M46697 = abstractC20746.m46690("overlay.backup");
            if (!abstractC20745M35822.mo33975() || abstractC20745M46697.mo33975() || !abstractC20745M35822.mo24646(abstractC20745M46697)) {
                throw new IOException("Unable to stage delete transaction overlay");
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35850(AbstractC20745 abstractC20745) throws C12731 {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("deleted").m46690("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC20745M46690.mo33971()) {
            try {
                JSONValue jSONValue = JSON.parse(m35814(abstractC20745M46690));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((JSONValue) it.next()).asObject().getString("entryName", null));
                    }
                    C9030.removeIf(arrayList, new C19665(3));
                    return arrayList;
                }
            } catch (Exception e) {
                throw m35757(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static ArrayList m35863(AbstractC20745 abstractC20745) throws C12731 {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("deleted").m46690("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC20745M46690.mo33971()) {
            try {
                JSONValue jSONValue = JSON.parse(m35814(abstractC20745M46690));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C20783(jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null)));
                    }
                }
            } catch (Exception e) {
                throw m35757(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35852(AbstractC20745 abstractC20745) throws C12731 {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("failures").m46690("dex.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC20745M46690.mo33971()) {
            try {
                JSONValue jSONValue = JSON.parse(m35814(abstractC20745M46690));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C19485(jSONObjectAsObject.getString("targetType", "smali_class"), jSONObjectAsObject.getString("target", jSONObjectAsObject.getString("className", null)), jSONObjectAsObject.getString("className", null), jSONObjectAsObject.getString("dexEntryName", null), jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", "SMALI_COMPILE_FAILED_IN_SESSION"), jSONObjectAsObject.getString("message", "Smali compile failed."), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m35757(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ArrayList m35856(AbstractC20745 abstractC20745) throws C12731 {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("failures").m46690("entry.json");
        ArrayList arrayList = new ArrayList();
        if (abstractC20745M46690.mo33971()) {
            try {
                JSONValue jSONValue = JSON.parse(m35814(abstractC20745M46690));
                if (jSONValue.isArray()) {
                    Iterator it = jSONValue.asArray().iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                        arrayList.add(new C19485(jSONObjectAsObject.getString("targetType", null), jSONObjectAsObject.getString("target", null), null, null, jSONObjectAsObject.getString("textHash", null), jSONObjectAsObject.getString("errorCode", null), jSONObjectAsObject.getString("message", null), (jSONObjectAsObject.get("line") == null || jSONObjectAsObject.get("line").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("line", -1)), (jSONObjectAsObject.get("column") == null || jSONObjectAsObject.get("column").isNull()) ? null : Integer.valueOf(jSONObjectAsObject.getInt("column", -1))));
                    }
                }
            } catch (Exception e) {
                throw m35757(e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static long m35815(AbstractC20745 abstractC20745) {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("state.json");
        if (abstractC20745M46690.mo33971()) {
            try {
                long j = JSON.parse(m35814(abstractC20745M46690)).asObject().getLong("lastAccessedAt", -1L);
                if (j >= 0) {
                    return j;
                }
            } catch (Exception unused) {
            }
            return abstractC20745M46690.mo33991();
        }
        return abstractC20745.mo33991();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C15845 m35854(AbstractC20745 abstractC20745) throws C12731 {
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("state.json");
        if (!abstractC20745M46690.mo33971()) {
            throw m35757(new IOException("Edit session state is missing."));
        }
        try {
            JSONObject jSONObjectAsObject = JSON.parse(m35814(abstractC20745M46690)).asObject();
            int i = jSONObjectAsObject.getInt("revision", -1);
            if (i < 0) {
                throw new NumberFormatException("negative revision");
            }
            long jMo33991 = jSONObjectAsObject.getLong("createdAt", -1L);
            if (jMo33991 < 0) {
                jMo33991 = abstractC20745.mo33991();
            }
            long jM35815 = jSONObjectAsObject.getLong("lastAccessedAt", -1L);
            if (jM35815 < 0) {
                jM35815 = m35815(abstractC20745);
            }
            return new C15845(jMo33991, i, jM35815);
        } catch (Exception e) {
            throw m35757(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private ArrayList m35831(C21956 c21956, AbstractC20745 abstractC20745) {
        int i = m35854(abstractC20745).f51282;
        String str = c21956.f71244;
        String name = abstractC20745.getName();
        C11040 c11040 = this.f48775;
        ArrayList arrayListM27839 = c11040.m27839(i, str, name);
        if (arrayListM27839 != null) {
            return arrayListM27839;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("overlay").m46690("resource_value");
        if (abstractC20745M46690.mo33974()) {
            for (AbstractC20745 abstractC20746 : abstractC20745M46690.mo33983(true)) {
                if (abstractC20746.mo33971() && C17763.m41323(abstractC20746.getName())) {
                    arrayList.add(C17763.m41327(abstractC20746));
                }
            }
        }
        return c11040.m27840(i, c21956.f71244, abstractC20745.getName(), C17763.m41319(arrayList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m35728(AbstractC20745 abstractC20745, C15845 c15845) throws C12731 {
        int i = c15845.f51282;
        if (i == Integer.MAX_VALUE) {
            throw m35757(new IOException("Edit session revision overflow."));
        }
        int i2 = i + 1;
        long j = c15845.f51281;
        m35845(abstractC20745.m46690("state.json"), JSON.object().add("revision", i2).add("createdAt", j).add("lastAccessedAt", System.currentTimeMillis()).toString().getBytes(StandardCharsets.UTF_8), ".state");
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3143 m35747(C21956 c21956, String str, AbstractC20745 abstractC20745, C15283 c15283) throws C12731 {
        if (c15283 == null) {
            return m35746(abstractC20745, c21956.f71244, str);
        }
        Object objM36594 = c15283.m36594("apk.edit.sessionClassView");
        if (objM36594 instanceof C3143) {
            C3143 c3143 = (C3143) objM36594;
            if (c3143.f11855.equals(c21956.f71244) && c3143.f11857.equals(str)) {
                return c3143;
            }
        }
        C3143 c3143M35746 = m35746(abstractC20745, c21956.f71244, str);
        c15283.m36597(c3143M35746, "apk.edit.sessionClassView");
        return c3143M35746;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3143 m35746(AbstractC20745 abstractC20745, String str, String str2) throws C12731 {
        HashMap mapM35813 = m35813(abstractC20745);
        HashMap map = new HashMap();
        for (C10906 c10906 : mapM35813.values()) {
            map.put(c10906.f37095, c10906);
        }
        HashSet hashSet = new HashSet();
        Iterator it = m35863(abstractC20745).iterator();
        while (it.hasNext()) {
            hashSet.add(C21966.m48796(((C20783) it.next()).f67587));
        }
        return new C3143(str, str2, mapM35813, map, hashSet);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35739(C21956 c21956, AbstractC20745 abstractC20745, String str) throws C12731 {
        C10906 c10906 = (C10906) m35813(abstractC20745).get(str);
        if (c10906 != null) {
            return c10906.f37096;
        }
        C20783 c20783M35840 = m35840(abstractC20745, str);
        if (c20783M35840 != null) {
            return c20783M35840.f67588;
        }
        int iM35811 = m35811(c21956, str);
        ArrayList arrayList = c21956.f71224;
        if (iM35811 > 1) {
            throw C12731.m31625("AMBIGUOUS_CLASS_IN_DEX", "Class exists in multiple dex files.");
        }
        if (iM35811 == 1) {
            return m35724(c21956, str).f17547;
        }
        if (arrayList.isEmpty()) {
            throw C12731.m31625("NO_DEX_IN_WORKSPACE", "Workspace has no dex file for new Smali.");
        }
        return (String) C9030.stream(arrayList).max(C2209.m6823()).orElse((String) C19084.m43861(arrayList, 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m35745(AbstractC20745 abstractC20745, C15283 c15283) throws C12731 {
        if (c15283 == null) {
            return m35813(abstractC20745);
        }
        String strM41615 = C17922.m41615(abstractC20745, new StringBuilder("apk.edit.overlayRefs:"));
        Object objM36594 = c15283.m36594(strM41615);
        if (objM36594 != null) {
            return (HashMap) objM36594;
        }
        HashMap mapM35813 = m35813(abstractC20745);
        c15283.m36597(mapM35813, strM41615);
        return mapM35813;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static HashMap m35813(AbstractC20745 abstractC20745) throws C12731 {
        HashMap map = new HashMap();
        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690("overlay").m46690("dex");
        if (abstractC20745M46690.mo33974()) {
            for (AbstractC20745 abstractC20746 : abstractC20745M46690.mo33983(true)) {
                if (abstractC20746.mo33974()) {
                    String name = abstractC20746.getName();
                    for (AbstractC20745 abstractC20747 : abstractC20746.mo33983(true)) {
                        if (!abstractC20747.mo33974() && abstractC20747.getName().endsWith(".smali")) {
                            try {
                                String strM35714 = m35714(abstractC20747);
                                if (!abstractC20747.getName().equals(C18810.m43407(strM35714).concat(".smali"))) {
                                    throw m35755();
                                }
                                map.put(strM35714, new C10906(name, strM35714));
                            } catch (IOException | C12731 unused) {
                                throw m35755();
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static String m35714(AbstractC20745 abstractC20745) throws C12731, IOException {
        String strM35737;
        BufferedReader bufferedReaderM46734 = abstractC20745.m46734();
        do {
            try {
                String line = bufferedReaderM46734.readLine();
                if (line != null) {
                    strM35737 = m35737(line);
                } else {
                    bufferedReaderM46734.close();
                    throw C12731.m31625("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
                }
            } catch (Throwable th) {
                try {
                    bufferedReaderM46734.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (strM35737 == null);
        bufferedReaderM46734.close();
        return strM35737;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m35825(AbstractC20745 abstractC20745, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20783 c20783 = (C20783) it.next();
            jSONArrayArray.add(JSON.object().add("className", c20783.f67587).add("dexEntryName", c20783.f67588));
        }
        abstractC20745.m46690("deleted").m46690("dex.json").m46703(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20783 m35840(AbstractC20745 abstractC20745, String str) {
        for (C20783 c20783 : m35863(abstractC20745)) {
            if (str.equals(c20783.f67587)) {
                return c20783;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m35720(AbstractC20745 abstractC20745, final String str, String str2) throws C12731 {
        ArrayList arrayListM35863 = m35863(abstractC20745);
        C9030.removeIf(arrayListM35863, new Predicate() { // from class: l.֫֫֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C20783) obj).f67587);
            }
        });
        arrayListM35863.add(new C20783(str, str2));
        m35825(abstractC20745, arrayListM35863);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m35861(AbstractC20745 abstractC20745, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19485 c19485 = (C19485) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c19485.f62713).add("target", c19485.f62707).add("className", c19485.f62710).add("dexEntryName", c19485.f62712).add("textHash", c19485.f62709).add("errorCode", c19485.f62708).add("message", c19485.f62715);
            Integer num = c19485.f62711;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c19485.f62714;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC20745.m46690("failures").m46690("dex.json").m46703(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35800(AbstractC20745 abstractC20745, C10906 c10906, String str) {
        for (C19485 c19485 : m35852(abstractC20745)) {
            if (c10906.f37097.equals(c19485.f62710) && c10906.f37096.equals(c19485.f62712) && str.equals(c19485.f62709)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19372 m35770(C21956 c21956, String str, String str2, String str3, String str4) throws C12731 {
        Integer num;
        Integer numValueOf;
        try {
            try {
                C11018 c11018 = new C11018();
                C4344 c4344 = new C4344(this.f48775.m27841(c21956, this, str));
                c4344.m12182(true);
                c4344.m12179(str3);
                c4344.m12181(c11018);
                int size = c11018.size();
                if (size > 2097152) {
                    return new C19372(null, new C19485("axml", str2, null, null, str4, "AXML_ENCODED_TOO_LARGE", "Encoded AXML is too large.", null, null));
                }
                try {
                    return new C19372(new C0321(str4, Arrays.copyOf(c11018.m27788(), size)), null);
                } catch (C4811 e) {
                    e = e;
                    if (e.m13367() != null) {
                        int iM29578 = e.m13367().m29578();
                        int iM29580 = e.m13367().m29580();
                        Integer numValueOf2 = iM29578 > 0 ? Integer.valueOf(iM29578 - 1) : null;
                        numValueOf = iM29580 > 0 ? Integer.valueOf(iM29580 - 1) : null;
                        num = numValueOf2;
                    } else {
                        num = null;
                        numValueOf = null;
                    }
                    return new C19372(null, new C19485("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", num, numValueOf));
                } catch (Exception e2) {
                    e = e2;
                    return new C19372(null, new C19485("axml", str2, null, null, str4, "AXML_ENCODE_FAILED", e.getMessage() != null ? e.getMessage() : "AXML encode failed.", null, null));
                }
            } catch (OutOfMemoryError unused) {
                throw C2664.m8203();
            }
        } catch (C4811 e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17960 m35820(AbstractC20745 abstractC20745, String str, String str2) {
        AbstractC20745 abstractC20745M35821 = m35821(abstractC20745, str);
        if (!abstractC20745M35821.mo33971()) {
            return null;
        }
        try {
            C17367 c17367 = new C17367(abstractC20745M35821.m46727());
            if (c17367.readInt() == 1296384323 && c17367.readInt() == 1 && str.equals(c17367.m40442()) && str2.equals(c17367.m40442())) {
                byte[] bArrM40451 = c17367.m40451();
                if (c17367.available() == 0) {
                    return new C17960(bArrM40451);
                }
            }
        } catch (Exception unused) {
        }
        AbstractC20745 abstractC20745M35822 = m35821(abstractC20745, str);
        if (!abstractC20745M35822.mo33975()) {
            return null;
        }
        abstractC20745M35822.mo24647();
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35780(AbstractC20745 abstractC20745, String str, C0321 c0321) {
        C11018 c11018 = new C11018(c0321.f1697.length + 128);
        c11018.writeInt(1296384323);
        c11018.writeInt(1);
        c11018.m27782((CharSequence) str);
        c11018.m27782((CharSequence) c0321.f1698);
        c11018.m27794(c0321.f1697);
        AbstractC20745 abstractC20745M35821 = m35821(abstractC20745, str);
        abstractC20745M35821.mo46720();
        abstractC20745M35821.m46697(c11018);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35785(AbstractC20745 abstractC20745, C7377 c7377, byte[] bArr, String str, C22713 c22713) throws C12731 {
        C15845 c15845M35854 = m35854(abstractC20745);
        try {
            AbstractC20745 abstractC20745M35771 = m35771(abstractC20745);
            AbstractC20745 abstractC20745M46690 = abstractC20745M35771.m46690("overlay.next");
            String str2 = c7377.f24462;
            String str3 = c7377.f24468;
            boolean zEquals = "dex".equals(str2);
            if (zEquals) {
                abstractC20745M46690.m46703(bArr);
            } else {
                abstractC20745M46690.m46739();
                m35779(abstractC20745M46690.m46690("meta.json"), str3, str, c22713);
                abstractC20745M46690.m46690("axml".equals(str) ? "text.xml" : "data.bin").m46703(bArr);
            }
            m35784(abstractC20745, c7377, abstractC20745M35771);
            AbstractC20745 abstractC20745M35822 = m35822(abstractC20745, c7377);
            abstractC20745M35822.mo46720();
            if (abstractC20745M35822.mo33975() || !abstractC20745M46690.mo24646(abstractC20745M35822)) {
                throw new IOException("Unable to publish text overlay");
            }
            if (zEquals) {
                ArrayList arrayListM35863 = m35863(abstractC20745);
                C9030.removeIf(arrayListM35863, new C14206(str3));
                m35825(abstractC20745, arrayListM35863);
                ArrayList arrayListM35852 = m35852(abstractC20745);
                C9030.removeIf(arrayListM35852, new C17389(1, str3));
                m35861(abstractC20745, arrayListM35852);
            } else {
                ArrayList arrayListM35850 = m35850(abstractC20745);
                arrayListM35850.remove(str3);
                m35721(abstractC20745, arrayListM35850);
                m35860(abstractC20745, str3);
            }
            m35728(abstractC20745, c15845M35854);
            m35844(abstractC20745, c7377);
            m35829(abstractC20745);
        } catch (IOException e) {
            e = e;
            if (0 != 0 || !m35799(abstractC20745, c7377, e)) {
                m35798(abstractC20745, e);
                if (e instanceof C12731) {
                    throw ((C12731) e);
                }
                throw m35757(e);
            }
            C0577.m2747("MT MCP text edit commit completed after storage error, editSessionId=" + abstractC20745.getName(), e);
        } catch (RuntimeException e2) {
            if (!m35848(e2)) {
                throw e2;
            }
            IOException iOException = new IOException("Edit session storage backend failed", e2);
            if (0 == 0 || !m35799(abstractC20745, c7377, iOException)) {
                m35798(abstractC20745, iOException);
                throw m35757(iOException);
            }
            C0577.m2747("MT MCP text edit commit completed after backend error, editSessionId=" + abstractC20745.getName(), e2);
        } catch (C12731 e3) {
            e = e3;
            if (0 != 0) {
            }
            m35798(abstractC20745, e);
            if (e instanceof C12731) {
                throw ((C12731) e);
            }
            throw m35757(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35779(AbstractC20745 abstractC20745, String str, String str2, C22713 c22713) {
        abstractC20745.m46703(C3184.m9603("targetType", str2, "entryName", str).add("encoding", c22713.f73973).add("lineEnding", c22713.f73974).toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static HashMap m35806(AbstractC20745 abstractC20745) throws C12731 {
        HashMap map = new HashMap();
        AbstractC20745 abstractC20745M35859 = m35859(abstractC20745);
        if (abstractC20745M35859.mo33974()) {
            for (AbstractC20745 abstractC20746 : abstractC20745M35859.mo33983(true)) {
                if (abstractC20746.mo33974()) {
                    try {
                        JSONObject jSONObjectAsObject = JSON.parse(m35814(abstractC20746.m46690("meta.json"))).asObject();
                        String string = jSONObjectAsObject.getString("targetType", null);
                        String string2 = jSONObjectAsObject.getString("entryName", null);
                        int i = jSONObjectAsObject.getInt("encoding", C22037.f71424);
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
                        C5966 c5966 = new C5966(string2, i, string, string3);
                        if (!C18810.m43407(string2).equals(abstractC20746.getName())) {
                            throw m35755();
                        }
                        map.put(string2, c5966);
                    } catch (Exception unused) {
                        throw m35755();
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Long m35736(AbstractC20745 abstractC20745, C5966 c5966) {
        String str = c5966.f20320;
        String str2 = c5966.f20323;
        if ("zip_entry".equals(str)) {
            return Long.valueOf(m35859(abstractC20745).m46690(C18810.m43407(str2)).m46690("data.bin").mo33964());
        }
        C17960 c17960M35820 = m35820(abstractC20745, str2, C18810.m43407(m35814(m35859(abstractC20745).m46690(C18810.m43407(str2)).m46690("text.xml"))));
        if (c17960M35820 == null) {
            return null;
        }
        return Long.valueOf(c17960M35820.f57449.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m35744(C21956 c21956, AbstractC20745 abstractC20745) throws C12731 {
        ArrayList<C5966> arrayList = new ArrayList(m35806(abstractC20745).values());
        C23846.sort(arrayList, C7618.comparing(new C13728()));
        ArrayList arrayList2 = new ArrayList();
        for (C5966 c5966 : arrayList) {
            String str = c5966.f20320;
            String str2 = c5966.f20323;
            if ("zip_entry".equals(str)) {
                AbstractC20745 abstractC20745M46690 = m35859(abstractC20745).m46690(C18810.m43407(str2)).m46690("data.bin");
                arrayList2.add(new C15252(m35816(abstractC20745M46690), abstractC20745M46690, str2, m35864(c21956, str2)));
            } else {
                C17960 c17960M35820 = m35820(abstractC20745, str2, C18810.m43407(m35814(m35859(abstractC20745).m46690(C18810.m43407(str2)).m46690("text.xml"))));
                if (c17960M35820 == null) {
                    throw m35757(new IOException("Missing valid AXML cache for build."));
                }
                arrayList2.add(new C15252(str2, m35864(c21956, str2), c17960M35820.f57449));
            }
        }
        ArrayList arrayListM35831 = m35831(c21956, abstractC20745);
        if (!arrayListM35831.isEmpty()) {
            arrayList2.add(new C15252("resources.arsc", m35864(c21956, "resources.arsc"), m35805(c21956, abstractC20745, arrayListM35831)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m35816(AbstractC20745 abstractC20745) throws C12731 {
        try {
            if (!abstractC20745.mo33971()) {
                throw new IOException("ZIP entry overlay data is missing");
            }
            long jMo33964 = abstractC20745.mo33964();
            if (jMo33964 < 0 || jMo33964 > 9007199254740991L) {
                throw new IOException("ZIP entry overlay size is unavailable or unsupported");
            }
            return jMo33964;
        } catch (IOException e) {
            throw m35818(e);
        } catch (RuntimeException e2) {
            if (!m35848(e2)) {
                throw e2;
            }
            throw m35818(e2);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C5022 m35858(C21956 c21956, String str, String str2) throws C12731 {
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2455.getEntry(str2);
                if (entry == null) {
                    throw m35833();
                }
                if (!entry.isDirectory()) {
                    if (m35801(c21956, c2455, entry, str2)) {
                        throw C2664.m8193(c21956.f71244, str, str2);
                    }
                    InputStream inputStreamM7471 = c2455.m7471(entry);
                    try {
                        byte[] bArrM35802 = m35802(inputStreamM7471, 10485776);
                        inputStreamM7471.close();
                        C5022 c5022M35748 = m35748(c21956, str, str2, bArrM35802, bArrM35802.length > 10485760 || (entry.getSize() >= 0 && entry.getSize() > 10485760));
                        c2455.close();
                        return c5022M35748;
                    } catch (Throwable th) {
                        try {
                            inputStreamM7471.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                throw C12731.m31630("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
            } catch (Throwable th3) {
                try {
                    c2455.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw C12731.m31630("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m35846(C21956 c21956, String str, String str2, C14795 c14795) throws C12731 {
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2455.getEntry(str2);
                if (entry == null) {
                    throw m35833();
                }
                if (entry.isDirectory()) {
                    throw C12731.m31630("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                }
                if (entry.getSize() > 2097152) {
                    throw C12731.m31630("AXML_TOO_LARGE", "AXML entry is too large to decode");
                }
                m35791(c21956, str, c2455, entry, str2, c14795);
                c2455.close();
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw C12731.m31630("AXML_DECODE_FAILED", e2.getMessage() == null ? "Failed to decode AXML" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35801(C21956 c21956, C2455 c2455, C12107 c12107, String str) {
        C20222 c20222M48784 = c21956.m48784();
        int iM45719 = c20222M48784.m45719(str);
        if (iM45719 == 2) {
            return true;
        }
        if (iM45719 == 1) {
            return false;
        }
        try {
            InputStream inputStreamM7471 = c2455.m7471(c12107);
            try {
                boolean zM47100 = C20945.m47100(c12107.getSize(), inputStreamM7471);
                c20222M48784.m45721(str, zM47100);
                inputStreamM7471.close();
                c20222M48784.m45720();
                return zM47100;
            } catch (Throwable th) {
                try {
                    inputStreamM7471.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c20222M48784.m45720();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35791(C21956 c21956, String str, C2455 c2455, C12107 c12107, String str2, C14795 c14795) throws IOException {
        C20222 c20222M48784 = c21956.m48784();
        int iM45719 = c20222M48784.m45719(str2);
        if (iM45719 == 1) {
            throw new IOException("Not a binary AXML file");
        }
        C11040 c11040 = this.f48775;
        if (iM45719 == 2) {
            C6110.m16623(c2455, c12107, c11040.m27841(c21956, this, str), c14795);
            return;
        }
        C15989 c15989M45722 = c20222M48784.m45722();
        c15989M45722.m37968(str2);
        try {
            if (!C6110.m16620(c2455, c12107, c11040.m27841(c21956, this, str), c14795, c15989M45722)) {
                throw new IOException("Not a binary AXML file");
            }
            c20222M48784.m45720();
        } catch (Throwable th) {
            c20222M48784.m45720();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m35804(C12107 c12107, C2455 c2455) throws IOException {
        if (c12107.getSize() >= 0 && c12107.getSize() > 10485760) {
            return new byte[10485761];
        }
        InputStream inputStreamM7471 = c2455.m7471(c12107);
        try {
            byte[] bArrM35802 = m35802(inputStreamM7471, 10485761);
            inputStreamM7471.close();
            return bArrM35802;
        } catch (Throwable th) {
            try {
                inputStreamM7471.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C22713 m35823(C21956 c21956, AbstractC20745 abstractC20745, String str) throws C12731 {
        C22713 c22713;
        C5966 c5966 = (C5966) m35806(abstractC20745).get(str);
        if (c5966 != null && "zip_entry".equals(c5966.f20320)) {
            return new C22713(c5966.f20321, c5966.f20322);
        }
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2455.getEntry(str);
                String str2 = "lf";
                if (entry == null || m35850(abstractC20745).contains(str)) {
                    c22713 = new C22713(C22037.f71424, "lf");
                } else {
                    byte[] bArrM35804 = m35804(entry, c2455);
                    if (bArrM35804.length > 10485760) {
                        throw C12731.m31625("ENTRY_TEXT_TOO_LARGE", "ZIP entry text is too large to edit.");
                    }
                    if (bArrM35804.length == 0) {
                        c22713 = new C22713(C22037.f71424, "lf");
                    } else {
                        int iM48954 = C22037.m48954(bArrM35804.length, bArrM35804);
                        if (iM48954 < 0) {
                            iM48954 = C22037.f71424;
                        }
                        String strM24739 = C9754.m24739(bArrM35804, false);
                        if (strM24739 == null) {
                            throw C12731.m31625("NOT_TEXT_ENTRY", "ZIP entry is not text.");
                        }
                        int length = strM24739.length();
                        for (int i = 0; i < length; i++) {
                            char cCharAt = strM24739.charAt(i);
                            if (cCharAt == '\r') {
                                int i2 = i + 1;
                                if (i2 < length && strM24739.charAt(i2) == '\n') {
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
                        C22713 c22714 = new C22713(iM48954, str2);
                        c2455.close();
                        return c22714;
                    }
                }
                c2455.close();
                return c22713;
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12731 e) {
            throw e;
        } catch (Exception e2) {
            throw C12731.m31630("ENTRY_READ_FAILED", e2.getMessage() == null ? "Failed to read entry" : e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35777(C19551 c19551, int i) {
        if (i == C22037.f71431) {
            c19551.write(new byte[]{-17, -69, -65}, 0, 3);
            return;
        }
        if (i == C22037.f71428) {
            c19551.write(new byte[]{-2, -1}, 0, 2);
            return;
        }
        if (i == C22037.f71432) {
            c19551.write(new byte[]{-1, -2}, 0, 2);
        } else if (i == C22037.f71429) {
            c19551.write(new byte[]{0, 0, -2, -1}, 0, 4);
        } else if (i == C22037.f71430) {
            c19551.write(new byte[]{-1, -2, 0, 0}, 0, 4);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5022 m35748(C21956 c21956, String str, String str2, byte[] bArr, boolean z) throws C12731 {
        String strM24739 = C9754.m24739(bArr, z);
        if (strM24739 != null) {
            return new C5022(C7521.m20038(strM24739), z ? "entry_prefix" : "full_source", z, z ? "entry_text_byte_cap" : null, null);
        }
        throw C2664.m8202(c21956.f71244, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8902 m35753(C21956 c21956, AbstractC20745 abstractC20745, C0083 c0083) throws C12731 {
        boolean z;
        String str = c0083.f991;
        String str2 = c0083.f993;
        String str3 = c0083.f992;
        if ("resources.arsc".equals(str2)) {
            throw C12731.m31625("RESOURCE_TABLE_DELETE_UNSUPPORTED", "resources.arsc cannot be deleted.");
        }
        if (C2209.m6822(str2) > 0) {
            throw C12731.m31625("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
        }
        if (m35850(abstractC20745).contains(str2)) {
            throw m35833();
        }
        C5966 c5966 = (C5966) m35806(abstractC20745).get(str2);
        if (c5966 != null && "axml".equals(str3) && !"axml".equals(c5966.f20320)) {
            throw C12731.m31625("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
        }
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2455.getEntry(str2);
                boolean z2 = true;
                if (entry != null) {
                    if (entry.isDirectory()) {
                        throw C12731.m31630("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
                    }
                    if (c5966 == null && "axml".equals(str3) && !m35801(c21956, c2455, entry, str2)) {
                        throw C12731.m31625("NOT_AXML_ENTRY", "ZIP entry is not an editable AXML entry.");
                    }
                    c2455.close();
                    z = true;
                } else {
                    c2455.close();
                    z = false;
                }
                if (c5966 == null && !z) {
                    throw m35833();
                }
                C7377 c7377 = new C7377(Entry.DEFAULT_NAME, str2, null, c5966 != null);
                m35854(abstractC20745);
                try {
                    m35784(abstractC20745, c7377, m35771(abstractC20745));
                    if (z) {
                        ArrayList arrayListM35850 = m35850(abstractC20745);
                        arrayListM35850.remove(str2);
                        arrayListM35850.add(str2);
                        m35721(abstractC20745, arrayListM35850);
                    } else {
                        ArrayList arrayListM35851 = m35850(abstractC20745);
                        arrayListM35851.remove(str2);
                        m35721(abstractC20745, arrayListM35851);
                    }
                    m35860(abstractC20745, str2);
                    m35728(abstractC20745, m35854(abstractC20745));
                    try {
                        m35844(abstractC20745, c7377);
                    } catch (IOException e) {
                        e = e;
                        if (z2 || !m35799(abstractC20745, c7377, e)) {
                            m35798(abstractC20745, e);
                            if (e instanceof C12731) {
                                throw ((C12731) e);
                            }
                            throw m35757(e);
                        }
                        C0577.m2747("MT MCP entry delete commit completed after storage error, editSessionId=".concat(str), e);
                    } catch (C12731 e2) {
                        e = e2;
                        if (z2) {
                        }
                        m35798(abstractC20745, e);
                        if (e instanceof C12731) {
                            throw ((C12731) e);
                        }
                        throw m35757(e);
                    }
                } catch (IOException | C12731 e3) {
                    e = e3;
                    z2 = false;
                }
                m35829(abstractC20745);
                return new C8902(c0083.f990, str, str3, str2);
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C12731 e4) {
            throw e4;
        } catch (Exception e5) {
            throw C12731.m31630("ENTRY_READ_FAILED", e5.getMessage() == null ? "Failed to read entry" : e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m35721(AbstractC20745 abstractC20745, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArrayArray.add(JSON.object().add("entryName", (String) it.next()));
        }
        abstractC20745.m46690("deleted").m46690("entry.json").m46703(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17255 m35837(C21956 c21956, AbstractC20745 abstractC20745, String str) throws C12731 {
        C17255 c17255;
        if (m35850(abstractC20745).contains(str)) {
            return new C17255("missing", true);
        }
        C5966 c5966 = (C5966) m35806(abstractC20745).get(str);
        if (c5966 != null) {
            String str2 = c5966.f20320;
            return (!"zip_entry".equals(str2) || m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("data.bin").mo33964() <= 10485760) ? new C17255(str2, false) : new C17255("too_large", false);
        }
        abstractC20745.getName();
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2455.getEntry(str);
                if (entry == null) {
                    c17255 = new C17255("missing", false);
                } else if (entry.isDirectory()) {
                    c17255 = new C17255("directory", false);
                } else {
                    if (m35801(c21956, c2455, entry, str)) {
                        C17255 c17256 = new C17255("axml", false);
                        c2455.close();
                        return c17256;
                    }
                    byte[] bArrM35804 = m35804(entry, c2455);
                    if (bArrM35804.length > 10485760) {
                        c17255 = new C17255("too_large", false);
                    } else {
                        c17255 = (bArrM35804.length != 0 && C9754.m24739(bArrM35804, false) == null) ? new C17255("binary", false) : new C17255("zip_entry", false);
                    }
                }
                c2455.close();
                return c17255;
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            throw C12731.m31630("ENTRY_READ_FAILED", e.getMessage() == null ? "Failed to read entry" : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m35809(AbstractC20745 abstractC20745, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19485 c19485 = (C19485) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("targetType", c19485.f62713).add("target", c19485.f62707).add("textHash", c19485.f62709).add("errorCode", c19485.f62708).add("message", c19485.f62715);
            Integer num = c19485.f62711;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c19485.f62714;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        abstractC20745.m46690("failures").m46690("entry.json").m46703(jSONArrayArray.toString().getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m35849(AbstractC20745 abstractC20745, String str, String str2) {
        for (C19485 c19485 : m35856(abstractC20745)) {
            if (str.equals(c19485.f62707) && str2.equals(c19485.f62709)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m35860(AbstractC20745 abstractC20745, final String str) throws C12731 {
        ArrayList arrayListM35856 = m35856(abstractC20745);
        C9030.removeIf(arrayListM35856, new Predicate() { // from class: l.ۢ֫֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C19485) obj).f62707);
            }
        });
        m35809(abstractC20745, arrayListM35856);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static AbstractC20745 m35719(AbstractC20745 abstractC20745, String str) {
        return m35859(abstractC20745).m46690(C18810.m43407(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35778(AbstractC20745 abstractC20745, String str) throws IOException {
        AbstractC20745 abstractC20745M46690 = m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("meta.json");
        AbstractC20745 abstractC20745M46691 = m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("text.xml");
        AbstractC20745 abstractC20745M46692 = m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("data.bin");
        if (abstractC20745M46690.mo33975() && !abstractC20745M46690.mo24647()) {
            throw new IOException("Unable to delete entry overlay metadata");
        }
        if (abstractC20745M46691.mo33975() && !abstractC20745M46691.mo24647()) {
            throw new IOException("Unable to delete AXML source overlay");
        }
        if (abstractC20745M46692.mo33975() && !abstractC20745M46692.mo24647()) {
            throw new IOException("Unable to delete ZIP entry data overlay");
        }
        AbstractC20745 abstractC20745M46693 = m35859(abstractC20745).m46690(C18810.m43407(str));
        if (abstractC20745M46693.mo33975() && !abstractC20745M46693.mo24647()) {
            throw new IOException("Unable to delete entry overlay directory");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35781(AbstractC20745 abstractC20745, String str, AbstractC20745 abstractC20746, C22713 c22713) throws C12731 {
        boolean z = false;
        try {
            m35859(abstractC20745).m46690(C18810.m43407(str)).m46739();
            abstractC20746.m46702(m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("data.bin"), false, true, null);
            try {
                m35779(m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("meta.json"), str, "zip_entry", c22713);
                AbstractC20745 abstractC20745M46690 = m35859(abstractC20745).m46690(C18810.m43407(str)).m46690("text.xml");
                if (abstractC20745M46690.mo33975() && !abstractC20745M46690.mo24647()) {
                    throw new IOException("Unable to remove stale AXML source overlay");
                }
                AbstractC20745 abstractC20745M35821 = m35821(abstractC20745, str);
                if (abstractC20745M35821.mo33975()) {
                    abstractC20745M35821.mo24647();
                }
                m35860(abstractC20745, str);
                ArrayList arrayListM35850 = m35850(abstractC20745);
                arrayListM35850.remove(str);
                m35721(abstractC20745, arrayListM35850);
                m35728(abstractC20745, m35854(abstractC20745));
            } catch (Exception e) {
                e = e;
                z = true;
                if (z) {
                    try {
                        m35778(abstractC20745, str);
                    } catch (IOException e2) {
                        e.addSuppressed(e2);
                    }
                }
                throw m35757(new IOException("Failed to publish patched ZIP entry overlay.", e));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m35726(String str) throws C12731 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0) {
            throw C12731.m31626("Invalid entryName", "entryName", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("entryName", "assets/data.bin"));
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m35716(C21956 c21956, String str, String str2) throws C12731 {
        if (str2.endsWith("/")) {
            throw m35762(c21956, str, str2, "directory");
        }
        if ("resources.arsc".equals(str2)) {
            throw m35762(c21956, str, str2, "resources_arsc");
        }
        if (c21956.f71224.contains(str2) || C2209.m6822(str2) > 0) {
            throw m35762(c21956, str, str2, "dex_entry");
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C21488 m35808(C21956 c21956, String str, String str2) throws C12731 {
        C21488 c21488;
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            try {
                C12107 entry = c2455.getEntry(str2);
                if (entry != null) {
                    if (!entry.isDirectory()) {
                        InputStream inputStreamM7471 = c2455.m7471(entry);
                        try {
                            long size = entry.getSize();
                            if (size < 0) {
                                throw new IOException("Workspace entry size is unavailable");
                            }
                            C15139 c15139 = new C15139(inputStreamM7471);
                            boolean zM47100 = C20945.m47100(size, c15139);
                            C15139.m36305(c15139);
                            c21488 = new C21488(true, false, zM47100);
                            inputStreamM7471.close();
                        } catch (Throwable th) {
                            try {
                                inputStreamM7471.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        c21488 = new C21488(true, true, false);
                    }
                } else {
                    c21488 = new C21488(false, false, false);
                }
                c2455.close();
                return c21488;
            } catch (Throwable th3) {
                try {
                    c2455.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception e) {
            throw m35761(c21956, str, str2, e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35797(AbstractC20745 abstractC20745, long j) throws C12731 {
        try {
            InputStream inputStreamMo33970 = abstractC20745.mo33970();
            try {
                if (j < 0) {
                    throw new IOException("Workspace entry size is unavailable");
                }
                C15139 c15139 = new C15139(inputStreamMo33970);
                boolean zM47100 = C20945.m47100(j, c15139);
                C15139.m36305(c15139);
                if (inputStreamMo33970 != null) {
                    inputStreamMo33970.close();
                }
                return zM47100;
            } catch (Throwable th) {
                if (inputStreamMo33970 != null) {
                    try {
                        inputStreamMo33970.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw m35818(e);
        } catch (RuntimeException e2) {
            if (!m35848(e2)) {
                throw e2;
            }
            throw m35818(e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m35731(AbstractC20745 abstractC20745, InterfaceC18428 interfaceC18428, C21956 c21956, String str, String str2) throws C12731 {
        try {
            try {
                C8789 c8789 = new C8789(abstractC20745.mo33976(false));
                try {
                    try {
                        try {
                            long jMo1684 = interfaceC18428.mo1684(c8789);
                            c8789.close();
                            long j = c8789.f30211;
                            if (jMo1684 == j) {
                                if (m35816(abstractC20745) == j) {
                                    return j;
                                }
                                throw m35757(new IOException("ZIP entry candidate size does not match bytes written"));
                            }
                            C12731 c12731M31630 = C12731.m31630("WORKSPACE_ENTRY_SOURCE_INVALID", "Source byte count does not match bytes written.");
                            m35776(c12731M31630, c21956, str, str2);
                            throw c12731M31630;
                        } catch (C3661 e) {
                            throw m35834(e.f13405);
                        }
                    } catch (C0839 unused) {
                        throw m35725(c21956, str, str2);
                    } catch (IOException e2) {
                        throw new C12835(e2);
                    }
                } catch (Throwable th) {
                    try {
                        c8789.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                throw m35834(e3);
            } catch (RuntimeException e4) {
                if (!m35848(e4)) {
                    throw e4;
                }
                throw m35834((Exception) e4);
            }
        } catch (C0839 unused2) {
            throw m35725(c21956, str, str2);
        } catch (C3661 e5) {
            throw m35834(e5.f13405);
        } catch (C6484 e6) {
            throw m35834((Exception) e6.f21875);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m35733(C21956 c21956, String str, String str2, OutputStream outputStream) throws C12731 {
        try {
            C2455 c2455 = new C2455(c21956.m48787());
            Throwable th = null;
            try {
                try {
                    try {
                        C12107 entry = c2455.getEntry(str2);
                        if (entry == null) {
                            C12731 c12731M31625 = C12731.m31625("WORKSPACE_ENTRY_NOT_FOUND", "Workspace ZIP entry was not found.");
                            m35776(c12731M31625, c21956, str, str2);
                            throw c12731M31625;
                        }
                        if (entry.getSize() > 9007199254740991L) {
                            throw m35725(c21956, str, str2);
                        }
                        try {
                            long jM35732 = m35732(c21956, str, str2, c2455.m7471(entry), outputStream);
                            try {
                                c2455.close();
                                return jM35732;
                            } catch (Exception e) {
                                throw m35761(c21956, str, str2, e);
                            }
                        } catch (IOException e2) {
                            throw m35761(c21956, str, str2, e2);
                        } catch (RuntimeException e3) {
                            if (!m35848(e3)) {
                                throw e3;
                            }
                            throw m35761(c21956, str, str2, e3);
                        }
                    } catch (Throwable th2) {
                        try {
                            c2455.close();
                        } catch (Exception e4) {
                            if (0 != 0) {
                                th.addSuppressed(e4);
                            } else {
                                throw m35761(c21956, str, str2, e4);
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
            } catch (C12731 e8) {
                e = e8;
                throw e;
            }
        } catch (Exception e9) {
            throw m35761(c21956, str, str2, e9);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m35732(C21956 c21956, String str, String str2, InputStream inputStream, OutputStream outputStream) throws C12731 {
        try {
            C2250 c2250 = new C2250(inputStream);
            try {
                byte[] bArr = new byte[65536];
                long j = 0;
                while (true) {
                    int i = c2250.read(bArr);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = c2250.read();
                        if (i2 < 0) {
                            break;
                        }
                        if (j == 9007199254740991L) {
                            throw m35725(c21956, str, str2);
                        }
                        outputStream.write(i2);
                        j++;
                    } else {
                        long j2 = i;
                        if (j > 9007199254740991L - j2) {
                            throw m35725(c21956, str, str2);
                        }
                        outputStream.write(bArr, 0, i);
                        j += j2;
                    }
                }
                c2250.close();
                return j;
            } catch (Throwable th) {
                try {
                    c2250.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C5073 e) {
            throw m35761(c21956, str, str2, e.f17673);
        } catch (C22007 e2) {
            throw m35761(c21956, str, str2, e2.f71353);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m35848(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C12731 m35818(Exception exc) {
        C12731 c12731M31630 = C12731.m31630("EDIT_SESSION_STORAGE_FAILED", "Edit session storage failed.");
        c12731M31630.f42468.put("backendReason", exc.getClass().getSimpleName());
        return c12731M31630;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m35834(Exception exc) {
        C12731 c12731M31630 = C12731.m31630("EDIT_SESSION_STORAGE_FAILED", "Edit session storage backend failed");
        c12731M31630.f42468.put("backendReason", exc.getClass().getSimpleName());
        return c12731M31630;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35762(C21956 c21956, String str, String str2, String str3) {
        C12731 c12731M31625 = C12731.m31625("WORKSPACE_ENTRY_UNSUPPORTED", "Workspace ZIP entry is not supported by this copy operation.");
        m35776(c12731M31625, c21956, str, str2);
        c12731M31625.f42468.put("backendReason", str3);
        return c12731M31625;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C12731 m35725(C21956 c21956, String str, String str2) {
        C12731 c12731M31630 = C12731.m31630("WORKSPACE_ENTRY_TOO_LARGE", "Workspace ZIP entry exceeds the supported JSON integer range.");
        m35776(c12731M31630, c21956, str, str2);
        return c12731M31630;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C12731 m35828(C21956 c21956, String str, String str2) {
        C12731 c12731M31625 = C12731.m31625("FILE_OPERATION_STATE_UNKNOWN", "The workspace entry copy may have changed the edit session, but its final state is unknown.");
        m35776(c12731M31625, c21956, str, str2);
        c12731M31625.f42468.put("backendReason", "rollback_failed").put("changed", true).put("operationMode", "atomic").put("stateKnown", false);
        return c12731M31625;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35761(C21956 c21956, String str, String str2, Exception exc) {
        C12731 c12731M31630 = C12731.m31630("WORKSPACE_ENTRY_READ_FAILED", "Failed to read workspace ZIP entry.");
        m35776(c12731M31630, c21956, str, str2);
        c12731M31630.f42468.put("backendReason", exc.getClass().getSimpleName());
        return c12731M31630;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35776(C12731 c12731, C21956 c21956, String str, String str2) {
        c12731.f42468.put("workspaceId", c21956.f71244).put("editSessionId", str == null ? JSON.NULL : JSON.value(str)).put("entryName", str2);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean m35864(C21956 c21956, String str) {
        Iterator it = c21956.f71222.iterator();
        while (it.hasNext()) {
            if (str.equals(((C9878) it.next()).f33725)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m35802(InputStream inputStream, int i) throws IOException {
        C19551 c19551 = new C19551(Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int i2 = inputStream.read(bArr, 0, Math.min(8192, i));
            if (i2 == -1) {
                break;
            }
            c19551.write(bArr, 0, i2);
            i -= i2;
        }
        byte[] bArr2 = c19551.f62829;
        int length = bArr2.length;
        int i3 = c19551.f62830;
        return length == i3 ? bArr2 : Arrays.copyOf(bArr2, i3);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m35833() {
        return C12731.m31625("ENTRY_NOT_FOUND", "ZIP entry not found");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35763(C21956 c21956, String str, C15958 c15958) {
        boolean z;
        ArrayList arrayList = c15958.f51711;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if ("axml".equals(((C19485) it.next()).f62713)) {
                z = true;
                break;
            }
        }
        return m35764(c21956, str, true, z ? "EDIT_TEXT_PREPARE_FAILED_IN_SESSION" : "SMALI_COMPILE_FAILED_IN_SESSION", z ? "Saved edit session has AXML encode failures." : "Smali compile failed in saved edit session.", m35734(arrayList), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35764(C21956 c21956, String str, boolean z, String str2, String str3, JSONArray jSONArray, String str4, String str5) {
        JSONValue jSONValue;
        JSONObject jSONObjectObject = JSON.object();
        if (c21956 != null) {
            jSONObjectObject.add("workspaceId", c21956.f71244);
        }
        if (str != null) {
            jSONObjectObject.add("editSessionId", str);
        }
        if (str4 != null && str5 != null) {
            jSONObjectObject.add("locator", C17638.m41043(str4, str5));
        }
        if (jSONArray != null) {
            jSONObjectObject.add("overlaySaved", z).add("failures", jSONArray);
            if (str4 == null && jSONArray.size() > 0 && (jSONValue = jSONArray.get(0).asObject().get("locator")) != null && !jSONValue.isNull()) {
                jSONObjectObject.add("locator", jSONValue);
            }
        }
        return C12731.m31627(str2, str3, "fatal", JSON.array(), jSONObjectObject);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m35734(ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19485 c19485 = (C19485) it.next();
            JSONObject jSONObjectAdd = JSON.object().add("locator", C17638.m41088(c19485.f62713, c19485.f62707)).add("className", c19485.f62710).add("dexEntryName", c19485.f62712).add("textHash", c19485.f62709).add("errorCode", c19485.f62708).add("message", c19485.f62715);
            Integer num = c19485.f62711;
            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c19485.f62714;
            jSONArrayArray.add(jSONObjectAdd2.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35729(C21956 c21956, AbstractC20745 abstractC20745, final C10906 c10906, String str) throws C12731 {
        final String strM43407 = C18810.m43407(str);
        if (m35838(abstractC20745, c10906, strM43407) != null || m35800(abstractC20745, c10906, strM43407)) {
            return 0;
        }
        C8083 c8083M35752 = m35752(c21956, c10906, str, strM43407);
        C19485 c19485 = c8083M35752.f28310;
        if (c19485 != null) {
            String str2 = c19485.f62715;
            Integer num = c19485.f62711;
            Integer num2 = c19485.f62714;
            try {
                ArrayList arrayListM35852 = m35852(abstractC20745);
                C9030.removeIf(arrayListM35852, new Predicate() { // from class: l.ۚۢ֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C19485 c19486 = (C19485) obj;
                        C10906 c10907 = c10906;
                        if (c10907.f37097.equals(c19486.f62710) && c10907.f37096.equals(c19486.f62712)) {
                            return strM43407.equals(c19486.f62709);
                        }
                        return false;
                    }
                });
                String str3 = c10906.f37097;
                arrayListM35852.add(new C19485("smali_class", str3, str3, c10906.f37096, strM43407, "SMALI_COMPILE_FAILED_IN_SESSION", str2, num, num2));
                m35861(abstractC20745, arrayListM35852);
                return 0;
            } catch (IOException e) {
                throw m35757(e);
            }
        }
        try {
            m35786(abstractC20745, c10906, c8083M35752.f28309);
            try {
                ArrayList arrayListM35853 = m35852(abstractC20745);
                C9030.removeIf(arrayListM35853, new Predicate() { // from class: l.᩹ۢ֨
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C19485 c19486 = (C19485) obj;
                        C10906 c10907 = c10906;
                        if (c10907.f37097.equals(c19486.f62710) && c10907.f37096.equals(c19486.f62712)) {
                            return strM43407.equals(c19486.f62709);
                        }
                        return false;
                    }
                });
                m35861(abstractC20745, arrayListM35853);
                return 1;
            } catch (IOException e2) {
                throw m35757(e2);
            }
        } catch (IOException e3) {
            throw m35757(e3);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static String m35814(AbstractC20745 abstractC20745) throws C12731 {
        try {
            return new String(abstractC20745.m46727(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw m35757(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35787(AbstractC20745 abstractC20745, C14795 c14795) throws C12731 {
        C20927 c20927 = new C20927();
        c20927.m47042(c14795);
        char[] cArr = new char[8192];
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(abstractC20745.mo33970(), StandardCharsets.UTF_8);
            while (true) {
                try {
                    int i = inputStreamReader.read(cArr);
                    if (i == -1) {
                        c20927.m47039();
                        inputStreamReader.close();
                        return;
                    } else {
                        for (int i2 = 0; i2 < i; i2++) {
                            c20927.m47040(cArr[i2]);
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
                throw m35757(e);
            }
        } catch (IOException e) {
            throw m35757(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m35842(AbstractC20745 abstractC20745) {
        if (abstractC20745.mo33975()) {
            abstractC20745.mo24647();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C15958 m35767(C21956 c21956, AbstractC20745 abstractC20745, String str, String str2, String str3, String str4, String str5, String str6) throws C12731 {
        C10200 c10200;
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str2.split("\\n", -1);
        int length = strArrSplit.length;
        if (length > 0 && strArrSplit[length - 1].isEmpty()) {
            length--;
        }
        for (int i = 0; i < length; i++) {
            String strM46498 = strArrSplit[i];
            if (strM46498.endsWith("\r")) {
                strM46498 = C20630.m46498(1, 0, strM46498);
            }
            arrayList.add(strM46498);
        }
        Iterator it = arrayList.iterator();
        String str7 = null;
        while (it.hasNext()) {
            String strM35737 = m35737((String) it.next());
            if (strM35737 != null) {
                if (str7 != null) {
                    throw C12731.m31625("SMALI_CLASS_MISMATCH", "Smali text must contain only one .class directive.");
                }
                str7 = strM35737;
            }
        }
        if (str7 == null) {
            throw C12731.m31625("SMALI_CLASS_MISMATCH", "Smali text must contain a .class directive.");
        }
        if (!str.equals(str7)) {
            throw C12731.m31625("SMALI_CLASS_MISMATCH", "Smali .class descriptor does not match target class.");
        }
        String strM35739 = m35739(c21956, abstractC20745, str);
        C10906 c10906 = new C10906(strM35739, str);
        String strM43407 = C18810.m43407(str2);
        C18666 c18666M35838 = m35838(abstractC20745, c10906, strM43407);
        if (c18666M35838 == null) {
            C8083 c8083M35752 = m35752(c21956, c10906, str2, strM43407);
            C19485 c19485 = c8083M35752.f28310;
            if (c19485 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c19485);
                throw m35764(c21956, str3, false, "SMALI_COMPILE_FAILED_IN_SESSION", "Smali compile failed; edit_text candidate was not saved.", m35734(arrayList2), str4, str5);
            }
            c10200 = c8083M35752.f28309;
        } else {
            c10200 = new C10200(strM43407, c18666M35838.f60591);
        }
        m35785(abstractC20745, new C7377("dex", str, strM35739, m35839(abstractC20745, c10906).mo33971()), str2.getBytes(StandardCharsets.UTF_8), (String) null, (C22713) null);
        try {
            m35786(abstractC20745, c10906, c10200);
        } catch (Exception e) {
            C0577.m2747("MT MCP text edit cache publish failed, editSessionId=".concat(str3), e);
        }
        return m35766(c21956, str3, str4, str5, str6, (C15283) null);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String m35827(String str) {
        if (str == null || str.isEmpty()) {
            throw m35835(str);
        }
        String strM6824 = C2209.m6824(str);
        if (!strM6824.startsWith("L") || !strM6824.endsWith(l.b) || strM6824.length() <= 3 || strM6824.indexOf(92) >= 0 || strM6824.indexOf("..") >= 0 || strM6824.indexOf("//") >= 0 || strM6824.indexOf(91) >= 0 || strM6824.indexOf(40) >= 0 || strM6824.indexOf(41) >= 0 || strM6824.indexOf(59) != strM6824.length() - 1) {
            throw m35835(str);
        }
        String strM46498 = C20630.m46498(1, 1, strM6824);
        if (strM46498.startsWith("/") || strM46498.endsWith("/")) {
            throw m35835(str);
        }
        return strM6824;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m35835(String str) {
        return C12731.m31627("INVALID_SMALI_CLASS_DESCRIPTOR", "Invalid Smali class descriptor.", "fatal", JSON.array(), JSON.object().add("badValue", str == null ? JSON.NULL : JSON.value(str)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C12731 m35819(String str) {
        return C12731.m31626("Invalid targetType", "targetType", JSON.value(str), JSON.array("smali_class", "smali_method", "axml", "zip_entry"), JSON.object().add("targetType", "zip_entry"));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m35717(String str) {
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
    public static C12731 m35755() {
        return C12731.m31630("EDIT_SESSION_STORAGE_FAILED", "Edit session overlay is corrupt.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m35757(Exception exc) {
        return C12731.m31630("EDIT_SESSION_STORAGE_FAILED", exc.getMessage() == null ? "Edit session storage failed." : exc.getMessage());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m35817() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 8).toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35738(String str, int i, int i2, String str2) {
        C11424 c11424;
        if (str.isEmpty()) {
            c11424 = new C11424(new C13541[]{new C13541(str, 0, 0)});
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) == '\n') {
                    arrayList.add(new C13541(str, i3, i4));
                    i3 = i4 + 1;
                }
            }
            if (i3 < str.length()) {
                arrayList.add(new C13541(str, i3, str.length()));
            }
            c11424 = new C11424((C13541[]) arrayList.toArray(new C13541[0]));
        }
        int iM28534 = c11424.m28534();
        int iMax = Math.max(0, Math.min(i, iM28534));
        int iMax2 = Math.max(iMax, Math.min(i2, iM28534));
        if (iMax >= iMax2) {
            return C7521.m20038(str);
        }
        int length = iMax == iM28534 ? str.length() : c11424.m28535(iMax).f44698;
        int i5 = c11424.m28535(iMax2 - 1).f44697;
        if (i5 < str.length() && str.charAt(i5) == '\n') {
            i5++;
        }
        String strM20038 = C7521.m20038(str2);
        StringBuilder sb = new StringBuilder(strM20038.length() + (str.length() - (i5 - length)) + 1);
        sb.append((CharSequence) str, 0, length);
        if (!strM20038.isEmpty()) {
            sb.append(strM20038);
            if (i5 < str.length() && !strM20038.endsWith("\n")) {
                sb.append('\n');
            }
        }
        sb.append((CharSequence) str, i5, str.length());
        return C7521.m20038(sb.toString());
    }
}
