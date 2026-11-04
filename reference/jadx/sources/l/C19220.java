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

/* JADX INFO: renamed from: l.ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5UB */
/* JADX INFO: loaded from: classes5.dex */
public final class C19220 implements InterfaceC16982 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Notification.Builder f62168;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Bundle f62169;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3558 f62170;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62171;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.net.Uri, java.lang.CharSequence, long[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public C19220(C3558 c3558) {
        ArrayList<C14965> arrayList;
        String str;
        Notification notification;
        ?? r4;
        ?? r5;
        Bundle bundle;
        String str2;
        Bundle[] bundleArr;
        C19220 c19220 = this;
        new ArrayList();
        c19220.f62169 = new Bundle();
        c19220.f62170 = c3558;
        Context context = c3558.f12189;
        ArrayList arrayList2 = c3558.f12192;
        ArrayList<C14965> arrayList3 = c3558.f12193;
        String str3 = c3558.f12186;
        ArrayList arrayList4 = c3558.f12182;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            c19220.f62168 = C21458.m48817(context, str3);
        } else {
            c19220.f62168 = new Notification.Builder(context);
        }
        Notification notification2 = c3558.f12199;
        ArrayList arrayList5 = null;
        c19220.f62168.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(c3558.f12190).setContentText(c3558.f12194).setContentInfo(null).setContentIntent(c3558.f12197).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        if (i < 23) {
            Notification.Builder builder = c19220.f62168;
            C9545 c9545 = c3558.f12187;
            builder.setLargeIcon(c9545 == null ? null : c9545.m24963());
        } else {
            Notification.Builder builder2 = c19220.f62168;
            C9545 c9546 = c3558.f12187;
            C4304.m13732(builder2, c9546 == null ? null : c9546.m24969(context));
        }
        c19220.f62168.setSubText(null).setUsesChronometer(false).setPriority(c3558.f12191);
        AbstractC12507 abstractC12507 = c3558.f12195;
        if (abstractC12507 instanceof C20712) {
            C20712 c20712 = (C20712) abstractC12507;
            int iM20558 = C7508.m20558(c20712.f40156.f12189, R.color.MT_Protector);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c20712.f40156.f12189.getResources().getString(R.string.MT_Protector));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(iM20558), 0, spannableStringBuilder.length(), 18);
            Context context2 = c20712.f40156.f12189;
            int i2 = C9545.f30896;
            context2.getClass();
            C16236 c16236M41515 = new C17728(C9545.m24960(context2.getResources(), context2.getPackageName(), R.drawable.MT_Protector), spannableStringBuilder).m41515();
            c16236M41515.f52780.putBoolean("key_action_priority", true);
            ArrayList arrayList6 = new ArrayList(3);
            arrayList6.add(c16236M41515);
            ArrayList<C16236> arrayList7 = c20712.f40156.f12184;
            if (arrayList7 != null) {
                int i3 = 2;
                for (C16236 c16236 : arrayList7) {
                    c16236.getClass();
                    if (!c16236.f52780.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList6.add(c16236);
                        i3--;
                    }
                }
            }
            Iterator it = arrayList6.iterator();
            while (it.hasNext()) {
                c19220.m44553((C16236) it.next());
            }
        } else {
            Iterator it2 = c3558.f12184.iterator();
            while (it2.hasNext()) {
                c19220.m44553((C16236) it2.next());
            }
        }
        Bundle bundle2 = c3558.f12185;
        if (bundle2 != null) {
            c19220.f62169.putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        c19220.f62168.setShowWhen(c3558.f12198);
        C6542.m18425(c19220.f62168, false);
        C6542.m18421(c19220.f62168, (String) null);
        C6542.m18424(c19220.f62168, (String) null);
        C6542.m18422(c19220.f62168, false);
        c19220.f62171 = 0;
        C24442.m54653(c19220.f62168, (String) null);
        C24442.m54648(c19220.f62168, 0);
        C24442.m54652(c19220.f62168, c3558.f12188);
        C24442.m54649(c19220.f62168, (Notification) null);
        C24442.m54650(c19220.f62168, notification2.sound, notification2.audioAttributes);
        if (i4 < 28) {
            if (arrayList3 != null) {
                arrayList5 = new ArrayList(arrayList3.size());
                for (C14965 c14965 : arrayList3) {
                    String str4 = c14965.f48878;
                    String str5 = c14965.f48876;
                    if (str5 == null) {
                        str5 = str4 != null ? "name:" + ((Object) str4) : "";
                    }
                    arrayList5.add(str5);
                }
            }
            if (arrayList5 != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList5;
                } else {
                    C18037 c18037 = new C18037(arrayList2.size() + arrayList5.size());
                    c18037.addAll(arrayList5);
                    c18037.addAll(arrayList2);
                    arrayList2 = new ArrayList(c18037);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C24442.m54651(c19220.f62168, (String) it3.next());
            }
        }
        if (arrayList4.size() > 0) {
            if (c3558.f12185 == null) {
                c3558.f12185 = new Bundle();
            }
            Bundle bundle3 = c3558.f12185.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList4.size()) {
                String string = Integer.toString(i5);
                C16236 c16237 = (C16236) arrayList4.get(i5);
                Bundle bundle6 = new Bundle();
                C9545 c9545M38536 = c16237.m38536();
                Bundle bundle7 = c16237.f52780;
                ArrayList arrayList8 = arrayList4;
                bundle6.putInt("icon", c9545M38536 != null ? c9545M38536.m24968() : 0);
                bundle6.putCharSequence("title", c16237.f52774);
                bundle6.putParcelable("actionIntent", c16237.f52773);
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c16237.m38534());
                bundle6.putBundle("extras", bundle);
                C24663[] c24663ArrM38535 = c16237.m38535();
                if (c24663ArrM38535 == null) {
                    bundleArr = null;
                    str2 = str3;
                } else {
                    Bundle[] bundleArr2 = new Bundle[c24663ArrM38535.length];
                    int i6 = 0;
                    while (i6 < c24663ArrM38535.length) {
                        C24663 c24663 = c24663ArrM38535[i6];
                        C24663[] c24663Arr = c24663ArrM38535;
                        Bundle bundle8 = new Bundle();
                        c24663.getClass();
                        bundle8.putString("resultKey", null);
                        bundle8.putCharSequence(AnnotatedPrivateKey.LABEL, null);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", null);
                        bundleArr2[i6] = bundle8;
                        i6++;
                        c24663ArrM38535 = c24663Arr;
                        str3 = str3;
                    }
                    str2 = str3;
                    bundleArr = bundleArr2;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c16237.f52776);
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
            if (c3558.f12185 == null) {
                c3558.f12185 = new Bundle();
            }
            c3558.f12185.putBundle("android.car.EXTENSIONS", bundle3);
            c19220 = this;
            c19220.f62169.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList3;
            str = str3;
            notification = notification2;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            c19220.f62168.setExtras(c3558.f12185);
            r4 = 0;
            C14744.m35433(c19220.f62168, (CharSequence[]) null);
        } else {
            r4 = 0;
        }
        if (i7 >= 26) {
            C21458.m48813(c19220.f62168, 0);
            C21458.m48815(c19220.f62168, (CharSequence) r4);
            C21458.m48816(c19220.f62168, (String) r4);
            C21458.m48814(c19220.f62168, 0L);
            C21458.m48818(c19220.f62168, 0);
            if (!TextUtils.isEmpty(str)) {
                c19220.f62168.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (i7 >= 28) {
            for (C14965 c14966 : arrayList) {
                Notification.Builder builder3 = c19220.f62168;
                c14966.getClass();
                C18474.m43053(builder3, C19441.m44929(c14966));
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            C0575.m2598(c19220.f62168, c3558.f12196);
            r5 = 0;
            C0575.m2597(c19220.f62168, (Notification.BubbleMetadata) null);
        } else {
            r5 = 0;
        }
        if (c3558.f12183) {
            c19220.f62170.getClass();
            c19220.f62171 = 1;
            c19220.f62168.setVibrate(r5);
            c19220.f62168.setSound(r5);
            Notification notification3 = notification;
            int i9 = notification3.defaults & (-4);
            notification3.defaults = i9;
            c19220.f62168.setDefaults(i9);
            if (i8 >= 26) {
                c19220.f62170.getClass();
                if (TextUtils.isEmpty(r5)) {
                    C6542.m18421(c19220.f62168, "silent");
                }
                C21458.m48818(c19220.f62168, 1);
            }
        }
    }

    @Override // l.InterfaceC16982
    /* JADX INFO: renamed from: ۙ */
    public final Notification.Builder mo40047() {
        return this.f62168;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Notification m44554() {
        Notification notificationBuild;
        Bundle bundle;
        String strMo31059;
        C3558 c3558 = this.f62170;
        AbstractC12507 abstractC12507 = c3558.f12195;
        if (abstractC12507 != null) {
            abstractC12507.mo31060(this);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = this.f62168;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            int i2 = this.f62171;
            if (i >= 24) {
                notificationBuild = builder.build();
                if (i2 != 0) {
                    if (C6542.m18423(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i2 == 2) {
                        m44552(notificationBuild);
                    }
                    if (C6542.m18423(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i2 == 1) {
                        m44552(notificationBuild);
                    }
                }
            } else {
                builder.setExtras(this.f62169);
                notificationBuild = builder.build();
                if (i2 != 0) {
                    if (C6542.m18423(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && i2 == 2) {
                        m44552(notificationBuild);
                    }
                    if (C6542.m18423(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && i2 == 1) {
                        m44552(notificationBuild);
                    }
                }
            }
        }
        if (abstractC12507 != null) {
            c3558.f12195.getClass();
        }
        if (abstractC12507 != null && (bundle = notificationBuild.extras) != null && (strMo31059 = abstractC12507.mo31059()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strMo31059);
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44553(C16236 c16236) {
        Notification.Action.Builder builderM18416;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        C9545 c9545M38536 = c16236.m38536();
        Bundle bundle2 = c16236.f52780;
        PendingIntent pendingIntent = c16236.f52773;
        CharSequence charSequence = c16236.f52774;
        RemoteInput[] remoteInputArr = null;
        if (i >= 23) {
            builderM18416 = C4304.m13731(c9545M38536 != null ? c9545M38536.m24969((Context) null) : null, charSequence, pendingIntent);
        } else {
            builderM18416 = C6542.m18416(c9545M38536 != null ? c9545M38536.m24968() : 0, charSequence, pendingIntent);
        }
        if (c16236.m38535() != null) {
            C24663[] c24663ArrM38535 = c16236.m38535();
            if (c24663ArrM38535 != null) {
                RemoteInput[] remoteInputArr2 = new RemoteInput[c24663ArrM38535.length];
                for (int i2 = 0; i2 < c24663ArrM38535.length; i2++) {
                    c24663ArrM38535[i2].getClass();
                    RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        C11236.m28316(builderAddExtras, 0);
                    }
                    remoteInputArr2[i2] = builderAddExtras.build();
                }
                remoteInputArr = remoteInputArr2;
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                C6542.m18417(builderM18416, remoteInput);
            }
        }
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c16236.m38534());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            C14744.m35432(builderM18416, c16236.m38534());
        }
        bundle.putInt("android.support.action.semanticAction", 0);
        if (i3 >= 28) {
            C18474.m43052(builderM18416, 0);
        }
        if (i3 >= 29) {
            C0575.m2596(builderM18416, false);
        }
        if (i3 >= 31) {
            C8033.m21907(builderM18416, false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c16236.f52776);
        C6542.m18418(builderM18416, bundle);
        C6542.m18420(this.f62168, C6542.m18419(builderM18416));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44552(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
