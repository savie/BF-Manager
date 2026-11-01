package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20019 implements InterfaceC15456 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17421 f64122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21079 f64123;

    public /* synthetic */ C20019(InterfaceC17421 interfaceC17421, C21079 c21079) {
        this.f64122 = interfaceC17421;
        this.f64123 = c21079;
    }

    @Override // l.InterfaceC15456
    public final Object invoke(Object obj) {
        String str;
        InterfaceC17421 interfaceC17421;
        AtomicReference atomicReference = (AtomicReference) obj;
        if (atomicReference != null && (str = (String) atomicReference.getAndSet(null)) != null && ((interfaceC17421 = this.f64122) == null || !interfaceC17421.mo114())) {
            this.f64123.mo1825((Object) str);
        }
        return C7321.f24318;
    }
}
