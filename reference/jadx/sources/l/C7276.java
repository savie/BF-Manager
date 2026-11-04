package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6DR */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7276 implements IntConsumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2012 f23972;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1310 f23973;

    public /* synthetic */ C7276(C2012 c2012, C1310 c1310) {
        this.f23972 = c2012;
        this.f23973 = c1310;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C2012.m6900(this.f23972, this.f23973, i);
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }
}
