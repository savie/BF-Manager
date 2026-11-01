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

/* JADX INFO: renamed from: l.ܽۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16363 {
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C19185 m38554(JSONObject jSONObject) throws C12731 {
        m38550(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        C0134 c0134M38553 = m38553(jSONObject);
        return new C19185(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C15658 m38537(JSONObject jSONObject) throws C12731 {
        m38550(jSONObject, "workspaceId", "editSessionId", "locator", "itemKind", "namePrefix", "demangle", "limit");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        C0134 c0134M38553 = m38553(jSONObject);
        String strM38545 = m38543(jSONObject, "itemKind");
        if (C20952.m47128(strM38545)) {
            String strM38546 = m38543(jSONObject, "namePrefix");
            JSONValue jSONValue = jSONObject.get("demangle");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m38557("demangle");
            }
            if (!jSONValue.isBoolean()) {
                throw m38548("demangle", jSONValue);
            }
            return new C15658(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133, strM38545, strM38546, jSONValue.asBoolean(), m38540(jSONObject, "limit", 1, 500), 0, -1, 0L, 0L);
        }
        throw C12731.m31626("Invalid itemKind", "itemKind", JSON.value(strM38545), m38541(C20952.f68286), JSON.object().add("itemKind", "sections"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C8602 m38538(JSONObject jSONObject) throws C12731 {
        m38550(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        C0134 c0134M38553 = m38553(jSONObject);
        String strM38545 = m38544(jSONObject, "addressKind", "virtual", "file_offset");
        C10013 c10013M38539 = m38539(jSONObject);
        return new C8602(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133, strM38545, c10013M38539.f34190, c10013M38539.f34189);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18479 m38549(JSONObject jSONObject) throws C12731 {
        m38550(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "stopAtSymbolBoundary", "maxBytes", "maxInstructions");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        C0134 c0134M38553 = m38553(jSONObject);
        String strM38545 = m38544(jSONObject, "addressKind", "virtual", "file_offset");
        C10013 c10013M38539 = m38539(jSONObject);
        String strM38546 = m38544(jSONObject, "instructionMode", "auto", "arm", "thumb");
        JSONValue jSONValue = jSONObject.get("stopAtSymbolBoundary");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m38557("stopAtSymbolBoundary");
        }
        if (!jSONValue.isBoolean()) {
            throw m38548("stopAtSymbolBoundary", jSONValue);
        }
        return new C18479(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133, strM38545, c10013M38539.f34190, c10013M38539.f34189, strM38546, jSONValue.asBoolean(), m38540(jSONObject, "maxBytes", 1, 4096), m38540(jSONObject, "maxInstructions", 1, 200));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7896 m38556(JSONObject jSONObject) throws C12731 {
        m38550(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "outputMode", "maxAnalysisBytes", "maxBlocks", "maxInstructions");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        C0134 c0134M38553 = m38553(jSONObject);
        String strM38545 = m38544(jSONObject, "addressKind", "virtual", "file_offset");
        C10013 c10013M38539 = m38539(jSONObject);
        return new C7896(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133, strM38545, c10013M38539.f34190, c10013M38539.f34189, m38544(jSONObject, "instructionMode", "auto", "arm", "thumb"), m38544(jSONObject, "outputMode", "full", ErrorBundle.SUMMARY_ENTRY), m38540(jSONObject, "maxAnalysisBytes", 16, 65536), m38540(jSONObject, "maxBlocks", 1, 4096), m38540(jSONObject, "maxInstructions", 1, 10000));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C7190 m38552(JSONObject jSONObject) throws C12731 {
        String[] strArr;
        char cCharAt;
        m38550(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "expectedHex", "replacementAssembly", "paddingMode");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        if (strM38544.isEmpty()) {
            throw C12731.m31626("editSessionId must not be empty for native patch", "editSessionId", JSON.value(strM38544), (JSONArray) null, (JSONObject) null);
        }
        C0134 c0134M38553 = m38553(jSONObject);
        String strM38545 = m38544(jSONObject, "addressKind", "virtual", "file_offset");
        C10013 c10013M38539 = m38539(jSONObject);
        String strM38546 = m38544(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM38547 = m38543(jSONObject, "expectedHex");
        if (strM38547.isEmpty() || (strM38547.length() & 1) != 0) {
            throw m38548("expectedHex", JSON.value(strM38547));
        }
        int length = strM38547.length() / 2;
        if (length > 256) {
            throw C12731.m31627("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "fatal", JSON.array(), JSON.object().add("expectedBytes", length));
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(strM38547.charAt(i2), 16);
            int iDigit2 = Character.digit(strM38547.charAt(i2 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw m38548("expectedHex", JSON.value(strM38547));
            }
            bArr[i] = (byte) (iDigit2 | (iDigit << 4));
        }
        String strM38548 = m38543(jSONObject, "replacementAssembly");
        if (strM38548.trim().isEmpty()) {
            throw m38548("replacementAssembly", JSON.value(strM38548));
        }
        if (strM38548.length() > 4096) {
            throw C12731.m31626("Invalid replacementAssembly", "replacementAssembly", JSON.value(strM38548), JSON.array("1..4096"), (JSONObject) null);
        }
        String[] strArrSplit = strM38548.replace(",,", "\n").split("[;\\r\\n]", -1);
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
                    throw C12731.m31626("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM38548), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
                }
                if (strSubstring.indexOf(32) < 0) {
                    strSubstring = strTrim;
                }
            }
            if (strSubstring.startsWith(".")) {
                throw C12731.m31626("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM38548), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
            }
            i3++;
            strArrSplit = strArr;
            length2 = i5;
        }
        return new C7190(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133, strM38545, c10013M38539.f34190, c10013M38539.f34189, strM38546, bArr, m38545(bArr), strM38548, m38544(jSONObject, "paddingMode", "none", "nop"));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C20596 m38558(JSONObject jSONObject) throws C12731 {
        m38550(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "expectedText", "replacementText", "paddingMode");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        if (strM38544.isEmpty()) {
            throw C12731.m31626("editSessionId must not be empty for native string patch", "editSessionId", JSON.value(strM38544), (JSONArray) null, (JSONObject) null);
        }
        C0134 c0134M38553 = m38553(jSONObject);
        String strM38545 = m38544(jSONObject, "addressKind", "virtual", "file_offset");
        C10013 c10013M38539 = m38539(jSONObject);
        String strM38546 = m38543(jSONObject, "expectedText");
        if (strM38546.isEmpty()) {
            throw m38548("expectedText", JSON.value(strM38546));
        }
        String strM38547 = m38543(jSONObject, "replacementText");
        return new C20596(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133, strM38545, c10013M38539.f34190, c10013M38539.f34189, strM38546, m38551(jSONObject, "expectedText", strM38546), m38551(jSONObject, "replacementText", strM38547), m38544(jSONObject, "paddingMode", "none", "null_pad", "space_pad"));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C19891 m38555(JSONObject jSONObject) throws C12731 {
        m38550(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "scanKind", "referenceKinds", "maxScanBytes", "limit");
        String strM38543 = m38543(jSONObject, "workspaceId");
        String strM38544 = m38543(jSONObject, "editSessionId");
        C0134 c0134M38553 = m38553(jSONObject);
        String strM38545 = m38544(jSONObject, "addressKind", "virtual", "file_offset");
        C10013 c10013M38539 = m38539(jSONObject);
        String strM38546 = m38544(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM38547 = m38543(jSONObject, "scanKind");
        try {
            C17886.m41515(strM38547);
            JSONValue jSONValue = jSONObject.get("referenceKinds");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m38557("referenceKinds");
            }
            if (!jSONValue.isArray()) {
                throw m38546(jSONValue);
            }
            ArrayList arrayList = new ArrayList(jSONValue.asArray().size());
            for (JSONValue jSONValue2 : jSONValue.asArray()) {
                if (!jSONValue2.isString()) {
                    throw m38546(jSONValue2);
                }
                arrayList.add(jSONValue2.asString());
            }
            try {
                List listM48622 = C21845.m48622(C21845.m48620(arrayList));
                C19891 c19891 = new C19891(strM38543, strM38544, c0134M38553.f1134, c0134M38553.f1133, strM38545, c10013M38539.f34190, c10013M38539.f34189, strM38546, strM38547, listM48622, m38540(jSONObject, "maxScanBytes", 16, 4194304), m38540(jSONObject, "limit", 1, 200), 0, 0, 0L, 0, 0L, 0L, 0L, null, 0, null);
                List list = c19891.f63768;
                try {
                    String str = c19891.f63779;
                    C17886.m41514(C21845.m48620(list), str);
                    if (!e.m.equals(str) || "auto".equals(strM38546)) {
                        return c19891;
                    }
                    throw C12887.m31956(c19891);
                } catch (IllegalArgumentException unused) {
                    JSONArray jSONArrayArray = JSON.array();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArrayArray.add((String) it.next());
                    }
                    throw m38546(jSONArrayArray);
                }
            } catch (IllegalArgumentException unused2) {
                throw m38546(jSONValue);
            }
        } catch (IllegalArgumentException unused3) {
            throw C12731.m31626("Invalid scanKind", "scanKind", JSON.value(strM38547), m38541("code", e.m, "both"), JSON.object().add("scanKind", "both"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38550(JSONObject jSONObject, String... strArr) throws C12731 {
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
                        throw C12731.m31626("Invalid native tool argument", name, member.getValue(), (JSONArray) null, (JSONObject) null);
                    }
                }
            } else {
                int length2 = strArr.length;
                while (i < length2) {
                    String str = strArr[i];
                    if (jSONObject.get(str) == null) {
                        throw m38557(str);
                    }
                    i++;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38543(JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m38557(str);
        }
        if (!jSONValue.isString()) {
            throw m38548(str, jSONValue);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C0134 m38553(JSONObject jSONObject) throws C12731 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m38557("locator");
        }
        if (!jSONValue.isString()) {
            throw m38548("locator", jSONValue);
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.startsWith("zip_entry:") || strAsString.length() == 10) {
            throw C12731.m31626("native tools accept only zip_entry locators", "locator", jSONValue, JSON.array("zip_entry:<entryName>"), JSON.object().add("locator", "zip_entry:lib/arm64-v8a/libexample.so"));
        }
        return new C0134(strAsString, strAsString.substring(10));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38544(JSONObject jSONObject, String str, String... strArr) throws C12731 {
        String strM38543 = m38543(jSONObject, str);
        for (String str2 : strArr) {
            if (str2.equals(strM38543)) {
                return strM38543;
            }
        }
        throw C12731.m31626("Invalid ".concat(str), str, JSON.value(strM38543), m38541(strArr), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38540(JSONObject jSONObject, String str, int i, int i2) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m38557(str);
        }
        if (!jSONValue.isNumber()) {
            throw m38548(str, jSONValue);
        }
        try {
            int iM26321 = C10413.m26321(jSONValue);
            if (iM26321 >= i && iM26321 <= i2) {
                return iM26321;
            }
            throw C12731.m31626("Invalid ".concat(str), str, JSON.value(iM26321), JSON.array(String.valueOf(i) + ".." + i2), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw m38548(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C10013 m38539(JSONObject jSONObject) throws C12731 {
        long jM43490;
        String strM38543 = m38543(jSONObject, "address");
        String strTrim = strM38543.trim();
        if (strTrim.isEmpty() || strTrim.charAt(0) == '-' || strTrim.charAt(0) == '+') {
            throw m38547(strM38543);
        }
        try {
            if (strTrim.startsWith("0x") || strTrim.startsWith("0X")) {
                String strSubstring = strTrim.substring(2);
                if (strSubstring.isEmpty()) {
                    throw new NumberFormatException("empty hex");
                }
                jM43490 = C18855.m43490(strSubstring);
                if (jM43490 < 0) {
                    throw new NumberFormatException("address overflow");
                }
            } else {
                jM43490 = Long.parseLong(strTrim, 10);
            }
            return new C10013(jM43490, m38542(jM43490));
        } catch (NumberFormatException unused) {
            throw m38547(strM38543);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38542(long j) {
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38545(byte[] bArr) {
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
    public static byte[] m38551(JSONObject jSONObject, String str, String str2) throws C12731 {
        if (str2.indexOf(0) >= 0) {
            throw m38548(str, jSONObject.get(str));
        }
        try {
            CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str2));
            byte[] bArr = new byte[byteBufferEncode.remaining()];
            byteBufferEncode.get(bArr);
            return bArr;
        } catch (CharacterCodingException unused) {
            throw m38548(str, jSONObject.get(str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONArray m38541(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m38547(String str) {
        return C12731.m31626("Invalid address", "address", JSON.value(str), JSON.array("0..9223372036854775807", "0x0..0x7fffffffffffffff"), JSON.object().add("address", "0x1000"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m38548(String str, JSONValue jSONValue) {
        return C12731.m31626("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m38546(JSONValue jSONValue) {
        return C12731.m31626("Invalid referenceKinds", "referenceKinds", jSONValue, m38541(C21845.f70913), JSON.object().add("referenceKinds", JSON.array("call", "jump", e.m, "unknown")));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12731 m38557(String str) {
        return C12731.m31626(C0252.m1693("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }
}
