package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩸ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: P6XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21767 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f70525;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17617 f70526;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f70527;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48526(int i) {
        return C2271.m6966(i, "patches[", "]");
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_patch_bytes";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Apply 1..200 equal-length raw byte patches to one existing regular local file. Copy targetVersion from mt_file_stat or mt_file_read_bytes; missing is not accepted. Each item contains a 0-based byteOffset plus non-empty, even-length expectedHex and replacementHex of the same size. Inputs are case-insensitive hex without separators. Each item is limited to 4096 bytes and the call to 65536 patched bytes. Ranges must not overlap; adjacent ranges are valid. All expected windows are checked before patched bytes are written. Large files are supported.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Patch File Bytes";
    }

    public C21767(C17617 c17617) {
        this.f70526 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f70525 == null) {
            this.f70525 = C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C4969.m13786("string", "Current 16-digit lowercase hex version token; missing is not accepted.")).add("patches", C3184.m9603("type", "array", "description", "Runtime accepts 1..200 non-overlapping items.").add("items", C18828.m43457(JSON.object().add("byteOffset", C4969.m13786("integer", "Zero-based byte offset in 0..9007199254740991.")).add("expectedHex", C4969.m13786("string", "Current non-empty bytes as even-length hexadecimal without separators.")), "string", "Equal-length replacement bytes as hexadecimal without separators.", "replacementHex", "One equal-length raw byte patch."))), "Arguments for mt_file_patch_bytes.");
        }
        return this.f70525;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f70527 == null) {
            this.f70527 = C4969.m13780("Result for mt_file_patch_bytes.", C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute target path.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether target bytes changed.")).add("warnings", C3184.m9603("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C4969.m13786("string", "One warning message."))).add("size", C4969.m13786("integer", "Final raw byte size.")).add("targetVersion", C4969.m13786("string", "Final whole-file version token of 16 lowercase hex digits.")), "integer", "Total requested patch bytes, including no-op replacements.", "bytesPatched", "Successful local byte patch result."), C12123.m30172("mt_file_patch_bytes"), C4969.m13783("Success and expected-byte mismatch return a read_bytes action.", C4969.m13778(m48529(), "mt_file_read_bytes", "inspect"), C4969.m13778(m48529(), "mt_file_read_bytes", "retry")));
        }
        return this.f70527;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_patch_bytes", c12731);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:17:0x0033->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48527(C21145 c21145, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) {
        long j;
        long j2;
        Iterator it;
        int length;
        C4959 c4959;
        try {
            C14133.m34175(c21145, arrayList);
            C14133.m34174(c21145, bufferedOutputStream, arrayList);
        } catch (C12731 e) {
            if ("FILE_PATCH_EXPECTED_MISMATCH".equals(e.f42472)) {
                JSONValue jSONValue = e.f42468.get("byteOffset");
                if (jSONValue == null || !jSONValue.isNumber()) {
                    j = 0;
                } else {
                    try {
                        j = Long.parseLong(jSONValue.toString());
                    } catch (NumberFormatException unused) {
                        j = 0;
                        j2 = j;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            c4959 = (C4959) it.next();
                            if (c4959.f17307 != j2) {
                                length = c4959.f17309.length;
                                throw e.m31632(JSON.array().add(m48525("retry", "Read the current bytes at the mismatched patch window before retrying.", c21145.f68869.mo33986(), c21145.f68866, j2, length)));
                            }
                        }
                        length = 1;
                        throw e.m31632(JSON.array().add(m48525("retry", "Read the current bytes at the mismatched patch window before retrying.", c21145.f68869.mo33986(), c21145.f68866, j2, length)));
                    }
                }
                j2 = j;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c4959 = (C4959) it.next();
                    if (c4959.f17307 != j2) {
                        length = c4959.f17309.length;
                        throw e.m31632(JSON.array().add(m48525("retry", "Read the current bytes at the mismatched patch window before retrying.", c21145.f68869.mo33986(), c21145.f68866, j2, length)));
                    }
                }
                length = 1;
                throw e.m31632(JSON.array().add(m48525("retry", "Read the current bytes at the mismatched patch window before retrying.", c21145.f68869.mo33986(), c21145.f68866, j2, length)));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m48528(int i, JSONObject jSONObject, String str) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM5622 = C1694.m5622(new StringBuilder(), m48526(i), ".", str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Invalid patch hex argument", strM5622, jSONValue, JSON.array().add("non-empty hexadecimal string"), m48524());
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C12731.m31626("Patch hex must not be empty", strM5622, jSONValue, JSON.array().add("1..4096 bytes"), m48524());
        }
        if (strAsString.length() > 8192) {
            throw C12731.m31626("Patch item exceeds the 4096-byte limit", strM5622, JSON.value((((long) strAsString.length()) + 1) / 2), JSON.array().add("1..4096 bytes"), m48524());
        }
        try {
            return C9754.m24741(strAsString);
        } catch (IllegalArgumentException e) {
            throw C12731.m31627("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C3184.m9603("operation", "parse_patches", "backendReason", "invalid_hex").add("failedPatchIndex", i));
        }
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        JSONArray jSONArray;
        String str;
        HashSet hashSet = new HashSet();
        Iterator it = jSONObject.names().iterator();
        do {
            String str2 = "targetVersion";
            if (!it.hasNext()) {
                String[] strArr = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "patches"};
                for (int i = 0; i < 3; i++) {
                    String str3 = strArr[i];
                    if (!hashSet.contains(str3)) {
                        throw C12731.m31626(C0252.m1693("Missing parameter: ", str3), str3, (JSONValue) null, JSON.array(), m48524());
                    }
                }
                JSONObject jSONObjectM48524 = m48524();
                JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C12731.m31626("Invalid string argument", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array().add("string"), jSONObjectM48524);
                }
                String strAsString = jSONValue.asString();
                JSONObject jSONObjectM48525 = m48524();
                JSONValue jSONValue2 = jSONObject.get("targetVersion");
                if (jSONValue2 == null || !jSONValue2.isString()) {
                    throw C12731.m31626("Invalid string argument", "targetVersion", jSONValue2, JSON.array().add("string"), jSONObjectM48525);
                }
                String strAsString2 = jSONValue2.asString();
                if ("missing".equals(strAsString2)) {
                    throw C12731.m31626("mt_file_patch_bytes cannot create a missing file", "targetVersion", jSONObject.get("targetVersion"), JSON.array().add("<16 lowercase hex digits>"), m48524());
                }
                JSONValue jSONValue3 = jSONObject.get("patches");
                if (jSONValue3 == null || !jSONValue3.isArray()) {
                    throw C12731.m31626("Invalid patches argument", "patches", jSONValue3, JSON.array().add("array"), m48524());
                }
                JSONArray jSONArrayAsArray = jSONValue3.asArray();
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C12731.m31626("patches must contain 1 through 200 items", "patches", JSON.value(jSONArrayAsArray.size()), JSON.array().add("1..200"), m48524());
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                int length = 0;
                int i2 = 0;
                while (i2 < jSONArrayAsArray.size()) {
                    JSONValue jSONValue4 = jSONArrayAsArray.get(i2);
                    if (jSONValue4 == null || !jSONValue4.isObject()) {
                        throw C12731.m31626("Invalid patch item", m48526(i2), jSONValue4, JSON.array().add("object"), m48524());
                    }
                    JSONObject jSONObjectAsObject = jSONValue4.asObject();
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        jSONArray = jSONArrayAsArray;
                        if (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            if ((!"byteOffset".equals(str4) && !"expectedHex".equals(str4) && !"replacementHex".equals(str4)) || !hashSet2.add(str4)) {
                                throw C12731.m31626("Invalid patch item argument", C1694.m5622(new StringBuilder(), m48526(i2), ".", str4), jSONObjectAsObject.get(str4), JSON.array(), m48524());
                            }
                            jSONArrayAsArray = jSONArray;
                        }
                    }
                    String[] strArr2 = {"byteOffset", "expectedHex", "replacementHex"};
                    for (int i3 = 0; i3 < 3; i3++) {
                        String str5 = strArr2[i3];
                        if (!hashSet2.contains(str5)) {
                            throw C12731.m31626(C0252.m1693("Missing patch parameter: ", str5), C1694.m5622(new StringBuilder(), m48526(i2), ".", str5), (JSONValue) null, JSON.array(), m48524());
                        }
                    }
                    long jM38376 = C16249.m38376(jSONObjectAsObject, "byteOffset", 0L, 9007199254740991L);
                    byte[] bArrM48528 = m48528(i2, jSONObjectAsObject, "expectedHex");
                    byte[] bArrM48529 = m48528(i2, jSONObjectAsObject, "replacementHex");
                    if (bArrM48528.length != bArrM48529.length) {
                        throw C12731.m31626("expectedHex and replacementHex must contain the same byte count", C22697.m50267(new StringBuilder(), m48526(i2), ".replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array().add("same byte count as expectedHex"), m48524());
                    }
                    if (bArrM48528.length > 4096) {
                        throw C12731.m31626("Patch item exceeds the 4096-byte limit", C22697.m50267(new StringBuilder(), m48526(i2), ".expectedHex"), JSON.value(bArrM48528.length), JSON.array().add("1..4096 bytes"), m48524());
                    }
                    length += bArrM48528.length;
                    if (length > 65536) {
                        throw C12731.m31626("Patch byte budget exceeds 65536 bytes", "patches", JSON.value(length), JSON.array().add("1..65536 bytes"), m48524());
                    }
                    arrayList.add(new C4959(i2, jM38376, C16249.m38377(C22697.m50267(new StringBuilder(), m48526(i2), ".byteOffset"), jM38376, bArrM48528.length), bArrM48528, bArrM48529));
                    i2++;
                    jSONArrayAsArray = jSONArray;
                    str2 = str2;
                }
                String str6 = str2;
                C23846.sort(arrayList, C7618.comparingLong(new C15418()));
                for (int i4 = 1; i4 < arrayList.size(); i4++) {
                    C4959 c4959 = (C4959) arrayList.get(i4 - 1);
                    C4959 c49510 = (C4959) arrayList.get(i4);
                    if (c49510.f17307 < c4959.f17310) {
                        throw C12731.m31627("FILE_PATCH_OVERLAP", "Byte patch ranges must not overlap.", "warning", (JSONArray) null, C3184.m9603("operation", "parse_patches", "backendReason", "overlapping_ranges").add("failedPatchIndex", c49510.f17306).add("conflictingPatchIndex", c4959.f17306).add("byteOffset", c49510.f17307).add("endByteOffset", c49510.f17310));
                    }
                }
                C7740 c7740M40988 = this.f70526.m40988(strAsString, strAsString2, new C4328(arrayList));
                int length2 = 0;
                C4959 c49511 = (C4959) arrayList.get(0);
                JSONArray jSONArrayAdd = JSON.array().add(m48525("inspect", "Read back the first patched window using the new targetVersion.", c7740M40988.f25579, c7740M40988.f25575, c49511.f17307, c49511.f17309.length));
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c7740M40988.f25579).add("changed", c7740M40988.f25576).add("warnings", new JSONArray(c7740M40988.f25577)).add("size", c7740M40988.f25578).add(str6, c7740M40988.f25575);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    length2 += ((C4959) it3.next()).f17309.length;
                }
                return new C17669(C0735.m3193(jSONObjectAdd.add("bytesPatched", length2), jSONArrayAdd));
            }
            str = (String) it.next();
            if (!MotionUtils.EASING_TYPE_PATH.equals(str) && !"targetVersion".equals(str) && !"patches".equals(str)) {
                break;
            }
        } while (hashSet.add(str));
        throw C12731.m31626("Invalid file byte patch argument", str, jSONObject.get(str), JSON.array(), m48524());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static JSONObject m48529() {
        return C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute file path.")).add("targetVersion", C4969.m13786("string", "Whole-file targetVersion.")).add("byteOffset", C4969.m13786("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m48525(String str, String str2, String str3, String str4, long j, int i) {
        return C11320.m28376(C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m48524() {
        return C3184.m9603(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "<copy current targetVersion>").add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "FF")));
    }
}
