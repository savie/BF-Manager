package l;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ܳ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IO */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15565 implements IntUnaryOperator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13328 f50624;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C21263.$default$andThen(this, intUnaryOperator);
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        AbstractC13328.m32893(this.f50624, i);
        return i;
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C21263.$default$compose(this, intUnaryOperator);
    }
}
