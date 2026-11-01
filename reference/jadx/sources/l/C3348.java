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

/* JADX INFO: renamed from: l.ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3348 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f12372;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence f12373;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public CharSequence f12374;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ComponentName f12375;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PersistableBundle f12376;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16755 f12377;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Context f12378;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Intent[] f12379;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Set f12380;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C9224[] f12381;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12382;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16775 f12383;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public CharSequence f12384;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ShortcutInfo m9956() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f12378, this.f12372).setShortLabel(this.f12374).setIntents(this.f12379);
        C16775 c16775 = this.f12383;
        if (c16775 != null) {
            intents.setIcon(c16775.m39345(this.f12378));
        }
        if (!TextUtils.isEmpty(this.f12384)) {
            intents.setLongLabel(this.f12384);
        }
        if (!TextUtils.isEmpty(this.f12373)) {
            intents.setDisabledMessage(this.f12373);
        }
        ComponentName componentName = this.f12375;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f12380;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f12382);
        PersistableBundle persistableBundle = this.f12376;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C9224[] c9224Arr = this.f12381;
            if (c9224Arr != null && c9224Arr.length > 0) {
                int length = c9224Arr.length;
                Person[] personArr = new Person[length];
                for (int i = 0; i < length; i++) {
                    personArr[i] = this.f12381[i].m23746();
                }
                intents.setPersons(personArr);
            }
            C16755 c16755 = this.f12377;
            if (c16755 != null) {
                intents.setLocusId(c16755.m39320());
            }
            intents.setLongLived(false);
        } else {
            if (this.f12376 == null) {
                this.f12376 = new PersistableBundle();
            }
            C9224[] c9224Arr2 = this.f12381;
            if (c9224Arr2 != null && c9224Arr2.length > 0) {
                this.f12376.putInt("extraPersonCount", c9224Arr2.length);
                int i2 = 0;
                while (i2 < this.f12381.length) {
                    PersistableBundle persistableBundle2 = this.f12376;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    persistableBundle2.putPersistableBundle(sb.toString(), this.f12381[i2].m23747());
                    i2 = i3;
                }
            }
            C16755 c16756 = this.f12377;
            if (c16756 != null) {
                this.f12376.putString("extraLocusId", c16756.m39319());
            }
            this.f12376.putBoolean("extraLongLived", false);
            intents.setExtras(this.f12376);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            C1937.m6277(intents);
        }
        return intents.build();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9957() {
        return this.f12372;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence m9958() {
        return this.f12374;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Intent m9959() {
        Intent[] intentArr = this.f12379;
        return intentArr[intentArr.length - 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m9955(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9700(context, (ShortcutInfo) it.next()).m24662());
        }
        return arrayList;
    }
}
