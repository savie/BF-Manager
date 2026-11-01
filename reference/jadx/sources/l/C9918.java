package l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9918 extends C0733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33895;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9918(Context context, ArrayList arrayList, int i) {
        super(context, arrayList);
        this.f33895 = i;
    }

    @Override // l.C0733
    /* JADX INFO: renamed from: ۙ */
    public final void mo3189(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f33895;
    }
}
