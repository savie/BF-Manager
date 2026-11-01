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

/* JADX INFO: renamed from: l.ۘۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3872 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object f14472 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9186 f14473;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C11635 f14474;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f14475;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C9186 f14476;

    static {
        C9186 c9186 = new C9186();
        f14476 = c9186;
        f14473 = c9186;
        f14475 = new AtomicInteger(21321);
        f14474 = new C11635();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11211(final AbstractActivityC12483 abstractActivityC12483, final AbstractC20745 abstractC20745, List list) {
        if (list != null) {
            new C13752(abstractActivityC12483, abstractC20745, true, null, list, ApplicationC0716.f2992.getString("ais", "")).m33510(EnumC23589.SHIZUKU);
            return;
        }
        if (!C13890.m33728()) {
            C16737.m39273(new RunnableC7979(3, abstractActivityC12483, abstractC20745));
            return;
        }
        try {
            C2455 c2455 = new C2455(abstractC20745);
            try {
                final ArrayList arrayListM47558 = C21132.m47558(c2455);
                c2455.close();
                CharSequence[] charSequenceArr = new CharSequence[arrayListM47558.size()];
                final boolean[] zArr = new boolean[arrayListM47558.size()];
                for (int i = 0; i < arrayListM47558.size(); i++) {
                    C7727 c7727 = (C7727) arrayListM47558.get(i);
                    charSequenceArr[i] = c7727.m20373();
                    zArr[i] = c7727.m20374();
                }
                C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21268(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.֫᩵ۚ
                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                        C7727 c7728 = (C7727) arrayListM47558.get(i2);
                        boolean[] zArr2 = zArr;
                        if (!z && c7728.m20375()) {
                            zArr2[i2] = true;
                            C21362 c21362M21015 = ((DialogInterfaceC7957) dialogInterface).m21015();
                            if (c21362M21015 != null) {
                                c21362M21015.post(new RunnableC4537(i2, 0, c21362M21015));
                                return;
                            }
                            return;
                        }
                        zArr2[i2] = z;
                    }
                });
                c8067BuildDialog.m21251(R.string.MT_Protector, null);
                final DialogInterfaceC19356 dialogInterfaceC19356M52499 = C23821.m52499(c8067BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                dialogInterfaceC19356M52499.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۢ᩵ۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList arrayListM47553 = C21132.m47553(arrayListM47558, zArr);
                        if (arrayListM47553.isEmpty()) {
                            C15829.m37611(R.string.MT_Protector);
                            return;
                        }
                        dialogInterfaceC19356M52499.dismiss();
                        new C13752(abstractActivityC12483, abstractC20745, true, null, arrayListM47553, ApplicationC0716.f2992.getString("ais", "")).m33510(EnumC23589.SHIZUKU);
                    }
                });
                dialogInterfaceC19356M52499.m44361().setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩵ۚ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = 0;
                        while (true) {
                            boolean[] zArr2 = zArr;
                            if (i2 >= zArr2.length) {
                                return;
                            }
                            boolean z = ((C7727) arrayListM47558.get(i2)).m20375() || !zArr2[i2];
                            zArr2[i2] = z;
                            dialogInterfaceC19356M52499.m44376().setItemChecked(i2, z);
                            i2++;
                        }
                    }
                });
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11210(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, String str) {
        new C13752(abstractActivityC12483, abstractC20745, false, str, null, ApplicationC0716.f2992.getString("ais", "")).m33510(EnumC23589.SHIZUKU);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11212(AbstractC20745 abstractC20745, List list) {
        C2455 c2455 = new C2455(abstractC20745);
        try {
            new C1715().m5709(c2455, list);
            c2455.close();
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m11213() {
        return C6696.m18084() && ApplicationC0716.f2988.getBoolean("apk_installation_root", true);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m11216() {
        return Build.VERSION.SDK_INT >= 23 && ApplicationC0716.f2988.getBoolean("apk_installation_shizuku", true);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m11206() {
        f14474.getClass();
        if (C1468.m5114()) {
            return 0;
        }
        try {
            return C1468.m5109() == 0 ? 2 : 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static int m11205() {
        return f14475.getAndIncrement();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11209(AbstractActivityC12483 abstractActivityC12483, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            EnumC9414 enumC9414Mo9170 = abstractActivityC12483.getLifecycle().mo9170();
            if (enumC9414Mo9170 != EnumC9414.DESTROYED) {
                Intent launchIntentForPackage = C16737.m39292().getLaunchIntentForPackage(str2);
                C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21261(str);
                if (launchIntentForPackage != null) {
                    c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2420(0, abstractActivityC12483, launchIntentForPackage));
                    c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                } else {
                    c8067BuildDialog.m21251(R.string.MT_Protector, null);
                }
                c8067BuildDialog.m21271(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269().m44361().setOnClickListener(new ViewOnClickListenerC20385(1, abstractActivityC12483, str2));
            }
            if (enumC9414Mo9170 != EnumC9414.RESUMED) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11208(String str) throws C19396 {
        if (str.contains("Success") || str.contains("Completed with warning(s)")) {
            return;
        }
        if (str.contains("INSTALL_FAILED_VERSION_DOWNGRADE")) {
            C19396 c19396 = new C19396(R.string.MT_Protector, str);
            c19396.m44441();
            throw c19396;
        }
        if (str.contains("INSTALL_FAILED_UPDATE_INCOMPATIBLE")) {
            throw new C19396(R.string.MT_Protector, str);
        }
        if (str.contains("INSTALL_FAILED_OLDER_SDK")) {
            throw new C19396(R.string.MT_Protector, str);
        }
        if (str.contains("INSTALL_FAILED_USER_RESTRICTED")) {
            throw new CancellationException();
        }
        C19396 c19397 = new C19396(R.string.MT_Protector, str);
        c19397.m44443();
        throw c19397;
    }
}
