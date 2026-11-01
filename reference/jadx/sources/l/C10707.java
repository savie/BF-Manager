package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10707 extends AbstractC14297 {
    @Override // l.AbstractC14297
    /* JADX INFO: renamed from: ۤ */
    public final String mo7640() {
        if (this.f46833 == null) {
            this.f46833 = this.f46834.m27815(this.f46838, new Function() { // from class: l.ۛۖۤ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo33696andThen(Function function) {
                    return C4277.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C4277.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    this.f19586.f46842.getClass();
                    return String.format("%s #%d", AbstractC9584.m24455("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                }
            });
        }
        return this.f46833;
    }
}
