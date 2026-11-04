package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6H9 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21103 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67394;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f67395;

    public /* synthetic */ C21103(int i, Object obj) {
        this.f67394 = i;
        this.f67395 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f67394) {
            case 0:
                ((Consumer) obj).accept((C2457) this.f67395);
                break;
            case 1:
                C15514 c15514 = (C15514) obj;
                C5492.m16316((InterfaceC3145) this.f67395, c15514.m37183(), c15514.m37182());
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f67395;
                String strM34865 = (String) obj;
                if (!strM34865.startsWith("// ==")) {
                    strM34865 = C14442.m34865("\"", strM34865, "\";");
                }
                arrayList.add(strM34865);
                break;
        }
    }
}
