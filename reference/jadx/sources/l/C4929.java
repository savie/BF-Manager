package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5LN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4929 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f17188;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C22829 f17189;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f17190;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public TextView f17191;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public TextView f17192;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15107 f17193;

    public C4929(C13132 c13132, C15107 c15107) {
        this.f17190 = c13132;
        this.f17193 = c15107;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C13132 c13132 = this.f17190;
        View viewM40395 = c13132.f42010.m23233().m40395(R.layout.MT_Protector);
        this.f17192 = (TextView) viewM40395.findViewById(R.id.textView1);
        this.f17191 = (TextView) viewM40395.findViewById(R.id.textView2);
        int i = 1;
        this.f17192.setText(C21576.m49059(R.string.MT_Protector, 0));
        C22829 c22829 = new C22829(c13132.f42017.mo10164(), c13132.f42010.m23204());
        this.f17189 = c22829;
        if (c22829.f73993.equals("/")) {
            this.f17191.setText("/");
        } else {
            this.f17191.setText("./");
        }
        viewM40395.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC8679(i, this.f17193));
        C2361 c2361BuildDialog = c13132.f42010.m23233().buildDialog();
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8005(viewM40395);
        this.f17188 = c2361BuildDialog.m8016();
        c13132.f42010.m23233().m125(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C13132 c13132 = this.f17190;
        C13681 c13681 = new C13681(this);
        try {
            List list = c13132.f42013;
            C15107 c15107 = this.f17193;
            if (list != null) {
                c15107.m36385(c13132.f42017.mo10174(), c13132.f42013, c13681);
            } else {
                c15107.m36384(c13132.f42017.mo10174(), this.f17189.f73993, c13681, c13132.f42002);
            }
        } finally {
            this.f17189.m51481();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        boolean zIsEmpty = this.f17189.f73990.isEmpty();
        C13132 c13132 = this.f17190;
        if (!zIsEmpty) {
            C13132.m32616(c13132.f42010, c13132.f42016, this.f17189);
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
        if (!this.f17189.f73990.isEmpty() || c13132.f42013 == null) {
            c13132.f42016.mo2272(this.f17189);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f17190.f42010.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f17188.dismiss();
        this.f17190.f42010.m23233().m125(false);
    }
}
