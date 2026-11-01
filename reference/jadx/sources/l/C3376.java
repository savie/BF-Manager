package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3376 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9728 m10027(final int i, C11521 c11521) {
        if (EnumC9728.m24685(i)) {
            return EnumC9728.get(i);
        }
        c11521.ifPresent(new Consumer() { // from class: l.ܳܿۡ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC22283) obj).mo21019(Integer.valueOf(i));
            }
        });
        return EnumC9728.ITEM_UNKNOWN;
    }
}
