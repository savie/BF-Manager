package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20074 implements Iterable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2175 f64534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f64535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC13908 f64536;

    public /* synthetic */ C20074(C2175 c2175, EnumC13908 enumC13908, Predicate predicate) {
        this.f64534 = c2175;
        this.f64536 = enumC13908;
        this.f64535 = predicate;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C13361(this.f64534, this.f64536, this.f64535);
    }
}
