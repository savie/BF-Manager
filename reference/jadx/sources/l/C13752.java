package l;

import android.content.DialogInterface;
import android.content.Intent;
import com.alipay.sdk.m.y.l;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13752 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f45339;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12483 f45340;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f45341;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f45342;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f45343;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final List f45344;

    public C13752() {
        throw null;
    }

    public C13752(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, boolean z, String str, List list, String str2) {
        this.f45340 = abstractActivityC12483;
        this.f45343 = abstractC20745;
        this.f45339 = z;
        this.f45341 = str;
        this.f45344 = list;
        this.f45342 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13752)) {
            return false;
        }
        C13752 c13752 = (C13752) obj;
        return this.f45339 == c13752.f45339 && C13638.equals(this.f45340, c13752.f45340) && C13638.equals(this.f45343, c13752.f45343) && C13638.equals(this.f45341, c13752.f45341) && C13638.equals(this.f45344, c13752.f45344) && C13638.equals(this.f45342, c13752.f45342);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f45342) + ((C13638.hashCode(this.f45344) + C0589.m2789((C13638.hashCode(this.f45343) + ((C13638.hashCode(this.f45340) + ((this.f45339 ? 1231 : 1237) * 31)) * 31)) * 31, 31, this.f45341)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f45340, this.f45343, Boolean.valueOf(this.f45339), this.f45341, this.f45344, this.f45342};
        String[] strArrSplit = "activity;file;isApks;packageName;selectedApkNames;installerPackageName".length() == 0 ? new String[0] : "activity;file;isApks;packageName;selectedApkNames;installerPackageName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13752.class, sb, "[");
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
    public final void m33506() {
        if (this.f45342.isEmpty()) {
            return;
        }
        C16737.m39273(new RunnableC9185(2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33508(Intent intent) {
        this.f45340.startActivity(intent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33509(Exception exc) {
        this.f45340.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33507(int i) {
        this.f45340.m31018(i);
    }

    public final String getFileName() {
        return this.f45343.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r1.versionCode < 54100) goto L30;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33510(final l.EnumC23589 r7) {
        /*
            Method dump skipped, instruction units count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13752.m33510(l.᩻ۡۚ):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33511(EnumC23589 enumC23589) {
        m33510(enumC23589.m52017());
    }
}
