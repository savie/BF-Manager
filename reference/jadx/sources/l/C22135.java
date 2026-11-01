package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

/* JADX INFO: renamed from: l.᩹۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes.dex */
public final class C22135 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f71649;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17901 f71650;

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
    }

    public C22135(C17901 c17901, Runnable runnable) {
        this.f71650 = c17901;
        this.f71649 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C17901.m41543(this.f71650);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        final C17901 c17901 = this.f71650;
        ((C12963) c17901.f56686.getAdapter()).m32095();
        c17901.f56686.scrollToPosition(0);
        c17901.f56684.m44362();
        Button buttonM44361 = c17901.f56684.m44361();
        if (buttonM44361 != null) {
            buttonM44361.setOnClickListener(new View.OnClickListener() { // from class: l.ۖ۟ۚ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C17901.m41538(c17901, view);
                }
            });
        }
        Button buttonM44374 = c17901.f56684.m44374();
        if (buttonM44374 != null) {
            if (c17901.f56688.m52102()) {
                if (ApplicationC0716.f2992.getBoolean("show_install_file_transfer", false)) {
                    buttonM44374.setOnClickListener(new View.OnClickListener() { // from class: l.ۚ۟ۚ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C17901.m41540(this.f18033.f71650, false);
                        }
                    });
                } else {
                    buttonM44374.setVisibility(8);
                    C17901.m41540(c17901, true);
                }
            } else {
                buttonM44374.setVisibility(8);
            }
        }
        Runnable runnable = this.f71649;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f71650.f56683.m31002(exc, (DialogInterface.OnDismissListener) null);
    }
}
