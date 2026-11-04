package l;

import android.content.Context;
import android.view.Surface;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1250 implements InterfaceC7897, InterfaceC9452 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f4516;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f4517;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC1928 f4518;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f4519;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4914 f4520;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Executor f4521;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC21322 f4522;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15648 f4523;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f4524;

    public C1250(C4914 c4914, Context context) {
        this.f4520 = c4914;
        this.f4516 = C7116.m19512(context) ? 1 : 5;
        this.f4518 = AbstractC1928.of();
        this.f4524 = -9223372036854775807L;
        this.f4522 = InterfaceC21322.f67932;
        this.f4521 = C4914.f17150;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo4522() {
        C4914 c4914 = this.f4520;
        if (c4914.f17164) {
            c4914.m15097();
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4504() {
        C4914 c4914 = this.f4520;
        if (c4914.f17164) {
            c4914.m15096();
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4515(InterfaceC21322 interfaceC21322, Executor executor) {
        this.f4522 = interfaceC21322;
        this.f4521 = executor;
    }

    @Override // l.InterfaceC7897
    public final boolean isInitialized() {
        return this.f4519;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4512(C15648 c15648, long j, int i, List list) {
        C20782.m47568(this.f4519);
        this.f4518 = AbstractC1928.copyOf((Collection) list);
        this.f4523 = c15648;
        C4914 c4914 = this.f4520;
        c4914.f17160 = -9223372036854775807L;
        c4914.f17154 = false;
        m4503(c15648);
        boolean z = this.f4524 == -9223372036854775807L;
        if (c4914.f17164 || z) {
            long j2 = z ? -4611686018427387904L : this.f4524 + 1;
            c4914.f17163.m26055(j2, new C13927(j + this.f4517, i, j2));
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4516(long j, InterfaceC18338 interfaceC18338) {
        C20782.m47568(this.f4519);
        C4914 c4914 = this.f4520;
        if (!C4914.m15092(c4914)) {
            return false;
        }
        InterfaceC7600 interfaceC7600M15083 = C4914.m15083(c4914);
        interfaceC7600M15083.getClass();
        if (interfaceC7600M15083.m20768() >= this.f4516) {
            return false;
        }
        InterfaceC7600 interfaceC7600M15084 = C4914.m15083(c4914);
        interfaceC7600M15084.getClass();
        if (!interfaceC7600M15084.m20765()) {
            return false;
        }
        long j2 = j + this.f4517;
        this.f4524 = j2;
        ((C12436) interfaceC18338).mo30911(j2 * 1000);
        return true;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4517(C15648 c15648) throws C0439 {
        C20782.m47568(!this.f4519);
        C4914.m15078(this.f4520, c15648);
        this.f4519 = true;
        return true;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4518(boolean z) {
        return C4914.m15090(this.f4520, z && this.f4519);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Surface mo4525() {
        C20782.m47568(this.f4519);
        InterfaceC7600 interfaceC7600M15083 = C4914.m15083(this.f4520);
        interfaceC7600M15083.getClass();
        return interfaceC7600M15083.m20772();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4526(boolean z) {
        boolean z2 = this.f4519;
        C4914 c4914 = this.f4520;
        if (z2) {
            InterfaceC7600 interfaceC7600M15083 = C4914.m15083(c4914);
            interfaceC7600M15083.getClass();
            interfaceC7600M15083.flush();
        }
        this.f4524 = -9223372036854775807L;
        C4914.m15077(c4914, z);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo4527() {
        return this.f4519 && C4914.m15082(this.f4520);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void mo4528() {
        if (this.f4519) {
            C4914 c4914 = this.f4520;
            long j = c4914.f17157;
            C4914.m15077(c4914, false);
            InterfaceC7600 interfaceC7600M15083 = C4914.m15083(c4914);
            interfaceC7600M15083.getClass();
            interfaceC7600M15083.m20773();
            c4914.f17157 = j;
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void mo4523() {
        long j = this.f4524;
        C4914 c4914 = this.f4520;
        c4914.f17160 = j;
        if (c4914.f17157 >= c4914.f17160) {
            C4914.m15086(c4914);
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo4519() {
        C4914 c4914 = this.f4520;
        if (c4914.f17163.m26056() == 0) {
            C4914.m15068(c4914);
            return;
        }
        C10098 c10098 = new C10098();
        boolean z = true;
        while (c4914.f17163.m26056() > 0) {
            C13927 c13927 = (C13927) c4914.f17163.m26057();
            c13927.getClass();
            if (z) {
                int i = c13927.f44157;
                if (i == 0 || i == 1) {
                    c13927 = new C13927(c13927.f44158, 0, c13927.f44159);
                } else {
                    C4914.m15068(c4914);
                }
                z = false;
            }
            c10098.m26055(c13927.f44159, c13927);
        }
        c4914.f17163 = c10098;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4514(InterfaceC19830 interfaceC19830) {
        C4914.m15076(this.f4520, interfaceC19830);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4506(float f) {
        C4914.m15071(this.f4520, f);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4511(List list) {
        if (this.f4518.equals(list)) {
            return;
        }
        this.f4518 = AbstractC1928.copyOf((Collection) list);
        C15648 c15648 = this.f4523;
        if (c15648 != null) {
            m4503(c15648);
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4508(long j) {
        this.f4517 = j;
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4510(Surface surface, C18303 c18303) {
        this.f4520.m15094(surface, c18303);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo4529() {
        this.f4520.m15093();
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4507(int i) {
        C4914.m15072(this.f4520, i);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4509(long j, long j2) {
        C4914.m15074(this.f4520, j + this.f4517, j2);
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo4521(boolean z) {
        C4914 c4914 = this.f4520;
        if (c4914.f17164) {
            C4914.m15081(c4914, z);
        }
    }

    @Override // l.InterfaceC7897
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4505() {
        this.f4520.m15095();
    }

    @Override // l.InterfaceC9452
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo4520() {
        InterfaceC21322 interfaceC21322 = this.f4522;
        Executor executor = this.f4521;
        C17359.requireNonNull(interfaceC21322);
        executor.execute(new RunnableC22836(1, interfaceC21322));
    }

    @Override // l.InterfaceC9452
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo4524() {
        InterfaceC21322 interfaceC21322 = this.f4522;
        Executor executor = this.f4521;
        C17359.requireNonNull(interfaceC21322);
        executor.execute(new RunnableC15279(1, interfaceC21322));
    }

    @Override // l.InterfaceC9452
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4513(C18787 c18787) {
        this.f4521.execute(new RunnableC19852(2, this.f4522, c18787));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m4503(C15648 c15648) {
        C20124 c20124M37397 = c15648.m37397();
        C1259 c1259 = c15648.f50832;
        if (c1259 == null || !c1259.m4564()) {
            c1259 = C1259.f4534;
        }
        c20124M37397.m46302(c1259);
        c20124M37397.m46295();
        InterfaceC7600 interfaceC7600M15083 = C4914.m15083(this.f4520);
        interfaceC7600M15083.getClass();
        interfaceC7600M15083.m20774();
    }
}
