package l;

import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ᩳ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes5.dex */
public final class C17733 implements InterfaceC18087 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20556 f56271;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20205 f56272;

    public C17733(C20556 c20556, C20205 c20205) {
        this.f56271 = c20556;
        this.f56272 = c20205;
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ */
    public final void mo18151(boolean z) {
        this.f56272.m45662(z ? R.string.MT_Protector : R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ */
    public final void mo18149(int i) {
        this.f56272.m45663(C16737.m39264(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ܰ */
    public final void mo18152() {
        this.f56271.f66563.m23519();
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ */
    public final void mo18148() {
        this.f56271.f66573.m23519();
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ */
    public final void mo18150(PatternSyntaxException patternSyntaxException) {
        C20556.m46342(this.f56271, patternSyntaxException);
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ܰ */
    public final void mo18153(boolean z) {
        C20556 c20556 = this.f56271;
        c20556.f66563.m23518(z);
        c20556.f66573.m23514(z);
    }
}
