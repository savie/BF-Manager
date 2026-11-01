package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽ۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16517 implements Iterable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f53055;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10873 f53056;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC10167 f53057;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11242 f53058;

    public /* synthetic */ C16517(C10873 c10873, AbstractC11242 abstractC11242, Predicate predicate, EnumC10167 enumC10167) {
        this.f53056 = c10873;
        this.f53058 = abstractC11242;
        this.f53055 = predicate;
        this.f53057 = enumC10167;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5933(this.f53056, this.f53058, this.f53055, this.f53057);
    }
}
