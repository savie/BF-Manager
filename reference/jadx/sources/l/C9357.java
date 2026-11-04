package l;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6CH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9357 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f30420 = Collections.EMPTY_SET;

    /* JADX WARN: Type inference failed for: r1v0, types: [l.۟ۨۨ] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ᩳۨۨ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC5754 m24671(final String str, final Function function) {
        return new C1155(new Supplier() { // from class: l.۟ۨۨ
            @Override // java.util.function.Supplier
            public final Object get() {
                return new C4571(str, "", "");
            }
        }, new BiConsumer() { // from class: l.ᩳۨۨ
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C23501.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C4571) obj).add((CharSequence) function.apply(obj2));
            }
        }, new C10103(), new C23173(7), f30420);
    }
}
