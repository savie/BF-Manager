package l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۛܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6148 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f21001;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f21002;

    public C6148(String str, String str2) {
        this.f21002 = str;
        this.f21001 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m17153() {
        if (TextUtils.isEmpty(this.f21001)) {
            return this.f21002;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21001);
        sb.append(" (");
        SpannableString spannableString = new SpannableString(C22697.m50267(sb, this.f21002, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new ForegroundColorSpan(C20368.f65988), this.f21001.length(), spannableString.length(), 17);
        return spannableString;
    }
}
