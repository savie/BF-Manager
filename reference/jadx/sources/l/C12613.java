package l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۨ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes4.dex */
public final class C12613 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20818 m31330(C15508 c15508, int i, int i2, Charset charset, int i3, Runnable runnable, C6648 c6648, OutputStreamWriter outputStreamWriter, boolean z) throws IOException {
        int i4;
        int i5 = i;
        long j = i2 - i5;
        C3664 c3664 = z ? new C3664() : null;
        OutputStreamWriter outputStreamWriter2 = c3664 != null ? new OutputStreamWriter(c3664, charset) : null;
        int i6 = 32768;
        try {
            char[] cArr = new char[32768];
            int i7 = i5;
            while (i7 < i2) {
                runnable.run();
                int iMin = Math.min(i2, Math.min(i6, i2 - i7) + i7);
                int i8 = i7;
                while (i8 < iMin) {
                    long j2 = j;
                    char cCharAt = c15508.charAt(i8);
                    cArr[i8 - i7] = cCharAt;
                    if (c6648 != null) {
                        c6648.m18588(cCharAt);
                    }
                    i8++;
                    j = j2;
                }
                long j3 = j;
                if (outputStreamWriter2 != null) {
                    i4 = 0;
                    outputStreamWriter2.write(cArr, 0, iMin - i7);
                } else {
                    i4 = 0;
                }
                if (outputStreamWriter != null) {
                    outputStreamWriter.write(cArr, i4, iMin - i7);
                }
                i7 = iMin;
                j = j3;
                i6 = 32768;
            }
            long j4 = j;
            if (outputStreamWriter2 != null) {
                outputStreamWriter2.close();
            }
            long j5 = 0;
            long j6 = c3664 == null ? 0L : c3664.f12539;
            C4245 c4245Matcher = C18415.m42925("\\b[\\p{L}\\d]+\\b").matcher((CharSequence) c15508);
            c4245Matcher.m13565(false);
            c4245Matcher.m13553(runnable);
            c4245Matcher.m13567region(i5, i2);
            long j7 = 0;
            while (c4245Matcher.find()) {
                j7++;
            }
            C4245 c4245Matcher2 = C18415.m42925("[\\u4e00-\\u9fa5]").matcher((CharSequence) c15508);
            c4245Matcher2.m13565(false);
            c4245Matcher2.m13553(runnable);
            c4245Matcher2.m13567region(i5, i2);
            while (c4245Matcher2.find()) {
                j5++;
            }
            int length = i3 - "\n".getBytes(charset).length;
            long j8 = j6;
            long j9 = 1;
            while (i5 < i2) {
                if (c15508.charAt(i5) == '\n') {
                    j9++;
                    if (z) {
                        j8 += (long) length;
                    }
                }
                i5++;
            }
            return new C20818(j8, j4, j7, j5, j9, 0);
        } catch (Throwable th) {
            if (outputStreamWriter2 == null) {
                throw th;
            }
            try {
                outputStreamWriter2.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
