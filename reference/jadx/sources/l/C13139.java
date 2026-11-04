package l;

import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.۫۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C13139 implements InterfaceC20113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f42029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16383 f42030;

    public C13139(C23582 c23582, C16383 c16383) {
        this.f42029 = c23582;
        this.f42030 = c16383;
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32660(boolean z) {
        this.f42030.m38882(z ? R.string.MT_Protector : R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32658(int i) {
        this.f42030.m38883(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo32661() {
        this.f42029.f76550.m41603();
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32657() {
        this.f42029.f76554.m41603();
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32659(PatternSyntaxException patternSyntaxException) {
        C23582.m52781(this.f42029, patternSyntaxException);
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo32662(boolean z) {
        C23582 c23582 = this.f42029;
        c23582.f76550.m41606(z);
        c23582.f76554.m41600(z);
    }
}
