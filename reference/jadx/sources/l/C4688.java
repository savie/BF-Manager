package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E76K */
/* JADX INFO: loaded from: classes2.dex */
public final class C4688 {
    /* JADX WARN: Code duplicated, block: B:128:0x0311  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
    
        if ((r9 + r7) <= r11) goto L60;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C12182 m12994(l.C21956 r25, l.C14952 r26, l.C20212 r27, l.C2956 r28, l.C20596 r29) throws l.C12731 {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4688.m12994(l.᩹֨۬, l.ܶۗ֨, l.᩶ܰ۬, l.ۗۗ֨, l.᩷ۗ֨):l.۫ۙ۬");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m12995(C20596 c20596, long j, byte[] bArr, byte[] bArr2) {
        return C12731.m31627("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedText.", "warning", JSON.array(), JSON.object().add("workspaceId", c20596.f67107).add("editSessionId", c20596.f67098).add("locator", c20596.f67104).add("patchedFileOffset", C16363.m38542(j)).add("byteOffset", j).add("paddingMode", c20596.f67099).add("expectedText", c20596.f67097).add("actualText", m12992(c20596, bArr2)).add("expectedHex", C16363.m38545(bArr)).add("actualHex", C16363.m38545(bArr2)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12992(C20596 c20596, byte[] bArr) {
        String str = c20596.f67099;
        if ("null_pad".equals(str)) {
            int i = 0;
            while (i < bArr.length && bArr[i] != 0) {
                i++;
            }
            return m12993(bArr, i, false);
        }
        if ("space_pad".equals(str)) {
            int length = bArr.length;
            while (length > 0 && bArr[length - 1] == 32) {
                length--;
            }
            return m12993(bArr, length, false);
        }
        return m12993(bArr, bArr.length, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m12993(byte[] bArr, int i, boolean z) {
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
    public static void m12996(C20596 c20596, int i) throws C12731 {
        if (i > 4096) {
            throw C12731.m31627("NATIVE_STRING_TOO_LARGE", "Native string patch window is too large.", "warning", JSON.array(), m12991(c20596).add("expectedTextByteCount", c20596.f67106.length).add("replacementTextByteCount", c20596.f67102.length).add("bytesPatched", i).add("limitBytes", 4096));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m12991(C20596 c20596) {
        return JSON.object().add("workspaceId", c20596.f67107).add("editSessionId", c20596.f67098).add("locator", c20596.f67104).add("addressKind", c20596.f67103).add("address", c20596.f67105).add("paddingMode", c20596.f67099);
    }
}
