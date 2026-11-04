package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes2.dex */
public final class C21853 extends AbstractC1890 {

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f69618 = 0;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public C19087 f69619;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public int f69620;

    public C21853() {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19087 m49515(DataInputStream dataInputStream, AbstractC1890 abstractC1890, boolean z) throws IOException {
        char c = (char) dataInputStream.readByte();
        EnumC15863 enumC15863M30327 = C12134.m30327(c);
        switch (C7900.f26252[enumC15863M30327.ordinal()]) {
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
                C4699 c4699 = new C4699(enumC15863M30327, abstractC1890);
                c4699.f16586 = s;
                c4699.f6365 = "CPX_AnnotationValue";
                return c4699;
            case 11:
                short s2 = dataInputStream.readShort();
                short s3 = dataInputStream.readShort();
                C9390 c9390 = new C9390(enumC15863M30327, abstractC1890);
                c9390.f30475 = s2;
                c9390.f30474 = s3;
                c9390.f6365 = "CPX2_AnnotationValue";
                return c9390;
            case 12:
                C0442 c0442 = new C0442(abstractC1890, z);
                c0442.mo2258(dataInputStream);
                return new C10136(enumC15863M30327, abstractC1890, c0442);
            case 13:
                C1188 c1188 = new C1188(enumC15863M30327, abstractC1890);
                c1188.f4335 = new ArrayList();
                c1188.f6365 = "Array_AnnotationValue";
                short s4 = dataInputStream.readShort();
                for (int i = 0; i < s4; i++) {
                    c1188.f4335.add(m49515(dataInputStream, abstractC1890, z));
                }
                return c1188;
            default:
                if (abstractC1890.f67152) {
                    abstractC1890.f6369.mo4160("Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C8499.m22817(c) ? c : '?'), Integer.toHexString(c));
                    return new C10136(enumC15863M30327, abstractC1890, null);
                }
                throw new C5474(abstractC1890.f6369.m32312(), "Unknown tag in annotation \"{0}\" [0x{1}]", Character.valueOf(C8499.m22817(c) ? c : '?'), Integer.toHexString(c));
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m49516() {
        String name = this.f6371.getName(this.f69620);
        if (this.f67132) {
            return this.f67146 ? String.format("#%d", Integer.valueOf(this.f69620)) : String.format("#%d /* %s */", Integer.valueOf(this.f69620), name);
        }
        return name;
    }

    @Override // l.AbstractC20997, l.InterfaceC16454
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1688() {
        m47997(m49516() + " = ");
        C19087 c19087 = this.f69619;
        c19087.m47994(this);
        c19087.m48012(1);
        C19087 c19088 = this.f69619;
        if (c19088.f61803 == EnumC15863.AE_ARRAY) {
            if (((C1188) c19088).f4335.size() == 0) {
                m48009("{ }");
                return;
            }
            m47989();
            m48009(m47995());
            this.f69619.mo1688();
            m47997(l.d);
            return;
        }
        c19088.mo6502(m6504());
        this.f69619.mo1688();
    }

    public final String toString() {
        return "<AnnotationElement " + m49516() + " = " + this.f69619.toString() + ">";
    }
}
