package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1806 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6155;

    public /* synthetic */ C1806(int i) {
        this.f6155 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f6155) {
            case 0:
                ((C17467) obj).m39416();
                break;
            case 1:
                ((ActivityC0848) obj).m3456(R.layout.MT_Protector);
                break;
            default:
                ((InterfaceC10718) obj).getClass();
                break;
        }
    }
}
