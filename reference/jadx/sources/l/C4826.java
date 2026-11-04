package l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6DO */
/* JADX INFO: loaded from: classes3.dex */
public final class C4826 implements InterfaceC19742 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f16880 = new LinkedHashSet();

    @Override // l.InterfaceC19742
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle mo14860() {
        Bundle bundleM6304 = C1826.m6304((C21914[]) Arrays.copyOf(new C21914[0], 0));
        List listM21091 = C7743.m21091(this.f16880);
        bundleM6304.putStringArrayList("classes_to_restore", listM21091 instanceof ArrayList ? (ArrayList) listM21091 : new ArrayList<>(listM21091));
        return bundleM6304;
    }

    public C4826(C15266 c15266) {
        c15266.m36621("androidx.savedstate.Restarter", this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14861(String str) {
        this.f16880.add(str);
    }
}
