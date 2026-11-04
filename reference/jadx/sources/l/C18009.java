package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18009 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58961;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58962;

    public /* synthetic */ C18009(int i, Object obj) {
        this.f58961 = i;
        this.f58962 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f58961) {
            case 0:
                break;
            case 1:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean z;
        switch (this.f58961) {
            case 0:
                return ((C18981) obj) == ((C18981) this.f58962);
            case 1:
                return ((ArrayList) this.f58962).contains((C21943) obj);
            default:
                C21943 c21943 = (C21943) obj;
                Iterator it = ((List) this.f58962).iterator();
                while (it.hasNext()) {
                    if (C23231.m52193((C21943) it.next(), c21943)) {
                        z = true;
                        return !z;
                    }
                }
                z = false;
                return !z;
        }
    }
}
