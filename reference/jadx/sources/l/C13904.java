package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13904 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f45806;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f45807;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f45808;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f45809;

    public C13904(byte[] bArr, String str, String str2, String str3) {
        super("GEOB");
        this.f45807 = str;
        this.f45806 = str2;
        this.f45808 = str3;
        this.f45809 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13904.class == obj.getClass()) {
            C13904 c13904 = (C13904) obj;
            if (C13638.equals(this.f45807, c13904.f45807) && C13638.equals(this.f45806, c13904.f45806) && C13638.equals(this.f45808, c13904.f45808) && Arrays.equals(this.f45809, c13904.f45809)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f45807;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f45806;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45808;
        return Arrays.hashCode(this.f45809) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC22370
    public final String toString() {
        return this.f73049 + ": mimeType=" + this.f45807 + ", filename=" + this.f45806 + ", description=" + this.f45808;
    }
}
