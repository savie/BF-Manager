package l;

import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: l.۟ۧۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7838 {
    public static LongUnaryOperator $default$compose(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        C17359.requireNonNull(longUnaryOperator2);
        return new C20166(longUnaryOperator, longUnaryOperator2, 1);
    }

    public static LongUnaryOperator $default$andThen(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2) {
        C17359.requireNonNull(longUnaryOperator2);
        return new C20166(longUnaryOperator, longUnaryOperator2, 0);
    }
}
