package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K7A5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5404 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18639;

    public /* synthetic */ C5404(int i) {
        this.f18639 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f18639) {
            case 0:
                break;
            default:
                int i = C23444.f75887;
                ((ActivityC5677) obj).m15664(R.layout.MT_Protector);
                break;
        }
    }
}
