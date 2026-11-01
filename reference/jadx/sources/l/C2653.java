package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes2.dex */
public final class C2653 extends AbstractC13946 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f10317;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f10318;

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ */
    public final int mo7139() {
        return this.f10318.size();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ */
    public final int mo7137() {
        return this.f10317.size();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo7140(int i, int i2) {
        int iIndexOf;
        int iIndexOf2;
        String strSubstring = (String) this.f10318.get(i);
        if (!C6851.m18462((CharSequence) strSubstring) && (iIndexOf2 = strSubstring.indexOf("/")) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strSubstring2 = (String) this.f10317.get(i2);
        if (!C6851.m18462((CharSequence) strSubstring2) && (iIndexOf = strSubstring2.indexOf("/")) != -1) {
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        }
        return strSubstring.equals(strSubstring2);
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7138(int i, int i2) {
        return ((String) this.f10318.get(i)).equals(this.f10317.get(i2));
    }

    public C2653(List list, ArrayList arrayList) {
        this.f10318 = list;
        this.f10317 = arrayList;
    }
}
