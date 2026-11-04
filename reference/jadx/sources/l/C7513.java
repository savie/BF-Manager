package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.۟֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7513 extends AbstractC19137 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0580 f24828;

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1805() {
        return C24579.m54898("readOnlyHint", "destructiveHint", false, true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ܳ */
    public final String mo1809() {
        return "Append File Text";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩷ */
    public final String mo1811() {
        return "Append literal text using the existing file's exact encoding from mt_file_read_text. Preserves every original byte and the physical BOM; never transcodes or inserts another BOM. No automatic newline or replacement-template expansion. A trailing CR followed by an appended LF forms CRLF. Validates the entire original text, including EOF: invalid text, incomplete characters, unencodable appended text or a change to the physical BOM rejects the operation before publication. Empty writeText is a no-op after validation. ISO-2022 encodings are not supported. Appended text is limited to 524288 Unicode code points and 524288 encoded bytes; the existing file has no text-size cap and the final file is limited to 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. A failed write may have changed the file; inspect changed and stateKnown before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩸ */
    public final String mo1812() {
        return "mt_file_append_text";
    }

    public C7513(C0580 c0580) {
        this.f24828 = c0580;
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۤ */
    public final JSONObject mo1808() {
        return C22783.m51386(C9968.m25808().add("encoding", C10932.m27740("string", "Copy the non-empty encoding returned by mt_file_read_text, including any BOM suffix. ISO-2022 is unsupported.")), "string", "Literal text to append; at most 524288 Unicode code points and encoded bytes. Include any desired newline explicitly. Empty is a no-op.", "writeText", "Arguments for mt_file_append_text.");
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ᩴ */
    public final JSONObject mo1810() {
        return C9968.m25809("mt_file_append_text", true);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final JSONObject mo1806(C10186 c10186) {
        return C5596.m16567("mt_file_append_text", c10186);
    }

    @Override // l.AbstractC19137
    /* JADX INFO: renamed from: ۙ */
    public final C1238 mo1807(JSONObject jSONObject) throws C10186 {
        C9749.m25412(jSONObject, new C18919(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "writeText");
        String strM25811 = C9968.m25811(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM25810 = C9968.m25810(jSONObject);
        String strM25812 = C9968.m25811(jSONObject, "encoding");
        C10495 c10495M50582 = C22430.m50582(strM25812);
        String strM54815 = C24535.m54815(strM25812);
        String strM25813 = C9968.m25811(jSONObject, "writeText");
        if (strM25813.codePointCount(0, strM25813.length()) > 524288) {
            throw C10186.m26301("writeText exceeds 524288 Unicode code points", "writeText", jSONObject.get("writeText"), JSON.array(), JSON.object());
        }
        int i = 0;
        while (i < strM25813.length()) {
            try {
                char cCharAt = strM25813.charAt(i);
                if (Character.isHighSurrogate(cCharAt)) {
                    i++;
                    if (i == strM25813.length() || !Character.isLowSurrogate(strM25813.charAt(i))) {
                        throw new CharacterCodingException();
                    }
                } else if (Character.isLowSurrogate(cCharAt)) {
                    throw new CharacterCodingException();
                }
                i++;
            } catch (CharacterCodingException unused) {
                throw C10186.m26302("FILE_TEXT_ENCODE_FAILED", "The appended text cannot be represented as valid text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
            } catch (C18567 e) {
                throw C9968.m25813("Appended text exceeds the 524288-byte limit.", 524288L, e.f60333);
            }
        }
        byte[] bArr = C0668.m2892(524288, strM25813, strM54815).f68832;
        C24535.m54817();
        C6635[] c6635Arr = {null};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C20717 c20717M2662 = this.f24828.m2662(strM25811, strM25810, new C0055(bArr, byteArrayOutputStream, c6635Arr, c10495M50582));
        if (c20717M2662.f66390) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C5002.m15229(c10495M50582.f33393.name(), byteArray.length, byteArray);
        }
        return C9968.m25812(c20717M2662, strM25812, c6635Arr[0].m18575(), c6635Arr[0].m18574());
    }
}
