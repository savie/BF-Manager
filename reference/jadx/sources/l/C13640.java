package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13640 extends AbstractC18203 {
    @Override // l.AbstractC18203
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ AbstractC9032 mo1600(AbstractC14676 abstractC14676, byte[] bArr) {
        return m33340(bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2349 m33340(byte[] bArr) {
        HashSet hashSet = new HashSet();
        try {
            C23143 c23143 = new C23143(this.f58149, bArr);
            try {
                Iterator it = c23143.iterator();
                while (it.hasNext()) {
                    hashSet.add((AbstractC9032) it.next());
                }
                c23143.close();
                return new C2349(hashSet, bArr);
            } catch (Throwable th) {
                try {
                    c23143.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C21731(e, "Could not parse ASN.1 SET contents.", new Object[0]);
        }
    }
}
