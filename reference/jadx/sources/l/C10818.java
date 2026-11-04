package l;

import android.content.Context;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C10818 extends C15009 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13056 f34302;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10818(C13056 c13056, Context context, C9898 c9898, View view) {
        super(context, c9898, view, true, R.attr.MT_Protector, 0);
        this.f34302 = c13056;
        m36141(8388613);
        m36144(c13056.f41781);
    }

    @Override // l.C15009
    /* JADX INFO: renamed from: ᩴ */
    public final void mo22387() {
        C13056 c13056 = this.f34302;
        if (c13056.f56497 != null) {
            c13056.f56497.close();
        }
        c13056.f41792 = null;
        super.mo22387();
    }
}
