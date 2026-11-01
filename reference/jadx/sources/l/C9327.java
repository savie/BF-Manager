package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes3.dex */
public final class C9327 extends AbstractViewOnTouchListenerC9658 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2975 f31670;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9327(C2975 c2975, View view) {
        super(view);
        this.f31670 = c2975;
    }

    @Override // l.AbstractViewOnTouchListenerC9658
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6503 mo23973() {
        C4469 c4469 = this.f31670.f11144.f17952;
        if (c4469 == null) {
            return null;
        }
        return c4469.m6962();
    }

    @Override // l.AbstractViewOnTouchListenerC9658
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo23975() {
        this.f31670.f11144.m14343();
        return true;
    }

    @Override // l.AbstractViewOnTouchListenerC9658
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo23974() {
        C5175 c5175 = this.f31670.f11144;
        if (c5175.f17954 != null) {
            return false;
        }
        c5175.m14342();
        return true;
    }
}
