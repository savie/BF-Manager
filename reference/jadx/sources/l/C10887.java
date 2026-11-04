package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۤ۬ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10887 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f34460;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f34461;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f34462;

    public C10887(String str, boolean z, boolean z2) {
        this.f34460 = str;
        this.f34462 = z;
        this.f34461 = z2;
    }

    public final int hashCode() {
        return ((C12351.m30817(31, 31, this.f34460) + (this.f34462 ? 1231 : 1237)) * 31) + (this.f34461 ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C10887.class) {
            C10887 c10887 = (C10887) obj;
            if (TextUtils.equals(this.f34460, c10887.f34460) && this.f34462 == c10887.f34462 && this.f34461 == c10887.f34461) {
                return true;
            }
        }
        return false;
    }
}
