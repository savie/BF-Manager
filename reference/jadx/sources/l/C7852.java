package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.۠֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7852 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16319 f25831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f25832;

    public C7852(ActivityC16319 activityC16319, TextView textView) {
        this.f25831 = activityC16319;
        this.f25832 = textView;
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        this.f25832.setVisibility(this.f25831.f52553.isEmpty() ? 0 : 8);
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
