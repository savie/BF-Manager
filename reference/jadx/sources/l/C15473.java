package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R78D */
/* JADX INFO: loaded from: classes4.dex */
public final class C15473 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f50383 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f50384 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f50385 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7972 m37034(C14069 c14069) throws C10186 {
        C7972 c7972 = c14069.f44554;
        if (c7972 != null) {
            return c7972;
        }
        C10186 c10186 = c14069.f44533;
        if (c10186 != null) {
            throw c10186;
        }
        if (!c14069.f44540) {
            C10186 c10186M26305 = C10186.m26305("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
            c14069.f44533 = c10186M26305;
            throw c10186M26305;
        }
        if ("parse_error".equals(c14069.f44550)) {
            String str = c14069.f44545;
            C10186 c10186M26306 = C10186.m26305("RESOURCE_TABLE_PARSE_FAILED", str != null ? str : "Failed to parse resources.arsc");
            c14069.f44533 = c10186M26306;
            throw c10186M26306;
        }
        C2751 c2751 = c14069.f44537;
        if (c2751 == null) {
            C10186 c10186M26307 = C10186.m26305("RESOURCE_TABLE_PARSE_FAILED", "Failed to parse resources.arsc");
            c14069.f44533 = c10186M26307;
            throw c10186M26307;
        }
        try {
            C7972 c7972M21723 = C7972.m21723(c2751);
            c14069.f44554 = c7972M21723;
            return c7972M21723;
        } catch (C10186 e) {
            c14069.f44533 = e;
            throw e;
        } catch (Exception e2) {
            C10186 c10186M26308 = C10186.m26305("RESOURCE_TABLE_PARSE_FAILED", e2.getMessage() != null ? e2.getMessage() : "Failed to parse resources.arsc");
            c14069.f44533 = c10186M26308;
            throw c10186M26308;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7972 m37042(C14069 c14069, C18282 c18282, String str) {
        String strM36182;
        c18282.getClass();
        if (C18282.m42583(str)) {
            return m37034(c14069);
        }
        ArrayList arrayListM42608 = c18282.m42608(c14069, str);
        if (arrayListM42608.isEmpty()) {
            return m37034(c14069);
        }
        if (c14069.f44537 == null) {
            return m37034(c14069);
        }
        String str2 = c14069.f44556 + ":" + str + ":";
        synchronized (this.f50385) {
            C19949 c19949 = (C19949) this.f50384.get(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (c19949 != null) {
                strM36182 = c19949.f64147;
            } else {
                strM36182 = C15022.m36182(C1260.m4573(arrayListM42608, new byte[32]));
            }
            sb.append(strM36182);
            String string = sb.toString();
            C7972 c7972 = (C7972) this.f50383.get(string);
            if (c7972 != null) {
                return c7972;
            }
            C7972 c7972M21724 = C7972.m21724(c14069.f44537, arrayListM42608);
            synchronized (this.f50385) {
                C7972 c7973 = (C7972) this.f50383.get(string);
                if (c7973 != null) {
                    return c7973;
                }
                this.f50383.put(string, c7972M21724);
                return c7972M21724;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37041(String str, String str2) {
        m37036(str + ":" + str2 + ":");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37040(String str) {
        m37036(C14483.m34972(str, ":"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m37037(int i, String str, String str2) {
        String str3 = str + ":" + str2 + ":";
        synchronized (this.f50385) {
            C19949 c19949 = (C19949) this.f50384.get(str3);
            if (c19949 == null) {
                return null;
            }
            if (c19949.f64148 != i) {
                this.f50384.remove(str3);
                return null;
            }
            return new ArrayList(c19949.f64149);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m37038(int i, String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2;
        String str3 = str + ":" + str2 + ":";
        String strM36182 = C15022.m36182(C1260.m4573(arrayList, new byte[32]));
        synchronized (this.f50385) {
            C7972 c7972 = (C7972) this.f50383.get(str3 + strM36182);
            ArrayList arrayList3 = c7972 == null ? new ArrayList(arrayList) : c7972.m21758();
            this.f50384.put(str3, new C19949(i, strM36182, arrayList3));
            arrayList2 = new ArrayList(arrayList3);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m37036(String str) {
        synchronized (this.f50385) {
            Iterator it = this.f50383.keySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(str)) {
                    it.remove();
                }
            }
            C1170.removeIf(this.f50384.keySet(), new C12730(1, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37035(C14069 c14069, C10186 c10186) {
        String str = c10186.f32601;
        if ("RESOURCE_TABLE_UNAVAILABLE".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) {
            c14069.f44554 = null;
            c14069.f44533 = c10186;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21246 m37039(C14069 c14069, C18282 c18282, String str) {
        if (!c14069.f44541.f30674) {
            return new C21246();
        }
        try {
            return m37042(c14069, c18282, str).m21755();
        } catch (RuntimeException unused) {
            return new C21246();
        } catch (C10186 e) {
            if (C18282.m42583(str)) {
                m37035(c14069, e);
            }
            return new C21246();
        }
    }
}
