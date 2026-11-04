package l;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import bin.mt.plus.Features;

/* JADX INFO: renamed from: l.ۡۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9097 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f29559;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f29560;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f29561;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f29562;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29563;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f29564;

    public C9097(C21694 c21694) {
        this(c21694.m49241(), c21694.m49242(), c21694.m49233());
    }

    public C9097(int i, String str, String str2) {
        this.f29564 = i;
        this.f29561 = str;
        this.f29559 = str2;
        this.f29560 = -1;
        this.f29563 = -1;
    }

    public C9097(int i, int i2, int i3) {
        this.f29564 = i;
        this.f29561 = Features.m45(i2);
        this.f29559 = Features.m45(i3);
        this.f29560 = i2;
        this.f29563 = i3;
    }

    public C9097(String str, int i, String str2, int i2, int i3) {
        this.f29564 = i;
        this.f29561 = str;
        this.f29559 = str2;
        this.f29560 = i2;
        this.f29563 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9097 m24238(int i) {
        return new C9097(this.f29561, (this.f29564 & 61440) | (i & 4095), this.f29559, this.f29560, this.f29563);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m24247() {
        return this.f29564;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m24241() {
        return this.f29561;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m24237() {
        return this.f29559;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m24242() {
        return this.f29560;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24246() {
        return this.f29563;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m24243() {
        return this.f29564 & 4095;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m24244() {
        String str = this.f29562;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(10);
        int i = this.f29564;
        if ((61440 & i) != 0) {
            sb.append(C6790.m18964(i));
        }
        sb.append(C6790.m18977(i));
        String string = sb.toString();
        this.f29562 = string;
        return string;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SpannableString m24245() {
        StringBuilder sb = new StringBuilder(m24244());
        sb.append('(');
        String octalString = Integer.toOctalString(this.f29564 & 4095);
        while (octalString.length() < 3) {
            octalString = "0".concat(octalString);
        }
        sb.append(octalString);
        sb.append(')');
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new ScaleXSpan(0.95f), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9097 m24239(int i, int i2) {
        return new C9097(this.f29564, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9097 m24240(String str, String str2) {
        return new C9097(this.f29564, str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C9097.class) {
            C9097 c9097 = (C9097) obj;
            if (this.f29564 == c9097.f29564 && C17359.equals(this.f29561, c9097.f29561) && C17359.equals(this.f29559, c9097.f29559)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C17359.hash(Integer.valueOf(this.f29564), this.f29561, this.f29559);
    }
}
