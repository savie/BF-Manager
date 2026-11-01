package l;

import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10551 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16195 f36131;

    public C10551(C16195 c16195) {
        this.f36131 = c16195;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C16195 c16195 = this.f36131;
        InterfaceC7728 interfaceC7728 = c16195.f52291;
        if (interfaceC7728 != null) {
            interfaceC7728.mo11010(c16195);
        }
    }
}
