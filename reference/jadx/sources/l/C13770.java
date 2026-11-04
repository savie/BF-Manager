package l;

/* JADX INFO: renamed from: l.۬ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13770 implements InterfaceC16492 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f43708;

    public C13770(int i) {
        this.f43708 = C4560.m14321(i);
    }

    @Override // l.InterfaceC16492
    public final void add(int i) {
        m33660(i);
        int[] iArr = this.f43708;
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33660(int i) {
        int[] iArr = this.f43708;
        if (i >= iArr.length * 32) {
            int[] iArrM14321 = C4560.m14321(Math.max(i + 1, iArr.length * 64));
            int[] iArr2 = this.f43708;
            System.arraycopy(iArr2, 0, iArrM14321, 0, iArr2.length);
            this.f43708 = iArrM14321;
        }
    }

    @Override // l.InterfaceC16492
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo10004(int i) {
        int[] iArr = this.f43708;
        return i < iArr.length * 32 && C4560.m14322(i, iArr);
    }

    @Override // l.InterfaceC16492
    /* JADX INFO: renamed from: ۙ */
    public final void mo10003(InterfaceC16492 interfaceC16492) {
        int i = 0;
        if (interfaceC16492 instanceof C13770) {
            C13770 c13770 = (C13770) interfaceC16492;
            m33660((c13770.f43708.length * 32) + 1);
            int[] iArr = this.f43708;
            int[] iArr2 = c13770.f43708;
            while (i < iArr2.length) {
                iArr[i] = iArr[i] | iArr2[i];
                i++;
            }
            return;
        }
        if (interfaceC16492 instanceof C3068) {
            C24698 c24698 = ((C3068) interfaceC16492).f9946;
            int size = c24698.size();
            if (size > 0) {
                m33660(c24698.get(size - 1));
            }
            while (i < c24698.size()) {
                int[] iArr3 = this.f43708;
                int i2 = c24698.get(i);
                int i3 = i2 >> 5;
                iArr3[i3] = (1 << (i2 & 31)) | iArr3[i3];
                i++;
            }
            return;
        }
        InterfaceC11271 it = interfaceC16492.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // l.InterfaceC16492
    public final int elements() {
        int iBitCount = 0;
        for (int i : this.f43708) {
            iBitCount += Integer.bitCount(i);
        }
        return iBitCount;
    }

    @Override // l.InterfaceC16492
    public final InterfaceC11271 iterator() {
        return new C7059(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int iM14323 = C4560.m14323(0, this.f43708);
        boolean z = true;
        while (iM14323 >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iM14323);
            iM14323 = C4560.m14323(iM14323 + 1, this.f43708);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
