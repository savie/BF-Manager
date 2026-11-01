package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7E7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2507 extends AbstractC14297 {
    @Override // l.AbstractC14297
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo7640() {
        if (this.f46833 == null) {
            boolean z = this.f22692;
            C11038 c11038 = this.f46834;
            if (z) {
                this.f46833 = c11038.m27815(this.f46838, new Function() { // from class: l.ܰۨۤ
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
                        this.f45551.f46842.getClass();
                        return AbstractC9584.m24455("??? Invalid constant_pool reference", new Object[0]);
                    }
                });
            } else {
                this.f46833 = "\"".concat(c11038.m27815(this.f46838, new Function() { // from class: l.ۨۨۤ
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
                        this.f39286.f46842.getClass();
                        return String.format("%s #%d", AbstractC9584.m24455("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                    }
                })).concat("\"");
            }
            if (this.f46839 != 0) {
                this.f46833 += ":" + c11038.m27829(this.f46839);
            }
        }
        return this.f46833;
    }
}
