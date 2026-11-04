package l;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۙۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4656 extends C21609 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21810 f16456;

    public C4656(C21810 c21810) {
        this.f16456 = c21810;
    }

    @Override // l.C21609, l.InterfaceC14895
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14510(View view, String str) {
        C21810 c21810 = this.f16456;
        if (c21810.f69546 == null || !c21810.f69546.mo30888(view, str)) {
            if (str.startsWith("#")) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    ViewParent parent = view.getParent();
                    if (parent instanceof ScrollView) {
                        ScrollView scrollView = (ScrollView) parent;
                        int iMo13099 = c21810.f69547.mo13099(-1, String.valueOf(str.substring(1)).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-"));
                        if (iMo13099 >= 0) {
                            scrollView.smoothScrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(iMo13099)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            super.mo14510(view, str);
        }
    }
}
