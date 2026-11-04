package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩹ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L51L */
/* JADX INFO: loaded from: classes.dex */
public final class C23603 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f76619;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f76620;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76621;

    public C23603(C3906 c3906) {
        this.f76619 = c3906.getClass().getName();
        this.f76621 = c3906.m12585();
        this.f76620 = c3906.m12609();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23603)) {
            return false;
        }
        C23603 c23603 = (C23603) obj;
        return this.f76621 == c23603.f76621 && this.f76620 == c23603.f76620 && TextUtils.equals(this.f76619, c23603.f76619);
    }

    public final int hashCode() {
        return this.f76619.hashCode() + ((((this.f76621 + 527) * 31) + this.f76620) * 31);
    }
}
