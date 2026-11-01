package l;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14494 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14378 f47480;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC19432 f47481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f47482;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedDispatcher f47483;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f47484;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Runnable f47485;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public OnBackInvokedCallback f47486;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16672 m34905(AbstractC19432 abstractC19432) {
        C13465.m32966(abstractC19432, "onBackPressedCallback");
        this.f47480.addLast(abstractC19432);
        C6026 c6026 = new C6026(this, abstractC19432);
        abstractC19432.m44474(c6026);
        m34903();
        abstractC19432.m44473(new C23666(0, this, C14494.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V"));
        return c6026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34907(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C13465.m32966(onBackInvokedDispatcher, "invoker");
        this.f47483 = onBackInvokedDispatcher;
        m34899(this.f47484);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34908(InterfaceC1423 interfaceC1423, AbstractC19432 abstractC19432) {
        C13465.m32966(interfaceC1423, "owner");
        C13465.m32966(abstractC19432, "onBackPressedCallback");
        AbstractC3062 lifecycle = interfaceC1423.getLifecycle();
        if (lifecycle.mo9170() == EnumC9414.DESTROYED) {
            return;
        }
        abstractC19432.m44474(new C17315(this, lifecycle, abstractC19432));
        m34903();
        abstractC19432.m44473(new C10966(0, this, C14494.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34906() {
        Object objPrevious;
        C14378 c14378 = this.f47480;
        ListIterator listIterator = c14378.listIterator(c14378.mo27204());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC19432) objPrevious).m44476());
        AbstractC19432 abstractC19432 = (AbstractC19432) objPrevious;
        this.f47481 = null;
        if (abstractC19432 != null) {
            abstractC19432.mo4707();
            return;
        }
        Runnable runnable = this.f47485;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C14494(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM2115;
        this.f47485 = runnable;
        this.f47480 = new C14378();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM2115 = C12377.f41365.m30792(new C8849(this), new C10260(this), new C7437(this), new C20843(this));
            } else {
                onBackInvokedCallbackM2115 = C0381.f1861.m2115(new C15905(this));
            }
            this.f47486 = onBackInvokedCallbackM2115;
        }
    }

    public C14494() {
        this(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m34899(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f47483;
        OnBackInvokedCallback onBackInvokedCallback = this.f47486;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0381 c0381 = C0381.f1861;
        if (z && !this.f47482) {
            c0381.m2116(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f47482 = true;
        } else {
            if (z || !this.f47482) {
                return;
            }
            c0381.m2117(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f47482 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34903() {
        boolean z = this.f47484;
        boolean z2 = false;
        C14378 c14378 = this.f47480;
        if (c14378 == null || !c14378.isEmpty()) {
            Iterator it = c14378.iterator();
            while (it.hasNext()) {
                if (((AbstractC19432) it.next()).m44476()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f47484 = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m34899(z2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m34904(C14494 c14494, C0443 c0443) {
        Object objPrevious;
        C14378 c14378 = c14494.f47480;
        ListIterator listIterator = c14378.listIterator(c14378.mo27204());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC19432) objPrevious).m44476());
        AbstractC19432 abstractC19432 = (AbstractC19432) objPrevious;
        c14494.f47481 = abstractC19432;
        if (abstractC19432 != null) {
            C13465.m32966(c0443, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m34898(C14494 c14494, C0443 c0443) {
        Object objPrevious;
        C14378 c14378 = c14494.f47480;
        ListIterator listIterator = c14378.listIterator(c14378.mo27204());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC19432) objPrevious).m44476());
        if (((AbstractC19432) objPrevious) != null) {
            C13465.m32966(c0443, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final void m34901(C14494 c14494) {
        Object objPrevious;
        C14378 c14378 = c14494.f47480;
        ListIterator listIterator = c14378.listIterator(c14378.mo27204());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (((AbstractC19432) objPrevious).m44476()) {
                c14494.f47481 = null;
            }
        }
        objPrevious = null;
        c14494.f47481 = null;
    }
}
