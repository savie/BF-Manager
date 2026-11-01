package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13092 extends AbstractC14504 implements InterfaceC12387 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f43598;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f43599;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f43600;

    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11477(DataInputStream dataInputStream, EnumC16783 enumC16783, int i) throws IOException {
        int i2 = C1096.f4993[enumC16783.ordinal()];
        if (i2 == 1) {
            if (this.f47505 != null) {
                this.f47519.mo2157("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", EnumC16783.f53727.m39430(), EnumC12550.field_info.toString());
            }
            C12906 c12906 = new C12906((C3980) this.f47511);
            c12906.m31978(i, dataInputStream);
            this.f47505 = c12906;
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        if (i != 2) {
            if (this.f22711) {
                this.f47519.mo2150("{0}: Invalid attribute length #{1}", EnumC16783.f53753.m39430(), Integer.valueOf(i));
            } else {
                throw new C16639(this.f47519.m2163(), "{0}: Invalid attribute length #{1}", EnumC16783.f53753.m39430(), Integer.valueOf(i));
            }
        }
        EnumC16783 enumC16784 = EnumC16783.f53753;
        if (m34916(enumC16784).size() > 1) {
            this.f47519.mo2157("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", enumC16784.m39430(), EnumC12550.field_info.toString());
        }
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f43599 = unsignedShort;
        if (!this.f47512.m27814(unsignedShort)) {
            this.f47519.mo2157("The constantvalue_index \"{0}\" is not a valid index into the constant_pool table.", Integer.valueOf(this.f43599));
            return true;
        }
        C11038 c11038 = this.f47512;
        int i3 = this.f43599;
        EnumC6098[] enumC6098Arr = {EnumC6098.CONSTANT_INTEGER, EnumC6098.CONSTANT_FLOAT, EnumC6098.CONSTANT_DOUBLE, EnumC6098.CONSTANT_LONG, EnumC6098.CONSTANT_STRING};
        AbstractC12449 abstractC12449M27823 = c11038.m27823(i3);
        if (!(abstractC12449M27823 != null ? abstractC12449M27823.f41512.m16594(enumC6098Arr) : false)) {
            AbstractC12449 abstractC12449M27824 = this.f47512.m27823(this.f43599);
            EnumC6098 enumC6098 = abstractC12449M27824 != null ? abstractC12449M27824.f41512 : null;
            this.f47519.mo2157("The constant_pool entry \"{0}\" is not of an appropriate type for the field.", enumC6098 == null ? "unknown" : enumC6098.m16593());
        }
        return true;
    }

    @Override // l.AbstractC14504
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo32311(int i) {
        if (!((C3980) this.f47511).f47512.m27814(i)) {
            this.f47519.mo2157("The value of the attribute_name_index #{0} item is not a valid index into the constant_pool table. The attribute is ignored.", Integer.valueOf(i));
        } else {
            this.f47519.mo2157("The attribute_name_index #{0} refers to an unknown attribute name. The attribute is ignored.", Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ܰ */
    public final void mo14102(int i, int i2) {
        String str;
        String strConcat;
        int i3;
        C12906 c12906 = this.f47505;
        boolean z = (c12906 == null || c12906.f22707 || !this.f22709) ? false : true;
        mo11476(this.f47508, this.f47515);
        mo11476(this.f47518, this.f47504);
        EnumC16783 enumC16783 = EnumC16783.f53744;
        if (m34916(enumC16783).size() > 0) {
            for (C15708 c15708 : m34916(enumC16783)) {
                m18209(String.format("// Ignored unrecognized attribute: { u2 #%d; u4 %d; u1[ %s ]; }", Integer.valueOf(c15708.m37407()), Integer.valueOf(c15708.m37411()), c15708.m37408()));
            }
        }
        boolean z2 = this.f22692;
        if (!z2 && (i3 = this.f43599) != -1) {
            C11038 c11038 = this.f47512;
            EnumC6098[] enumC6098Arr = {EnumC6098.CONSTANT_INTEGER, EnumC6098.CONSTANT_FLOAT, EnumC6098.CONSTANT_DOUBLE, EnumC6098.CONSTANT_LONG, EnumC6098.CONSTANT_STRING};
            AbstractC12449 abstractC12449M27823 = c11038.m27823(i3);
            if (!(abstractC12449M27823 != null ? abstractC12449M27823.f41512.m16594(enumC6098Arr) : false)) {
                AbstractC12449 abstractC12449M27824 = this.f47512.m27823(this.f43599);
                EnumC6098 enumC6098 = abstractC12449M27824 != null ? abstractC12449M27824.f41512 : null;
                m18209("// ".concat(this.f47519.m2162("Unrecognized constantvalue_index: #{0} [ {1} ]", Integer.valueOf(this.f43599), enumC6098 == null ? "unknown" : enumC6098.m16593())));
            }
        }
        StringBuilder sb = new StringBuilder(m18225());
        sb.append(EnumC23839.m52517(this.f47516, EnumC0554.FIELD));
        sb.append(m34922());
        sb.append(EnumC20934.f68071.m47084());
        sb.append(' ');
        int iMax = Math.max(sb.length() - (m18233() * 2), m18233() + EnumC10020.SIGNATURE.m25297().length());
        int i4 = this.f43599;
        if (i4 != -1) {
            if (!z2 && i4 != -1) {
                C11038 c11039 = this.f47512;
                EnumC6098[] enumC6098Arr2 = {EnumC6098.CONSTANT_INTEGER, EnumC6098.CONSTANT_FLOAT, EnumC6098.CONSTANT_DOUBLE, EnumC6098.CONSTANT_LONG, EnumC6098.CONSTANT_STRING};
                AbstractC12449 abstractC12449M27825 = c11039.m27823(i4);
                if (abstractC12449M27825 != null ? abstractC12449M27825.f41512.m16594(enumC6098Arr2) : false) {
                    strConcat = " = ".concat(((C3980) this.f47511).f47512.m27825(this.f43599));
                } else {
                    strConcat = "";
                }
            } else {
                strConcat = " = ".concat(((C3980) this.f47511).f47512.m27825(this.f43599));
            }
            str = strConcat;
        } else {
            str = null;
        }
        m34918(sb, str, z ? ":" : l.b, this.f43598, this.f43600, this.f43599);
        if (z) {
            C12906 c12907 = this.f47505;
            c12907.m31984(iMax);
            c12907.m18208(1);
            c12907.f22686 = mo12770() - (m18205() * 2);
            this.f47505.mo3628();
        }
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۖ */
    public final void mo14101(int i, int i2) {
        mo14102(i, i2);
    }

    @Override // l.InterfaceC12387
    /* JADX INFO: renamed from: ۖ */
    public final int mo9753() {
        String string;
        if (!this.f22692 || this.f22704) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(EnumC23839.m52517(this.f47516, EnumC0554.FIELD));
            sb.append(m34922());
            sb.append(EnumC20934.f68071.m47084());
            sb.append(" #");
            sb.append(this.f43598);
            sb.append(":#");
            sb.append(this.f43600);
            C12906 c12906 = this.f47505;
            if (c12906 != null && c12906.f22707) {
                sb.append(":#");
                sb.append(this.f47505.m31981());
            }
            if (this.f43599 != -1) {
                sb.append(" = #");
                sb.append(this.f43599);
            }
            sb.append(';');
            string = sb.toString();
        }
        return string.length();
    }

    @Override // l.InterfaceC12387
    /* JADX INFO: renamed from: ۙ */
    public final void mo9754(int i) {
        this.f22688 = i;
    }

    @Override // l.AbstractC6741
    /* JADX INFO: renamed from: ۚ */
    public final int mo12770() {
        return Math.max(this.f22686, m18233() + this.f22688);
    }
}
