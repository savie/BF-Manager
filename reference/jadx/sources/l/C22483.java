package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes.dex */
public final class C22483 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f73401;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f73402;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1315 f73403;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73404 = false;

    public C22483(AbstractActivityC12483 abstractActivityC12483, C1315 c1315, EditText editText) {
        this.f73401 = abstractActivityC12483;
        this.f73403 = c1315;
        this.f73402 = editText;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f73401, R.string.MT_Protector);
        C17485 c17485 = this.f12806;
        C13638.requireNonNull(c17485);
        c17485.m40697(new RunnableC1774(3, c17485));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        try {
            C6254 c6254M17321 = C6254.m17321(-1, this.f73403);
            try {
                m49989(c6254M17321, EnumC14392.SMB2_ONLY);
            } catch (Exception e) {
                try {
                    m49989(c6254M17321, EnumC14392.SMB3_ONLY);
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        } catch (Exception e3) {
            try {
                m49988();
            } catch (Exception e4) {
                e3.addSuppressed(e4);
                throw e3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49989(C6254 c6254, EnumC14392 enumC14392) throws Exception {
        try {
            C4843.m13441(c6254, m49991(), enumC14392, new C1359(4, c6254));
        } catch (Exception e) {
            C1315 c1315 = this.f73403;
            if (!TextUtils.isEmpty(c1315.f5604) || !TextUtils.isEmpty(c1315.f5605) || !m49990(e, Collections.newSetFromMap(new IdentityHashMap()))) {
                throw e;
            }
            try {
                C4843.m13441(c6254, new C12185("Guest", new char[0], null), enumC14392, new C1359(4, c6254));
                this.f73404 = true;
            } catch (Exception e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private C12185 m49991() {
        C1315 c1315 = this.f73403;
        if (TextUtils.isEmpty(c1315.f5604) && TextUtils.isEmpty(c1315.f5605)) {
            return new C12185("", new char[0], null);
        }
        if (c1315.f5604.equals("guest") && TextUtils.isEmpty(c1315.f5605)) {
            return new C12185("Guest", new char[0], null);
        }
        return new C12185(c1315.f5604, c1315.f5605.toCharArray(), c1315.f5603);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49990(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C10360) {
            long jM26258 = ((C10360) th).m26258();
            if (jM26258 == EnumC3055.STATUS_LOGON_FAILURE.getValue() || jM26258 == EnumC3055.STATUS_ACCESS_DENIED.getValue() || jM26258 == EnumC3055.STATUS_ACCOUNT_DISABLED.getValue() || jM26258 == EnumC3055.STATUS_PASSWORD_EXPIRED.getValue()) {
                return true;
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m49990(th2, set)) {
                return true;
            }
        }
        return m49990(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m49988() throws C8484 {
        C1315 c1315 = this.f73403;
        try {
            InterfaceC19067 interfaceC19067M4695 = C1315.m4695(c1315.f5603, c1315.f5604, c1315.f5605);
            StringBuilder sb = new StringBuilder();
            String str = c1315.f5606;
            int i = c1315.f5602;
            StringBuilder sb2 = new StringBuilder("smb://");
            sb2.append(str);
            if (i != 445) {
                sb2.append(':');
                sb2.append(i);
            }
            sb.append(sb2.toString());
            sb.append("/");
            C17241 c17241 = ((C11782) interfaceC19067M4695).get(sb.toString());
            try {
                InterfaceC9190 interfaceC9190M40195 = c17241.m40195();
                try {
                    if (interfaceC9190M40195.hasNext()) {
                        ((InterfaceC11306) interfaceC9190M40195.next()).getName();
                    }
                    interfaceC9190M40195.close();
                    c17241.close();
                } catch (Throwable th) {
                    try {
                        interfaceC9190M40195.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c17241.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C20064 e) {
            if (TextUtils.isEmpty(c1315.f5604) && TextUtils.isEmpty(c1315.f5605)) {
                try {
                    InterfaceC19067 interfaceC19067M13096 = C5431.m15009().m13096();
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = c1315.f5606;
                    int i2 = c1315.f5602;
                    StringBuilder sb4 = new StringBuilder("smb://");
                    sb4.append(str2);
                    if (i2 != 445) {
                        sb4.append(':');
                        sb4.append(i2);
                    }
                    sb3.append(sb4.toString());
                    sb3.append("/");
                    C17241 c17242 = ((C11782) interfaceC19067M13096).get(sb3.toString());
                    try {
                        InterfaceC9190 interfaceC9190M40196 = c17242.m40195();
                        try {
                            if (interfaceC9190M40196.hasNext()) {
                                ((InterfaceC11306) interfaceC9190M40196.next()).getName();
                            }
                            interfaceC9190M40196.close();
                            c17242.close();
                            this.f73404 = true;
                            return;
                        } catch (Throwable th5) {
                            try {
                                interfaceC9190M40196.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            c17242.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Exception unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            return;
        }
        if (this.f73404) {
            this.f73402.setText("guest");
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f12806.m40693()) {
            return;
        }
        this.f73401.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        if (this.f12806.m40693()) {
            return;
        }
        m10251();
    }
}
