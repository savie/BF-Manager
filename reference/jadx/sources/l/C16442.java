package l;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܽۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16442 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0130 f52871;

    public C16442(C0130 c0130) {
        this.f52871 = c0130;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Type typeM29317 = c11730.m29317();
        Class clsM29316 = c11730.m29316();
        if (!Collection.class.isAssignableFrom(clsM29316)) {
            return null;
        }
        Type typeM51549 = C23415.m51549(clsM29316, typeM29317);
        return new C0213(new C16234(c6044, c6044.m16440(C11730.m29314(typeM51549)), typeM51549), this.f52871.m1197(c11730, false));
    }
}
