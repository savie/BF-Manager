package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5862 extends AbstractC14217 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View[] f20006;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f20007;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f20008;

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4244(View view, Object obj) {
        return view == obj;
    }

    public C5862(View[] viewArr, AbstractActivityC12483 abstractActivityC12483, int[] iArr) {
        this.f20006 = viewArr;
        this.f20008 = abstractActivityC12483;
        this.f20007 = iArr;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ܰ */
    public final int mo4245() {
        return this.f20006.length;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4242(C19383 c19383, int i) {
        View view = this.f20006[i];
        if (view.getParent() == null) {
            c19383.addView(view);
        }
        return view;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo4243(C19383 c19383, int i, Object obj) {
        c19383.removeView((View) obj);
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4241(int i) {
        return this.f20008.getString(this.f20007[i]);
    }
}
