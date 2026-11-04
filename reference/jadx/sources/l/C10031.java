package l;

/* JADX INFO: renamed from: l.ۢۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C43R */
/* JADX INFO: loaded from: classes4.dex */
public final class C10031 extends AbstractC22712 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7795[] f32159;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32160;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32161;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10031 m25882(C15252 c15252) {
        C10031 c10031 = new C10031(c15252);
        c10031.f32160 = EnumC6121.f20881;
        c10031.f32159 = new C7795[32768];
        return c10031;
    }

    @Override // l.AbstractC22712
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC19728 mo2069(char[] cArr, int i) {
        byte[] bArr = new byte[i * 3];
        return mo2068(0, C21901.m49589(bArr, 0, i, cArr), bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC22712
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC19728 mo2068(int i, int i2, byte[] bArr) {
        int iM51193 = AbstractC22712.m51193(i, i2, bArr) & this.f32160;
        C7795 c7795 = this.f32159[iM51193];
        C7795 c7796 = c7795;
        C7795 c7797 = null;
        while (c7795 != null) {
            C18982 c18982 = (C18982) c7795.get();
            if (c18982 != null) {
                byte[] bArr2 = c18982.f61529;
                if (bArr2.length == i2 && AbstractC22712.m51192(0, bArr2, i, bArr, i2)) {
                    return c18982;
                }
                c7797 = c7795;
            } else if (c7796 == c7795) {
                C7795[] c7795Arr = this.f32159;
                C7795 c7798 = c7795.f25899;
                c7795Arr[iM51193] = c7798;
                c7796 = c7798;
            } else if (c7797 != null) {
                c7797.f25899 = c7795.f25899;
            } else {
                C11972.m30024("previousNonNullTableEntry cannot be null here.");
                throw null;
            }
            c7795 = c7795.f25899;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        int i3 = this.f32161;
        this.f32161 = i3 + 1;
        C18982 c18983 = new C18982(this, bArr3, i3);
        C7795 c7799 = new C7795(c18983);
        if (c7797 == null) {
            this.f32159[iM51193] = c7799;
            return c18983;
        }
        if (c7797.f25899 != null) {
            C11972.m30024("previousNonNullTableEntry.next must be null.");
            throw null;
        }
        c7797.f25899 = c7799;
        return c18983;
    }

    @Override // l.AbstractC22712
    /* JADX INFO: renamed from: ۙ */
    public final void mo2070() {
        this.f32159 = null;
    }
}
