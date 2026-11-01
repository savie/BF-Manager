package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0669 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16898 f2813;

    public /* synthetic */ C0669(C16898 c16898) {
        this.f2813 = c16898;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C16898.m39571(this.f2813, (C9843) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
