package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75CE */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22668 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C21943 c21943 = (C21943) obj;
        c21943.mo17866(EnumC1763.REMOVE);
        c21943.mo17866(EnumC1763.DONT_GENERATE);
    }
}
