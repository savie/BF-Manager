package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩻ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2216 */
/* JADX INFO: loaded from: classes.dex */
public class C25126 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f81248;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f81249;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f81250;

    public C25126(String str, int i, int i2) {
        this.f81248 = str;
        this.f81250 = i;
        this.f81249 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25126)) {
            return false;
        }
        C25126 c25126 = (C25126) obj;
        int i = c25126.f81249;
        String str = c25126.f81248;
        int i2 = c25126.f81250;
        int i3 = this.f81249;
        String str2 = this.f81248;
        int i4 = this.f81250;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return C17359.hash(this.f81248, Integer.valueOf(this.f81249));
    }
}
