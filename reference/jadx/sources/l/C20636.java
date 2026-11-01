package l;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20636 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10053 f67195;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set f67196;

    public C20636(Context context, C22316 c22316) {
        if (c22316 == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f67196 = C0561.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f67195 = new C7230(context, c22316);
        } else {
            this.f67195 = new C10053(context, c22316);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46500(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        this.f67195.f34347.dispatchMediaButtonEvent(keyEvent);
    }
}
