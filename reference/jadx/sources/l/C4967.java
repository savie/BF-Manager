package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.util.Locale;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۙܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6BP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4967 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17290;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f17291 = new StringBuilder();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f17292;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f17293;

    public C4967(int i) {
        this.f17290 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15165(JSONObject jSONObject) {
        return m15166(jSONObject, 2048);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m15172(JSONObject jSONObject) {
        return m15166(jSONObject, 4096);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15166(JSONObject jSONObject, int i) {
        C4967 c4967 = new C4967(i);
        c4967.m15169(0, jSONObject, "");
        boolean z = c4967.f17293;
        StringBuilder sb = c4967.f17291;
        if (z) {
            sb.append("\n…");
        }
        return m15164(i, sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15169(int i, JSONValue jSONValue, String str) {
        StringBuilder sb = this.f17291;
        int length = sb.length();
        int i2 = this.f17290;
        if (length < i2) {
            int i3 = this.f17292 + 1;
            this.f17292 = i3;
            if (i3 <= 100) {
                if (jSONValue == null || jSONValue.isNull()) {
                    return;
                }
                if (i > 5) {
                    m15170(str, "…");
                    return;
                }
                int i4 = 0;
                if (jSONValue.isObject()) {
                    for (JSONObject.Member member : jSONValue.asObject()) {
                        i4++;
                        if (i4 > 40 || sb.length() >= i2 || this.f17292 > 100) {
                            this.f17293 = true;
                            return;
                        }
                        String name = member.getName();
                        if (!m15171(name)) {
                            if (!str.isEmpty()) {
                                name = C20196.m46451(str, ".", name);
                            } else if (e.m.equals(name)) {
                                name = "";
                            }
                            m15169(i + 1, member.getValue(), m15164(DHParameters.DEFAULT_MINIMUM_LENGTH, name));
                        }
                    }
                    return;
                }
                if (!jSONValue.isArray()) {
                    String strAsString = jSONValue.isString() ? jSONValue.asString() : jSONValue.toString();
                    if (strAsString.isEmpty()) {
                        return;
                    }
                    m15170(str, m15168(220, strAsString, true).f44494);
                    return;
                }
                JSONArray jSONArrayAsArray = jSONValue.asArray();
                m15170(str, "[" + jSONArrayAsArray.size() + "]");
                while (i4 < Math.min(3, jSONArrayAsArray.size())) {
                    m15169(i + 1, jSONArrayAsArray.get(i4), m15164(DHParameters.DEFAULT_MINIMUM_LENGTH, str) + "[" + i4 + "]");
                    i4++;
                }
                if (jSONArrayAsArray.size() > 3) {
                    m15170(str, "…");
                    return;
                }
                return;
            }
        }
        this.f17293 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m15170(String str, String str2) {
        StringBuilder sb = this.f17291;
        if (sb.length() >= this.f17290) {
            this.f17293 = true;
            return;
        }
        if (sb.length() != 0) {
            sb.append('\n');
        }
        if (!str.isEmpty()) {
            String strM15164 = m15164(DHParameters.DEFAULT_MINIMUM_LENGTH, str);
            sb.append(m15168(strM15164.length(), strM15164, true).f44494);
            sb.append(": ");
        }
        if (!str.isEmpty()) {
            str2 = m15168(str2.length(), str2, true).f44494;
        }
        sb.append(str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15171(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains("password") || lowerCase.contains("token") || lowerCase.contains("secret") || lowerCase.contains("authorization") || lowerCase.contains("credential") || lowerCase.contains("cursor") || lowerCase.endsWith("version") || lowerCase.equals("workspaceid") || lowerCase.equals("editsessionid") || lowerCase.equals("nextactions") || lowerCase.equals("badvalue") || lowerCase.equals("example") || lowerCase.equals("message") || lowerCase.equals("stacktrace");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15167(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : m15164(512, jSONValue.asString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14047 m15168(int i, String str, boolean z) {
        int i2;
        char cCharAt;
        int length = str.length();
        if (z) {
            i2 = 0;
            while (i2 < length && ((cCharAt = str.charAt(i2)) == '\r' || cCharAt == '\n' || cCharAt == 133 || cCharAt == 8232 || cCharAt == 8233)) {
                i2++;
            }
            while (length > i2) {
                char cCharAt2 = str.charAt(length - 1);
                if (cCharAt2 != '\r' && cCharAt2 != '\n' && cCharAt2 != 133 && cCharAt2 != 8232 && cCharAt2 != 8233) {
                    break;
                }
                length--;
            }
        } else {
            i2 = 0;
        }
        if (length - i2 <= i) {
            return new C14047(str.substring(i2, length), false);
        }
        int i3 = i + i2;
        int i4 = i3 - 1;
        if (i4 > i2) {
            int i5 = i3 - 2;
            if (Character.isHighSurrogate(str.charAt(i5))) {
                i4 = i5;
            }
        }
        return new C14047(str.substring(i2, i4) + "…", true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15164(int i, String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        int i2 = i - 1;
        if (i2 > 0 && Character.isHighSurrogate(str.charAt(i - 2))) {
            i2 = i - 2;
        }
        return str.substring(0, i2) + "…";
    }
}
