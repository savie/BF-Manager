package l;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩺ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public class C24041 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c21362.m48585();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c21362.m48601(bitSet.get(i) ? 1L : 0L);
        }
        c21362.m48594();
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        BitSet bitSet = new BitSet();
        c4208.m13441();
        EnumC14648 enumC14648M13438 = c4208.m13438();
        int i = 0;
        while (enumC14648M13438 != EnumC14648.END_ARRAY) {
            int i2 = C7632.f25181[enumC14648M13438.ordinal()];
            boolean zM13440 = true;
            if (i2 == 1 || i2 == 2) {
                int iM13455 = c4208.m13455();
                if (iM13455 == 0) {
                    zM13440 = false;
                } else if (iM13455 != 1) {
                    StringBuilder sbM12235 = C3769.m12235(iM13455, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM12235.append(c4208.m13451());
                    throw new C7367(sbM12235.toString());
                }
            } else {
                if (i2 != 3) {
                    throw new C7367("Invalid bitset value type: " + enumC14648M13438 + "; at path " + c4208.m13443());
                }
                zM13440 = c4208.m13440();
            }
            if (zM13440) {
                bitSet.set(i);
            }
            i++;
            enumC14648M13438 = c4208.m13438();
        }
        c4208.m13449();
        return bitSet;
    }
}
