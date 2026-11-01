package l;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes2.dex */
public final class C2336 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C2336 f8268 = new C2336(AbstractC22433.of((Object) C11510.f38690));

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final AbstractC22433 f8269 = AbstractC22433.m49801();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6910 f8270;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f8271;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f8272;

    public /* synthetic */ C2336(int i, List list) {
        this(list);
    }

    static {
        C13261 c13261 = new C13261();
        c13261.mo32741(5, 6);
        c13261.mo32741(17, 6);
        c13261.mo32741(7, 6);
        c13261.mo32741(30, 10);
        c13261.mo32741(18, 6);
        c13261.mo32741(6, 8);
        c13261.mo32741(8, 8);
        c13261.mo32741(14, 8);
        f8270 = c13261.mo32742();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2336 m7089(Context context, C2708 c2708, C6570 c6570) {
        return m7088(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c2708, c6570);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2336 m7088(Context context, Intent intent, C2708 c2708, C6570 c6570) {
        AudioManager audioManagerM48542 = C21780.m48542(context);
        if (c6570 == null) {
            c6570 = Build.VERSION.SDK_INT >= 33 ? C13627.m33330(audioManagerM48542, c2708) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (C17983.m41852(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return C13627.m33329(audioManagerM48542, c2708);
        }
        if (i >= 23 && C3372.m10024(audioManagerM48542, c6570)) {
            return f8268;
        }
        C6204 c6204 = new C6204();
        c6204.mo13308((Object) 2);
        if (i >= 29 && (C17983.m41852(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            c6204.mo14318((Iterable) C4453.m12424(c2708));
            return new C2336(m7090(10, C17039.m39821(c6204.mo14317())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (z) {
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                c6204.mo14318((Iterable) f8269);
            }
        } else {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    c6204.mo14318((Iterable) f8269);
                }
            }
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                c6204.mo14318((Iterable) C17039.m39820(intArrayExtra));
            }
            return new C2336(m7090(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), C17039.m39821(c6204.mo14317())));
        }
        return new C2336(m7090(10, C17039.m39821(c6204.mo14317())));
    }

    public C2336(List list) {
        this.f8271 = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            C11510 c11510 = (C11510) list.get(i);
            this.f8271.put(c11510.f38693, c11510);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f8271.size(); i2++) {
            iMax = Math.max(iMax, ((C11510) this.f8271.valueAt(i2)).f38692);
        }
        this.f8272 = iMax;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pair m7091(C2708 c2708, C7648 c7648) {
        String str = c7648.f25265;
        str.getClass();
        int iM17983 = C6632.m17983(str, c7648.f25277);
        if (!f8270.containsKey(Integer.valueOf(iM17983))) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.f8271;
        if (iM17983 == 18 && !C17983.m41840(sparseArray, 18)) {
            iM17983 = 6;
        } else if ((iM17983 == 8 && !C17983.m41840(sparseArray, 8)) || (iM17983 == 30 && !C17983.m41840(sparseArray, 30))) {
            iM17983 = 7;
        }
        if (!C17983.m41840(sparseArray, iM17983)) {
            return null;
        }
        C11510 c11510 = (C11510) sparseArray.get(iM17983);
        c11510.getClass();
        int iM28692 = c7648.f25249;
        if (iM28692 == -1 || iM17983 == 18) {
            int i2 = c7648.f25260;
            if (i2 == -1) {
                i2 = 48000;
            }
            iM28692 = c11510.m28692(i2, c2708);
        } else if (!c7648.f25265.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c11510.m28693(iM28692)) {
                return null;
            }
        } else if (iM28692 > 10) {
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 28) {
            i = iM28692;
        } else if (iM28692 == 7) {
            i = 8;
        } else if (iM28692 != 3 && iM28692 != 4 && iM28692 != 5) {
            i = iM28692;
        }
        if (i3 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iM41854 = C17983.m41854(i);
        if (iM41854 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM17983), Integer.valueOf(iM41854));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2336)) {
            return false;
        }
        C2336 c2336 = (C2336) obj;
        return C17983.m41841(this.f8271, c2336.f8271) && this.f8272 == c2336.f8272;
    }

    public final int hashCode() {
        return (C17983.m41820(this.f8271) * 31) + this.f8272;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f8272 + ", audioProfiles=" + this.f8271 + "]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC22433 m7090(int i, int[] iArr) {
        int i2 = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            c4793.m52163(new C11510(i3, i));
        }
        return c4793.m13309();
    }
}
