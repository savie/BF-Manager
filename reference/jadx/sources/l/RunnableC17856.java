package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩳۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17856 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56548;

    public /* synthetic */ RunnableC17856(int i) {
        this.f56548 = i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ۖ᩻֨] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f56548) {
            case 0:
                C5301.m14717();
                break;
            default:
                int i = ServiceC8498.f29454;
                try {
                    final C21903 c21903 = new C21903(0);
                    int i2 = C22609.f73678;
                    C7845.m20692((C2852) new Supplier() { // from class: l.ۖ᩻֨
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return C22609.m50121(c21903);
                        }
                    });
                } catch (Exception e) {
                    C0577.m2747("MT MCP workspace cleanup failed", e);
                }
                break;
        }
    }
}
