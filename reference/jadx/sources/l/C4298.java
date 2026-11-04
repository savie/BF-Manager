package l;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: l.ۘܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4298 implements PrivilegedAction {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10263 f15584;

    public C4298(C10263 c10263) {
        this.f15584 = c10263;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return new C10965(this.f15584, ClassLoader.getSystemClassLoader());
    }
}
