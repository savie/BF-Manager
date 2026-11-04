package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۤܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: OARO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11002 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f34748 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34749 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f34750;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC9510[] f34751;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0518[] f34752;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18417[] f34753;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f34754;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC16223 f34755;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34756;

    public C11002(EnumC16223 enumC16223, int i) {
        new LinkedHashMap();
        this.f34754 = new ArrayList();
        this.f34755 = enumC16223;
        this.f34756 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14907 m27845(AbstractC17715 abstractC17715, C2777 c2777) {
        C8020 c8020 = new C8020(this);
        C14907 c14907 = new C14907(new int[0]);
        c8020.m21888(abstractC17715, c2777 != null ? AbstractC12450.m30918(abstractC17715.f58206, c2777) : null, c14907, new HashSet(), new BitSet());
        return c14907;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14907 m27844(AbstractC17715 abstractC17715) {
        C14907 c14907 = abstractC17715.f58207;
        if (c14907 != null) {
            return c14907;
        }
        C14907 c14907M27845 = m27845(abstractC17715, (C2777) null);
        abstractC17715.f58207 = c14907M27845;
        c14907M27845.m35865();
        return abstractC17715.f58207;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC21445 m27846(int i) {
        ArrayList arrayList = this.f34749;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (AbstractC21445) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14907 m27843(int i, C2777 c2777) {
        if (i >= 0) {
            ArrayList arrayList = this.f34748;
            if (i < arrayList.size()) {
                C14907 c14907M27844 = m27844((AbstractC17715) arrayList.get(i));
                if (!c14907M27844.m35864(-2)) {
                    return c14907M27844;
                }
                C14907 c14907 = new C14907(new int[0]);
                c14907.m35860(c14907M27844);
                c14907.m35861();
                while (c2777 != null && c2777.f9156 >= 0 && c14907M27844.m35864(-2)) {
                    c14907M27844 = m27844(((C7976) ((AbstractC17715) arrayList.get(c2777.f9156)).m41478(0)).f26510);
                    c14907.m35860(c14907M27844);
                    c14907.m35861();
                    c2777 = c2777.f9157;
                }
                if (c14907M27844.m35864(-2)) {
                    c14907.m35858(-1);
                }
                return c14907;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }
}
