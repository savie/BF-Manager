package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OW */
/* JADX INFO: loaded from: classes.dex */
public final class C21673 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f69189;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f69190;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f69191;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f69192;

    public C21673(byte[] bArr, String str, String str2, String str3) {
        super("GEOB");
        this.f69190 = str;
        this.f69192 = str2;
        this.f69189 = str3;
        this.f69191 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21673.class == obj.getClass()) {
            C21673 c21673 = (C21673) obj;
            if (C17359.equals(this.f69190, c21673.f69190) && C17359.equals(this.f69192, c21673.f69192) && C17359.equals(this.f69189, c21673.f69189) && Arrays.equals(this.f69191, c21673.f69191)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f69190;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f69192;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f69189;
        return Arrays.hashCode(this.f69191) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC19435
    public final String toString() {
        return this.f62806 + ": mimeType=" + this.f69190 + ", filename=" + this.f69192 + ", description=" + this.f69189;
    }
}
