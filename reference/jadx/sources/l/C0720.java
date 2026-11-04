package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.֡᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0720 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f2649;

    public C0720(String str) {
        this.f2649 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3041(StringBuilder sb) {
        this.f2649 = sb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0720.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f2649, ((C0720) obj).f2649);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f2649;
        if (charSequence instanceof String) {
            return charSequence.hashCode();
        }
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 31) + this.f2649.charAt(i);
        }
        return iCharAt;
    }
}
