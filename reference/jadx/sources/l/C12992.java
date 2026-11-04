package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ۡۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZV */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12992 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41642;

    public /* synthetic */ C12992(int i) {
        this.f41642 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f41642) {
            case 0:
                ((C2551) obj).m8544();
                break;
            default:
                ((ActivityC0848) obj).m3456(R.layout.MT_Protector);
                break;
        }
    }
}
