package l;

import android.view.MenuItem;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.᩺۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C22862 implements InterfaceC7359, InterfaceC17547, InterfaceC18848, InterfaceC2288, InterfaceC21133, InterfaceC3002, InterfaceC22856 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74364;

    public /* synthetic */ C22862(Object obj) {
        this.f74364 = obj;
    }

    @Override // l.InterfaceC2288
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        C5921 c5921 = (C5921) this.f74364;
        C23561.m51924(c5921.f20182, c5921);
        return true;
    }

    @Override // l.InterfaceC3002
    /* JADX INFO: renamed from: ۙ */
    public void mo8963(InterfaceC9354 interfaceC9354) {
        ((ConcurrentLinkedQueue) this.f74364).add(interfaceC9354);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC19333) obj).mo2607((C14395) this.f74364);
    }

    @Override // l.InterfaceC22856
    /* JADX INFO: renamed from: ۙ */
    public InputStream mo16306(int i) {
        return new ByteArrayInputStream((byte[]) this.f74364);
    }

    @Override // l.InterfaceC6258
    /* JADX INFO: renamed from: ۙ */
    public void mo4798(AbstractC20745 abstractC20745) {
        abstractC20745.m46735((String) this.f74364);
    }

    @Override // l.InterfaceC2288
    /* JADX INFO: renamed from: ܰ */
    public AbstractC11462 mo2001(int i) {
        return new C20098(((AbstractC20745) this.f74364).mo33986(), i, 0L, 0L);
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        new C12362(((C11545) this.f74364).m28824(), abstractC20745).m30773();
    }
}
