package l;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0938 extends AbstractC9032 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9927 f3739;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC9032 f3740;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f3741;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f3742;

    public C0938(AbstractC14676 abstractC14676, byte[] bArr, C9927 c9927) {
        super(abstractC14676);
        this.f3741 = true;
        this.f3742 = bArr;
        this.f3739 = c9927;
        this.f3740 = null;
    }

    @Override // l.AbstractC9032
    public final Object getValue() {
        return m3697();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m3699() {
        return this.f30834.m35212();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((C4466) m3698(AbstractC14676.f47976)).iterator();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC9032 m3697() {
        AbstractC9032 abstractC9032 = this.f3740;
        if (abstractC9032 != null) {
            return abstractC9032;
        }
        try {
            C23143 c23143 = new C23143(this.f3739, this.f3742);
            try {
                AbstractC9032 object = c23143.readObject();
                c23143.close();
                return object;
            } catch (Throwable th) {
                try {
                    c23143.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C21731(e, "Could not parse the inputstream", new Object[0]);
        } catch (C21731 e2) {
            throw new C21731(e2, "Unable to parse the explicit Tagged Object with %s, it might be implicit", this.f30834);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC9032 m3698(AbstractC14676 abstractC14676) {
        AbstractC9032 abstractC9032 = this.f3740;
        if (abstractC9032 != null && abstractC9032.m23364().equals(abstractC14676)) {
            return abstractC9032;
        }
        if (abstractC9032 == null && this.f3742 != null) {
            return abstractC14676.mo2657(this.f3739).mo1600(abstractC14676, this.f3742);
        }
        throw new C21731("Unable to parse the implicit Tagged Object with %s, it is explicit", abstractC14676);
    }

    @Override // l.AbstractC9032
    public final String toString() {
        StringBuilder sb = new StringBuilder("ASN1TaggedObject[");
        sb.append(this.f30834);
        AbstractC9032 abstractC9032 = this.f3740;
        if (abstractC9032 != null) {
            sb.append(",");
            sb.append(abstractC9032);
        } else {
            sb.append(",<unknown>");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0938(AbstractC14676 abstractC14676, AbstractC9032 abstractC9032, boolean z) {
        AbstractC14676 abstractC14676M35210;
        if (!z) {
            abstractC14676M35210 = abstractC14676.m35210(abstractC9032.m23364().m35211());
        } else {
            abstractC14676M35210 = abstractC14676.m35210(EnumC19615.CONSTRUCTED);
        }
        super(abstractC14676M35210);
        this.f3740 = abstractC9032;
        this.f3741 = z;
        this.f3742 = null;
    }
}
