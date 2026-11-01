package l;

import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ۜ᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7050 implements BiConsumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23279 f23689;

    public /* synthetic */ C7050(C23279 c23279) {
        this.f23689 = c23279;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        C23279.m51356(this.f23689, (String) obj, (List) obj2);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C2866.$default$andThen(this, biConsumer);
    }
}
