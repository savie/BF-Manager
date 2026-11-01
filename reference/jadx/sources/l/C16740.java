package l;

import android.view.MenuItem;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܽܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16740 implements InterfaceC21133, InterfaceC6627 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f53618;

    public /* synthetic */ C16740(Object obj, Object obj2) {
        this.f53617 = obj;
        this.f53618 = obj2;
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnLayoutChangeListenerC3333.m9910((ViewOnLayoutChangeListenerC3333) this.f53617, (DialogInterfaceC19356) this.f53618, menuItem);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m39301(int i, byte[] bArr) {
        C22918 c22918 = (C22918) this.f53617;
        AtomicInteger atomicInteger = (AtomicInteger) this.f53618;
        synchronized (c22918) {
            c22918.m50725(C12035.m29933(atomicInteger.incrementAndGet()));
            c22918.write(bArr, 0, i);
        }
    }

    @Override // l.InterfaceC6627
    /* JADX INFO: renamed from: ۙ */
    public void mo3852(C1313 c1313) {
        C17485 c17485 = (C17485) this.f53617;
        DialogInterfaceC19356 dialogInterfaceC19356 = (DialogInterfaceC19356) this.f53618;
        int i = ViewOnClickListenerC23604.f76463;
        C13465.m32966(c1313, "response");
        c17485.m40694();
        if (!c1313.m4686()) {
            C15829.m37613((CharSequence) C4820.m13401(c1313, R.string.MT_Protector));
        } else {
            C15829.m37611(R.string.MT_Protector);
            dialogInterfaceC19356.dismiss();
        }
    }
}
