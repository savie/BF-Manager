package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֫ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1867 implements InterfaceC5203 {
    @Override // l.InterfaceC5203
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo6415(CharSequence charSequence, C13406 c13406, C11228 c11228) throws IOException {
        String string = charSequence.toString();
        C7118 c7118 = new C7118();
        c7118.f23464 = true;
        c7118.f23465 = 28;
        C7447 c7447M44161 = C19051.m44161(string, c7118.m19516(), c7118);
        C5564 c5564 = new C5564();
        c5564.f19332 = 28;
        C18459 c18459 = new C18459();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(string));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            String strTrim = line.trim();
            if (!strTrim.startsWith("#")) {
                break;
            }
            c18459.m43010(strTrim);
            c18459.append('\n');
        }
        C13021.m32450(new C0560(c18459), c7447M44161, c5564);
        c11228.append((CharSequence) c18459.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m6413(InputStream inputStream) {
        if (inputStream == null) {
            C21587.m49116("MD5Utils", "md5 stream is null");
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStream.read(bArr, 0, 8192);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    return C20512.m47032(messageDigest.digest());
                }
            }
        } catch (Throwable th) {
            C21587.m49112("MD5Utils", "md5 exception", th);
            C21587.m49116("MD5Utils", "md5 return null");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6414(CharSequence charSequence, char[] cArr, int i, int i2) {
        if (charSequence instanceof C3901) {
            ((C3901) charSequence).m12542(cArr, i, i2 + i);
            return;
        }
        int i3 = 0;
        if (i2 >= 10) {
            if (charSequence instanceof String) {
                ((String) charSequence).getChars(i, i2 + i, cArr, 0);
                return;
            }
            if (charSequence instanceof CharBuffer) {
                CharBuffer charBuffer = (CharBuffer) charSequence;
                int iPosition = charBuffer.position();
                charBuffer.position(i + iPosition);
                charBuffer.get(cArr, 0, i2);
                charBuffer.position(iPosition);
                return;
            }
            if (charSequence instanceof InterfaceC24039) {
                ((InterfaceC24039) charSequence.subSequence(i, i2 + i)).m53593();
                return;
            } else if (charSequence instanceof StringBuffer) {
                ((StringBuffer) charSequence).getChars(i, i2 + i, cArr, 0);
                return;
            } else if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).getChars(i, i2 + i, cArr, 0);
                return;
            }
        }
        int i4 = i2 + i;
        while (i < i4 && i3 < cArr.length) {
            cArr[i3] = charSequence.charAt(i);
            i3++;
            i++;
        }
    }
}
