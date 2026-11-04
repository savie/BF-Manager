package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0882 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3280;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3281;

    public /* synthetic */ C0882(int i, Object obj) {
        this.f3280 = i;
        this.f3281 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f3280) {
            case 0:
                ((AbstractC17836) this.f3281).mo7481((C6650) obj);
                break;
            default:
                C1930.m6627((C1930) this.f3281, (C25051) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
