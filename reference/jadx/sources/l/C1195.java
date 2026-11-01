package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1195 extends AbstractC21307 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f5298;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC11617 f5299;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8516 f5300;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f5301;

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9501 mo4377() {
        try {
            return C9501.m24336("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo4375() {
        return this.f5301.mo33964();
    }

    @Override // l.AbstractC21307
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4376(InterfaceC10983 interfaceC10983) throws IOException {
        InterfaceC10008 interfaceC10008M3435 = C0834.m3435(this.f5301.mo33970());
        while (true) {
            try {
                long jMo2293 = interfaceC10008M3435.mo2293(interfaceC10983.mo16399(), 10240L);
                if (jMo2293 == -1) {
                    break;
                }
                interfaceC10983.flush();
                this.f5300.m22242((int) jMo2293);
            } catch (Throwable th) {
                try {
                    interfaceC10008M3435.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (ServiceC23069.f74949.contains(this.f5298)) {
            InterfaceC11617 interfaceC11617 = this.f5299;
            if (interfaceC11617 != null) {
                interfaceC11617.cancel();
            }
            throw new IOException();
        }
        interfaceC10008M3435.close();
    }
}
