package l;

import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.᩵ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20467 implements InterfaceC20113 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4059 f65570;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16383 f65571;

    public C20467(C4059 c4059, C16383 c16383) {
        this.f65570 = c4059;
        this.f65571 = c16383;
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ */
    public final void mo32660(boolean z) {
        this.f65571.m38882(R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ */
    public final void mo32658(int i) {
        this.f65571.m38883(C21576.m49059(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ᩷ */
    public final void mo32661() {
        this.f65570.f13825.m41603();
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ */
    public final void mo32657() {
        this.f65570.f13829.m41603();
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ۙ */
    public final void mo32659(PatternSyntaxException patternSyntaxException) {
        C4059.m13059(this.f65570, patternSyntaxException);
    }

    @Override // l.InterfaceC20113
    /* JADX INFO: renamed from: ᩷ */
    public final void mo32662(boolean z) {
        C4059 c4059 = this.f65570;
        c4059.f13825.m41606(z);
        c4059.f13829.m41600(z);
    }
}
