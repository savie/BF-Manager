package l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9700 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3348 f32682;

    public C9700(Context context, String str) {
        C3348 c3348 = new C3348();
        this.f32682 = c3348;
        c3348.f12378 = context;
        c3348.f12372 = str;
    }

    public C9700(C3348 c3348) {
        C3348 c3349 = new C3348();
        this.f32682 = c3349;
        c3349.f12378 = c3348.f12378;
        c3349.f12372 = c3348.f12372;
        Intent[] intentArr = c3348.f12379;
        c3349.f12379 = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        c3349.f12375 = c3348.f12375;
        c3349.f12374 = c3348.f12374;
        c3349.f12384 = c3348.f12384;
        c3349.f12373 = c3348.f12373;
        c3349.f12383 = c3348.f12383;
        c3349.f12377 = c3348.f12377;
        c3349.f12382 = c3348.f12382;
        C9224[] c9224Arr = c3348.f12381;
        if (c9224Arr != null) {
            c3349.f12381 = (C9224[]) Arrays.copyOf(c9224Arr, c9224Arr.length);
        }
        if (c3348.f12380 != null) {
            c3349.f12380 = new HashSet(c3348.f12380);
        }
        PersistableBundle persistableBundle = c3348.f12376;
        if (persistableBundle != null) {
            c3349.f12376 = persistableBundle;
        }
    }

    public C9700(Context context, ShortcutInfo shortcutInfo) {
        C9224[] c9224Arr;
        String string;
        C3348 c3348 = new C3348();
        this.f32682 = c3348;
        c3348.f12378 = context;
        c3348.f12372 = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        c3348.f12379 = (Intent[]) Arrays.copyOf(intents, intents.length);
        c3348.f12375 = shortcutInfo.getActivity();
        c3348.f12374 = shortcutInfo.getShortLabel();
        c3348.f12384 = shortcutInfo.getLongLabel();
        c3348.f12373 = shortcutInfo.getDisabledMessage();
        if (Build.VERSION.SDK_INT >= 28) {
            shortcutInfo.getDisabledReason();
        } else {
            shortcutInfo.isEnabled();
        }
        c3348.f12380 = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        C16755 c16755 = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            c9224Arr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            c9224Arr = new C9224[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                c9224Arr[i2] = C9224.m23745(extras.getPersistableBundle(sb.toString()));
                i2 = i3;
            }
        }
        c3348.f12381 = c9224Arr;
        C3348 c3349 = this.f32682;
        shortcutInfo.getUserHandle();
        c3349.getClass();
        C3348 c33410 = this.f32682;
        shortcutInfo.getLastChangedTimestamp();
        c33410.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            C3348 c33411 = this.f32682;
            shortcutInfo.isCached();
            c33411.getClass();
        }
        C3348 c33412 = this.f32682;
        shortcutInfo.isDynamic();
        c33412.getClass();
        C3348 c33413 = this.f32682;
        shortcutInfo.isPinned();
        c33413.getClass();
        C3348 c33414 = this.f32682;
        shortcutInfo.isDeclaredInManifest();
        c33414.getClass();
        C3348 c33415 = this.f32682;
        shortcutInfo.isImmutable();
        c33415.getClass();
        C3348 c33416 = this.f32682;
        shortcutInfo.isEnabled();
        c33416.getClass();
        C3348 c33417 = this.f32682;
        shortcutInfo.hasKeyFieldsOnly();
        c33417.getClass();
        C3348 c33418 = this.f32682;
        if (i4 >= 29) {
            if (shortcutInfo.getLocusId() != null) {
                c16755 = C16755.m39318(shortcutInfo.getLocusId());
            }
        } else {
            PersistableBundle extras2 = shortcutInfo.getExtras();
            if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                c16755 = new C16755(string);
            }
        }
        c33418.f12377 = c16755;
        this.f32682.f12382 = shortcutInfo.getRank();
        this.f32682.f12376 = shortcutInfo.getExtras();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24664(CharSequence charSequence) {
        this.f32682.f12374 = charSequence;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24663(Intent intent) {
        this.f32682.f12379 = new Intent[]{intent};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24665(C16775 c16775) {
        this.f32682.f12383 = c16775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3348 m24662() {
        C3348 c3348 = this.f32682;
        if (TextUtils.isEmpty(c3348.f12374)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = c3348.f12379;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return c3348;
    }
}
