package l;

import java.util.EmptyStackException;

/* JADX INFO: renamed from: l.֨᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U42S */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1415 extends AbstractC19055 implements InterfaceC10589 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC1623 f5842;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f5843;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 f5846;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5849;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f5850;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5851;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f5852;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C3697 f5853;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC9178 f5845 = C3034.f11346;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f5848 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5109 f5844 = new C5109();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f5847 = 0;

    public AbstractC1415(InterfaceC1623 interfaceC1623) {
        this.f5842 = interfaceC1623;
        this.f5853 = new C3697(this, interfaceC1623);
    }

    @Override // l.InterfaceC10589
    public InterfaceC19761 nextToken() {
        int iM41268;
        InterfaceC1623 interfaceC1623 = this.f5842;
        if (interfaceC1623 == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        int iMo11328 = interfaceC1623.mo11328();
        while (!this.f5852) {
            try {
                this.f5846 = null;
                this.f5843 = 0;
                this.f5848 = interfaceC1623.index();
                this.f5851 = ((C17727) this.f61618).m41276();
                this.f5849 = ((C17727) this.f61618).m41274();
                while (true) {
                    this.f5850 = 0;
                    try {
                        iM41268 = ((C17727) this.f61618).m41268(interfaceC1623, this.f5847);
                    } catch (C13411 e) {
                        m4950(e);
                        if (interfaceC1623.mo11332(1) != -1) {
                            ((C17727) this.f61618).m41272(interfaceC1623);
                        }
                        iM41268 = -3;
                    }
                    if (interfaceC1623.mo11332(1) == -1) {
                        this.f5852 = true;
                    }
                    if (this.f5850 == 0) {
                        this.f5850 = iM41268;
                    }
                    int i = this.f5850;
                    if (i == -3) {
                        break;
                    }
                    if (i != -2) {
                        if (this.f5846 == null) {
                            this.f5846 = this.f5845.mo9048(this.f5853, i, null, this.f5843, this.f5848, interfaceC1623.index() - 1, this.f5849, this.f5851);
                        }
                        InterfaceC19761 interfaceC19761 = this.f5846;
                        interfaceC1623.mo11331(iMo11328);
                        return interfaceC19761;
                    }
                }
            } catch (Throwable th) {
                interfaceC1623.mo11331(iMo11328);
                throw th;
            }
        }
        m4954();
        InterfaceC19761 interfaceC19762 = this.f5846;
        interfaceC1623.mo11331(iMo11328);
        return interfaceC19762;
    }

    @Override // l.InterfaceC10589
    public final int getLine() {
        return ((C17727) this.f61618).m41274();
    }

    @Override // l.InterfaceC10589
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo4948() {
        return ((C17727) this.f61618).m41276();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m4952() {
        return ((C17727) this.f61618).m41277(this.f5842);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m4953() {
        C5109 c5109 = this.f5844;
        if (!c5109.m14228()) {
            this.f5847 = c5109.m14226(c5109.m14225() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4949(InterfaceC9178 interfaceC9178) {
        this.f5845 = interfaceC9178;
    }

    @Override // l.InterfaceC10589
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9178 mo4951() {
        return this.f5845;
    }

    @Override // l.InterfaceC10589
    public final InterfaceC1623 getInputStream() {
        return this.f5842;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC19761 m4954() {
        int iMo4948 = mo4948();
        int line = getLine();
        InterfaceC9178 interfaceC9178 = this.f5845;
        InterfaceC1623 interfaceC1623 = this.f5842;
        InterfaceC19761 interfaceC19761Mo9048 = interfaceC9178.mo9048(this.f5853, -1, null, 0, interfaceC1623.index(), interfaceC1623.index() - 1, line, iMo4948);
        this.f5846 = interfaceC19761Mo9048;
        return interfaceC19761Mo9048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4950(C13411 c13411) {
        int i = this.f5848;
        InterfaceC1623 interfaceC1623 = this.f5842;
        String strMo5499 = interfaceC1623.mo5499(C22043.m48958(i, interfaceC1623.index()));
        StringBuilder sb = new StringBuilder("token recognition error at: '");
        StringBuilder sb2 = new StringBuilder();
        for (char c : strMo5499.toCharArray()) {
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
        m43801().mo11174(this, (Object) null, this.f5849, this.f5851, sb.toString(), c13411);
    }
}
