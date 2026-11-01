package l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۛ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8O6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6371 extends AbstractC21188 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f21439 = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f21441 = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f21440 = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // l.AbstractC21188
    /* JADX INFO: renamed from: ۙ */
    public final C0987 mo15037(C7783 c7783, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f21440;
        CharsetDecoder charsetDecoder2 = this.f21441;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C0987(new C24011(null, bArr, null));
        }
        Matcher matcher = f21439.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM46672 = C20733.m46672(strGroup);
                strM46672.getClass();
                if (strM46672.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM46672.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C0987(new C24011(str, bArr, str2));
    }
}
