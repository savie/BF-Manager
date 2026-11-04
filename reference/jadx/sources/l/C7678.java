package l;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۟ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6H9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7678 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25272;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f25273;

    public /* synthetic */ C7678(int i, Object obj) {
        this.f25272 = i;
        this.f25273 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f25272) {
            case 0:
                ((ArrayList) this.f25273).add((C2457) obj);
                break;
            default:
                ((Map) obj).remove((InterfaceC2157) this.f25273);
                break;
        }
    }
}
