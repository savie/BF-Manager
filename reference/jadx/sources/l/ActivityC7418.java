package l;

import android.content.Context;
import android.os.Bundle;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 11SZ */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC7418 extends AbstractActivityC2952 implements InterfaceC20018 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public C3906 f24427;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f24428;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public C3906 f24429;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public boolean f24430;

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "TerminalPreferences";
    }

    public ActivityC7418() {
        super(R.xml.MT_Protector);
    }

    @Override // l.AbstractActivityC2952, l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24428 = C23391.m52567() != ViewOnLayoutChangeListenerC6673.class;
    }

    @Override // l.AbstractActivityC2952
    /* JADX INFO: renamed from: ۙ */
    public final void mo6716(C9663 c9663, C10176 c10176) {
        C3906 c3906M39850 = c10176.m39850("term_start_path");
        C17359.requireNonNull(c3906M39850);
        C3906 c3906M39851 = c10176.m39850("term_create_session_as_root");
        C17359.requireNonNull(c3906M39851);
        C3906 c3906M39852 = c10176.m39850("term_double_confirm_to_exit");
        C17359.requireNonNull(c3906M39852);
        C3906 c3906M39853 = c10176.m39850("terminal_su2_help");
        C17359.requireNonNull(c3906M39853);
        this.f24429 = c3906M39853;
        C3906 c3906M39854 = c10176.m39850("term_ex");
        C17359.requireNonNull(c3906M39854);
        this.f24427 = c3906M39854;
        if (this.f24428) {
            c3906M39850.m12589(false);
            c3906M39851.m12589(false);
        } else {
            c3906M39850.mo12567((CharSequence) ApplicationC17729.f58262.getString("term_start_path", "/sdcard"));
            c3906M39852.m12589(false);
        }
        m20331();
    }

    @Override // l.AbstractActivityC2952
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6717(C9663 c9663, C3906 c3906, Object obj) {
        if (!(c3906 instanceof C10462)) {
            return false;
        }
        c3906.mo12567((CharSequence) obj.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public void m20331() {
        C3186 c3186M46731 = C20340.m46731();
        C9897 c9897M3769 = C0949.m3769();
        this.f24430 = true;
        if (c3186M46731 != null) {
            String str = c3186M46731.f10379;
            this.f24429.m12589(true);
            if (c9897M3769 == null) {
                this.f24427.mo12567((CharSequence) getString(R.string.MT_Protector, str, "unknown"));
                this.f24430 = false;
                return;
            } else if (c9897M3769.f31826 > c3186M46731.f10380) {
                this.f24427.mo12567((CharSequence) getString(R.string.MT_Protector, str, c9897M3769.f31824));
                return;
            } else {
                this.f24427.mo12567((CharSequence) getString(R.string.MT_Protector, str, c9897M3769.f31824));
                return;
            }
        }
        this.f24429.m12589(false);
        this.f24427.m12594(R.string.MT_Protector);
    }

    @Override // l.InterfaceC20018
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo20332() {
        if (this.f24430) {
            C3186 c3186M46731 = C20340.m46731();
            C9897 c9897M3769 = C0949.m3769();
            if (c9897M3769 == null) {
                C22673.m51152(R.string.MT_Protector);
            } else if (c3186M46731 != null && c3186M46731.f10380 >= c9897M3769.f31826) {
                ActivityC20934.m47864((Context) this, C13047.m32492(), true);
            } else {
                C0949.m3772((AbstractActivityC17204) this, (Runnable) new RunnableC21841(this, 1), true);
            }
        }
    }
}
