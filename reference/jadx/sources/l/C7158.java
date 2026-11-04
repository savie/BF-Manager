package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7158 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23661;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2551 f23662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16700 f23663;

    public /* synthetic */ C7158(AbstractC16700 abstractC16700, C2551 c2551, int i) {
        this.f23661 = i;
        this.f23663 = abstractC16700;
        this.f23662 = c2551;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f23661) {
            case 0:
                ((C21827) this.f23663).m49484(this.f23662, (C15580) obj);
                break;
            default:
                C10878.m27623((C10878) this.f23663, this.f23662, (C17973) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
