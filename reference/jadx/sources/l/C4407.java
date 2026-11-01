package l;

import android.graphics.Bitmap;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle f15698 = new Bundle();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12336(String str, String str2) {
        C21445 c21445 = C13581.f44782;
        if (c21445.containsKey(str) && ((Integer) c21445.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(C16523.m38890("The ", str, " key cannot be used to put a String"));
        }
        this.f15698.putCharSequence(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12334(long j) {
        C21445 c21445 = C13581.f44782;
        if (c21445.containsKey("android.media.metadata.DURATION") && ((Integer) c21445.getOrDefault("android.media.metadata.DURATION", null)).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.f15698.putLong("android.media.metadata.DURATION", j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12335(String str, Bitmap bitmap) {
        C21445 c21445 = C13581.f44782;
        if (c21445.containsKey(str) && ((Integer) c21445.getOrDefault(str, null)).intValue() != 2) {
            throw new IllegalArgumentException(C16523.m38890("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f15698.putParcelable(str, bitmap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13581 m12333() {
        return new C13581(this.f15698);
    }
}
