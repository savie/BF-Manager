package l;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩹᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23764 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC17381 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C23764(EnumC17381 enumC17381, Object obj, int i) {
        this.a = i;
        this.b = enumC17381;
        this.c = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C16063(this.b, (LongPredicate) this.c);
            case 1:
                return new C10842(this.b, (IntPredicate) this.c);
            case 2:
                return new C0402(this.b, (DoublePredicate) this.c);
            default:
                return new C8101(this.b, (Predicate) this.c);
        }
    }
}
