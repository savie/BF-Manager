package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.᩵ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes5.dex */
public final class C19554 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC12499 f62839;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f62840;

    public C19554(ActivityC12499 activityC12499, TextView textView) {
        this.f62839 = activityC12499;
        this.f62840 = textView;
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        this.f62840.setVisibility(this.f62839.f41797.isEmpty() ? 0 : 8);
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
