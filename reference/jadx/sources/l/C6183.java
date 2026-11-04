package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C6183 extends AbstractC2671 {
    @Override // l.AbstractC2671
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC4691 mo1664(AbstractC15877 abstractC15877, byte[] bArr) {
        return m17823(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3945 m17823(byte[] bArr) {
        HashSet hashSet = new HashSet();
        try {
            C10128 c10128 = new C10128(this.f8490, bArr);
            try {
                Iterator it = c10128.iterator();
                while (it.hasNext()) {
                    hashSet.add((AbstractC4691) it.next());
                }
                c10128.close();
                return new C3945(hashSet, bArr);
            } catch (Throwable th) {
                try {
                    c10128.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C9382(e, "Could not parse ASN.1 SET contents.", new Object[0]);
        }
    }
}
