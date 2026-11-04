package l;

/* JADX INFO: renamed from: l.ۚܶۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72QW */
/* JADX INFO: loaded from: classes3.dex */
public class C5736 implements InterfaceC4288 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String mo16795(String str) {
        return str;
    }

    @Override // l.InterfaceC4288
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2798(Object obj) {
        String str = (String) obj;
        if (str.length() <= 0 || str.charAt(0) != '[') {
            return mo16795(str);
        }
        int iLastIndexOf = str.lastIndexOf("[") + 1;
        return C14483.m34972(str.substring(0, iLastIndexOf), mo16795(str.substring(iLastIndexOf)));
    }
}
