package l;

import android.content.Context;
import android.view.Surface;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩸֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21251 implements InterfaceC13136, InterfaceC17723 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9963 f69209;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f69210;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f69211;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f69212;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC5374 f69213;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f69214;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC22433 f69215;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7648 f69216;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Executor f69217;

    public C21251(C9963 c9963, Context context) {
        this.f69209 = c9963;
        this.f69211 = C17983.m41862(context) ? 1 : 5;
        this.f69215 = AbstractC22433.of();
        this.f69210 = -9223372036854775807L;
        this.f69213 = InterfaceC5374.f18571;
        this.f69217 = C9963.f34039;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۜ */
    public final void mo28297() {
        C9963 c9963 = this.f69209;
        if (c9963.f34044) {
            c9963.m25222();
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۘ */
    public final void mo28282() {
        C9963 c9963 = this.f69209;
        if (c9963.f34044) {
            c9963.m25225();
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28290(InterfaceC5374 interfaceC5374, Executor executor) {
        this.f69213 = interfaceC5374;
        this.f69217 = executor;
    }

    @Override // l.InterfaceC13136
    public final boolean isInitialized() {
        return this.f69214;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۖ */
    public final void mo28281() {
        if (this.f69214) {
            C9963 c9963 = this.f69209;
            long j = c9963.f34045;
            C9963.m25206(c9963, false);
            InterfaceC1318 interfaceC1318M25194 = C9963.m25194(c9963);
            interfaceC1318M25194.getClass();
            interfaceC1318M25194.m4709();
            c9963.f34045 = j;
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28291(C7648 c7648, long j, int i, List list) {
        C2023.m6510(this.f69214);
        this.f69215 = AbstractC22433.copyOf((Collection) list);
        this.f69216 = c7648;
        C9963 c9963 = this.f69209;
        c9963.f34057 = -9223372036854775807L;
        c9963.f34050 = false;
        m47726(c7648);
        boolean z = this.f69210 == -9223372036854775807L;
        if (c9963.f34044 || z) {
            long j2 = z ? -4611686018427387904L : this.f69210 + 1;
            c9963.f34056.m11201(j2, new C8552(j + this.f69212, i, j2));
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28293(long j, InterfaceC22308 interfaceC22308) {
        C2023.m6510(this.f69214);
        C9963 c9963 = this.f69209;
        if (!C9963.m25218(c9963)) {
            return false;
        }
        InterfaceC1318 interfaceC1318M25194 = C9963.m25194(c9963);
        interfaceC1318M25194.getClass();
        if (interfaceC1318M25194.m4713() >= this.f69211) {
            return false;
        }
        InterfaceC1318 interfaceC1318M25195 = C9963.m25194(c9963);
        interfaceC1318M25195.getClass();
        if (!interfaceC1318M25195.m4710()) {
            return false;
        }
        long j2 = j + this.f69212;
        this.f69210 = j2;
        ((C3527) interfaceC22308).mo10388(j2 * 1000);
        return true;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28294(C7648 c7648) throws C1140 {
        C2023.m6510(!this.f69214);
        C9963.m25207(this.f69209, c7648);
        this.f69214 = true;
        return true;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28295(boolean z) {
        return C9963.m25215(this.f69209, z && this.f69214);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۚ */
    public final Surface mo28296() {
        C2023.m6510(this.f69214);
        InterfaceC1318 interfaceC1318M25194 = C9963.m25194(this.f69209);
        interfaceC1318M25194.getClass();
        return interfaceC1318M25194.m4712();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ܰ */
    public final void mo28300(boolean z) {
        boolean z2 = this.f69214;
        C9963 c9963 = this.f69209;
        if (z2) {
            InterfaceC1318 interfaceC1318M25194 = C9963.m25194(c9963);
            interfaceC1318M25194.getClass();
            interfaceC1318M25194.flush();
        }
        this.f69210 = -9223372036854775807L;
        C9963.m25206(c9963, z);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo28301() {
        return this.f69214 && C9963.m25209(this.f69209);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ֨ */
    public final void mo28280() {
        long j = this.f69210;
        C9963 c9963 = this.f69209;
        c9963.f34057 = j;
        if (c9963.f34045 >= c9963.f34057) {
            C9963.m25216(c9963);
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۬ */
    public final void mo28299() {
        C9963 c9963 = this.f69209;
        if (c9963.f34056.m11202() == 0) {
            C9963.m25197(c9963);
            return;
        }
        C3871 c3871 = new C3871();
        boolean z = true;
        while (c9963.f34056.m11202() > 0) {
            C8552 c8552 = (C8552) c9963.f34056.m11203();
            c8552.getClass();
            if (z) {
                int i = c8552.f29581;
                if (i == 0 || i == 1) {
                    c8552 = new C8552(c8552.f29582, 0, c8552.f29583);
                } else {
                    C9963.m25197(c9963);
                }
                z = false;
            }
            c3871.m11201(c8552.f29583, c8552);
        }
        c9963.f34056 = c3871;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28292(InterfaceC19841 interfaceC19841) {
        C9963.m25205(this.f69209, interfaceC19841);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28284(float f) {
        C9963.m25200(this.f69209, f);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28289(List list) {
        if (this.f69215.equals(list)) {
            return;
        }
        this.f69215 = AbstractC22433.copyOf((Collection) list);
        C7648 c7648 = this.f69216;
        if (c7648 != null) {
            m47726(c7648);
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28286(long j) {
        this.f69212 = j;
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28288(Surface surface, C5283 c5283) {
        this.f69209.m25221(surface, c5283);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ᩺ */
    public final void mo28302() {
        this.f69209.m25220();
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28285(int i) {
        C9963.m25201(this.f69209, i);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28287(long j, long j2) {
        C9963.m25203(this.f69209, j + this.f69212, j2);
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۨ */
    public final void mo28298(boolean z) {
        C9963 c9963 = this.f69209;
        if (c9963.f34044) {
            C9963.m25211(c9963, z);
        }
    }

    @Override // l.InterfaceC13136
    /* JADX INFO: renamed from: ۙ */
    public final void mo28283() {
        this.f69209.m25223();
    }

    @Override // l.InterfaceC17723
    /* JADX INFO: renamed from: ۨ */
    public final void mo41265() {
        InterfaceC5374 interfaceC5374 = this.f69213;
        Executor executor = this.f69217;
        C13638.requireNonNull(interfaceC5374);
        executor.execute(new RunnableC11110(1, interfaceC5374));
    }

    @Override // l.InterfaceC17723
    /* JADX INFO: renamed from: ᩹ */
    public final void mo41266() {
        final InterfaceC5374 interfaceC5374 = this.f69213;
        Executor executor = this.f69217;
        C13638.requireNonNull(interfaceC5374);
        executor.execute(new Runnable() { // from class: l.᩺֨ܰ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC5374.mo7958();
            }
        });
    }

    @Override // l.InterfaceC17723
    /* JADX INFO: renamed from: ۙ */
    public final void mo41264(final C13314 c13314) {
        final InterfaceC5374 interfaceC5374 = this.f69213;
        this.f69217.execute(new Runnable() { // from class: l.ܶ֨ܰ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC5374.mo7956(c13314);
            }
        });
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m47726(C7648 c7648) {
        C10471 c10471M20201 = c7648.m20201();
        C4119 c4119 = c7648.f25239;
        if (c4119 == null || !c4119.m11708()) {
            c4119 = C4119.f15082;
        }
        c10471M20201.m26505(c4119);
        c10471M20201.m26497();
        InterfaceC1318 interfaceC1318M25194 = C9963.m25194(this.f69209);
        interfaceC1318M25194.getClass();
        interfaceC1318M25194.m4717();
    }
}
