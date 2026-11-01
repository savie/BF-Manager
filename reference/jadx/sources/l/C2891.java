package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2891 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextView f10910;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f10911;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22418 f10912;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C11835 f10913;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f10914;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5359 f10915;

    public C2891(C22418 c22418, C5359 c5359) {
        this.f10912 = c22418;
        this.f10915 = c5359;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C22418 c22418 = this.f10912;
        View viewM30995 = c22418.f73168.m28824().m30995(R.layout.MT_Protector);
        this.f10914 = (TextView) viewM30995.findViewById(R.id.textView1);
        this.f10910 = (TextView) viewM30995.findViewById(R.id.textView2);
        int i = 1;
        this.f10914.setText(C16737.m39264(R.string.MT_Protector, 0));
        C11835 c11835 = new C11835(c22418.f73174.mo13039(), c22418.f73168.m28799());
        this.f10913 = c11835;
        if (c11835.f39732.equals("/")) {
            this.f10910.setText("/");
        } else {
            this.f10910.setText("./");
        }
        viewM30995.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC6378(i, this.f10915));
        C8067 c8067BuildDialog = c22418.f73168.m28824().buildDialog();
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21258(viewM30995);
        this.f10911 = c8067BuildDialog.m21269();
        c22418.f73168.m28824().m123(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C22418 c22418 = this.f10912;
        C9243 c9243 = new C9243(this);
        try {
            List list = c22418.f73158;
            C5359 c5359 = this.f10915;
            if (list != null) {
                c5359.m14866(c22418.f73174.mo13029(), c22418.f73158, c9243);
            } else {
                c5359.m14865(c22418.f73174.mo13029(), this.f10913.f39732, c9243, c22418.f73175);
            }
        } finally {
            this.f10913.m29527();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        boolean zIsEmpty = this.f10913.f39735.isEmpty();
        C22418 c22418 = this.f10912;
        if (!zIsEmpty) {
            C22418.m49706(c22418.f73168, c22418.f73154, this.f10913);
        } else {
            C15829.m37611(R.string.MT_Protector);
        }
        if (!this.f10913.f39735.isEmpty() || c22418.f73158 == null) {
            c22418.f73154.mo2553(this.f10913);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f10912.f73168.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f10911.dismiss();
        this.f10912.f73168.m28824().m123(false);
    }
}
