package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes.dex */
public final class C23438 extends C2269 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5175 f75869;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23438(C5175 c5175, Context context, SubMenuC7915 subMenuC7915, View view) {
        super(context, subMenuC7915, view, false, R.attr.MT_Protector, 0);
        this.f75869 = c5175;
        if (!((C23707) subMenuC7915.getItem()).m52170()) {
            View view2 = c5175.f17959;
            m6956(view2 == null ? (View) c5175.f74747 : view2);
        }
        m6958(c5175.f17960);
    }

    @Override // l.C2269
    /* JADX INFO: renamed from: ۚ */
    public final void mo6961() {
        C5175 c5175 = this.f75869;
        c5175.f17951 = null;
        c5175.f17961 = 0;
        super.mo6961();
    }
}
