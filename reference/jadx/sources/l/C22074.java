package l;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩹ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22074 extends C0733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f71525;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22074(Context context, String[] strArr, int i) {
        super(context, strArr);
        this.f71525 = i;
    }

    @Override // l.C0733
    /* JADX INFO: renamed from: ۙ */
    public final void mo3189(TextView textView, boolean z) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = this.f71525;
        textView.setLayoutParams(layoutParams);
    }
}
