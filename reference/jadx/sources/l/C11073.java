package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: O9NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11073 extends AbstractC11348 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C11073 f37582 = new C11073(1);

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C13465.m32966(view, "viewParent");
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof InterfaceC1423) {
            return (InterfaceC1423) tag;
        }
        return null;
    }
}
