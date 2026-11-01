package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14160 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15571 f46469;

    public /* synthetic */ C14160(C15571 c15571) {
        this.f46469 = c15571;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f46469.m37208((AbstractC20745) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
