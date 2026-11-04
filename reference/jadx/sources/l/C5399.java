package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5399 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18891;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18892;

    public /* synthetic */ C5399(int i, Object obj) {
        this.f18891 = i;
        this.f18892 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f18891) {
            case 0:
                return C7941.m21576((C7941) this.f18892);
            default:
                return ((AbstractC19728) this.f18892).toString();
        }
    }
}
