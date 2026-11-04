package l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: l.᩷ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes.dex */
public final class C21998 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f70963 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49726() {
        f70963 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49727(final Main main, final InterfaceC4844 interfaceC4844) {
        if (C7508.m20559(main, UMUtils.SD_PERMISSION) == 0) {
            interfaceC4844.onSuccess();
            if (f70963) {
                return;
            }
            main.findViewById(R.id.MT_Protector).setVisibility(8);
            return;
        }
        if (C16514.m39144()) {
            interfaceC4844.mo14880();
            return;
        }
        final String[] strArr = {UMUtils.SD_PERMISSION};
        View viewFindViewById = main.findViewById(R.id.MT_Protector);
        int i = 0;
        if (f70963) {
            f70963 = false;
            C14832.m35751(main, strArr, 23678);
            viewFindViewById.setVisibility(0);
            return;
        }
        if (C14832.m35752((Activity) main, UMUtils.SD_PERMISSION)) {
            viewFindViewById.setVisibility(8);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.۠᩷ܺ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    if (i2 == -1) {
                        C14832.m35751(main, strArr, 23678);
                    } else {
                        interfaceC4844.mo14880();
                    }
                }
            };
            int i2 = DialogInterfaceC8327.f27315;
            C2361 c2361 = new C2361(main);
            c2361.m8021(R.string.MT_Protector);
            c2361.m8000(R.string.MT_Protector);
            c2361.m8012(false);
            c2361.m8026(R.string.MT_Protector, onClickListener);
            c2361.m8022(R.string.MT_Protector, onClickListener);
            c2361.m8016();
            return;
        }
        viewFindViewById.setVisibility(8);
        int i3 = DialogInterfaceC8327.f27315;
        C2361 c2362 = new C2361(main);
        c2362.m8021(R.string.MT_Protector);
        c2362.m8000(R.string.MT_Protector);
        c2362.m8026(R.string.MT_Protector, null);
        c2362.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7410(i, main, interfaceC4844));
        c2362.m8012(false);
        DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2362.m8016();
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC14121(main, dialogInterfaceC8327M8016, interfaceC4844));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49728(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49729(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
