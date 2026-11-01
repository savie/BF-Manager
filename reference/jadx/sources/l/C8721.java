package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8721 implements Supplier {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29973;

    public /* synthetic */ C8721(int i) {
        this.f29973 = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f29973) {
            case 0:
                return new char[8192];
            case 1:
                return new C2093();
            default:
                int i = AbstractC22433.f73217;
                return new C4793();
        }
    }
}
