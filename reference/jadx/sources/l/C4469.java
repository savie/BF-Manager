package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C4469 extends C2269 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5175 f15881;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4469(C5175 c5175, Context context, C12418 c12418, View view) {
        super(context, c12418, view, true, R.attr.MT_Protector, 0);
        this.f15881 = c5175;
        m6955(8388613);
        m6958(c5175.f17960);
    }

    @Override // l.C2269
    /* JADX INFO: renamed from: ۚ */
    public final void mo6961() {
        C5175 c5175 = this.f15881;
        if (c5175.f74749 != null) {
            c5175.f74749.close();
        }
        c5175.f17952 = null;
        super.mo6961();
    }
}
