package l;

import android.content.DialogInterface;
import android.content.Intent;
import com.alipay.sdk.m.y.l;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۛ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6733 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f22436;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f22437;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f22438;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f22439;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f22440;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f22441;

    public C6733() {
        throw null;
    }

    public C6733(AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044, boolean z, String str, List list, String str2) {
        this.f22436 = abstractActivityC17204;
        this.f22440 = abstractC22044;
        this.f22441 = z;
        this.f22439 = str;
        this.f22438 = list;
        this.f22437 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6733)) {
            return false;
        }
        C6733 c6733 = (C6733) obj;
        return this.f22441 == c6733.f22441 && C17359.equals(this.f22436, c6733.f22436) && C17359.equals(this.f22440, c6733.f22440) && C17359.equals(this.f22439, c6733.f22439) && C17359.equals(this.f22438, c6733.f22438) && C17359.equals(this.f22437, c6733.f22437);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f22437) + ((C17359.hashCode(this.f22438) + C24966.m55771((C17359.hashCode(this.f22440) + ((C17359.hashCode(this.f22436) + ((this.f22441 ? 1231 : 1237) * 31)) * 31)) * 31, 31, this.f22439)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22436, this.f22440, Boolean.valueOf(this.f22441), this.f22439, this.f22438, this.f22437};
        String[] strArrSplit = "activity;file;isApks;packageName;selectedApkNames;installerPackageName".length() == 0 ? new String[0] : "activity;file;isApks;packageName;selectedApkNames;installerPackageName".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C6733.class, sb, "[");
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
    public final void m18821() {
        if (this.f22437.isEmpty()) {
            return;
        }
        C21576.m49068(new RunnableC21927(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18823(Intent intent) {
        this.f22436.startActivity(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18824(Exception exc) {
        this.f22436.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18822(int i) {
        this.f22436.m40398(i, false);
    }

    public final String getFileName() {
        return this.f22440.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r1.versionCode < 54100) goto L30;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18825(final l.EnumC16427 r7) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6733.m18825(l.ܶ᩺ᩴ):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18826(EnumC16427 enumC16427) {
        m18825(enumC16427.m38991());
    }
}
