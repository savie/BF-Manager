package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ֫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C3843 extends AbstractC1890 implements InterfaceC10838 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public int f13099;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public int f13100;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f13101;

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1685(DataInputStream dataInputStream, EnumC13127 enumC13127, int i) throws IOException {
        int i2 = C23981.f77601[enumC13127.ordinal()];
        if (i2 == 1) {
            if (this.f6377 != null) {
                this.f6369.mo4165("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", EnumC13127.f41976.m32609(), EnumC5670.field_info.toString());
            }
            C20930 c20930 = new C20930((C0224) this.f6363);
            c20930.m47838(i, dataInputStream);
            this.f6377 = c20930;
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        if (i != 2) {
            if (this.f67152) {
                this.f6369.mo4160("{0}: Invalid attribute length #{1}", EnumC13127.f41953.m32609(), Integer.valueOf(i));
            } else {
                throw new C5474(this.f6369.m32312(), "{0}: Invalid attribute length #{1}", EnumC13127.f41953.m32609(), Integer.valueOf(i));
            }
        }
        EnumC13127 enumC13128 = EnumC13127.f41953;
        if (m6499(enumC13128).size() > 1) {
            this.f6369.mo4165("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", enumC13128.m32609(), EnumC5670.field_info.toString());
        }
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f13099 = unsignedShort;
        if (!this.f6371.m5638(unsignedShort)) {
            this.f6369.mo4165("The constantvalue_index \"{0}\" is not a valid index into the constant_pool table.", Integer.valueOf(this.f13099));
            return true;
        }
        C1606 c1606 = this.f6371;
        int i3 = this.f13099;
        EnumC5335[] enumC5335Arr = {EnumC5335.CONSTANT_INTEGER, EnumC5335.CONSTANT_FLOAT, EnumC5335.CONSTANT_DOUBLE, EnumC5335.CONSTANT_LONG, EnumC5335.CONSTANT_STRING};
        AbstractC15029 abstractC15029M5631 = c1606.m5631(i3);
        if (!(abstractC15029M5631 != null ? abstractC15029M5631.f49067.m15991(enumC5335Arr) : false)) {
            AbstractC15029 abstractC15029M5632 = this.f6371.m5631(this.f13099);
            EnumC5335 enumC5335 = abstractC15029M5632 != null ? abstractC15029M5632.f49067 : null;
            this.f6369.mo4165("The constant_pool entry \"{0}\" is not of an appropriate type for the field.", enumC5335 == null ? "unknown" : enumC5335.m15990());
        }
        return true;
    }

    @Override // l.AbstractC1890
    /* JADX INFO: renamed from: ۚ */
    public final void mo6503(int i) {
        if (!((C0224) this.f6363).f6371.m5638(i)) {
            this.f6369.mo4165("The value of the attribute_name_index #{0} item is not a valid index into the constant_pool table. The attribute is ignored.", Integer.valueOf(i));
        } else {
            this.f6369.mo4165("The attribute_name_index #{0} refers to an unknown attribute name. The attribute is ignored.", Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11099(int i, int i2) {
        String str;
        String strConcat;
        int i3;
        C20930 c20930 = this.f6377;
        boolean z = (c20930 == null || c20930.f67149 || !this.f67155) ? false : true;
        mo1684(this.f6375, this.f6364);
        mo1684(this.f6373, this.f6368);
        EnumC13127 enumC13127 = EnumC13127.f41969;
        if (m6499(enumC13127).size() > 0) {
            for (C22599 c22599 : m6499(enumC13127)) {
                m48013(String.format("// Ignored unrecognized attribute: { u2 #%d; u4 %d; u1[ %s ]; }", Integer.valueOf(c22599.m50932()), Integer.valueOf(c22599.m50929()), c22599.m50926()));
            }
        }
        boolean z2 = this.f67132;
        if (!z2 && (i3 = this.f13099) != -1) {
            C1606 c1606 = this.f6371;
            EnumC5335[] enumC5335Arr = {EnumC5335.CONSTANT_INTEGER, EnumC5335.CONSTANT_FLOAT, EnumC5335.CONSTANT_DOUBLE, EnumC5335.CONSTANT_LONG, EnumC5335.CONSTANT_STRING};
            AbstractC15029 abstractC15029M5631 = c1606.m5631(i3);
            if (!(abstractC15029M5631 != null ? abstractC15029M5631.f49067.m15991(enumC5335Arr) : false)) {
                AbstractC15029 abstractC15029M5632 = this.f6371.m5631(this.f13099);
                EnumC5335 enumC5335 = abstractC15029M5632 != null ? abstractC15029M5632.f49067 : null;
                m48013("// ".concat(this.f6369.m32311("Unrecognized constantvalue_index: #{0} [ {1} ]", Integer.valueOf(this.f13099), enumC5335 == null ? "unknown" : enumC5335.m15990())));
            }
        }
        StringBuilder sb = new StringBuilder(m47995());
        sb.append(EnumC16856.m39774(this.f6362, EnumC19840.FIELD));
        sb.append(m6505());
        sb.append(EnumC5202.f18306.m15637());
        sb.append(' ');
        int iMax = Math.max(sb.length() - (m48002() * 2), m48002() + EnumC10882.SIGNATURE.m27632().length());
        int i4 = this.f13099;
        if (i4 != -1) {
            if (!z2 && i4 != -1) {
                C1606 c1607 = this.f6371;
                EnumC5335[] enumC5335Arr2 = {EnumC5335.CONSTANT_INTEGER, EnumC5335.CONSTANT_FLOAT, EnumC5335.CONSTANT_DOUBLE, EnumC5335.CONSTANT_LONG, EnumC5335.CONSTANT_STRING};
                AbstractC15029 abstractC15029M5633 = c1607.m5631(i4);
                if (abstractC15029M5633 != null ? abstractC15029M5633.f49067.m15991(enumC5335Arr2) : false) {
                    strConcat = " = ".concat(((C0224) this.f6363).f6371.m5630(this.f13099));
                } else {
                    strConcat = "";
                }
            } else {
                strConcat = " = ".concat(((C0224) this.f6363).f6371.m5630(this.f13099));
            }
            str = strConcat;
        } else {
            str = null;
        }
        m6501(sb, str, z ? ":" : l.b, this.f13101, this.f13100, this.f13099);
        if (z) {
            C20930 c20931 = this.f6377;
            c20931.m47843(iMax);
            c20931.m48012(1);
            c20931.f67148 = mo12384() - (m48000() * 2);
            this.f6377.mo1688();
        }
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11100(int i, int i2) {
        mo11099(i, i2);
    }

    @Override // l.InterfaceC10838
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int mo12385() {
        String string;
        if (!this.f67132 || this.f67146) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(EnumC16856.m39774(this.f6362, EnumC19840.FIELD));
            sb.append(m6505());
            sb.append(EnumC5202.f18306.m15637());
            sb.append(" #");
            sb.append(this.f13101);
            sb.append(":#");
            sb.append(this.f13100);
            C20930 c20930 = this.f6377;
            if (c20930 != null && c20930.f67149) {
                sb.append(":#");
                sb.append(this.f6377.m47836());
            }
            if (this.f13099 != -1) {
                sb.append(" = #");
                sb.append(this.f13099);
            }
            sb.append(';');
            string = sb.toString();
        }
        return string.length();
    }

    @Override // l.InterfaceC10838
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo12383(int i) {
        this.f67136 = i;
    }

    @Override // l.AbstractC20997
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo12384() {
        return Math.max(this.f67148, m48002() + this.f67136);
    }
}
