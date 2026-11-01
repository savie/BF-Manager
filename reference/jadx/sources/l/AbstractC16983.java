package l;

import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: l.ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16983 {
    public AbstractC16983() {
        new Binder();
        if (Build.VERSION.SDK_INT >= 26) {
            new C12045(this);
        } else {
            new C16278(this);
        }
    }
}
