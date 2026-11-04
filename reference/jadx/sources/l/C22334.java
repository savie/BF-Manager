package l;

import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩷᩷᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22334 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15291 f72308;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72309;

    public /* synthetic */ C22334(C15291 c15291, int i) {
        this.f72308 = c15291;
        this.f72309 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        final C7660 c7660 = (C7660) obj;
        if (c7660.m20874() == 0) {
            int i = c7660.f67820;
            if (i > this.f72309) {
                c7660.f67820 = i - 1;
                this.f72308.f49997.m32299(new Supplier() { // from class: l.۫᩷᩺
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        StringBuilder sb = new StringBuilder("\tcell from ");
                        C7660 c7661 = c7660;
                        sb.append(c7661.f67820 + 1);
                        sb.append(" to ");
                        sb.append(c7661);
                        return sb.toString();
                    }
                });
            }
            c7660.m20870(2);
        }
    }
}
