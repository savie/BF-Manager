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

/* JADX INFO: renamed from: l.ܰ᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes3.dex */
public final class C14063 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static List f46204;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f46205;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C19663 f46206;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C9436 f46207;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f46208;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f46209;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f46210;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m34008() {
        if (Build.VERSION.SDK_INT >= 30 && !C3084.f11674) {
            return (C19812.m45051() && C19812.m45045().mo43869()) ? false : true;
        }
        return false;
    }

    public C14063(AbstractActivityC12483 abstractActivityC12483, Runnable runnable) {
        this.f46208 = abstractActivityC12483;
        this.f46209 = runnable;
        if (Build.VERSION.SDK_INT >= 30) {
            C17196.f54827.m44959(abstractActivityC12483, new C12258(new C20019(abstractActivityC12483, new C21079(2, this))));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34022(String str) {
        if (m34008()) {
            boolean zM15303 = C5553.m15303();
            int i = 1;
            AbstractActivityC12483 abstractActivityC12483 = this.f46208;
            if (zM15303) {
                String strReplace = C16737.m39288(R.string.MT_Protector).replace("xxx", "Android/data");
                C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
                c8067BuildDialog.m21274(R.string.MT_Protector);
                c8067BuildDialog.m21261(strReplace);
                c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC12856(i, this, str));
                c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
                this.f46210 = dialogInterfaceC19356M21269;
                dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.ۛ۟ۚ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C14063.m34020(this.f20158, dialogInterfaceC19356M21269);
                    }
                });
                return;
            }
            C9436 c9436M34018 = m34018();
            boolean z = str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb");
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 33) {
                    if (c9436M34018.m24194() || c9436M34018.m24196()) {
                        String strConcat = "forbid_tip_".concat(str);
                        if (C16737.f53615.getBoolean(strConcat, true)) {
                            C16737.f53615.edit().putBoolean(strConcat, false).apply();
                            StringBuilder sb = new StringBuilder(C16737.m39279().getText(R.string.MT_Protector));
                            int iIndexOf = TextUtils.indexOf(sb, "xxx");
                            if (iIndexOf != -1) {
                                sb.replace(iIndexOf, iIndexOf + 3, str);
                            }
                            abstractActivityC12483.m30997(R.string.MT_Protector, sb.toString(), false);
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
            C0262 c0262 = C17196.f54822;
            if (C0262.m1763(str)) {
                return;
            }
            DialogInterfaceC19356 dialogInterfaceC19356 = this.f46210;
            if (dialogInterfaceC19356 != null && dialogInterfaceC19356.m44375()) {
                this.f46210.dismiss();
            }
            if (!c9436M34018.m24195(z)) {
                if (c9436M34018.m24196()) {
                    m34023(str, z, c9436M34018, new RunnableC1009(1, this, str));
                    return;
                } else {
                    m34025(str);
                    return;
                }
            }
            String strReplace2 = C16737.m39288(R.string.MT_Protector).replace("xxx", str);
            if (Build.VERSION.SDK_INT == 33) {
                strReplace2 = strReplace2.replace("Android 11", "Android 13");
            }
            C8067 c8067BuildDialog2 = abstractActivityC12483.buildDialog();
            c8067BuildDialog2.m21274(R.string.MT_Protector);
            c8067BuildDialog2.m21261(strReplace2);
            c8067BuildDialog2.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23103(i, this, str));
            c8067BuildDialog2.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            final DialogInterfaceC19356 dialogInterfaceC19356M212610 = c8067BuildDialog2.m21269();
            this.f46210 = dialogInterfaceC19356M212610;
            dialogInterfaceC19356M212610.m44367(new DialogInterface.OnDismissListener() { // from class: l.ۧ۟ۚ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C14063.m34017(this.f36921, dialogInterfaceC19356M212610);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34010(C14063 c14063, String str) {
        f46205 = false;
        f46204 = Collections.singletonList(str);
        c14063.m34016(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34020(C14063 c14063, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (c14063.f46210 == dialogInterfaceC19356) {
            c14063.f46210 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34019(C14063 c14063, String str) {
        f46205 = false;
        f46204 = Collections.singletonList(str);
        c14063.m34016(str);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34017(C14063 c14063, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (c14063.f46210 == dialogInterfaceC19356) {
            c14063.f46210 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34023(String str, final boolean z, C9436 c9436, final Runnable runnable) {
        String strReplace = C16737.m39288(R.string.MT_Protector).replace("xxx", str);
        C8067 c8067BuildDialog = this.f46208.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(strReplace);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new ViewOnClickListenerC2379(1, this, c9436));
        this.f46210 = dialogInterfaceC19356M21269;
        dialogInterfaceC19356M21269.m44367(new DialogInterfaceOnDismissListenerC3596(1, this, dialogInterfaceC19356M21269));
        C4716.f16636.submit(new Runnable() { // from class: l.ܳ۟ۚ
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    DialogInterfaceC19356 dialogInterfaceC19356 = dialogInterfaceC19356M21269;
                    if (!dialogInterfaceC19356.m44375()) {
                        return;
                    }
                    if (C14063.m34018().m24195(z)) {
                        C16737.m39273(new RunnableC13438(3, dialogInterfaceC19356, runnable));
                    }
                    SystemClock.sleep(600L);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34012(C14063 c14063, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (c14063.f46210 == dialogInterfaceC19356) {
            c14063.f46210 = null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m34025(String str) {
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f46210;
        if (dialogInterfaceC19356 != null && dialogInterfaceC19356.m44375()) {
            this.f46210.dismiss();
        }
        String strReplace = C16737.m39288(R.string.MT_Protector).replace("xxx", str);
        C8067 c8067BuildDialog = this.f46208.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(strReplace);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        this.f46210 = dialogInterfaceC19356M21269;
        dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.᩻۟ۚ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C14063.m34007(this.f76262, dialogInterfaceC19356M21269);
            }
        });
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34007(C14063 c14063, DialogInterfaceC19356 dialogInterfaceC19356) {
        if (c14063.f46210 == dialogInterfaceC19356) {
            c14063.f46210 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34024(LinkedHashSet linkedHashSet) {
        LinkedList linkedList = new LinkedList(linkedHashSet);
        f46204 = linkedList;
        f46205 = true;
        m34016((String) linkedList.get(0));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m34016(String str) {
        AbstractActivityC12483 abstractActivityC12483 = this.f46208;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.setFlags(195);
        String strM34015 = m34015();
        intent.setPackage(strM34015);
        intent.putExtra("android.provider.extra.INITIAL_URI", C22529.m50043("primary:" + str, true));
        try {
            abstractActivityC12483.mo130(intent);
        } catch (Exception e) {
            if (strM34015 != null) {
                abstractActivityC12483.mo30999(strM34015);
            } else {
                abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34021(Uri uri) {
        List list = f46204;
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        String string = C22529.m50043("primary:" + str, false).toString();
        String name = new File(str).getName();
        boolean z = f46205;
        Runnable runnable = this.f46209;
        if (z) {
            if (!uri.toString().equals(string)) {
                C15829.m37619(C16737.m39264(R.string.MT_Protector, name));
            } else {
                C17196.f54825.put(str, uri);
                C16737.m39259().takePersistableUriPermission(uri, 3);
                C15829.m37613((CharSequence) C16737.m39264(R.string.MT_Protector, name));
            }
            list.remove(0);
            if (list.isEmpty()) {
                runnable.run();
                return;
            } else {
                m34016((String) list.get(0));
                return;
            }
        }
        if (list.size() == 1) {
            if (!uri.toString().equals(string)) {
                m34022(str);
                C15829.m37619(C16737.m39264(R.string.MT_Protector, name));
            } else {
                C17196.f54825.put(str, uri);
                C16737.m39259().takePersistableUriPermission(uri, 3);
                runnable.run();
                C15829.m37613((CharSequence) C16737.m39264(R.string.MT_Protector, name));
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m34015() {
        try {
            try {
                return C16737.m39262("com.google.android.documentsui").packageName;
            } catch (Exception unused) {
                return C16737.m39262("com.android.documentsui").packageName;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C9436 m34018() {
        C9436 c9436 = f46207;
        try {
            try {
                PackageInfo packageInfoM39262 = C16737.m39262("com.google.android.documentsui");
                if (c9436 != null && C9436.m24193(c9436, packageInfoM39262)) {
                    return c9436;
                }
                C9436 c9436M24192 = C9436.m24192(packageInfoM39262);
                f46207 = c9436M24192;
                return c9436M24192;
            } catch (Exception unused) {
                return new C9436("com.android.documentsui", false, true, true, 0L);
            }
        } catch (Exception unused2) {
            PackageInfo packageInfoM39263 = C16737.m39262("com.android.documentsui");
            if (c9436 != null && C9436.m24193(c9436, packageInfoM39263)) {
                return c9436;
            }
            C9436 c9436M24193 = C9436.m24192(packageInfoM39263);
            f46207 = c9436M24193;
            return c9436M24193;
        }
        return new C9436("com.android.documentsui", false, true, true, 0L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m34013(C19663 c19663) {
        f46206 = c19663;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m34014() {
        C19663 c19663 = f46206;
        C13638.requireNonNull(c19663);
        return c19663.mo5588();
    }
}
