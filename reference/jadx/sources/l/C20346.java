package l;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20346 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65889 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final HashMap f65890 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f65891;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3800 f65892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f65893;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 f65894 = new FutureC12075();

    public C20346(InterfaceC3800 interfaceC3800, FutureC12075 futureC12075) {
        this.f65892 = interfaceC3800;
        this.f65893 = futureC12075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20346 m45910(InterfaceC3800 interfaceC3800) {
        C20346 c20346;
        InterfaceC3800 interfaceC3800Normalize = interfaceC3800.toAbsolutePath().normalize();
        HashMap map = f65890;
        synchronized (map) {
            C20346 c20347 = (C20346) map.get(interfaceC3800Normalize);
            c20346 = new C20346(interfaceC3800Normalize, c20347 == null ? FutureC12075.m30001(null) : c20347.f65894);
            map.put(interfaceC3800Normalize, c20346);
        }
        return c20346;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m45912(InterfaceC3800 interfaceC3800) {
        FutureC12075 futureC12075M30006;
        final InterfaceC3800 interfaceC3800Normalize = interfaceC3800.toAbsolutePath().normalize();
        HashMap map = f65890;
        synchronized (map) {
            futureC12075M30006 = FutureC12075.m30006((FutureC12075[]) C9030.stream(map.entrySet()).filter(new Predicate() { // from class: l.۟ᩴۖ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C8512.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo9645negate() {
                    return C8512.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C8512.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC3800) ((Map.Entry) obj).getKey()).startsWith(interfaceC3800Normalize);
                }
            }).map(new C21051(0)).toArray(new C16113()));
        }
        return futureC12075M30006;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m45913() {
        return this.f65893.m30032((InterfaceC15954) new C15037(8));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45914(Throwable th) {
        synchronized (this) {
            if (this.f65891) {
                return;
            }
            this.f65891 = true;
            this.f65893.m30016((InterfaceC7486) new C13329(this, th));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45911(C20346 c20346, Throwable th, Throwable th2) {
        HashMap map = f65890;
        synchronized (map) {
            C9735.remove(map, c20346.f65892, c20346);
        }
        if (th2 != null) {
            th = th2;
        }
        if (th == null) {
            c20346.f65894.m30019((Object) null);
        } else {
            c20346.f65894.m30021(th);
        }
    }
}
