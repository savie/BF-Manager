package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩴ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57J2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20041 extends AbstractC8909 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11090 f64387;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46097(InputStream inputStream) {
        this.f64387 = new C11090(inputStream);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC23025 m46098() {
        C11090 c11090 = this.f64387;
        if (c11090 != null) {
            return c11090;
        }
        throw new IllegalStateException("origin == null");
    }
}
