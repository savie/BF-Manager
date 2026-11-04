package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֨ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1279 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1279(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return ((AbstractC15470) this.b).r0(0);
            default:
                return (InterfaceC8409) this.b;
        }
    }
}
