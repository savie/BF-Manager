package l;

import android.graphics.Bitmap;
import android.view.MenuItem;
import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ܺܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UQ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16041 implements InterfaceC4031, InterfaceC16464, InterfaceC21133, InterfaceC7728, Consumer, InterfaceC21921 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51919;

    public /* synthetic */ C16041(Object obj) {
        this.f51919 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo42471accept(Object obj) {
        ((LoadingDialog) this.f51919).lambda$new$1((CharSequence) obj);
    }

    @Override // l.InterfaceC21133
    public boolean onMenuItemClick(MenuItem menuItem) {
        C4677.m12955((C4677) this.f51919, menuItem);
        return true;
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((InterfaceC16261) this.f51919).mo15795(i);
    }

    @Override // l.InterfaceC4031
    /* JADX INFO: renamed from: ۙ */
    public void mo11533(C6854 c6854) {
        ((C6936) this.f51919).f23327.m28765();
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public Bitmap mo947() {
        return C5443.m15048((C3555) this.f51919);
    }

    @Override // l.InterfaceC7728
    /* JADX INFO: renamed from: ۙ */
    public void mo11010(C16195 c16195) {
        C16195[] c16195Arr = (C16195[]) this.f51919;
        if (c16195Arr[0] == c16195) {
            c16195Arr[0] = null;
        }
    }
}
