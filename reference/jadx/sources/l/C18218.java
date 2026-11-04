package l;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܿۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18218 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59476;

    public /* synthetic */ C18218(int i) {
        this.f59476 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f59476) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f59476) {
            case 0:
                return ((AbstractC14806) obj) != C3620.m11750();
            case 1:
                return C17359.nonNull((String) obj);
            case 2:
                return ((C8002) obj).isDirectory();
            case 3:
                return ((int[]) ((Map.Entry) obj).getValue())[1] != -1;
            case 4:
                return (C11239.m28344((AbstractC8036) ((InterfaceC19637) obj)) & 16777216) == 0;
            default:
                return ((C21943) obj).mo17865(EnumC1763.REMOVE);
        }
    }
}
