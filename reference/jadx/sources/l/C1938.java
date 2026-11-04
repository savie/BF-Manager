package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66DS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1938 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C6041 c6041;
        C17973 c17973M17530;
        AbstractC16481 abstractC16481 = (AbstractC16481) obj;
        abstractC16481.getClass();
        if (!(abstractC16481 instanceof C6041) || (c17973M17530 = (c6041 = (C6041) abstractC16481).m17530()) == null) {
            return;
        }
        c17973M17530.m41933(c6041);
        c6041.m17522();
    }
}
