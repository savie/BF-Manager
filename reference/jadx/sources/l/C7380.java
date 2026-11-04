package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7380 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8871 m20272(AbstractC22044 abstractC22044, String str, long j, long j2, int i, int i2) throws IOException {
        InputStream inputStreamMo4290 = abstractC22044.mo4290();
        try {
            C8871 c8871M20271 = m20271(inputStreamMo4290, str, j, j2, i, i2, C15022.m36183());
            if (inputStreamMo4290 != null) {
                inputStreamMo4290.close();
            }
            return c8871M20271;
        } catch (Throwable th) {
            if (inputStreamMo4290 == null) {
                throw th;
            }
            try {
                inputStreamMo4290.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9616 m20273(InputStream inputStream, String str, long j, long j2, int i, int i2) throws IOException {
        try {
            byte[] bArrCopyOf = new byte[32768];
            int iM20270 = m20270(inputStream, bArrCopyOf);
            if (iM20270 != 32768) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM20270);
            }
            C10495 c10495M50579 = C22430.m50579(str, bArrCopyOf);
            int i3 = c10495M50579.f33394;
            SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(bArrCopyOf, i3, iM20270 - i3), inputStream);
            CharsetDecoder charsetDecoderNewDecoder = c10495M50579.f33393.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
            try {
                C2905 c2905 = new C2905(i, i2, j, j2);
                m20274(new C8126(inputStreamReader), c2905, false);
                C9616 c9616 = new C9616(C2905.m9537(c2905), c10495M50579.f33395);
                inputStreamReader.close();
                inputStream.close();
                return c9616;
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                inputStream.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8871 m20271(InputStream inputStream, String str, long j, long j2, int i, int i2, MessageDigest messageDigest) throws C10186, IOException {
        byte[] bArrCopyOf = new byte[32768];
        int iM20270 = m20270(inputStream, bArrCopyOf);
        messageDigest.update(bArrCopyOf, 0, iM20270);
        if (iM20270 != 32768) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM20270);
        }
        C10495 c10495M50579 = C22430.m50579(str, bArrCopyOf);
        int i3 = c10495M50579.f33394;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrCopyOf, i3, iM20270 - i3);
        C19313 c19313 = new C19313(inputStream);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, new DigestInputStream(c19313, messageDigest));
        CharsetDecoder charsetDecoderNewDecoder = c10495M50579.f33393.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C2905 c2905 = new C2905(i, i2, j, j2);
            m20274(new C8126(inputStreamReader), c2905, true);
            C1414 c1414M9537 = C2905.m9537(c2905);
            C8871 c8871 = new C8871(c1414M9537.f4987, c10495M50579.f33395, j, j2, c1414M9537.f4993, c1414M9537.f4995, c1414M9537.f4989, c1414M9537.f4991, c1414M9537.f4990, C15022.m36182(messageDigest.digest()).substring(0, 16), ((long) iM20270) + c19313.f62404, c1414M9537.f4992, c1414M9537.f4994, c1414M9537.f4988);
            inputStreamReader.close();
            return c8871;
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20274(C8126 c8126, C2905 c2905, boolean z) throws IOException {
        int iM22009 = -1;
        do {
            if (iM22009 < 0) {
                iM22009 = C8126.m22009(c8126);
            }
            if (iM22009 < 0) {
                return;
            }
            if (iM22009 == 13) {
                iM22009 = C8126.m22009(c8126);
                if (iM22009 == 10) {
                    C2905.m9539(c2905, "\r\n");
                } else {
                    C2905.m9539(c2905, "\r");
                }
            } else if (iM22009 == 10) {
                C2905.m9539(c2905, "\n");
            } else {
                C2905.m9538(c2905, iM22009);
            }
            iM22009 = -1;
        } while (!C2905.m9542(c2905));
        if (z) {
            C8126.m22008(c8126);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20270(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = 0;
        while (i2 < bArr.length && (i = inputStream.read(bArr, i2, bArr.length - i2)) >= 0) {
            if (i == 0) {
                int i3 = inputStream.read();
                if (i3 < 0) {
                    break;
                }
                bArr[i2] = (byte) i3;
                i2++;
            } else {
                i2 += i;
            }
        }
        return i2;
    }
}
