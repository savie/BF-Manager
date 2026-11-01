package l;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S207 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10905 extends ClickableSpan {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f37092;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f37093;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22006 f37094;

    public C10905(int i, C22006 c22006, int i2) {
        this.f37092 = i;
        this.f37094 = c22006;
        this.f37093 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f37092);
        this.f37094.m48839(this.f37093, bundle);
    }
}
