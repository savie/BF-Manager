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

/* JADX INFO: renamed from: l.ۖᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2709 implements InterfaceC11883 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final ComponentName f10421 = new ComponentName("com.xiaomi.aiasst.vision", "com.xiaomi.aiasst.vision.control.translation.AiTranslateService");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f10422;

    public C2709(PackageManager packageManager) {
        this.f10422 = packageManager.getPackageInfo(f10421.getPackageName(), 0);
    }

    @Override // l.InterfaceC11883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo8260(PackageManager packageManager) {
        try {
            return String.valueOf(this.f10422.applicationInfo.loadLabel(packageManager));
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override // l.InterfaceC11883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo8259() {
        return f10421.flattenToShortString();
    }

    @Override // l.InterfaceC11883
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo8261(C6111 c6111) {
        try {
            int[] iArr = new int[2];
            Rect rect = new Rect();
            c6111.getLocationOnScreen(iArr);
            c6111.getFocusedRect(rect);
            rect.offset(iArr[0], iArr[1]);
            Intent intent = new Intent();
            intent.setComponent(f10421);
            Bundle bundle = new Bundle();
            bundle.putString("from", "system_edit_box");
            bundle.putString(TextBundle.TEXT_ENTRY, c6111.m17016());
            bundle.putString("floatingWindowType", "startDictionaryTranslationWindow");
            bundle.putInt("rawX", rect.left);
            bundle.putInt("rawY", rect.top);
            intent.putExtras(bundle);
            c6111.getContext().startService(intent);
            return true;
        } catch (Throwable th) {
            if (th.getCause() instanceof TransactionTooLargeException) {
                C15829.m37611(R.string.MT_Protector);
                return true;
            }
            Activity activityM22527 = C8703.m22527(c6111.getContext());
            if (!(activityM22527 instanceof AbstractActivityC12483)) {
                C15829.m37613((CharSequence) th.toString());
            } else {
                ((AbstractActivityC12483) activityM22527).m31002(th, (DialogInterface.OnDismissListener) null);
            }
            return false;
        }
    }
}
