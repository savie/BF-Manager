package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6GW */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3684 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12670;

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f12670) {
            case 0:
                C6823.m19006(((C21943) obj).mo1986());
                break;
            default:
                ((C18959) obj).mo17866(EnumC1763.REMOVE);
                break;
        }
    }
}
