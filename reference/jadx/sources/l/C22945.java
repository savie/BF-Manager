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

/* JADX INFO: renamed from: l.᩺ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes.dex */
public final class C22945 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f74577;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC8128 f74578;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f74579;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PackageManager f74580 = C16737.m39292();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f74581;

    public C22945(DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128, View view) {
        this.f74578 = dialogInterfaceOnClickListenerC8128;
        this.f74579 = view;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f74578.f28458.m28824(), R.string.MT_Protector);
        this.f12806.m40697(new Runnable() { // from class: l.֨ۧۚ
            @Override // java.lang.Runnable
            public final void run() {
                C22945.m50785(this.f4922);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50785(C22945 c22945) {
        c22945.f74578.m21412(true);
        c22945.f12806.m40694();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        String str;
        PackageManager packageManager = this.f74580;
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = this.f74578;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC8128.f28459.m42535(), 0);
            dialogInterfaceOnClickListenerC8128.f28455 = ((long) packageInfo.versionCode) > dialogInterfaceOnClickListenerC8128.f28459.m42528();
            str = packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException unused) {
            dialogInterfaceOnClickListenerC8128.f28455 = false;
            str = "";
        } catch (Throwable unused2) {
            str = null;
        }
        if (dialogInterfaceOnClickListenerC8128.f28455 && DialogInterfaceOnClickListenerC8128.f28451 && (C3872.m11213() || (C3872.m11216() && !C8416.m22053().m22056("disable_install_by_shizuku") && C3872.m11206() != 0))) {
            dialogInterfaceOnClickListenerC8128.f28455 = false;
        }
        while (dialogInterfaceOnClickListenerC8128.f28454.get()) {
            if (this.f12806.m40693()) {
                return;
            } else {
                SystemClock.sleep(10L);
            }
        }
        if (dialogInterfaceOnClickListenerC8128.f28462 != null && dialogInterfaceOnClickListenerC8128.f28462.m39147() && dialogInterfaceOnClickListenerC8128.f28462.m39142()) {
            MessageDigest messageDigestM49425 = C22253.m49425();
            messageDigestM49425.update(dialogInterfaceOnClickListenerC8128.f28462.m39145());
            this.f74581 = C22253.m49424(messageDigestM49425.digest());
            if (this.f12806.m40693()) {
                return;
            }
            if (str != null) {
                if (str.isEmpty()) {
                    return;
                }
                try {
                    C16674 c16674 = new C16674(C5553.m15313(str, new String[0]), false);
                    MessageDigest messageDigestM49426 = C22253.m49425();
                    messageDigestM49426.update(c16674.m39145());
                    this.f74577 = C22253.m49424(messageDigestM49426.digest());
                    return;
                } catch (Throwable unused3) {
                }
            }
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(dialogInterfaceOnClickListenerC8128.f28459.m42535(), 64);
                if (packageInfo2 == null || packageInfo2.signatures == null) {
                    return;
                }
                MessageDigest messageDigestM49427 = C22253.m49425();
                messageDigestM49427.update(packageInfo2.signatures[0].toByteArray());
                this.f74577 = C22253.m49424(messageDigestM49427.digest());
            } catch (Throwable unused4) {
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        int i;
        if (this.f12806.m40693()) {
            return;
        }
        String str = this.f74581;
        DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8128 = this.f74578;
        if (str == null) {
            C8067 c8067BuildDialog = dialogInterfaceOnClickListenerC8128.f28458.m28824().buildDialog();
            c8067BuildDialog.m21274(R.string.MT_Protector);
            c8067BuildDialog.m21253(R.string.MT_Protector);
            c8067BuildDialog.m21251(R.string.MT_Protector, null);
            c8067BuildDialog.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۬ۧۚ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f43562.f74578.m21412(false);
                }
            });
            C23250.m51307(c8067BuildDialog.m21269());
            return;
        }
        String str2 = this.f74577;
        if (str2 == null || str.equals(str2)) {
            i = dialogInterfaceOnClickListenerC8128.f28455 ? R.string.MT_Protector : 0;
        } else {
            i = R.string.MT_Protector;
        }
        if (i == 0) {
            dialogInterfaceOnClickListenerC8128.m21412(true);
            return;
        }
        C8067 c8067BuildDialog2 = dialogInterfaceOnClickListenerC8128.f28458.m28824().buildDialog();
        c8067BuildDialog2.m21274(R.string.MT_Protector);
        c8067BuildDialog2.m21253(i);
        c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۧۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DialogInterfaceOnClickListenerC8128 dialogInterfaceOnClickListenerC8129 = this.f14560.f74578;
                dialogInterfaceOnClickListenerC8129.f28461 = true;
                dialogInterfaceOnClickListenerC8129.f28458.m28824().startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", dialogInterfaceOnClickListenerC8129.f28459.m42535(), null)));
            }
        });
        c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c8067BuildDialog2.m21271(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۧۚ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f22641.f74578.m21412(false);
            }
        });
        C23250.m51307(c8067BuildDialog2.m21269());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f12806.m40693()) {
            return;
        }
        this.f74578.f28458.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
        if (this.f74578.f28460.m44375()) {
            this.f74579.setEnabled(true);
        }
    }
}
