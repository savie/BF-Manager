package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7CU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6555 extends AbstractC6741 {

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f22094;

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        m18209(EnumC20934.f68153.m47084() + " {");
        m18208(1);
        C0356.forEach(this.f22094, new Consumer() { // from class: l.ۘۚۤ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f13556.m18209((String) obj);
            }
        });
        m18227(1);
        m18209(l.d);
    }
}
