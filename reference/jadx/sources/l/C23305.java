package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩺᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23305 implements InterfaceC11974 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75557;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75558;

    public /* synthetic */ C23305(String str, String str2) {
        this.f75557 = str;
        this.f75558 = str2;
    }

    @Override // l.InterfaceC11974
    /* JADX INFO: renamed from: ۙ */
    public final C12731 mo15512(String str, String str2, String str3) {
        return C12731.m31631(str, str2, "fatal", null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, this.f75557, "policyRevision", this.f75558).add("operation", "check_parent_links").add("backendReason", str3).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }
}
