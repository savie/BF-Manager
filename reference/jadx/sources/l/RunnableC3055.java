package l;

import android.content.DialogInterface;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import bin.mt.plus.Main;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3055 implements Runnable {

    /* JADX INFO: renamed from: ᩹ۜۡ, reason: not valid java name and contains not printable characters */
    public static int f9898;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Callable f9899;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Handler f9900;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC0818 f9901;

    /* JADX INFO: renamed from: ֡ܺ֡, reason: not valid java name and contains not printable characters */
    public static void m9929(Object obj) {
        ((Closeable) obj).close();
    }

    /* JADX INFO: renamed from: ۛۡܰ, reason: not valid java name and contains not printable characters */
    public static void m9930(Object obj, Object obj2, Object obj3) {
        ((AbstractActivityC17204) obj).m40401((Throwable) obj2, (DialogInterface.OnDismissListener) obj3);
    }

    /* JADX INFO: renamed from: ۟۠ܽ, reason: not valid java name and contains not printable characters */
    public static String m9931(Object obj, int i) {
        return ((String) obj).substring(i);
    }

    /* JADX INFO: renamed from: ۟ۨܰ, reason: not valid java name and contains not printable characters */
    public static Button m9932(Object obj) {
        return ((DialogInterfaceC8327) obj).m22436();
    }

    /* JADX INFO: renamed from: ܶ᩻᩻, reason: not valid java name and contains not printable characters */
    public static int m9933() {
        return 0;
    }

    /* JADX INFO: renamed from: ܺܿᩴ, reason: not valid java name and contains not printable characters */
    public static MenuItem m9934(Object obj, boolean z) {
        return ((MenuItem) obj).setChecked(z);
    }

    /* JADX INFO: renamed from: ܽۜܰ, reason: not valid java name and contains not printable characters */
    public static void m9935(Object obj, Object obj2) {
        ((C3374) obj).m11078((InterfaceC17544) obj2);
    }

    /* JADX INFO: renamed from: ܿ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static Iterator m9936(Object obj) {
        return ((Set) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩴᩴܽ, reason: not valid java name and contains not printable characters */
    public static String m9937(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩶᩷ܶ, reason: not valid java name and contains not printable characters */
    public static int m9938(Object obj) {
        return ((C13778) obj).m33681();
    }

    /* JADX INFO: renamed from: ᩷۟ۚ, reason: not valid java name and contains not printable characters */
    public static Main m9939(Object obj) {
        return ((C8614) obj).m23233();
    }

    /* JADX INFO: renamed from: ᩷᩻ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m9940(Object obj) {
        return ((AbstractC22044) obj).mo4304();
    }

    /* JADX INFO: renamed from: ᩸ۚܰ, reason: not valid java name and contains not printable characters */
    public static String m9941(Object obj) {
        return ((InterfaceC4859) obj).getName();
    }

    /* JADX INFO: renamed from: ᩸ܰܺ, reason: not valid java name and contains not printable characters */
    public static View m9942(Object obj, int i) {
        return ((AbstractActivityC17204) obj).m40395(i);
    }

    /* JADX INFO: renamed from: ᩻ۢ᩷, reason: not valid java name and contains not printable characters */
    public static String m9943(Object obj) {
        return C18282.m42441((AbstractC22044) obj);
    }

    /* JADX INFO: renamed from: ᩻᩹ۜ, reason: not valid java name and contains not printable characters */
    public static void m9944(Object obj, Object obj2) {
        ((CompoundButton) obj).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj2);
    }

    public RunnableC3055(Handler handler, Callable callable, InterfaceC0818 interfaceC0818) {
        this.f9899 = callable;
        this.f9901 = interfaceC0818;
        this.f9900 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = ((CallableC19463) this.f9899).call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f9900.post(new RunnableC23193(this.f9901, objCall));
    }
}
