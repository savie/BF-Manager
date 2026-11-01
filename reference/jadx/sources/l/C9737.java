package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9737 extends AbstractC18203 {
    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC9032 mo1600(AbstractC14676 abstractC14676, byte[] bArr) {
        return m24692(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4466 m24692(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        try {
            C23143 c23143 = new C23143(this.f58149, bArr);
            try {
                Iterator it = c23143.iterator();
                while (it.hasNext()) {
                    arrayList.add((AbstractC9032) it.next());
                }
                c23143.close();
                return new C4466(arrayList, bArr);
            } catch (Throwable th) {
                try {
                    c23143.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C21731(e, "Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]);
        }
    }
}
