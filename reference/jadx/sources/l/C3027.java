package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V8SO */
/* JADX INFO: loaded from: classes3.dex */
public final class C3027 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f9816;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f9817;

    public C3027(String str, byte[] bArr) {
        super("PRIV");
        this.f9817 = str;
        this.f9816 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3027.class == obj.getClass()) {
            C3027 c3027 = (C3027) obj;
            if (C17359.equals(this.f9817, c3027.f9817) && Arrays.equals(this.f9816, c3027.f9816)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9817;
        return Arrays.hashCode(this.f9816) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // l.AbstractC19435
    public final String toString() {
        return this.f62806 + ": owner=" + this.f9817;
    }
}
