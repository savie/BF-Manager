package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66R4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11140 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35106;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35107;

    public /* synthetic */ C11140(int i, Object obj) {
        this.f35106 = i;
        this.f35107 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f35106) {
            case 0:
                return super/*l.ۙܿ᩸*/.mo11041();
            default:
                return ((AbstractC8036) this.f35107).getClass().getSimpleName();
        }
    }
}
