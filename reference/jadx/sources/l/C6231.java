package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۛۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6231 implements InterfaceC0286 {
    @Override // l.InterfaceC0286
    /* JADX INFO: renamed from: ۙ */
    public final void mo1851(View view) {
    }

    @Override // l.InterfaceC0286
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1852(View view) {
        C18185 c18185 = (C18185) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) c18185).width != -1 || ((ViewGroup.MarginLayoutParams) c18185).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
