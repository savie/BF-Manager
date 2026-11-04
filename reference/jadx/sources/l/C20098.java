package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9BJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20098 extends AbstractC13006 implements InterfaceC3071 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20098 f64585 = new C20098(1);

    @Override // l.InterfaceC3071
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C15243.m36590(view, "it");
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof InterfaceC13779) {
            return (InterfaceC13779) tag;
        }
        return null;
    }
}
