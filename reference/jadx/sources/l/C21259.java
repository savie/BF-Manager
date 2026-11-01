package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21259 extends AbstractC11348 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C21259 f69227 = new C21259(1);

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C17731(viewGroup);
        }
        return null;
    }
}
