package l;

import android.accessibilityservice.AccessibilityService;
import android.os.Bundle;
import android.os.Process;
import com.rosan.dhizuku.shared.DhizukuVariables;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VITQ */
/* JADX INFO: loaded from: classes.dex */
public final class C8022 extends AbstractC5961 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AccessibilityService f26633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6338 f26635;

    static {
        ApplicationC23172.m52091(81);
    }

    @Override // l.AbstractC5961
    /* JADX INFO: renamed from: ۙ */
    public native String mo17343(Bundle bundle);

    public C8022(C6338 c6338) {
        EnumC13418 enumC13418 = EnumC13418.ACCESSIBILITY;
        this.f26635 = c6338;
    }

    @Override // l.AbstractC5961
    /* JADX INFO: renamed from: ᩷ */
    public final void mo17347(Bundle bundle) throws IOException {
        AccessibilityService accessibilityServiceM48670 = C21403.m48670((C21403) this.f26635.f21461);
        this.f26633 = accessibilityServiceM48670;
        if (accessibilityServiceM48670 == null) {
            throw new IOException("Accessibility service is not connected");
        }
        this.f26634 = 0;
        bundle.putInt(DhizukuVariables.PARAM_CLIENT_UID, Process.myUid());
    }

    @Override // l.AbstractC5961
    /* JADX INFO: renamed from: ۤ */
    public final void mo17345() {
        this.f26633 = null;
    }
}
