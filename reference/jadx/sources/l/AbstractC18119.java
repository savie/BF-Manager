package l;

/* JADX INFO: renamed from: l.ᩳܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 71RN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18119 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19805 f57934 = new C19805();

    public abstract int length();

    /* JADX INFO: renamed from: ֨ */
    public abstract int mo5854(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract byte mo5855(int i);

    /* JADX INFO: renamed from: ۨ */
    public abstract long mo5858(int i);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo5859(int i);

    /* JADX INFO: renamed from: ۬ */
    public int mo9809(int i) {
        int iMo5859 = mo5859(i);
        if (iMo5859 >= 0) {
            return iMo5859;
        }
        throw new C20749(null, "Encountered small uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m42185(int i) {
        int iMo5859 = mo5859(i);
        if (iMo5859 >= -1) {
            return iMo5859;
        }
        throw new C20749(null, "Encountered optional uint that is out of range at offset 0x%x", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m42183(int i) {
        return mo5854(i) & 65535;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m42181(int i) {
        return mo5855(i) & 255;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m42180(int i) {
        long jMo5858 = mo5858(i);
        if (jMo5858 < 0 || jMo5858 > 2147483647L) {
            throw new C20749(null, "Encountered out-of-range ulong at offset 0x%x", Integer.valueOf(i));
        }
        return (int) jMo5858;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C18825 m42184(int i) {
        C18825 c18825 = (C18825) this.f57934.m45009();
        if (c18825 != null) {
            c18825.m43435(i);
            c18825.m43451();
            return c18825;
        }
        return new C18825(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42182(C18825 c18825) {
        this.f57934.m45011(c18825);
    }
}
