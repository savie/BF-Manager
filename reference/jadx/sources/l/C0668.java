package l;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6Y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0668 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14837 m2891(String str, byte[] bArr) throws C10186, C4397 {
        C10495 c10495M50582;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.min(bArr.length, 32768));
        if (str.isEmpty()) {
            c10495M50582 = C22430.m50579("", bArrCopyOf);
        } else {
            c10495M50582 = C22430.m50582(str);
            if (!c10495M50582.m26954(bArrCopyOf)) {
                throw new C4397("Encoding token BOM does not match the current file");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c10495M50582.f33393.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        int i = c10495M50582.f33394;
        return new C14837(charsetDecoderOnUnmappableCharacter.decode(ByteBuffer.wrap(bArr, i, bArr.length - i)).toString(), c10495M50582.f33395);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21551 m2892(int i, String str, String str2) throws CharacterCodingException, C18567, C10186 {
        C10495 c10495M50582 = C22430.m50582(str2);
        Charset charset = c10495M50582.f33393;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
        byte[] bArrM26955 = c10495M50582.m26955();
        long length = ((long) bArrM26955.length) + ((long) byteBufferEncode.remaining());
        if (length > i) {
            throw new C18567(length);
        }
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        System.arraycopy(bArrM26955, 0, bArr, 0, bArrM26955.length);
        byteBufferEncode.get(bArr, bArrM26955.length, i2 - bArrM26955.length);
        return new C21551(bArr, charset.name());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2893(C21551 c21551) {
        C5002.m15229(c21551.f68833, Math.min(c21551.f68832.length, 32768), c21551.f68832);
    }
}
