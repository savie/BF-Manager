package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15865 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f51331;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C1752 f51332;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f51333;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f51334 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f51335;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f51336;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f51337;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20164 f51338;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20098 f51339;

    public C15865(C20098 c20098, C11545 c11545, List list, Runnable runnable) {
        this.f51339 = c20098;
        this.f51336 = c11545;
        this.f51337 = list;
        this.f51335 = runnable;
        this.f51331 = c20098.f38587.m46690(C16845.m39503(c20098.m28629()));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        C20098 c20098 = this.f51339;
        C1752 c1752 = c20098.f65280.m22936() ? new C1752() : null;
        this.f51332 = c1752;
        RunnableC7397 runnableC7397 = c1752 != null ? new RunnableC7397(c1752) : null;
        C20164 c20164 = new C20164(this.f51336.m28824());
        c20164.m45586(c20098.f65280.m22936() ? R.string.MT_Protector : R.string.MT_Protector);
        c20164.m45588("...");
        c20164.m45589((Runnable) runnableC7397);
        c20164.m45600();
        this.f51338 = c20164;
        if (this.f51337.size() == 1) {
            this.f51338.m45598();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        InterfaceC19392 interfaceC19392M22929;
        List<C10840> list = this.f51337;
        AbstractC20745 abstractC20745 = this.f51331;
        if (abstractC20745.mo33971()) {
            abstractC20745.mo24647();
        }
        abstractC20745.m46739();
        C1752 c1752 = this.f51332;
        C20098 c20098 = this.f51339;
        if (c1752 == null) {
            interfaceC19392M22929 = c20098.f65280.m22929((C1752) null);
        } else {
            interfaceC19392M22929 = c20098.f65280.m22929(this.f51332);
        }
        try {
            int i = c20098.f65280.m22936() ? R.string.MT_Protector : R.string.MT_Protector;
            int i2 = 0;
            for (C10840 c10840 : list) {
                if (!this.f51338.m5824()) {
                    this.f51338.m45586(i);
                    this.f51338.m45591(0);
                    i2++;
                    this.f51338.m45593(i2, list.size());
                    this.f51338.m45588(c10840.m27170());
                    String strM27170 = c10840.m27170();
                    String strM27174 = c10840.m27174();
                    boolean zM27176 = c10840.m27176();
                    C9474 entry = interfaceC19392M22929.getEntry(strM27174.substring(1) + strM27170);
                    if (entry == null) {
                        entry = zM27176 ? interfaceC19392M22929.getEntry(strM27170) : null;
                    }
                    if (entry == null) {
                        c10840.m27172();
                    } else {
                        AbstractC20745 abstractC20745M46690 = abstractC20745.m46690(c10840.m27169());
                        C1388 c1388M46710 = abstractC20745M46690.m46710("rw");
                        try {
                            interfaceC19392M22929.mo34860(entry, c1388M46710, new C20803(this, entry));
                            c1388M46710.close();
                            if (this.f51338.m5824()) {
                                abstractC20745M46690.mo24644();
                            } else {
                                c10840.m27173(abstractC20745M46690);
                                this.f51334.add(new C23540(abstractC20745M46690, c10840.m27170(), entry.m24284()));
                            }
                        } catch (Throwable th) {
                            try {
                                c1388M46710.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } else {
                    interfaceC19392M22929.close();
                    return;
                }
            }
            interfaceC19392M22929.close();
        } catch (Throwable th3) {
            try {
                interfaceC19392M22929.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f51338.m5824()) {
            this.f51331.mo24647();
        } else {
            this.f51333 = true;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f51331.mo24647();
        if (this.f51338.m5824()) {
            return;
        }
        this.f51336.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f51338.m5825();
        C21094.m47530();
        if (this.f51333) {
            this.f51339.m28621(this.f51334);
            try {
                this.f51335.run();
            } catch (Throwable th) {
                this.f51336.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
