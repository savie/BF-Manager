package l;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۚۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C5395 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        c21362.m48588((BigInteger) obj);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        if (c4208.m13438() == EnumC14648.NULL) {
            c4208.m13444();
            return null;
        }
        String strM13453 = c4208.m13453();
        try {
            return C10680.m27227(strM13453);
        } catch (NumberFormatException e) {
            StringBuilder sbM51387 = C22783.m51387("Failed parsing '", strM13453, "' as BigInteger; at path ");
            sbM51387.append(c4208.m13451());
            throw new C7367(sbM51387.toString(), e);
        }
    }
}
