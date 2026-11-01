package l;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۘ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public class C3616 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c1145.m4200();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c1145.m4211(bitSet.get(i) ? 1L : 0L);
        }
        c1145.m4199();
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        BitSet bitSet = new BitSet();
        c5379.m14913();
        EnumC22313 enumC22313M14916 = c5379.m14916();
        int i = 0;
        while (enumC22313M14916 != EnumC22313.END_ARRAY) {
            int i2 = C17728.f56266[enumC22313M14916.ordinal()];
            boolean zM14927 = true;
            if (i2 == 1 || i2 == 2) {
                int iM14926 = c5379.m14926();
                if (iM14926 == 0) {
                    zM14927 = false;
                } else if (iM14926 != 1) {
                    StringBuilder sbM40153 = C17214.m40153(iM14926, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM40153.append(c5379.m14928());
                    throw new C22003(sbM40153.toString());
                }
            } else {
                if (i2 != 3) {
                    throw new C22003("Invalid bitset value type: " + enumC22313M14916 + "; at path " + c5379.m14919());
                }
                zM14927 = c5379.m14927();
            }
            if (zM14927) {
                bitSet.set(i);
            }
            i++;
            enumC22313M14916 = c5379.m14916();
        }
        c5379.m14929();
        return bitSet;
    }
}
