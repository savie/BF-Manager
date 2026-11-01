package l;

import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I67E */
/* JADX INFO: loaded from: classes3.dex */
public final class C3096 extends C14075 {
    @Override // l.C14075, l.AbstractC7724
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo9290() {
    }

    @Override // l.C14075, l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        int iMo16087 = ((InterfaceC23031) this.f46227).mo16087();
        c12283.getClass();
        c12283.write(".array-data ", 0, 12);
        c12283.m30529(((InterfaceC23031) this.f46227).mo16087());
        c12283.write(10);
        c12283.m30527();
        List<Number> listMo16088 = ((InterfaceC23031) this.f46227).mo16088();
        String str = iMo16087 != 1 ? iMo16087 != 2 ? "" : am.aB : am.aI;
        boolean z = this.f46226.f36110.f66203;
        for (Number number : listMo16088) {
            C16896.m39570(c12283, number.longValue());
            c12283.write(str, 0, str.length());
            if (z) {
                if (iMo16087 == 8) {
                    C14075.m34038(c12283, number.longValue());
                } else if (iMo16087 == 4) {
                    int iIntValue = number.intValue();
                    if (!m34043(c12283, iIntValue)) {
                        C14075.m34040(c12283, iIntValue);
                    }
                }
            }
            c12283.write("\n", 0, 1);
        }
        c12283.m30526();
        c12283.write(".end array-data", 0, 15);
        return true;
    }
}
