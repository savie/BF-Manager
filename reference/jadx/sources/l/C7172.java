package l;

import android.widget.AbsListView;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: renamed from: l.ۜ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 46YU */
/* JADX INFO: loaded from: classes3.dex */
public class C7172 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f23694;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbsListView m19745() {
        return (AbsListView) this.f23694;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m19743() {
        return ((AbsListView) this.f23694).getFirstVisiblePosition();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int m19747() {
        return ((AbsListView) this.f23694).getLastVisiblePosition();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo19744(int i) {
        ((WebSettingsBoundaryInterface) this.f23694).setForceDark(i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void mo19746() {
        ((WebSettingsBoundaryInterface) this.f23694).setForceDarkBehavior(1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo19748() {
        ((WebSettingsBoundaryInterface) this.f23694).setAlgorithmicDarkeningAllowed(false);
    }
}
