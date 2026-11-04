package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5104 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25242 f17805;

    public /* synthetic */ C5104(C25242 c25242) {
        this.f17805 = c25242;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f17805.m56379((AbstractC22044) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
