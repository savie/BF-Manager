package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֨ᩴ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1305 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f5580;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17617 f5581;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JSONObject f5582;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_edit_text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Create or edit one regular local text file with strict decoding and encoding while preserving its real LF, CRLF, and CR characters. For an existing file, first call mt_file_read_text and copy its exact absolute path, encoding, and targetVersion. For creation pass targetVersion=\"missing\", a non-empty encoding such as \"utf-8\", and one write_target edit. edits[] accepts 1..200 items with mode, matchText, and writeText. write_target must be the only edit. Local replace_match, insert_before_match, and insert_after_match modes require a non-empty matchText that occurs exactly once in the same original text; matched ranges cannot overlap. No mode adds a newline automatically. The existing raw file and encoded result are each limited to 10485760 bytes (10 MiB); all request matchText plus writeText total at most 524288 Unicode code points. The same encoding is used for strict decode and encode, so this tool does not transcode and never replaces malformed or unmappable text. The encoding token preserves or creates its declared BOM exactly. The tool creates no backup file; inspect the reported state after a failed write.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Edit File Text";
    }

    public C1305(C17617 c17617) {
        this.f5581 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        if (this.f5580 == null) {
            this.f5580 = C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("targetVersion", C4969.m13786("string", "Copy the exact version returned by mt_file_read_text, or pass \"missing\" only to create a new file.")).add("encoding", C4969.m13786("string", "For existing files copy the actual lowercase token from mt_file_read_text; for creation pass \"utf-8\" normally (no BOM), or \"utf-8-bom\" when a BOM is needed.")).add("edits", C3184.m9603("type", "array", "description", "1..200 edits; all matchText and writeText values total at most 524288 Unicode code points.").add("items", C18828.m43457(JSON.object().add("mode", C4969.m13784("write_target, replace_match, insert_before_match, or insert_after_match.", "write_target", "replace_match", "insert_before_match", "insert_after_match")).add("matchText", C4969.m13786("string", "Empty for write_target; otherwise exact non-empty text occurring once in the original file.")), "string", "Exact text to write; no newline is added. May be empty for write_target or replace_match.", "writeText", "One edit against the same original text."))), "Arguments for mt_file_edit_text.");
        }
        return this.f5580;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        if (this.f5582 == null) {
            this.f5582 = C4969.m13780("Result for mt_file_edit_text.", C4969.m13777(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute path fixed for this operation.")).add("encoding", C4969.m13786("string", "Actual lowercase editor encoding token used for decode and encode.")).add("size", C4969.m13786("integer", "Final raw file size in bytes.")).add("targetVersion", C4969.m13786("string", "Final raw-byte version as 16 lowercase hex digits.")).add("changed", C4969.m13786(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation state.")).add("warnings", C4969.m13788("Metadata or publication guarantee limitations; empty when none.")), "Final state after the complete text edit was published."), C12123.m30172("mt_file_edit_text"), m4659());
        }
        return this.f5582;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_edit_text", c12731);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4657(String str, String[] strArr, ArrayList arrayList, C16725[] c16725Arr, C21145 c21145, BufferedOutputStream bufferedOutputStream) throws C12731, IOException {
        String str2;
        String strM50267;
        String str3;
        String str4;
        boolean z = c21145.f68867;
        String str5 = c21145.f68866;
        AbstractC20745 abstractC20745 = c21145.f68869;
        if (z) {
            try {
                C0496 c0496M40633 = C17430.m40633(str, m4658(c21145, 10485760));
                str2 = c0496M40633.f2184;
                strArr[0] = c0496M40633.f2183;
            } catch (CharacterCodingException unused) {
                String strMo33986 = abstractC20745.mo33986();
                throw C12731.m31627("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", JSON.array().add(C11320.m28376(C3184.m9603(MotionUtils.EASING_TYPE_PATH, strMo33986, "targetVersion", str5).add("byteOffset", 0).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Inspect the current raw bytes before choosing another text encoding.")), m4650(strMo33986, "decode_failed"));
            } catch (C20253 unused2) {
                throw m4656("FILE_TEXT_ENCODING_MISMATCH", "The encoding token BOM does not match the current file. Re-read the file and copy its returned encoding.", abstractC20745.mo33986(), c21145.f68866, "bom_mismatch", "");
            }
        } else {
            strArr[0] = str;
            str2 = "";
        }
        try {
            try {
                C16725 c16725M40634 = C17430.m40634(10485760, C11869.m29590(str2, arrayList), strArr[0]);
                c16725Arr[0] = c16725M40634;
                bufferedOutputStream.write(c16725M40634.f53559);
            } catch (CharacterCodingException unused3) {
                throw m4656("FILE_TEXT_ENCODE_FAILED", "The edited text contains characters that cannot be represented in the selected encoding.", abstractC20745.mo33986(), c21145.f68866, "unmappable_text", strArr[0]);
            } catch (C12492 e) {
                throw m4655("FILE_TEXT_RESULT_TOO_LARGE", "The encoded text exceeds the 10485760-byte result limit.", abstractC20745.mo33986(), "encoded_result", 10485760L, e.f41783, strArr[0], c21145.f68866);
            }
        } catch (C9857 e2) {
            String strMo33987 = abstractC20745.mo33986();
            String str6 = strArr[0];
            int i = C22473.f73369[e2.f33664.ordinal()];
            int i2 = e2.f33665;
            int i3 = e2.f33666;
            if (i == 1) {
                strM50267 = C22697.m50267(new StringBuilder(), m4653(i3, "matchText"), " was not found in the current text. Re-read and retry with current text.");
                str3 = "FILE_TEXT_MATCH_NOT_FOUND";
                str4 = "match_not_found";
            } else if (i == 2) {
                strM50267 = C22697.m50267(new StringBuilder(), m4653(i3, "matchText"), " appears multiple times. Use longer surrounding context that appears once.");
                str3 = "FILE_TEXT_MATCH_AMBIGUOUS";
                str4 = "match_ambiguous";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(e2);
                }
                strM50267 = C8015.m21119("edits[", i3, "] overlaps edits[", "]; matched ranges cannot overlap.", i2);
                str3 = "FILE_TEXT_MATCH_OVERLAP";
                str4 = "match_overlap";
            }
            throw C12731.m31627(str3, strM50267, "warning", JSON.array().add(m4652("retry", "Re-read the current file from the beginning; continue pagination if needed.", strMo33987, str6, str5)), m4650(strMo33987, str4).add("failedEditIndex", i3).add("conflictingEditIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m4658(C21145 c21145, int i) throws C12731, IOException {
        long j = c21145.f68868;
        AbstractC20745 abstractC20745 = c21145.f68869;
        long j2 = i;
        if (j > j2) {
            throw m4655("FILE_TEXT_TARGET_TOO_LARGE", C2271.m6966(i, "The existing file exceeds the ", "-byte text edit limit."), abstractC20745.mo33986(), "target_too_large", j2, c21145.f68868, "", c21145.f68866);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(j >= 0 ? (int) j : Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        InputStream inputStreamM47580 = c21145.m47580();
        do {
            try {
                int i2 = inputStreamM47580.read(bArr, 0, Math.min(8192, (i + 1) - byteArrayOutputStream.size()));
                if (i2 >= 0) {
                    if (i2 == 0) {
                        int i3 = inputStreamM47580.read();
                        if (i3 >= 0) {
                            byteArrayOutputStream.write(i3);
                        }
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                inputStreamM47580.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                if (inputStreamM47580 != null) {
                    try {
                        inputStreamM47580.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } while (byteArrayOutputStream.size() <= i);
        throw m4655("FILE_TEXT_TARGET_TOO_LARGE", "The existing file exceeds the " + i + "-byte text edit limit.", abstractC20745.mo33986(), "target_too_large", j2, byteArrayOutputStream.size(), "", c21145.f68866);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        String str;
        int i;
        String str2;
        HashSet hashSet = new HashSet();
        Iterator it = jSONObject.names().iterator();
        do {
            boolean zHasNext = it.hasNext();
            String str3 = "edits";
            String str4 = "encoding";
            String str5 = MotionUtils.EASING_TYPE_PATH;
            if (zHasNext) {
                str2 = (String) it.next();
                if (!MotionUtils.EASING_TYPE_PATH.equals(str2) && !"targetVersion".equals(str2) && !"encoding".equals(str2) && !"edits".equals(str2)) {
                    break;
                }
            } else {
                String[] strArr = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "edits"};
                for (int i2 = 0; i2 < 4; i2++) {
                    String str6 = strArr[i2];
                    if (!hashSet.contains(str6)) {
                        throw C12731.m31626(C0252.m1693("Missing parameter: ", str6), str6, (JSONValue) null, JSON.array(), m4649());
                    }
                }
                String strM4654 = m4654(jSONObject, MotionUtils.EASING_TYPE_PATH, m4649(), MotionUtils.EASING_TYPE_PATH);
                String strM4655 = m4654(jSONObject, "targetVersion", m4649(), "targetVersion");
                String strM4656 = m4654(jSONObject, "encoding", m4649(), "encoding");
                JSONObject jSONObjectM4649 = m4649();
                JSONValue jSONValue = jSONObject.get("edits");
                if (jSONValue == null || !jSONValue.isArray()) {
                    throw C12731.m31626("Invalid array argument", "edits", jSONValue, JSON.array(), jSONObjectM4649);
                }
                JSONArray jSONArrayAsArray = jSONValue.asArray();
                JSONObject jSONObjectM4651 = m4651(strM4654, strM4655, strM4656);
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C12731.m31626("edits must contain 1..200 items", "edits", jSONArrayAsArray, JSON.array("1..200"), jSONObjectM4651);
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                long jCodePointCount = 0;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    String str7 = str5;
                    String str8 = strM4654;
                    String str9 = str4;
                    final String str10 = strM4656;
                    if (i3 >= jSONArrayAsArray.size()) {
                        String str11 = strM4655;
                        final ArrayList arrayList2 = arrayList;
                        int i5 = i4;
                        if (arrayList2.size() > 1 && i5 >= 0) {
                            throw C12731.m31626("write_target must be the only edit", m4653(i5, "mode"), JSON.value("write_target"), JSON.array("replace_match", "insert_before_match", "insert_after_match"), jSONObjectM4651);
                        }
                        if ("missing".equals(str11)) {
                            if (str10.isEmpty()) {
                                throw C12731.m31626("Creating a text file requires a non-empty encoding token", str9, JSON.value(str10), JSON.array(), m4649());
                            }
                            if (arrayList2.size() != 1 || !"write_target".equals(((C2094) arrayList2.get(0)).f7732)) {
                                throw C12731.m31626("targetVersion=missing requires one write_target edit", str3, jSONObject.get(str3), JSON.array("one write_target"), m4649());
                            }
                        }
                        if (!str10.isEmpty()) {
                            C22452.m49943(str10);
                        }
                        final String[] strArr2 = {str10};
                        final C16725[] c16725Arr = new C16725[1];
                        C7740 c7740M40988 = this.f5581.m40988(str8, str11, new InterfaceC7034() { // from class: l.ۚᩴ۬
                            @Override // l.InterfaceC7034
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ void mo2748() {
                            }

                            @Override // l.InterfaceC7034
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo2749(C21145 c21145, BufferedOutputStream bufferedOutputStream) throws C12731, IOException {
                                C1305.m4657(str10, strArr2, arrayList2, c16725Arr, c21145, bufferedOutputStream);
                            }
                        });
                        String str12 = c7740M40988.f25575;
                        String str13 = c7740M40988.f25579;
                        C17430.m40635(c16725Arr[0]);
                        return new C17669(C0735.m3193(JSON.object().add(str7, str13).add(str9, strArr2[0]).add("size", c7740M40988.f25578).add("targetVersion", str12).add("changed", c7740M40988.f25576).add("warnings", c7740M40988.f25577), JSON.array().add(m4652("inspect", "Verify text from the published file version.", str13, strArr2[0], str12))));
                    }
                    JSONValue jSONValue2 = jSONArrayAsArray.get(i3);
                    if (jSONValue2 == null || !jSONValue2.isObject()) {
                        throw C12731.m31626("Invalid edits item", C2271.m6966(i3, "edits[", "]"), jSONValue2, JSON.array(), jSONObjectM4651);
                    }
                    JSONObject jSONObjectAsObject = jSONValue2.asObject();
                    JSONArray jSONArray = jSONArrayAsArray;
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        str = strM4655;
                        i = i4;
                        if (it2.hasNext()) {
                            String str14 = str3;
                            String str15 = (String) it2.next();
                            if ((!"mode".equals(str15) && !"matchText".equals(str15) && !"writeText".equals(str15)) || !hashSet2.add(str15)) {
                                throw C12731.m31626("Unknown edit item argument", m4653(i3, str15), jSONObjectAsObject.get(str15), JSON.array(), jSONObjectM4651);
                            }
                            strM4655 = str;
                            i4 = i;
                            str3 = str14;
                        }
                    }
                    String str16 = str3;
                    String[] strArr3 = {"mode", "matchText", "writeText"};
                    ArrayList arrayList3 = arrayList;
                    long j = jCodePointCount;
                    for (int i6 = 0; i6 < 3; i6++) {
                        String str17 = strArr3[i6];
                        if (!hashSet2.contains(str17)) {
                            throw C12731.m31626("Missing parameter: " + m4653(i3, str17), m4653(i3, str17), (JSONValue) null, JSON.array(), jSONObjectM4651);
                        }
                    }
                    String strM4657 = m4654(jSONObjectAsObject, "mode", jSONObjectM4651, m4653(i3, "mode"));
                    String strM4658 = m4654(jSONObjectAsObject, "matchText", jSONObjectM4651, m4653(i3, "matchText"));
                    String strM4659 = m4654(jSONObjectAsObject, "writeText", jSONObjectM4651, m4653(i3, "writeText"));
                    if ("write_target".equals(strM4657)) {
                        if (!strM4658.isEmpty()) {
                            throw C12731.m31626("write_target requires empty matchText", m4653(i3, "matchText"), JSON.value(strM4658), JSON.array(""), jSONObjectM4651);
                        }
                    } else if (!"replace_match".equals(strM4657)) {
                        if (!"insert_before_match".equals(strM4657) && !"insert_after_match".equals(strM4657)) {
                            throw C12731.m31626("Invalid text edit mode", m4653(i3, "mode"), JSON.value(strM4657), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), jSONObjectM4651);
                        }
                        if (strM4658.isEmpty()) {
                            throw C12731.m31626(C15489.m37076(strM4657, " requires non-empty matchText"), m4653(i3, "matchText"), JSON.value(strM4658), JSON.array(), jSONObjectM4651);
                        }
                        if (strM4659.isEmpty()) {
                            throw C12731.m31626(C15489.m37076(strM4657, " requires non-empty writeText"), m4653(i3, "writeText"), JSON.value(strM4659), JSON.array(), jSONObjectM4651);
                        }
                    } else if (strM4658.isEmpty()) {
                        throw C12731.m31626("replace_match requires non-empty matchText", m4653(i3, "matchText"), JSON.value(strM4658), JSON.array(), jSONObjectM4651);
                    }
                    i4 = "write_target".equals(strM4657) ? i3 : i;
                    jCodePointCount = j + ((long) strM4658.codePointCount(0, strM4658.length())) + ((long) strM4659.codePointCount(0, strM4659.length()));
                    if (jCodePointCount > 524288) {
                        throw C12731.m31626("All matchText and writeText values may contain at most 524288 Unicode code points in total", str16, JSON.value(jCodePointCount), JSON.array("0..524288"), jSONObjectM4651);
                    }
                    arrayList3.add(new C2094(strM4657, strM4658, strM4659));
                    i3++;
                    arrayList = arrayList3;
                    str5 = str7;
                    strM4654 = str8;
                    str4 = str9;
                    strM4656 = str10;
                    jSONArrayAsArray = jSONArray;
                    strM4655 = str;
                    str3 = str16;
                }
            }
        } while (hashSet.add(str2));
        throw C12731.m31626("Unknown file text edit argument", str2, jSONObject.get(str2), JSON.array(), m4649());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4654(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) throws C12731 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C12731.m31626("Invalid string argument", str2, jSONValue, JSON.array(), jSONObject2);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m4656(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONArray jSONArrayArray = "missing".equals(str4) ? JSON.array() : JSON.array().add(m4652("retry", "Re-read the current file from the beginning; continue pagination if needed.", str3, str6, str4));
        JSONObject jSONObjectM4650 = m4650(str3, str5);
        JSONValue jSONValue = JSON.NULL;
        return C12731.m31627(str, str2, "warning", jSONArrayArray, jSONObjectM4650.add("limit", jSONValue).add("actual", jSONValue));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m4655(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        JSONObject jSONObjectAdd = m4650(str3, str4).add("limit", j).add("actual", j2 < 0 ? JSON.NULL : JSON.value(j2));
        JSONArray jSONArrayArray = (str6 == null || str6.isEmpty() || "missing".equals(str6)) ? JSON.array() : JSON.array().add(m4652("inspect", "Read the file in pages.", str3, str5, str6));
        if ("FILE_TEXT_RESULT_TOO_LARGE".equals(str)) {
            return C12731.m31627(str, str2, "warning", jSONArrayArray, jSONObjectAdd);
        }
        return C12731.m31631(str, str2, "fatal", jSONArrayArray, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4650(String str, String str2) {
        return C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "operation", "edit_text").add("backendReason", str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4652(String str, String str2, String str3, String str4, String str5) {
        return C11320.m28376(C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static JSONObject m4659() {
        JSONObject jSONObjectM43457 = C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute path.")).add("encoding", C4969.m13786("string", "Exact token for verification or empty string to auto-detect.")).add("targetVersion", C4969.m13786("string", "Exact current version bound to this read.")).add("limit", C4969.m13786("integer", "Logical line limit.")).add("maxChars", C4969.m13786("integer", "Unicode code-point limit.")).add("startLine", C4969.m13786("integer", "Zero-based line.")), "integer", "Zero-based column.", "startColumn", "Arguments for mt_file_read_text.");
        return C4969.m13783("Contains a text verification read after success, a current-file retry read after a recoverable match error, or a raw-byte inspection after decode failure.", C4969.m13778(jSONObjectM43457, "mt_file_read_text", "inspect"), C4969.m13778(jSONObjectM43457, "mt_file_read_text", "retry"), C4969.m13778(C18828.m43457(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C4969.m13786("string", "Normalized absolute path.")).add("targetVersion", C4969.m13786("string", "Exact current version bound to this read.")).add("byteOffset", C4969.m13786("integer", "Zero-based byte offset.")), "integer", "Maximum raw bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m4653(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("edits[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static JSONObject m4649() {
        return m4651("file.txt", "<copy from mt_file_read_text>", "utf-8");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4651(String str, String str2, String str3) {
        return C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "targetVersion", str2).add("encoding", str3).add("edits", JSON.array().add(C3184.m9603("mode", "replace_match", "matchText", "old text").add("writeText", "new text")));
    }
}
