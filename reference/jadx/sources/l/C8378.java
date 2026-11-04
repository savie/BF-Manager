package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C8378 extends AbstractC6274 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25093 f27486;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2999(View view, Object obj) {
        return view == obj;
    }

    public C8378(C25093 c25093) {
        this.f27486 = c25093;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return ((ArrayList) this.f27486.f81141).size();
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(int i) {
        C25093 c25093 = this.f27486;
        return c25093.f81138.getString(((C1972) ((ArrayList) c25093.f81141).get(i)).f6616);
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2997(C15179 c15179, int i) {
        View view = ((C1972) ((ArrayList) this.f27486.f81141).get(i)).f6624;
        c15179.addView(view);
        return view;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo2998(C15179 c15179, int i, Object obj) {
        c15179.removeView((View) obj);
    }
}
