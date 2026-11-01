package l;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۤۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10183 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1777 f34804;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34805;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13752 f34806;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f34807;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17239 f34808;

    public C10183(C13752 c13752, int i) {
        this.f34806 = c13752;
        this.f34805 = i;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C13752 c13752 = this.f34806;
        C1777 c1777 = new C1777(c13752.f45340);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5832(c13752.getFileName());
        c1777.mo5827(new View.OnClickListener() { // from class: l.᩵ۡۚ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f62399.f34804.m5825();
            }
        });
        c1777.mo5843();
        this.f34804 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        int i;
        String strValueOf;
        String str;
        synchronized (C3872.f14472) {
            String str2 = "-r -t -d " + C14726.m35257(this.f34806.f45342);
            if (Build.VERSION.SDK_INT <= 23) {
                try {
                    i = Integer.parseInt(C11904.f39934.getName());
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "current";
            }
            String strM41209 = C17687.m41209(false);
            if (strM41209 == null) {
                strM41209 = "su";
            }
            this.f34808 = new C17239(strM41209, false);
            if (strValueOf.equals("current") && !this.f34806.f45342.isEmpty()) {
                C5950 c5950Mo2028 = this.f34808.mo2028("am get-current-user", true);
                String strTrim = c5950Mo2028.m16220().trim();
                if (!c5950Mo2028.m16221()) {
                    try {
                        int i2 = Integer.parseInt(strTrim);
                        if (i2 >= 0) {
                            strValueOf = String.valueOf(i2);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
                throw new IOException("Unable to resolve current installation user: " + strTrim);
            }
            String str3 = str2 + "--user " + strValueOf + " ";
            if (Build.VERSION.SDK_INT >= 34) {
                str3 = str3 + "--bypass-low-target-sdk-block ";
            }
            C14726.m35255(this.f34808, strValueOf, this.f34806.f45342);
            int i3 = this.f34805;
            if (i3 == 0) {
                str = "pm install " + str3 + C6696.m18085(this.f34806.f45343.mo33986());
            } else if (i3 == 1) {
                str = "cat " + C6696.m18085(this.f34806.f45343.mo33986()) + " | pm install " + str3 + "-S " + this.f34806.f45343.mo33964();
            } else if (i3 == 2) {
                this.f34807 = C5553.m15313("/data/local/tmp/mt_install.apk", new String[0]);
                this.f34804.mo5828((Runnable) null);
                this.f34806.f45343.m46701(this.f34807, (C5222) null, new C8772(this));
                if (this.f34804.m5824()) {
                    return;
                }
                this.f34804.m5836();
                str = "pm install " + str3 + "/data/local/tmp/mt_install.apk";
            } else {
                throw new RuntimeException();
            }
            this.f34804.m5833(true);
            C17239 c17239 = this.f34808;
            c17239.getClass();
            C3872.m11208(c17239.mo2026(0L, str).m16220());
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f34804.m5824()) {
            return;
        }
        C13752 c13752 = this.f34806;
        C3872.m11209(c13752.f45340, c13752.getFileName(), c13752.f45341);
        C3872.f14476.mo23642((Object) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if ((exc instanceof CancellationException) || this.f34804.m5824()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        boolean z = exc instanceof C19396;
        C13752 c13752 = this.f34806;
        if (z) {
            C19396 c19396 = (C19396) exc;
            if (c19396.m44445()) {
                Intent intent = new Intent("bin.mt.plus.ACTION_INSTALL_FAILED_DOWNGRADE");
                intent.putExtra("pkgName", c13752.f45341);
                C21843.m48614(C16737.m39277()).m48618(intent);
                return;
            } else if (c19396.m44444()) {
                AbstractActivityC12483 abstractActivityC12483 = c13752.f45340;
                String message = c19396.getMessage();
                String strM44442 = c19396.m44442();
                abstractActivityC12483.getClass();
                abstractActivityC12483.runOnUiThread(new RunnableC6837(abstractActivityC12483, message, strM44442, false));
                return;
            }
        }
        c13752.m33509(exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f34804.m5825();
        C17239 c17239 = this.f34808;
        if (c17239 != null) {
            c17239.close();
        }
        AbstractC20745 abstractC20745 = this.f34807;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
    }
}
