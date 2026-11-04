package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46CT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8035 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26655;

    public /* synthetic */ C8035(int i) {
        this.f26655 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f26655) {
            case 0:
                ((C2551) obj).m39418(EnumC1763.DONT_GENERATE);
                break;
            default:
                ((C21943) obj).m49653();
                break;
        }
    }
}
