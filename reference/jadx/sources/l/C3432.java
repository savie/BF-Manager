package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes2.dex */
public final class C3432 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23570 m11195(final int i, C15867 c15867) {
        if (EnumC23570.m52763(i)) {
            return EnumC23570.get(i);
        }
        c15867.ifPresent(new Consumer() { // from class: l.ܽ۬ۛ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((InterfaceC0296) obj).mo1876(Integer.valueOf(i));
            }
        });
        return EnumC23570.ITEM_UNKNOWN;
    }
}
