package l;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S207 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9942 extends ClickableSpan {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f31879;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31880;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19835 f31881;

    public C9942(int i, C19835 c19835, int i2) {
        this.f31880 = i;
        this.f31881 = c19835;
        this.f31879 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f31880);
        this.f31881.m45634(this.f31879, bundle);
    }
}
