package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19257 extends AbstractC17762 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f62198;

    public C19257(String str, String str2) {
        super(str, str2);
        this.f62198 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44200(int i, C15070 c15070) {
        this.f62198.add(new C8674(i, c15070));
    }

    @Override // l.InterfaceC14900
    /* JADX INFO: renamed from: ۟ */
    public final int mo8712() {
        return this.f62198.size();
    }

    @Override // l.InterfaceC14900
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC21249 mo8713(int i) {
        return (InterfaceC21249) this.f62198.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44201(InterfaceC16662 interfaceC16662) {
        Iterator it = m41318().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += (((C15070) ((C8674) it.next()).mo42827()).size() * 4) + 16;
        }
        interfaceC16662.mo24505((short) 516);
        interfaceC16662.mo24505((short) 1032);
        interfaceC16662.writeInt(size + 1032);
        interfaceC16662.mo24502(256, getName());
        interfaceC16662.mo24502(256, mo35622());
        for (C8674 c8674 : m41318()) {
            InterfaceC10609 interfaceC10609Mo42827 = c8674.mo42827();
            interfaceC16662.mo24505((short) 517);
            interfaceC16662.mo24505((short) 16);
            C15070 c15070 = (C15070) interfaceC10609Mo42827;
            interfaceC16662.writeInt((c15070.size() * 4) + 16);
            interfaceC16662.writeInt(c8674.mo42826());
            interfaceC16662.writeInt(c15070.size());
            for (int i = 0; i < c15070.size(); i++) {
                interfaceC16662.writeInt(c15070.getInt(i));
            }
        }
    }
}
