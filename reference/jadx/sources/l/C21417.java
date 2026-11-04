package l;

import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.᩶ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C21417 implements BiConsumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18433 f68213;

    public /* synthetic */ C21417(C18433 c18433) {
        this.f68213 = c18433;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C18433.m42958(this.f68213, (String) obj, (List) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C23501.$default$andThen(this, biConsumer);
    }
}
