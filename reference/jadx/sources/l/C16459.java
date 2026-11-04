package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6HJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16459 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53372;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53373;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53374;

    public /* synthetic */ C16459(int i, Object obj, Object obj2) {
        this.f53372 = i;
        this.f53374 = obj;
        this.f53373 = obj2;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f53372) {
            case 0:
                C11984.m30088((C11984) this.f53374, (InterfaceC3145) this.f53373, (AbstractC12531) obj);
                break;
            default:
                ((C23341) this.f53374).m52506((C2551) this.f53373, (C24927) obj);
                break;
        }
    }
}
