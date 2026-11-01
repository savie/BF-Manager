package l;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8184 implements InterfaceC21839 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC8890 f28531;

    public C8184(ViewOnKeyListenerC8890 viewOnKeyListenerC8890) {
        this.f28531 = viewOnKeyListenerC8890;
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21477(C12418 c12418, MenuItem menuItem) {
        this.f28531.f30461.removeCallbacksAndMessages(c12418);
    }

    @Override // l.InterfaceC21839
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo21478(C12418 c12418, C23707 c23707) {
        ViewOnKeyListenerC8890 viewOnKeyListenerC8890 = this.f28531;
        Handler handler = viewOnKeyListenerC8890.f30461;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC8890.f30466;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c12418 == ((C19473) arrayList.get(i)).f62690) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC18767(this, i2 < arrayList.size() ? (C19473) arrayList.get(i2) : null, c23707, c12418), c12418, SystemClock.uptimeMillis() + 200);
    }
}
