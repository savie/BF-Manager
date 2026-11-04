package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBG4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17216 implements InterfaceC6052 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0063 f56109;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18708 f56110;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20946 f56111;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9012 f56112;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC17216 mo7777(C5085 c5085);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC17216 mo7778(C20946 c20946, C0063 c0063);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo7779(InterfaceC16470 interfaceC16470);

    /* JADX INFO: renamed from: ۤ */
    public abstract InterfaceC11050 mo7781();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AbstractC17216 mo40436() {
        return this;
    }

    /* JADX INFO: renamed from: ᩸ */
    public String mo7782() {
        return null;
    }

    public AbstractC17216(C18708 c18708, C9012 c9012, C20946 c20946, C0063 c0063) {
        if (c18708 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c9012 == null) {
            throw new NullPointerException("position == null");
        }
        if (c0063 == null) {
            throw new NullPointerException("sources == null");
        }
        this.f56110 = c18708;
        this.f56112 = c9012;
        this.f56111 = c20946;
        this.f56109 = c0063;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo7782 = mo7782();
        StringBuilder sbM3018 = C0703.m3018(80, "Insn{");
        sbM3018.append(this.f56112);
        sbM3018.append(' ');
        sbM3018.append(this.f56110);
        if (strMo7782 != null) {
            sbM3018.append(' ');
            sbM3018.append(strMo7782);
        }
        sbM3018.append(" :: ");
        C20946 c20946 = this.f56111;
        if (c20946 != null) {
            sbM3018.append(c20946);
            sbM3018.append(" <- ");
        }
        sbM3018.append(this.f56109);
        sbM3018.append('}');
        return sbM3018.toString();
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        String strMo7782 = mo7782();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f56112);
        sb.append(": ");
        sb.append(this.f56110.m43504());
        if (strMo7782 != null) {
            C22121.m50078(sb, MotionUtils.EASING_TYPE_FORMAT_START, strMo7782, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C20946 c20946 = this.f56111;
        if (c20946 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c20946.mo1843());
        }
        sb.append(" <-");
        C0063 c0063 = this.f56109;
        int size = c0063.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(c0063.m31619get(i).mo1843());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18708 m40434() {
        return this.f56110;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9012 m40433() {
        return this.f56112;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C20946 m40437() {
        return this.f56111;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20946 m40435() {
        C20946 c20946M31619get;
        if (this.f56110.m43509() == 54) {
            c20946M31619get = this.f56109.m31619get(0);
        } else {
            c20946M31619get = this.f56111;
        }
        if (c20946M31619get == null || c20946M31619get.m47896() == null) {
            return null;
        }
        return c20946M31619get;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0063 m40438() {
        return this.f56109;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40439() {
        return this.f56110.m43502();
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo7780(AbstractC17216 abstractC17216) {
        Object obj;
        C20946 c20946;
        if (this.f56110 != abstractC17216.f56110 || !this.f56112.equals(abstractC17216.f56112) || getClass() != abstractC17216.getClass() || ((c20946 = this.f56111) != (obj = abstractC17216.f56111) && (c20946 == null || !c20946.equals(obj)))) {
            return false;
        }
        Object obj2 = abstractC17216.f56109;
        C0063 c0063 = this.f56109;
        if (c0063 != obj2 && (c0063 == null || !c0063.equals(obj2))) {
            return false;
        }
        InterfaceC11050 interfaceC11050Mo7781 = mo7781();
        InterfaceC11050 interfaceC11050Mo7782 = abstractC17216.mo7781();
        C13705 c13705 = C13705.f43487;
        int size = interfaceC11050Mo7781.size();
        if (interfaceC11050Mo7782.size() == size) {
            for (int i = 0; i < size; i++) {
                if (interfaceC11050Mo7781.getType(i).equals(interfaceC11050Mo7782.getType(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
