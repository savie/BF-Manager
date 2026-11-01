package l;

import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.۬᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13359 implements BiConsumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44284;

    public /* synthetic */ C13359(int i) {
        this.f44284 = i;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C2866.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f44284) {
            case 0:
                ((C19003) obj).m43723(obj2);
                break;
            default:
                ((C8387) obj).add(obj2);
                break;
        }
    }
}
