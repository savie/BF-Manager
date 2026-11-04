package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩹֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: V1PV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23190 implements IntConsumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f75154;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f75154.accept(Integer.valueOf(i));
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }
}
