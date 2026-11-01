package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3432 extends AbstractC14217 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13708 f12650;

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4244(View view, Object obj) {
        return view == obj;
    }

    public C3432(C13708 c13708) {
        this.f12650 = c13708;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4241(int i) {
        try {
            return ((C9166) ((ArrayList) this.f12650.f45200).get(i)).m23581();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4242(C19383 c19383, int i) {
        C14723 c14723 = ((C4534) ((ArrayList) this.f12650.f45198).get(i)).f16129;
        c19383.addView(c14723);
        return c14723;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo4243(C19383 c19383, int i, Object obj) {
        c19383.removeView((View) obj);
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ܰ */
    public final int mo4245() {
        return ((ArrayList) this.f12650.f45198).size();
    }
}
