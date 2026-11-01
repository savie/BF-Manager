package l;

import android.text.Spannable;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22670 extends AbstractC0770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0091 f73824;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7660 f73825 = new C7660();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22670 m50203(C0091 c0091) {
        return new C22670(c0091);
    }

    public C22670(C0091 c0091) {
        this.f73824 = c0091;
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3308(TextView textView) {
        C7660 c7660 = this.f73825;
        c7660.clear();
        Spannable spannable = (Spannable) textView.getText();
        C3943[] c3943Arr = (C3943[]) spannable.getSpans(0, spannable.length(), C3943.class);
        if (c3943Arr != null) {
            for (C3943 c3943 : c3943Arr) {
                int spanStart = spannable.getSpanStart(c3943);
                String strReplaceAll = String.valueOf(spannable.subSequence(spanStart, spannable.getSpanEnd(c3943))).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-");
                if (c7660.mo18022(strReplaceAll) == 0 && !c7660.containsKey(strReplaceAll)) {
                    c7660.mo18019(spanStart, (Object) strReplaceAll);
                }
            }
        }
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1045(C17704 c17704) {
        c17704.m41247(new C6441(this));
    }
}
