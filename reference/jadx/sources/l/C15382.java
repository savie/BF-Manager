package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܳܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: CITH */
/* JADX INFO: loaded from: classes5.dex */
public class C15382 implements InterfaceC3145 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f50159 = C16980.m40037(C15382.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public StringBuilder f50160;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f50161;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f50162;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50163;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f50164;

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public void mo10274(InterfaceC11653 interfaceC11653) {
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public void mo10275(InterfaceC16874 interfaceC16874) {
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public void mo10276(C17620 c17620) {
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo10281() {
        return this instanceof C10907;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ᩷ */
    public void mo10284(int i) {
    }

    public C15382(C6129 c6129) {
        this.f50160 = new StringBuilder();
        this.f50161 = "";
        this.f50163 = 0;
        c6129.getClass();
        this.f50162 = c6129.m17720();
        this.f50164 = c6129.m17704();
    }

    @Deprecated
    public C15382() {
        this.f50160 = new StringBuilder();
        this.f50161 = "";
        this.f50163 = 0;
        this.f50162 = ASN1Dump.TAB;
        this.f50164 = C6129.f20903;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۤ */
    public final C15382 mo10277(int i) {
        if (i == 0) {
            mo27682();
            mo27680();
            return this;
        }
        mo27682();
        mo27680();
        mo10284(i);
        return this;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ܳ */
    public final C15382 mo10280() {
        mo27682();
        mo27680();
        mo10270('}');
        return this;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ᩷ */
    public final C15382 mo10282() {
        mo27682();
        mo27680();
        return this;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ᩷ */
    public final C15382 mo10283(String str) {
        mo27682();
        mo27680();
        add(str);
        return this;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public C15382 mo10271(String str) {
        String str2 = this.f50164;
        if (str.contains(str2)) {
            this.f50160.append(str.replace(str2, str2 + this.f50161));
            return this;
        }
        this.f50160.append(str);
        return this;
    }

    @Override // l.InterfaceC3145
    public C15382 add(String str) {
        this.f50160.append(str);
        return this;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public C15382 mo10270(char c) {
        this.f50160.append(c);
        return this;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC3145 mo10272(C10907 c10907) {
        this.f50160.append(c10907.f50160.toString());
        return this;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ᩸ */
    public final C15382 mo10285() {
        mo27682();
        return this;
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo27682() {
        this.f50160.append(this.f50164);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo27680() {
        this.f50160.append(this.f50161);
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۤ */
    public final void mo10278() {
        int i = this.f50163 + 1;
        this.f50163 = i;
        this.f50161 = C4123.m13220(i, this.f50162);
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۫ */
    public final void mo10279() {
        int i = this.f50163 - 1;
        this.f50163 = i;
        if (i < 0) {
            f50159.mo13729("Indent < 0");
            this.f50163 = 0;
        }
        this.f50161 = C4123.m13220(this.f50163, this.f50162);
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final int mo10269() {
        return this.f50163;
    }

    @Override // l.InterfaceC3145
    /* JADX INFO: renamed from: ۙ */
    public final void mo10273(int i) {
        this.f50163 = i;
        this.f50161 = C4123.m13220(i, this.f50162);
    }

    @Override // l.InterfaceC3145
    public final int getLength() {
        return this.f50160.length();
    }

    public final String toString() {
        return this.f50160.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m36846() {
        return this.f50160.toString();
    }
}
