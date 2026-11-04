package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8101 extends AbstractC21857 {
    public final /* synthetic */ EnumC17381 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8101(EnumC17381 enumC17381, Predicate predicate) {
        super(enumC17381);
        this.c = enumC17381;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC17381 enumC17381 = this.c;
        if (zTest == enumC17381.a) {
            this.a = true;
            this.b = enumC17381.b;
        }
    }
}
