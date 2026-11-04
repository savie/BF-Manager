package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17390 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56559;

    public /* synthetic */ C17390(int i, Object obj) {
        this.f56558 = i;
        this.f56559 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f56558) {
            case 0:
                C3966.m12720((C3966) this.f56559, (InterfaceC2386) obj);
                break;
            case 1:
                ((C19684) obj).m45361((C12971) this.f56559);
                break;
            default:
                C9804.m25540((C2551) this.f56559, (C18959) obj);
                break;
        }
    }
}
