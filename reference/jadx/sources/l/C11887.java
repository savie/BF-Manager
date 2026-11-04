package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B6EY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11887 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        C21943 c21943 = (C21943) obj;
        C18959 c18959M52200 = C23231.m52200((InterfaceC23435) c21943);
        if (c18959M52200 instanceof AbstractC9284) {
            ((AbstractC9284) c18959M52200).mo4068(c21943);
        }
    }
}
