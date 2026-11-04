package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21099 extends AbstractC8637 {
    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final int mo3832(AbstractC4691 abstractC4691) throws IOException {
        C18115 c18115 = (C18115) abstractC4691;
        if (c18115.f59278 == null) {
            m48159(c18115);
        }
        return c18115.f59278.length;
    }

    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final void mo3833(AbstractC4691 abstractC4691, C1180 c1180) throws IOException {
        C18115 c18115 = (C18115) abstractC4691;
        if (c18115.f59278 == null) {
            m48159(c18115);
        }
        c1180.write(c18115.f59278);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m48159(C18115 c18115) throws IOException {
        AbstractC4691 abstractC4691 = c18115.f59276;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2083 c2083 = this.f28223;
        C1180 c1180 = new C1180(c2083, byteArrayOutputStream);
        try {
            if (c18115.f59275) {
                c1180.m4354(abstractC4691);
            } else {
                abstractC4691.m14567().mo6072(c2083).mo3833(abstractC4691, c1180);
            }
            c18115.f59278 = byteArrayOutputStream.toByteArray();
            c1180.close();
        } catch (Throwable th) {
            try {
                c1180.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
