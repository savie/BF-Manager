package l;

import java.util.ArrayList;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۡۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9262 implements ToLongFunction {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30122;

    public /* synthetic */ C9262(int i) {
        this.f30122 = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.f30122) {
            case 0:
                return ((ArrayList) ((C21943) obj).mo1986()).size();
            default:
                return ((C4797) obj).getDataOffset();
        }
    }
}
