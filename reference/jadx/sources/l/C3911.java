package l;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3911 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6149 f13371;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Set f13372;

    public C3911(Context context, C15600 c15600) {
        if (c15600 == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f13372 = C4681.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13371 = new C24049(context, c15600);
        } else {
            this.f13371 = new C6149(context, c15600);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12619(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        this.f13371.f20982.dispatchMediaButtonEvent(keyEvent);
    }
}
