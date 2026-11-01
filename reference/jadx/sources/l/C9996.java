package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9996 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19874 f34147;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34148;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f34149;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34150;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34151;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f34152;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34153;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f34154;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2916 f34155;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f34156;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f34157;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9268 f34158;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14690 f34159;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23379 f34160;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3800 f34161;

    public C9996(C19874 c19874, C9268 c9268, InterfaceC2916 interfaceC2916, int i, C14690 c14690, int i2, int[] iArr, String str, boolean z, int i3, boolean z2, InterfaceC3800 interfaceC3800, C6111 c6111, AbstractActivityC12483 abstractActivityC12483) {
        this.f34147 = c19874;
        this.f34158 = c9268;
        this.f34155 = interfaceC2916;
        this.f34150 = i;
        this.f34159 = c14690;
        this.f34153 = i2;
        this.f34152 = iArr;
        this.f34157 = str;
        this.f34156 = z;
        this.f34151 = i3;
        this.f34148 = z2;
        this.f34161 = interfaceC3800;
        this.f34149 = c6111;
        this.f34154 = abstractActivityC12483;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f34147.f63722 = true;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C9268 c9268 = this.f34158;
        c9268.m23807();
        RunnableC7856 runnableC7856 = new RunnableC7856(0, c9268);
        C3329 c3329Mo2398 = this.f34155.mo2398();
        try {
            c3329Mo2398.m9894(runnableC7856);
            c9268.m23807();
            if (c3329Mo2398.m9896() != this.f34150) {
                throw new CancellationException();
            }
            C6222 c6222Matcher = this.f34159.matcher((CharSequence) c3329Mo2398);
            c6222Matcher.m17274();
            c6222Matcher.m17263(runnableC7856);
            int i = this.f34153;
            int[] iArr = this.f34152;
            if (i == 1) {
                iArr[0] = c3329Mo2398.lastIndexOf('\n', 0, iArr[0]) + 1;
                int iIndexOf = c3329Mo2398.indexOf('\n', iArr[1], c3329Mo2398.length());
                iArr[1] = iIndexOf;
                if (iIndexOf == -1) {
                    iArr[1] = c3329Mo2398.length();
                }
            } else if (i == 2) {
                iArr[1] = iArr[0];
                iArr[0] = 0;
            } else if (i == 3) {
                iArr[0] = iArr[1];
                iArr[1] = c3329Mo2398.length();
            } else if (i != 0) {
                iArr[0] = 0;
                iArr[1] = c3329Mo2398.length();
            }
            c6222Matcher.m17275region(iArr[0], iArr[1]);
            String str = this.f34157;
            boolean z = this.f34156;
            int i2 = this.f34151;
            boolean z2 = this.f34148;
            final InterfaceC3800 interfaceC3800 = this.f34161;
            this.f34160 = C23379.m51502(c3329Mo2398, c6222Matcher, str, z, i2, z2, runnableC7856, new Supplier() { // from class: l.ۡۖۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new C12627(interfaceC3800, C13312.m32819(), 0);
                }
            });
            c9268.m23807();
            c3329Mo2398.close();
        } catch (Throwable th) {
            try {
                c3329Mo2398.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f34158.m23808()) {
            if (this.f34160.count() != 0) {
                this.f34160.m51514(this.f34149, this.f34155, this.f34148);
                C15829.m37613((CharSequence) C16737.m39264(R.string.MT_Protector, Integer.valueOf(this.f34160.count())));
            } else {
                C15829.m37611(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f34158.m23811() && !(exc instanceof CancellationException)) {
            this.f34154.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C19874 c19874 = this.f34147;
        C9268 c9268 = this.f34158;
        try {
            C23379 c23379 = this.f34160;
            if (c23379 != null) {
                c23379.close();
            }
        } finally {
            c9268.m23809();
            c19874.f63722 = false;
        }
    }
}
