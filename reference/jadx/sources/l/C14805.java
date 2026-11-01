package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14805 extends AbstractC10697 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f48400;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f48401;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21755 f48402;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23977 f48404;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Window.Callback f48405;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f48406;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f48407 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Runnable f48403 = new RunnableC12688(this);

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۖ */
    public final void mo13884(boolean z) {
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ܰ */
    public final void mo13897(boolean z) {
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ᩹ */
    public final void mo13899() {
    }

    public C14805(C6938 c6938, CharSequence charSequence, Window.Callback callback) {
        C17626 c17626 = new C17626(this);
        c6938.getClass();
        C21755 c21755 = new C21755(c6938, false);
        this.f48402 = c21755;
        callback.getClass();
        this.f48405 = callback;
        c21755.mo44625(callback);
        c6938.setOnMenuItemClickListener(c17626);
        c21755.mo44626(charSequence);
        this.f48404 = new C23977(this);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۖ */
    public final Context mo13883() {
        return this.f48402.getContext();
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ */
    public final void mo13888(Drawable drawable) {
        this.f48402.mo44623(drawable);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ */
    public final void mo13887(int i) {
        this.f48402.mo44633(i);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ */
    public final void mo13889(CharSequence charSequence) {
        this.f48402.mo44626(charSequence);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۨ */
    public final void mo13895(boolean z) {
        int i = z ? 4 : 0;
        C21755 c21755 = this.f48402;
        c21755.mo44622((i & 4) | (c21755.mo44630() & (-5)));
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۨ */
    public final int mo13894() {
        return this.f48402.mo44630();
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo26903() {
        return this.f48402.mo44631();
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo26900() {
        return this.f48402.mo44634();
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo26902() {
        C21755 c21755 = this.f48402;
        C6938 c6938M48520 = c21755.m48520();
        Runnable runnable = this.f48403;
        c6938M48520.removeCallbacks(runnable);
        C6938 c6938M48521 = c21755.m48520();
        int i = C5031.f17539;
        c6938M48521.postOnAnimation(runnable);
        return true;
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13898() {
        C21755 c21755 = this.f48402;
        if (!c21755.mo44618()) {
            return false;
        }
        c21755.collapseActionView();
        return true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m35481() {
        Window.Callback callback = this.f48405;
        Menu menuM35480 = m35480();
        C12418 c12418 = menuM35480 instanceof C12418 ? (C12418) menuM35480 : null;
        if (c12418 != null) {
            c12418.stopDispatchingItemsChanged();
        }
        try {
            menuM35480.clear();
            if (!callback.onCreatePanelMenu(0, menuM35480) || !callback.onPreparePanel(0, null, menuM35480)) {
                menuM35480.clear();
            }
        } finally {
            if (c12418 != null) {
                c12418.startDispatchingItemsChanged();
            }
        }
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo26901(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo26903();
        }
        return true;
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13891(int i, KeyEvent keyEvent) {
        Menu menuM35480 = m35480();
        if (menuM35480 == null) {
            return false;
        }
        menuM35480.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM35480.performShortcut(i, keyEvent, 0);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ֨ */
    public final void mo26899() {
        this.f48402.m48520().removeCallbacks(this.f48403);
    }

    @Override // l.AbstractC10697
    /* JADX INFO: renamed from: ۙ */
    public final void mo13890(boolean z) {
        if (z == this.f48406) {
            return;
        }
        this.f48406 = z;
        ArrayList arrayList = this.f48407;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC5757) arrayList.get(i)).m15850();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private Menu m35480() {
        boolean z = this.f48401;
        C21755 c21755 = this.f48402;
        if (!z) {
            c21755.m48519(new C6337(this), new C11277(this));
            this.f48401 = true;
        }
        return c21755.m48521();
    }
}
