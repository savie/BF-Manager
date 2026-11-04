package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩺֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6I0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23941 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77500;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77501;

    public /* synthetic */ C23941(int i, Object obj) {
        this.f77500 = i;
        this.f77501 = obj;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        switch (this.f77500) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f77500) {
            case 0:
                return ((C18981) obj) == ((C18981) this.f77501);
            case 1:
                return ((HashSet) this.f77501).contains((C18959) obj);
            case 2:
                InterfaceC6281 interfaceC6281 = (InterfaceC6281) this.f77501;
                C1381 c1381 = (C1381) obj;
                if (interfaceC6281 == c1381.f4928) {
                    return true;
                }
                if (interfaceC6281 instanceof InterfaceC18213) {
                    return C20531.m47071(interfaceC6281, c1381.f4929);
                }
                return false;
            default:
                try {
                    return ((DirectoryStream.Filter) this.f77501).mo10607accept((InterfaceC24329) obj);
                } catch (IOException unused) {
                    return false;
                }
        }
    }
}
