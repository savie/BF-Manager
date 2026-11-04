package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩵ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20723 extends AbstractC6274 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16468 f66406;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2999(View view, Object obj) {
        return view == obj;
    }

    public C20723(C16468 c16468) {
        this.f66406 = c16468;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(int i) {
        try {
            return ((C8044) this.f66406.f53410.get(i)).m21929();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2997(C15179 c15179, int i) {
        C25227 c25227 = ((C8044) this.f66406.f53410.get(i)).f26670;
        c15179.addView(c25227);
        return c25227;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo2998(C15179 c15179, int i, Object obj) {
        c15179.removeView((View) obj);
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return this.f66406.f53410.size();
    }
}
