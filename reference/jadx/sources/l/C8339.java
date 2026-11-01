package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7M1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8339 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        C22492 c22492 = (C22492) abstractC23903;
        C7675 c7675M52724 = abstractC23903.m52724();
        c22492.f77448 = c7675M52724;
        c7675M52724.mo49994();
        c7675M52724.f25395.mo24224(abstractC23903);
        c22492.f73419 = abstractC23903.mo50003();
        c22492.f77453 = C17281.m40243(abstractC23903.mo50003());
        c22492.m49996();
    }
}
