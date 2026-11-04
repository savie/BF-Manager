package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R69D */
/* JADX INFO: loaded from: classes3.dex */
public final class C1352 extends C4335 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f4828;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f4829;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f4830;

    @Override // l.C4335, l.AbstractC19734
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2720() {
    }

    public C1352(C22718 c22718, int i, InterfaceC9794 interfaceC9794) {
        int key;
        super(c22718, i, interfaceC9794);
        int iM51244 = c22718.m51244(i);
        this.f4829 = new ArrayList();
        boolean z = true;
        if (iM51244 >= 0) {
            key = 0;
            boolean z2 = true;
            for (InterfaceC3939 interfaceC3939 : interfaceC9794.mo20143()) {
                if (z2) {
                    key = interfaceC3939.getKey();
                    z2 = false;
                }
                C4818 c4818M27487 = c22718.m51246().m27487(new C4818(c22718.f73734, interfaceC3939.getOffset() + iM51244, "pswitch_"));
                if (c4818M27487.m14848()) {
                    c4818M27487.m14844(String.format("%s, 0x%x", c4818M27487.m14846(), Integer.valueOf(interfaceC3939.getKey())));
                } else {
                    c4818M27487.m14844(String.format("0x%x", Integer.valueOf(interfaceC3939.getKey())));
                }
                this.f4829.add(new C8064(c4818M27487));
            }
        } else {
            this.f4828 = true;
            key = 0;
            for (InterfaceC3939 interfaceC39310 : interfaceC9794.mo20143()) {
                if (z) {
                    key = interfaceC39310.getKey();
                    z = false;
                }
                this.f4829.add(new C19251(interfaceC39310.getOffset()));
            }
        }
        this.f4830 = key;
    }

    @Override // l.C4335, l.AbstractC19734
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4982(C2161 c2161) throws IOException {
        if (this.f4828) {
            c2161 = new C19997(c2161);
        }
        c2161.getClass();
        c2161.write(".packed-switch ", 0, 15);
        int i = this.f4830;
        C1835.m6335(c2161, i);
        c2161.m7439();
        c2161.write(10);
        boolean z = this.f15699.f73734.f19336;
        for (AbstractC10300 abstractC10300 : this.f4829) {
            if (abstractC10300 instanceof C8064) {
                ((C8064) abstractC10300).f26690.m14847(c2161);
            } else {
                abstractC10300.mo21959(c2161);
            }
            String str = String.format("  #%08x", Integer.valueOf(i));
            c2161.write(str, 0, str.length());
            if (z) {
                m13831(c2161, i);
            }
            c2161.write(10);
            i++;
        }
        c2161.m7435();
        c2161.write(".end packed-switch", 0, 18);
        return true;
    }
}
