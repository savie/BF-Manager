package l;

/* JADX INFO: renamed from: l.ᩳᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18241 implements InterfaceC6952 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4129 f58230;

    public C18241() {
        C4129 c4129 = new C4129();
        this.f58230 = c4129;
        c4129.m11756();
    }

    @Override // l.InterfaceC6952
    public final void add(int i) {
        C4129 c4129 = this.f58230;
        int iM11755 = c4129.m11755(i);
        if (iM11755 < 0) {
            c4129.m11760(-(iM11755 + 1), i);
        }
    }

    @Override // l.InterfaceC6952
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6408(int i) {
        int iM11755 = this.f58230.m11755(i);
        if (iM11755 < 0) {
            iM11755 = -1;
        }
        return iM11755 >= 0;
    }

    @Override // l.InterfaceC6952
    /* JADX INFO: renamed from: ۙ */
    public final void mo6407(InterfaceC6952 interfaceC6952) {
        boolean z = interfaceC6952 instanceof C18241;
        int iM24745 = 0;
        C4129 c4129 = this.f58230;
        if (z) {
            C4129 c41210 = ((C18241) interfaceC6952).f58230;
            int size = c4129.size();
            int size2 = c41210.size();
            int i = 0;
            while (iM24745 < size2 && i < size) {
                while (iM24745 < size2 && c41210.get(iM24745) < c4129.get(i)) {
                    add(c41210.get(iM24745));
                    iM24745++;
                }
                if (iM24745 == size2) {
                    break;
                }
                while (i < size && c41210.get(iM24745) >= c4129.get(i)) {
                    i++;
                }
            }
            while (iM24745 < size2) {
                add(c41210.get(iM24745));
                iM24745++;
            }
            c4129.m11756();
            return;
        }
        if (interfaceC6952 instanceof C1991) {
            C1991 c1991 = (C1991) interfaceC6952;
            while (iM24745 >= 0) {
                c4129.add(iM24745);
                iM24745 = C9754.m24745(iM24745 + 1, c1991.f7444);
            }
            c4129.m11756();
            return;
        }
        InterfaceC13303 it = interfaceC6952.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // l.InterfaceC6952
    public final int elements() {
        return this.f58230.size();
    }

    @Override // l.InterfaceC6952
    public final InterfaceC13303 iterator() {
        return new C21769(this);
    }

    public final String toString() {
        return this.f58230.toString();
    }
}
