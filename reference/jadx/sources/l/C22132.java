package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9IT7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22132 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 f71304;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17973[] f71305;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2551 f71306;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f71307;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22132 m50093(C2551 c2551) {
        int iM8518 = c2551.m8518();
        C22132 c22132 = new C22132(c2551, c2551.m8535(), new C17973[iM8518], new int[iM8518]);
        C6041 c6041M8517 = c2551.m8517();
        if (c6041M8517 != null) {
            c22132.m50096(c6041M8517);
        }
        Iterator it = c2551.m8526().iterator();
        while (it.hasNext()) {
            c22132.m50096((C6041) it.next());
        }
        return c22132;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22132 m50094(C22132 c22132, C21943 c21943) {
        C2551 c2551 = c22132.f71306;
        C17973[] c17973Arr = c22132.f71305;
        return new C22132(c2551, c21943, (C17973[]) Arrays.copyOf(c17973Arr, c17973Arr.length), c22132.f71307);
    }

    public C22132(C2551 c2551, C21943 c21943, C17973[] c17973Arr, int[] iArr) {
        this.f71306 = c2551;
        this.f71304 = c21943;
        this.f71305 = c17973Arr;
        this.f71307 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21943 m50097() {
        return this.f71304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17973 m50095(int i) {
        return this.f71305[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17973 m50096(C6041 c6041) {
        int iM17532 = c6041.m17532();
        int[] iArr = this.f71307;
        int i = iArr[iM17532];
        iArr[iM17532] = i + 1;
        C17973 c17973M8496 = this.f71306.m8496(iM17532, i, c6041);
        this.f71305[iM17532] = c17973M8496;
        return c17973M8496;
    }
}
