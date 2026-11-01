package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AQ2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22212 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2455 f72651;

    public C22212(C2455 c2455) {
        this.f72651 = c2455;
    }

    @Override // java.lang.ThreadLocal
    @Deprecated
    public final Object get() {
        throw new RuntimeException("Use getZipFile() instead.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2455 m49332() throws IOException {
        try {
            C2455 c2455 = (C2455) super.get();
            C13638.requireNonNull(c2455);
            return c2455;
        } catch (C5278 e) {
            throw ((IOException) e.getCause());
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return this.f72651.m7479();
        } catch (IOException e) {
            throw new C5278(e);
        }
    }
}
