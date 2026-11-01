package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11679 extends AbstractC21287 {
    public final /* synthetic */ EnumC0120 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11679(EnumC0120 enumC0120, Predicate predicate) {
        super(enumC0120);
        this.c = enumC0120;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC0120 enumC0120 = this.c;
        if (zTest == enumC0120.a) {
            this.a = true;
            this.b = enumC0120.b;
        }
    }
}
