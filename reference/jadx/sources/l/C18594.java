package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8K8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18594 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f59156;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f59157;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f59158;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f59159;

    public C18594(int i, byte[] bArr, int i2, int i3) {
        this.f59159 = i;
        this.f59156 = bArr;
        this.f59158 = i2;
        this.f59157 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18594.class == obj.getClass()) {
            C18594 c18594 = (C18594) obj;
            if (this.f59159 == c18594.f59159 && this.f59158 == c18594.f59158 && this.f59157 == c18594.f59157 && Arrays.equals(this.f59156, c18594.f59156)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f59156) + (this.f59159 * 31)) * 31) + this.f59158) * 31) + this.f59157;
    }
}
