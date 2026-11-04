package l;

import android.content.ComponentCallbacks2;
import android.view.View;
import android.view.ViewParent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6P1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11555 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8585 f36340;

    public C11555(AbstractC8585 abstractC8585) {
        this.f36340 = abstractC8585;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC8585 m29070() {
        return this.f36340;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11555 m29068(InterfaceC11217 interfaceC11217) {
        return new C11555(interfaceC11217.getLifecycle());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m29071() {
        AbstractC8585 abstractC8585 = this.f36340;
        return abstractC8585 == null || abstractC8585.mo23076() != EnumC2619.DESTROYED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11555 m29069(C24132 c24132) {
        InterfaceC11217 interfaceC11217;
        C15243.m36590(c24132, "<this>");
        View view = c24132;
        while (true) {
            if (view == null) {
                interfaceC11217 = null;
                break;
            }
            Object tag = view.getTag(R.id.MT_Protector);
            interfaceC11217 = tag instanceof InterfaceC11217 ? (InterfaceC11217) tag : null;
            if (interfaceC11217 != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent == null) {
                Object tag2 = view.getTag(R.id.MT_Protector);
                parent = tag2 instanceof ViewParent ? (ViewParent) tag2 : null;
            }
            view = parent instanceof View ? (View) parent : null;
        }
        if (interfaceC11217 == null) {
            ComponentCallbacks2 componentCallbacks2M10534 = C3200.m10534(c24132.getContext());
            if (componentCallbacks2M10534 instanceof InterfaceC11217) {
                interfaceC11217 = (InterfaceC11217) componentCallbacks2M10534;
            }
        }
        return new C11555(interfaceC11217 != null ? interfaceC11217.getLifecycle() : null);
    }
}
