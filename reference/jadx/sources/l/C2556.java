package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B08 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2556 extends AbstractC1541 {
    @Override // l.AbstractC1541
    /* JADX INFO: renamed from: ۙ */
    public final void mo5317(C5379 c5379) throws IOException {
        if (c5379 instanceof C14118) {
            ((C14118) c5379).getClass();
            throw null;
        }
        int iM14912 = c5379.f18593;
        if (iM14912 == 0) {
            iM14912 = c5379.m14912();
        }
        if (iM14912 == 13) {
            c5379.f18593 = 9;
        } else if (iM14912 == 12) {
            c5379.f18593 = 8;
        } else {
            if (iM14912 != 14) {
                throw c5379.m14905("a name");
            }
            c5379.f18593 = 10;
        }
    }
}
