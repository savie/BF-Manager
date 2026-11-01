package l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܶܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes4.dex */
public final class C15325 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23086 m36685(C3329 c3329, int i, int i2, Charset charset, int i3, Runnable runnable, C21674 c21674, OutputStreamWriter outputStreamWriter, boolean z) throws IOException {
        int i4 = i;
        long j = i2 - i4;
        C6857 c6857 = z ? new C6857() : null;
        OutputStreamWriter outputStreamWriter2 = c6857 != null ? new OutputStreamWriter(c6857, charset) : null;
        int i5 = 32768;
        try {
            char[] cArr = new char[32768];
            int i6 = i4;
            while (i6 < i2) {
                runnable.run();
                int iMin = Math.min(i2, Math.min(i5, i2 - i6) + i6);
                int i7 = i6;
                while (i7 < iMin) {
                    long j2 = j;
                    char cCharAt = c3329.charAt(i7);
                    cArr[i7 - i6] = cCharAt;
                    if (c21674 != null) {
                        c21674.m48407(cCharAt);
                    }
                    i7++;
                    j = j2;
                }
                long j3 = j;
                if (outputStreamWriter2 != null) {
                    outputStreamWriter2.write(cArr, 0, iMin - i6);
                }
                if (outputStreamWriter != null) {
                    outputStreamWriter.write(cArr, 0, iMin - i6);
                }
                i6 = iMin;
                j = j3;
                i5 = 32768;
            }
            long j4 = j;
            if (outputStreamWriter2 != null) {
                outputStreamWriter2.close();
            }
            long j5 = 0;
            long j6 = c6857 == null ? 0L : c6857.f23132;
            C6222 c6222Matcher = C14690.m35219("\\b[\\p{L}\\d]+\\b").matcher((CharSequence) c3329);
            c6222Matcher.m17274();
            c6222Matcher.m17263(runnable);
            c6222Matcher.m17275region(i4, i2);
            long j7 = 0;
            while (c6222Matcher.find()) {
                j7++;
            }
            C6222 c6222Matcher2 = C14690.m35219("[\\u4e00-\\u9fa5]").matcher((CharSequence) c3329);
            c6222Matcher2.m17274();
            c6222Matcher2.m17263(runnable);
            c6222Matcher2.m17275region(i4, i2);
            while (c6222Matcher2.find()) {
                j5++;
            }
            int length = i3 - "\n".getBytes(charset).length;
            long j8 = j6;
            long j9 = 1;
            while (i4 < i2) {
                if (c3329.charAt(i4) == '\n') {
                    j9++;
                    if (z) {
                        j8 += (long) length;
                    }
                }
                i4++;
            }
            return new C23086(j8, j4, j7, j5, j9, 0);
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
