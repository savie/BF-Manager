package l;

import com.alipay.sdk.m.k0.c;

/* JADX INFO: renamed from: l.᩸᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9WT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21784 extends C8484 {
    public static final long serialVersionUID = 492638554095148960L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f70569;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48546(int i, int i2) {
        if (i == 0) {
            return c.p;
        }
        if (i == 1) {
            return (i2 != 1 ? "ERR_NAM_SRVC/" : "ERR_NAM_SRVC/FMT_ERR: Format Error") + "Unknown error code: " + i2;
        }
        if (i != 2) {
            return C8479.m22141(i, "unknown error class: ");
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
                return C8479.m22141(i2, "ERR_SSN_SRVC/Unknown error code: ");
        }
    }

    public C21784(int i) {
        super(m48546(2, i));
        this.f70568 = 2;
        this.f70569 = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("errorClass=");
        int i = this.f70568;
        sb.append(i);
        sb.append(",errorCode=");
        int i2 = this.f70569;
        sb.append(i2);
        sb.append(",errorString=");
        sb.append(m48546(i, i2));
        return new String(sb.toString());
    }
}
