package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R78D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11040 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f37503 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f37504 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f37505 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22703 m27836(C21956 c21956) throws C12731 {
        C22703 c22703 = c21956.f71238;
        if (c22703 != null) {
            return c22703;
        }
        C12731 c12731 = c21956.f71227;
        if (c12731 != null) {
            throw c12731;
        }
        if (!c21956.f71225) {
            C12731 c12731M31630 = C12731.m31630("RESOURCE_TABLE_UNAVAILABLE", "Resource table is unavailable.");
            c21956.f71227 = c12731M31630;
            throw c12731M31630;
        }
        if ("parse_error".equals(c21956.f71239)) {
            String str = c21956.f71237;
            C12731 c12731M31631 = C12731.m31630("RESOURCE_TABLE_PARSE_FAILED", str != null ? str : "Failed to parse resources.arsc");
            c21956.f71227 = c12731M31631;
            throw c12731M31631;
        }
        C7886 c7886 = c21956.f71229;
        if (c7886 == null) {
            C12731 c12731M31632 = C12731.m31630("RESOURCE_TABLE_PARSE_FAILED", "Failed to parse resources.arsc");
            c21956.f71227 = c12731M31632;
            throw c12731M31632;
        }
        try {
            C22703 c22703M50290 = C22703.m50290(c7886);
            c21956.f71238 = c22703M50290;
            return c22703M50290;
        } catch (C12731 e) {
            c21956.f71227 = e;
            throw e;
        } catch (Exception e2) {
            C12731 c12731M31633 = C12731.m31630("RESOURCE_TABLE_PARSE_FAILED", e2.getMessage() != null ? e2.getMessage() : "Failed to parse resources.arsc");
            c21956.f71227 = c12731M31633;
            throw c12731M31633;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22703 m27844(C21956 c21956, C14952 c14952, String str) {
        String strM49424;
        c14952.getClass();
        if (C14952.m35723(str)) {
            return m27836(c21956);
        }
        ArrayList arrayListM35893 = c14952.m35893(c21956, str);
        if (arrayListM35893.isEmpty()) {
            return m27836(c21956);
        }
        if (c21956.f71229 == null) {
            return m27836(c21956);
        }
        String str2 = c21956.f71244 + ":" + str + ":";
        synchronized (this.f37505) {
            C6100 c6100 = (C6100) this.f37504.get(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            if (c6100 != null) {
                strM49424 = c6100.f20666;
            } else {
                strM49424 = C22253.m49424(C17763.m41325(arrayListM35893, new byte[32]));
            }
            sb.append(strM49424);
            String string = sb.toString();
            C22703 c22703 = (C22703) this.f37503.get(string);
            if (c22703 != null) {
                return c22703;
            }
            C22703 c22703M50291 = C22703.m50291(c21956.f71229, arrayListM35893);
            synchronized (this.f37505) {
                C22703 c22704 = (C22703) this.f37503.get(string);
                if (c22704 != null) {
                    return c22704;
                }
                this.f37503.put(string, c22703M50291);
                return c22703M50291;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27843(String str, String str2) {
        m27838(str + ":" + str2 + ":");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27842(String str) {
        m27838(C15489.m37076(str, ":"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27839(int i, String str, String str2) {
        String str3 = str + ":" + str2 + ":";
        synchronized (this.f37505) {
            C6100 c6100 = (C6100) this.f37504.get(str3);
            if (c6100 == null) {
                return null;
            }
            if (c6100.f20667 != i) {
                this.f37504.remove(str3);
                return null;
            }
            return new ArrayList(c6100.f20668);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27840(int i, String str, String str2, ArrayList arrayList) {
        ArrayList arrayList2;
        String str3 = str + ":" + str2 + ":";
        String strM49424 = C22253.m49424(C17763.m41325(arrayList, new byte[32]));
        synchronized (this.f37505) {
            C22703 c22703 = (C22703) this.f37503.get(str3 + strM49424);
            ArrayList arrayList3 = c22703 == null ? new ArrayList(arrayList) : c22703.m50309();
            this.f37504.put(str3, new C6100(i, strM49424, arrayList3));
            arrayList2 = new ArrayList(arrayList3);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m27838(String str) {
        synchronized (this.f37505) {
            Iterator it = this.f37503.keySet().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(str)) {
                    it.remove();
                }
            }
            C9030.removeIf(this.f37504.keySet(), new C17389(0, str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27837(C21956 c21956, C12731 c12731) {
        String str = c12731.f42472;
        if ("RESOURCE_TABLE_UNAVAILABLE".equals(str) || "RESOURCE_TABLE_PARSE_FAILED".equals(str)) {
            c21956.f71238 = null;
            c21956.f71227 = c12731;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6037 m27841(C21956 c21956, C14952 c14952, String str) {
        if (!c21956.f71228.f58847) {
            return new C6037();
        }
        try {
            return m27844(c21956, c14952, str).m50313();
        } catch (RuntimeException unused) {
            return new C6037();
        } catch (C12731 e) {
            if (C14952.m35723(str)) {
                m27837(c21956, e);
            }
            return new C6037();
        }
    }
}
