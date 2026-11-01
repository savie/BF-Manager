package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes3.dex */
public final class C6403 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21220 f21718;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f21719;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f21720;

    public C6403(C21220 c21220, C17492 c17492, TextView textView) {
        this.f21718 = c21220;
        this.f21719 = c17492;
        this.f21720 = textView;
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        int size = this.f21718.f69133.size();
        TextView textView = this.f21720;
        C17492 c17492 = this.f21719;
        if (size == 0) {
            c17492.setVisibility(8);
            textView.setVisibility(0);
        } else {
            c17492.setVisibility(0);
            textView.setVisibility(8);
        }
    }
}
