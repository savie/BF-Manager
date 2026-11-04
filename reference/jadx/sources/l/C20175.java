package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ᩴ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20175 implements InterfaceC12314 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Uri f64791;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21132 f64792;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f64793;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f64794;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Main f64795;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3347 f64796;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18148 f64797;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f64798;

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo29778(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ void mo29779(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ void mo29781(InterfaceC11217 interfaceC11217) {
    }

    public C20175(Main main, C21132 c21132, C18148 c18148) {
        this.f64795 = main;
        this.f64792 = c21132;
        this.f64797 = c18148;
        this.f64796 = C12296.m30693(main, new C8114(this));
        main.getSavedStateRegistry().m36621("web_preview_edit_handoff", new InterfaceC19742() { // from class: l.᩸᩻ܳ
            @Override // l.InterfaceC19742
            /* JADX INFO: renamed from: ۙ */
            public final Bundle mo14860() {
                return C20175.m46418(this.f75051);
            }
        });
        main.getLifecycle().mo23077(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46420(C20175 c20175, int i, Intent intent) {
        if (i != -1 || intent == null || intent.getData() == null) {
            return;
        }
        c20175.f64791 = intent.getData();
        c20175.f64793 = Main.m99(c20175.f64792.f67509);
        c20175.m46419();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Bundle m46418(C20175 c20175) {
        Bundle bundle = new Bundle();
        Uri uri = c20175.f64791;
        if (uri != null) {
            bundle.putString("file", uri.toString());
        }
        String str = c20175.f64793;
        if (str != null) {
            bundle.putString("highlight", str);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46421(Intent intent) {
        this.f64791 = null;
        this.f64796.m10999(intent);
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۙ */
    public final void mo29776(InterfaceC11217 interfaceC11217) {
        Bundle bundleM36619 = this.f64795.getSavedStateRegistry().m36619("web_preview_edit_handoff");
        String string = bundleM36619 == null ? null : bundleM36619.getString("file");
        if (string != null) {
            this.f64791 = Uri.parse(string);
        }
        this.f64793 = bundleM36619 != null ? bundleM36619.getString("highlight") : null;
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩷ */
    public final void mo29780(InterfaceC11217 interfaceC11217) {
        this.f64794 = true;
        if (this.f64791 != null) {
            m46419();
            return;
        }
        String str = this.f64793;
        this.f64793 = null;
        if (str != null) {
            this.f64797.n(str);
        }
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۤ */
    public final void mo29777(InterfaceC11217 interfaceC11217) {
        this.f64794 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46422(boolean z) {
        this.f64798 = z;
        m46419();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46419() {
        if (this.f64791 != null && this.f64794 && this.f64798) {
            Main main = this.f64795;
            if (main.isFinishing() || main.isDestroyed() || main.m11155().m10487()) {
                return;
            }
            Uri uri = this.f64791;
            this.f64791 = null;
            try {
                main.startActivity(new Intent(main, (Class<?>) ActivityC18143.class).setAction("android.intent.action.VIEW").setData(uri));
            } catch (RuntimeException e) {
                String str = this.f64793;
                this.f64793 = null;
                if (str != null) {
                    this.f64797.n(str);
                }
                main.m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
