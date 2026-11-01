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

/* JADX INFO: renamed from: l.ۙ᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6XM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4917 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3318 m13678(AbstractC20745 abstractC20745, String str, long j, long j2, int i, int i2) throws IOException {
        InputStream inputStreamMo33970 = abstractC20745.mo33970();
        try {
            C3318 c3318M13677 = m13677(inputStreamMo33970, str, j, j2, i, i2, C22253.m49425());
            if (inputStreamMo33970 != null) {
                inputStreamMo33970.close();
            }
            return c3318M13677;
        } catch (Throwable th) {
            if (inputStreamMo33970 == null) {
                throw th;
            }
            try {
                inputStreamMo33970.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1907 m13676(InputStream inputStream, String str, long j, long j2, int i, int i2) throws IOException {
        try {
            byte[] bArrCopyOf = new byte[32768];
            int iM13675 = m13675(inputStream, bArrCopyOf);
            if (iM13675 != 32768) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM13675);
            }
            C5518 c5518M49942 = C22452.m49942(str, bArrCopyOf);
            int i3 = c5518M49942.f18939;
            SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(bArrCopyOf, i3, iM13675 - i3), inputStream);
            CharsetDecoder charsetDecoderNewDecoder = c5518M49942.f18938.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
            try {
                C9670 c9670 = new C9670(i, i2, j, j2);
                m13679(new C6141(inputStreamReader), c9670, false);
                C1907 c1907 = new C1907(C9670.m24574(c9670), c5518M49942.f18936);
                inputStreamReader.close();
                inputStream.close();
                return c1907;
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
    public static C3318 m13677(InputStream inputStream, String str, long j, long j2, int i, int i2, MessageDigest messageDigest) throws C12731, IOException {
        byte[] bArrCopyOf = new byte[32768];
        int iM13675 = m13675(inputStream, bArrCopyOf);
        messageDigest.update(bArrCopyOf, 0, iM13675);
        if (iM13675 != 32768) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, iM13675);
        }
        C5518 c5518M49942 = C22452.m49942(str, bArrCopyOf);
        int i3 = c5518M49942.f18939;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrCopyOf, i3, iM13675 - i3);
        C11081 c11081 = new C11081(inputStream);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, new DigestInputStream(c11081, messageDigest));
        CharsetDecoder charsetDecoderNewDecoder = c5518M49942.f18938.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C9670 c9670 = new C9670(i, i2, j, j2);
            m13679(new C6141(inputStreamReader), c9670, true);
            C14609 c14609M24574 = C9670.m24574(c9670);
            C3318 c3318 = new C3318(c14609M24574.f47807, c5518M49942.f18936, j, j2, c14609M24574.f47809, c14609M24574.f47806, c14609M24574.f47811, c14609M24574.f47805, c14609M24574.f47810, C22253.m49424(messageDigest.digest()).substring(0, 16), ((long) iM13675) + c11081.f37611, c14609M24574.f47813, c14609M24574.f47812, c14609M24574.f47808);
            inputStreamReader.close();
            return c3318;
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
    public static void m13679(C6141 c6141, C9670 c9670, boolean z) throws IOException {
        int iM17123 = -1;
        do {
            if (iM17123 < 0) {
                iM17123 = C6141.m17123(c6141);
            }
            if (iM17123 < 0) {
                return;
            }
            if (iM17123 == 13) {
                iM17123 = C6141.m17123(c6141);
                if (iM17123 == 10) {
                    C9670.m24576(c9670, "\r\n");
                } else {
                    C9670.m24576(c9670, "\r");
                }
            } else if (iM17123 == 10) {
                C9670.m24576(c9670, "\n");
            } else {
                C9670.m24575(c9670, iM17123);
            }
            iM17123 = -1;
        } while (!C9670.m24579(c9670));
        if (z) {
            C6141.m17122(c6141);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m13675(InputStream inputStream, byte[] bArr) throws IOException {
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
