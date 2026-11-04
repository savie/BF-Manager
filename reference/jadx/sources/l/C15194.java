package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes5.dex */
public final class C15194 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23255 f49605;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12957 f49606;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f49607;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f49608 = false;

    public C15194(AbstractActivityC17204 abstractActivityC17204, C12957 c12957, C23255 c23255) {
        this.f49607 = abstractActivityC17204;
        this.f49606 = c12957;
        this.f49605 = c23255;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f49607, R.string.MT_Protector);
        C13511 c13511 = this.f7780;
        C17359.requireNonNull(c13511);
        c13511.m33188(new RunnableC22836(5, c13511));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        try {
            C9973 c9973M25816 = C9973.m25816(-1, this.f49606);
            try {
                m36545(c9973M25816, EnumC2298.SMB2_ONLY);
            } catch (Exception e) {
                try {
                    m36545(c9973M25816, EnumC2298.SMB3_ONLY);
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        } catch (Exception e3) {
            try {
                m36544();
            } catch (Exception e4) {
                e3.addSuppressed(e4);
                throw e3;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m36545(C9973 c9973, EnumC2298 enumC2298) throws Exception {
        try {
            C4754.m14663(c9973, m36547(), enumC2298, new C6259(c9973));
        } catch (Exception e) {
            C12957 c12957 = this.f49606;
            if (!TextUtils.isEmpty(c12957.f41528) || !TextUtils.isEmpty(c12957.f41527) || !m36546(e, Collections.newSetFromMap(new IdentityHashMap()))) {
                throw e;
            }
            try {
                C4754.m14663(c9973, new C1642("Guest", new char[0], null), enumC2298, new C6259(c9973));
                this.f49608 = true;
            } catch (Exception e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C1642 m36547() {
        C12957 c12957 = this.f49606;
        if (TextUtils.isEmpty(c12957.f41528) && TextUtils.isEmpty(c12957.f41527)) {
            return new C1642("", new char[0], null);
        }
        if (c12957.f41528.equals("guest") && TextUtils.isEmpty(c12957.f41527)) {
            return new C1642("Guest", new char[0], null);
        }
        return new C1642(c12957.f41528, c12957.f41527.toCharArray(), c12957.f41526);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m36546(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C22172) {
            long jM50141 = ((C22172) th).m50141();
            if (jM50141 == EnumC20243.STATUS_LOGON_FAILURE.getValue() || jM50141 == EnumC20243.STATUS_ACCESS_DENIED.getValue() || jM50141 == EnumC20243.STATUS_ACCOUNT_DISABLED.getValue() || jM50141 == EnumC20243.STATUS_PASSWORD_EXPIRED.getValue()) {
                return true;
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m36546(th2, set)) {
                return true;
            }
        }
        return m36546(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36544() throws C20048 {
        C12957 c12957 = this.f49606;
        try {
            InterfaceC23032 interfaceC23032M32345 = C12957.m32345(c12957.f41526, c12957.f41528, c12957.f41527);
            StringBuilder sb = new StringBuilder();
            String str = c12957.f41529;
            int i = c12957.f41530;
            StringBuilder sb2 = new StringBuilder("smb://");
            sb2.append(str);
            if (i != 445) {
                sb2.append(':');
                sb2.append(i);
            }
            sb.append(sb2.toString());
            sb.append("/");
            C12523 c12523 = ((C8115) interfaceC23032M32345).get(sb.toString());
            try {
                InterfaceC13335 interfaceC13335M31090 = c12523.m31090();
                try {
                    if (interfaceC13335M31090.hasNext()) {
                        ((InterfaceC12589) interfaceC13335M31090.next()).getName();
                    }
                    interfaceC13335M31090.close();
                    c12523.close();
                } catch (Throwable th) {
                    try {
                        interfaceC13335M31090.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c12523.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C16252 e) {
            if (TextUtils.isEmpty(c12957.f41528) && TextUtils.isEmpty(c12957.f41527)) {
                try {
                    InterfaceC23032 interfaceC23032M43135 = C10351.m26627().m43135();
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = c12957.f41529;
                    int i2 = c12957.f41530;
                    StringBuilder sb4 = new StringBuilder("smb://");
                    sb4.append(str2);
                    if (i2 != 445) {
                        sb4.append(':');
                        sb4.append(i2);
                    }
                    sb3.append(sb4.toString());
                    sb3.append("/");
                    C12523 c12524 = ((C8115) interfaceC23032M43135).get(sb3.toString());
                    try {
                        InterfaceC13335 interfaceC13335M31091 = c12524.m31090();
                        try {
                            if (interfaceC13335M31091.hasNext()) {
                                ((InterfaceC12589) interfaceC13335M31091.next()).getName();
                            }
                            interfaceC13335M31091.close();
                            c12524.close();
                            this.f49608 = true;
                            return;
                        } catch (Throwable th5) {
                            try {
                                interfaceC13335M31091.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            c12524.close();
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

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            return;
        }
        if (this.f49608) {
            this.f49605.mo52335((CharSequence) "guest");
        }
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f7780.m33196()) {
            return;
        }
        this.f49607.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        if (this.f7780.m33196()) {
            return;
        }
        m8196();
    }
}
