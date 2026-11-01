package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.֫ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes2.dex */
public final class C1979 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C13312 f7420;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9742 f7421;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f7422;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f7423;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7424;

    public C1979(C9742 c9742, int i, CharSequence charSequence, C13312 c13312) {
        this.f7421 = c9742;
        this.f7422 = i;
        this.f7423 = charSequence;
        this.f7420 = c13312;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6392(Writer writer) throws IOException {
        int i = 0;
        while (true) {
            C9742 c9742 = this.f7421;
            if (i >= c9742.m24720()) {
                return;
            }
            if (i == this.f7422) {
                m6389(writer, this.f7423);
            } else {
                C3329 c3329M24713 = c9742.m24713(i, this.f7420);
                try {
                    m6389(writer, c3329M24713);
                    c3329M24713.close();
                } catch (Throwable th) {
                    try {
                        c3329M24713.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b2 */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6393() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1979.m6393():void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6390() {
        return this.f7422;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3329 m6391(int i) {
        if (i == this.f7422) {
            throw new IllegalArgumentException("Active page already has a captured read");
        }
        return this.f7421.m24713(i, this.f7420);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6389(Writer writer, CharSequence charSequence) throws IOException {
        char[] cArr = new char[32768];
        int i = 0;
        while (i < charSequence.length()) {
            int iMin = Math.min(32768, charSequence.length() - i);
            for (int i2 = 0; i2 < iMin; i2++) {
                cArr[i2] = charSequence.charAt(i + i2);
            }
            writer.write(cArr, 0, iMin);
            i += iMin;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f7421) {
            if (this.f7424) {
                return;
            }
            this.f7424 = true;
            this.f7421.f32774--;
            if (this.f7421.f32774 == 0) {
                this.f7421.f32773.m30019((Object) null);
            }
        }
    }
}
