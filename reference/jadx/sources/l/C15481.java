package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AQ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15481 extends ThreadLocal {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22941 f50401;

    public C15481(C22941 c22941) {
        this.f50401 = c22941;
    }

    @Override // java.lang.ThreadLocal
    @Deprecated
    public final Object get() {
        throw new RuntimeException("Use getZipFile() instead.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22941 m37046() throws IOException {
        try {
            C22941 c22941 = (C22941) super.get();
            C17359.requireNonNull(c22941);
            return c22941;
        } catch (C19957 e) {
            throw ((IOException) e.getCause());
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return this.f50401.m51747();
        } catch (IOException e) {
            throw new C19957(e);
        }
    }
}
