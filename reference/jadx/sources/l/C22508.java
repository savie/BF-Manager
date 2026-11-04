package l;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.᩸ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 15HS */
/* JADX INFO: loaded from: classes.dex */
public final class C22508 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"UnknownNullness"})
    public View f72817;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f72818 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72816 = new ArrayList();

    @Deprecated
    public C22508() {
    }

    public C22508(View view) {
        this.f72817 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22508)) {
            return false;
        }
        C22508 c22508 = (C22508) obj;
        return this.f72817 == c22508.f72817 && this.f72818.equals(c22508.f72818);
    }

    public final int hashCode() {
        return this.f72818.hashCode() + (this.f72817.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM10405 = C3188.m10405("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM10405.append(this.f72817);
        sbM10405.append("\n");
        String strM34972 = C14483.m34972(sbM10405.toString(), "    values:");
        HashMap map = this.f72818;
        for (String str : map.keySet()) {
            strM34972 = strM34972 + ASN1Dump.TAB + str + ": " + map.get(str) + "\n";
        }
        return strM34972;
    }
}
