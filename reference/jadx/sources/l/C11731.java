package l;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import bin.mt.plus.Features;

/* JADX INFO: renamed from: l.ۨ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11731 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f39425;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f39426;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f39427;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f39428;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39429;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f39430;

    public C11731(C5574 c5574) {
        this(c5574.m15390(), c5574.m15399(), c5574.m15392());
    }

    public C11731(int i, String str, String str2) {
        this.f39425 = i;
        this.f39430 = str;
        this.f39426 = str2;
        this.f39428 = -1;
        this.f39429 = -1;
    }

    public C11731(int i, int i2, int i3) {
        this.f39425 = i;
        this.f39430 = Features.m56(i2);
        this.f39426 = Features.m56(i3);
        this.f39428 = i2;
        this.f39429 = i3;
    }

    public C11731(String str, int i, String str2, int i2, int i3) {
        this.f39425 = i;
        this.f39430 = str;
        this.f39426 = str2;
        this.f39428 = i2;
        this.f39429 = i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m29319() {
        return this.f39425;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11731 m29321(int i) {
        return new C11731(this.f39430, (this.f39425 & 61440) | (i & 4095), this.f39426, this.f39428, this.f39429);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m29326() {
        return this.f39430;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29320() {
        return this.f39426;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m29325() {
        return this.f39428;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m29327() {
        return this.f39429;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m29318() {
        return this.f39425 & 4095;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m29328() {
        String str = this.f39427;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(10);
        int i = this.f39425;
        if ((61440 & i) != 0) {
            sb.append(C13672.m33377(i));
        }
        sb.append(C13672.m33382(i));
        String string = sb.toString();
        this.f39427 = string;
        return string;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SpannableString m29324() {
        StringBuilder sb = new StringBuilder(m29328());
        sb.append('(');
        String octalString = Integer.toOctalString(this.f39425 & 4095);
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
    public final C11731 m29322(int i, int i2) {
        return new C11731(this.f39425, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11731 m29323(String str, String str2) {
        return new C11731(this.f39425, str, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C11731.class) {
            C11731 c11731 = (C11731) obj;
            if (this.f39425 == c11731.f39425 && C13638.equals(this.f39430, c11731.f39430) && C13638.equals(this.f39426, c11731.f39426)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f39425), this.f39430, this.f39426);
    }
}
