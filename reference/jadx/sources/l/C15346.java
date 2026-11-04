package l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܳ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15346 implements InterfaceC13810 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC25000 f50099;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f50100;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5652 f50101;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11573 f50102;

    public C15346(InterfaceC25000 interfaceC25000, InterfaceC5652 interfaceC5652, InterfaceC11573 interfaceC11573) {
        this.f50099 = interfaceC25000;
        this.f50101 = interfaceC5652;
        this.f50102 = interfaceC11573;
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        try {
            long jMo4186 = this.f50099.mo4186(c1879, 8192L);
            InterfaceC11573 interfaceC11573 = this.f50102;
            if (jMo4186 == -1) {
                if (!this.f50100) {
                    this.f50100 = true;
                    interfaceC11573.close();
                }
                return -1L;
            }
            c1879.m6439(interfaceC11573.mo29106(), c1879.size() - jMo4186, jMo4186);
            interfaceC11573.mo6431();
            return jMo4186;
        } catch (IOException e) {
            if (!this.f50100) {
                this.f50100 = true;
                this.f50101.mo16638();
            }
            throw e;
        }
    }

    @Override // l.InterfaceC13810
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo4181() {
        return this.f50099.mo4181();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM45606;
        if (!this.f50100) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM45606 = C19822.m45606(this, 100);
            } catch (IOException unused) {
                zM45606 = false;
            }
            if (!zM45606) {
                this.f50100 = true;
                this.f50101.mo16638();
            }
        }
        this.f50099.close();
    }
}
