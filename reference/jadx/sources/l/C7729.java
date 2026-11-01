package l;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/* JADX INFO: renamed from: l.۟᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T82Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C7729 extends AbstractC5362 {

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final S3ObjectSummary f25553;

    public C7729(String str, String str2, long j, long j2, S3ObjectSummary s3ObjectSummary) {
        super(str, str2, null, j, j2, s3ObjectSummary != null);
        this.f25553 = s3ObjectSummary;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C7729 m20377(String str) {
        int length = str.endsWith("/") ? str.length() - 1 : str.length();
        int iLastIndexOf = str.lastIndexOf(47, length - 1) + 1;
        return new C7729(str.substring(iLastIndexOf, length), "/" + str.substring(0, iLastIndexOf), -1L, -1L, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7729 m20376(S3ObjectSummary s3ObjectSummary) {
        String strM660 = s3ObjectSummary.m660();
        int iLastIndexOf = strM660.lastIndexOf(47) + 1;
        return new C7729(strM660.substring(iLastIndexOf), "/" + strM660.substring(0, iLastIndexOf), s3ObjectSummary.m665(), s3ObjectSummary.m667().getTime(), s3ObjectSummary);
    }

    @Override // l.C15404, l.InterfaceC2557
    /* JADX INFO: renamed from: ܺ */
    public final CharSequence mo7981() {
        if (this.f25553 != null) {
            return null;
        }
        return "-";
    }
}
