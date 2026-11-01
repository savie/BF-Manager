package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5735 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19510;

    public /* synthetic */ C5735(int i, Object obj) {
        this.f19510 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f19510) {
            case 0:
                C16737.m39273((Runnable) obj);
                break;
            case 1:
                ((InterfaceC18846) obj).m43487();
                break;
            default:
                ((InterfaceC8825) obj).getClass();
                break;
        }
    }
}
