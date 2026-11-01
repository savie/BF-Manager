package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܿ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17004 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence f54355;

    public C17004(String str) {
        this.f54355 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39783(StringBuilder sb) {
        this.f54355 = sb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17004.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f54355, ((C17004) obj).f54355);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f54355;
        if (charSequence instanceof String) {
            return charSequence.hashCode();
        }
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt * 31) + this.f54355.charAt(i);
        }
        return iCharAt;
    }
}
