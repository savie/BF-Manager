package l;

import java.util.LinkedHashSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: AIYD */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10886 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34458;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34459;

    public /* synthetic */ C10886(int i, Object obj) {
        this.f34458 = i;
        this.f34459 = obj;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f34458) {
            case 0:
                C22821.m51447((LinkedHashSet) this.f34459, (AbstractC16481) obj);
                break;
            default:
                ((C7150) this.f34459).m19719((C6041) obj);
                break;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
