package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0288 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f1599;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10873 f1600;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC10167 f1601;

    public /* synthetic */ C0288(C10873 c10873, EnumC10167 enumC10167, Predicate predicate) {
        this.f1600 = c10873;
        this.f1601 = enumC10167;
        this.f1599 = predicate;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C17222(this.f1600, this.f1601, this.f1599);
    }
}
