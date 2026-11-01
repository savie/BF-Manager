package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9BJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11402 extends AbstractC11348 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C11402 f38406 = new C11402(1);

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13465.m32966(view, "it");
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof InterfaceC1792) {
            return (InterfaceC1792) tag;
        }
        return null;
    }
}
