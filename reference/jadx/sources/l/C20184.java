package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I7E4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20184 extends AbstractC23345 {
    @Override // l.AbstractC23345
    /* JADX INFO: renamed from: ۛ */
    public final String mo10080() {
        if (this.f75624 == null) {
            this.f75624 = this.f75627.m5625(this.f75623, new Function() { // from class: l.᩸᩻᩺
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo10608andThen(Function function) {
                    return C24247.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C24247.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    this.f75091.f75625.getClass();
                    return String.format("%s #%d", AbstractC3236.m10580("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                }
            });
        }
        return this.f75624;
    }
}
