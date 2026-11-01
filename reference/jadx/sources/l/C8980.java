package l;

/* JADX INFO: renamed from: l.ۡܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: C43R */
/* JADX INFO: loaded from: classes3.dex */
public final class C8980 extends AbstractC6302 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f30747;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8274[] f30748;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30749;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C8980 m23290(C23942 c23942) {
        C8980 c8980 = new C8980(c23942);
        c8980.f30749 = EnumC23529.f76192;
        c8980.f30748 = new C8274[32768];
        return c8980;
    }

    @Override // l.AbstractC6302
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11242 mo17390(char[] cArr, int i) {
        byte[] bArr = new byte[i * 3];
        return mo17388(0, C17281.m40238(bArr, 0, i, cArr), bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC6302
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11242 mo17388(int i, int i2, byte[] bArr) {
        int iM17387 = AbstractC6302.m17387(i, i2, bArr) & this.f30749;
        C8274 c8274 = this.f30748[iM17387];
        C8274 c8275 = c8274;
        C8274 c8276 = null;
        while (c8274 != null) {
            C19563 c19563 = (C19563) c8274.get();
            if (c19563 != null) {
                byte[] bArr2 = c19563.f62867;
                if (bArr2.length == i2 && AbstractC6302.m17386(0, bArr2, i, bArr, i2)) {
                    return c19563;
                }
                c8276 = c8274;
            } else if (c8275 == c8274) {
                C8274[] c8274Arr = this.f30748;
                C8274 c8277 = c8274.f28761;
                c8274Arr[iM17387] = c8277;
                c8275 = c8277;
            } else if (c8276 != null) {
                c8276.f28761 = c8274.f28761;
            } else {
                C6171.m17174("previousNonNullTableEntry cannot be null here.");
                throw null;
            }
            c8274 = c8274.f28761;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        int i3 = this.f30747;
        this.f30747 = i3 + 1;
        C19563 c19564 = new C19563(this, bArr3, i3);
        C8274 c8278 = new C8274(c19564);
        if (c8276 == null) {
            this.f30748[iM17387] = c8278;
            return c19564;
        }
        if (c8276.f28761 != null) {
            C6171.m17174("previousNonNullTableEntry.next must be null.");
            throw null;
        }
        c8276.f28761 = c8278;
        return c19564;
    }

    @Override // l.AbstractC6302
    /* JADX INFO: renamed from: ۙ */
    public final void mo17391() {
        this.f30748 = null;
    }
}
