package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۧܺܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51L */
/* JADX INFO: loaded from: classes3.dex */
public final class C11103 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f37687;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f37688;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f37689;

    public C11103(C4751 c4751) {
        this.f37687 = c4751.getClass().getName();
        this.f37689 = c4751.m13181();
        this.f37688 = c4751.m13179();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11103)) {
            return false;
        }
        C11103 c11103 = (C11103) obj;
        return this.f37689 == c11103.f37689 && this.f37688 == c11103.f37688 && TextUtils.equals(this.f37687, c11103.f37687);
    }

    public final int hashCode() {
        return this.f37687.hashCode() + ((((this.f37689 + 527) * 31) + this.f37688) * 31);
    }
}
