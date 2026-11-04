package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R6HA */
/* JADX INFO: loaded from: classes.dex */
public final class C23668 implements InterfaceC2704 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f76758;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6514 f76759;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76760;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20684 f76761;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76762;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C25160 f76763;

    public C23668(C6514 c6514) {
        this.f76759 = c6514;
    }

    public final String toString() {
        return this.f76761.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20684 m52904() {
        return this.f76761;
    }

    @Override // l.InterfaceC2704
    /* JADX INFO: renamed from: ۤ */
    public final C20684 mo8888() {
        return this.f76761;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52906(C20684 c20684) {
        this.f76761 = c20684;
    }

    @Override // l.InterfaceC2704
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8889() {
        return this.f76758;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52905(int i) {
        this.f76758 = i;
    }

    @Override // l.InterfaceC2704
    /* JADX INFO: renamed from: ᩸ */
    public final C25160 mo8890() {
        return this.f76763;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52907(C25160 c25160) {
        this.f76763 = c25160;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52909(int i) {
        this.f76762 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m52908(int i) {
        this.f76760 = i;
    }

    @Override // l.InterfaceC2704
    public final ArrayList getAttributes() {
        ArrayList arrayList = new ArrayList();
        int i = this.f76762;
        C6514 c6514 = this.f76759;
        C2039.m7013(arrayList, c6514.m18379(i));
        C23786 c23786M53056 = C23786.m53056(c6514.m18385(this.f76760));
        if (c23786M53056 != null) {
            arrayList.add(c23786M53056);
        }
        return arrayList;
    }
}
