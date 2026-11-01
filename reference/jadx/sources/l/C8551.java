package l;

import bin.mt.json.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۡ֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 3791 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8551 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12784 f29575;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6433 f29576;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7221 f29577;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7149 f29578;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11040 f29579;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f29580 = new LinkedHashMap();

    public C8551(C7221 c7221, C6433 c6433, C12784 c12784, C7149 c7149, C11040 c11040) {
        this.f29577 = c7221;
        this.f29576 = c6433;
        this.f29575 = c12784;
        this.f29578 = c7149;
        this.f29579 = c11040;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21956 m22311(String str) {
        C6433 c6433 = this.f29576;
        c6433.getClass();
        m22303(System.currentTimeMillis());
        LinkedHashMap linkedHashMap = this.f29580;
        C21956 c21956 = (C21956) linkedHashMap.get(str);
        C7221 c7221 = this.f29577;
        if (c21956 != null) {
            m22302(c21956);
            long jCurrentTimeMillis = System.currentTimeMillis();
            c21956.f71234 = jCurrentTimeMillis;
            try {
                AbstractC20745 abstractC20745 = c21956.f71232;
                c7221.getClass();
                C7221.m19192(abstractC20745, jCurrentTimeMillis);
            } catch (IOException unused) {
            }
            return c21956;
        }
        try {
            C19216 c19216M19201 = c7221.m19201(str);
            if (c19216M19201.f62065) {
                throw C12731.m31629(JSON.array(), "TEMPORARY_WORKSPACE_REOPEN_UNSUPPORTED", "Temporary workspaces cannot be reopened. Open the APK path again instead.", "fatal");
            }
            C21956 c21956M31767 = this.f29575.m31767(c7221.m19208(c19216M19201.f62066));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c21956M31767.f71234 = jCurrentTimeMillis2;
            try {
                AbstractC20745 abstractC20746 = c21956M31767.f71232;
                c7221.getClass();
                C7221.m19192(abstractC20746, jCurrentTimeMillis2);
            } catch (IOException unused2) {
            }
            linkedHashMap.put(c21956M31767.f71244, c21956M31767);
            c6433.getClass();
            m22303(System.currentTimeMillis());
            m22304(false);
            m22304(true);
            int i = C23044.f74862;
            return c21956M31767;
        } catch (Throwable th) {
            int i2 = C23044.f74862;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22308(C21956 c21956) {
        this.f29580.put(c21956.f71244, c21956);
        this.f29576.getClass();
        m22303(System.currentTimeMillis());
        m22304(false);
        m22304(true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21956 m22306(String str) {
        this.f29576.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        m22303(jCurrentTimeMillis);
        C21956 c21956 = (C21956) this.f29580.get(str);
        if (c21956 == null) {
            return m22311(str);
        }
        m22302(c21956);
        c21956.f71234 = jCurrentTimeMillis;
        try {
            C7221 c7221 = this.f29577;
            AbstractC20745 abstractC20745 = c21956.f71232;
            c7221.getClass();
            C7221.m19192(abstractC20745, jCurrentTimeMillis);
        } catch (IOException unused) {
        }
        return c21956;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21956 m22307(String str) {
        C21956 c21956 = (C21956) this.f29580.get(str);
        if (c21956 == null || c21956.f71226) {
            return null;
        }
        return c21956;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m22309(String str) {
        C21956 c21956 = (C21956) this.f29580.get(str);
        if (c21956 != null) {
            this.f29578.m19075(c21956);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22310(String str) {
        C21956 c21956M22301 = m22301(str);
        if (c21956M22301 == null) {
            return;
        }
        c21956M22301.f71226 = true;
        this.f29578.m19077(c21956M22301);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C21956 m22301(String str) {
        this.f29579.m27842(str);
        return (C21956) this.f29580.remove(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22302(C21956 c21956) throws C12731 {
        boolean z = c21956.f71226;
        String str = c21956.f71244;
        if (z) {
            throw c21956.f71241;
        }
        try {
            this.f29577.m19208(str);
            if (c21956.f71226) {
                throw c21956.f71241;
            }
        } catch (C12731 e) {
            c21956.f71226 = true;
            c21956.f71241 = e;
            this.f29579.m27842(str);
            C7149 c7149 = this.f29578;
            c7149.m19077(c21956);
            if (!c7149.m19074(str) && this.f29580.get(str) == c21956) {
                m22301(str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22304(boolean z) {
        LinkedHashMap linkedHashMap = this.f29580;
        Iterator it = linkedHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C21956) it.next()).f71236 == z) {
                i++;
            }
        }
        HashSet hashSet = new HashSet();
        while (i > 2) {
            String str = null;
            long j = Long.MAX_VALUE;
            C21956 c21956 = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C21956) entry.getValue()).f71236 == z && !hashSet.contains(entry.getKey())) {
                    if (!this.f29578.m19074((String) entry.getKey()) && ((C21956) entry.getValue()).f71234 < j) {
                        j = ((C21956) entry.getValue()).f71234;
                        str = (String) entry.getKey();
                        c21956 = (C21956) entry.getValue();
                    }
                }
            }
            if (str == null) {
                return;
            }
            if (z && !m22305(c21956)) {
                hashSet.add(str);
            } else {
                m22301(str);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m22303(long j) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f29580.entrySet()) {
            C21956 c21956 = (C21956) entry.getValue();
            if (c21956.f71236 && j - c21956.f71234 > 600000) {
                if (!this.f29578.m19074((String) entry.getKey()) && m22305(c21956)) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m22301((String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private boolean m22305(C21956 c21956) {
        try {
            C7221 c7221 = this.f29577;
            AbstractC20745 abstractC20745 = c21956.f71232;
            c7221.getClass();
            C7221.m19197(abstractC20745);
            c21956.f71226 = true;
            this.f29578.m19077(c21956);
            C15157.m36345();
            return true;
        } catch (IOException e) {
            C0577.m2747("MT MCP temporary workspace eviction delete failed, workspaceId=" + c21956.f71244, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m22313(String str) {
        try {
            C6815 c6815 = new C6815(this.f29577, new C15766(1, this));
            C2664.m8195();
            int iM2137 = C0403.m2137();
            this.f29576.getClass();
            Iterator it = c6815.m18419(str, iM2137, System.currentTimeMillis()).iterator();
            while (it.hasNext()) {
                m22301((String) it.next());
            }
        } catch (Exception e) {
            C0577.m2747("MT MCP session cleanup failed", e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22312(C21956 c21956) {
        boolean z = c21956.f71226;
        String str = c21956.f71244;
        if (z && this.f29580.get(str) == c21956 && !this.f29578.m19074(str)) {
            m22301(str);
        }
    }
}
