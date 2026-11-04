package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6385 extends AbstractC6274 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4147 f21579;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2999(View view, Object obj) {
        return view == obj;
    }

    public C6385(C4147 c4147) {
        this.f21579 = c4147;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(int i) {
        try {
            return ((C1711) ((ArrayList) this.f21579.f14100).get(i)).m6082();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2997(C15179 c15179, int i) {
        C23539 c23539 = ((C24285) ((ArrayList) this.f21579.f14091).get(i)).f78606;
        c15179.addView(c23539);
        return c23539;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo2998(C15179 c15179, int i, Object obj) {
        c15179.removeView((View) obj);
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return ((ArrayList) this.f21579.f14091).size();
    }
}
