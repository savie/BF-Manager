package l;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/* JADX INFO: renamed from: l.ܰܰ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: T82Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C14644 extends AbstractC20042 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final S3ObjectSummary f47913;

    public C14644(String str, String str2, long j, long j2, S3ObjectSummary s3ObjectSummary) {
        super(str, str2, null, j, j2, s3ObjectSummary != null);
        this.f47913 = s3ObjectSummary;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14644 m35275(String str) {
        int length = str.endsWith("/") ? str.length() - 1 : str.length();
        int iLastIndexOf = str.lastIndexOf(47, length - 1) + 1;
        return new C14644(str.substring(iLastIndexOf, length), "/" + str.substring(0, iLastIndexOf), -1L, -1L, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14644 m35274(S3ObjectSummary s3ObjectSummary) {
        String strM653 = s3ObjectSummary.m653();
        int iLastIndexOf = strM653.lastIndexOf(47) + 1;
        return new C14644(strM653.substring(iLastIndexOf), "/" + strM653.substring(0, iLastIndexOf), s3ObjectSummary.m658(), s3ObjectSummary.m660().getTime(), s3ObjectSummary);
    }

    @Override // l.C13352, l.InterfaceC2386
    /* JADX INFO: renamed from: ܰ */
    public final CharSequence mo8101() {
        if (this.f47913 != null) {
            return null;
        }
        return "-";
    }
}
