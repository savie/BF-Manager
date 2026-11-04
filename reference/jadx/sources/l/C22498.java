package l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes2.dex */
public final class C22498 extends C3054 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72789;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22498(int i, Context context, List list) {
        super(context, list);
        this.f72789 = i;
    }

    @Override // l.C3054
    /* JADX INFO: renamed from: ۙ */
    public final void mo8126(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f72789;
    }
}
