package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9QF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20668 extends AbstractC15647 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f67255 = new ArrayList();

    @Override // l.InterfaceC18427
    /* JADX INFO: renamed from: ۘ */
    public final int mo14889() {
        return this.f67255.size();
    }

    @Override // l.InterfaceC18427
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC7844 mo14890(int i) {
        return (InterfaceC7844) this.f67255.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46514(int i, int i2) {
        this.f67255.add(new C15730(i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46515(InterfaceC16662 interfaceC16662) {
        interfaceC16662.mo24505((short) 518);
        interfaceC16662.mo24505((short) 12);
        ArrayList arrayList = this.f67255;
        interfaceC16662.writeInt((arrayList.size() * 8) + 12);
        interfaceC16662.writeInt(arrayList.size());
        for (C15730 c15730 : m37322()) {
            interfaceC16662.writeInt(c15730.mo20683());
            interfaceC16662.writeInt(c15730.mo20682());
        }
    }
}
