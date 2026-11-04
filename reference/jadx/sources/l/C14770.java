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

/* JADX INFO: renamed from: l.ܰᩳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14770 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AbstractC17589 f48337;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f48340;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f48341;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C14770 f48339 = new C14770(AbstractC1928.of((Object) C4330.f15682));

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"InlinedApi"})
    public static final AbstractC1928 f48338 = AbstractC1928.m6617();

    public /* synthetic */ C14770(int i, List list) {
        this(list);
    }

    static {
        C25049 c25049 = new C25049();
        c25049.mo14569(5, 6);
        c25049.mo14569(17, 6);
        c25049.mo14569(7, 6);
        c25049.mo14569(30, 10);
        c25049.mo14569(18, 6);
        c25049.mo14569(6, 8);
        c25049.mo14569(8, 8);
        c25049.mo14569(14, 8);
        f48337 = c25049.mo14570();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14770 m35557(Context context, C18412 c18412, C10295 c10295) {
        return m35556(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c18412, c10295);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14770 m35556(Context context, Intent intent, C18412 c18412, C10295 c10295) {
        AudioManager audioManagerM22450 = C8345.m22450(context);
        if (c10295 == null) {
            c10295 = Build.VERSION.SDK_INT >= 33 ? C24468.m54719(audioManagerM22450, c18412) : null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (C7116.m19498(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return C24468.m54718(audioManagerM22450, c18412);
        }
        if (i >= 23 && C12533.m31139(audioManagerM22450, c10295)) {
            return f48339;
        }
        C9384 c9384 = new C9384();
        c9384.mo24710((Object) 2);
        if (i >= 29 && (C7116.m19498(context) || (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            c9384.mo19803((Iterable) C6568.m18487(c18412));
            return new C14770(m35555(10, C18444.m42973(c9384.mo24709())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (z) {
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                c9384.mo19803((Iterable) f48338);
            }
        } else {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    c9384.mo19803((Iterable) f48338);
                }
            }
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                c9384.mo19803((Iterable) C18444.m42972(intArrayExtra));
            }
            return new C14770(m35555(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), C18444.m42973(c9384.mo24709())));
        }
        return new C14770(m35555(10, C18444.m42973(c9384.mo24709())));
    }

    public C14770(List list) {
        this.f48340 = new SparseArray();
        for (int i = 0; i < list.size(); i++) {
            C4330 c4330 = (C4330) list.get(i);
            this.f48340.put(c4330.f15685, c4330);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.f48340.size(); i2++) {
            iMax = Math.max(iMax, ((C4330) this.f48340.valueAt(i2)).f15684);
        }
        this.f48341 = iMax;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Pair m35558(C18412 c18412, C15648 c15648) {
        String str = c15648.f50848;
        str.getClass();
        int iM25255 = C9681.m25255(str, c15648.f50836);
        if (!f48337.containsKey(Integer.valueOf(iM25255))) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.f48340;
        if (iM25255 == 18 && !C7116.m19487(sparseArray, 18)) {
            iM25255 = 6;
        } else if ((iM25255 == 8 && !C7116.m19487(sparseArray, 8)) || (iM25255 == 30 && !C7116.m19487(sparseArray, 30))) {
            iM25255 = 7;
        }
        if (!C7116.m19487(sparseArray, iM25255)) {
            return null;
        }
        C4330 c4330 = (C4330) sparseArray.get(iM25255);
        c4330.getClass();
        int iM13824 = c15648.f50843;
        if (iM13824 == -1 || iM25255 == 18) {
            int i2 = c15648.f50829;
            if (i2 == -1) {
                i2 = 48000;
            }
            iM13824 = c4330.m13824(i2, c18412);
        } else if (!c15648.f50848.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!c4330.m13825(iM13824)) {
                return null;
            }
        } else if (iM13824 > 10) {
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 28) {
            i = iM13824;
        } else if (iM13824 == 7) {
            i = 8;
        } else if (iM13824 != 3 && iM13824 != 4 && iM13824 != 5) {
            i = iM13824;
        }
        if (i3 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iM19504 = C7116.m19504(i);
        if (iM19504 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM25255), Integer.valueOf(iM19504));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14770)) {
            return false;
        }
        C14770 c14770 = (C14770) obj;
        return C7116.m19488(this.f48340, c14770.f48340) && this.f48341 == c14770.f48341;
    }

    public final int hashCode() {
        return (C7116.m19467(this.f48340) * 31) + this.f48341;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f48341 + ", audioProfiles=" + this.f48340 + "]";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1928 m35555(int i, int[] iArr) {
        int i2 = AbstractC1928.f6477;
        C22811 c22811 = new C22811();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            c22811.m19807(new C4330(i3, i));
        }
        return c22811.m51441();
    }
}
