package l;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

/* JADX INFO: renamed from: l.֫᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2278 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7424 = 0;

    static {
        if (C16514.m39144()) {
            return;
        }
        UMConfigure.setEncryptEnabled(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7723() {
        if (C16514.m39144()) {
            return;
        }
        MobclickAgent.onProfileSignIn(C18978.m44077().toLowerCase());
    }
}
