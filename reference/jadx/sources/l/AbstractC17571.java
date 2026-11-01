package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1DC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17571 implements InterfaceC5703, Serializable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Object f55830 = C12633.f42213;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Class f55831;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient InterfaceC5703 f55832;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f55833;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f55834;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f55835;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f55836;

    /* JADX INFO: renamed from: ۨ */
    public abstract InterfaceC5703 mo12091();

    public AbstractC17571(Object obj, Class cls, String str, String str2, boolean z) {
        this.f55834 = obj;
        this.f55831 = cls;
        this.f55836 = str;
        this.f55835 = str2;
        this.f55833 = z;
    }

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC5703 mo13851() {
        InterfaceC5703 interfaceC5703 = this.f55832;
        if (interfaceC5703 != null) {
            return interfaceC5703;
        }
        InterfaceC5703 interfaceC5703Mo12091 = mo12091();
        this.f55832 = interfaceC5703Mo12091;
        return interfaceC5703Mo12091;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6282 m40849() {
        Class cls = this.f55831;
        if (cls == null) {
            return null;
        }
        return this.f55833 ? C12759.m31712(cls) : C12759.m31709(cls);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m40848() {
        return this.f55836;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m40847() {
        return this.f55835;
    }
}
