package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۬ۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes4.dex */
public final class C12911 implements InterfaceC2326 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f42922;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42923;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f42924;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f42925;

    public C12911(int i, int i2, int i3, CharSequence charSequence) {
        this.f42922 = charSequence;
        this.f42925 = i;
        this.f42924 = i2;
        this.f42923 = i3;
    }

    @Override // l.InterfaceC2326
    /* JADX INFO: renamed from: ܰ */
    public final int mo7062() {
        return this.f42925;
    }

    @Override // l.InterfaceC2326
    /* JADX INFO: renamed from: ۙ */
    public final int mo7061() {
        return this.f42924;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12911.class != obj.getClass()) {
            return false;
        }
        C12911 c12911 = (C12911) obj;
        if (this.f42923 != c12911.f42923) {
            return false;
        }
        return TextUtils.equals(this.f42922.subSequence(this.f42925, this.f42924), c12911.f42922.subSequence(c12911.f42925, c12911.f42924));
    }

    public final int hashCode() {
        return this.f42923;
    }
}
