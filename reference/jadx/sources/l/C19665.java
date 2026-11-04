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

/* JADX INFO: renamed from: l.ᩴ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19665 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONObject f63341;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0580 f63342;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JSONObject f63343;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Edit File Text";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Create or edit one regular local text file with strict decoding and encoding while preserving its real LF, CRLF, and CR characters. For an existing file, first call mt_file_read_text and copy its exact absolute path, encoding, and targetVersion. For creation pass targetVersion=\"missing\", a non-empty encoding such as \"utf-8\", and one write_target edit. edits[] accepts 1..200 items with mode, matchText, and writeText. write_target must be the only edit. Local replace_match, insert_before_match, and insert_after_match modes require a non-empty matchText that occurs exactly once in the same original text; matched ranges cannot overlap. No mode adds a newline automatically. The existing raw file and encoded result are each limited to 10485760 bytes (10 MiB); all request matchText plus writeText total at most 524288 Unicode code points. The same encoding is used for strict decode and encode, so this tool does not transcode and never replaces malformed or unmappable text. The encoding token preserves or creates its declared BOM exactly. The tool creates no backup file; inspect the reported state after a failed write.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_edit_text";
    }

    public C19665(C0580 c0580) {
        this.f63342 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        if (this.f63341 == null) {
            this.f63341 = C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("targetVersion", C10932.m27740("string", "Copy the exact version returned by mt_file_read_text, or pass \"missing\" only to create a new file.")).add("encoding", C10932.m27740("string", "For existing files copy the actual lowercase token from mt_file_read_text; for creation pass \"utf-8\" normally (no BOM), or \"utf-8-bom\" when a BOM is needed.")).add("edits", C22121.m50076("type", "array", "description", "1..200 edits; all matchText and writeText values total at most 524288 Unicode code points.").add("items", C22783.m51386(JSON.object().add("mode", C10932.m27738("write_target, replace_match, insert_before_match, or insert_after_match.", "write_target", "replace_match", "insert_before_match", "insert_after_match")).add("matchText", C10932.m27740("string", "Empty for write_target; otherwise exact non-empty text occurring once in the original file.")), "string", "Exact text to write; no newline is added. May be empty for write_target or replace_match.", "writeText", "One edit against the same original text."))), "Arguments for mt_file_edit_text.");
        }
        return this.f63341;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        if (this.f63343 == null) {
            this.f63343 = C10932.m27734("Result for mt_file_edit_text.", C10932.m27731(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute path fixed for this operation.")).add("encoding", C10932.m27740("string", "Actual lowercase editor encoding token used for decode and encode.")).add("size", C10932.m27740("integer", "Final raw file size in bytes.")).add("targetVersion", C10932.m27740("string", "Final raw-byte version as 16 lowercase hex digits.")).add("changed", C10932.m27740(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation state.")).add("warnings", C10932.m27742("Metadata or publication guarantee limitations; empty when none.")), "Final state after the complete text edit was published."), C5596.m16576("mt_file_edit_text"), m45335());
        }
        return this.f63343;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_edit_text", c10186);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45333(String str, String[] strArr, ArrayList arrayList, C21551[] c21551Arr, C12512 c12512, BufferedOutputStream bufferedOutputStream) throws C10186, IOException {
        String str2;
        String strM23910;
        String str3;
        String str4;
        boolean z = c12512.f40173;
        String str5 = c12512.f40176;
        AbstractC22044 abstractC22044 = c12512.f40175;
        if (z) {
            try {
                C14837 c14837M2891 = C0668.m2891(str, m45334(c12512, 10485760));
                str2 = c14837M2891.f48528;
                strArr[0] = c14837M2891.f48527;
            } catch (CharacterCodingException unused) {
                String strMo4294 = abstractC22044.mo4294();
                throw C10186.m26302("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", JSON.array().add(C2729.m9064(C22121.m50076(MotionUtils.EASING_TYPE_PATH, strMo4294, "targetVersion", str5).add("byteOffset", 0).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Inspect the current raw bytes before choosing another text encoding.")), m45326(strMo4294, "decode_failed"));
            } catch (C4397 unused2) {
                throw m45332("FILE_TEXT_ENCODING_MISMATCH", "The encoding token BOM does not match the current file. Re-read the file and copy its returned encoding.", abstractC22044.mo4294(), c12512.f40176, "bom_mismatch", "");
            }
        } else {
            strArr[0] = str;
            str2 = "";
        }
        try {
            try {
                C21551 c21551M2892 = C0668.m2892(10485760, C4530.m14252(str2, arrayList), strArr[0]);
                c21551Arr[0] = c21551M2892;
                bufferedOutputStream.write(c21551M2892.f68832);
            } catch (CharacterCodingException unused3) {
                throw m45332("FILE_TEXT_ENCODE_FAILED", "The edited text contains characters that cannot be represented in the selected encoding.", abstractC22044.mo4294(), c12512.f40176, "unmappable_text", strArr[0]);
            } catch (C18567 e) {
                throw m45331("FILE_TEXT_RESULT_TOO_LARGE", "The encoded text exceeds the 10485760-byte result limit.", abstractC22044.mo4294(), "encoded_result", 10485760L, e.f60333, strArr[0], c12512.f40176);
            }
        } catch (C2817 e2) {
            String strMo4295 = abstractC22044.mo4294();
            String str6 = strArr[0];
            int i = C22649.f73560[e2.f9260.ordinal()];
            int i2 = e2.f9259;
            int i3 = e2.f9261;
            if (i == 1) {
                strM23910 = C8947.m23910(new StringBuilder(), m45329(i3, "matchText"), " was not found in the current text. Re-read and retry with current text.");
                str3 = "FILE_TEXT_MATCH_NOT_FOUND";
                str4 = "match_not_found";
            } else if (i == 2) {
                strM23910 = C8947.m23910(new StringBuilder(), m45329(i3, "matchText"), " appears multiple times. Use longer surrounding context that appears once.");
                str3 = "FILE_TEXT_MATCH_AMBIGUOUS";
                str4 = "match_ambiguous";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(e2);
                }
                strM23910 = C0703.m3016("edits[", i3, "] overlaps edits[", "]; matched ranges cannot overlap.", i2);
                str3 = "FILE_TEXT_MATCH_OVERLAP";
                str4 = "match_overlap";
            }
            throw C10186.m26302(str3, strM23910, "warning", JSON.array().add(m45328("retry", "Re-read the current file from the beginning; continue pagination if needed.", strMo4295, str6, str5)), m45326(strMo4295, str4).add("failedEditIndex", i3).add("conflictingEditIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m45334(C12512 c12512, int i) throws C10186, IOException {
        long j = c12512.f40174;
        AbstractC22044 abstractC22044 = c12512.f40175;
        long j2 = i;
        if (j > j2) {
            throw m45331("FILE_TEXT_TARGET_TOO_LARGE", C14442.m34864(i, "The existing file exceeds the ", "-byte text edit limit."), abstractC22044.mo4294(), "target_too_large", j2, c12512.f40174, "", c12512.f40176);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(j >= 0 ? (int) j : Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        InputStream inputStreamM31067 = c12512.m31067();
        do {
            try {
                int i2 = inputStreamM31067.read(bArr, 0, Math.min(8192, (i + 1) - byteArrayOutputStream.size()));
                if (i2 >= 0) {
                    if (i2 == 0) {
                        int i3 = inputStreamM31067.read();
                        if (i3 >= 0) {
                            byteArrayOutputStream.write(i3);
                        }
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                inputStreamM31067.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                if (inputStreamM31067 != null) {
                    try {
                        inputStreamM31067.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } while (byteArrayOutputStream.size() <= i);
        throw m45331("FILE_TEXT_TARGET_TOO_LARGE", "The existing file exceeds the " + i + "-byte text edit limit.", abstractC22044.mo4294(), "target_too_large", j2, byteArrayOutputStream.size(), "", c12512.f40176);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
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
                        throw C10186.m26301(C25272.m56409("Missing parameter: ", str6), str6, (JSONValue) null, JSON.array(), m45336());
                    }
                }
                String strM45330 = m45330(jSONObject, MotionUtils.EASING_TYPE_PATH, m45336(), MotionUtils.EASING_TYPE_PATH);
                String strM45331 = m45330(jSONObject, "targetVersion", m45336(), "targetVersion");
                String strM45332 = m45330(jSONObject, "encoding", m45336(), "encoding");
                JSONObject jSONObjectM45336 = m45336();
                JSONValue jSONValue = jSONObject.get("edits");
                if (jSONValue == null || !jSONValue.isArray()) {
                    throw C10186.m26301("Invalid array argument", "edits", jSONValue, JSON.array(), jSONObjectM45336);
                }
                JSONArray jSONArrayAsArray = jSONValue.asArray();
                JSONObject jSONObjectM45327 = m45327(strM45330, strM45331, strM45332);
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C10186.m26301("edits must contain 1..200 items", "edits", jSONArrayAsArray, JSON.array("1..200"), jSONObjectM45327);
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                long jCodePointCount = 0;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    String str7 = str5;
                    String str8 = strM45330;
                    String str9 = str4;
                    final String str10 = strM45332;
                    if (i3 >= jSONArrayAsArray.size()) {
                        String str11 = strM45331;
                        final ArrayList arrayList2 = arrayList;
                        int i5 = i4;
                        if (arrayList2.size() > 1 && i5 >= 0) {
                            throw C10186.m26301("write_target must be the only edit", m45329(i5, "mode"), JSON.value("write_target"), JSON.array("replace_match", "insert_before_match", "insert_after_match"), jSONObjectM45327);
                        }
                        if ("missing".equals(str11)) {
                            if (str10.isEmpty()) {
                                throw C10186.m26301("Creating a text file requires a non-empty encoding token", str9, JSON.value(str10), JSON.array(), m45336());
                            }
                            if (arrayList2.size() != 1 || !"write_target".equals(((C9528) arrayList2.get(0)).f30864)) {
                                throw C10186.m26301("targetVersion=missing requires one write_target edit", str3, jSONObject.get(str3), JSON.array("one write_target"), m45336());
                            }
                        }
                        if (!str10.isEmpty()) {
                            C22430.m50582(str10);
                        }
                        final String[] strArr2 = {str10};
                        final C21551[] c21551Arr = new C21551[1];
                        C20717 c20717M2662 = this.f63342.m2662(str8, str11, new InterfaceC13258() { // from class: l.ۤ۟ۚ
                            @Override // l.InterfaceC13258
                            /* JADX INFO: renamed from: ۙ */
                            public final /* synthetic */ void mo968() {
                            }

                            @Override // l.InterfaceC13258
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo969(C12512 c12512, BufferedOutputStream bufferedOutputStream) throws C10186, IOException {
                                C19665.m45333(str10, strArr2, arrayList2, c21551Arr, c12512, bufferedOutputStream);
                            }
                        });
                        String str12 = c20717M2662.f66394;
                        String str13 = c20717M2662.f66393;
                        C0668.m2893(c21551Arr[0]);
                        return new C1238(C15300.m36728(JSON.object().add(str7, str13).add(str9, strArr2[0]).add("size", c20717M2662.f66391).add("targetVersion", str12).add("changed", c20717M2662.f66390).add("warnings", c20717M2662.f66392), JSON.array().add(m45328("inspect", "Verify text from the published file version.", str13, strArr2[0], str12))));
                    }
                    JSONValue jSONValue2 = jSONArrayAsArray.get(i3);
                    if (jSONValue2 == null || !jSONValue2.isObject()) {
                        throw C10186.m26301("Invalid edits item", C14442.m34864(i3, "edits[", "]"), jSONValue2, JSON.array(), jSONObjectM45327);
                    }
                    JSONObject jSONObjectAsObject = jSONValue2.asObject();
                    JSONArray jSONArray = jSONArrayAsArray;
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        str = strM45331;
                        i = i4;
                        if (it2.hasNext()) {
                            String str14 = str3;
                            String str15 = (String) it2.next();
                            if ((!"mode".equals(str15) && !"matchText".equals(str15) && !"writeText".equals(str15)) || !hashSet2.add(str15)) {
                                throw C10186.m26301("Unknown edit item argument", m45329(i3, str15), jSONObjectAsObject.get(str15), JSON.array(), jSONObjectM45327);
                            }
                            strM45331 = str;
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
                            throw C10186.m26301("Missing parameter: " + m45329(i3, str17), m45329(i3, str17), (JSONValue) null, JSON.array(), jSONObjectM45327);
                        }
                    }
                    String strM45333 = m45330(jSONObjectAsObject, "mode", jSONObjectM45327, m45329(i3, "mode"));
                    String strM45334 = m45330(jSONObjectAsObject, "matchText", jSONObjectM45327, m45329(i3, "matchText"));
                    String strM45335 = m45330(jSONObjectAsObject, "writeText", jSONObjectM45327, m45329(i3, "writeText"));
                    if ("write_target".equals(strM45333)) {
                        if (!strM45334.isEmpty()) {
                            throw C10186.m26301("write_target requires empty matchText", m45329(i3, "matchText"), JSON.value(strM45334), JSON.array(""), jSONObjectM45327);
                        }
                    } else if (!"replace_match".equals(strM45333)) {
                        if (!"insert_before_match".equals(strM45333) && !"insert_after_match".equals(strM45333)) {
                            throw C10186.m26301("Invalid text edit mode", m45329(i3, "mode"), JSON.value(strM45333), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), jSONObjectM45327);
                        }
                        if (strM45334.isEmpty()) {
                            throw C10186.m26301(C14483.m34972(strM45333, " requires non-empty matchText"), m45329(i3, "matchText"), JSON.value(strM45334), JSON.array(), jSONObjectM45327);
                        }
                        if (strM45335.isEmpty()) {
                            throw C10186.m26301(C14483.m34972(strM45333, " requires non-empty writeText"), m45329(i3, "writeText"), JSON.value(strM45335), JSON.array(), jSONObjectM45327);
                        }
                    } else if (strM45334.isEmpty()) {
                        throw C10186.m26301("replace_match requires non-empty matchText", m45329(i3, "matchText"), JSON.value(strM45334), JSON.array(), jSONObjectM45327);
                    }
                    i4 = "write_target".equals(strM45333) ? i3 : i;
                    jCodePointCount = j + ((long) strM45334.codePointCount(0, strM45334.length())) + ((long) strM45335.codePointCount(0, strM45335.length()));
                    if (jCodePointCount > 524288) {
                        throw C10186.m26301("All matchText and writeText values may contain at most 524288 Unicode code points in total", str16, JSON.value(jCodePointCount), JSON.array("0..524288"), jSONObjectM45327);
                    }
                    arrayList3.add(new C9528(strM45333, strM45334, strM45335));
                    i3++;
                    arrayList = arrayList3;
                    str5 = str7;
                    strM45330 = str8;
                    str4 = str9;
                    strM45332 = str10;
                    jSONArrayAsArray = jSONArray;
                    strM45331 = str;
                    str3 = str16;
                }
            }
        } while (hashSet.add(str2));
        throw C10186.m26301("Unknown file text edit argument", str2, jSONObject.get(str2), JSON.array(), m45336());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45330(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) throws C10186 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C10186.m26301("Invalid string argument", str2, jSONValue, JSON.array(), jSONObject2);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m45332(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONArray jSONArrayArray = "missing".equals(str4) ? JSON.array() : JSON.array().add(m45328("retry", "Re-read the current file from the beginning; continue pagination if needed.", str3, str6, str4));
        JSONObject jSONObjectM45326 = m45326(str3, str5);
        JSONValue jSONValue = JSON.NULL;
        return C10186.m26302(str, str2, "warning", jSONArrayArray, jSONObjectM45326.add("limit", jSONValue).add("actual", jSONValue));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m45331(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        JSONObject jSONObjectAdd = m45326(str3, str4).add("limit", j).add("actual", j2 < 0 ? JSON.NULL : JSON.value(j2));
        JSONArray jSONArrayArray = (str6 == null || str6.isEmpty() || "missing".equals(str6)) ? JSON.array() : JSON.array().add(m45328("inspect", "Read the file in pages.", str3, str5, str6));
        if ("FILE_TEXT_RESULT_TOO_LARGE".equals(str)) {
            return C10186.m26302(str, str2, "warning", jSONArrayArray, jSONObjectAdd);
        }
        return C10186.m26306(str, str2, "fatal", jSONArrayArray, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m45326(String str, String str2) {
        return C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "operation", "edit_text").add("backendReason", str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m45328(String str, String str2, String str3, String str4, String str5) {
        return C2729.m9064(C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static JSONObject m45335() {
        JSONObject jSONObjectM51386 = C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute path.")).add("encoding", C10932.m27740("string", "Exact token for verification or empty string to auto-detect.")).add("targetVersion", C10932.m27740("string", "Exact current version bound to this read.")).add("limit", C10932.m27740("integer", "Logical line limit.")).add("maxChars", C10932.m27740("integer", "Unicode code-point limit.")).add("startLine", C10932.m27740("integer", "Zero-based line.")), "integer", "Zero-based column.", "startColumn", "Arguments for mt_file_read_text.");
        return C10932.m27737("Contains a text verification read after success, a current-file retry read after a recoverable match error, or a raw-byte inspection after decode failure.", C10932.m27732(jSONObjectM51386, "mt_file_read_text", "inspect"), C10932.m27732(jSONObjectM51386, "mt_file_read_text", "retry"), C10932.m27732(C22783.m51386(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C10932.m27740("string", "Normalized absolute path.")).add("targetVersion", C10932.m27740("string", "Exact current version bound to this read.")).add("byteOffset", C10932.m27740("integer", "Zero-based byte offset.")), "integer", "Maximum raw bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45329(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("edits[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static JSONObject m45336() {
        return m45327("file.txt", "<copy from mt_file_read_text>", "utf-8");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m45327(String str, String str2, String str3) {
        return C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "targetVersion", str2).add("encoding", str3).add("edits", JSON.array().add(C22121.m50076("mode", "replace_match", "matchText", "old text").add("writeText", "new text")));
    }
}
