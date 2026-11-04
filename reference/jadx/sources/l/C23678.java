package l;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class C23678 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22888 f76776;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f76777;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f76778;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC13191 f76779;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f76780;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f76781 = new HashMap();

    public C23678(AbstractServiceC13191 abstractServiceC13191, String str, int i, int i2, C19904 c19904) {
        this.f76779 = abstractServiceC13191;
        this.f76777 = str;
        this.f76780 = i;
        this.f76778 = i2;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C2005.m6846(i, i2, str);
        }
        this.f76776 = c19904;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f76779.f42130.post(new RunnableC16218(this));
    }
}
