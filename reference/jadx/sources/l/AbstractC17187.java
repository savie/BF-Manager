package l;

import java.nio.charset.Charset;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ܿۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IO */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17187 extends AbstractC16482 {
    static {
        InterfaceC0978[] interfaceC0978Arr = C22604.f73660;
    }

    public AbstractC17187() {
        Charset.defaultCharset();
        Charset.defaultCharset();
        new IntUnaryOperator() { // from class: l.۫ۜ᩵
            public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                return C15568.$default$andThen(this, intUnaryOperator);
            }

            public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                return C15568.$default$compose(this, intUnaryOperator);
            }

            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                this.f40991.getClass();
                if (i <= Integer.MAX_VALUE) {
                    return i;
                }
                throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.MAX_VALUE));
            }
        };
    }
}
