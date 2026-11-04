package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16698 extends AbstractC13006 implements InterfaceC3071 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C16698 f53947 = new C16698(1);

    @Override // l.InterfaceC3071
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C17444(viewGroup);
        }
        return null;
    }
}
