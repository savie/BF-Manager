package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6HP */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12130 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39004;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f39005;

    public /* synthetic */ C12130(int i, List list) {
        this.f39004 = i;
        this.f39005 = list;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f39004) {
            case 0:
                ((ArrayList) this.f39005).addAll(((C24927) obj).m55566());
                break;
            case 1:
                ((ArrayList) this.f39005).addAll(((InterfaceC23435) obj).mo1986());
                break;
            default:
                C4937.forEach(this.f39005, new C17271(1, (Map) obj));
                break;
        }
    }
}
