package l;

/* JADX INFO: renamed from: l.᩺᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5YJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24647 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        int length;
        int iIndexOf;
        C14270 c14270 = new C14270();
        String strM34647 = ((C14270) c19929.m45858()).m34647();
        String strM34648 = ((C14270) c19929.m45858()).m34647();
        String strM34649 = ((C14270) c19929.m45858()).m34647();
        int iIndexOf2 = strM34649.indexOf(strM34648);
        c14270.m34621((iIndexOf2 == -1 || (iIndexOf = strM34649.indexOf(strM34647, (length = strM34648.length() + iIndexOf2))) == -1) ? "" : strM34649.substring(length, iIndexOf));
        c19929.m45857(c14270);
    }
}
