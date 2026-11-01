package l;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7106 implements InterfaceC4989 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f23797;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Notification.Builder f23798;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Bundle f23799;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3577 f23800;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.net.Uri, java.lang.CharSequence, long[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public C7106(C3577 c3577) {
        ArrayList<C9224> arrayList;
        String str;
        Notification notification;
        ?? r4;
        ?? r5;
        Bundle bundle;
        String str2;
        Bundle[] bundleArr;
        C7106 c7106 = this;
        new ArrayList();
        c7106.f23799 = new Bundle();
        c7106.f23800 = c3577;
        Context context = c3577.f13151;
        ArrayList arrayList2 = c3577.f13162;
        ArrayList<C9224> arrayList3 = c3577.f13166;
        String str3 = c3577.f13159;
        ArrayList arrayList4 = c3577.f13153;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            c7106.f23798 = C7812.m20514(context, str3);
        } else {
            c7106.f23798 = new Notification.Builder(context);
        }
        Notification notification2 = c3577.f13168;
        ArrayList arrayList5 = null;
        c7106.f23798.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c3577.f13167).setContentText(c3577.f13155).setContentInfo(null).setContentIntent(c3577.f13152).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        if (i < 23) {
            Notification.Builder builder = c7106.f23798;
            C16775 c16775 = c3577.f13156;
            builder.setLargeIcon(c16775 == null ? null : c16775.m39339());
        } else {
            Notification.Builder builder2 = c7106.f23798;
            C16775 c16776 = c3577.f13156;
            C17689.m41211(builder2, c16776 == null ? null : c16776.m39345(context));
        }
        c7106.f23798.setSubText(null).setUsesChronometer(false).setPriority(c3577.f13163);
        AbstractC22629 abstractC22629 = c3577.f13165;
        if (abstractC22629 instanceof C6400) {
            C6400 c6400 = (C6400) abstractC22629;
            int iM26299 = C10405.m26299(c6400.f73730.f13151, R.color.MT_Protector);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c6400.f73730.f13151.getResources().getString(R.string.MT_Protector));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iM26299), 0, spannableStringBuilder.length(), 18);
            Context context2 = c6400.f73730.f13151;
            int i2 = C16775.f53689;
            context2.getClass();
            C0755 c0755M48750 = new C21923(C16775.m39334(context2.getResources(), context2.getPackageName(), R.drawable.MT_Protector), spannableStringBuilder).m48750();
            c0755M48750.f3060.putBoolean("key_action_priority", true);
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(c0755M48750);
            ArrayList<C0755> arrayList7 = c6400.f73730.f13154;
            if (arrayList7 != null) {
                int i3 = 2;
                for (C0755 c0755 : arrayList7) {
                    c0755.getClass();
                    if (!c0755.f3060.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList6.add(c0755);
                        i3--;
                    }
                }
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                c7106.m18995((C0755) it.next());
            }
        } else {
            Iterator it2 = c3577.f13154.iterator();
            while (it2.hasNext()) {
                c7106.m18995((C0755) it2.next());
            }
        }
        Bundle bundle2 = c3577.f13160;
        if (bundle2 != null) {
            c7106.f23799.putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        c7106.f23798.setShowWhen(c3577.f13164);
        C14868.m35556(c7106.f23798, false);
        C14868.m35552(c7106.f23798, (String) null);
        C14868.m35555(c7106.f23798, (String) null);
        C14868.m35553(c7106.f23798, false);
        c7106.f23797 = 0;
        C21217.m47695(c7106.f23798, (String) null);
        C21217.m47690(c7106.f23798, 0);
        C21217.m47694(c7106.f23798, c3577.f13158);
        C21217.m47691(c7106.f23798, (Notification) null);
        C21217.m47692(c7106.f23798, notification2.sound, notification2.audioAttributes);
        if (i4 < 28) {
            if (arrayList3 != null) {
                arrayList5 = new ArrayList(arrayList3.size());
                for (C9224 c9224 : arrayList3) {
                    CharSequence charSequence = c9224.f31358;
                    String str4 = c9224.f31361;
                    if (str4 == null) {
                        str4 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList5.add(str4);
                }
            }
            if (arrayList5 != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList5;
                } else {
                    C18623 c18623 = new C18623(arrayList2.size() + arrayList5.size());
                    c18623.addAll(arrayList5);
                    c18623.addAll(arrayList2);
                    arrayList2 = new ArrayList(c18623);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C21217.m47693(c7106.f23798, (String) it3.next());
            }
        }
        if (arrayList4.size() > 0) {
            if (c3577.f13160 == null) {
                c3577.f13160 = new Bundle();
            }
            Bundle bundle3 = c3577.f13160.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList4.size()) {
                String string = Integer.toString(i5);
                C0755 c0756 = (C0755) arrayList4.get(i5);
                Bundle bundle6 = new Bundle();
                C16775 c16775M3252 = c0756.m3252();
                Bundle bundle7 = c0756.f3060;
                ArrayList arrayList8 = arrayList4;
                bundle6.putInt("icon", c16775M3252 != null ? c16775M3252.m39344() : 0);
                bundle6.putCharSequence("title", c0756.f3064);
                bundle6.putParcelable("actionIntent", c0756.f3061);
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0756.m3250());
                bundle6.putBundle("extras", bundle);
                C2642[] c2642ArrM3251 = c0756.m3251();
                if (c2642ArrM3251 == null) {
                    bundleArr = null;
                    str2 = str3;
                } else {
                    Bundle[] bundleArr2 = new Bundle[c2642ArrM3251.length];
                    int i6 = 0;
                    while (i6 < c2642ArrM3251.length) {
                        C2642 c2642 = c2642ArrM3251[i6];
                        C2642[] c2642Arr = c2642ArrM3251;
                        Bundle bundle8 = new Bundle();
                        c2642.getClass();
                        bundle8.putString("resultKey", null);
                        bundle8.putCharSequence(AnnotatedPrivateKey.LABEL, null);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", null);
                        bundleArr2[i6] = bundle8;
                        i6++;
                        c2642ArrM3251 = c2642Arr;
                        str3 = str3;
                    }
                    str2 = str3;
                    bundleArr = bundleArr2;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c0756.f3059);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i5++;
                arrayList4 = arrayList8;
                arrayList3 = arrayList3;
                notification2 = notification2;
                str3 = str2;
            }
            arrayList = arrayList3;
            str = str3;
            notification = notification2;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (c3577.f13160 == null) {
                c3577.f13160 = new Bundle();
            }
            c3577.f13160.putBundle("android.car.EXTENSIONS", bundle3);
            c7106 = this;
            c7106.f23799.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList3;
            str = str3;
            notification = notification2;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            c7106.f23798.setExtras(c3577.f13160);
            r4 = 0;
            C18395.m42667(c7106.f23798, (CharSequence[]) null);
        } else {
            r4 = 0;
        }
        if (i7 >= 26) {
            C7812.m20509(c7106.f23798, 0);
            C7812.m20511(c7106.f23798, (CharSequence) r4);
            C7812.m20512(c7106.f23798, (String) r4);
            C7812.m20510(c7106.f23798, 0L);
            C7812.m20515(c7106.f23798, 0);
            if (!TextUtils.isEmpty(str)) {
                c7106.f23798.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (i7 >= 28) {
            for (C9224 c9225 : arrayList) {
                Notification.Builder builder3 = c7106.f23798;
                c9225.getClass();
                C19101.m43866(builder3, C1461.m5075(c9225));
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            C8518.m22248(c7106.f23798, c3577.f13161);
            r5 = 0;
            C8518.m22246(c7106.f23798, (Notification.BubbleMetadata) null);
        } else {
            r5 = 0;
        }
        if (c3577.f13157) {
            c7106.f23800.getClass();
            c7106.f23797 = 1;
            c7106.f23798.setVibrate(r5);
            c7106.f23798.setSound(r5);
            Notification notification3 = notification;
            int i9 = notification3.defaults & (-4);
            notification3.defaults = i9;
            c7106.f23798.setDefaults(i9);
            if (i8 >= 26) {
                c7106.f23800.getClass();
                if (TextUtils.isEmpty(r5)) {
                    C14868.m35552(c7106.f23798, "silent");
                }
                C7812.m20515(c7106.f23798, 1);
            }
        }
    }

    @Override // l.InterfaceC4989
    /* JADX INFO: renamed from: ۙ */
    public final Notification.Builder mo13816() {
        return this.f23798;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Notification m18996() {
        Notification notificationBuild;
        Bundle bundle;
        String strMo31692;
        C3577 c3577 = this.f23800;
        AbstractC22629 abstractC22629 = c3577.f13165;
        if (abstractC22629 != null) {
            abstractC22629.mo17216(this);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = this.f23798;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            int i2 = this.f23797;
            if (i >= 24) {
                notificationBuild = builder.build();
                if (i2 != 0) {
                    if (C14868.m35554(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i2 == 2) {
                        m18994(notificationBuild);
                    }
                    if (C14868.m35554(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i2 == 1) {
                        m18994(notificationBuild);
                    }
                }
            } else {
                builder.setExtras(this.f23799);
                notificationBuild = builder.build();
                if (i2 != 0) {
                    if (C14868.m35554(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i2 == 2) {
                        m18994(notificationBuild);
                    }
                    if (C14868.m35554(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i2 == 1) {
                        m18994(notificationBuild);
                    }
                }
            }
        }
        if (abstractC22629 != null) {
            c3577.f13165.getClass();
        }
        if (abstractC22629 != null && (bundle = notificationBuild.extras) != null && (strMo31692 = abstractC22629.mo31692()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo31692);
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18995(C0755 c0755) {
        Notification.Action.Builder builderM35547;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        C16775 c16775M3252 = c0755.m3252();
        Bundle bundle2 = c0755.f3060;
        PendingIntent pendingIntent = c0755.f3061;
        CharSequence charSequence = c0755.f3064;
        RemoteInput[] remoteInputArr = null;
        if (i >= 23) {
            builderM35547 = C17689.m41210(c16775M3252 != null ? c16775M3252.m39345((Context) null) : null, charSequence, pendingIntent);
        } else {
            builderM35547 = C14868.m35547(c16775M3252 != null ? c16775M3252.m39344() : 0, charSequence, pendingIntent);
        }
        if (c0755.m3251() != null) {
            C2642[] c2642ArrM3251 = c0755.m3251();
            if (c2642ArrM3251 != null) {
                remoteInputArr = new RemoteInput[c2642ArrM3251.length];
                for (int i2 = 0; i2 < c2642ArrM3251.length; i2++) {
                    c2642ArrM3251[i2].getClass();
                    RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        C11816.m29487(builderAddExtras, 0);
                    }
                    remoteInputArr[i2] = builderAddExtras.build();
                }
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                C14868.m35548(builderM35547, remoteInput);
            }
        }
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c0755.m3250());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            C18395.m42665(builderM35547, c0755.m3250());
        }
        bundle.putInt("android.support.action.semanticAction", 0);
        if (i3 >= 28) {
            C19101.m43865(builderM35547, 0);
        }
        if (i3 >= 29) {
            C8518.m22245(builderM35547, false);
        }
        if (i3 >= 31) {
            C9929.m25133(builderM35547, false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c0755.f3059);
        C14868.m35549(builderM35547, bundle);
        C14868.m35551(this.f23798, C14868.m35550(builderM35547));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18994(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
