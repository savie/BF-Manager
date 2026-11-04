package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ۤ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11218 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C1129 m28272(JSONObject jSONObject) throws C10186 {
        m28269(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        C22407 c22407M28273 = m28273(jSONObject);
        return new C1129(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C13806 m28274(JSONObject jSONObject) throws C10186 {
        m28269(jSONObject, "workspaceId", "editSessionId", "locator", "itemKind", "namePrefix", "demangle", "limit");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        C22407 c22407M28273 = m28273(jSONObject);
        String strM28264 = m28262(jSONObject, "itemKind");
        if (C10717.m27303(strM28264)) {
            String strM28265 = m28262(jSONObject, "namePrefix");
            JSONValue jSONValue = jSONObject.get("demangle");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m28278("demangle");
            }
            if (!jSONValue.isBoolean()) {
                throw m28267("demangle", jSONValue);
            }
            return new C13806(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580, strM28264, strM28265, jSONValue.asBoolean(), m28259(jSONObject, "limit", 1, 500), 0, -1, 0L, 0L);
        }
        throw C10186.m26301("Invalid itemKind", "itemKind", JSON.value(strM28264), m28260(C10717.f34032), JSON.object().add("itemKind", "sections"));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C9331 m28279(JSONObject jSONObject) throws C10186 {
        m28269(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        C22407 c22407M28273 = m28273(jSONObject);
        String strM28264 = m28263(jSONObject, "addressKind", "virtual", "file_offset");
        C2620 c2620M28258 = m28258(jSONObject);
        return new C9331(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580, strM28264, c2620M28258.f8414, c2620M28258.f8413);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19028 m28268(JSONObject jSONObject) throws C10186 {
        m28269(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "stopAtSymbolBoundary", "maxBytes", "maxInstructions");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        C22407 c22407M28273 = m28273(jSONObject);
        String strM28264 = m28263(jSONObject, "addressKind", "virtual", "file_offset");
        C2620 c2620M28258 = m28258(jSONObject);
        String strM28265 = m28263(jSONObject, "instructionMode", "auto", "arm", "thumb");
        JSONValue jSONValue = jSONObject.get("stopAtSymbolBoundary");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m28278("stopAtSymbolBoundary");
        }
        if (!jSONValue.isBoolean()) {
            throw m28267("stopAtSymbolBoundary", jSONValue);
        }
        return new C19028(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580, strM28264, c2620M28258.f8414, c2620M28258.f8413, strM28265, jSONValue.asBoolean(), m28259(jSONObject, "maxBytes", 1, 4096), m28259(jSONObject, "maxInstructions", 1, 200));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10077 m28277(JSONObject jSONObject) throws C10186 {
        m28269(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "outputMode", "maxAnalysisBytes", "maxBlocks", "maxInstructions");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        C22407 c22407M28273 = m28273(jSONObject);
        String strM28264 = m28263(jSONObject, "addressKind", "virtual", "file_offset");
        C2620 c2620M28258 = m28258(jSONObject);
        return new C10077(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580, strM28264, c2620M28258.f8414, c2620M28258.f8413, m28263(jSONObject, "instructionMode", "auto", "arm", "thumb"), m28263(jSONObject, "outputMode", "full", ErrorBundle.SUMMARY_ENTRY), m28259(jSONObject, "maxAnalysisBytes", 16, 65536), m28259(jSONObject, "maxBlocks", 1, 4096), m28259(jSONObject, "maxInstructions", 1, 10000));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C8586 m28276(JSONObject jSONObject) throws C10186 {
        String[] strArr;
        char cCharAt;
        m28269(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "expectedHex", "replacementAssembly", "paddingMode");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        if (strM28263.isEmpty()) {
            throw C10186.m26301("editSessionId must not be empty for native patch", "editSessionId", JSON.value(strM28263), (JSONArray) null, (JSONObject) null);
        }
        C22407 c22407M28273 = m28273(jSONObject);
        String strM28264 = m28263(jSONObject, "addressKind", "virtual", "file_offset");
        C2620 c2620M28258 = m28258(jSONObject);
        String strM28265 = m28263(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM28266 = m28262(jSONObject, "expectedHex");
        if (strM28266.isEmpty() || (strM28266.length() & 1) != 0) {
            throw m28267("expectedHex", JSON.value(strM28266));
        }
        int length = strM28266.length() / 2;
        if (length > 256) {
            throw C10186.m26302("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "fatal", JSON.array(), JSON.object().add("expectedBytes", length));
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(strM28266.charAt(i2), 16);
            int iDigit2 = Character.digit(strM28266.charAt(i2 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw m28267("expectedHex", JSON.value(strM28266));
            }
            bArr[i] = (byte) (iDigit2 | (iDigit << 4));
        }
        String strM28267 = m28262(jSONObject, "replacementAssembly");
        if (strM28267.trim().isEmpty()) {
            throw m28267("replacementAssembly", JSON.value(strM28267));
        }
        if (strM28267.length() > 4096) {
            throw C10186.m26301("Invalid replacementAssembly", "replacementAssembly", JSON.value(strM28267), JSON.array("1..4096"), (JSONObject) null);
        }
        String[] strArrSplit = strM28267.replace(",,", "\n").split("[;\\r\\n]", -1);
        int length2 = strArrSplit.length;
        int i3 = 0;
        while (i3 < length2) {
            String str = strArrSplit[i3];
            int i4 = 0;
            while (true) {
                strArr = strArrSplit;
                if (i4 >= str.length() || !((cCharAt = str.charAt(i4)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ',' || cCharAt == ';' || cCharAt == ':' || cCharAt == '[' || cCharAt == ']' || cCharAt == '(' || cCharAt == ')' || cCharAt == '{' || cCharAt == '}')) {
                    break;
                }
                i4++;
                strArrSplit = strArr;
            }
            String strSubstring = str.substring(i4);
            int iIndexOf = strSubstring.indexOf(58);
            int i5 = length2;
            if (iIndexOf >= 0) {
                String strTrim = strSubstring.substring(iIndexOf + 1).trim();
                if (strTrim.startsWith(".")) {
                    throw C10186.m26301("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM28267), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
                }
                if (strSubstring.indexOf(32) < 0) {
                    strSubstring = strTrim;
                }
            }
            if (strSubstring.startsWith(".")) {
                throw C10186.m26301("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM28267), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
            }
            i3++;
            strArrSplit = strArr;
            length2 = i5;
        }
        return new C8586(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580, strM28264, c2620M28258.f8414, c2620M28258.f8413, strM28265, bArr, m28264(bArr), strM28267, m28263(jSONObject, "paddingMode", "none", "nop"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C7095 m28275(JSONObject jSONObject) throws C10186 {
        m28269(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "expectedText", "replacementText", "paddingMode");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        if (strM28263.isEmpty()) {
            throw C10186.m26301("editSessionId must not be empty for native string patch", "editSessionId", JSON.value(strM28263), (JSONArray) null, (JSONObject) null);
        }
        C22407 c22407M28273 = m28273(jSONObject);
        String strM28264 = m28263(jSONObject, "addressKind", "virtual", "file_offset");
        C2620 c2620M28258 = m28258(jSONObject);
        String strM28265 = m28262(jSONObject, "expectedText");
        if (strM28265.isEmpty()) {
            throw m28267("expectedText", JSON.value(strM28265));
        }
        String strM28266 = m28262(jSONObject, "replacementText");
        return new C7095(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580, strM28264, c2620M28258.f8414, c2620M28258.f8413, strM28265, m28270(jSONObject, "expectedText", strM28265), m28270(jSONObject, "replacementText", strM28266), m28263(jSONObject, "paddingMode", "none", "null_pad", "space_pad"));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C5253 m28271(JSONObject jSONObject) throws C10186 {
        m28269(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "scanKind", "referenceKinds", "maxScanBytes", "limit");
        String strM28262 = m28262(jSONObject, "workspaceId");
        String strM28263 = m28262(jSONObject, "editSessionId");
        C22407 c22407M28273 = m28273(jSONObject);
        String strM28264 = m28263(jSONObject, "addressKind", "virtual", "file_offset");
        C2620 c2620M28258 = m28258(jSONObject);
        String strM28265 = m28263(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM28266 = m28262(jSONObject, "scanKind");
        try {
            C11972.m30028(strM28266);
            JSONValue jSONValue = jSONObject.get("referenceKinds");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m28278("referenceKinds");
            }
            if (!jSONValue.isArray()) {
                throw m28265(jSONValue);
            }
            ArrayList arrayList = new ArrayList(jSONValue.asArray().size());
            for (JSONValue jSONValue2 : jSONValue.asArray()) {
                if (!jSONValue2.isString()) {
                    throw m28265(jSONValue2);
                }
                arrayList.add(jSONValue2.asString());
            }
            try {
                List listM24406 = C9225.m24406(C9225.m24404(arrayList));
                C5253 c5253 = new C5253(strM28262, strM28263, c22407M28273.f72581, c22407M28273.f72580, strM28264, c2620M28258.f8414, c2620M28258.f8413, strM28265, strM28266, listM24406, m28259(jSONObject, "maxScanBytes", 16, 4194304), m28259(jSONObject, "limit", 1, 200), 0, 0, 0L, 0, 0L, 0L, 0L, null, 0, null);
                List list = c5253.f18509;
                try {
                    String str = c5253.f18503;
                    C11972.m30020(C9225.m24404(list), str);
                    if (!e.m.equals(str) || "auto".equals(strM28265)) {
                        return c5253;
                    }
                    throw C24645.m54991(c5253);
                } catch (IllegalArgumentException unused) {
                    JSONArray jSONArrayArray = JSON.array();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArrayArray.add((String) it.next());
                    }
                    throw m28265(jSONArrayArray);
                }
            } catch (IllegalArgumentException unused2) {
                throw m28265(jSONValue);
            }
        } catch (IllegalArgumentException unused3) {
            throw C10186.m26301("Invalid scanKind", "scanKind", JSON.value(strM28266), m28260("code", e.m, "both"), JSON.object().add("scanKind", "both"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28269(JSONObject jSONObject, String... strArr) throws C10186 {
        Iterator it = jSONObject.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                JSONObject.Member member = (JSONObject.Member) it.next();
                String name = member.getName();
                int length = strArr.length;
                while (true) {
                    if (i < length) {
                        if (strArr[i].equals(name)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        throw C10186.m26301("Invalid native tool argument", name, member.getValue(), (JSONArray) null, (JSONObject) null);
                    }
                }
            } else {
                int length2 = strArr.length;
                while (i < length2) {
                    String str = strArr[i];
                    if (jSONObject.get(str) == null) {
                        throw m28278(str);
                    }
                    i++;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28262(JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m28278(str);
        }
        if (!jSONValue.isString()) {
            throw m28267(str, jSONValue);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22407 m28273(JSONObject jSONObject) throws C10186 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m28278("locator");
        }
        if (!jSONValue.isString()) {
            throw m28267("locator", jSONValue);
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.startsWith("zip_entry:") || strAsString.length() == 10) {
            throw C10186.m26301("native tools accept only zip_entry locators", "locator", jSONValue, JSON.array("zip_entry:<entryName>"), JSON.object().add("locator", "zip_entry:lib/arm64-v8a/libexample.so"));
        }
        return new C22407(strAsString, strAsString.substring(10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28263(JSONObject jSONObject, String str, String... strArr) throws C10186 {
        String strM28262 = m28262(jSONObject, str);
        for (String str2 : strArr) {
            if (str2.equals(strM28262)) {
                return strM28262;
            }
        }
        throw C10186.m26301("Invalid ".concat(str), str, JSON.value(strM28262), m28260(strArr), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28259(JSONObject jSONObject, String str, int i, int i2) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m28278(str);
        }
        if (!jSONValue.isNumber()) {
            throw m28267(str, jSONValue);
        }
        try {
            int iM31240 = C12556.m31240(jSONValue);
            if (iM31240 >= i && iM31240 <= i2) {
                return iM31240;
            }
            throw C10186.m26301("Invalid ".concat(str), str, JSON.value(iM31240), JSON.array(String.valueOf(i) + ".." + i2), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw m28267(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2620 m28258(JSONObject jSONObject) throws C10186 {
        long jM23908;
        String strM28262 = m28262(jSONObject, "address");
        String strTrim = strM28262.trim();
        if (strTrim.isEmpty() || strTrim.charAt(0) == '-' || strTrim.charAt(0) == '+') {
            throw m28266(strM28262);
        }
        try {
            if (strTrim.startsWith("0x") || strTrim.startsWith("0X")) {
                String strSubstring = strTrim.substring(2);
                if (strSubstring.isEmpty()) {
                    throw new NumberFormatException("empty hex");
                }
                jM23908 = C8947.m23908(strSubstring);
                if (jM23908 < 0) {
                    throw new NumberFormatException("address overflow");
                }
            } else {
                jM23908 = Long.parseLong(strTrim, 10);
            }
            return new C2620(jM23908, m28261(jM23908));
        } catch (NumberFormatException unused) {
            throw m28266(strM28262);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28261(long j) {
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28264(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i).toUpperCase(Locale.ROOT));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28270(JSONObject jSONObject, String str, String str2) throws C10186 {
        if (str2.indexOf(0) >= 0) {
            throw m28267(str, jSONObject.get(str));
        }
        try {
            CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str2));
            byte[] bArr = new byte[byteBufferEncode.remaining()];
            byteBufferEncode.get(bArr);
            return bArr;
        } catch (CharacterCodingException unused) {
            throw m28267(str, jSONObject.get(str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m28260(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m28266(String str) {
        return C10186.m26301("Invalid address", "address", JSON.value(str), JSON.array("0..9223372036854775807", "0x0..0x7fffffffffffffff"), JSON.object().add("address", "0x1000"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m28267(String str, JSONValue jSONValue) {
        return C10186.m26301("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m28265(JSONValue jSONValue) {
        return C10186.m26301("Invalid referenceKinds", "referenceKinds", jSONValue, m28260(C9225.f30050), JSON.object().add("referenceKinds", JSON.array("call", "jump", e.m, "unknown")));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10186 m28278(String str) {
        return C10186.m26301(C25272.m56409("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }
}
