package l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ܰۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14304 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((C9829) obj).add(obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C23501.$default$andThen(this, biConsumer);
    }
}
