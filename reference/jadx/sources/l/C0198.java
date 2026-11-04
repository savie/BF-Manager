package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6I0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0198 implements Consumer {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C1170.removeIf(((C12971) obj).m32368(), new C18218(5));
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }
}
