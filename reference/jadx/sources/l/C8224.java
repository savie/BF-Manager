package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8224 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C17930 f27068;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f27069;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C24633 f27070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C17930 f27071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f27072 = new Object();

    static {
        C17930 c17930 = new C17930();
        f27071 = c17930;
        f27068 = c17930;
        f27069 = new AtomicInteger(21321);
        f27070 = new C24633();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22124(final AbstractActivityC17204 abstractActivityC17204, final AbstractC22044 abstractC22044, List list) {
        if (list != null) {
            new C6733(abstractActivityC17204, abstractC22044, true, null, list, C17394.m40856()).m18825(EnumC16427.SHIZUKU);
            return;
        }
        if (!C22415.m50557()) {
            C21576.m49068(new RunnableC15902(0, abstractActivityC17204, abstractC22044));
            return;
        }
        try {
            C22941 c22941 = new C22941(abstractC22044);
            try {
                final ArrayList arrayListM30299 = C12127.m30299(c22941);
                c22941.close();
                CharSequence[] charSequenceArr = new CharSequence[arrayListM30299.size()];
                final boolean[] zArr = new boolean[arrayListM30299.size()];
                for (int i = 0; i < arrayListM30299.size(); i++) {
                    C20332 c20332 = (C20332) arrayListM30299.get(i);
                    charSequenceArr[i] = c20332.m46711();
                    zArr[i] = c20332.m46710();
                }
                C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8015(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.᩹ۛᩴ
                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                        C20332 c20333 = (C20332) arrayListM30299.get(i2);
                        boolean[] zArr2 = zArr;
                        if (!z && c20333.m46712()) {
                            zArr2[i2] = true;
                            C23740 c23740M31226 = ((DialogInterfaceC12551) dialogInterface).m31226();
                            if (c23740M31226 != null) {
                                c23740M31226.post(new RunnableC12173(c23740M31226, i2, 0));
                                return;
                            }
                            return;
                        }
                        zArr2[i2] = z;
                    }
                });
                c2361BuildDialog.m8026(R.string.MT_Protector, null);
                final DialogInterfaceC8327 dialogInterfaceC8327M23911 = C8947.m23911(c2361BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC8327M23911.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ۗۛᩴ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayListM30294 = C12127.m30294(arrayListM30299, zArr);
                        if (arrayListM30294.isEmpty()) {
                            C22673.m51152(R.string.MT_Protector);
                            return;
                        }
                        dialogInterfaceC8327M23911.dismiss();
                        new C6733(abstractActivityC17204, abstractC22044, true, null, arrayListM30294, C17394.m40856()).m18825(EnumC16427.SHIZUKU);
                    }
                });
                dialogInterfaceC8327M23911.m22440().setOnClickListener(new ViewOnClickListenerC20378(zArr, arrayListM30299, dialogInterfaceC8327M23911, 0));
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22123(AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044, String str) {
        new C6733(abstractActivityC17204, abstractC22044, false, str, null, C17394.m40856()).m18825(EnumC16427.SHIZUKU);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22125(AbstractC22044 abstractC22044, List list) {
        C22941 c22941 = new C22941(abstractC22044);
        try {
            new C23887().m53390(c22941, list);
            c22941.close();
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m22129() {
        return C7756.m21096() && ApplicationC17729.f58262.getBoolean("apk_installation_root", true);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m22128() {
        return Build.VERSION.SDK_INT >= 23 && ApplicationC17729.f58262.getBoolean("apk_installation_shizuku", true);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m22131() {
        f27070.getClass();
        if (C12797.m31698()) {
            return 0;
        }
        try {
            return C12797.m31700() == 0 ? 2 : 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static int m22127() {
        return f27069.getAndIncrement();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22122(final AbstractActivityC17204 abstractActivityC17204, String str, final String str2) {
        if (!TextUtils.isEmpty(str2)) {
            EnumC2619 enumC2619Mo23076 = abstractActivityC17204.getLifecycle().mo23076();
            if (enumC2619Mo23076 != EnumC2619.DESTROYED) {
                final Intent launchIntentForPackage = C21576.m49081().getLaunchIntentForPackage(str2);
                C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8008(str);
                if (launchIntentForPackage != null) {
                    c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۘۛᩴ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            AbstractActivityC17204 abstractActivityC17205 = abstractActivityC17204;
                            try {
                                abstractActivityC17205.startActivity(launchIntentForPackage);
                            } catch (Exception e) {
                                abstractActivityC17205.m40401(e, (DialogInterface.OnDismissListener) null);
                            }
                        }
                    });
                    c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                } else {
                    c2361BuildDialog.m8026(R.string.MT_Protector, null);
                }
                c2361BuildDialog.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۛᩴ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abstractActivityC17204.mo37500(str2);
                    }
                });
            }
            if (enumC2619Mo23076 != EnumC2619.RESUMED) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m22121(String str) throws C21804 {
        if (str.contains("Success") || str.contains("Completed with warning(s)")) {
            return;
        }
        if (str.contains("INSTALL_FAILED_VERSION_DOWNGRADE")) {
            C21804 c21804 = new C21804(R.string.MT_Protector, str);
            c21804.m49454();
            throw c21804;
        }
        if (str.contains("INSTALL_FAILED_UPDATE_INCOMPATIBLE")) {
            throw new C21804(R.string.MT_Protector, str);
        }
        if (str.contains("INSTALL_FAILED_OLDER_SDK")) {
            throw new C21804(R.string.MT_Protector, str);
        }
        if (str.contains("INSTALL_FAILED_USER_RESTRICTED")) {
            throw new CancellationException();
        }
        C21804 c21805 = new C21804(R.string.MT_Protector, str);
        c21805.m49452();
        throw c21805;
    }
}
