package l;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۧ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11260 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashMap f38062 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9039 f38063;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC21032 f38064;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f38065;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38066;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38067;

    public C11260(AbstractServiceC21032 abstractServiceC21032, String str, int i, int i2, C10450 c10450) {
        this.f38064 = abstractServiceC21032;
        this.f38065 = str;
        this.f38066 = i;
        this.f38067 = i2;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C20327.m45874(i, i2, str);
        }
        this.f38063 = c10450;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f38064.f68501.post(new RunnableC6320(this));
    }
}
