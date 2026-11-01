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
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes3.dex */
public final class C14057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f46201 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34003() {
        f46201 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34004(final Main main, final InterfaceC4883 interfaceC4883) {
        if (C10405.m26300(main, UMUtils.SD_PERMISSION) == 0) {
            interfaceC4883.onSuccess();
            if (f46201) {
                return;
            }
            main.findViewById(R.id.MT_Protector).setVisibility(8);
            return;
        }
        if (C15198.m36412()) {
            interfaceC4883.mo13590();
            return;
        }
        final String[] strArr = {UMUtils.SD_PERMISSION};
        View viewFindViewById = main.findViewById(R.id.MT_Protector);
        final int i = 0;
        if (f46201) {
            f46201 = false;
            C18975.m43674(main, strArr, 23678);
            viewFindViewById.setVisibility(0);
            return;
        }
        if (C18975.m43675((Activity) main, UMUtils.SD_PERMISSION)) {
            viewFindViewById.setVisibility(8);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.֫ܺ᩺
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    switch (i) {
                        case 0:
                            Main main2 = (Main) main;
                            String[] strArr2 = (String[]) strArr;
                            InterfaceC4883 interfaceC4884 = (InterfaceC4883) interfaceC4883;
                            if (i2 != -1) {
                                interfaceC4884.mo13590();
                            } else {
                                C18975.m43674(main2, strArr2, 23678);
                            }
                            break;
                        default:
                            C8265.m21674((C11545) main, (ArrayList) strArr, (InterfaceC2557) interfaceC4883, dialogInterface, i2);
                            break;
                    }
                }
            };
            int i2 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(main);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21253(R.string.MT_Protector);
            c8067.m21265(false);
            c8067.m21251(R.string.MT_Protector, onClickListener);
            c8067.m21275(R.string.MT_Protector, onClickListener);
            c8067.m21269();
            return;
        }
        viewFindViewById.setVisibility(8);
        int i3 = DialogInterfaceC19356.f62401;
        C8067 c8068 = new C8067(main);
        c8068.m21274(R.string.MT_Protector);
        c8068.m21253(R.string.MT_Protector);
        c8068.m21251(R.string.MT_Protector, null);
        c8068.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9699(i, main, interfaceC4883));
        c8068.m21265(false);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8068.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.ۗܺ᩺
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Main main2 = main;
                if (C10405.m26300(main2, UMUtils.SD_PERMISSION) == 0) {
                    dialogInterfaceC19356M21269.dismiss();
                    interfaceC4883.onSuccess();
                } else {
                    main2.mo30999(main2.getPackageName());
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m34005(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m34006(Context context) {
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
