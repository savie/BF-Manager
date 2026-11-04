package l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14340 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f45234;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f45235;

    public C14340(String str, String str2) {
        this.f45235 = str;
        this.f45234 = str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m34760() {
        if (TextUtils.isEmpty(this.f45234)) {
            return this.f45235;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45234);
        sb.append(" (");
        SpannableString spannableString = new SpannableString(C8947.m23910(sb, this.f45235, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new ForegroundColorSpan(C3296.f10741), this.f45234.length(), spannableString.length(), 17);
        return spannableString;
    }
}
