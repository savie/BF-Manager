package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9BJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C23082 extends AbstractC13006 implements InterfaceC3071 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C23082 f74867 = new C23082(1);

    @Override // l.InterfaceC3071
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C15243.m36590(view, "it");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
