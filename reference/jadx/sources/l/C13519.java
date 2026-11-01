package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13519 extends AbstractC11348 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13519 f44641 = new C13519(1);

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13465.m32966(view, "it");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
