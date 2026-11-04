package l;

import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.ᩴۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6FE */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19611 implements BiConsumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63209;

    public /* synthetic */ C19611(int i) {
        this.f63209 = i;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C23501.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f63209) {
            case 0:
                ((Boolean) obj2).booleanValue();
                ((C2551) obj).getClass();
                break;
            default:
                ((List) obj2).removeAll(((C19684) obj).m45365());
                break;
        }
    }
}
