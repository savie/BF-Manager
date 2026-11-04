package l;

import java.util.Set;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: l.۟֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6CM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7510 implements BiConsumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24813;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24814;

    public /* synthetic */ C7510(int i, Object obj) {
        this.f24813 = i;
        this.f24814 = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f24813) {
            case 0:
                C4937.forEach((Set) obj2, new C18697((C2551) this.f24814, (EnumC17315) obj));
                break;
            default:
                ((C24927) obj).m55580(((C23341) this.f24814).m52490(C23341.m52491((Set) obj2)));
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C23501.$default$andThen(this, biConsumer);
    }
}
