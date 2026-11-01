package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܿ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17567 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7648 f55816;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f55817;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f55818;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7648 f55819;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f55820;

    public C17567(String str, C7648 c7648, C7648 c7649, int i, int i2) {
        C2023.m6507(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.f55817 = str;
            c7648.getClass();
            this.f55816 = c7648;
            c7649.getClass();
            this.f55819 = c7649;
            this.f55818 = i;
            this.f55820 = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17567.class == obj.getClass()) {
            C17567 c17567 = (C17567) obj;
            if (this.f55818 == c17567.f55818 && this.f55820 == c17567.f55820 && this.f55817.equals(c17567.f55817) && this.f55816.equals(c17567.f55816) && this.f55819.equals(c17567.f55819)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f55819.hashCode() + ((this.f55816.hashCode() + C13958.m33812((((this.f55818 + 527) * 31) + this.f55820) * 31, 31, this.f55817)) * 31);
    }
}
