package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20941 extends AbstractC10190 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6595 f67000;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3374 f67001;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f67002;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f67003;

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ᩷ */
    public final C16157 mo26312() {
        try {
            return C16157.m38331("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final long mo26310() {
        return this.f67002.mo4285();
    }

    @Override // l.AbstractC10190
    /* JADX INFO: renamed from: ۙ */
    public final void mo26311(InterfaceC11573 interfaceC11573) throws IOException {
        InterfaceC13810 interfaceC13810M35107 = C14556.m35107(this.f67002.mo4290());
        while (true) {
            try {
                long jMo4186 = interfaceC13810M35107.mo4186(interfaceC11573.mo29106(), 10240L);
                if (jMo4186 == -1) {
                    break;
                }
                interfaceC11573.flush();
                this.f67001.m11079((int) jMo4186);
            } catch (Throwable th) {
                try {
                    interfaceC13810M35107.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (ServiceC18703.f60801.contains(this.f67003)) {
            InterfaceC6595 interfaceC6595 = this.f67000;
            if (interfaceC6595 != null) {
                interfaceC6595.cancel();
            }
            throw new IOException();
        }
        interfaceC13810M35107.close();
    }
}
