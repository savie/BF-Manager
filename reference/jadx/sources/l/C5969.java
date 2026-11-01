package l;

import android.content.ContextWrapper;
import android.os.Build;

/* JADX INFO: renamed from: l.ۛۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C5969 implements InterfaceC9498 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f20325;

    public C5969(ContextWrapper contextWrapper) {
        this.f20325 = contextWrapper;
    }

    @Override // l.InterfaceC9498
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544 mo16259(C1735 c1735) {
        ContextWrapper contextWrapper;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (i >= 31 || ((contextWrapper = this.f20325) != null && i >= 28 && contextWrapper.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iM17981 = C6632.m17981(c1735.f6853.f25265);
            C0303.m1851("Creating an asynchronous MediaCodec adapter for track type " + C17983.m41864(iM17981));
            return new C7380(new C8792(iM17981), new C10203(iM17981)).mo16259(c1735);
        }
        return new C16366().mo16259(c1735);
    }
}
