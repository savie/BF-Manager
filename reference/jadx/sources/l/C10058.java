package l;

import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import com.alipay.sdk.m.u0.b;

/* JADX INFO: renamed from: l.ۢۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 592B */
/* JADX INFO: loaded from: classes3.dex */
public final class C10058 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f32243;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f32244;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f32245;

    public C10058(AbstractActivityC17204 abstractActivityC17204, boolean z) {
        this.f32243 = abstractActivityC17204;
        this.f32244 = z;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25990() {
        boolean z = this.f32244;
        AbstractActivityC17204 abstractActivityC17204 = this.f32243;
        if (z) {
            if (C1761.m6202(abstractActivityC17204).size() >= Math.min(C1761.m6212(abstractActivityC17204), 4)) {
                C22673.m51159(R.string.MT_Protector);
                C16376.m38866(abstractActivityC17204);
                return false;
            }
        } else {
            if (!ShortcutActivity.m131()) {
                C22673.m51159(R.string.MT_Protector);
                return false;
            }
            int iM25497 = 2;
            try {
                if (C9034.m24094()) {
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    Class<?> cls = Class.forName("com.huawei.hsm.permission.PermissionManager");
                    Object objInvoke = cls.getDeclaredMethod("canSendBroadcast", Context.class, Intent.class).invoke(cls, abstractActivityC17204, intent);
                    if (objInvoke != null) {
                        if (((Boolean) objInvoke).booleanValue()) {
                            iM25497 = 0;
                        } else {
                            iM25497 = -1;
                        }
                    }
                } else if (!C9034.m24095()) {
                    if (!C9034.m24093()) {
                        if (C9034.m24091()) {
                            iM25497 = C9779.m25497(abstractActivityC17204);
                        } else {
                            iM25497 = 0;
                        }
                    } else {
                        ContentResolver contentResolver = abstractActivityC17204.getContentResolver();
                        if (contentResolver != null) {
                            Cursor cursorQuery = contentResolver.query(Uri.parse("content://settings/secure/launcher_shortcut_permission_settings"), null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    String packageName = abstractActivityC17204.getApplicationContext().getPackageName();
                                    while (true) {
                                        if (cursorQuery.moveToNext()) {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex(b.d));
                                            if (!TextUtils.isEmpty(string)) {
                                                if (!string.contains(packageName + ", 1")) {
                                                    if (string.contains(packageName + ", 0")) {
                                                        cursorQuery.close();
                                                        iM25497 = -1;
                                                    }
                                                } else {
                                                    cursorQuery.close();
                                                    iM25497 = 0;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    try {
                                        cursorQuery.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else if (cursorQuery != null) {
                            }
                            cursorQuery.close();
                        }
                    }
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) abstractActivityC17204.getSystemService("appops");
                    String packageName2 = abstractActivityC17204.getApplicationContext().getPackageName();
                    int i = abstractActivityC17204.getApplicationInfo().uid;
                    Class<?> cls2 = Class.forName(AppOpsManager.class.getName());
                    Class<?> cls3 = Integer.TYPE;
                    Object objInvoke2 = cls2.getDeclaredMethod("checkOpNoThrow", cls3, cls3, String.class).invoke(appOpsManager, 10017, Integer.valueOf(i), packageName2);
                    if (objInvoke2 != null) {
                        String string2 = objInvoke2.toString();
                        int iHashCode = string2.hashCode();
                        if (iHashCode != 48) {
                            if (iHashCode != 49) {
                                if (iHashCode == 53 && string2.equals("5")) {
                                    iM25497 = 1;
                                }
                            } else if (string2.equals("1")) {
                                iM25497 = -1;
                            }
                        } else if (string2.equals("0")) {
                            iM25497 = 0;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.f32245 = iM25497;
            if (iM25497 == -1) {
                C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8000(R.string.MT_Protector);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ᩳۤۧ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C10058.m25989(this.f61574);
                    }
                });
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c2361BuildDialog.m8016();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m25989(C10058 c10058) {
        AbstractActivityC17204 abstractActivityC17204 = c10058.f32243;
        C18730.m43546(abstractActivityC17204, abstractActivityC17204.getPackageName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25991(Intent intent, String str, Bitmap bitmap, String str2) throws Throwable {
        boolean z = this.f32244;
        if (z) {
            str2 = C14483.m34972(str2, ":dynamic");
        }
        String strM36181 = C15022.m36181(str2);
        AbstractActivityC17204 abstractActivityC17204 = this.f32243;
        C19660 c19660 = new C19660(abstractActivityC17204, strM36181);
        c19660.m45324(str);
        c19660.m45325(C9545.m24962(bitmap));
        c19660.m45323(intent);
        C15184 c15184M45322 = c19660.m45322();
        if (z) {
            if (!C1761.m6213(abstractActivityC17204, c15184M45322)) {
                C22673.m51152(R.string.MT_Protector);
                return false;
            }
            ShortcutActivity.m132(c15184M45322.m36530(), bitmap);
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
        if (!C1761.m6209(abstractActivityC17204, c15184M45322)) {
            C22673.m51152(R.string.MT_Protector);
            return false;
        }
        if (this.f32245 == 0) {
            C22673.m51152(R.string.MT_Protector);
            return true;
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8016();
        return true;
    }
}
