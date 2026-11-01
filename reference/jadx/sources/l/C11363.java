package l;

import com.alipay.sdk.m.y.l;
import net.sf.sevenzipjbinding.ExtractOperationResult;

/* JADX INFO: renamed from: l.ۨ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C11363 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f38325;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult f38326;

    public C11363(ExtractOperationResult extractOperationResult, boolean z) {
        this.f38326 = extractOperationResult;
        this.f38325 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11363)) {
            return false;
        }
        C11363 c11363 = (C11363) obj;
        return this.f38325 == c11363.f38325 && C13638.equals(this.f38326, c11363.f38326);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f38326) + ((this.f38325 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f38326, Boolean.valueOf(this.f38325)};
        String[] strArrSplit = "result;encrypted".length() == 0 ? new String[0] : "result;encrypted".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C11363.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28469() {
        return this.f38325;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ExtractOperationResult m28470() {
        return this.f38326;
    }
}
