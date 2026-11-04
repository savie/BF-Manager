package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܽۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17391 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56560;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC6950 f56561;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f56562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f56563;

    public C17391(CharSequence charSequence, EnumC6950 enumC6950) {
        int iHashCode;
        int iM20679;
        this.f56563 = charSequence;
        this.f56561 = enumC6950;
        int i = C16645.f53788[enumC6950.ordinal()];
        if (i == 1) {
            if ((charSequence instanceof String) || (charSequence instanceof C3901)) {
                iHashCode = charSequence.hashCode();
            } else {
                iHashCode = C7569.m20679(0, charSequence.length(), charSequence);
            }
            iM20679 = iHashCode;
        } else if (i == 2) {
            int iM33072 = C13441.m33072(0, charSequence.length(), charSequence);
            iM20679 = C7569.m20679(iM33072, C13441.m33068(iM33072, charSequence.length(), charSequence), charSequence);
        } else if (i == 3) {
            int length = charSequence.length();
            iM20679 = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = charSequence.charAt(i2);
                if (!C7569.m20684(cCharAt)) {
                    iM20679 = (iM20679 * 31) + cCharAt;
                }
            }
        } else {
            throw new IllegalArgumentException(enumC6950.name());
        }
        this.f56560 = iM20679;
        int length2 = charSequence.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            if (!C7569.m20684(charSequence.charAt(i4))) {
                i3++;
            }
        }
        this.f56562 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence m40850() {
        return this.f56563;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m40851() {
        return this.f56562;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17391.class != obj.getClass()) {
            return false;
        }
        C17391 c17391 = (C17391) obj;
        if (this.f56560 != c17391.f56560) {
            return false;
        }
        CharSequence charSequence = c17391.f56563;
        int[] iArr = C16645.f53788;
        EnumC6950 enumC6950 = this.f56561;
        int i = iArr[enumC6950.ordinal()];
        CharSequence charSequence2 = this.f56563;
        if (i == 1) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i == 2) {
            return C7569.m20689(charSequence2, charSequence);
        }
        if (i == 3) {
            return C7569.m20686(charSequence2, charSequence);
        }
        throw new IllegalArgumentException(enumC6950.toString());
    }

    public final int hashCode() {
        return this.f56560;
    }
}
