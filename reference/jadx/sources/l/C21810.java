package l;

import android.text.Spannable;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes.dex */
public final class C21810 extends AbstractC24593 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23302 f69546;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2329 f69547 = new C2329();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21810 m49464(C23302 c23302) {
        return new C21810(c23302);
    }

    public C21810(C23302 c23302) {
        this.f69546 = c23302;
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9652(TextView textView) {
        C2329 c2329 = this.f69547;
        c2329.clear();
        Spannable spannable = (Spannable) textView.getText();
        C14675[] c14675Arr = (C14675[]) spannable.getSpans(0, spannable.length(), C14675.class);
        if (c14675Arr != null) {
            for (C14675 c14675 : c14675Arr) {
                int spanStart = spannable.getSpanStart(c14675);
                String strReplaceAll = String.valueOf(spannable.subSequence(spanStart, spannable.getSpanEnd(c14675))).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-");
                if (c2329.mo7848(strReplaceAll) == 0 && !c2329.containsKey(strReplaceAll)) {
                    c2329.mo7845(spanStart, (Object) strReplaceAll);
                }
            }
        }
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo8845(C19371 c19371) {
        c19371.m44807(new C4656(this));
    }
}
