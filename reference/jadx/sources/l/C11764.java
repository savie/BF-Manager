package l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11764 extends C0733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39488;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11764(int i, Context context, List list) {
        super(context, list);
        this.f39488 = i;
    }

    @Override // l.C0733
    /* JADX INFO: renamed from: ۙ */
    public final void mo3189(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f39488;
    }
}
