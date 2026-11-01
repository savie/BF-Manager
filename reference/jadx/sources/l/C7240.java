package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7240 extends AbstractC14504 {

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24124 = 0;

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public int f24125;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public C6534 f24126;

    public C7240() {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6534 m19353(DataInputStream dataInputStream, AbstractC14504 abstractC14504, boolean z) throws IOException {
        char c = (char) dataInputStream.readByte();
        EnumC3046 enumC3046M7617 = C2485.m7617(c);
        switch (C3711.f13509[enumC3046M7617.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                short s = dataInputStream.readShort();
                C10063 c10063 = new C10063(enumC3046M7617, abstractC14504);
                c10063.f34387 = s;
                c10063.f47507 = "CPX_AnnotationValue";
                return c10063;
            case 11:
                short s2 = dataInputStream.readShort();
                short s3 = dataInputStream.readShort();
                C21351 c21351 = new C21351(enumC3046M7617, abstractC14504);
                c21351.f69470 = s2;
                c21351.f69469 = s3;
                c21351.f47507 = "CPX2_AnnotationValue";
                return c21351;
            case 12:
                C12885 c12885 = new C12885(abstractC14504, z);
                c12885.mo9027(dataInputStream);
                return new C22763(enumC3046M7617, abstractC14504, c12885);
            case 13:
                C15002 c15002 = new C15002(enumC3046M7617, abstractC14504);
                c15002.f48929 = new ArrayList();
                c15002.f47507 = "Array_AnnotationValue";
                short s4 = dataInputStream.readShort();
                for (int i = 0; i < s4; i++) {
                    c15002.f48929.add(m19353(dataInputStream, abstractC14504, z));
                }
                return c15002;
            default:
                if (abstractC14504.f22711) {
                    abstractC14504.f47519.mo2150("Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C18755.m43311(c) ? c : '?'), Integer.toHexString(c));
                    return new C22763(enumC3046M7617, abstractC14504, null);
                }
                throw new C16639(abstractC14504.f47519.m2163(), "Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C18755.m43311(c) ? c : '?'), Integer.toHexString(c));
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m19354() {
        String name = this.f47512.getName(this.f24125);
        if (this.f22692) {
            return this.f22704 ? String.format("#%d", Integer.valueOf(this.f24125)) : String.format("#%d /* %s */", Integer.valueOf(this.f24125), name);
        }
        return name;
    }

    @Override // l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        m18223(m19354() + " = ");
        C6534 c6534 = this.f24126;
        c6534.m18216(this);
        c6534.m18208(1);
        C6534 c6535 = this.f24126;
        if (c6535.f22000 == EnumC3046.AE_ARRAY) {
            if (((C15002) c6535).f48929.size() == 0) {
                m18228("{ }");
                return;
            }
            m18221();
            m18228(m18225());
            this.f24126.mo3628();
            m18223(l.d);
            return;
        }
        c6535.mo34919(m34921());
        this.f24126.mo3628();
    }

    public final String toString() {
        return "<AnnotationElement " + m19354() + " = " + this.f24126.toString() + ">";
    }
}
