package l;

/* JADX INFO: renamed from: l.ۖۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2283 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 f8155;

    public C2283(InterfaceC14093 interfaceC14093) {
        super(4, (interfaceC14093.size() * 2) + 4);
        this.f8155 = interfaceC14093;
    }

    public final int hashCode() {
        C9672 c9672 = C9672.f32573;
        InterfaceC14093 interfaceC14093 = this.f8155;
        int size = interfaceC14093.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + interfaceC14093.getType(i).hashCode();
        }
        return iHashCode;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_TYPE_LIST;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
        C11457 c11457M12877 = c4669.m12877();
        InterfaceC14093 interfaceC14093 = this.f8155;
        int size = interfaceC14093.size();
        for (int i = 0; i < size; i++) {
            c11457M12877.m28605(interfaceC14093.getType(i));
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String mo6991() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 m6993() {
        return this.f8155;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        C11457 c11457M12877 = c4669.m12877();
        InterfaceC14093 interfaceC14093 = this.f8155;
        int size = interfaceC14093.size();
        if (c2718.m8288()) {
            c2718.m8283(0, m30901() + " type_list");
            c2718.m8283(4, "  size: ".concat(C22475.m49978(size)));
            for (int i = 0; i < size; i++) {
                C3320 type = interfaceC14093.getType(i);
                c2718.m8283(2, EnumC19730.f63352 + C22475.m49982(c11457M12877.m28600(type)) + " // " + type.mo2376());
            }
        }
        c2718.m8289(size);
        for (int i2 = 0; i2 < size; i2++) {
            c2718.m8297(c11457M12877.m28600(interfaceC14093.getType(i2)));
        }
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo6990(AbstractC12432 abstractC12432) {
        InterfaceC14093 interfaceC14093 = ((C2283) abstractC12432).f8155;
        C9672 c9672 = C9672.f32573;
        InterfaceC14093 interfaceC14094 = this.f8155;
        int size = interfaceC14094.size();
        int size2 = interfaceC14093.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC14094.getType(i).compareTo(interfaceC14093.getType(i));
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
