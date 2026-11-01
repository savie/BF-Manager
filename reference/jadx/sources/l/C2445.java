package l;

import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2445 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9756;

    public /* synthetic */ C2445(int i, Object obj) {
        this.f9755 = i;
        this.f9756 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9755) {
            case 0:
                C12325.m30601((C12325) this.f9756, (Set) obj);
                break;
            default:
                ((C8346) this.f9756).m21810(obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
