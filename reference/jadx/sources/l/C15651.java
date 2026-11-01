package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1E */
/* JADX INFO: loaded from: classes4.dex */
public final class C15651 extends AbstractC16356 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BigInteger f50848;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f50849;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f50850;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15757 f50851;

    public C15651() {
        super(1, "NegTokenTarg");
    }

    @Override // l.AbstractC16356
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37324(C5982 c5982, C4466 c4466) throws IOException {
        AbstractC14676 abstractC14676 = AbstractC14676.f47970;
        C0938 c0938 = new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, 1).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) c4466, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15382 c15382 = new C15382(new C7343(), byteArrayOutputStream);
        try {
            c15382.m36819(c0938);
            c15382.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c5982.m27383(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                c15382.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC16356
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo37323(C5982 c5982) throws C0127 {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f50848 != null) {
                AbstractC14676 abstractC14676 = AbstractC14676.f47970;
                arrayList.add(new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, 0).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) new C21400(this.f50848), true));
            }
            if (this.f50851 != null) {
                AbstractC14676 abstractC14677 = AbstractC14676.f47970;
                arrayList.add(new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, 1).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) this.f50851, true));
            }
            byte[] bArr = this.f50849;
            if (bArr != null && bArr.length > 0) {
                AbstractC14676 abstractC14678 = AbstractC14676.f47970;
                arrayList.add(new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, 2).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) new C10818(this.f50849), true));
            }
            byte[] bArr2 = this.f50850;
            if (bArr2 != null && bArr2.length > 0) {
                AbstractC14676 abstractC14679 = AbstractC14676.f47970;
                arrayList.add(new C0938(AbstractC14676.m35208(EnumC1974.CONTEXT_SPECIFIC, 3).m35210(EnumC19615.CONSTRUCTED), (AbstractC9032) new C10818(this.f50850), true));
            }
            mo37324(c5982, new C4466(arrayList));
        } catch (IOException e) {
            throw new C0127("Could not write NegTokenTarg to buffer", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37325(byte[] bArr) {
        try {
            C23143 c23143 = new C23143(new C8326(), new C5982(bArr).m27395());
            try {
                m38527(c23143.readObject());
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
            throw new C0127("Could not read NegTokenTarg from buffer", e);
        }
    }

    @Override // l.AbstractC16356
    /* JADX INFO: renamed from: ۙ */
    public final void mo19116(C0938 c0938) throws C0127 {
        int iM3699 = c0938.m3699();
        if (iM3699 == 0) {
            AbstractC9032 abstractC9032M3697 = c0938.m3697();
            if (abstractC9032M3697 instanceof C21400) {
                this.f50848 = ((C21400) abstractC9032M3697).getValue();
                return;
            } else {
                throw new C0127("Expected the negResult (ENUMERATED) contents, not: " + this.f50851);
            }
        }
        if (iM3699 == 1) {
            AbstractC9032 abstractC9032M3698 = c0938.m3697();
            if (abstractC9032M3698 instanceof C15757) {
                this.f50851 = (C15757) abstractC9032M3698;
                return;
            } else {
                throw new C0127("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: " + abstractC9032M3698);
            }
        }
        if (iM3699 == 2) {
            AbstractC9032 abstractC9032M3699 = c0938.m3697();
            if (abstractC9032M3699 instanceof C10818) {
                this.f50849 = ((C10818) abstractC9032M3699).getValue();
                return;
            } else {
                throw new C0127("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC9032M3699);
            }
        }
        if (iM3699 != 3) {
            throw new C0127("Unknown Object Tag " + c0938.m3699() + " encountered.");
        }
        AbstractC9032 abstractC9032M36910 = c0938.m3697();
        if (abstractC9032M36910 instanceof C10818) {
            this.f50850 = ((C10818) abstractC9032M36910).getValue();
        } else {
            throw new C0127("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC9032M36910);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m37326() {
        return this.f50849;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37327(byte[] bArr) {
        this.f50849 = bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m37328(byte[] bArr) {
        this.f50850 = bArr;
    }
}
