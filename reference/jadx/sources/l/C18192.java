package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIX3 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18192 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59434;

    public /* synthetic */ C18192(int i) {
        this.f59434 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f59434) {
            case 0:
                C18938.m43959((C2551) obj);
                break;
            default:
                ((ActivityC0848) obj).m3449();
                break;
        }
    }
}
