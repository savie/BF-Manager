package l;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: renamed from: l.᩵ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public class C20311 extends AbstractC17567 {
    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) throws IOException {
        c21362.m48602(((Currency) obj).getCurrencyCode());
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) throws IOException {
        String strM13453 = c4208.m13453();
        try {
            return Currency.getInstance(strM13453);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM51387 = C22783.m51387("Failed parsing '", strM13453, "' as Currency; at path ");
            sbM51387.append(c4208.m13451());
            throw new C7367(sbM51387.toString(), e);
        }
    }
}
