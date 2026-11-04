package l;

/* JADX INFO: renamed from: l.ۙ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BJ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4538 extends C12763 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4538 f16134 = new C4538(0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4538 m14269(C4538 c4538, C4538 c4539) {
        int size = c4538.size();
        if (size != c4539.size()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C4538 c45310 = new C4538(size);
        for (int i = 0; i < size; i++) {
            C14011 c14011 = (C14011) c4538.m31593(i);
            C14011 c14012 = (C14011) c4539.m31593(i);
            C14011 c14013 = new C14011();
            c14013.m34104(c14011);
            c14013.m34104(c14012);
            c14013.mo15005();
            c14013.m46488();
            c45310.m31596(i, (Object) c14013);
        }
        c45310.mo15005();
        return c45310;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14270(int i, C14011 c14011) {
        c14011.m46488();
        m31596(i, (Object) c14011);
    }
}
