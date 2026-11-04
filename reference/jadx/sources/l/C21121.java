package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩶ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes5.dex */
public final class C21121 implements InterfaceC6205 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67472;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f67473;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f67474;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f67475;

    public C21121(int i, int i2, int i3, CharSequence charSequence) {
        this.f67475 = charSequence;
        this.f67474 = i;
        this.f67473 = i2;
        this.f67472 = i3;
    }

    @Override // l.InterfaceC6205
    /* JADX INFO: renamed from: ᩷ */
    public final int mo12746() {
        return this.f67474;
    }

    @Override // l.InterfaceC6205
    /* JADX INFO: renamed from: ۙ */
    public final int mo12745() {
        return this.f67473;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21121.class != obj.getClass()) {
            return false;
        }
        C21121 c21121 = (C21121) obj;
        if (this.f67472 != c21121.f67472) {
            return false;
        }
        return TextUtils.equals(this.f67475.subSequence(this.f67474, this.f67473), c21121.f67475.subSequence(c21121.f67474, c21121.f67473));
    }

    public final int hashCode() {
        return this.f67472;
    }
}
