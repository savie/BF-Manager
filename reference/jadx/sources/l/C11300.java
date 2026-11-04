package l;

import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: M7E7 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11300 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35615;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35616;

    public /* synthetic */ C11300(int i, int i2) {
        this.f35615 = i2;
        this.f35616 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f35615) {
            case 0:
                ((InterfaceC10838) obj).mo12383(this.f35616);
                break;
            default:
                ArrayList arrayList = (ArrayList) ((C21943) obj).mo1986();
                int size = arrayList.size();
                arrayList.subList(size - this.f35616, size).clear();
                break;
        }
    }
}
