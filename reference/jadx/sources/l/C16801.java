package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W856 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16801 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54213;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54214;

    public /* synthetic */ C16801(int i, Object obj) {
        this.f54213 = i;
        this.f54214 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f54213) {
            case 0:
                ((ArrayList) this.f54214).addAll(((InterfaceC23435) obj).mo1986());
                break;
            default:
                ((C2551) this.f54214).m8502((C11785) obj);
                break;
        }
    }
}
