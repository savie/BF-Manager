package l;

import android.os.SystemClock;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۜ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56BZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C7402 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24387;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f24388;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C10801 f24389;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f24391;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f24393;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f24394;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f24395;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f24396;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f24398;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f24399;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f24400;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f24401;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24402;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f24403;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f24404;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f24405;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f24390 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f24392 = "";

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC4836 f24397 = EnumC4836.RUNNING;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7402 f24386 = (C7402) C10801.f34266.get();

    public C7402(C10801 c10801, long j, String str, JSONObject jSONObject, long j2) {
        this.f24389 = c10801;
        this.f24394 = j;
        this.f24403 = C4967.m15164(128, str);
        this.f24405 = j2;
        this.f24396 = C7336.m20126(jSONObject, str);
        String strM15167 = C4967.m15167(jSONObject, "workspaceId");
        this.f24404 = strM15167;
        this.f24398 = C7336.m20128(jSONObject, str);
        this.f24391 = C7336.m20117(jSONObject, str);
        String str2 = (String) c10801.f34278.get(strM15167);
        m20316(str2, str2 != null ? str2 : "");
        this.f24401 = C7336.m20124(jSONObject, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20316(String str, String str2) {
        this.f24388 = str;
        String str3 = this.f24403;
        if (str3.equals("mt_apk_build")) {
            if (this.f24402) {
                return;
            }
            if (str == null) {
                str = "";
            }
            this.f24398 = str;
            return;
        }
        String strM15164 = this.f24398;
        switch (str3) {
            case "mt_apk_workspace_delete":
            case "mt_apk_session_create":
            case "mt_apk_session_check":
                strM15164 = C4967.m15164(512, str2);
                break;
        }
        this.f24398 = strM15164;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20315(JSONObject jSONObject) {
        synchronized (this.f24389) {
            this.f24398 = C7336.m20113(jSONObject, this.f24403, this.f24398);
            this.f24396 = C7336.m20131(this.f24396, jSONObject, this.f24403);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20317(String str, boolean z) {
        synchronized (this.f24389) {
            if (this.f24399) {
                return;
            }
            ((C9732) this.f24389.f34277).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f24395 = jElapsedRealtime;
            if (this.f24387 > 0) {
                this.f24400 += Math.max(0L, jElapsedRealtime - this.f24393);
            }
            this.f24387 = 0;
            this.f24392 = C4967.m15164(4096, str);
            this.f24397 = z ? EnumC4836.SUCCEEDED : EnumC4836.FAILED;
            this.f24399 = true;
            this.f24389.f34269.remove(Long.valueOf(this.f24394));
            C14113 c14113 = new C14113(this);
            this.f24389.f34275.put(Long.valueOf(this.f24394), c14113);
            this.f24389.f34274 += C14113.m34262(c14113);
            while (true) {
                if (this.f24389.f34275.size() <= this.f24389.f34273 && this.f24389.f34274 <= this.f24389.f34276) {
                    break;
                }
                this.f24389.f34274 -= C14113.m34262((C14113) this.f24389.f34275.pollFirstEntry().getValue());
            }
            this.f24389.m27520();
            if (this.f24386 == null) {
                C10801.f34266.remove();
            } else {
                C10801.f34266.set(this.f24386);
            }
        }
    }
}
