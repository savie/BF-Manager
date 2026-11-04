package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12722 extends AbstractC19435 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f40736;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f40737;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f40738;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f40739;

    public C12722(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f40736 = str;
        this.f40738 = str2;
        this.f40737 = i;
        this.f40739 = bArr;
    }

    @Override // l.AbstractC19435, l.InterfaceC8191
    /* JADX INFO: renamed from: ۙ */
    public final void mo12246(C18632 c18632) {
        c18632.m43370(this.f40737, this.f40739);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12722.class == obj.getClass()) {
            C12722 c12722 = (C12722) obj;
            if (this.f40737 == c12722.f40737 && C17359.equals(this.f40736, c12722.f40736) && C17359.equals(this.f40738, c12722.f40738) && Arrays.equals(this.f40739, c12722.f40739)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f40737 + 527) * 31;
        String str = this.f40736;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f40738;
        return Arrays.hashCode(this.f40739) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC19435
    public final String toString() {
        return this.f62806 + ": mimeType=" + this.f40736 + ", description=" + this.f40738;
    }
}
