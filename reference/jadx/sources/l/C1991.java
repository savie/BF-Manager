package l;

/* JADX INFO: renamed from: l.֫ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1991 implements InterfaceC6952 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f7444;

    public C1991(int i) {
        this.f7444 = C9754.m24742(i);
    }

    @Override // l.InterfaceC6952
    public final void add(int i) {
        m6406(i);
        int[] iArr = this.f7444;
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m6406(int i) {
        int[] iArr = this.f7444;
        if (i >= iArr.length * 32) {
            int[] iArrM24742 = C9754.m24742(Math.max(i + 1, iArr.length * 64));
            int[] iArr2 = this.f7444;
            System.arraycopy(iArr2, 0, iArrM24742, 0, iArr2.length);
            this.f7444 = iArrM24742;
        }
    }

    @Override // l.InterfaceC6952
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo6408(int i) {
        int[] iArr = this.f7444;
        return i < iArr.length * 32 && C9754.m24744(i, iArr);
    }

    @Override // l.InterfaceC6952
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6407(InterfaceC6952 interfaceC6952) {
        int i = 0;
        if (interfaceC6952 instanceof C1991) {
            C1991 c1991 = (C1991) interfaceC6952;
            m6406((c1991.f7444.length * 32) + 1);
            int[] iArr = this.f7444;
            int[] iArr2 = c1991.f7444;
            while (i < iArr2.length) {
                iArr[i] = iArr[i] | iArr2[i];
                i++;
            }
            return;
        }
        if (interfaceC6952 instanceof C18241) {
            C4129 c4129 = ((C18241) interfaceC6952).f58230;
            int size = c4129.size();
            if (size > 0) {
                m6406(c4129.get(size - 1));
            }
            while (i < c4129.size()) {
                int[] iArr3 = this.f7444;
                int i2 = c4129.get(i);
                int i3 = i2 >> 5;
                iArr3[i3] = (1 << (i2 & 31)) | iArr3[i3];
                i++;
            }
            return;
        }
        InterfaceC13303 it = interfaceC6952.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // l.InterfaceC6952
    public final int elements() {
        int iBitCount = 0;
        for (int i : this.f7444) {
            iBitCount += Integer.bitCount(i);
        }
        return iBitCount;
    }

    @Override // l.InterfaceC6952
    public final InterfaceC13303 iterator() {
        return new C14693(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int iM24745 = C9754.m24745(0, this.f7444);
        boolean z = true;
        while (iM24745 >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iM24745);
            iM24745 = C9754.m24745(iM24745 + 1, this.f7444);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
