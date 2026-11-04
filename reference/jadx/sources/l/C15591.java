package l;

/* JADX INFO: renamed from: l.ܳ᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15591 extends AbstractC10172 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 f50693;

    public C15591(InterfaceC11050 interfaceC11050) {
        super(4, (interfaceC11050.size() * 2) + 4);
        this.f50693 = interfaceC11050;
    }

    public final int hashCode() {
        C13705 c13705 = C13705.f43487;
        InterfaceC11050 interfaceC11050 = this.f50693;
        int size = interfaceC11050.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + interfaceC11050.getType(i).hashCode();
        }
        return iHashCode;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_TYPE_LIST;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C20067 c20067M27694 = c10918.m27694();
        InterfaceC11050 interfaceC11050 = this.f50693;
        int size = interfaceC11050.size();
        for (int i = 0; i < size; i++) {
            c20067M27694.m46188(interfaceC11050.getType(i));
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۧ */
    public final String mo1456() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 m37323() {
        return this.f50693;
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1457(C10918 c10918, C15000 c15000) {
        C20067 c20067M27694 = c10918.m27694();
        InterfaceC11050 interfaceC11050 = this.f50693;
        int size = interfaceC11050.size();
        if (c15000.m36116()) {
            c15000.m36111(0, m26281() + " type_list");
            c15000.m36111(4, "  size: ".concat(C5306.m15938(size)));
            for (int i = 0; i < size; i++) {
                C5085 type = interfaceC11050.getType(i);
                c15000.m36111(2, EnumC7687.f25319 + C5306.m15934(c20067M27694.m46184(type)) + " // " + type.mo1843());
            }
        }
        c15000.m36124(size);
        for (int i2 = 0; i2 < size; i2++) {
            c15000.m36123(c20067M27694.m46184(interfaceC11050.getType(i2)));
        }
    }

    @Override // l.AbstractC10172
    /* JADX INFO: renamed from: ۙ */
    public final int mo15563(AbstractC10172 abstractC10172) {
        InterfaceC11050 interfaceC11050 = ((C15591) abstractC10172).f50693;
        C13705 c13705 = C13705.f43487;
        InterfaceC11050 interfaceC11051 = this.f50693;
        int size = interfaceC11051.size();
        int size2 = interfaceC11050.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC11051.getType(i).compareTo(interfaceC11050.getType(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }
}
