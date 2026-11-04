package l;

import java.util.BitSet;
import java.util.IdentityHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6F5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16853 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54334;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2551 f54335;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54336;

    public /* synthetic */ C16853(Object obj, C2551 c2551, int i) {
        this.f54334 = i;
        this.f54336 = obj;
        this.f54335 = c2551;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f54334) {
            case 0:
                C16107.m38267((C16107) this.f54336, this.f54335, (C18959) obj);
                break;
            default:
                ((IdentityHashMap) this.f54336).put((C21943) obj, new BitSet(this.f54335.m8518()));
                break;
        }
    }
}
