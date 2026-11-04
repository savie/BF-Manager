package l;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ܶ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public class C15734 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f51172;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3347 f51173;

    public C15734(C3347 c3347) {
        this.f51173 = c3347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37644(String str) {
        this.f51172 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37642() {
        this.f51173.m10998();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37643(int i, int i2, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(C21576.m49084(), (Class<?>) ViewOnClickListenerC11499.class);
        String str3 = this.f51172;
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
        this.f51173.m10999(intent);
    }
}
