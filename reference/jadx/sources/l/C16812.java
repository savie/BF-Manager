package l;

import bin.mt.json.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3791 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16812 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22780 f54240;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2446 f54241;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f54242 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20893 f54243;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15473 f54244;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22034 f54245;

    public C16812(C20893 c20893, C22780 c22780, C22034 c22034, C2446 c2446, C15473 c15473) {
        this.f54243 = c20893;
        this.f54240 = c22780;
        this.f54245 = c22034;
        this.f54241 = c2446;
        this.f54244 = c15473;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14069 m39717(String str) {
        C22780 c22780 = this.f54240;
        c22780.getClass();
        m39705(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = this.f54242;
        C14069 c14069 = (C14069) linkedHashMap.get(str);
        C20893 c20893 = this.f54243;
        if (c14069 != null) {
            m39709(c14069);
            long jCurrentTimeMillis = System.currentTimeMillis();
            c14069.f44546 = jCurrentTimeMillis;
            try {
                AbstractC22044 abstractC22044 = c14069.f44536;
                c20893.getClass();
                C20893.m47740(abstractC22044, jCurrentTimeMillis);
            } catch (IOException unused) {
            }
            m39710(c14069);
            return c14069;
        }
        try {
            C16417 c16417M47751 = c20893.m47751(str);
            if (c16417M47751.f53275) {
                throw C10186.m26304(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
            }
            C14069 c14069M49820 = this.f54245.m49820(c20893.m47758(c16417M47751.f53281));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c14069M49820.f44546 = jCurrentTimeMillis2;
            try {
                AbstractC22044 abstractC22045 = c14069M49820.f44536;
                c20893.getClass();
                C20893.m47740(abstractC22045, jCurrentTimeMillis2);
            } catch (IOException unused2) {
            }
            linkedHashMap.put(c14069M49820.f44556, c14069M49820);
            c22780.getClass();
            m39705(System.currentTimeMillis());
            m39706(false);
            m39706(true);
            m39710(c14069M49820);
            int i = C24294.f78630;
            return c14069M49820;
        } catch (Throwable th) {
            int i2 = C24294.f78630;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39712(C14069 c14069) {
        this.f54242.put(c14069.f44556, c14069);
        m39710(c14069);
        this.f54240.getClass();
        m39705(System.currentTimeMillis());
        m39706(false);
        m39706(true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14069 m39719(String str) {
        this.f54240.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m39705(jCurrentTimeMillis);
        C14069 c14069 = (C14069) this.f54242.get(str);
        if (c14069 == null) {
            return m39717(str);
        }
        m39709(c14069);
        c14069.f44546 = jCurrentTimeMillis;
        try {
            C20893 c20893 = this.f54243;
            AbstractC22044 abstractC22044 = c14069.f44536;
            c20893.getClass();
            C20893.m47740(abstractC22044, jCurrentTimeMillis);
        } catch (IOException unused) {
        }
        m39710(c14069);
        return c14069;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m39710(C14069 c14069) {
        C7139 c7139 = c14069.f44547;
        String str = c7139.f23603;
        if (str == null && (str = c7139.f23610) == null) {
            str = c7139.f23607;
        }
        String str2 = c14069.f44548;
        C10801.m27509(c14069.f44556, str, str2 == null ? "" : C18063.m42088(47, 1, str2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39713(C16417 c16417) {
        String str = c16417.f53281;
        if (C10801.m27514()) {
            C14069 c14069 = (C14069) this.f54242.get(str);
            if (c14069 != null) {
                m39710(c14069);
                return;
            }
            String str2 = null;
            try {
                C20893 c20893 = this.f54243;
                AbstractC22044 abstractC22044 = c16417.f53271;
                c20893.getClass();
                C22941 c22941 = new C22941(abstractC22044.m49876("original.apk"), new C14483(7));
                try {
                    C7139 c7139M14551 = C4684.m14551(c22941);
                    String str3 = c7139M14551.f23603;
                    if (str3 == null && (str3 = c7139M14551.f23610) == null) {
                        str2 = c7139M14551.f23607;
                    } else {
                        str2 = str3;
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
            } catch (Exception unused) {
            }
            String str4 = c16417.f53276;
            C10801.m27509(str, str2, str4 == null ? "" : C18063.m42088(47, 1, str4));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14069 m39711(String str) {
        C14069 c14069 = (C14069) this.f54242.get(str);
        if (c14069 == null || c14069.f44555) {
            return null;
        }
        return c14069;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m39716(String str) {
        C14069 c14069 = (C14069) this.f54242.get(str);
        if (c14069 != null) {
            this.f54241.m8266(c14069);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m39714(String str) {
        C14069 c14069M39708 = m39708(str);
        if (c14069M39708 == null) {
            return;
        }
        c14069M39708.f44555 = true;
        this.f54241.m8268(c14069M39708);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C14069 m39708(String str) {
        this.f54244.m37040(str);
        return (C14069) this.f54242.remove(str);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m39709(C14069 c14069) throws C10186 {
        boolean z = c14069.f44555;
        String str = c14069.f44556;
        if (z) {
            throw c14069.f44534;
        }
        try {
            this.f54243.m47758(str);
            if (c14069.f44555) {
                throw c14069.f44534;
            }
        } catch (C10186 e) {
            c14069.f44555 = true;
            c14069.f44534 = e;
            this.f54244.m37040(str);
            C2446 c2446 = this.f54241;
            c2446.m8268(c14069);
            if (!c2446.m8265(str) && this.f54242.get(str) == c14069) {
                m39708(str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39706(boolean z) {
        LinkedHashMap linkedHashMap = this.f54242;
        Iterator it = linkedHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C14069) it.next()).f44531 == z) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        while (i > 2) {
            String str = null;
            long j = Long.MAX_VALUE;
            C14069 c14069 = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C14069) entry.getValue()).f44531 == z && !hashSet.contains(entry.getKey())) {
                    if (!this.f54241.m8265((String) entry.getKey()) && ((C14069) entry.getValue()).f44546 < j) {
                        j = ((C14069) entry.getValue()).f44546;
                        str = (String) entry.getKey();
                        c14069 = (C14069) entry.getValue();
                    }
                }
            }
            if (str == null) {
                return;
            }
            if (z && !m39707(c14069)) {
                hashSet.add(str);
            } else {
                m39708(str);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39705(long j) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f54242.entrySet()) {
            C14069 c14069 = (C14069) entry.getValue();
            if (c14069.f44531 && j - c14069.f44546 > 600000) {
                if (!this.f54241.m8265((String) entry.getKey()) && m39707(c14069)) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m39708((String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m39707(C14069 c14069) {
        try {
            C20893 c20893 = this.f54243;
            AbstractC22044 abstractC22044 = c14069.f44536;
            c20893.getClass();
            C20893.m47744(abstractC22044);
            c14069.f44555 = true;
            this.f54241.m8268(c14069);
            C22099.m50062();
            return true;
        } catch (IOException e) {
            C20653.m47272("MT MCP temporary workspace eviction delete failed, workspaceId=" + c14069.f44556, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39715(String str) {
        try {
            C6394 c6394 = new C6394(this.f54243, new Consumer() { // from class: l.᩻ۨۚ
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    C16812 c16812 = this.f80961;
                    c16812.getClass();
                    c16812.m39716(((C12359) obj).f39698);
                }
            });
            AbstractC11810.m29655();
            int iM25689 = C9881.m25689();
            this.f54240.getClass();
            Iterator it = c6394.m18147(str, iM25689, System.currentTimeMillis()).iterator();
            while (it.hasNext()) {
                m39708((String) it.next());
            }
        } catch (Exception e) {
            C20653.m47272("MT MCP session cleanup failed", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39718(C14069 c14069) {
        boolean z = c14069.f44555;
        String str = c14069.f44556;
        if (z && this.f54242.get(str) == c14069 && !this.f54241.m8265(str)) {
            m39708(str);
        }
    }
}
