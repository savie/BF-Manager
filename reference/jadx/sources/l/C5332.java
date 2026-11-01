package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes3.dex */
public final class C5332 extends AbstractC13613 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15606[] f18401;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f18402;

    @Override // l.InterfaceC12078
    public final int[] getStyle() {
        return null;
    }

    public C5332(String str, C15606[] c15606Arr) {
        this.f18402 = str;
        this.f18401 = (C15606[]) Arrays.copyOf(c15606Arr, c15606Arr.length);
    }

    @Override // l.InterfaceC12078
    public final String getValue() {
        return this.f18402;
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ֡ۙ */
    public final C15606[] mo11444() {
        C15606[] c15606Arr = this.f18401;
        if (c15606Arr == null) {
            return null;
        }
        return (C15606[]) Arrays.copyOf(c15606Arr, c15606Arr.length);
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ۢۙ */
    public final C15606[] mo11446() {
        return m33291(mo11444());
    }

    @Override // l.InterfaceC12078
    /* JADX INFO: renamed from: ֫ۙ */
    public final boolean mo11445() {
        C15606[] c15606Arr = this.f18401;
        return c15606Arr != null && c15606Arr.length > 0;
    }
}
