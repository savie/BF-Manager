package l;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ܺᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: I22G */
/* JADX INFO: loaded from: classes4.dex */
public final class C16094 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16799 f52040;

    public C16094(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C0570 c0570 = new C0570(str, i, i2);
            C20327.m45874(i, i2, str);
            this.f52040 = c0570;
            return;
        }
        this.f52040 = new C16799(str, i, i2);
    }

    public C16094(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strM2670 = C0570.m2670(remoteUserInfo);
        if (strM2670 == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(strM2670)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f52040 = new C0570(remoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16094)) {
            return false;
        }
        return this.f52040.equals(((C16094) obj).f52040);
    }

    public final int hashCode() {
        return this.f52040.hashCode();
    }
}
