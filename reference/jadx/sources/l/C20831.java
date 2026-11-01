package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20831 implements Consumer {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12738 f67694;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67695;

    public /* synthetic */ C20831(C12738 c12738, int i) {
        this.f67694 = c12738;
        this.f67695 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C15187 c15187 = (C15187) obj;
        if (c15187.m36401() == 0) {
            int i = c15187.f43854;
            if (i > this.f67695) {
                c15187.f43854 = i - 1;
                this.f67694.f42485.m2152(new C12365(0, c15187));
            }
            c15187.m36399(2);
        }
    }
}
