package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C7199 extends AbstractC2944 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20866 f23767;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Window.Callback f23768;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8690 f23769;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f23770;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f23771 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Runnable f23772 = new RunnableC10181(this);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f23773;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f23774;

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ܳ */
    public final void mo9635() {
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9637(boolean z) {
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩸ */
    public final void mo9640(boolean z) {
    }

    public C7199(C16390 c16390, CharSequence charSequence, Window.Callback callback) {
        C1233 c1233 = new C1233(this);
        c16390.getClass();
        C20866 c20866 = new C20866(c16390, false);
        this.f23767 = c20866;
        callback.getClass();
        this.f23768 = callback;
        c20866.mo18338(callback);
        c16390.setOnMenuItemClickListener(c1233);
        c20866.mo18339(charSequence);
        this.f23769 = new C8690(this);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩸ */
    public final Context mo9639() {
        return this.f23767.getContext();
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9625(Drawable drawable) {
        this.f23767.mo18336(drawable);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9624(int i) {
        this.f23767.mo18348(i);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9626(CharSequence charSequence) {
        this.f23767.mo18339(charSequence);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۤ */
    public final void mo9633(boolean z) {
        int i = z ? 4 : 0;
        C20866 c20866 = this.f23767;
        c20866.mo18335((i & 4) | (c20866.mo18344() & (-5)));
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۤ */
    public final int mo9632() {
        return this.f23767.mo18344();
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo9631() {
        return this.f23767.mo18343();
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9628() {
        return this.f23767.mo18349();
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo9636() {
        C20866 c20866 = this.f23767;
        C16390 c16390M47693 = c20866.m47693();
        Runnable runnable = this.f23772;
        c16390M47693.removeCallbacks(runnable);
        C16390 c16390M47694 = c20866.m47693();
        int i = C22666.f73603;
        c16390M47694.postOnAnimation(runnable);
        return true;
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo9638() {
        C20866 c20866 = this.f23767;
        if (!c20866.mo18345()) {
            return false;
        }
        c20866.collapseActionView();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19788() {
        Window.Callback callback = this.f23768;
        Menu menuM19787 = m19787();
        C9898 c9898 = menuM19787 instanceof C9898 ? (C9898) menuM19787 : null;
        if (c9898 != null) {
            c9898.stopDispatchingItemsChanged();
        }
        try {
            menuM19787.clear();
            if (!callback.onCreatePanelMenu(0, menuM19787) || !callback.onPreparePanel(0, null, menuM19787)) {
                menuM19787.clear();
            }
        } finally {
            if (c9898 != null) {
                c9898.startDispatchingItemsChanged();
            }
        }
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9630(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo9631();
        }
        return true;
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9629(int i, KeyEvent keyEvent) {
        Menu menuM19787 = m19787();
        if (menuM19787 == null) {
            return false;
        }
        menuM19787.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuM19787.performShortcut(i, keyEvent, 0);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۫ */
    public final void mo9634() {
        this.f23767.m47693().removeCallbacks(this.f23772);
    }

    @Override // l.AbstractC2944
    /* JADX INFO: renamed from: ۙ */
    public final void mo9627(boolean z) {
        if (z == this.f23773) {
            return;
        }
        this.f23773 = z;
        ArrayList arrayList = this.f23771;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9655) arrayList.get(i)).m25172();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Menu m19787() {
        boolean z = this.f23774;
        C20866 c20866 = this.f23767;
        if (!z) {
            c20866.m47692(new C9435(this), new C2724(this));
            this.f23774 = true;
        }
        return c20866.m47694();
    }
}
