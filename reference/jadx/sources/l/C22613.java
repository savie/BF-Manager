package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FA1E */
/* JADX INFO: loaded from: classes.dex */
public final class C22613 extends AbstractC12916 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f73071;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19497 f73072;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f73073;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BigInteger f73074;

    public C22613() {
        super(1, "NegTokenTarg");
    }

    @Override // l.AbstractC12916
    /* JADX INFO: renamed from: ۙ */
    public final void mo31991(C11707 c11707, C12148 c12148) throws IOException {
        AbstractC15877 abstractC15877 = AbstractC15877.f51627;
        C18115 c18115 = new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, 1).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) c12148, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1180 c1180 = new C1180(new C2083(), byteArrayOutputStream);
        try {
            c1180.m4354(c18115);
            c1180.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c11707.m56007(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                c1180.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC12916
    /* JADX INFO: renamed from: ۙ */
    public final void mo27219(C11707 c11707) throws C15153 {
        ArrayList arrayList = new ArrayList();
        try {
            if (this.f73074 != null) {
                AbstractC15877 abstractC15877 = AbstractC15877.f51627;
                arrayList.add(new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, 0).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) new C9164(this.f73074), true));
            }
            if (this.f73072 != null) {
                AbstractC15877 abstractC15878 = AbstractC15877.f51627;
                arrayList.add(new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, 1).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) this.f73072, true));
            }
            byte[] bArr = this.f73073;
            if (bArr != null && bArr.length > 0) {
                AbstractC15877 abstractC15879 = AbstractC15877.f51627;
                arrayList.add(new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, 2).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) new C16513(this.f73073), true));
            }
            byte[] bArr2 = this.f73071;
            if (bArr2 != null && bArr2.length > 0) {
                AbstractC15877 abstractC158710 = AbstractC15877.f51627;
                arrayList.add(new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, 3).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) new C16513(this.f73071), true));
            }
            mo31991(c11707, new C12148(arrayList));
        } catch (IOException e) {
            throw new C15153("Could not write NegTokenTarg to buffer", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50947(byte[] bArr) {
        try {
            C10128 c10128 = new C10128(new C7146(), new C11707(bArr).m56022());
            try {
                m31990(c10128.readObject());
                c10128.close();
            } catch (Throwable th) {
                try {
                    c10128.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            throw new C15153("Could not read NegTokenTarg from buffer", e);
        }
    }

    @Override // l.AbstractC12916
    /* JADX INFO: renamed from: ۙ */
    public final void mo27220(C18115 c18115) throws C15153 {
        int iM42235 = c18115.m42235();
        if (iM42235 == 0) {
            AbstractC4691 abstractC4691M42236 = c18115.m42236();
            if (abstractC4691M42236 instanceof C9164) {
                this.f73074 = ((C9164) abstractC4691M42236).getValue();
                return;
            } else {
                throw new C15153("Expected the negResult (ENUMERATED) contents, not: " + this.f73072);
            }
        }
        if (iM42235 == 1) {
            AbstractC4691 abstractC4691M42237 = c18115.m42236();
            if (abstractC4691M42237 instanceof C19497) {
                this.f73072 = (C19497) abstractC4691M42237;
                return;
            } else {
                throw new C15153("Expected the supportedMech (OBJECT IDENTIFIER) contents, not: " + abstractC4691M42237);
            }
        }
        if (iM42235 == 2) {
            AbstractC4691 abstractC4691M42238 = c18115.m42236();
            if (abstractC4691M42238 instanceof C16513) {
                this.f73073 = ((C16513) abstractC4691M42238).getValue();
                return;
            } else {
                throw new C15153("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC4691M42238);
            }
        }
        if (iM42235 != 3) {
            throw new C15153("Unknown Object Tag " + c18115.m42235() + " encountered.");
        }
        AbstractC4691 abstractC4691M42239 = c18115.m42236();
        if (abstractC4691M42239 instanceof C16513) {
            this.f73071 = ((C16513) abstractC4691M42239).getValue();
        } else {
            throw new C15153("Expected the responseToken (OCTET_STRING) contents, not: " + abstractC4691M42239);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m50948() {
        return this.f73073;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50949(byte[] bArr) {
        this.f73073 = bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50950(byte[] bArr) {
        this.f73071 = bArr;
    }
}
