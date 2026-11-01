package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0473 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2145;

    public /* synthetic */ C0473(int i, Object obj) {
        this.f2144 = i;
        this.f2145 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f2144) {
            case 0:
                ((AbstractC23903) this.f2145).m52705((C21825) obj);
                break;
            default:
                C16558 c16558 = (C16558) this.f2145;
                c16558.getClass();
                ((AbstractC20042) obj).mo1802(c16558);
                break;
        }
    }
}
