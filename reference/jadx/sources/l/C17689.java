package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܽܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E76K */
/* JADX INFO: loaded from: classes4.dex */
public final class C17689 {
    /* JADX WARN: Code duplicated, block: B:128:0x0311  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
    
        if ((r9 + r7) <= r11) goto L60;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C22911 m41398(l.C14069 r25, l.C18282 r26, l.C5033 r27, l.C17185 r28, l.C7095 r29) throws l.C10186 {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17689.m41398(l.۬᩵ۚ, l.ܿۧۚ, l.ۙܽۚ, l.ܺ᩻ۚ, l.ۜۧۚ):l.᩸ܺۚ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m41397(C7095 c7095, long j, byte[] bArr, byte[] bArr2) {
        return C10186.m26302("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedText.", "warning", JSON.array(), JSON.object().add("workspaceId", c7095.f23413).add("editSessionId", c7095.f23412).add("locator", c7095.f23405).add("patchedFileOffset", C11218.m28261(j)).add("byteOffset", j).add("paddingMode", c7095.f23403).add("expectedText", c7095.f23408).add("actualText", m41395(c7095, bArr2)).add("expectedHex", C11218.m28264(bArr)).add("actualHex", C11218.m28264(bArr2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41395(C7095 c7095, byte[] bArr) {
        String str = c7095.f23403;
        if ("null_pad".equals(str)) {
            int i = 0;
            while (i < bArr.length && bArr[i] != 0) {
                i++;
            }
            return m41396(bArr, i, false);
        }
        if ("space_pad".equals(str)) {
            int length = bArr.length;
            while (length > 0 && bArr[length - 1] == 32) {
                length--;
            }
            return m41396(bArr, length, false);
        }
        return m41396(bArr, bArr.length, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m41396(byte[] bArr, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            if (z && bArr[i2] == 0) {
                return "";
            }
        }
        try {
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i)).toString();
        } catch (CharacterCodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41399(C7095 c7095, int i) throws C10186 {
        if (i > 4096) {
            throw C10186.m26302("NATIVE_STRING_TOO_LARGE", "Native string patch window is too large.", "warning", JSON.array(), m41394(c7095).add("expectedTextByteCount", c7095.f23409.length).add("replacementTextByteCount", c7095.f23407.length).add("bytesPatched", i).add("limitBytes", 4096));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m41394(C7095 c7095) {
        return JSON.object().add("workspaceId", c7095.f23413).add("editSessionId", c7095.f23412).add("locator", c7095.f23405).add("addressKind", c7095.f23406).add("address", c7095.f23411).add("paddingMode", c7095.f23403);
    }
}
