package l;

import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18001 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20824 f57561;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f57562;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f57563;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C9422 f57564;

    public C18001(C20824 c20824, String str, boolean z) {
        this.f57561 = c20824;
        this.f57562 = str;
        this.f57563 = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩸ۧ֨] */
    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ?? r0 = new Runnable() { // from class: l.᩸ۧ֨
            @Override // java.lang.Runnable
            public final void run() {
                this.f69942.m10251();
            }
        };
        C20824 c20824 = this.f57561;
        c20824.f67673 = r0;
        m10252(c20824.f67672, 200);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C9422 c9422M38425 = C16259.m38425(this.f57562);
        this.f57564 = c9422M38425;
        if ((c9422M38425.f31923 == EnumC13197.DIRECTORY) != this.f57563) {
            throw new IllegalArgumentException("Selected rule target type has changed");
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C20824 c20824 = this.f57561;
        if (c20824.m46829()) {
            C20824.m46838(c20824, this.f57564, true);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f57561.m46829()) {
            C15829.m37611(exc instanceof IOException ? R.string.MT_Protector : R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C20824 c20824 = this.f57561;
        c20824.f67678 = false;
        m10251();
        c20824.f67673 = null;
    }
}
