package l;

import java.util.EmptyStackException;

/* JADX INFO: renamed from: l.ܰܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U42S */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14709 extends AbstractC9488 implements InterfaceC13963 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 f48056;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC17693 f48057;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f48058;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f48059;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48061;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48063;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48064;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18637 f48065;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC7252 f48062 = C23661.f76740;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48060 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24605 f48054 = new C24605();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f48055 = 0;

    public AbstractC14709(InterfaceC17693 interfaceC17693) {
        this.f48057 = interfaceC17693;
        this.f48065 = new C18637(this, interfaceC17693);
    }

    public InterfaceC8743 nextToken() {
        int iM4764;
        InterfaceC17693 interfaceC17693 = this.f48057;
        if (interfaceC17693 == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        int iMo11529 = interfaceC17693.mo11529();
        while (!this.f48058) {
            try {
                this.f48056 = null;
                this.f48063 = 0;
                this.f48060 = interfaceC17693.index();
                this.f48061 = ((C1308) this.f30727).m4773();
                this.f48059 = ((C1308) this.f30727).m4771();
                while (true) {
                    this.f48064 = 0;
                    try {
                        iM4764 = ((C1308) this.f30727).m4764(interfaceC17693, this.f48055);
                    } catch (C21423 e) {
                        m35378(e);
                        if (interfaceC17693.mo11537(1) != -1) {
                            ((C1308) this.f30727).m4769(interfaceC17693);
                        }
                        iM4764 = -3;
                    }
                    if (interfaceC17693.mo11537(1) == -1) {
                        this.f48058 = true;
                    }
                    if (this.f48064 == 0) {
                        this.f48064 = iM4764;
                    }
                    int i = this.f48064;
                    if (i == -3) {
                        break;
                    }
                    if (i != -2) {
                        if (this.f48056 == null) {
                            this.f48056 = this.f48062.mo19894(this.f48065, i, null, this.f48063, this.f48060, interfaceC17693.index() - 1, this.f48059, this.f48061);
                        }
                        InterfaceC8743 interfaceC8743 = this.f48056;
                        interfaceC17693.mo11533(iMo11529);
                        return interfaceC8743;
                    }
                }
            } catch (Throwable th) {
                interfaceC17693.mo11533(iMo11529);
                throw th;
            }
        }
        m35381();
        InterfaceC8743 interfaceC8744 = this.f48056;
        interfaceC17693.mo11533(iMo11529);
        return interfaceC8744;
    }

    @Override // l.InterfaceC13963
    public final int getLine() {
        return ((C1308) this.f30727).m4771();
    }

    @Override // l.InterfaceC13963
    /* JADX INFO: renamed from: ۙ */
    public final int mo34037() {
        return ((C1308) this.f30727).m4773();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m35379() {
        return ((C1308) this.f30727).m4774(this.f48057);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35380() {
        C24605 c24605 = this.f48054;
        if (!c24605.m54933()) {
            this.f48055 = c24605.m54931(c24605.m54930() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35377(InterfaceC7252 interfaceC7252) {
        this.f48062 = interfaceC7252;
    }

    @Override // l.InterfaceC13963
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC7252 mo34038() {
        return this.f48062;
    }

    @Override // l.InterfaceC13963
    public final InterfaceC17693 getInputStream() {
        return this.f48057;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC8743 m35381() {
        int iMo34037 = mo34037();
        int line = getLine();
        InterfaceC7252 interfaceC7252 = this.f48062;
        InterfaceC17693 interfaceC17693 = this.f48057;
        InterfaceC8743 interfaceC8743Mo19894 = interfaceC7252.mo19894(this.f48065, -1, null, 0, interfaceC17693.index(), interfaceC17693.index() - 1, line, iMo34037);
        this.f48056 = interfaceC8743Mo19894;
        return interfaceC8743Mo19894;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35378(C21423 c21423) {
        int i = this.f48060;
        InterfaceC17693 interfaceC17693 = this.f48057;
        String strMo19728 = interfaceC17693.mo19728(C4467.m14163(i, interfaceC17693.index()));
        StringBuilder sb = new StringBuilder("token recognition error at: '");
        StringBuilder sb2 = new StringBuilder();
        for (char c : strMo19728.toCharArray()) {
            String strValueOf = String.valueOf(c);
            if (c == -1) {
                strValueOf = "<EOF>";
            } else if (c == 13) {
                strValueOf = "\\r";
            } else if (c == 9) {
                strValueOf = "\\t";
            } else if (c == 10) {
                strValueOf = "\\n";
            }
            sb2.append(strValueOf);
        }
        sb.append(sb2.toString());
        sb.append("'");
        m24873().mo2202(this, (Object) null, this.f48059, this.f48061, sb.toString(), c21423);
    }
}
