package l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import bin.mt.plus.R;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۘۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3882 implements InterfaceC24020 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final ComponentName f13235 = new ComponentName("com.xiaomi.aiasst.vision", "com.xiaomi.aiasst.vision.control.translation.AiTranslateService");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f13236;

    public C3882(PackageManager packageManager) {
        this.f13236 = packageManager.getPackageInfo(f13235.getPackageName(), 0);
    }

    @Override // l.InterfaceC24020
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo12514(PackageManager packageManager) {
        try {
            return String.valueOf(this.f13236.applicationInfo.loadLabel(packageManager));
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override // l.InterfaceC24020
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo12513() {
        return f13235.flattenToShortString();
    }

    @Override // l.InterfaceC24020
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo12515(C24132 c24132) {
        try {
            int[] iArr = new int[2];
            Rect rect = new Rect();
            c24132.getLocationOnScreen(iArr);
            c24132.getFocusedRect(rect);
            rect.offset(iArr[0], iArr[1]);
            Intent intent = new Intent();
            intent.setComponent(f13235);
            Bundle bundle = new Bundle();
            bundle.putString("from", "system_edit_box");
            bundle.putString(TextBundle.TEXT_ENTRY, c24132.m53870());
            bundle.putString("floatingWindowType", "startDictionaryTranslationWindow");
            bundle.putInt("rawX", rect.left);
            bundle.putInt("rawY", rect.top);
            intent.putExtras(bundle);
            c24132.getContext().startService(intent);
            return true;
        } catch (Throwable th) {
            if (th.getCause() instanceof TransactionTooLargeException) {
                C22673.m51152(R.string.MT_Protector);
                return true;
            }
            Activity activityM10534 = C3200.m10534(c24132.getContext());
            if (!(activityM10534 instanceof AbstractActivityC17204)) {
                C22673.m51154((CharSequence) th.toString());
            } else {
                ((AbstractActivityC17204) activityM10534).m40401(th, (DialogInterface.OnDismissListener) null);
            }
            return false;
        }
    }
}
