package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I8K8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4870 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16981;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16982;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f16983;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f16984;

    public C4870(int i, byte[] bArr, int i2, int i3) {
        this.f16983 = i;
        this.f16984 = bArr;
        this.f16982 = i2;
        this.f16981 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4870.class == obj.getClass()) {
            C4870 c4870 = (C4870) obj;
            if (this.f16983 == c4870.f16983 && this.f16982 == c4870.f16982 && this.f16981 == c4870.f16981 && Arrays.equals(this.f16984, c4870.f16984)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f16984) + (this.f16983 * 31)) * 31) + this.f16982) * 31) + this.f16981;
    }
}
