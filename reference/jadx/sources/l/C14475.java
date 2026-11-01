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

/* JADX INFO: renamed from: l.ܳۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7AH */
/* JADX INFO: loaded from: classes4.dex */
public class C14475 extends AbstractC16940 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f47449;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9536 f47450;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10947 f47451;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23647 f47452;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12026 f47453;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f47454;

    public C14475(int i, C10947 c10947, JSONObject jSONObject, C6380 c6380, C12026 c12026, C8716 c8716) {
        JSONValue jSONValue;
        super(i);
        this.f47454 = "/mcp";
        C13638.requireNonNull(c10947, "protocolVersions");
        this.f47451 = c10947;
        String str = "MCP";
        if (jSONObject != null && (jSONValue = jSONObject.get("name")) != null && jSONValue.isString()) {
            String strTrim = jSONValue.asString().trim();
            if (!strTrim.isEmpty()) {
                str = strTrim;
            }
        }
        this.f47449 = str;
        this.f47453 = c12026;
        C13638.requireNonNull(c8716, "requestAuthenticator");
        this.f47452 = c8716;
        this.f47450 = new C9536(c10947, jSONObject, c6380);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    @Override // l.AbstractC16940
    /* JADX INFO: renamed from: ۙ */
    public final C7768 mo6512(C15530 c15530) {
        boolean z;
        EnumC10591 enumC10591;
        EnumC10591 enumC10592;
        String str;
        String strM37143 = c15530.m37143();
        String str2 = this.f47454;
        if (!str2.equals(strM37143)) {
            C7768 c7768M39639 = AbstractC16940.m39639(EnumC10591.NOT_FOUND, "text/plain; charset=UTF-8", "Not Found");
            m34878(c15530, c7768M39639);
            return c7768M39639;
        }
        if (c15530.m37142() == EnumC18351.GET) {
            C7768 c7768M396310 = AbstractC16940.m39639(EnumC10591.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C16737.m39264(R.string.MT_Protector, this.f47449));
            c7768M396310.m20448("Allow", "POST");
            m34878(c15530, c7768M396310);
            return c7768M396310;
        }
        if (c15530.m37142() != EnumC18351.POST) {
            C7768 c7768M396311 = AbstractC16940.m39639(EnumC10591.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C16523.m38890("Only POST ", str2, " is supported"));
            c7768M396311.m20448("Allow", "POST");
            m34878(c15530, c7768M396311);
            return c7768M396311;
        }
        String str3 = (String) ((HashMap) c15530.m37131()).get("accept");
        if (str3 != null && !str3.trim().isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str4 : str3.split(",")) {
                String lowerCase = str4.split(l.b, 2)[0].trim().toLowerCase(Locale.ROOT);
                if (!lowerCase.isEmpty()) {
                    hashSet.add(lowerCase);
                }
            }
            if (!hashSet.contains("application/json") && !hashSet.contains("application/*") && !hashSet.contains("*/*")) {
                C7768 c7768M396312 = AbstractC16940.m39639(EnumC10591.NOT_ACCEPTABLE, "text/plain; charset=UTF-8", "Accept must allow application/json");
                m34878(c15530, c7768M396312);
                return c7768M396312;
            }
        }
        String str5 = (String) ((HashMap) c15530.m37131()).get("origin");
        if (str5 != null && !str5.isEmpty()) {
            try {
                C12026 c12026 = this.f47453;
                URI uriCreate = URI.create(str5);
                int i = c12026.f40275;
                if (a.s.equals(uriCreate.getScheme()) && uriCreate.getPort() == i) {
                    String host = uriCreate.getHost();
                    z = ("127.0.0.1".equals(host) || "localhost".equalsIgnoreCase(host)) ? true : C5487.m15156().contains(host);
                }
            } catch (Exception unused) {
            }
        }
        if (!z) {
            C7768 c7768M396313 = AbstractC16940.m39639(EnumC10591.FORBIDDEN, "text/plain; charset=UTF-8", "Origin is not allowed");
            m34878(c15530, c7768M396313);
            return c7768M396313;
        }
        C6007 c6007Mo22553 = this.f47452.mo22553(c15530);
        if (!C6007.m16310(c6007Mo22553)) {
            C7768 c7768M16309 = C6007.m16309(c6007Mo22553);
            m34878(c15530, c7768M16309);
            return c7768M16309;
        }
        try {
            try {
                JSONValue jSONValue = JSON.parse(m34880(c15530));
                boolean zIsArray = jSONValue.isArray();
                C9536 c9536 = this.f47450;
                C10947 c10947 = this.f47451;
                if (!zIsArray) {
                    if (!jSONValue.isObject()) {
                        return C14143.m34192(EnumC10591.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                    }
                    JSONObject jSONObjectAsObject = jSONValue.asObject();
                    if (!"initialize".equals(m34877(jSONObjectAsObject))) {
                        String str6 = (String) ((HashMap) c15530.m37131()).get("mcp-protocol-version");
                        if (!c10947.m27464(str6 != null ? str6 : "2025-03-26")) {
                            return C14143.m34192(EnumC10591.BAD_REQUEST, jSONObjectAsObject.get("id"), -32600, "Invalid MCP-Protocol-Version");
                        }
                    }
                    if (jSONObjectAsObject.get(e.s) == null && !(jSONObjectAsObject.get(o.c) == null && jSONObjectAsObject.get(d.O) == null)) {
                        return m34881(jSONObjectAsObject) ? AbstractC16940.m39639(EnumC10591.ACCEPTED, "text/plain; charset=UTF-8", "") : AbstractC16940.m39639(EnumC10591.BAD_REQUEST, "text/plain; charset=UTF-8", "Invalid JSON-RPC response");
                    }
                    return c9536.m24390(jSONObjectAsObject).m5817();
                }
                JSONArray<JSONValue> jSONArrayAsArray = jSONValue.asArray();
                String str7 = (String) ((HashMap) c15530.m37131()).get("mcp-protocol-version");
                if (str7 == null) {
                    str7 = "2025-03-26";
                }
                if (!c10947.m27464(str7)) {
                    return C14143.m34192(EnumC10591.BAD_REQUEST, JSON.NULL, -32600, "Invalid MCP-Protocol-Version");
                }
                if (!"2025-03-26".equals(str7)) {
                    return C14143.m34192(EnumC10591.BAD_REQUEST, JSON.NULL, -32600, "Batch requests are not supported");
                }
                if (jSONArrayAsArray.size() == 0) {
                    return C14143.m34192(EnumC10591.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                }
                boolean z2 = false;
                boolean z3 = false;
                for (JSONValue jSONValue2 : jSONArrayAsArray) {
                    if (jSONValue2.isObject()) {
                        JSONObject jSONObjectAsObject2 = jSONValue2.asObject();
                        if (jSONObjectAsObject2.get(e.s) == null && !(jSONObjectAsObject2.get(o.c) == null && jSONObjectAsObject2.get(d.O) == null)) {
                            if (!m34881(jSONValue2.asObject())) {
                                enumC10592 = EnumC10591.BAD_REQUEST;
                                str = "Invalid JSON-RPC response batch";
                                return AbstractC16940.m39639(enumC10592, "text/plain; charset=UTF-8", str);
                            }
                            z2 = true;
                        }
                    }
                    z3 = true;
                }
                if (!z2) {
                    JSONArray jSONArrayArray = JSON.array();
                    for (JSONValue jSONValue3 : jSONArrayAsArray) {
                        if (jSONValue3.isObject()) {
                            JSONObject jSONObjectAsObject3 = jSONValue3.asObject();
                            if ("initialize".equals(m34877(jSONObjectAsObject3))) {
                                JSONValue jSONValue4 = jSONObjectAsObject3.get("jsonrpc");
                                if (jSONObjectAsObject3.get("id") != null || jSONValue4 == null || !jSONValue4.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue4.asString()) || m34877(jSONObjectAsObject3) == null) {
                                    jSONArrayArray.add(C14143.m34191(jSONObjectAsObject3.get("id"), -32600, "Initialize requests must not be batched"));
                                }
                            } else {
                                JSONValue jSONValueM5816 = c9536.m24390(jSONObjectAsObject3).m5816();
                                if (jSONValueM5816 != null) {
                                    jSONArrayArray.add(jSONValueM5816);
                                }
                            }
                        } else {
                            jSONArrayArray.add(C14143.m34191(JSON.NULL, -32600, "Invalid Request"));
                        }
                    }
                    if (jSONArrayArray.size() != 0) {
                        return AbstractC16940.m39639(EnumC10591.OK, "application/json", jSONArrayArray.toString());
                    }
                    enumC10591 = EnumC10591.ACCEPTED;
                } else {
                    if (z3) {
                        enumC10592 = EnumC10591.BAD_REQUEST;
                        str = "JSON-RPC response batches cannot contain requests or notifications";
                        return AbstractC16940.m39639(enumC10592, "text/plain; charset=UTF-8", str);
                    }
                    enumC10591 = EnumC10591.ACCEPTED;
                }
                return AbstractC16940.m39639(enumC10591, "text/plain; charset=UTF-8", "");
            } catch (JSONParseException unused2) {
                return C14143.m34192(EnumC10591.BAD_REQUEST, JSON.NULL, -32700, "Parse error");
            }
        } catch (Exception e) {
            if (e instanceof C21173) {
                EnumC10591 enumC10591M47632 = ((C21173) e).m47632();
                EnumC10591 enumC10593 = EnumC10591.PAYLOAD_TOO_LARGE;
                if (enumC10591M47632 == enumC10593) {
                    C7768 c7768M396314 = AbstractC16940.m39639(enumC10593, "text/plain; charset=UTF-8", "MCP request body exceeds 8388608 bytes. Use smaller requests or compact JSON.");
                    c7768M396314.m20446();
                    return c7768M396314;
                }
            }
            C7768 c7768M34192 = C14143.m34192(EnumC10591.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
            c7768M34192.m20446();
            return c7768M34192;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m34881(JSONObject jSONObject) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m34880(C15530 c15530) throws C21173 {
        String str = (String) ((HashMap) c15530.m37131()).get("content-length");
        if (str != null && Long.parseLong(str) > X931RNG.BLOCK128_RESEED_MAX) {
            throw new C21173(EnumC10591.PAYLOAD_TOO_LARGE, "Request body too large");
        }
        if (c15530.m37141()) {
            String strM37138 = c15530.m37138();
            m34879(strM37138);
            return strM37138 == null ? "" : strM37138;
        }
        HashMap map = new HashMap();
        c15530.m37135(map);
        String str2 = (String) map.get("postData");
        String str3 = str2 != null ? str2 : "";
        m34879(str3);
        c15530.m37134(str3);
        return str3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m34879(String str) throws C21173 {
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
                throw new C21173(EnumC10591.PAYLOAD_TOO_LARGE, "Request body too large");
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34877(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get(e.s);
        if (jSONValue == null || !jSONValue.isString()) {
            return null;
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34878(C15530 c15530, C7768 c7768) {
        boolean zContainsKey;
        String str = (String) ((HashMap) c15530.m37131()).get("content-length");
        if (str != null) {
            zContainsKey = true;
            try {
                if (Long.parseLong(str) <= 0) {
                    zContainsKey = false;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            zContainsKey = ((HashMap) c15530.m37131()).containsKey("transfer-encoding");
        }
        if (!zContainsKey || c15530.m37141()) {
            return;
        }
        c7768.m20446();
    }
}
