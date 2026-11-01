package l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10208 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34862;

    public /* synthetic */ C10208(int i, Object obj) {
        this.f34861 = i;
        this.f34862 = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f34861) {
            case 0:
                ((LinkedHashSet) this.f34862).add((C19670) obj);
                break;
            default:
                ((C18258) this.f34862).m52712((C21825) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }
}
