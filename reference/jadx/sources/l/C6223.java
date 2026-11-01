package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.ۛᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6223 extends AbstractC16964 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17617 f21142;

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۖ */
    public final String mo1545() {
        return "mt_file_append_text";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ܰ */
    public final String mo1551() {
        return "Append literal text using the existing file's exact encoding from mt_file_read_text. Preserves every original byte and the physical BOM; never transcodes or inserts another BOM. No automatic newline or replacement-template expansion. A trailing CR followed by an appended LF forms CRLF. Validates the entire original text, including EOF: invalid text, incomplete characters, unencodable appended text or a change to the physical BOM rejects the operation before publication. Empty writeText is a no-op after validation. ISO-2022 encodings are not supported. Appended text is limited to 524288 Unicode code points and 524288 encoded bytes; the existing file has no text-size cap and the final file is limited to 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ᩹ */
    public final String mo1552() {
        return "Append File Text";
    }

    public C6223(C17617 c17617) {
        this.f21142 = c17617;
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1546() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۨ */
    public final JSONObject mo1550() {
        return C18828.m43457(C23884.m52643().add("encoding", C4969.m13786("string", "Copy the non-empty encoding returned by mt_file_read_text, including any BOM suffix. ISO-2022 is unsupported.")), "string", "Literal text to append; at most 524288 Unicode code points and encoded bytes. Include any desired newline explicitly. Empty is a no-op.", "writeText", "Arguments for mt_file_append_text.");
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۚ */
    public final JSONObject mo1549() {
        return C23884.m52644("mt_file_append_text", true);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1547(C12731 c12731) {
        return C12123.m30165("mt_file_append_text", c12731);
    }

    @Override // l.AbstractC16964
    /* JADX INFO: renamed from: ۙ */
    public final C17669 mo1548(JSONObject jSONObject) throws C12731 {
        C23863.m52589(jSONObject, new C11184(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "writeText");
        String strM52646 = C23884.m52646(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM52645 = C23884.m52645(jSONObject);
        String strM52647 = C23884.m52646(jSONObject, "encoding");
        C5518 c5518M49943 = C22452.m49943(strM52647);
        String strM37993 = C16020.m37993(strM52647);
        String strM52648 = C23884.m52646(jSONObject, "writeText");
        if (strM52648.codePointCount(0, strM52648.length()) > 524288) {
            throw C12731.m31626("writeText exceeds 524288 Unicode code points", "writeText", jSONObject.get("writeText"), JSON.array(), JSON.object());
        }
        int i = 0;
        while (i < strM52648.length()) {
            try {
                char cCharAt = strM52648.charAt(i);
                if (Character.isHighSurrogate(cCharAt)) {
                    i++;
                    if (i == strM52648.length() || !Character.isLowSurrogate(strM52648.charAt(i))) {
                        throw new CharacterCodingException();
                    }
                } else if (Character.isLowSurrogate(cCharAt)) {
                    throw new CharacterCodingException();
                }
                i++;
            } catch (CharacterCodingException unused) {
                throw C12731.m31627("FILE_TEXT_ENCODE_FAILED", "The appended text cannot be represented as valid text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
            } catch (C12492 e) {
                throw C23884.m52647("Appended text exceeds the 524288-byte limit.", 524288L, e.f41783);
            }
        }
        byte[] bArr = C17430.m40634(524288, strM52648, strM37993).f53559;
        C16020.m37995();
        C20958[] c20958Arr = {null};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7740 c7740M40988 = this.f21142.m40988(strM52646, strM52645, new C17512(bArr, byteArrayOutputStream, c20958Arr, c5518M49943));
        if (c7740M40988.f25576) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C11859.m29553(c5518M49943.f18938.name(), byteArray.length, byteArray);
        }
        return C23884.m52648(c7740M40988, strM52647, c20958Arr[0].m47131(), c20958Arr[0].m47130());
    }
}
