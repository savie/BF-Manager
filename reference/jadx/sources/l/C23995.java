package l;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩻᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes.dex */
public class C23995 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        c1145.m4203((BigInteger) obj);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        if (c5379.m14916() == EnumC22313.NULL) {
            c5379.m14918();
            return null;
        }
        String strM14922 = c5379.m14922();
        try {
            return C12914.m31998(strM14922);
        } catch (NumberFormatException e) {
            StringBuilder sbM30914 = C12441.m30914("Failed parsing '", strM14922, "' as BigInteger; at path ");
            sbM30914.append(c5379.m14928());
            throw new C22003(sbM30914.toString(), e);
        }
    }
}
