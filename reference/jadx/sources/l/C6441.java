package l;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۜ֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6441 extends C6415 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22670 f21790;

    public C6441(C22670 c22670) {
        this.f21790 = c22670;
    }

    @Override // l.C6415, l.InterfaceC3592
    /* JADX INFO: renamed from: ۙ */
    public final void mo10671(View view, String str) {
        C22670 c22670 = this.f21790;
        if (c22670.f73824 == null || !c22670.f73824.mo1046(view, str)) {
            if (str.startsWith("#")) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    ViewParent parent = view.getParent();
                    if (parent instanceof ScrollView) {
                        ScrollView scrollView = (ScrollView) parent;
                        int iMo17278 = c22670.f73825.mo17278(-1, String.valueOf(str.substring(1)).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-"));
                        if (iMo17278 >= 0) {
                            scrollView.smoothScrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(iMo17278)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            super.mo10671(view, str);
        }
    }
}
