package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18402 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f58649;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f58650;

    public /* synthetic */ C18402(int i, Object obj) {
        this.f58649 = i;
        this.f58650 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        switch (this.f58649) {
            case 0:
                break;
        }
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f58649) {
            case 0:
                try {
                    return ((DirectoryStream.Filter) this.f58650).mo14669accept((InterfaceC3800) obj);
                } catch (IOException unused) {
                    return false;
                }
            default:
                return ((InterfaceC22510) this.f58650).mo28213((String) obj);
        }
    }
}
