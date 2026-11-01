package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۜ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7100 {
    public static IntConsumer $default$andThen(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        C13638.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: l.᩶᩻ᩴ
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return C7100.$default$andThen(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                intConsumer.accept(i);
                intConsumer2.accept(i);
            }
        };
    }
}
