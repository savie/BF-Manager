package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜܶܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6847 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f23044;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f23045;

    public C6847(String str, byte[] bArr) {
        super("PRIV");
        this.f23045 = str;
        this.f23044 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6847.class == obj.getClass()) {
            C6847 c6847 = (C6847) obj;
            if (C13638.equals(this.f23045, c6847.f23045) && Arrays.equals(this.f23044, c6847.f23044)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23045;
        return Arrays.hashCode(this.f23044) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // l.AbstractC22370
    public final String toString() {
        return this.f73049 + ": owner=" + this.f23045;
    }
}
