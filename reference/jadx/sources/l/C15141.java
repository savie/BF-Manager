package l;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ܶۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C15141 extends C9886 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC15847 f49473;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15141(ViewOnClickListenerC15847 viewOnClickListenerC15847, Drawable[] drawableArr) {
        super(drawableArr);
        this.f49473 = viewOnClickListenerC15847;
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ */
    public final void mo24995() {
        super.mo24995();
        this.f49473.m37726(false);
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo25016(String str) {
        return this.f49473.f51298 || !str.endsWith("/type-info");
    }

    @Override // l.C9886
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo24993(String str, String str2, boolean z) {
        int iM21606;
        if (!z) {
            int iIndexOf = str.indexOf(47);
            ViewOnClickListenerC15847 viewOnClickListenerC15847 = this.f49473;
            if (iIndexOf == -1) {
                iM21606 = viewOnClickListenerC15847.f51287.m21574(-1, str);
            } else {
                iM21606 = viewOnClickListenerC15847.f51287.m21606(str);
            }
            if (iM21606 != -1) {
                SpannableString spannableString = new SpannableString(String.format("%s [%02X]", str2, Integer.valueOf(iM21606)));
                int length = spannableString.length() - 4;
                int length2 = spannableString.length();
                spannableString.setSpan(new ForegroundColorSpan(C20368.f66007 & (-2130706433)), length, length2, 33);
                spannableString.setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
                return spannableString;
            }
        }
        return str2;
    }
}
