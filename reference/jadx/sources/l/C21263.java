package l;

import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.᩶ۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21263 {
    public static IntUnaryOperator $default$compose(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        C17359.requireNonNull(intUnaryOperator2);
        return new C22404(intUnaryOperator, intUnaryOperator2, 1);
    }

    public static IntUnaryOperator $default$andThen(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        C17359.requireNonNull(intUnaryOperator2);
        return new C22404(intUnaryOperator, intUnaryOperator2, 0);
    }
}
