package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۚ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5933 extends AbstractC6274 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f20281;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f20282;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View[] f20283;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2999(View view, Object obj) {
        return view == obj;
    }

    public C5933(View[] viewArr, AbstractActivityC17204 abstractActivityC17204, int[] iArr) {
        this.f20283 = viewArr;
        this.f20281 = abstractActivityC17204;
        this.f20282 = iArr;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return this.f20283.length;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2997(C15179 c15179, int i) {
        View view = this.f20283[i];
        if (view.getParent() == null) {
            c15179.addView(view);
        }
        return view;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo2998(C15179 c15179, int i, Object obj) {
        c15179.removeView((View) obj);
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(int i) {
        return this.f20281.getString(this.f20282[i]);
    }
}
