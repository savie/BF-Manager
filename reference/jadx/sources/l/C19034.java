package l;

import org.bouncycastle.i18n.ErrorBundle;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19034 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f61658 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f61659;

    public C19034(InterfaceC9801 interfaceC9801) {
        this.f61659 = interfaceC9801;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m44115(C2343 c2343, String str) {
        String str2;
        if (c2343 == null || (str2 = c2343.f7558) == null) {
            return null;
        }
        return C15022.m36181(str2 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JSONObject m44118(String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f61659) {
            JSONArray jSONArrayM44116 = m44116();
            for (int i = 0; i < jSONArrayM44116.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayM44116.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && str.equals(jSONObjectOptJSONObject.optString("key")) && jSONObjectOptJSONObject.optDouble("x", -1.0d) >= 0.0d && jSONObjectOptJSONObject.optDouble("y", -1.0d) >= 0.0d) {
                    return jSONObjectOptJSONObject;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44119(String str, float f, float f2, String str2) {
        if (Float.isNaN(f) || Float.isInfinite(f) || Float.isNaN(f2) || Float.isInfinite(f2) || f < 0.0f || f2 < 0.0f) {
            return;
        }
        synchronized (this.f61659) {
            try {
                try {
                    JSONObject jSONObjectPut = new JSONObject().put("key", str).put("x", f).put("y", f2);
                    if (str2 != null && str2.length() <= 100000) {
                        jSONObjectPut.put(ErrorBundle.DETAIL_ENTRY, str2);
                    }
                    JSONArray jSONArrayPut = new JSONArray().put(jSONObjectPut);
                    JSONArray jSONArrayM44116 = m44116();
                    int length = jSONObjectPut.toString().length();
                    for (int i = 0; i < jSONArrayM44116.length() && jSONArrayPut.length() < 64; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayM44116.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null && !str.equals(jSONObjectOptJSONObject.optString("key"))) {
                            int length2 = jSONObjectOptJSONObject.toString().length() + 1 + length;
                            if (length2 > 1048574) {
                                break;
                            }
                            jSONArrayPut.put(jSONObjectOptJSONObject);
                            length = length2;
                        }
                    }
                    f61658.put(this.f61659, jSONArrayPut.toString());
                    C5261.f18540.execute(new RunnableC3547(1, this));
                } catch (JSONException e) {
                    throw new IllegalStateException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44117(C19034 c19034) {
        synchronized (c19034.f61659) {
            String str = (String) f61658.remove(c19034.f61659);
            if (str != null) {
                c19034.f61659.edit().putString("mdph", str).commit();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private JSONArray m44116() {
        ConcurrentMapC17249 concurrentMapC17249 = f61658;
        InterfaceC9801 interfaceC9801 = this.f61659;
        String string = (String) concurrentMapC17249.get(interfaceC9801);
        if (string == null) {
            string = interfaceC9801.getString("mdph", "");
        }
        if (!string.isEmpty() && string.length() <= 1048576) {
            try {
                return new JSONArray(string);
            } catch (JSONException unused) {
            }
        }
        return new JSONArray();
    }
}
