package l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36DM */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21747 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69357;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16678 f69358;

    public /* synthetic */ C21747(AbstractC16678 abstractC16678, int i) {
        this.f69357 = i;
        this.f69358 = abstractC16678;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f69357) {
            case 0:
                C1610.m5661((C1610) this.f69358, (Map.Entry) obj);
                break;
            default:
                C21943 c21943 = (C21943) this.f69358;
                C21943 c21944 = (C21943) obj;
                if (c21943.m49651().get(c21944.getId()) || c21943 == c21944) {
                    c21944.mo17866(EnumC1763.LOOP_START);
                    c21943.mo17866(EnumC1763.LOOP_END);
                    C11785 c11785 = new C11785(c21944, c21943, C23231.m52150(c21944, c21943));
                    C11457 c11457 = C11457.f36019;
                    c21944.mo17863(c11457, c11785);
                    c21943.mo17863(c11457, c11785);
                }
                break;
        }
    }
}
