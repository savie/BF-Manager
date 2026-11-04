package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13903 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static List f44081;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2717 f44082;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C24926 f44083;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f44084;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f44085;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f44086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f44087;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m33865() {
        if (Build.VERSION.SDK_INT >= 30 && !C8683.f28339) {
            return (C4013.m12983() && C4013.m12986().mo29537()) ? false : true;
        }
        return false;
    }

    public C13903(AbstractActivityC17204 abstractActivityC17204, Runnable runnable) {
        this.f44085 = abstractActivityC17204;
        this.f44086 = runnable;
        if (Build.VERSION.SDK_INT >= 30) {
            C18379.f59879.m40350(abstractActivityC17204, new C21363(new C24347(abstractActivityC17204, new C6338(this))));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33867(String str) {
        if (m33865()) {
            boolean zM35213 = C14584.m35213();
            int i = 1;
            AbstractActivityC17204 abstractActivityC17204 = this.f44085;
            if (zM35213) {
                String strReplace = C21576.m49088(R.string.MT_Protector).replace("xxx", "Android/data");
                C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
                c2361BuildDialog.m8021(R.string.MT_Protector);
                c2361BuildDialog.m8008(strReplace);
                c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22190(i, this, str));
                c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
                this.f44087 = dialogInterfaceC8327M8016;
                dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.֡ܰᩴ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C13903.m33863(this.f2107, dialogInterfaceC8327M8016);
                    }
                });
                return;
            }
            C2717 c2717M33861 = m33861();
            boolean z = str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb");
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 33) {
                    if (c2717M33861.m9056() || c2717M33861.m9058()) {
                        String strConcat = "forbid_tip_".concat(str);
                        if (C21576.f68932.getBoolean(strConcat, true)) {
                            C21576.f68932.edit().putBoolean(strConcat, false).apply();
                            StringBuilder sb = new StringBuilder(C21576.m49055().getText(R.string.MT_Protector));
                            int iIndexOf = TextUtils.indexOf(sb, "xxx");
                            if (iIndexOf != -1) {
                                sb.replace(iIndexOf, iIndexOf + 3, str);
                            }
                            abstractActivityC17204.m40397(R.string.MT_Protector, sb.toString(), false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i2 >= 34) {
                    return;
                }
            }
            C4209 c4209 = C18379.f59876;
            if (C4209.m13460(str)) {
                return;
            }
            DialogInterfaceC8327 dialogInterfaceC8327 = this.f44087;
            if (dialogInterfaceC8327 != null && dialogInterfaceC8327.m22434()) {
                this.f44087.dismiss();
            }
            if (!c2717M33861.m9057(z)) {
                if (c2717M33861.m9058()) {
                    m33868(str, z, c2717M33861, new RunnableC0241(1, this, str));
                    return;
                } else {
                    m33870(str);
                    return;
                }
            }
            String strReplace2 = C21576.m49088(R.string.MT_Protector).replace("xxx", str);
            if (Build.VERSION.SDK_INT == 33) {
                strReplace2 = strReplace2.replace("Android 11", "Android 13");
            }
            C2361 c2361BuildDialog2 = abstractActivityC17204.buildDialog();
            c2361BuildDialog2.m8021(R.string.MT_Protector);
            c2361BuildDialog2.m8008(strReplace2);
            c2361BuildDialog2.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2690(this, str, 2));
            c2361BuildDialog2.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            final DialogInterfaceC8327 dialogInterfaceC8327M8017 = c2361BuildDialog2.m8016();
            this.f44087 = dialogInterfaceC8327M8017;
            dialogInterfaceC8327M8017.m22426(new DialogInterface.OnDismissListener() { // from class: l.۟ܰᩴ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C13903.m33859(this.f26369, dialogInterfaceC8327M8017);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33853(C13903 c13903, String str) {
        f44084 = false;
        f44081 = Collections.singletonList(str);
        c13903.m33858(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33863(C13903 c13903, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (c13903.f44087 == dialogInterfaceC8327) {
            c13903.f44087 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33862(C13903 c13903, String str) {
        f44084 = false;
        f44081 = Collections.singletonList(str);
        c13903.m33858(str);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33859(C13903 c13903, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (c13903.f44087 == dialogInterfaceC8327) {
            c13903.f44087 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33868(String str, final boolean z, C2717 c2717, final Runnable runnable) {
        String strReplace = C21576.m49088(R.string.MT_Protector).replace("xxx", str);
        C2361 c2361BuildDialog = this.f44085.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(strReplace);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new ViewOnClickListenerC18260(1, this, c2717));
        this.f44087 = dialogInterfaceC8327M8016;
        dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.ۢܰᩴ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C13903.m33855(this.f32571, dialogInterfaceC8327M8016);
            }
        });
        C5261.f18540.submit(new Runnable() { // from class: l.֨ܰᩴ
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    DialogInterfaceC8327 dialogInterfaceC8327 = dialogInterfaceC8327M8016;
                    if (!dialogInterfaceC8327.m22434()) {
                        return;
                    }
                    if (C13903.m33861().m9057(z)) {
                        C21576.m49068(new RunnableC11435(2, dialogInterfaceC8327, runnable));
                    }
                    SystemClock.sleep(600L);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33855(C13903 c13903, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (c13903.f44087 == dialogInterfaceC8327) {
            c13903.f44087 = null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33870(String str) {
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f44087;
        if (dialogInterfaceC8327 != null && dialogInterfaceC8327.m22434()) {
            this.f44087.dismiss();
        }
        String strReplace = C21576.m49088(R.string.MT_Protector).replace("xxx", str);
        C2361 c2361BuildDialog = this.f44085.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(strReplace);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        this.f44087 = dialogInterfaceC8327M8016;
        dialogInterfaceC8327M8016.m22426(new DialogInterface.OnDismissListener() { // from class: l.ᩳܰᩴ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C13903.m33864(this.f61893, dialogInterfaceC8327M8016);
            }
        });
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m33864(C13903 c13903, DialogInterfaceC8327 dialogInterfaceC8327) {
        if (c13903.f44087 == dialogInterfaceC8327) {
            c13903.f44087 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33869(LinkedHashSet linkedHashSet) {
        LinkedList linkedList = new LinkedList(linkedHashSet);
        f44081 = linkedList;
        f44084 = true;
        m33858((String) linkedList.get(0));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m33858(String str) {
        AbstractActivityC17204 abstractActivityC17204 = this.f44085;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.setFlags(195);
        String strM33857 = m33857();
        intent.setPackage(strM33857);
        intent.putExtra("android.provider.extra.INITIAL_URI", C23053.m51953("primary:" + str, true));
        try {
            abstractActivityC17204.mo123(intent);
        } catch (Exception e) {
            if (strM33857 != null) {
                abstractActivityC17204.mo37500(strM33857);
            } else {
                abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33866(Uri uri) {
        List list = f44081;
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        String string = C23053.m51953("primary:" + str, false).toString();
        String name = new File(str).getName();
        boolean z = f44084;
        Runnable runnable = this.f44086;
        if (z) {
            if (!uri.toString().equals(string)) {
                C22673.m51160(C21576.m49059(R.string.MT_Protector, name));
            } else {
                C18379.f59875.put(str, uri);
                C21576.m49091().takePersistableUriPermission(uri, 3);
                C22673.m51154((CharSequence) C21576.m49059(R.string.MT_Protector, name));
            }
            list.remove(0);
            if (list.isEmpty()) {
                runnable.run();
                return;
            } else {
                m33858((String) list.get(0));
                return;
            }
        }
        if (list.size() == 1) {
            if (!uri.toString().equals(string)) {
                m33867(str);
                C22673.m51160(C21576.m49059(R.string.MT_Protector, name));
            } else {
                C18379.f59875.put(str, uri);
                C21576.m49091().takePersistableUriPermission(uri, 3);
                runnable.run();
                C22673.m51154((CharSequence) C21576.m49059(R.string.MT_Protector, name));
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m33857() {
        try {
            try {
                return C21576.m49057("com.google.android.documentsui").packageName;
            } catch (Exception unused) {
                return C21576.m49057("com.android.documentsui").packageName;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2717 m33861() {
        C2717 c2717 = f44082;
        try {
            try {
                PackageInfo packageInfoM49057 = C21576.m49057("com.google.android.documentsui");
                if (c2717 != null && C2717.m9055(c2717, packageInfoM49057)) {
                    return c2717;
                }
                C2717 c2717M9054 = C2717.m9054(packageInfoM49057);
                f44082 = c2717M9054;
                return c2717M9054;
            } catch (Exception unused) {
                return new C2717("com.android.documentsui", false, true, true, 0L);
            }
        } catch (Exception unused2) {
            PackageInfo packageInfoM49058 = C21576.m49057("com.android.documentsui");
            if (c2717 != null && C2717.m9055(c2717, packageInfoM49058)) {
                return c2717;
            }
            C2717 c2717M9055 = C2717.m9054(packageInfoM49058);
            f44082 = c2717M9055;
            return c2717M9055;
        }
        return new C2717("com.android.documentsui", false, true, true, 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33856(C24926 c24926) {
        f44083 = c24926;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m33860() {
        C24926 c24926 = f44083;
        C17359.requireNonNull(c24926);
        return c24926.mo24805();
    }
}
