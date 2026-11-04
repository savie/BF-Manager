package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܶᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7AH */
/* JADX INFO: loaded from: classes5.dex */
public class C16285 extends AbstractC1530 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17777 f52881;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C13170 f52882;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f52883;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20761 f52884;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f52885;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17031 f52886;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f52887;

    public C16285(int i, C17031 c17031, JSONObject jSONObject, C9440 c9440, C13170 c13170, C15826 c15826) {
        JSONValue jSONValue;
        super(i);
        this.f52883 = "/mcp";
        this.f52887 = i;
        C17359.requireNonNull(c17031, "protocolVersions");
        this.f52886 = c17031;
        String str = "MCP";
        if (jSONObject != null && (jSONValue = jSONObject.get("name")) != null && jSONValue.isString()) {
            String strTrim = jSONValue.asString().trim();
            if (!strTrim.isEmpty()) {
                str = strTrim;
            }
        }
        this.f52885 = str;
        this.f52882 = c13170;
        C17359.requireNonNull(c15826, "requestAuthenticator");
        this.f52881 = c15826;
        this.f52884 = new C20761(c17031, jSONObject, c9440);
    }

    @Override // l.AbstractC1530
    /* JADX INFO: renamed from: ᩷ */
    public C18683 mo5438(C3767 c3767) {
        String strM12228 = c3767.m12228();
        String str = this.f52883;
        if (!str.equals(strM12228)) {
            C18683 c18683M5422 = AbstractC1530.m5422(EnumC21667.NOT_FOUND, "text/plain; charset=UTF-8", "Not Found");
            m38640(c3767, c18683M5422);
            return c18683M5422;
        }
        if (c3767.m12226() == EnumC12716.GET) {
            C18683 c18683M5423 = AbstractC1530.m5422(EnumC21667.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C21576.m49059(R.string.MT_Protector, this.f52885));
            c18683M5423.m43440("Allow", "POST");
            m38640(c3767, c18683M5423);
            return c18683M5423;
        }
        if (c3767.m12226() != EnumC12716.POST) {
            C18683 c18683M5424 = AbstractC1530.m5422(EnumC21667.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C14442.m34865("Only POST ", str, " is supported"));
            c18683M5424.m43440("Allow", "POST");
            m38640(c3767, c18683M5424);
            return c18683M5424;
        }
        String str2 = (String) ((HashMap) c3767.m12230()).get("accept");
        if (str2 != null && !str2.trim().isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str3 : str2.split(",")) {
                String lowerCase = str3.split(l.b, 2)[0].trim().toLowerCase(Locale.ROOT);
                if (!lowerCase.isEmpty()) {
                    hashSet.add(lowerCase);
                }
            }
            if (!hashSet.contains("application/json") && !hashSet.contains("application/*") && !hashSet.contains("*/*")) {
                C18683 c18683M5425 = AbstractC1530.m5422(EnumC21667.NOT_ACCEPTABLE, "text/plain; charset=UTF-8", "Accept must allow application/json");
                m38640(c3767, c18683M5425);
                return c18683M5425;
            }
        }
        if (!m38645(c3767)) {
            C18683 c18683M5426 = AbstractC1530.m5422(EnumC21667.FORBIDDEN, "text/plain; charset=UTF-8", "Origin is not allowed");
            m38640(c3767, c18683M5426);
            return c18683M5426;
        }
        C25237 c25237Mo37765 = this.f52881.mo37765(c3767);
        if (!C25237.m56362(c25237Mo37765)) {
            C18683 c18683M56359 = C25237.m56359(c25237Mo37765);
            m38640(c3767, c18683M56359);
            return c18683M56359;
        }
        C22867 c22867M51586 = C22867.m51586(c3767, c25237Mo37765, m5433() > 0 ? m5433() : this.f52887);
        try {
            return m38642(c3767);
        } finally {
            C22867.m51587(c22867M51586);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private C18683 m38642(C3767 c3767) {
        try {
            try {
                JSONValue jSONValue = JSON.parse(m38644(c3767));
                boolean zIsArray = jSONValue.isArray();
                C20761 c20761 = this.f52884;
                C17031 c17031 = this.f52886;
                if (!zIsArray) {
                    if (!jSONValue.isObject()) {
                        return C19883.m45785(EnumC21667.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                    }
                    JSONObject jSONObjectAsObject = jSONValue.asObject();
                    if (!"initialize".equals(m38639(jSONObjectAsObject))) {
                        String str = (String) ((HashMap) c3767.m12230()).get("mcp-protocol-version");
                        if (!c17031.m40123(str != null ? str : "2025-03-26")) {
                            return C19883.m45785(EnumC21667.BAD_REQUEST, jSONObjectAsObject.get("id"), -32600, "Invalid MCP-Protocol-Version");
                        }
                    }
                    if (jSONObjectAsObject.get(e.s) != null || (jSONObjectAsObject.get(o.c) == null && jSONObjectAsObject.get(d.O) == null)) {
                        return c20761.m47467(jSONObjectAsObject).m11702();
                    }
                    return m38643(jSONObjectAsObject) ? AbstractC1530.m5422(EnumC21667.ACCEPTED, "text/plain; charset=UTF-8", "") : AbstractC1530.m5422(EnumC21667.BAD_REQUEST, "text/plain; charset=UTF-8", "Invalid JSON-RPC response");
                }
                JSONArray<JSONValue> jSONArrayAsArray = jSONValue.asArray();
                String str2 = (String) ((HashMap) c3767.m12230()).get("mcp-protocol-version");
                if (str2 == null) {
                    str2 = "2025-03-26";
                }
                if (!c17031.m40123(str2)) {
                    return C19883.m45785(EnumC21667.BAD_REQUEST, JSON.NULL, -32600, "Invalid MCP-Protocol-Version");
                }
                if (!"2025-03-26".equals(str2)) {
                    return C19883.m45785(EnumC21667.BAD_REQUEST, JSON.NULL, -32600, "Batch requests are not supported");
                }
                if (jSONArrayAsArray.size() == 0) {
                    return C19883.m45785(EnumC21667.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                }
                boolean z = false;
                boolean z2 = false;
                for (JSONValue jSONValue2 : jSONArrayAsArray) {
                    if (jSONValue2.isObject()) {
                        JSONObject jSONObjectAsObject2 = jSONValue2.asObject();
                        if (jSONObjectAsObject2.get(e.s) == null && (jSONObjectAsObject2.get(o.c) != null || jSONObjectAsObject2.get(d.O) != null)) {
                            if (!m38643(jSONValue2.asObject())) {
                                return AbstractC1530.m5422(EnumC21667.BAD_REQUEST, "text/plain; charset=UTF-8", "Invalid JSON-RPC response batch");
                            }
                            z = true;
                        }
                    }
                    z2 = true;
                }
                if (z) {
                    return z2 ? AbstractC1530.m5422(EnumC21667.BAD_REQUEST, "text/plain; charset=UTF-8", "JSON-RPC response batches cannot contain requests or notifications") : AbstractC1530.m5422(EnumC21667.ACCEPTED, "text/plain; charset=UTF-8", "");
                }
                JSONArray jSONArrayArray = JSON.array();
                for (JSONValue jSONValue3 : jSONArrayAsArray) {
                    if (jSONValue3.isObject()) {
                        JSONObject jSONObjectAsObject3 = jSONValue3.asObject();
                        if ("initialize".equals(m38639(jSONObjectAsObject3))) {
                            JSONValue jSONValue4 = jSONObjectAsObject3.get("jsonrpc");
                            if (jSONObjectAsObject3.get("id") != null || jSONValue4 == null || !jSONValue4.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue4.asString()) || m38639(jSONObjectAsObject3) == null) {
                                jSONArrayArray.add(C19883.m45783(-32600, jSONObjectAsObject3.get("id"), "Initialize requests must not be batched"));
                            }
                        } else {
                            JSONValue jSONValueM11701 = c20761.m47467(jSONObjectAsObject3).m11701();
                            if (jSONValueM11701 != null) {
                                jSONArrayArray.add(jSONValueM11701);
                            }
                        }
                    } else {
                        jSONArrayArray.add(C19883.m45783(-32600, JSON.NULL, "Invalid Request"));
                    }
                }
                return jSONArrayArray.size() == 0 ? AbstractC1530.m5422(EnumC21667.ACCEPTED, "text/plain; charset=UTF-8", "") : AbstractC1530.m5422(EnumC21667.OK, "application/json", jSONArrayArray.toString());
            } catch (JSONParseException unused) {
                return C19883.m45785(EnumC21667.BAD_REQUEST, JSON.NULL, -32700, "Parse error");
            }
        } catch (Exception e) {
            if (e instanceof C0784) {
                EnumC21667 enumC21667M3180 = ((C0784) e).m3180();
                EnumC21667 enumC21667 = EnumC21667.PAYLOAD_TOO_LARGE;
                if (enumC21667M3180 == enumC21667) {
                    C18683 c18683M5422 = AbstractC1530.m5422(enumC21667, "text/plain; charset=UTF-8", "MCP request body exceeds 8388608 bytes. Use smaller requests or compact JSON.");
                    c18683M5422.m43438();
                    return c18683M5422;
                }
            }
            C18683 c18683M45785 = C19883.m45785(EnumC21667.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
            c18683M45785.m43438();
            return c18683M45785;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m38643(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("jsonrpc");
        JSONValue jSONValue2 = jSONObject.get("id");
        JSONValue jSONValue3 = jSONObject.get(o.c);
        JSONValue jSONValue4 = jSONObject.get(d.O);
        boolean z = jSONValue2 != null && (jSONValue2.isString() || jSONValue2.isNumber() || jSONValue2.isNull());
        boolean z2 = (jSONValue3 == null) != (jSONValue4 == null);
        if (jSONValue != null && jSONValue.isString() && UMCrashManager.CM_VERSION.equals(jSONValue.asString()) && z && z2) {
            if (jSONValue4 == null) {
                return true;
            }
            if (jSONValue4.isObject()) {
                JSONValue jSONValue5 = jSONValue4.asObject().get("code");
                JSONValue jSONValue6 = jSONValue4.asObject().get("message");
                if (jSONValue5 != null && jSONValue5.isNumber() && jSONValue6 != null && jSONValue6.isString()) {
                    try {
                        jSONValue5.asLong();
                        return true;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m38644(C3767 c3767) throws C0784 {
        String str = (String) ((HashMap) c3767.m12230()).get("content-length");
        if (str != null && Long.parseLong(str) > X931RNG.BLOCK128_RESEED_MAX) {
            throw new C0784(EnumC21667.PAYLOAD_TOO_LARGE, "Request body too large");
        }
        if (c3767.m12229()) {
            String strM12232 = c3767.m12232();
            m38641(strM12232);
            return strM12232 == null ? "" : strM12232;
        }
        HashMap map = new HashMap();
        c3767.m12222(map);
        String str2 = (String) map.get("postData");
        String str3 = str2 != null ? str2 : "";
        m38641(str3);
        c3767.m12221(str3);
        return str3;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m38641(String str) throws C0784 {
        int i;
        if (str == null) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                i3++;
            } else if (cCharAt < 2048) {
                i3 += 2;
            } else if (Character.isHighSurrogate(cCharAt) && (i = i2 + 1) < str.length() && Character.isLowSurrogate(str.charAt(i))) {
                i3 += 4;
                i2 = i;
            } else {
                i3 += 3;
            }
            if (i3 > 8388608) {
                throw new C0784(EnumC21667.PAYLOAD_TOO_LARGE, "Request body too large");
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m38645(C3767 c3767) {
        String str = (String) ((HashMap) c3767.m12230()).get("origin");
        if (str == null || str.isEmpty()) {
            return true;
        }
        try {
            C13170 c13170 = this.f52882;
            URI uriCreate = URI.create(str);
            int i = c13170.f42095;
            int i2 = C11678.f37828;
            if (a.s.equals(uriCreate.getScheme()) && uriCreate.getPort() == i) {
                String host = uriCreate.getHost();
                if (("127.0.0.1".equals(host) || "localhost".equalsIgnoreCase(host)) ? true : C13808.m33716().contains(host)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38639(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get(e.s);
        if (jSONValue == null || !jSONValue.isString()) {
            return null;
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38640(C3767 c3767, C18683 c18683) {
        boolean zContainsKey;
        String str = (String) ((HashMap) c3767.m12230()).get("content-length");
        if (str != null) {
            zContainsKey = true;
            try {
                if (Long.parseLong(str) <= 0) {
                    zContainsKey = false;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            zContainsKey = ((HashMap) c3767.m12230()).containsKey("transfer-encoding");
        }
        if (!zContainsKey || c3767.m12229()) {
            return;
        }
        c18683.m43438();
    }
}
