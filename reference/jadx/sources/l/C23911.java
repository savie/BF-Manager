package l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩹᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X8O6 */
/* JADX INFO: loaded from: classes.dex */
public final class C23911 extends AbstractC13468 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77420 = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f77422 = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f77421 = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // l.AbstractC13468
    /* JADX INFO: renamed from: ۙ */
    public final C19378 mo7730(C15705 c15705, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f77421;
        CharsetDecoder charsetDecoder2 = this.f77422;
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
            return new C19378(new C20927(null, bArr, null));
        }
        Matcher matcher = f77420.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM21453 = C7914.m21453(strGroup);
                strM21453.getClass();
                if (strM21453.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM21453.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C19378(new C20927(str, bArr, str2));
    }
}
