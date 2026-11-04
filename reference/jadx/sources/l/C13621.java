package l;

import java.util.BitSet;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6FB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13621 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C21943 c21943 = (C21943) obj;
        c21943.m39419(C11457.f36019);
        c21943.m39418(EnumC1763.LOOP_START);
        c21943.m39418(EnumC1763.LOOP_END);
        c21943.m49649((BitSet) null);
        c21943.m49641((C21943) null);
        c21943.m49634((BitSet) null);
        c21943.m49636().clear();
    }
}
