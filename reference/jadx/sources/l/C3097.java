package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J7E7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3097 extends AbstractC23345 {
    @Override // l.AbstractC23345
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String mo10080() {
        if (this.f75624 == null) {
            boolean z = this.f67132;
            C1606 c1606 = this.f75627;
            if (z) {
                this.f75624 = c1606.m5625(this.f75623, new Function() { // from class: l.ܶ֫᩺
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
                        this.f51353.f75625.getClass();
                        return AbstractC3236.m10580("??? Invalid constant_pool reference", new Object[0]);
                    }
                });
            } else {
                this.f75624 = "\"".concat(c1606.m5625(this.f75623, new Function() { // from class: l.᩹֫᩺
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
                        this.f75262.f75625.getClass();
                        return String.format("%s #%d", AbstractC3236.m10580("??? Invalid constant_pool reference", new Object[0]), (Integer) obj);
                    }
                })).concat("\"");
            }
            if (this.f75621 != 0) {
                this.f75624 += ":" + c1606.m5624(this.f75621);
            }
        }
        return this.f75624;
    }
}
