package l;

/* JADX INFO: renamed from: l.ܽ֨ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72QW */
/* JADX INFO: loaded from: classes4.dex */
public class C16309 implements InterfaceC2196 {
    /* JADX INFO: renamed from: ۙ */
    public String mo16351(String str) {
        return str;
    }

    @Override // l.InterfaceC2196
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1014(Object obj) {
        String str = (String) obj;
        if (str.length() <= 0 || str.charAt(0) != '[') {
            return mo16351(str);
        }
        int iLastIndexOf = str.lastIndexOf("[") + 1;
        return C15489.m37076(str.substring(0, iLastIndexOf), mo16351(str.substring(iLastIndexOf)));
    }
}
