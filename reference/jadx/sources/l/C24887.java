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

/* JADX INFO: renamed from: l.᩻۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6XC */
/* JADX INFO: loaded from: classes.dex */
public final class C24887 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f80521;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0580 f80522;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f80523;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m55416(int i) {
        return C14442.m34864(i, "patches[", "]");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Patch File Bytes";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Apply 1..200 equal-length raw byte patches to one existing regular local file. Copy targetVersion from mt_file_stat or mt_file_read_bytes; missing is not accepted. Each item contains a 0-based byteOffset plus non-empty, even-length expectedHex and replacementHex of the same size. Inputs are case-insensitive hex without separators. Each item is limited to 4096 bytes and the call to 65536 patched bytes. Ranges must not overlap; adjacent ranges are valid. All expected windows are checked before patched bytes are written. Large files are supported.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_patch_bytes";
    }

    public C24887(C0580 c0580) {
        this.f80522 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f80521 == null) {
            this.f80521 = C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C10932.m27740("string", "Current 16-digit lowercase hex version token; missing is not accepted.")).add("patches", C22121.m50076("type", "array", "description", "Runtime accepts 1..200 non-overlapping items.").add("items", C22783.m51386(JSON.object().add("byteOffset", C10932.m27740("integer", "Zero-based byte offset in 0..9007199254740991.")).add("expectedHex", C10932.m27740("string", "Current non-empty bytes as even-length hexadecimal without separators.")), "string", "Equal-length replacement bytes as hexadecimal without separators.", "replacementHex", "One equal-length raw byte patch."))), "Arguments for mt_file_patch_bytes.");
        }
        return this.f80521;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f80523 == null) {
            this.f80523 = C10932.m27734("Result for mt_file_patch_bytes.", C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute target path.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether target bytes changed.")).add("warnings", C22121.m50076("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C10932.m27740("string", "One warning message."))).add("size", C10932.m27740("integer", "Final raw byte size.")).add("targetVersion", C10932.m27740("string", "Final whole-file version token of 16 lowercase hex digits.")), "integer", "Total requested patch bytes, including no-op replacements.", "bytesPatched", "Successful local byte patch result."), C5596.m16576("mt_file_patch_bytes"), C10932.m27737("Success and expected-byte mismatch return a read_bytes action.", C10932.m27732(m55419(), "mt_file_read_bytes", "inspect"), C10932.m27732(m55419(), "mt_file_read_bytes", "retry")));
        }
        return this.f80523;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_patch_bytes", c10186);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:17:0x0033->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55417(C12512 c12512, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) {
        long j;
        long j2;
        Iterator it;
        int length;
        C8368 c8368;
        try {
            C6877.m19144(c12512, arrayList);
            C6877.m19143(c12512, bufferedOutputStream, arrayList);
        } catch (C10186 e) {
            if ("FILE_PATCH_EXPECTED_MISMATCH".equals(e.f32601)) {
                JSONValue jSONValue = e.f32602.get("byteOffset");
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
                            c8368 = (C8368) it.next();
                            if (c8368.f27451 != j2) {
                                length = c8368.f27452.length;
                                throw e.m26307(JSON.array().add(m55415("retry", "Read the current bytes at the mismatched patch window before retrying.", c12512.f40175.mo4294(), c12512.f40176, j2, length)));
                            }
                        }
                        length = 1;
                        throw e.m26307(JSON.array().add(m55415("retry", "Read the current bytes at the mismatched patch window before retrying.", c12512.f40175.mo4294(), c12512.f40176, j2, length)));
                    }
                }
                j2 = j;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c8368 = (C8368) it.next();
                    if (c8368.f27451 != j2) {
                        length = c8368.f27452.length;
                        throw e.m26307(JSON.array().add(m55415("retry", "Read the current bytes at the mismatched patch window before retrying.", c12512.f40175.mo4294(), c12512.f40176, j2, length)));
                    }
                }
                length = 1;
                throw e.m26307(JSON.array().add(m55415("retry", "Read the current bytes at the mismatched patch window before retrying.", c12512.f40175.mo4294(), c12512.f40176, j2, length)));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m55418(int i, JSONObject jSONObject, String str) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM31438 = C12669.m31438(new StringBuilder(), m55416(i), ".", str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Invalid patch hex argument", strM31438, jSONValue, JSON.array().add("non-empty hexadecimal string"), m55420());
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C10186.m26301("Patch hex must not be empty", strM31438, jSONValue, JSON.array().add("1..4096 bytes"), m55420());
        }
        if (strAsString.length() > 8192) {
            throw C10186.m26301("Patch item exceeds the 4096-byte limit", strM31438, JSON.value((((long) strAsString.length()) + 1) / 2), JSON.array().add("1..4096 bytes"), m55420());
        }
        try {
            return C16973.m40024(strAsString);
        } catch (IllegalArgumentException e) {
            throw C10186.m26302("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C22121.m50076("operation", "parse_patches", "backendReason", "invalid_hex").add("failedPatchIndex", i));
        }
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
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
                        throw C10186.m26301(C25272.m56409("Missing parameter: ", str3), str3, (JSONValue) null, JSON.array(), m55420());
                    }
                }
                JSONObject jSONObjectM55420 = m55420();
                JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C10186.m26301("Invalid string argument", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array().add("string"), jSONObjectM55420);
                }
                String strAsString = jSONValue.asString();
                JSONObject jSONObjectM55421 = m55420();
                JSONValue jSONValue2 = jSONObject.get("targetVersion");
                if (jSONValue2 == null || !jSONValue2.isString()) {
                    throw C10186.m26301("Invalid string argument", "targetVersion", jSONValue2, JSON.array().add("string"), jSONObjectM55421);
                }
                String strAsString2 = jSONValue2.asString();
                if ("missing".equals(strAsString2)) {
                    throw C10186.m26301("mt_file_patch_bytes cannot create a missing file", "targetVersion", jSONObject.get("targetVersion"), JSON.array().add("<16 lowercase hex digits>"), m55420());
                }
                JSONValue jSONValue3 = jSONObject.get("patches");
                if (jSONValue3 == null || !jSONValue3.isArray()) {
                    throw C10186.m26301("Invalid patches argument", "patches", jSONValue3, JSON.array().add("array"), m55420());
                }
                JSONArray jSONArrayAsArray = jSONValue3.asArray();
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C10186.m26301("patches must contain 1 through 200 items", "patches", JSON.value(jSONArrayAsArray.size()), JSON.array().add("1..200"), m55420());
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                int length = 0;
                int i2 = 0;
                while (i2 < jSONArrayAsArray.size()) {
                    JSONValue jSONValue4 = jSONArrayAsArray.get(i2);
                    if (jSONValue4 == null || !jSONValue4.isObject()) {
                        throw C10186.m26301("Invalid patch item", m55416(i2), jSONValue4, JSON.array().add("object"), m55420());
                    }
                    JSONObject jSONObjectAsObject = jSONValue4.asObject();
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        jSONArray = jSONArrayAsArray;
                        if (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            if ((!"byteOffset".equals(str4) && !"expectedHex".equals(str4) && !"replacementHex".equals(str4)) || !hashSet2.add(str4)) {
                                throw C10186.m26301("Invalid patch item argument", C12669.m31438(new StringBuilder(), m55416(i2), ".", str4), jSONObjectAsObject.get(str4), JSON.array(), m55420());
                            }
                            jSONArrayAsArray = jSONArray;
                        }
                    }
                    String[] strArr2 = {"byteOffset", "expectedHex", "replacementHex"};
                    for (int i3 = 0; i3 < 3; i3++) {
                        String str5 = strArr2[i3];
                        if (!hashSet2.contains(str5)) {
                            throw C10186.m26301(C25272.m56409("Missing patch parameter: ", str5), C12669.m31438(new StringBuilder(), m55416(i2), ".", str5), (JSONValue) null, JSON.array(), m55420());
                        }
                    }
                    long jM18216 = C6437.m18216(jSONObjectAsObject, "byteOffset", 0L, 9007199254740991L);
                    byte[] bArrM55418 = m55418(i2, jSONObjectAsObject, "expectedHex");
                    byte[] bArrM55419 = m55418(i2, jSONObjectAsObject, "replacementHex");
                    if (bArrM55418.length != bArrM55419.length) {
                        throw C10186.m26301("expectedHex and replacementHex must contain the same byte count", C8947.m23910(new StringBuilder(), m55416(i2), ".replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array().add("same byte count as expectedHex"), m55420());
                    }
                    if (bArrM55418.length > 4096) {
                        throw C10186.m26301("Patch item exceeds the 4096-byte limit", C8947.m23910(new StringBuilder(), m55416(i2), ".expectedHex"), JSON.value(bArrM55418.length), JSON.array().add("1..4096 bytes"), m55420());
                    }
                    length += bArrM55418.length;
                    if (length > 65536) {
                        throw C10186.m26301("Patch byte budget exceeds 65536 bytes", "patches", JSON.value(length), JSON.array().add("1..65536 bytes"), m55420());
                    }
                    arrayList.add(new C8368(i2, jM18216, C6437.m18217(C8947.m23910(new StringBuilder(), m55416(i2), ".byteOffset"), jM18216, bArrM55418.length), bArrM55418, bArrM55419));
                    i2++;
                    jSONArrayAsArray = jSONArray;
                    str2 = str2;
                }
                String str6 = str2;
                C12884.sort(arrayList, C2661.comparingLong(new C11460()));
                for (int i4 = 1; i4 < arrayList.size(); i4++) {
                    C8368 c8368 = (C8368) arrayList.get(i4 - 1);
                    C8368 c8369 = (C8368) arrayList.get(i4);
                    if (c8369.f27451 < c8368.f27454) {
                        throw C10186.m26302("FILE_PATCH_OVERLAP", "Byte patch ranges must not overlap.", "warning", (JSONArray) null, C22121.m50076("operation", "parse_patches", "backendReason", "overlapping_ranges").add("failedPatchIndex", c8369.f27455).add("conflictingPatchIndex", c8368.f27455).add("byteOffset", c8369.f27451).add("endByteOffset", c8369.f27454));
                    }
                }
                C20717 c20717M2662 = this.f80522.m2662(strAsString, strAsString2, new C21151(arrayList));
                int length2 = 0;
                C8368 c83610 = (C8368) arrayList.get(0);
                JSONArray jSONArrayAdd = JSON.array().add(m55415("inspect", "Read back the first patched window using the new targetVersion.", c20717M2662.f66393, c20717M2662.f66394, c83610.f27451, c83610.f27452.length));
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c20717M2662.f66393).add("changed", c20717M2662.f66390).add("warnings", new JSONArray(c20717M2662.f66392)).add("size", c20717M2662.f66391).add(str6, c20717M2662.f66394);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    length2 += ((C8368) it3.next()).f27452.length;
                }
                return new C1238(C15300.m36728(jSONObjectAdd.add("bytesPatched", length2), jSONArrayAdd));
            }
            str = (String) it.next();
            if (!MotionUtils.EASING_TYPE_PATH.equals(str) && !"targetVersion".equals(str) && !"patches".equals(str)) {
                break;
            }
        } while (hashSet.add(str));
        throw C10186.m26301("Invalid file byte patch argument", str, jSONObject.get(str), JSON.array(), m55420());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static JSONObject m55419() {
        return C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute file path.")).add("targetVersion", C10932.m27740("string", "Whole-file targetVersion.")).add("byteOffset", C10932.m27740("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m55415(String str, String str2, String str3, String str4, long j, int i) {
        return C2729.m9064(C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m55420() {
        return C22121.m50076(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "<copy current targetVersion>").add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "FF")));
    }
}
