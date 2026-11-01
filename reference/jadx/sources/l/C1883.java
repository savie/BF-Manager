package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1883 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8568 f7119;

    public /* synthetic */ C1883(C8568 c8568) {
        this.f7119 = c8568;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f7119.f29615.m20802((C19173) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
