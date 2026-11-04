package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B6EY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5922 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20265;

    public /* synthetic */ C5922(int i, Object obj) {
        this.f20264 = i;
        this.f20265 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f20264) {
            case 0:
                C21943 c21943 = (C21943) obj;
                c21943.m49646().remove((C21943) this.f20265);
                c21943.m49653();
                break;
            default:
                C1930.m6626((C1930) this.f20265, (C17973) obj);
                break;
        }
    }
}
