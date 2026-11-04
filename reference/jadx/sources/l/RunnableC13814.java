package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۬ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB32 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13814 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43799;

    public /* synthetic */ RunnableC13814(int i) {
        this.f43799 = i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۚܳۚ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43799) {
            case 0:
                C5261.m15833();
                break;
            case 1:
                C17085.m40235();
                break;
            case 2:
                C2564.m8614();
                break;
            default:
                int i = ServiceC6459.f21716;
                try {
                    final C3475 c3475 = new C3475();
                    int i2 = C11678.f37828;
                    C1897.m6528((C5713) new Supplier() { // from class: l.ۚܳۚ
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return C11678.m29353(c3475);
                        }
                    });
                } catch (Exception e) {
                    C20653.m47272("MT MCP workspace cleanup failed", e);
                }
                break;
        }
    }
}
