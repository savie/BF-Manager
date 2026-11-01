package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.File;

/* JADX INFO: renamed from: l.᩺ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23090 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f75031;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f75032;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21678 f75033;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f75034;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f75035;

    public C23090(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, C21678 c21678, Runnable runnable) {
        this.f75031 = abstractActivityC12483;
        this.f75032 = abstractC20745;
        this.f75033 = c21678;
        this.f75034 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C1777 c1777 = new C1777(this.f75031);
        c1777.m5837(R.string.MT_Protector);
        c1777.m5830(R.string.MT_Protector);
        c1777.mo5843();
        this.f75035 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("term/bin");
        abstractC20745M46690.mo24647();
        abstractC20745M46690.m46739();
        C2455 c2455 = new C2455(this.f75032);
        try {
            String strM42281 = C18150.m42281(c2455);
            C8516 c8516 = new C8516(c2455.m7485());
            C1777 c1777 = this.f75035;
            C13638.requireNonNull(c1777);
            c8516.m22241(new C1438(c1777));
            for (C12107 c12107 : c2455.m7466()) {
                c8516.m22242(1);
                if (!c12107.isDirectory()) {
                    String name = c12107.getName();
                    if (name.startsWith(strM42281)) {
                        String strSubstring = name.substring(strM42281.length());
                        if (strSubstring.contains("/")) {
                            continue;
                        } else {
                            System.out.println("Extract: bin/" + strSubstring);
                            AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690(strSubstring);
                            abstractC20745M46691.m46694(c2455.m7471(c12107));
                            if (!new File(abstractC20745M46691.mo24643()).setExecutable(true, false)) {
                                throw new Exception("Set Executable Failed: " + abstractC20745M46691.mo24643());
                            }
                        }
                    }
                }
            }
            C18150.m42276(c2455, null);
            c2455.close();
            AbstractC20745 abstractC20745M46692 = C11904.f39938.m46690("term/version");
            C11018 c11018 = new C11018();
            C21678 c21678 = this.f75033;
            c11018.writeInt(c21678.f70309);
            c11018.m27786(c21678.f70311);
            abstractC20745M46692.mo24647();
            abstractC20745M46692.m46697(c11018);
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ServiceC2046.m6541();
        C4744.m13120();
        this.f75034.run();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f75031.m31002(exc, (DialogInterface.OnDismissListener) null);
        this.f75034.run();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f75035.m5825();
    }
}
