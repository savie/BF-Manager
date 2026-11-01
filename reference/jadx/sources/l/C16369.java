package l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes4.dex */
public final class C16369 implements InterfaceC10008 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17074 f52681;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f52682;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23683 f52683;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10983 f52684;

    public C16369(InterfaceC23683 interfaceC23683, InterfaceC17074 interfaceC17074, InterfaceC10983 interfaceC10983) {
        this.f52683 = interfaceC23683;
        this.f52681 = interfaceC17074;
        this.f52684 = interfaceC10983;
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        try {
            long jMo2293 = this.f52683.mo2293(c6043, 8192L);
            InterfaceC10983 interfaceC10983 = this.f52684;
            if (jMo2293 == -1) {
                if (!this.f52682) {
                    this.f52682 = true;
                    interfaceC10983.close();
                }
                return -1L;
            }
            c6043.m16410(interfaceC10983.mo16399(), c6043.size() - jMo2293, jMo2293);
            interfaceC10983.mo16425();
            return jMo2293;
        } catch (IOException e) {
            if (!this.f52682) {
                this.f52682 = true;
                this.f52681.mo39858();
            }
            throw e;
        }
    }

    @Override // l.InterfaceC10008
    /* JADX INFO: renamed from: ۜ */
    public final C20591 mo2292() {
        return this.f52683.mo2292();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM1236;
        if (!this.f52682) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM1236 = C0140.m1236(this, 100);
            } catch (IOException unused) {
                zM1236 = false;
            }
            if (!zM1236) {
                this.f52682 = true;
                this.f52681.mo39858();
            }
        }
        this.f52683.close();
    }
}
