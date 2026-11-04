package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܶܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82I3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16228 extends AbstractC23688 implements InterfaceC13968 {
    @Override // l.AbstractC2059, java.util.concurrent.Future
    public final Object get() {
        return m7114();
    }

    @Override // l.AbstractC2059, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return m7110(j, timeUnit);
    }

    @Override // l.AbstractC22196, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6857 instanceof C1291;
    }
}
