package l;

import android.graphics.Bitmap;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4657 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle f16457 = new Bundle();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14514(String str, String str2) {
        C14307 c14307 = C21811.f69548;
        if (c14307.containsKey(str) && ((Integer) c14307.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(C14442.m34865("The ", str, " key cannot be used to put a String"));
        }
        this.f16457.putCharSequence(str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14512(long j) {
        C14307 c14307 = C21811.f69548;
        if (c14307.containsKey("android.media.metadata.DURATION") && ((Integer) c14307.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        this.f16457.putLong("android.media.metadata.DURATION", j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14513(String str, Bitmap bitmap) {
        C14307 c14307 = C21811.f69548;
        if (c14307.containsKey(str) && ((Integer) c14307.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(C14442.m34865("The ", str, " key cannot be used to put a Bitmap"));
        }
        this.f16457.putParcelable(str, bitmap);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21811 m14511() {
        return new C21811(this.f16457);
    }
}
