package l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2644 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10297;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10298;

    public /* synthetic */ C2644(int i, Object obj) {
        this.f10297 = i;
        this.f10298 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f10297) {
            case 0:
                ((C22401) this.f10298).m49677(obj);
                break;
            default:
                ((LinkedHashSet) this.f10298).add(Integer.valueOf(((Long) obj).intValue()));
                break;
        }
    }
}
