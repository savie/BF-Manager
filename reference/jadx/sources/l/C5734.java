package l;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۚܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I22G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5734 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C25126 f19743;

    public C5734(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C11699 c11699 = new C11699(str, i, i2);
            C2005.m6846(i, i2, str);
            this.f19743 = c11699;
            return;
        }
        this.f19743 = new C25126(str, i, i2);
    }

    public C5734(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strM29371 = C11699.m29371(remoteUserInfo);
        if (strM29371 == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(strM29371)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f19743 = new C11699(remoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5734)) {
            return false;
        }
        return this.f19743.equals(((C5734) obj).f19743);
    }

    public final int hashCode() {
        return this.f19743.hashCode();
    }
}
