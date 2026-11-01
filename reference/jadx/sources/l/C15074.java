package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܶۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes4.dex */
public final class C15074 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21423 f49143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f49144;

    public C15074(C21423 c21423, View view) {
        this.f49143 = c21423;
        this.f49144 = view;
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        C21423 c21423 = this.f49143;
        AbstractC0414 adapter = c21423.getAdapter();
        boolean z = adapter == null || adapter.getItemCount() == 0;
        View view = this.f49144;
        if (view == null) {
            c21423.setVisibility(0);
        } else if (z) {
            view.setVisibility(0);
            c21423.setVisibility(4);
        } else {
            view.setVisibility(8);
            c21423.setVisibility(0);
        }
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
