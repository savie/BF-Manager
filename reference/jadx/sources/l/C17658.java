package l;

/* JADX INFO: renamed from: l.ܿ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5YJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17658 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        int length;
        int iIndexOf;
        C14277 c14277 = new C14277();
        String strM34493 = ((C14277) c15313.m36673()).m34493();
        String strM34494 = ((C14277) c15313.m36673()).m34493();
        String strM34495 = ((C14277) c15313.m36673()).m34493();
        int iIndexOf2 = strM34495.indexOf(strM34494);
        c14277.m34466((iIndexOf2 == -1 || (iIndexOf = strM34495.indexOf(strM34493, (length = strM34494.length() + iIndexOf2))) == -1) ? "" : strM34495.substring(length, iIndexOf));
        c15313.m36672(c14277);
    }
}
