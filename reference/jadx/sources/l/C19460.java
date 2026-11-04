package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ᩴ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J18G */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19460 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45001(InterfaceC14984 interfaceC14984, Integer num) {
        interfaceC14984.accept(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩸֡᩹] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22444 m45000(final InterfaceC14984 interfaceC14984, final IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        return new InterfaceC14984() { // from class: l.᩸֡᩹
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                mo15049((Integer) obj);
            }

            @Override // l.InterfaceC14984
            /* JADX INFO: renamed from: ۤ */
            public final /* synthetic */ void mo15049(Integer num) {
                C19460.m45001((InterfaceC14984) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                return C19460.m45000((InterfaceC14984) this, intConsumer2);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                interfaceC14984.accept(i);
                intConsumer.accept(i);
            }

            public final Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        };
    }
}
