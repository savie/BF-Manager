package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9880 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m25687(View view) {
        C15243.m36590(view, "<this>");
        for (View view2 : C3274.m10776(view)) {
            C9134 c9134 = (C9134) view2.getTag(R.id.MT_Protector);
            if (c9134 == null) {
                c9134 = new C9134();
                view2.setTag(R.id.MT_Protector, c9134);
            }
            c9134.m24277();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m25688(C25227 c25227) {
        Iterator it = C15952.m38066(c25227).iterator();
        while (true) {
            C17444 c17444 = (C17444) it;
            if (!c17444.hasNext()) {
                return;
            }
            View view = (View) c17444.next();
            C9134 c9134 = (C9134) view.getTag(R.id.MT_Protector);
            if (c9134 == null) {
                c9134 = new C9134();
                view.setTag(R.id.MT_Protector, c9134);
            }
            c9134.m24277();
        }
    }
}
