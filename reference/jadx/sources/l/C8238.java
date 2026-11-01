package l;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.۠ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15HS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8238 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"UnknownNullness"})
    public View f28685;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f28686 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28684 = new ArrayList();

    @Deprecated
    public C8238() {
    }

    public C8238(View view) {
        this.f28685 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8238)) {
            return false;
        }
        C8238 c8238 = (C8238) obj;
        return this.f28685 == c8238.f28685 && this.f28686.equals(c8238.f28686);
    }

    public final int hashCode() {
        return this.f28686.hashCode() + (this.f28685.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM8976 = C3012.m8976("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM8976.append(this.f28685);
        sbM8976.append("\n");
        String strM37076 = C15489.m37076(sbM8976.toString(), "    values:");
        HashMap map = this.f28686;
        for (String str : map.keySet()) {
            strM37076 = strM37076 + ASN1Dump.TAB + str + ": " + map.get(str) + "\n";
        }
        return strM37076;
    }
}
