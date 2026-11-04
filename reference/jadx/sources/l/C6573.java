package l;

import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۛᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67E */
/* JADX INFO: loaded from: classes3.dex */
public final class C6573 extends C4335 {
    @Override // l.C4335, l.AbstractC19734
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2720() {
    }

    @Override // l.C4335, l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        int iMo3032 = ((InterfaceC9904) this.f15700).mo3032();
        c2161.getClass();
        c2161.write(".array-data ", 0, 12);
        c2161.m7440(((InterfaceC9904) this.f15700).mo3032());
        c2161.write(10);
        c2161.m7439();
        List<Number> listMo3034 = ((InterfaceC9904) this.f15700).mo3034();
        String str = iMo3032 != 1 ? iMo3032 != 2 ? "" : am.aB : am.aI;
        boolean z = this.f15699.f73734.f19336;
        for (Number number : listMo3034) {
            C11529.m29030(c2161, number.longValue());
            c2161.write(str, 0, str.length());
            if (z) {
                if (iMo3032 == 8) {
                    C4335.m13828(c2161, number.longValue());
                } else if (iMo3032 == 4) {
                    int iIntValue = number.intValue();
                    if (!m13831(c2161, iIntValue)) {
                        C4335.m13830(c2161, iIntValue);
                    }
                }
            }
            c2161.write("\n", 0, 1);
        }
        c2161.m7435();
        c2161.write(".end array-data", 0, 15);
        return true;
    }
}
