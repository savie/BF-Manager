package l;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: l.ۨᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8MG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11882 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioAttributes f39861;

    public C11882(C2708 c2708) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C4825.m13403(usage);
        }
        if (i >= 32) {
            C13999.m33840(usage);
            C13999.m33839(usage);
        }
        this.f39861 = usage.build();
    }
}
