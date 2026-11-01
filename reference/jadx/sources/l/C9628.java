package l;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۢܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9628 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ C9628 f32416 = new C9628();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4625 f32417;

    static {
        C12759.m31709(InterfaceC3276.class).m52744();
        f32417 = C1596.f6453;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2508 m24531(Context context) {
        InterfaceC14567 c13861;
        C13093 c13093 = C13093.f43601;
        C17388 c17388 = null;
        try {
            C18093.f57858.getClass();
            WindowLayoutComponent windowLayoutComponentM42079 = C18093.m42079();
            c13861 = windowLayoutComponentM42079 == null ? null : new C13861(windowLayoutComponentM42079);
        } catch (Throwable unused) {
        }
        if (c13861 == null) {
            if (C23739.f76804 == null) {
                ReentrantLock reentrantLock = C23739.f76803;
                reentrantLock.lock();
                try {
                    if (C23739.f76804 == null) {
                        try {
                            C17119 c17119M47018 = C20916.m47018();
                            if (c17119M47018 != null && c17119M47018.compareTo(C17119.f54584) >= 0) {
                                C17388 c17389 = new C17388(context);
                                if (c17389.m40509()) {
                                    c17388 = c17389;
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        C23739.f76804 = new C23739(c17388);
                    }
                    C7321 c7321 = C7321.f24318;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            c13861 = C23739.f76804;
            C13465.m32962(c13861);
        }
        C2508 c2508 = new C2508(c13093, c13861);
        ((C1596) f32417).getClass();
        return c2508;
    }
}
