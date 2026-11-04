package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9XD */
/* JADX INFO: loaded from: classes4.dex */
public class C10678 extends AbstractC12916 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f33901;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f33902;

    public C10678() {
        super(0, "NegTokenInit");
        this.f33902 = new ArrayList();
    }

    @Override // l.AbstractC12916
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27219(C11707 c11707) throws C15153 {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f33902;
            if (arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                AbstractC15877 abstractC15877 = AbstractC15877.f51627;
                arrayList.add(new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, 0).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) new C12148(arrayList3), true));
            }
            byte[] bArr = this.f33901;
            if (bArr != null && bArr.length > 0) {
                AbstractC15877 abstractC15878 = AbstractC15877.f51627;
                arrayList.add(new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, 2).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) new C16513(this.f33901), true));
            }
            mo31991(c11707, new C12148(arrayList));
        } catch (IOException e) {
            throw new C15153("Unable to write NegTokenInit", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27222(byte[] bArr) throws C15153 {
        try {
            C10128 c10128 = new C10128(new C7146(), new C11707(bArr).m56022());
            try {
                C18115 c18115 = (C18115) c10128.readObject();
                if (c18115.m14567().m37847() != EnumC23337.APPLICATION) {
                    throw new C15153("Incorrect GSS-API ASN.1 token received, expected to find an [APPLICATION 0], not: " + c18115);
                }
                C12148 c12148 = (C12148) c18115.m42234(AbstractC15877.f51628);
                AbstractC4691 abstractC4691 = c12148.get(0);
                if (!(abstractC4691 instanceof C19497)) {
                    throw new C15153("Expected to find the SPNEGO OID (" + C19629.f63247 + "), not: " + abstractC4691);
                }
                m31990(c12148.get(1));
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
            throw new C15153("Could not read NegTokenInit from buffer", e);
        }
    }

    @Override // l.AbstractC12916
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo27220(C18115 c18115) throws C15153 {
        if (c18115.m42236().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int iM42235 = c18115.m42235();
        if (iM42235 == 0) {
            m27223(c18115.m42236());
            return;
        }
        if (iM42235 != 1) {
            if (iM42235 == 2) {
                m27224(c18115.m42236());
            } else {
                if (iM42235 == 3) {
                    return;
                }
                throw new C15153("Unknown Object Tag " + c18115.m42235() + " encountered.");
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27224(AbstractC4691 abstractC4691) throws C15153 {
        if (!(abstractC4691 instanceof C16513)) {
            throw new C15153("Expected the MechToken (OCTET_STRING) contents, not: " + abstractC4691);
        }
        this.f33901 = ((C16513) abstractC4691).getValue();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m27223(AbstractC4691 abstractC4691) throws C15153 {
        if (!(abstractC4691 instanceof C12148)) {
            throw new C15153("Expected the MechTypeList (SEQUENCE) contents, not: " + abstractC4691);
        }
        for (AbstractC4691 abstractC4692 : (C12148) abstractC4691) {
            if (!(abstractC4692 instanceof C19497)) {
                throw new C15153("Expected a MechType (OBJECT IDENTIFIER) as contents of the MechTypeList, not: " + abstractC4692);
            }
            this.f33902.add((C19497) abstractC4692);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27221(C19497 c19497) {
        this.f33902.add(c19497);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m27225(byte[] bArr) {
        this.f33901 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27218() {
        return this.f33902;
    }
}
