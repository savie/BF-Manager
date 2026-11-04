package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0136 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1099;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1100;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1101;

    public /* synthetic */ C0136(int i, Object obj, Object obj2) {
        this.f1099 = i;
        this.f1101 = obj;
        this.f1100 = obj2;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f1099) {
            case 0:
                ((C0310) this.f1101).f1670.m55131((AbstractC22664) this.f1100, (AbstractC22664) obj, true);
                break;
            default:
                C5997.m17429((C5997) this.f1101, (C3168) this.f1100, (C12510) obj);
                break;
        }
    }
}
