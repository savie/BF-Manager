package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩺ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24347 implements InterfaceC3071 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15712 f78958;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6338 f78959;

    public /* synthetic */ C24347(InterfaceC15712 interfaceC15712, C6338 c6338) {
        this.f78958 = interfaceC15712;
        this.f78959 = c6338;
    }

    @Override // l.InterfaceC3071
    public final Object invoke(Object obj) {
        String str;
        InterfaceC15712 interfaceC15712;
        AtomicReference atomicReference = (AtomicReference) obj;
        if (atomicReference != null && (str = (String) atomicReference.getAndSet(null)) != null && ((interfaceC15712 = this.f78958) == null || !interfaceC15712.mo129())) {
            this.f78959.mo1736(str);
        }
        return C11471.f36082;
    }
}
