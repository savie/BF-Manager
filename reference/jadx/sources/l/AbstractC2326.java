package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۖ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1DC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2326 implements InterfaceC8531, Serializable {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Object f7502 = C9037.f29399;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object f7503;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient InterfaceC8531 f7504;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f7505;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Class f7506;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f7507;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f7508;

    /* JADX INFO: renamed from: ᩸ */
    public abstract InterfaceC8531 mo6298();

    public AbstractC2326(Object obj, Class cls, String str, String str2, boolean z) {
        this.f7503 = obj;
        this.f7506 = cls;
        this.f7508 = str;
        this.f7507 = str2;
        this.f7505 = z;
    }

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC8531 mo6297() {
        InterfaceC8531 interfaceC8531 = this.f7504;
        if (interfaceC8531 != null) {
            return interfaceC8531;
        }
        InterfaceC8531 interfaceC8531Mo6298 = mo6298();
        this.f7504 = interfaceC8531Mo6298;
        return interfaceC8531Mo6298;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8292 m7832() {
        Class cls = this.f7506;
        if (cls == null) {
            return null;
        }
        return this.f7505 ? C16735.m39517(cls) : C16735.m39514(cls);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m7833() {
        return this.f7508;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m7831() {
        return this.f7507;
    }
}
