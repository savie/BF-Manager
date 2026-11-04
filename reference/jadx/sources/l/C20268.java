package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import bin.mt.plus.R;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩵ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes5.dex */
public final class C20268 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC14300 f65080;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PackageManager f65081 = C21576.m49081();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f65082;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f65083;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f65084;

    public C20268(DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300, View view) {
        this.f65080 = dialogInterfaceOnClickListenerC14300;
        this.f65082 = view;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f65080.f45154.m23233(), R.string.MT_Protector);
        this.f7780.m33188(new Runnable() { // from class: l.ܽۖᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C20268.m46536(this.f56311);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46536(C20268 c20268) {
        c20268.f65080.m34722(true);
        c20268.f7780.m33185();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String str;
        PackageManager packageManager = this.f65081;
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = this.f65080;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC14300.f45158.m28718(), 0);
            dialogInterfaceOnClickListenerC14300.f45157 = ((long) packageInfo.versionCode) > dialogInterfaceOnClickListenerC14300.f45158.m28712();
            str = packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            dialogInterfaceOnClickListenerC14300.f45157 = false;
            str = "";
        } catch (Throwable unused2) {
            str = null;
        }
        if (dialogInterfaceOnClickListenerC14300.f45157 && DialogInterfaceOnClickListenerC14300.f45151 && (C8224.m22129() || (C8224.m22128() && !C20327.m46701().m46704("disable_install_by_shizuku") && C8224.m22131() != 0))) {
            dialogInterfaceOnClickListenerC14300.f45157 = false;
        }
        while (dialogInterfaceOnClickListenerC14300.f45159.get()) {
            if (this.f7780.m33196()) {
                return;
            } else {
                SystemClock.sleep(10L);
            }
        }
        if (dialogInterfaceOnClickListenerC14300.f45161 != null && dialogInterfaceOnClickListenerC14300.f45161.m43228() && dialogInterfaceOnClickListenerC14300.f45161.m43222()) {
            MessageDigest messageDigestM36183 = C15022.m36183();
            messageDigestM36183.update(dialogInterfaceOnClickListenerC14300.f45161.m43226());
            this.f65084 = C15022.m36182(messageDigestM36183.digest());
            if (this.f7780.m33196()) {
                return;
            }
            if (str != null) {
                if (str.isEmpty()) {
                    return;
                }
                try {
                    C18602 c18602 = new C18602(C14584.m35193(str, new String[0]), false);
                    MessageDigest messageDigestM36184 = C15022.m36183();
                    messageDigestM36184.update(c18602.m43226());
                    this.f65083 = C15022.m36182(messageDigestM36184.digest());
                    return;
                } catch (Throwable unused3) {
                }
            }
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC14300.f45158.m28718(), 64);
                if (packageInfo2 == null || packageInfo2.signatures == null) {
                    return;
                }
                MessageDigest messageDigestM36185 = C15022.m36183();
                messageDigestM36185.update(packageInfo2.signatures[0].toByteArray());
                this.f65083 = C15022.m36182(messageDigestM36185.digest());
            } catch (Throwable unused4) {
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int i;
        if (this.f7780.m33196()) {
            return;
        }
        String str = this.f65084;
        DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14300 = this.f65080;
        if (str == null) {
            C2361 c2361BuildDialog = dialogInterfaceOnClickListenerC14300.f45154.m23233().buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8000(R.string.MT_Protector);
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܶۖᩴ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f51381.f65080.m34722(false);
                }
            });
            C5416.m16141(c2361BuildDialog.m8016());
            return;
        }
        String str2 = this.f65083;
        if (str2 == null || str.equals(str2)) {
            i = dialogInterfaceOnClickListenerC14300.f45157 ? R.string.MT_Protector : 0;
        } else {
            i = R.string.MT_Protector;
        }
        if (i == 0) {
            dialogInterfaceOnClickListenerC14300.m34722(true);
            return;
        }
        C2361 c2361BuildDialog2 = dialogInterfaceOnClickListenerC14300.f45154.m23233().buildDialog();
        c2361BuildDialog2.m8021(R.string.MT_Protector);
        c2361BuildDialog2.m8000(i);
        c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩹ۖᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DialogInterfaceOnClickListenerC14300 dialogInterfaceOnClickListenerC14301 = this.f75335.f65080;
                dialogInterfaceOnClickListenerC14301.f45160 = true;
                dialogInterfaceOnClickListenerC14301.f45154.m23233().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", dialogInterfaceOnClickListenerC14301.f45158.m28718(), null)));
            }
        });
        c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog2.m8018(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗۖᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f10087.f65080.m34722(false);
            }
        });
        C5416.m16141(c2361BuildDialog2.m8016());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f7780.m33196()) {
            return;
        }
        this.f65080.f45154.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
        if (this.f65080.f45152.m22434()) {
            this.f65082.setEnabled(true);
        }
    }
}
