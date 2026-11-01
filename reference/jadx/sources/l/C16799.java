package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܽᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2216 */
/* JADX INFO: loaded from: classes4.dex */
public class C16799 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f53786;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f53787;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53788;

    public C16799(String str, int i, int i2) {
        this.f53786 = str;
        this.f53788 = i;
        this.f53787 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16799)) {
            return false;
        }
        C16799 c16799 = (C16799) obj;
        int i = c16799.f53787;
        String str = c16799.f53786;
        int i2 = c16799.f53788;
        int i3 = this.f53787;
        String str2 = this.f53786;
        int i4 = this.f53788;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return C13638.hash(this.f53786, Integer.valueOf(this.f53787));
    }
}
