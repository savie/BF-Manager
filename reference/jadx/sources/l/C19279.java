package l;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩵ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q20L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19279 implements InterfaceC7284 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f62236 = new LinkedHashSet();

    public C19279(C20690 c20690) {
        c20690.m46525("androidx.savedstate.Restarter", this);
    }

    @Override // l.InterfaceC7284
    /* JADX INFO: renamed from: ۙ */
    public final Bundle mo8703() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f62236));
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44250(String str) {
        this.f62236.add(str);
    }
}
