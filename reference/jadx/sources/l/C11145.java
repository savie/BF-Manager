package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11145 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35116;

    public /* synthetic */ C11145(int i) {
        this.f35116 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f35116) {
            case 0:
                ((C7660) obj).m20870(0);
                break;
            default:
                ((C21943) obj).mo17866(EnumC1763.ADDED_TO_REGION);
                break;
        }
    }
}
