package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩹᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes.dex */
public final class C22588 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9183 f73612;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73613;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73614;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f73615;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13662 f73616;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f73617;

    public C22588(C9183 c9183, C11545 c11545, String str, boolean z, String str2) {
        this.f73612 = c9183;
        this.f73617 = c11545;
        this.f73614 = str;
        this.f73615 = z;
        this.f73613 = str2;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f73616 = this.f73617.m28834();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C22356, IOException {
        C9183 c9183 = this.f73612;
        AbstractC12233 abstractC12233Mo13029 = c9183.mo13029();
        String str = this.f73614;
        if (abstractC12233Mo13029.mo10261(str)) {
            throw new C22356(R.string.MT_Protector);
        }
        if (this.f73615) {
            c9183.mo13029().mo10268(str);
        } else {
            c9183.mo13029().mo10273(0L, str).close();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f73617.m28763(this.f73613);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f73617.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f73616.m33365();
        C21094.m47529(this.f73612.mo13029().mo10276());
    }
}
