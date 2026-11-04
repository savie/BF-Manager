package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3878 implements Consumer {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C21576.m49068((Runnable) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
