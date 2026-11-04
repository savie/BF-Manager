package l;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.۫ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13239 extends C14941 {

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20698 f42315;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13239(ViewOnClickListenerC20698 viewOnClickListenerC20698, Drawable[] drawableArr) {
        super(drawableArr);
        this.f42315 = viewOnClickListenerC20698;
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32794() {
        super.mo32794();
        this.f42315.m47352(false);
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo32795(String str) {
        return this.f42315.f66339 || !str.endsWith("/type-info");
    }

    @Override // l.C14941
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo32793(String str, String str2, boolean z) {
        int iM29995;
        if (!z) {
            int iIndexOf = str.indexOf(47);
            ViewOnClickListenerC20698 viewOnClickListenerC20698 = this.f42315;
            if (iIndexOf == -1) {
                iM29995 = viewOnClickListenerC20698.f66350.m29971(-1, str);
            } else {
                iM29995 = viewOnClickListenerC20698.f66350.m29995(str);
            }
            if (iM29995 != -1) {
                SpannableString spannableString = new SpannableString(String.format("%s [%02X]", str2, Integer.valueOf(iM29995)));
                int length = spannableString.length() - 4;
                int length2 = spannableString.length();
                spannableString.setSpan(new ForegroundColorSpan(C3296.f10758 & (-2130706433)), length, length2, 33);
                spannableString.setSpan(new RelativeSizeSpan(0.7f), length, length2, 33);
                return spannableString;
            }
        }
        return str2;
    }
}
