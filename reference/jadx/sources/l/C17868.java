package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes5.dex */
public final class C17868 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f58569;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f58570;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f58571;

    public C17868(String str, CharSequence charSequence, Bitmap bitmap) {
        this.f58571 = str;
        this.f58570 = charSequence;
        this.f58569 = bitmap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17868)) {
            return false;
        }
        C17868 c17868 = (C17868) obj;
        return C17359.equals(this.f58571, c17868.f58571) && C17359.equals(this.f58570, c17868.f58570) && C17359.equals(this.f58569, c17868.f58569);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f58569) + ((C17359.hashCode(this.f58570) + (C17359.hashCode(this.f58571) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f58571, this.f58570, this.f58569};
        String[] strArrSplit = "id;label;icon".length() == 0 ? new String[0] : "id;label;icon".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17868.class, sb, "[");
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
    public final Bitmap m41710() {
        return this.f58569;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence m41711() {
        return this.f58570;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m41712() {
        return this.f58571;
    }
}
