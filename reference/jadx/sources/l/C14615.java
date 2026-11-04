package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6E3 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14615 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f46029;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12531 f46030;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f46031;

    public /* synthetic */ C14615(Object obj, AbstractC12531 abstractC12531, int i) {
        this.f46029 = i;
        this.f46031 = obj;
        this.f46030 = abstractC12531;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f46029) {
            case 0:
                ((C18345) this.f46031).m42800((C24927) this.f46030, (C3648) obj);
                break;
            default:
                ((C23341) this.f46031).m52502((C2551) this.f46030, (AbstractC1566) obj);
                break;
        }
    }
}
