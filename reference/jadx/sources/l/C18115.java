package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18115 extends AbstractC4691 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f59275;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC4691 f59276;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1112 f59277;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f59278;

    public C18115(AbstractC15877 abstractC15877, byte[] bArr, C1112 c1112) {
        super(abstractC15877);
        this.f59275 = true;
        this.f59278 = bArr;
        this.f59277 = c1112;
        this.f59276 = null;
    }

    @Override // l.AbstractC4691
    public final Object getValue() {
        return m42236();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m42235() {
        return this.f16567.m37846();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((C12148) m42234(AbstractC15877.f51628)).iterator();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC4691 m42236() {
        AbstractC4691 abstractC4691 = this.f59276;
        if (abstractC4691 != null) {
            return abstractC4691;
        }
        try {
            C10128 c10128 = new C10128(this.f59277, this.f59278);
            try {
                AbstractC4691 object = c10128.readObject();
                c10128.close();
                return object;
            } catch (Throwable th) {
                try {
                    c10128.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C9382(e, "Could not parse the inputstream", new Object[0]);
        } catch (C9382 e2) {
            throw new C9382(e2, "Unable to parse the explicit Tagged Object with %s, it might be implicit", this.f16567);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC4691 m42234(AbstractC15877 abstractC15877) {
        AbstractC4691 abstractC4691 = this.f59276;
        if (abstractC4691 != null && abstractC4691.m14567().equals(abstractC15877)) {
            return abstractC4691;
        }
        if (abstractC4691 == null && this.f59278 != null) {
            return abstractC15877.mo6071(this.f59277).mo1664(abstractC15877, this.f59278);
        }
        throw new C9382("Unable to parse the implicit Tagged Object with %s, it is explicit", abstractC15877);
    }

    @Override // l.AbstractC4691
    public final String toString() {
        StringBuilder sb = new StringBuilder("ASN1TaggedObject[");
        sb.append(this.f16567);
        AbstractC4691 abstractC4691 = this.f59276;
        if (abstractC4691 != null) {
            sb.append(",");
            sb.append(abstractC4691);
        } else {
            sb.append(",<unknown>");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18115(AbstractC15877 abstractC15877, AbstractC4691 abstractC4691, boolean z) {
        AbstractC15877 abstractC15877M37845;
        if (!z) {
            abstractC15877M37845 = abstractC15877.m37845(abstractC4691.m14567().m37844());
        } else {
            abstractC15877M37845 = abstractC15877.m37845(EnumC13857.CONSTRUCTED);
        }
        super(abstractC15877M37845);
        this.f59276 = abstractC4691;
        this.f59275 = z;
        this.f59278 = null;
    }
}
