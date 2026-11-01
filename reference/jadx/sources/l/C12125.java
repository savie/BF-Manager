package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۫ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes4.dex */
public class C12125 implements InterfaceC12913, Serializable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f40590;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f40591;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f40592;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f40593;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40594;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC16358 f40595;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f40596;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40597;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f40598;

    public C12125(int i, String str) {
        this.f40597 = -1;
        this.f40590 = -1;
        this.f40598 = i;
        this.f40594 = 0;
        this.f40592 = str;
    }

    public C12125(InterfaceC12913 interfaceC12913) {
        this.f40597 = -1;
        this.f40594 = 0;
        this.f40590 = -1;
        this.f40592 = interfaceC12913.getText();
        this.f40598 = interfaceC12913.getType();
        this.f40593 = interfaceC12913.getLine();
        this.f40590 = interfaceC12913.mo30180();
        this.f40597 = interfaceC12913.mo30176();
        this.f40594 = interfaceC12913.mo30182();
        this.f40595 = interfaceC12913.getInputStream();
        if (interfaceC12913 instanceof C12125) {
            C12125 c12125 = (C12125) interfaceC12913;
            this.f40596 = c12125.f40596;
            this.f40591 = c12125.f40591;
        }
    }

    @Override // l.InterfaceC12913
    public final int getType() {
        return this.f40598;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30183(int i) {
        this.f40593 = i;
    }

    @Override // l.InterfaceC12913
    public final String getText() {
        String str = this.f40592;
        if (str != null) {
            return str;
        }
        InterfaceC16358 interfaceC16358 = this.f40595;
        if (interfaceC16358 == null) {
            return null;
        }
        int size = interfaceC16358.size();
        return (this.f40596 >= size || this.f40591 >= size) ? "<EOF>" : this.f40595.m38528();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30178(String str) {
        this.f40592 = str;
    }

    @Override // l.InterfaceC12913
    public final int getLine() {
        return this.f40593;
    }

    @Override // l.InterfaceC12913
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo30176() {
        return this.f40597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30177(int i) {
        this.f40597 = i;
    }

    @Override // l.InterfaceC12913
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int mo30182() {
        return this.f40594;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30174() {
        this.f40594 = 99;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m30179(int i) {
        this.f40598 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30181(int i) {
        this.f40596 = i;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30175(int i) {
        this.f40591 = i;
    }

    @Override // l.InterfaceC12913
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo30180() {
        return this.f40590;
    }

    @Override // l.InterfaceC12913
    public final InterfaceC16358 getInputStream() {
        return this.f40595;
    }

    public final String toString() {
        String str;
        if (this.f40594 > 0) {
            str = ",channel=" + this.f40594;
        } else {
            str = "";
        }
        String text = getText();
        String strReplaceAll = text != null ? text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t") : "<no text>";
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f40590);
        sb.append(",");
        sb.append(this.f40596);
        sb.append(":");
        sb.append(this.f40591);
        sb.append("='");
        sb.append(strReplaceAll);
        sb.append("',<");
        sb.append(this.f40598);
        sb.append(">");
        sb.append(str);
        sb.append(",");
        sb.append(this.f40593);
        sb.append(":");
        return C12441.m30911(this.f40597, "]", sb);
    }
}
