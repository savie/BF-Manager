package l;

import java.io.Serializable;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۢۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 44OF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9386 implements Serializable, InterfaceC19761 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31763;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f31764;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f31765;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3697 f31766;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31767;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31768;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f31769;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31770;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31771;

    public C9386(C3697 c3697, int i, int i2, int i3, int i4) {
        this.f31770 = -1;
        this.f31763 = -1;
        this.f31766 = c3697;
        this.f31771 = i;
        this.f31767 = i2;
        this.f31769 = i3;
        this.f31764 = i4;
        Object obj = c3697.f13496;
        if (obj != null) {
            this.f31768 = ((InterfaceC10589) obj).getLine();
            this.f31770 = ((InterfaceC10589) c3697.f13496).mo4948();
        }
    }

    public C9386(InterfaceC19761 interfaceC19761) {
        this.f31770 = -1;
        this.f31767 = 0;
        this.f31763 = -1;
        this.f31771 = interfaceC19761.getType();
        this.f31768 = interfaceC19761.getLine();
        this.f31763 = interfaceC19761.mo22511();
        this.f31770 = interfaceC19761.mo22509();
        this.f31767 = interfaceC19761.mo22512();
        this.f31769 = interfaceC19761.mo22508();
        this.f31764 = interfaceC19761.mo22510();
        if (interfaceC19761 instanceof C9386) {
            C9386 c9386 = (C9386) interfaceC19761;
            this.f31765 = c9386.f31765;
            this.f31766 = c9386.f31766;
        } else {
            this.f31765 = interfaceC19761.getText();
            this.f31766 = new C3697(interfaceC19761.mo22513(), interfaceC19761.getInputStream());
        }
    }

    @Override // l.InterfaceC19761
    public final int getType() {
        return this.f31771;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m24077(int i) {
        this.f31768 = i;
    }

    @Override // l.InterfaceC19761
    public final String getText() {
        int i;
        String str = this.f31765;
        if (str != null) {
            return str;
        }
        InterfaceC1623 inputStream = getInputStream();
        if (inputStream == null) {
            return null;
        }
        int size = inputStream.size();
        int i2 = this.f31769;
        return (i2 >= size || (i = this.f31764) >= size) ? "<EOF>" : inputStream.mo5499(C22043.m48958(i2, i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24075(String str) {
        this.f31765 = str;
    }

    @Override // l.InterfaceC19761
    public final int getLine() {
        return this.f31768;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۙ */
    public final int mo22509() {
        return this.f31770;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24078(int i) {
        this.f31770 = i;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ܰ */
    public final int mo22512() {
        return this.f31767;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24074(int i) {
        this.f31767 = i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m24072(int i) {
        this.f31771 = i;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۖ */
    public final int mo22508() {
        return this.f31769;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24073(int i) {
        this.f31769 = i;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۚ */
    public final int mo22510() {
        return this.f31764;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24076(int i) {
        this.f31764 = i;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ۨ */
    public final int mo22511() {
        return this.f31763;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24079(int i) {
        this.f31763 = i;
    }

    @Override // l.InterfaceC19761
    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC10589 mo22513() {
        return (InterfaceC10589) this.f31766.f13496;
    }

    @Override // l.InterfaceC19761
    public final InterfaceC1623 getInputStream() {
        return (InterfaceC1623) this.f31766.f13497;
    }

    public final String toString() {
        String str;
        if (this.f31767 > 0) {
            str = ",channel=" + this.f31767;
        } else {
            str = "";
        }
        String text = getText();
        String strReplace = text != null ? text.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") : "<no text>";
        String strValueOf = String.valueOf(this.f31771);
        StringBuilder sb = new StringBuilder("[@");
        sb.append(this.f31763);
        sb.append(",");
        sb.append(this.f31769);
        sb.append(":");
        sb.append(this.f31764);
        sb.append("='");
        sb.append(strReplace);
        sb.append("',<");
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strValueOf, ">", str, ",");
        sb.append(this.f31768);
        sb.append(":");
        return C12441.m30911(this.f31770, "]", sb);
    }
}
