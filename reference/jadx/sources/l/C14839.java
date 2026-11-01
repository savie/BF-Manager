package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18PD */
/* JADX INFO: loaded from: classes5.dex */
public final class C14839 extends AbstractC22370 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f48483;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f48484;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f48485;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f48486;

    public C14839(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f48485 = str;
        this.f48486 = str2;
        this.f48484 = i;
        this.f48483 = bArr;
    }

    @Override // l.AbstractC22370, l.InterfaceC22155
    /* JADX INFO: renamed from: ۙ */
    public final void mo3146(C2398 c2398) {
        c2398.m7309(this.f48484, this.f48483);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14839.class == obj.getClass()) {
            C14839 c14839 = (C14839) obj;
            if (this.f48484 == c14839.f48484 && C13638.equals(this.f48485, c14839.f48485) && C13638.equals(this.f48486, c14839.f48486) && Arrays.equals(this.f48483, c14839.f48483)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f48484 + 527) * 31;
        String str = this.f48485;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48486;
        return Arrays.hashCode(this.f48483) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC22370
    public final String toString() {
        return this.f73049 + ": mimeType=" + this.f48485 + ", description=" + this.f48486;
    }
}
