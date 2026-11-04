package l;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7068 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23282;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f23283;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14454 f23284;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedCallback f23285;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public OnBackInvokedDispatcher f23286;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Runnable f23287;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC6323 f23288;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0685 m19400(AbstractC6323 abstractC6323) {
        C15243.m36590(abstractC6323, "onBackPressedCallback");
        this.f23284.addLast(abstractC6323);
        C9304 c9304 = new C9304(this, abstractC6323);
        abstractC6323.m18043(c9304);
        m19397();
        abstractC6323.m18044(new C8559(0, this, C7068.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
        return c9304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19402(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C15243.m36590(onBackInvokedDispatcher, "invoker");
        this.f23286 = onBackInvokedDispatcher;
        m19393(this.f23283);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19403(InterfaceC11217 interfaceC11217, AbstractC6323 abstractC6323) {
        C15243.m36590(interfaceC11217, "owner");
        C15243.m36590(abstractC6323, "onBackPressedCallback");
        AbstractC8585 lifecycle = interfaceC11217.getLifecycle();
        if (lifecycle.mo23076() == EnumC2619.DESTROYED) {
            return;
        }
        abstractC6323.m18043(new C1102(this, lifecycle, abstractC6323));
        m19397();
        abstractC6323.m18044(new C2593(0, this, C7068.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19401() {
        Object objPrevious;
        C14454 c14454 = this.f23284;
        ListIterator listIterator = c14454.listIterator(c14454.mo34920());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC6323) objPrevious).m18046());
        AbstractC6323 abstractC6323 = (AbstractC6323) objPrevious;
        this.f23288 = null;
        if (abstractC6323 != null) {
            abstractC6323.mo2768();
            return;
        }
        Runnable runnable = this.f23287;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C7068(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackM21285;
        this.f23287 = runnable;
        this.f23284 = new C14454();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackM21285 = C10050.f32231.m25985(new C24223(this), new C4085(this), new C14525(this), new C21239(this));
            } else {
                onBackInvokedCallbackM21285 = C7814.f26033.m21285(new C18255(this));
            }
            this.f23285 = onBackInvokedCallbackM21285;
        }
    }

    public C7068() {
        this(null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m19393(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f23286;
        OnBackInvokedCallback onBackInvokedCallback = this.f23285;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C7814 c7814 = C7814.f26033;
        if (z && !this.f23282) {
            c7814.m21286(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f23282 = true;
        } else {
            if (z || !this.f23282) {
                return;
            }
            c7814.m21287(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f23282 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19397() {
        boolean z = this.f23283;
        boolean z2 = false;
        C14454 c14454 = this.f23284;
        if (c14454 == null || !c14454.isEmpty()) {
            Iterator it = c14454.iterator();
            while (it.hasNext()) {
                if (((AbstractC6323) it.next()).m18046()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f23283 = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m19393(z2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m19398(C7068 c7068, C18584 c18584) {
        Object objPrevious;
        C14454 c14454 = c7068.f23284;
        ListIterator listIterator = c14454.listIterator(c14454.mo34920());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC6323) objPrevious).m18046());
        AbstractC6323 abstractC6323 = (AbstractC6323) objPrevious;
        c7068.f23288 = abstractC6323;
        if (abstractC6323 != null) {
            C15243.m36590(c18584, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m19392(C7068 c7068, C18584 c18584) {
        Object objPrevious;
        C14454 c14454 = c7068.f23284;
        ListIterator listIterator = c14454.listIterator(c14454.mo34920());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((AbstractC6323) objPrevious).m18046());
        if (((AbstractC6323) objPrevious) != null) {
            C15243.m36590(c18584, "backEvent");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final void m19394(C7068 c7068) {
        Object objPrevious;
        C14454 c14454 = c7068.f23284;
        ListIterator listIterator = c14454.listIterator(c14454.mo34920());
        while (listIterator.hasPrevious()) {
            objPrevious = listIterator.previous();
            if (((AbstractC6323) objPrevious).m18046()) {
                c7068.f23288 = null;
            }
        }
        objPrevious = null;
        c7068.f23288 = null;
    }
}
