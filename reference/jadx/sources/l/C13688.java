package l;

import android.view.MenuItem;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13688 implements InterfaceC19795, InterfaceC2017, InterfaceC21436, InterfaceC17544, InterfaceC13258, InterfaceC18006 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43431;

    public /* synthetic */ C13688(Object obj) {
        this.f43431 = obj;
    }

    public /* synthetic */ C13688(C11041 c11041, C14368 c14368, C9893 c9893, IOException iOException, boolean z) {
        this.f43431 = c9893;
    }

    @Override // l.InterfaceC21436
    public boolean onMenuItemClick(MenuItem menuItem) {
        C23582.m52779((C23582) this.f43431, menuItem);
        return true;
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo968() {
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((InterfaceC24124) this.f43431).setProgress(i);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        C1965.m6766((C1965) this.f43431);
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC19992) obj).mo45983((C9893) this.f43431);
    }

    @Override // l.InterfaceC13258
    /* JADX INFO: renamed from: ۙ */
    public void mo969(C12512 c12512, BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write((byte[]) this.f43431);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        FutureC23690 futureC23690 = (FutureC23690) this.f43431;
        if (th == null) {
            futureC23690.m52935((Object) null);
        } else {
            futureC23690.m52937(th);
        }
    }
}
