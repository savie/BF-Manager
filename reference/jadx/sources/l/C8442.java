package l;

/* JADX INFO: renamed from: l.۠᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O9YQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8442 implements InterfaceC7778 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19025[] f29298;

    @Override // l.InterfaceC7778
    /* JADX INFO: renamed from: ۙ */
    public final int mo1805(int i, int i2, byte[] bArr) throws C2796 {
        C4850.m13545(i + 2, bArr);
        int iM13549 = C4850.m13549(i + 4, bArr);
        int iM135410 = C4850.m13549(i + 8, bArr);
        C4850.m13549(i + 12, bArr);
        int iM135411 = C4850.m13549(i + 16, bArr);
        if (iM13549 > 0) {
            new C8775(bArr, iM13549 + i);
        }
        if (iM135410 > 0) {
            new C8775(bArr, iM135410 + i);
        }
        int iMo1805 = i + iM135411;
        if (iM135411 > 0) {
            C4850.m13545(iMo1805 + 2, bArr);
            int iM135412 = C4850.m13549(iMo1805 + 4, bArr);
            iMo1805 += 8;
            if (iM135412 > 4096) {
                throw new C2796("Invalid SecurityDescriptor");
            }
            this.f29298 = new C19025[iM135412];
            for (int i3 = 0; i3 < iM135412; i3++) {
                C19025[] c19025Arr = this.f29298;
                C19025 c19025 = new C19025();
                c19025Arr[i3] = c19025;
                iMo1805 += c19025.mo1805(iMo1805, i2 - iMo1805, bArr);
            }
        } else {
            this.f29298 = null;
        }
        return iMo1805 - i;
    }

    public final String toString() {
        if (this.f29298 == null) {
            return "SecurityDescriptor:\nNULL";
        }
        String string = "SecurityDescriptor:\n";
        for (int i = 0; i < this.f29298.length; i++) {
            StringBuilder sbM23356 = C9023.m23356(string);
            sbM23356.append(this.f29298[i].toString());
            sbM23356.append("\n");
            string = sbM23356.toString();
        }
        return string;
    }
}
