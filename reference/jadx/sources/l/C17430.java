package l;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T6Y0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17430 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0496 m40633(String str, byte[] bArr) throws C20253, C12731 {
        C5518 c5518M49943;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.min(bArr.length, 32768));
        if (str.isEmpty()) {
            c5518M49943 = C22452.m49942("", bArrCopyOf);
        } else {
            c5518M49943 = C22452.m49943(str);
            if (!c5518M49943.m15221(bArrCopyOf)) {
                throw new C20253("Encoding token BOM does not match the current file");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c5518M49943.f18938.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        int i = c5518M49943.f18939;
        return new C0496(charsetDecoderOnUnmappableCharacter.decode(ByteBuffer.wrap(bArr, i, bArr.length - i)).toString(), c5518M49943.f18936);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16725 m40634(int i, String str, String str2) throws C12731, CharacterCodingException, C12492 {
        C5518 c5518M49943 = C22452.m49943(str2);
        Charset charset = c5518M49943.f18938;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
        byte[] bArrM15222 = c5518M49943.m15222();
        long length = ((long) bArrM15222.length) + ((long) byteBufferEncode.remaining());
        if (length > i) {
            throw new C12492(length);
        }
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        System.arraycopy(bArrM15222, 0, bArr, 0, bArrM15222.length);
        byteBufferEncode.get(bArr, bArrM15222.length, i2 - bArrM15222.length);
        return new C16725(bArr, charset.name());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40635(C16725 c16725) {
        C11859.m29553(c16725.f53560, Math.min(c16725.f53559.length, 32768), c16725.f53559);
    }
}
