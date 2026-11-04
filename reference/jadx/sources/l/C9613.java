package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIT2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9613 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Function f31093;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f31094 = new ArrayList();

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    public C9613(Function function) {
        this.f31093 = function;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25101(int i) {
        this.f31094 = i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f31094.add(this.f31093.apply(obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m25100() {
        return this.f31094;
    }
}
