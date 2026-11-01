package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O9NE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6133 extends AbstractC11348 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C6133 f20937 = new C6133(1);

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13465.m32966(view, "currentView");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
