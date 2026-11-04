package l;

/* JADX INFO: renamed from: l.ۗ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3068 implements InterfaceC16492 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24698 f9946;

    public C3068() {
        C24698 c24698 = new C24698();
        this.f9946 = c24698;
        c24698.m55049();
    }

    @Override // l.InterfaceC16492
    public final void add(int i) {
        C24698 c24698 = this.f9946;
        int iM55043 = c24698.m55043(i);
        if (iM55043 < 0) {
            c24698.m55047(-(iM55043 + 1), i);
        }
    }

    @Override // l.InterfaceC16492
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10004(int i) {
        int iM55043 = this.f9946.m55043(i);
        if (iM55043 < 0) {
            iM55043 = -1;
        }
        return iM55043 >= 0;
    }

    @Override // l.InterfaceC16492
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10003(InterfaceC16492 interfaceC16492) {
        boolean z = interfaceC16492 instanceof C3068;
        int iM14323 = 0;
        C24698 c24698 = this.f9946;
        if (z) {
            C24698 c24699 = ((C3068) interfaceC16492).f9946;
            int size = c24698.size();
            int size2 = c24699.size();
            int i = 0;
            while (iM14323 < size2 && i < size) {
                while (iM14323 < size2 && c24699.get(iM14323) < c24698.get(i)) {
                    add(c24699.get(iM14323));
                    iM14323++;
                }
                if (iM14323 == size2) {
                    break;
                }
                while (i < size && c24699.get(iM14323) >= c24698.get(i)) {
                    i++;
                }
            }
            while (iM14323 < size2) {
                add(c24699.get(iM14323));
                iM14323++;
            }
            c24698.m55049();
            return;
        }
        if (interfaceC16492 instanceof C13770) {
            C13770 c13770 = (C13770) interfaceC16492;
            while (iM14323 >= 0) {
                c24698.add(iM14323);
                iM14323 = C4560.m14323(iM14323 + 1, c13770.f43708);
            }
            c24698.m55049();
            return;
        }
        InterfaceC11271 it = interfaceC16492.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // l.InterfaceC16492
    public final int elements() {
        return this.f9946.size();
    }

    @Override // l.InterfaceC16492
    public final InterfaceC11271 iterator() {
        return new C23206(this);
    }

    public final String toString() {
        return this.f9946.toString();
    }
}
