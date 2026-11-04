package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes.dex */
public final class C21686 extends AbstractC6559 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f69214;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f69215;

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ᩷ */
    public final int mo13346() {
        return this.f69215.size();
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ۙ */
    public final int mo13344() {
        return this.f69214.size();
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo13347(int i, int i2) {
        int iIndexOf;
        int iIndexOf2;
        String strSubstring = (String) this.f69215.get(i);
        if (!C24276.m54286((CharSequence) strSubstring) && (iIndexOf2 = strSubstring.indexOf("/")) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strSubstring2 = (String) this.f69214.get(i2);
        if (!C24276.m54286((CharSequence) strSubstring2) && (iIndexOf = strSubstring2.indexOf("/")) != -1) {
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        }
        return strSubstring.equals(strSubstring2);
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13345(int i, int i2) {
        return ((String) this.f69215.get(i)).equals(this.f69214.get(i2));
    }

    public C21686(ArrayList arrayList, List list) {
        this.f69215 = list;
        this.f69214 = arrayList;
    }
}
