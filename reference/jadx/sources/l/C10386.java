package l;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۢ᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10386 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ C10386 f33024 = new C10386();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC9640 f33025;

    static {
        C16735.m39514(InterfaceC1438.class).m33198();
        f33025 = C18834.f61191;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7404 m26697(Context context) {
        InterfaceC8150 c2426;
        C10803 c10803 = C10803.f34284;
        C14861 c14861 = null;
        try {
            C2184.f7187.getClass();
            WindowLayoutComponent windowLayoutComponentM7488 = C2184.m7488();
            c2426 = windowLayoutComponentM7488 == null ? null : new C2426(windowLayoutComponentM7488);
        } catch (Throwable unused) {
        }
        if (c2426 == null) {
            if (C0692.f2595 == null) {
                ReentrantLock reentrantLock = C0692.f2596;
                reentrantLock.lock();
                try {
                    if (C0692.f2595 == null) {
                        try {
                            C14358 c14358M11968 = C3675.m11968();
                            if (c14358M11968 != null && c14358M11968.compareTo(C14358.f45276) >= 0) {
                                C14861 c14862 = new C14861(context);
                                if (c14862.m35802()) {
                                    c14861 = c14862;
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        C0692.f2595 = new C0692(c14861);
                    }
                    C11471 c11471 = C11471.f36082;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            c2426 = C0692.f2595;
            C15243.m36586(c2426);
        }
        C7404 c7404 = new C7404(c10803, c2426);
        ((C18834) f33025).getClass();
        return c7404;
    }
}
