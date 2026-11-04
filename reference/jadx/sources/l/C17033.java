package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9QF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17033 extends AbstractC3697 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f55654 = new ArrayList();

    @Override // l.InterfaceC22804
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo40124() {
        return this.f55654.size();
    }

    @Override // l.InterfaceC22804
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC19820 mo40127(int i) {
        return (InterfaceC19820) this.f55654.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40125(int i, int i2) {
        this.f55654.add(new C17779(i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40126(InterfaceC23332 interfaceC23332) {
        interfaceC23332.mo17788((short) 518);
        interfaceC23332.mo17788((short) 12);
        ArrayList arrayList = this.f55654;
        interfaceC23332.writeInt((arrayList.size() * 8) + 12);
        interfaceC23332.writeInt(arrayList.size());
        for (C17779 c17779 : m12014()) {
            interfaceC23332.writeInt(c17779.mo45587());
            interfaceC23332.writeInt(c17779.mo45586());
        }
    }
}
