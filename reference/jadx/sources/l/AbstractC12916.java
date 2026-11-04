package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CA2B */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12916 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f41300;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f41301;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo27219(C11707 c11707);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo27220(C18115 c18115);

    public AbstractC12916(int i, String str) {
        this.f41301 = i;
        this.f41300 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo31991(C11707 c11707, C12148 c12148) throws IOException {
        AbstractC15877 abstractC15877 = AbstractC15877.f51627;
        C18115 c18115 = new C18115(AbstractC15877.m37843(EnumC23337.CONTEXT_SPECIFIC, this.f41301).m37845(EnumC13857.CONSTRUCTED), (AbstractC4691) c12148, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C19629.f63247);
        arrayList.add(c18115);
        C18115 c18116 = new C18115(AbstractC15877.m37843(EnumC23337.APPLICATION, 0), (AbstractC4691) new C12148(arrayList), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1180 c1180 = new C1180(new C2083(), byteArrayOutputStream);
        try {
            c1180.m4354(c18116);
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31990(AbstractC4691 abstractC4691) throws C15153 {
        boolean z = abstractC4691 instanceof C18115;
        int i = this.f41301;
        String str = this.f41300;
        if (z) {
            C18115 c18115 = (C18115) abstractC4691;
            if (c18115.m42235() == i) {
                AbstractC4691 abstractC4691M42236 = c18115.m42236();
                if (!(abstractC4691M42236 instanceof C12148)) {
                    throw new C15153("Expected a " + str + " (SEQUENCE), not: " + abstractC4691M42236);
                }
                for (AbstractC4691 abstractC4692 : (C12148) abstractC4691M42236) {
                    if (!(abstractC4692 instanceof C18115)) {
                        throw new C15153("Expected an ASN.1 TaggedObject as " + str + " contents, not: " + abstractC4692);
                    }
                    mo27220((C18115) abstractC4692);
                }
                return;
            }
        }
        throw new C15153("Expected to find the " + str + " (CHOICE [" + i + "]) header, not: " + abstractC4691);
    }
}
