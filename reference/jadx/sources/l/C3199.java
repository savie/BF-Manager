package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3199 extends AbstractC2671 {
    @Override // l.AbstractC2671
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC4691 mo1664(AbstractC15877 abstractC15877, byte[] bArr) {
        return m10533(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12148 m10533(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        try {
            C10128 c10128 = new C10128(this.f8490, bArr);
            try {
                Iterator it = c10128.iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC4691) it.next());
                }
                c10128.close();
                return new C12148(arrayList, bArr);
            } catch (Throwable th) {
                try {
                    c10128.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C9382(e, "Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]);
        }
    }
}
