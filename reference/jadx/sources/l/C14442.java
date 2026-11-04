package l;

import android.content.DialogInterface;
import com.alipay.sdk.m.t0.b;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ܰ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8QF */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14442 implements InterfaceC19795, InterfaceC22615 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34863(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34864(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34865(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static DialogInterfaceC8327 m34866(C2361 c2361, int i, DialogInterface.OnClickListener onClickListener, int i2, DialogInterface.OnClickListener onClickListener2) {
        c2361.m8026(i, onClickListener);
        c2361.m8022(i2, onClickListener2);
        return c2361.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34867(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    @Override // l.InterfaceC22615
    public Object construct() {
        return new TreeSet();
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC10582) obj).mo7225(C18566.m43144(new C24667("Player release timed out."), b.d));
    }
}
