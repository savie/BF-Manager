package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.google.android.material.badge.BadgeDrawable;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩸ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56G1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22977 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5823 f74615;

    public C22977(C5823 c5823) {
        this.f74615 = c5823;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m51858(C3767 c3767) {
        try {
            this.f74615.m17000(c3767);
            return null;
        } catch (C10186 e) {
            return m51855(m51856(e), C5823.m16992(e));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18683 m51859(C3767 c3767) {
        C5823 c5823 = this.f74615;
        try {
            C15517 c15517M17007 = c5823.m17007(c3767);
            if (c15517M17007 == null) {
                return m51855(EnumC21667.OK, C15300.m36728(c5823.m16999(c5823.m17000(c3767)), JSON.array()));
            }
            if (c15517M17007.f50500.f42428) {
                C18683 c18683M51857 = m51857(c15517M17007);
                c5823.m17008(c15517M17007);
                return c18683M51857;
            }
            return m51854(c15517M17007);
        } catch (IOException | RuntimeException unused) {
            e = C10186.m26305("TRANSFER_IO_ERROR", "File transfer could not complete; query its recorded result.");
            if (0 != 0) {
                c5823.m17005((C15517) null, e);
                c5823.m17008((C15517) null);
            }
            return m51855(m51856(e), C5823.m16992(e));
        } catch (C10186 e) {
            e = e;
            if (0 != 0) {
                c5823.m17005((C15517) null, e);
                c5823.m17008((C15517) null);
            }
            return m51855(m51856(e), C5823.m16992(e));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C18683 m51857(C15517 c15517) {
        C5823 c5823 = this.f74615;
        C13280 c13280 = c15517.f50500;
        try {
            C21463 c21463M2663 = c5823.f20032.m2663(c13280.f42432, c13280.f42420, new C5077(this, c13280, c15517));
            c5823.m17004(c15517, (String) c21463M2663.f68565, c21463M2663.f68562);
            return m51855(EnumC21667.OK, C15300.m36728(c5823.m16999(c13280), JSON.array()));
        } catch (C10186 e) {
            c5823.m17005(c15517, e);
            return m51855(m51856(e), JSON.object().add("ok", false).add(e.m, JSON.NULL).add(d.O, c5823.m16999(c13280).getJSONObject(d.O)).add("nextActions", JSON.array()));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18683 m51854(C15517 c15517) throws Throwable {
        C13280 c13280 = c15517.f50500;
        C19225 c19225M50228 = this.f74615.f20037.m50228(c13280.f42432);
        InputStream inputStream = null;
        try {
            this.f74615.m17002(c15517);
            long jM16996 = this.f74615.m16996(c13280.f42432, false, false);
            boolean z = c15517.f50499.m12226() == EnumC12716.HEAD;
            if (!z) {
                synchronized (this.f74615) {
                    c13280.f42424 = jM16996;
                }
            }
            InputStream inputStreamMo4290 = z ? null : this.f74615.f20037.m50232(c13280.f42432).mo4290();
            try {
                C11042 c11042 = new C11042(this, c15517, inputStreamMo4290, c19225M50228, jM16996, z);
                c11042.m43440("Content-Length", Long.toString(jM16996));
                c11042.m43440("Cache-Control", "no-store");
                c11042.m43440("Accept-Ranges", "none");
                c11042.m43440("X-Content-Type-Options", "nosniff");
                String str = c13280.f42432;
                c11042.m43440("Content-Disposition", "attachment; filename=\"download\"; filename*=UTF-8''" + C22837.encode(str.substring(str.lastIndexOf(47) + 1), a.D).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20"));
                c11042.m43438();
                return c11042;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamMo4290;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } finally {
                        c19225M50228.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21667 m51856(C10186 c10186) {
        String str = c10186.f32601;
        str.getClass();
        switch (str) {
            case "FILE_ALREADY_EXISTS":
            case "TRANSFER_LIMIT":
            case "TRANSFER_BUSY":
                return EnumC21667.CONFLICT;
            case "FILE_ACCESS_DENIED":
            case "TRANSFER_REVOKED":
                return EnumC21667.FORBIDDEN;
            case "TRANSFER_UNAUTHORIZED":
                return EnumC21667.UNAUTHORIZED;
            case "TRANSFER_NOT_FOUND":
            case "TRANSFER_GONE":
                return EnumC21667.NOT_FOUND;
            case "TRANSFER_METHOD":
                return EnumC21667.METHOD_NOT_ALLOWED;
            case "TRANSFER_LENGTH_REQUIRED":
                return EnumC21667.LENGTH_REQUIRED;
            default:
                return c10186.f32600 ? EnumC21667.BAD_REQUEST : EnumC21667.INTERNAL_ERROR;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18683 m51855(EnumC21667 enumC21667, JSONObject jSONObject) {
        C18683 c18683M5422 = AbstractC1530.m5422(enumC21667, "application/json; charset=utf-8", jSONObject.toString());
        c18683M5422.m43440("Cache-Control", "no-store");
        c18683M5422.m43438();
        return c18683M5422;
    }
}
