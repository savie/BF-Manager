package l;

import bin.mt.plus.R;
import java.util.concurrent.Future;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۡܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8916 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f30578;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f30579;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21615 f30580;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f30581;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile Future f30582;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f30583;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10327 f30584;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f30585;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f30586;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30587;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30588;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f30589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f30590;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f30591;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9268 f30592;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f30593;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f30594;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f30595;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6222 f30596;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C17069 f30597;

    public C8916(C10327 c10327) {
        this.f30584 = c10327;
        this.f30596 = c10327.f35417;
        InterfaceC2916 interfaceC2916 = c10327.f35405;
        this.f30594 = interfaceC2916;
        this.f30578 = c10327.f35418;
        this.f30587 = c10327.f35419;
        int length = interfaceC2916.length();
        this.f30586 = length;
        boolean z = false;
        int i = c10327.f35399 == null ? 0 : c10327.f35399.f54487;
        this.f30595 = i;
        this.f30591 = c10327.f35399 != null ? c10327.f35399.f54486 : length;
        this.f30585 = c10327.f35412.m16916();
        int iM17020 = c10327.f35412.m17020();
        this.f30593 = iM17020;
        if (Math.max(i, iM17020) == i && !C10327.m26183(c10327, i)) {
            z = true;
        }
        this.f30581 = z;
        this.f30583 = c10327.f35403;
        this.f30579 = c10327.m26208();
        this.f30597 = c10327.f35412.m16807();
        this.f30580 = c10327.f35404;
        this.f30589 = c10327.f35407;
        this.f30592 = new C9268(c10327.f35412, c10327.f35400, R.string.MT_Protector, new BooleanSupplier() { // from class: l.᩵ܰۚ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                C8916 c8916 = this.f62735;
                return c8916.f30584.m26182(c8916);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23208(Future future) {
        this.f30582 = future;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m23209() {
        while (this.f30582 == null) {
            Thread.yield();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m23206() {
        Future future = this.f30582;
        return future != null && future.isDone();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m23210() {
        Future future = this.f30582;
        if (this.f30590 || this.f30592.m23812()) {
            return true;
        }
        return future != null && future.isCancelled();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23207() {
        this.f30590 = true;
        this.f30592.m23810();
        Future future = this.f30582;
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m23211() {
        this.f30592.m23809();
    }
}
