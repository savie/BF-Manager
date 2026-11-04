package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes.dex */
public class C24975 implements InterfaceC1174 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20528 f80867;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f80868;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Object f80869;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C14860 f80870;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f80871;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f80872;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f80873;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20528 f80874;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f80875;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f80876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f80877;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f80878;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f80879;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f80880;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f80881;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f80882;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f80883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f80884;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f80885;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC2599 f80886;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19647 f80887;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f80888;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20528 f80889;

    static {
        ApplicationC23172.m52091(172);
    }

    public native C24975(AbstractC2599 abstractC2599, C19647 c19647);

    public native C24975(C19647 c19647, AbstractC2599 abstractC2599, boolean z, boolean z2);

    public C24975(byte[] bArr, int i, boolean z) {
        this(null, new C3674(bArr, i), z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24975 m55778(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        C25128.m55997(inputStream);
        return new C24975(C5020.m15248(inputStream), 0, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24975 m55779(byte[] bArr) {
        return new C24975(bArr, 0, true);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m55795() {
        return this.f80871;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC2599 m55818() {
        return this.f80886;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3674 m55813() {
        AbstractC2599 abstractC2599 = this.f80886;
        if (abstractC2599 instanceof C3674) {
            return (C3674) abstractC2599;
        }
        throw new RuntimeException();
    }

    @Override // l.InterfaceC1174
    /* JADX INFO: renamed from: ۙ */
    public final C19647 mo4326() {
        return this.f80887;
    }

    @Override // l.InterfaceC1174
    /* JADX INFO: renamed from: ᩷ */
    public final Set mo4327() {
        return new C19753(this);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m55807(int i) {
        int i2 = this.f80871;
        if (i2 == 0) {
            return 0;
        }
        int iMo8725 = this.f80886.mo8725((i * 4) + i2 + 4);
        if (iMo8725 == 0) {
            return 0;
        }
        return this.f80871 + iMo8725;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m55799() {
        this.f80882 = false;
        this.f80870.m35790();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m55800(int i) {
        if (i < 0 || i >= this.f80872) {
            throw new C1854(null, "String index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f80888;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m55810(int i) {
        if (i < 0 || i >= this.f80877) {
            throw new C1854(null, "Type index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f80884;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m55814(int i) {
        if (i < 0 || i >= this.f80878) {
            throw new C1854(null, "Field index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f80876;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m55812(int i) {
        if (i < 0 || i >= this.f80881) {
            throw new C1854(null, "Method index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f80879;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m55796(int i) {
        if (i < 0 || i >= this.f80868) {
            throw new C1854(null, "Proto index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 12) + this.f80883;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m55784(int i) {
        if (i < 0 || i >= this.f80885) {
            throw new C1854(null, "Class index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 32) + this.f80873;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m55804() {
        return this.f80885;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m55808() {
        return this.f80872;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m55806() {
        return this.f80877;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m55821() {
        return this.f80868;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m55802() {
        return this.f80878;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m55781() {
        return this.f80881;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m55782(int i) {
        boolean z = this.f80882;
        String strM35788 = z ? this.f80870.m35788(i) : null;
        if (strM35788 != null) {
            return strM35788;
        }
        int iM55800 = m55800(i);
        AbstractC2599 abstractC2599 = this.f80886;
        C8565 c8565M8724 = abstractC2599.m8724(abstractC2599.mo8719(iM55800));
        String strM22987 = c8565M8724.m22987(c8565M8724.m22996());
        c8565M8724.m22995();
        if (z) {
            this.f80870.m35791(i, strM22987);
        }
        return strM22987;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m55816(int i, Writer writer, boolean z) throws IOException {
        if (this.f80882 && !z) {
            writer.write(m55782(i));
        } else {
            m55786(i, writer, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55786(int i, Writer writer, boolean z) {
        int iM55800 = m55800(i);
        AbstractC2599 abstractC2599 = this.f80886;
        C8565 c8565M8724 = abstractC2599.m8724(abstractC2599.mo8719(iM55800));
        c8565M8724.m22985(c8565M8724.m22996(), writer, z);
        c8565M8724.m22995();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55793(int i, int i2, int i3, String str) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length()) {
            String strM35788 = this.f80882 ? this.f80870.m35788(i) : null;
            if (strM35788 != null) {
                if (strM35788.length() == i3 && str.regionMatches(i2, strM35788, 0, i3)) {
                    return true;
                }
            } else {
                int iM55800 = m55800(i);
                AbstractC2599 abstractC2599 = this.f80886;
                C8565 c8565M8724 = abstractC2599.m8724(abstractC2599.mo8719(iM55800));
                try {
                    return C20806.m47600(this.f80886, c8565M8724.m23001(), c8565M8724.m22996(), str, i2, i3);
                } finally {
                    c8565M8724.m22995();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m55803(int i) {
        if (i == -1) {
            return null;
        }
        return m55782(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m55822(int i) {
        boolean z = this.f80882;
        String strM35792 = z ? this.f80870.m35792(i) : null;
        if (strM35792 != null) {
            return strM35792;
        }
        String strM55782 = m55782(this.f80886.mo8719(m55810(i)));
        if (z) {
            this.f80870.m35794(i, strM55782);
        }
        return strM55782;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m55809(int i) {
        return m55822(this.f80886.mo8719(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55787(Writer writer, int i) {
        if (this.f80882) {
            writer.write(m55822(i));
        } else {
            m55816(this.f80886.mo8719(m55810(i)), writer, false);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m55817(int i, int i2, int i3, String str) {
        String strM35792 = this.f80882 ? this.f80870.m35792(i) : null;
        if (strM35792 != null) {
            return i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length() && strM35792.length() == i3 && str.regionMatches(i2, strM35792, 0, i3);
        }
        return m55793(this.f80886.mo8719(m55810(i)), i2, i3, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m55794(int i, String str) {
        String strM35792 = this.f80882 ? this.f80870.m35792(i) : null;
        int i2 = 0;
        if (strM35792 != null) {
            int i3 = 0;
            while (i3 < strM35792.length() && strM35792.charAt(i3) == '[') {
                i3++;
            }
            return strM35792.length() - i3 == str.length() && strM35792.regionMatches(i3, str, 0, str.length());
        }
        int iM55810 = m55810(i);
        AbstractC2599 abstractC2599 = this.f80886;
        C8565 c8565M8724 = abstractC2599.m8724(abstractC2599.mo8719(m55800(abstractC2599.mo8719(iM55810))));
        try {
            int iM22996 = c8565M8724.m22996();
            int iM23001 = c8565M8724.m23001();
            while (i2 < iM22996 && abstractC2599.m8716(iM23001 + i2) == 91) {
                i2++;
            }
            return C20806.m47600(this.f80886, iM23001 + i2, iM22996 - i2, str, 0, str.length());
        } finally {
            c8565M8724.m22995();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List m55820() {
        return new C15277(this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m55801() {
        return new C13040(this);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1985 m55805(int i) {
        if (this.f80882) {
            return this.f80870.m35793(this, i);
        }
        return new C1985(this, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22868 m55798(int i) {
        if (this.f80882) {
            return this.f80870.m35789(this, i);
        }
        return new C22868(this, i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12557 m55797(int i, EnumC22631 enumC22631) {
        C12557 c12557 = (C12557) this.f80889.m47061();
        if (c12557 != null) {
            c12557.f62314 = enumC22631;
            c12557.f62315 = i;
            return c12557;
        }
        return new C12557(this, enumC22631, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55790(C12557 c12557) {
        this.f80889.m47060(c12557);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13303 m55815(int i, EnumC22631 enumC22631) {
        C13303 c13303 = (C13303) this.f80874.m47061();
        if (c13303 != null) {
            c13303.f62314 = enumC22631;
            c13303.f62315 = i;
            return c13303;
        }
        return new C13303(this, enumC22631, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55791(C13303 c13303) {
        this.f80874.m47060(c13303);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9661 m55785(int i, EnumC22631 enumC22631) {
        C9661 c9661 = (C9661) this.f80867.m47061();
        if (c9661 == null) {
            return new C9661(this, enumC22631, i);
        }
        c9661.f62314 = enumC22631;
        c9661.f62315 = i;
        return c9661;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55789(C9661 c9661) {
        this.f80867.m47060(c9661);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22122 m55819(int i) {
        for (C22122 c22122 : new C5583(this, this.f80886.mo8719(this.f80880))) {
            if (c22122.m50080() == i) {
                return c22122;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55788(Object obj) {
        this.f80869 = obj;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m55811() {
        return this.f80869;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55792(boolean z) {
        this.f80875 = z;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m55783() {
        return this.f80875;
    }
}
