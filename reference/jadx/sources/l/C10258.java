package l;

import java.io.Closeable;
import java.io.File;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۢܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YIXS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10258 implements Closeable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f32756 = "resources.arsc".getBytes(StandardCharsets.US_ASCII);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22941 f32757;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC21094 f32758;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final File f32759;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC17713 f32760;

    public C10258(AbstractC21094 abstractC21094, C22941 c22941, C13961 c13961, File file) {
        this.f32758 = abstractC21094;
        this.f32757 = c22941;
        this.f32760 = c13961;
        this.f32759 = file;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0133 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C10258 m26448(java.io.File r17, java.io.File r18, l.C25133 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10258.m26448(java.io.File, java.io.File, l.᩻ܶܳ):l.ۢܽܳ");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26450(C25133 c25133) throws InterruptedIOException {
        if (c25133.getAsBoolean()) {
            throw new InterruptedIOException("Resource ID lookup cancelled");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C22941 c22941 = this.f32757;
        File file = this.f32759;
        try {
            InterfaceC17713 interfaceC17713 = this.f32760;
            if (interfaceC17713 != null) {
                interfaceC17713.close();
            }
            if (c22941 != null) {
                try {
                    c22941.close();
                } finally {
                    m26449(file);
                }
            }
        } catch (Throwable th) {
            if (c22941 != null) {
                try {
                    c22941.close();
                } finally {
                    m26449(file);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26449(File file) {
        if (file == null || !file.exists() || file.delete()) {
            return;
        }
        file.toString();
    }
}
