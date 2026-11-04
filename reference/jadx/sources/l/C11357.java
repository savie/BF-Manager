package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۧۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11357 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6138 f35768;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f35769;

    public C11357(ActivityC6138 activityC6138, TextView textView) {
        this.f35768 = activityC6138;
        this.f35769 = textView;
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        this.f35769.setVisibility(this.f35768.f20956.isEmpty() ? 0 : 8);
    }

    @Override // l.AbstractC1778
    public final void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }
}
