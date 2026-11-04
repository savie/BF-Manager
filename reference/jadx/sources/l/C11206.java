package l;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۤ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11206 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35347;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f35348;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6733 f35349;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10745 f35350;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1790 f35351;

    public C11206(C6733 c6733, int i) {
        this.f35349 = c6733;
        this.f35347 = i;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C6733 c6733 = this.f35349;
        C10745 c10745 = new C10745(c6733.f22436);
        c10745.m27397(R.string.MT_Protector);
        c10745.m27393(c6733.getFileName());
        c10745.mo25915(new View.OnClickListener() { // from class: l.ۙ᩺ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18446.f35350.m27405();
            }
        });
        c10745.mo25931();
        this.f35350 = c10745;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        int i;
        String strValueOf;
        String str;
        synchronized (C8224.f27072) {
            String str2 = "-r -t -d " + C17394.m40859(this.f35349.f22437);
            if (Build.VERSION.SDK_INT <= 23) {
                try {
                    i = Integer.parseInt(C6382.f21566.getName());
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "current";
            }
            String strM44123 = C19036.m44123(false);
            if (strM44123 == null) {
                strM44123 = "su";
            }
            this.f35351 = new C1790(strM44123, false);
            if (strValueOf.equals("current") && !this.f35349.f22437.isEmpty()) {
                strValueOf = String.valueOf(C17394.m40855(this.f35351));
            }
            String str3 = str2 + "--user " + strValueOf + " ";
            if (Build.VERSION.SDK_INT >= 34) {
                str3 = str3 + "--bypass-low-target-sdk-block ";
            }
            C17394.m40857(this.f35351, strValueOf, this.f35349.f22437);
            int i2 = this.f35347;
            if (i2 == 0) {
                str = "pm install " + str3 + C7756.m21098(this.f35349.f22440.mo4294());
            } else if (i2 == 1) {
                str = "cat " + C7756.m21098(this.f35349.f22440.mo4294()) + " | pm install " + str3 + "-S " + this.f35349.f22440.mo4285();
            } else if (i2 == 2) {
                this.f35348 = C14584.m35193("/data/local/tmp/mt_install.apk", new String[0]);
                this.f35350.mo25916((Runnable) null);
                this.f35349.f22440.m49847(this.f35348, (C24523) null, new C22395(this));
                if (this.f35350.m27399()) {
                    return;
                }
                this.f35350.m27396();
                str = "pm install " + str3 + "/data/local/tmp/mt_install.apk";
            } else {
                throw new RuntimeException();
            }
            this.f35350.m27394(true);
            C1790 c1790 = this.f35351;
            c1790.getClass();
            C8224.m22121(c1790.mo6261(0L, str).m28854());
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f35350.m27399()) {
            return;
        }
        C6733 c6733 = this.f35349;
        C8224.m22122(c6733.f22436, c6733.getFileName(), c6733.f22439);
        C8224.f27071.mo40353((Object) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if ((exc instanceof CancellationException) || this.f35350.m27399()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C21804;
        C6733 c6733 = this.f35349;
        if (z) {
            C21804 c21804 = (C21804) exc;
            if (c21804.m49453()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c6733.f22439);
                C7247.m19877(C21576.m49084()).m19881(intent);
                return;
            } else if (c21804.m49451()) {
                AbstractActivityC17204 abstractActivityC17204 = c6733.f22436;
                String message = c21804.getMessage();
                String strM49450 = c21804.m49450();
                abstractActivityC17204.getClass();
                abstractActivityC17204.runOnUiThread(new RunnableC8779(abstractActivityC17204, message, strM49450, false));
                return;
            }
        }
        c6733.m18824(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f35350.m27405();
        C1790 c1790 = this.f35351;
        if (c1790 != null) {
            c1790.close();
        }
        AbstractC22044 abstractC22044 = this.f35348;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
    }
}
