package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: l.֨ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AW3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259 extends C10621 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5477 = AtomicIntegerFieldUpdater.newUpdater(C1259.class, "_decision");
    public volatile /* synthetic */ int _decision;

    @Override // l.C10621, l.C2339
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo4568(Object obj) {
        mo4567(obj);
    }

    @Override // l.C10621, l.C2339
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo4567(Object obj) {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC14771 interfaceC14771M45561 = C20149.m45561((InterfaceC14771) null);
                if (obj instanceof C18754) {
                    obj = C18610.m43014(((C18754) obj).f60808);
                }
                C12032.m29931(obj, interfaceC14771M45561);
                return;
            }
        } while (!f5477.compareAndSet(this, 0, 2));
    }
}
