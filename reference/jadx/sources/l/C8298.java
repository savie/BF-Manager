package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C8298 extends C15009 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13056 f27260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8298(C13056 c13056, Context context, SubMenuC12026 subMenuC12026, View view) {
        super(context, subMenuC12026, view, false, R.attr.MT_Protector, 0);
        this.f27260 = c13056;
        if (!((C8407) subMenuC12026.getItem()).m22586()) {
            View view2 = c13056.f41784;
            m36142(view2 == null ? (View) c13056.f56499 : view2);
        }
        m36144(c13056.f41781);
    }

    @Override // l.C15009
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo22387() {
        C13056 c13056 = this.f27260;
        c13056.f41783 = null;
        c13056.f41791 = 0;
        super.mo22387();
    }
}
