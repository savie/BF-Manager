package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۧۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J18G */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10837 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27159(InterfaceC23537 interfaceC23537, Integer num) {
        interfaceC23537.accept(num.intValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۛۜᩴ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5897 m27158(final InterfaceC23537 interfaceC23537, final IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        return new InterfaceC23537() { // from class: l.ۛۜᩴ
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                mo1000((Integer) obj);
            }

            @Override // l.InterfaceC23537
            /* JADX INFO: renamed from: ۨ */
            public final /* synthetic */ void mo1000(Integer num) {
                C10837.m27159((InterfaceC23537) this, num);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                return C10837.m27158((InterfaceC23537) this, intConsumer2);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                interfaceC23537.accept(i);
                intConsumer.accept(i);
            }

            public final Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }
        };
    }
}
