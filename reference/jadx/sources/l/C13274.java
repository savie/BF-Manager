package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13274 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5817 f42402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f42403;

    public C13274(C5817 c5817, View view) {
        this.f42402 = c5817;
        this.f42403 = view;
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        C5817 c5817 = this.f42402;
        AbstractC12964 adapter = c5817.getAdapter();
        boolean z = adapter == null || adapter.getItemCount() == 0;
        View view = this.f42403;
        if (view == null) {
            c5817.setVisibility(0);
        } else if (z) {
            view.setVisibility(0);
            c5817.setVisibility(4);
        } else {
            view.setVisibility(8);
            c5817.setVisibility(0);
        }
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
