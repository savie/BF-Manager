package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9QE */
/* JADX INFO: loaded from: classes3.dex */
public final class C2118 extends AbstractC5935 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f6998;

    public C2118(String str, String str2) {
        super(str, str2);
        this.f6998 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7298(int i, C14763 c14763) {
        this.f6998.add(new C11812(i, c14763));
    }

    @Override // l.InterfaceC4904
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int mo7301() {
        return this.f6998.size();
    }

    @Override // l.InterfaceC4904
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22058 mo7300(int i) {
        return (InterfaceC22058) this.f6998.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7299(InterfaceC23332 interfaceC23332) {
        Iterator it = m17249().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += (((C14763) ((C11812) it.next()).mo7534()).size() * 4) + 16;
        }
        interfaceC23332.mo17788((short) 516);
        interfaceC23332.mo17788((short) 1032);
        interfaceC23332.writeInt(size + 1032);
        interfaceC23332.mo17783(256, getName());
        interfaceC23332.mo17783(256, mo15048());
        for (C11812 c11812 : m17249()) {
            InterfaceC9018 interfaceC9018Mo7534 = c11812.mo7534();
            interfaceC23332.mo17788((short) 517);
            interfaceC23332.mo17788((short) 16);
            C14763 c14763 = (C14763) interfaceC9018Mo7534;
            interfaceC23332.writeInt((c14763.size() * 4) + 16);
            interfaceC23332.writeInt(c11812.mo7535());
            interfaceC23332.writeInt(c14763.size());
            for (int i = 0; i < c14763.size(); i++) {
                interfaceC23332.writeInt(c14763.getInt(i));
            }
        }
    }
}
