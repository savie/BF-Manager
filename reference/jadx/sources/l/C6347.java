package l;

import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: l.ۛۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6347 {
    public static DoubleUnaryOperator $default$compose(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        C17359.requireNonNull(doubleUnaryOperator2);
        return new C8583(doubleUnaryOperator, doubleUnaryOperator2, 0);
    }

    public static DoubleUnaryOperator $default$andThen(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2) {
        C17359.requireNonNull(doubleUnaryOperator2);
        return new C8583(doubleUnaryOperator, doubleUnaryOperator2, 1);
    }
}
