package l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19660 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15184 f63333;

    public C19660(Context context, String str) {
        C15184 c15184 = new C15184();
        this.f63333 = c15184;
        c15184.f49570 = context;
        c15184.f49572 = str;
    }

    public C19660(C15184 c15184) {
        C15184 c15185 = new C15184();
        this.f63333 = c15185;
        c15185.f49570 = c15184.f49570;
        c15185.f49572 = c15184.f49572;
        Intent[] intentArr = c15184.f49569;
        c15185.f49569 = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        c15185.f49568 = c15184.f49568;
        c15185.f49567 = c15184.f49567;
        c15185.f49579 = c15184.f49579;
        c15185.f49578 = c15184.f49578;
        c15185.f49573 = c15184.f49573;
        c15185.f49571 = c15184.f49571;
        c15185.f49575 = c15184.f49575;
        C14965[] c14965Arr = c15184.f49574;
        if (c14965Arr != null) {
            c15185.f49574 = (C14965[]) Arrays.copyOf(c14965Arr, c14965Arr.length);
        }
        if (c15184.f49577 != null) {
            c15185.f49577 = new HashSet(c15184.f49577);
        }
        PersistableBundle persistableBundle = c15184.f49576;
        if (persistableBundle != null) {
            c15185.f49576 = persistableBundle;
        }
    }

    public C19660(Context context, ShortcutInfo shortcutInfo) {
        C14965[] c14965Arr;
        String string;
        C15184 c15184 = new C15184();
        this.f63333 = c15184;
        c15184.f49570 = context;
        c15184.f49572 = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        c15184.f49569 = (Intent[]) Arrays.copyOf(intents, intents.length);
        c15184.f49568 = shortcutInfo.getActivity();
        c15184.f49567 = shortcutInfo.getShortLabel();
        c15184.f49579 = shortcutInfo.getLongLabel();
        c15184.f49578 = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        c15184.f49577 = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        C8254 c8254 = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            c14965Arr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            c14965Arr = new C14965[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                c14965Arr[i2] = C14965.m36024(extras.getPersistableBundle(sb.toString()));
                i2 = i3;
            }
        }
        c15184.f49574 = c14965Arr;
        C15184 c15185 = this.f63333;
        shortcutInfo.getUserHandle();
        c15185.getClass();
        C15184 c15186 = this.f63333;
        shortcutInfo.getLastChangedTimestamp();
        c15186.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            C15184 c15187 = this.f63333;
            shortcutInfo.isCached();
            c15187.getClass();
        }
        C15184 c15188 = this.f63333;
        shortcutInfo.isDynamic();
        c15188.getClass();
        C15184 c15189 = this.f63333;
        shortcutInfo.isPinned();
        c15189.getClass();
        C15184 c151810 = this.f63333;
        shortcutInfo.isDeclaredInManifest();
        c151810.getClass();
        C15184 c151811 = this.f63333;
        shortcutInfo.isImmutable();
        c151811.getClass();
        C15184 c151812 = this.f63333;
        shortcutInfo.isEnabled();
        c151812.getClass();
        C15184 c151813 = this.f63333;
        shortcutInfo.hasKeyFieldsOnly();
        c151813.getClass();
        C15184 c151814 = this.f63333;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                c8254 = C8254.m22225(shortcutInfo.getLocusId());
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                c8254 = new C8254(string);
            }
        }
        c151814.f49571 = c8254;
        this.f63333.f49575 = shortcutInfo.getRank();
        this.f63333.f49576 = shortcutInfo.getExtras();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45324(CharSequence charSequence) {
        this.f63333.f49567 = charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45323(Intent intent) {
        this.f63333.f49569 = new Intent[]{intent};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45325(C9545 c9545) {
        this.f63333.f49573 = c9545;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15184 m45322() {
        C15184 c15184 = this.f63333;
        if (TextUtils.isEmpty(c15184.f49567)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = c15184.f49569;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return c15184;
    }
}
