package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18175 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9462 f58073;

    public /* synthetic */ C18175(AbstractC9462 abstractC9462) {
        this.f58073 = abstractC9462;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f58073.mo24224((C5558) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
