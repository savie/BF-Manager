package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩶ᩴ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20363 extends AbstractC14217 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8765 f65936;

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4244(View view, Object obj) {
        return view == obj;
    }

    public C20363(C8765 c8765) {
        this.f65936 = c8765;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4241(int i) {
        try {
            return ((C2017) this.f65936.f30138.get(i)).m6499();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4242(C19383 c19383, int i) {
        C17492 c17492 = ((C2017) this.f65936.f30138.get(i)).f7530;
        c19383.addView(c17492);
        return c17492;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo4243(C19383 c19383, int i, Object obj) {
        c19383.removeView((View) obj);
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ܰ */
    public final int mo4245() {
        return this.f65936.f30138.size();
    }
}
