package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82I3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8801 extends AbstractC10212 implements InterfaceC11623 {
    @Override // l.AbstractC21500, java.util.concurrent.Future
    public final Object get() {
        return m48144();
    }

    @Override // l.AbstractC21500, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return m48140(j, timeUnit);
    }

    @Override // l.AbstractC5272, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f69870 instanceof C1516;
    }
}
