package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11443 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f35959;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f35960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f35961;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f35962;

    public C11443(String str, String str2, boolean z, boolean z2) {
        this.f35962 = str;
        this.f35960 = str2;
        this.f35959 = z;
        this.f35961 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11443)) {
            return false;
        }
        C11443 c11443 = (C11443) obj;
        return this.f35959 == c11443.f35959 && this.f35961 == c11443.f35961 && C17359.equals(this.f35962, c11443.f35962) && C17359.equals(this.f35960, c11443.f35960);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f35960) + C24966.m55771((((this.f35959 ? 1231 : 1237) * 31) + (this.f35961 ? 1231 : 1237)) * 31, 31, this.f35962);
    }

    public final String toString() {
        Object[] objArr = {this.f35962, this.f35960, Boolean.valueOf(this.f35959), Boolean.valueOf(this.f35961)};
        String[] strArrSplit = "oldName;newName;isDirectory;needMark".length() == 0 ? new String[0] : "oldName;newName;isDirectory;needMark".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11443.class, sb, "[");
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
    public final String m28804() {
        if (!this.f35961) {
            return null;
        }
        String str = this.f35960;
        if (C17359.equals(C11293.m28556(str), C11293.m28556(this.f35962))) {
            return C11293.m28558(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28805(C8002 c8002) {
        String name = c8002.getName();
        boolean z = this.f35959;
        String str = this.f35960;
        String str2 = this.f35962;
        if (!z) {
            if (!name.equals(str2)) {
                return false;
            }
            c8002.m21851(str);
            return true;
        }
        if (name.length() <= str2.length() || !name.startsWith(str2) || name.charAt(str2.length()) != '/') {
            return false;
        }
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(name.substring(str2.length()));
        c8002.m21851(sbM27333.toString());
        return true;
    }
}
