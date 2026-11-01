package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟ܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7581 extends AbstractC6909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f25107;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f25108;

    public C7581(View view, View view2) {
        this.f25108 = view;
        this.f25107 = view2;
    }

    @Override // l.AbstractC6909
    public final void onScrolled(C17492 c17492, int i, int i2) {
        C16754.m39312((View) c17492, this.f25108, this.f25107);
    }

    @Override // l.AbstractC6909
    public final void onScrollStateChanged(C17492 c17492, int i) {
        C16754.m39312((View) c17492, this.f25108, this.f25107);
    }
}
