package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܶۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15160 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6919 f49520;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36356(boolean z) {
        this.f49520.m18578(z);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m36356(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
