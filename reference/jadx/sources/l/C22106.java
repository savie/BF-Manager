package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M9GT */
/* JADX INFO: loaded from: classes.dex */
public final class C22106 extends AbstractC18909 {
    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final int mo10037(AbstractC9032 abstractC9032) throws IOException {
        C0938 c0938 = (C0938) abstractC9032;
        if (c0938.f3742 == null) {
            m49045(c0938);
        }
        return c0938.f3742.length;
    }

    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final void mo10038(AbstractC9032 abstractC9032, C15382 c15382) throws IOException {
        C0938 c0938 = (C0938) abstractC9032;
        if (c0938.f3742 == null) {
            m49045(c0938);
        }
        c15382.write(c0938.f3742);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49045(C0938 c0938) throws IOException {
        AbstractC9032 abstractC9032 = c0938.f3740;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7343 c7343 = this.f61194;
        C15382 c15382 = new C15382(c7343, byteArrayOutputStream);
        try {
            if (c0938.f3741) {
                c15382.m36819(abstractC9032);
            } else {
                abstractC9032.m23364().mo2658(c7343).mo10038(abstractC9032, c15382);
            }
            c0938.f3742 = byteArrayOutputStream.toByteArray();
            c15382.close();
        } catch (Throwable th) {
            try {
                c15382.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
