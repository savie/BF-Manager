package l;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: l.᩷۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public class C20743 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f67490;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9101 f67491;

    public C20743(C9101 c9101) {
        this.f67491 = c9101;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46685(String str) {
        this.f67490 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46683() {
        this.f67491.m23449();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46684(int i, int i2, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(C16737.m39277(), (Class<?>) ViewOnClickListenerC8374.class);
        String str3 = this.f67490;
        intent.putExtra("type", i);
        intent.putExtra("title", i2);
        if (bundle != null) {
            intent.putExtra("extra", bundle);
        }
        if (str != null) {
            intent.putExtra("initPath", str);
        }
        if (str3 != null) {
            intent.putExtra("initPathKey", str3);
        }
        if (str2 != null) {
            intent.putExtra("initFilename", str2);
        }
        if (strArr != null && strArr.length != 0) {
            intent.putExtra("suffixes", strArr);
        }
        this.f67491.m23450(intent);
    }
}
