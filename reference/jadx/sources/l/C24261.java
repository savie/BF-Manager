package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: DACT */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24261 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f78556;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f78556.append((String) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
