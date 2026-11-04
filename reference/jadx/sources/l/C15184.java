package l;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes4.dex */
public final class C15184 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f49567;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ComponentName f49568;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Intent[] f49569;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Context f49570;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8254 f49571;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f49572;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9545 f49573;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C14965[] f49574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49575;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public PersistableBundle f49576;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f49577;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public CharSequence f49578;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence f49579;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ShortcutInfo m36533() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f49570, this.f49572).setShortLabel(this.f49567).setIntents(this.f49569);
        C9545 c9545 = this.f49573;
        if (c9545 != null) {
            intents.setIcon(c9545.m24969(this.f49570));
        }
        if (!TextUtils.isEmpty(this.f49579)) {
            intents.setLongLabel(this.f49579);
        }
        if (!TextUtils.isEmpty(this.f49578)) {
            intents.setDisabledMessage(this.f49578);
        }
        ComponentName componentName = this.f49568;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f49577;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f49575);
        PersistableBundle persistableBundle = this.f49576;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C14965[] c14965Arr = this.f49574;
            if (c14965Arr != null && c14965Arr.length > 0) {
                int length = c14965Arr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f49574[i].m36025();
                }
                intents.setPersons(personArr);
            }
            C8254 c8254 = this.f49571;
            if (c8254 != null) {
                intents.setLocusId(c8254.m22227());
            }
            intents.setLongLived(false);
        } else {
            if (this.f49576 == null) {
                this.f49576 = new PersistableBundle();
            }
            C14965[] c14965Arr2 = this.f49574;
            if (c14965Arr2 != null && c14965Arr2.length > 0) {
                this.f49576.putInt("extraPersonCount", c14965Arr2.length);
                int i2 = 0;
                while (i2 < this.f49574.length) {
                    PersistableBundle persistableBundle2 = this.f49576;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    persistableBundle2.putPersistableBundle(sb.toString(), this.f49574[i2].m36026());
                    i2 = i3;
                }
            }
            C8254 c8255 = this.f49571;
            if (c8255 != null) {
                this.f49576.putString("extraLocusId", c8255.m22226());
            }
            this.f49576.putBoolean("extraLongLived", false);
            intents.setExtras(this.f49576);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C22644.m51046(intents);
        }
        return intents.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m36530() {
        return this.f49572;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence m36531() {
        return this.f49567;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Intent m36532() {
        Intent[] intentArr = this.f49569;
        return intentArr[intentArr.length - 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m36529(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C19660(context, (ShortcutInfo) it.next()).m45322());
        }
        return arrayList;
    }
}
