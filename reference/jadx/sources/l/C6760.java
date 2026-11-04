package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۛ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7CU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6760 extends AbstractC20997 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f22559;

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        m48013(EnumC5202.f18164.m15637() + " {");
        m48012(1);
        C4937.forEach(this.f22559, new Consumer() { // from class: l.ۨ᩻᩺
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f40753.m48013((String) obj);
            }
        });
        m48008(1);
        m48013(l.d);
    }
}
