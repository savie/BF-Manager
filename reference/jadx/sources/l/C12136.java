package l;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes4.dex */
public final class C12136 implements InterfaceC23674 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC24071 f39031;

    public C12136(ViewOnKeyListenerC24071 viewOnKeyListenerC24071) {
        this.f39031 = viewOnKeyListenerC24071;
    }

    @Override // l.InterfaceC23674
    /* JADX INFO: renamed from: ۙ */
    public final void mo18397(C9898 c9898, MenuItem menuItem) {
        this.f39031.f77837.removeCallbacksAndMessages(c9898);
    }

    @Override // l.InterfaceC23674
    /* JADX INFO: renamed from: ۙ */
    public final void mo18398(C9898 c9898, C8407 c8407) {
        ViewOnKeyListenerC24071 viewOnKeyListenerC24071 = this.f39031;
        Handler handler = viewOnKeyListenerC24071.f77837;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC24071.f77830;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c9898 == ((C6171) arrayList.get(i)).f21023) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC20341(this, i2 < arrayList.size() ? (C6171) arrayList.get(i2) : null, c8407, c9898), c9898, SystemClock.uptimeMillis() + 200);
    }
}
