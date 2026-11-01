package l;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

/* JADX INFO: renamed from: l.۬ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13184 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43886 = 0;

    static {
        if (C15198.m36412()) {
            return;
        }
        UMConfigure.setEncryptEnabled(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32588() {
        if (C15198.m36412()) {
            return;
        }
        MobclickAgent.onProfileSignIn(C1709.m5696().toLowerCase());
    }
}
