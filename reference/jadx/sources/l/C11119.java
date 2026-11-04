package l;

import com.alipay.sdk.m.k0.c;

/* JADX INFO: renamed from: l.ۤ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9WT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11119 extends C20048 {
    public static final long serialVersionUID = 492638554095148960L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f35064;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f35065;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m28069(int i, int i2) {
        if (i == 0) {
            return c.p;
        }
        if (i == 1) {
            return (i2 != 1 ? "ERR_NAM_SRVC/" : "ERR_NAM_SRVC/FMT_ERR: Format Error") + "Unknown error code: " + i2;
        }
        if (i != 2) {
            return C13645.m33382(i, "unknown error class: ");
        }
        if (i2 == -1) {
            return "ERR_SSN_SRVC/Connection refused";
        }
        if (i2 == 143) {
            return "ERR_SSN_SRVC/Unspecified error";
        }
        switch (i2) {
            case 128:
                return "ERR_SSN_SRVC/Not listening on called name";
            case 129:
                return "ERR_SSN_SRVC/Not listening for calling name";
            case 130:
                return "ERR_SSN_SRVC/Called name not present";
            case 131:
                return "ERR_SSN_SRVC/Called name present, but insufficient resources";
            default:
                return C13645.m33382(i2, "ERR_SSN_SRVC/Unknown error code: ");
        }
    }

    public C11119(int i) {
        super(m28069(2, i));
        this.f35064 = 2;
        this.f35065 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("errorClass=");
        int i = this.f35064;
        sb.append(i);
        sb.append(",errorCode=");
        int i2 = this.f35065;
        sb.append(i2);
        sb.append(",errorString=");
        sb.append(m28069(i, i2));
        return new String(sb.toString());
    }
}
