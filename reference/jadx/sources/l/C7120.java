package l;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7120 extends C3054 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23467;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7120(Context context, String[] strArr, int i) {
        super(context, strArr);
        this.f23467 = i;
    }

    @Override // l.C3054
    /* JADX INFO: renamed from: ۙ */
    public final void mo8126(TextView textView, boolean z) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = this.f23467;
        textView.setLayoutParams(layoutParams);
    }
}
