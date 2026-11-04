package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6665 extends AbstractC9980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f22229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f22230;

    public C6665(View view, View view2) {
        this.f22230 = view;
        this.f22229 = view2;
    }

    @Override // l.AbstractC9980
    public final void onScrolled(C25227 c25227, int i, int i2) {
        C18597.m43177((View) c25227, this.f22230, this.f22229);
    }

    @Override // l.AbstractC9980
    public final void onScrollStateChanged(C25227 c25227, int i) {
        C18597.m43177((View) c25227, this.f22230, this.f22229);
    }
}
