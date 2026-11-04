package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܽ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17820 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58463;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15648 f58464;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f58465;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f58466;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15648 f58467;

    public C17820(String str, C15648 c15648, C15648 c15649, int i, int i2) {
        C20782.m47565(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.f58463 = str;
            c15648.getClass();
            this.f58467 = c15648;
            c15649.getClass();
            this.f58464 = c15649;
            this.f58465 = i;
            this.f58466 = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17820.class == obj.getClass()) {
            C17820 c17820 = (C17820) obj;
            if (this.f58465 == c17820.f58465 && this.f58466 == c17820.f58466 && this.f58463.equals(c17820.f58463) && this.f58467.equals(c17820.f58467) && this.f58464.equals(c17820.f58464)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f58464.hashCode() + ((this.f58467.hashCode() + C12351.m30817((((this.f58465 + 527) * 31) + this.f58466) * 31, 31, this.f58463)) * 31);
    }
}
