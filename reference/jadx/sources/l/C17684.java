package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes.dex */
public class C17684 implements InterfaceC15001 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f56151;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC18119 f56152;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C19805 f56153;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2867 f56154;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f56155;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19805 f56156;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f56157;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f56158;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f56159;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f56160;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f56161;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f56162;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f56163;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f56164;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f56165;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56166;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7474 f56167;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f56168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56169;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Object f56170;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f56171;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f56172;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C19805 f56173;

    static {
        ApplicationC6132.m17119(141);
    }

    public native C17684(C7474 c7474, AbstractC18119 abstractC18119, boolean z, boolean z2);

    public native C17684(AbstractC18119 abstractC18119, C7474 c7474);

    public C17684(byte[] bArr, int i, boolean z) {
        this(null, new C1788(bArr, i), z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17684 m41160(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        C10665.m26865(inputStream);
        return new C17684(C2221.m6841(inputStream), 0, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17684 m41161(byte[] bArr) {
        return new C17684(bArr, 0, true);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m41188() {
        return this.f56162;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC18119 m41166() {
        return this.f56152;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1788 m41181() {
        AbstractC18119 abstractC18119 = this.f56152;
        if (abstractC18119 instanceof C1788) {
            return (C1788) abstractC18119;
        }
        throw new RuntimeException();
    }

    @Override // l.InterfaceC15001
    /* JADX INFO: renamed from: ۙ */
    public final C7474 mo34147() {
        return this.f56167;
    }

    @Override // l.InterfaceC15001
    /* JADX INFO: renamed from: ܰ */
    public final Set mo34148() {
        return new C21212(this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41197(int i) {
        int i2 = this.f56162;
        if (i2 == 0) {
            return 0;
        }
        int iMo5859 = this.f56152.mo5859((i * 4) + i2 + 4);
        if (iMo5859 == 0) {
            return 0;
        }
        return this.f56162 + iMo5859;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m41187() {
        this.f56155 = false;
        this.f56154.m8630();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m41182(int i) {
        if (i < 0 || i >= this.f56160) {
            throw new C16979(null, "String index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f56157;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41199(int i) {
        if (i < 0 || i >= this.f56165) {
            throw new C16979(null, "Type index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f56169;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m41190(int i) {
        if (i < 0 || i >= this.f56172) {
            throw new C16979(null, "Field index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f56151;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m41180(int i) {
        if (i < 0 || i >= this.f56171) {
            throw new C16979(null, "Method index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f56166;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m41189(int i) {
        if (i < 0 || i >= this.f56158) {
            throw new C16979(null, "Proto index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 12) + this.f56168;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41169(int i) {
        if (i < 0 || i >= this.f56163) {
            throw new C16979(null, "Class index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 32) + this.f56161;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m41201() {
        return this.f56163;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m41194() {
        return this.f56160;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41196() {
        return this.f56165;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m41203() {
        return this.f56158;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m41163() {
        return this.f56172;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m41167() {
        return this.f56171;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m41168(int i) {
        boolean z = this.f56155;
        String strM8628 = z ? this.f56154.m8628(i) : null;
        if (strM8628 != null) {
            return strM8628;
        }
        int iM41182 = m41182(i);
        AbstractC18119 abstractC18119 = this.f56152;
        C18825 c18825M42184 = abstractC18119.m42184(abstractC18119.mo9809(iM41182));
        String strM43446 = c18825M42184.m43446(c18825M42184.m43449());
        c18825M42184.m43450();
        if (z) {
            this.f56154.m8631(i, strM43446);
        }
        return strM43446;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m41192(int i, Writer writer, boolean z) throws IOException {
        if (this.f56155 && !z) {
            writer.write(m41168(i));
        } else {
            m41171(i, writer, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41171(int i, Writer writer, boolean z) {
        int iM41182 = m41182(i);
        AbstractC18119 abstractC18119 = this.f56152;
        C18825 c18825M42184 = abstractC18119.m42184(abstractC18119.mo9809(iM41182));
        c18825M42184.m43438(c18825M42184.m43449(), writer, z);
        c18825M42184.m43450();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41178(int i, int i2, int i3, String str) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length()) {
            String strM8628 = this.f56155 ? this.f56154.m8628(i) : null;
            if (strM8628 != null) {
                if (strM8628.length() == i3 && str.regionMatches(i2, strM8628, 0, i3)) {
                    return true;
                }
            } else {
                int iM41182 = m41182(i);
                AbstractC18119 abstractC18119 = this.f56152;
                C18825 c18825M42184 = abstractC18119.m42184(abstractC18119.mo9809(iM41182));
                try {
                    return C3109.m9326(this.f56152, c18825M42184.m43447(), c18825M42184.m43449(), str, i2, i3);
                } finally {
                    c18825M42184.m43450();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m41164(int i) {
        if (i == -1) {
            return null;
        }
        return m41168(i);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String m41204(int i) {
        boolean z = this.f56155;
        String strM8632 = z ? this.f56154.m8632(i) : null;
        if (strM8632 != null) {
            return strM8632;
        }
        String strM41168 = m41168(this.f56152.mo9809(m41199(i)));
        if (z) {
            this.f56154.m8634(i, strM41168);
        }
        return strM41168;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m41195(int i) {
        return m41204(this.f56152.mo9809(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41172(Writer writer, int i) {
        if (this.f56155) {
            writer.write(m41204(i));
        } else {
            m41192(this.f56152.mo9809(m41199(i)), writer, false);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m41193(int i, int i2, int i3, String str) {
        String strM8632 = this.f56155 ? this.f56154.m8632(i) : null;
        if (strM8632 != null) {
            return i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length() && strM8632.length() == i3 && str.regionMatches(i2, strM8632, 0, i3);
        }
        return m41178(this.f56152.mo9809(m41199(i)), i2, i3, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m41179(int i, String str) {
        String strM8632 = this.f56155 ? this.f56154.m8632(i) : null;
        int i2 = 0;
        if (strM8632 != null) {
            int i3 = 0;
            while (i3 < strM8632.length() && strM8632.charAt(i3) == '[') {
                i3++;
            }
            return strM8632.length() - i3 == str.length() && strM8632.regionMatches(i3, str, 0, str.length());
        }
        int iM41199 = m41199(i);
        AbstractC18119 abstractC18119 = this.f56152;
        C18825 c18825M42184 = abstractC18119.m42184(abstractC18119.mo9809(m41182(abstractC18119.mo9809(iM41199))));
        try {
            int iM43449 = c18825M42184.m43449();
            int iM43447 = c18825M42184.m43447();
            while (i2 < iM43449 && abstractC18119.m42181(iM43447 + i2) == 91) {
                i2++;
            }
            return C3109.m9326(this.f56152, iM43447 + i2, iM43449 - i2, str, 0, str.length());
        } finally {
            c18825M42184.m43450();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m41198() {
        return new C16274(this);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m41183() {
        return new C20507(this);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12332 m41202(int i) {
        if (this.f56155) {
            return this.f56154.m8633(this, i);
        }
        return new C12332(this, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20798 m41186(int i) {
        if (this.f56155) {
            return this.f56154.m8629(this, i);
        }
        return new C20798(this, i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4569 m41185(int i, EnumC10297 enumC10297) {
        C4569 c4569 = (C4569) this.f56173.m45009();
        if (c4569 != null) {
            c4569.f22551 = enumC10297;
            c4569.f22553 = i;
            return c4569;
        }
        return new C4569(this, enumC10297, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41175(C4569 c4569) {
        this.f56173.m45011(c4569);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0108 m41191(int i, EnumC10297 enumC10297) {
        C0108 c0108 = (C0108) this.f56156.m45009();
        if (c0108 != null) {
            c0108.f22551 = enumC10297;
            c0108.f22553 = i;
            return c0108;
        }
        return new C0108(this, enumC10297, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41174(C0108 c0108) {
        this.f56156.m45011(c0108);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21275 m41170(int i, EnumC10297 enumC10297) {
        C21275 c21275 = (C21275) this.f56153.m45009();
        if (c21275 == null) {
            return new C21275(this, enumC10297, i);
        }
        c21275.f22551 = enumC10297;
        c21275.f22553 = i;
        return c21275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41176(C21275 c21275) {
        this.f56153.m45011(c21275);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10215 m41165(int i) {
        for (C10215 c10215 : new C0750(this, this.f56152.mo9809(this.f56164))) {
            if (c10215.m25998() == i) {
                return c10215;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41173(Object obj) {
        this.f56170 = obj;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object m41200() {
        return this.f56170;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41177(boolean z) {
        this.f56159 = z;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m41184() {
        return this.f56159;
    }
}
