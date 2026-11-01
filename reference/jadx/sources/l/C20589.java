package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9XD */
/* JADX INFO: loaded from: classes5.dex */
public class C20589 extends AbstractC16356 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f67089;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f67090;

    public C20589() {
        super(0, "NegTokenInit");
        this.f67089 = new ArrayList();
    }

    @Override // l.AbstractC16356
    /* JADX INFO: renamed from: ۙ */
    public final void mo37323(C5982 c5982) throws C0127 {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f67089;
            if (arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                AbstractC14676 abstractC14676 = AbstractC14676.f47970;
                arrayList.add(new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, 0).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) new C4466(arrayList3), true));
            }
            byte[] bArr = this.f67090;
            if (bArr != null && bArr.length > 0) {
                AbstractC14676 abstractC14677 = AbstractC14676.f47970;
                arrayList.add(new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, 2).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) new C10818(this.f67090), true));
            }
            mo37324(c5982, new C4466(arrayList));
        } catch (IOException e) {
            throw new C0127("Unable to write NegTokenInit", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46450(byte[] bArr) throws C0127 {
        try {
            C23143 c23143 = new C23143(new C8326(), new C5982(bArr).m27395());
            try {
                C0938 c0938 = (C0938) c23143.readObject();
                if (c0938.m23364().m35213() != EnumC1974.APPLICATION) {
                    throw new C0127("Incorrect GSS-API ASN.1 token received, expected to find an [APPLICATION 0], not: " + c0938);
                }
                C4466 c4466 = (C4466) c0938.m3698(AbstractC14676.f47976);
                AbstractC9032 abstractC9032 = c4466.get(0);
                if (!(abstractC9032 instanceof C15757)) {
                    throw new C0127("Expected to find the SPNEGO OID (" + C19884.f63754 + "), not: " + abstractC9032);
                }
                m38527(c4466.get(1));
                c23143.close();
            } catch (Throwable th) {
                try {
                    c23143.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C0127("Could not read NegTokenInit from buffer", e);
        }
    }

    @Override // l.AbstractC16356
    /* JADX INFO: renamed from: ۙ */
    public void mo19116(C0938 c0938) throws C0127 {
        if (c0938.m3697().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int iM3699 = c0938.m3699();
        if (iM3699 == 0) {
            m46451(c0938.m3697());
            return;
        }
        if (iM3699 != 1) {
            if (iM3699 == 2) {
                m46452(c0938.m3697());
            } else {
                if (iM3699 == 3) {
                    return;
                }
                throw new C0127("Unknown Object Tag " + c0938.m3699() + " encountered.");
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46452(AbstractC9032 abstractC9032) throws C0127 {
        if (!(abstractC9032 instanceof C10818)) {
            throw new C0127("Expected the MechToken (OCTET_STRING) contents, not: " + abstractC9032);
        }
        this.f67090 = ((C10818) abstractC9032).getValue();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46451(AbstractC9032 abstractC9032) throws C0127 {
        if (!(abstractC9032 instanceof C4466)) {
            throw new C0127("Expected the MechTypeList (SEQUENCE) contents, not: " + abstractC9032);
        }
        for (AbstractC9032 abstractC9033 : (C4466) abstractC9032) {
            if (!(abstractC9033 instanceof C15757)) {
                throw new C0127("Expected a MechType (OBJECT IDENTIFIER) as contents of the MechTypeList, not: " + abstractC9033);
            }
            this.f67089.add((C15757) abstractC9033);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46449(C15757 c15757) {
        this.f67089.add(c15757);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46453(byte[] bArr) {
        this.f67090 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m46448() {
        return this.f67089;
    }
}
