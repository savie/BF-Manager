package l;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: renamed from: l.ۚ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public class C5028 extends AbstractC7186 {
    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) throws IOException {
        c1145.m4212(((Currency) obj).getCurrencyCode());
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) throws IOException {
        String strM14922 = c5379.m14922();
        try {
            return Currency.getInstance(strM14922);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM30914 = C12441.m30914("Failed parsing '", strM14922, "' as Currency; at path ");
            sbM30914.append(c5379.m14928());
            throw new C22003(sbM30914.toString(), e);
        }
    }
}
