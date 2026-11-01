package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩵ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19188 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f61966;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f61967;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f61968;

    public C19188(String str, boolean z, boolean z2) {
        this.f61966 = str;
        this.f61968 = z;
        this.f61967 = z2;
    }

    public final int hashCode() {
        return ((C13958.m33812(31, 31, this.f61966) + (this.f61968 ? 1231 : 1237)) * 31) + (this.f61967 ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C19188.class) {
            C19188 c19188 = (C19188) obj;
            if (TextUtils.equals(this.f61966, c19188.f61966) && this.f61968 == c19188.f61968 && this.f61967 == c19188.f61967) {
                return true;
            }
        }
        return false;
    }
}
