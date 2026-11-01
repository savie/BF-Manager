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

/* JADX INFO: renamed from: l.ۧ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 592B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11217 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f37949;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f37950;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f37951;

    public C11217(AbstractActivityC12483 abstractActivityC12483, boolean z) {
        this.f37949 = abstractActivityC12483;
        this.f37950 = z;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28165() {
        boolean z = this.f37950;
        AbstractActivityC12483 abstractActivityC12483 = this.f37949;
        if (z) {
            if (C11692.m29191(abstractActivityC12483).size() >= Math.min(C11692.m29200(abstractActivityC12483), 4)) {
                C15829.m37618(R.string.MT_Protector);
                C18398.m42681(abstractActivityC12483);
                return false;
            }
        } else {
            if (!ShortcutActivity.m139()) {
                C15829.m37618(R.string.MT_Protector);
                return false;
            }
            int iM2807 = 2;
            try {
                if (C12597.m31375()) {
                    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    Class<?> cls = Class.forName("com.huawei.hsm.permission.PermissionManager");
                    Object objInvoke = cls.getDeclaredMethod("canSendBroadcast", Context.class, Intent.class).invoke(cls, abstractActivityC12483, intent);
                    if (objInvoke != null) {
                        if (((Boolean) objInvoke).booleanValue()) {
                            iM2807 = 0;
                        } else {
                            iM2807 = -1;
                        }
                    }
                } else if (!C12597.m31369()) {
                    if (!C12597.m31372()) {
                        if (C12597.m31368()) {
                            iM2807 = C0601.m2807(abstractActivityC12483);
                        } else {
                            iM2807 = 0;
                        }
                    } else {
                        ContentResolver contentResolver = abstractActivityC12483.getContentResolver();
                        if (contentResolver != null) {
                            Cursor cursorQuery = contentResolver.query(Uri.parse("content://settings/secure/launcher_shortcut_permission_settings"), null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    String packageName = abstractActivityC12483.getApplicationContext().getPackageName();
                                    while (true) {
                                        if (cursorQuery.moveToNext()) {
                                            String string = cursorQuery.getString(cursorQuery.getColumnIndex(b.d));
                                            if (!TextUtils.isEmpty(string)) {
                                                if (!string.contains(packageName + ", 1")) {
                                                    if (string.contains(packageName + ", 0")) {
                                                        cursorQuery.close();
                                                        iM2807 = -1;
                                                    }
                                                } else {
                                                    cursorQuery.close();
                                                    iM2807 = 0;
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
                    AppOpsManager appOpsManager = (AppOpsManager) abstractActivityC12483.getSystemService("appops");
                    String packageName2 = abstractActivityC12483.getApplicationContext().getPackageName();
                    int i = abstractActivityC12483.getApplicationInfo().uid;
                    Class<?> cls2 = Class.forName(AppOpsManager.class.getName());
                    Class<?> cls3 = Integer.TYPE;
                    Object objInvoke2 = cls2.getDeclaredMethod("checkOpNoThrow", cls3, cls3, String.class).invoke(appOpsManager, 10017, Integer.valueOf(i), packageName2);
                    if (objInvoke2 != null) {
                        String string2 = objInvoke2.toString();
                        int iHashCode = string2.hashCode();
                        if (iHashCode != 48) {
                            if (iHashCode != 49) {
                                if (iHashCode == 53 && string2.equals("5")) {
                                    iM2807 = 1;
                                }
                            } else if (string2.equals("1")) {
                                iM2807 = -1;
                            }
                        } else if (string2.equals("0")) {
                            iM2807 = 0;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.f37951 = iM2807;
            if (iM2807 == -1) {
                C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21253(R.string.MT_Protector);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ᩶ۘ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C11217.m28164(this.f21268);
                    }
                });
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c8067BuildDialog.m21269();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28164(C11217 c11217) {
        AbstractActivityC12483 abstractActivityC12483 = c11217.f37949;
        C20358.m45935(abstractActivityC12483, abstractActivityC12483.getPackageName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28166(Intent intent, String str, Bitmap bitmap, String str2) throws Throwable {
        boolean z = this.f37950;
        if (z) {
            str2 = C15489.m37076(str2, ":dynamic");
        }
        String strM49423 = C22253.m49423(str2);
        AbstractActivityC12483 abstractActivityC12483 = this.f37949;
        C9700 c9700 = new C9700(abstractActivityC12483, strM49423);
        c9700.m24664(str);
        c9700.m24665(C16775.m39337(bitmap));
        c9700.m24663(intent);
        C3348 c3348M24662 = c9700.m24662();
        if (z) {
            if (!C11692.m29201(abstractActivityC12483, c3348M24662)) {
                C15829.m37611(R.string.MT_Protector);
                return false;
            }
            ShortcutActivity.m137(c3348M24662.m9957(), bitmap);
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
        if (!C11692.m29199(abstractActivityC12483, c3348M24662)) {
            C15829.m37611(R.string.MT_Protector);
            return false;
        }
        if (this.f37951 == 0) {
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21269();
        return true;
    }
}
