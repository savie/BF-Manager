package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6AJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7318 extends C4335 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f24107;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24108;

    @Override // l.C4335, l.AbstractC19734
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2720() {
    }

    public C7318(C22718 c22718, int i, InterfaceC0846 interfaceC0846) {
        super(c22718, i, interfaceC0846);
        int iM51248 = c22718.m51248(i);
        this.f24108 = new ArrayList();
        if (iM51248 >= 0) {
            for (InterfaceC3939 interfaceC3939 : interfaceC0846.mo20143()) {
                this.f24108.add(new C9554(interfaceC3939.getKey(), c22718.m51246().m27487(new C4818(c22718.f73734, interfaceC3939.getOffset() + iM51248, "sswitch_"))));
            }
            return;
        }
        this.f24107 = true;
        for (InterfaceC3939 interfaceC39310 : interfaceC0846.mo20143()) {
            this.f24108.add(new C2843(interfaceC39310.getKey(), interfaceC39310.getOffset()));
        }
    }

    @Override // l.C4335, l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        if (this.f24107) {
            c2161 = new C19997(c2161);
        }
        boolean z = this.f15699.f73734.f19336;
        c2161.getClass();
        c2161.write(".sparse-switch\n", 0, 15);
        c2161.m7439();
        for (AbstractC8809 abstractC8809 : this.f24108) {
            C1835.m6335(c2161, abstractC8809.m23648());
            c2161.write(" -> ", 0, 4);
            abstractC8809.mo9352(c2161);
            if (z) {
                m13831(c2161, abstractC8809.m23648());
            }
            c2161.write(10);
        }
        c2161.m7435();
        c2161.write(".end sparse-switch", 0, 18);
        return true;
    }
}
