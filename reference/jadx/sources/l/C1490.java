package l;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: l.֫֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1490 implements PrivilegedAction {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5369 f6027;

    public C1490(C5369 c5369) {
        this.f6027 = c5369;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return new C18069(this.f6027, ClassLoader.getSystemClassLoader());
    }
}
