package l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13742 extends C3054 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43612;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13742(Context context, ArrayList arrayList, int i) {
        super(context, arrayList);
        this.f43612 = i;
    }

    @Override // l.C3054
    /* JADX INFO: renamed from: ۙ */
    public final void mo8126(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f43612;
    }
}
