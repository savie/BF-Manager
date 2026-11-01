package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܺ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OARO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16233 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C6789[] f52363;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f52364;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52365 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52366 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52367;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC18433[] f52368;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f52369;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC9883 f52370;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3966[] f52371;

    public C16233(EnumC9883 enumC9883, int i) {
        new LinkedHashMap();
        this.f52367 = new ArrayList();
        this.f52370 = enumC9883;
        this.f52364 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0875 m38342(AbstractC2120 abstractC2120, C8472 c8472) {
        C22667 c22667 = new C22667(this);
        C0875 c0875 = new C0875(new int[0]);
        c22667.m50199(abstractC2120, c8472 != null ? AbstractC11729.m29309(abstractC2120.f7774, c8472) : null, c0875, new HashSet(), new BitSet());
        return c0875;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0875 m38341(AbstractC2120 abstractC2120) {
        C0875 c0875 = abstractC2120.f7776;
        if (c0875 != null) {
            return c0875;
        }
        C0875 c0875M38342 = m38342(abstractC2120, (C8472) null);
        abstractC2120.f7776 = c0875M38342;
        c0875M38342.m3499();
        return abstractC2120.f7776;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12789 m38343(int i) {
        ArrayList arrayList = this.f52366;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (AbstractC12789) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0875 m38340(int i, C8472 c8472) {
        if (i >= 0) {
            ArrayList arrayList = this.f52365;
            if (i < arrayList.size()) {
                C0875 c0875M38341 = m38341((AbstractC2120) arrayList.get(i));
                if (!c0875M38341.m3508(-2)) {
                    return c0875M38341;
                }
                C0875 c0875 = new C0875(new int[0]);
                c0875.m3504(c0875M38341);
                c0875.m3506();
                while (c8472 != null && c8472.f29377 >= 0 && c0875M38341.m3508(-2)) {
                    c0875M38341 = m38341(((C23018) ((AbstractC2120) arrayList.get(c8472.f29377)).m6671(0)).f74809);
                    c0875.m3504(c0875M38341);
                    c0875.m3506();
                    c8472 = c8472.f29378;
                }
                if (c0875M38341.m3508(-2)) {
                    c0875.m3502(-1);
                }
                return c0875;
            }
        }
        throw new IllegalArgumentException("Invalid state number.");
    }
}
