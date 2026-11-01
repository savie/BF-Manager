package l;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۫ܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12447 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC0120 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C12447(EnumC0120 enumC0120, Object obj, int i) {
        this.a = i;
        this.b = enumC0120;
        this.c = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C16618(this.b, (LongPredicate) this.c);
            case 1:
                return new C18028(this.b, (IntPredicate) this.c);
            case 2:
                return new C13527(this.b, (DoublePredicate) this.c);
            default:
                return new C11679(this.b, (Predicate) this.c);
        }
    }
}
