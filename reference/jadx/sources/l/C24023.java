package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24023 implements InterfaceC5055, InterfaceC14708 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77741;

    public /* synthetic */ C24023(Object obj, Object obj2) {
        this.f77740 = obj;
        this.f77741 = obj2;
    }

    public /* synthetic */ C24023(String str, String str2) {
        this.f77741 = str;
        this.f77740 = str2;
    }

    @Override // l.InterfaceC14708
    /* JADX INFO: renamed from: ۙ */
    public void mo35376(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC21422.m48725((ViewOnClickListenerC21422) this.f77740, (Set) this.f77741, str, str2, z, z2, z3);
    }

    @Override // l.InterfaceC5055
    /* JADX INFO: renamed from: ۙ */
    public C10186 mo15291(String str, String str2, String str3) {
        return C10186.m26306(str, str2, "fatal", null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, (String) this.f77741, "policyRevision", (String) this.f77740).add("operation", "check_parent_links").add("backendReason", str3).add("changed", false).add("stateKnown", true).add("warnings", JSON.array()));
    }
}
