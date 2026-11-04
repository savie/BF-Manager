package l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6JA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10829 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19780 f34308;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashSet f34309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34310;

    public /* synthetic */ C10829(C19780 c19780, String str, LinkedHashSet linkedHashSet) {
        this.f34308 = c19780;
        this.f34310 = str;
        this.f34309 = linkedHashSet;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C19780.m45537(this.f34308, this.f34310, this.f34309, (Boolean) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
