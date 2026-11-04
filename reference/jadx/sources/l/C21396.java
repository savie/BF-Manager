package l;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶ܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8MG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21396 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AudioAttributes f68157;

    public C21396(C18412 c18412) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C4242.m13546(usage);
        }
        if (i >= 32) {
            C14682.m35305(usage);
            C14682.m35304(usage);
        }
        this.f68157 = usage.build();
    }
}
