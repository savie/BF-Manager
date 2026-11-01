package l;

import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۜۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6713 implements InterfaceC18087 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18002 f22623;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20205 f22624;

    public C6713(C18002 c18002, C20205 c20205) {
        this.f22623 = c18002;
        this.f22624 = c20205;
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18151(boolean z) {
        this.f22624.m45662(R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18149(int i) {
        this.f22624.m45663(C16737.m39264(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo18152() {
        this.f22623.f57568.m23519();
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18148() {
        this.f22623.f57577.m23519();
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18150(PatternSyntaxException patternSyntaxException) {
        C18002.m41920(this.f22623, patternSyntaxException);
    }

    @Override // l.InterfaceC18087
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo18153(boolean z) {
        C18002 c18002 = this.f22623;
        c18002.f57568.m23518(z);
        c18002.f57577.m23514(z);
    }
}
