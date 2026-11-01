package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Z3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17602 extends C6171 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11813 f55942;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f55943;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f55944;

    public C17602(C11813 c11813, HashMap map, HashMap map2) {
        this.f55942 = c11813;
        this.f55944 = map;
        this.f55943 = map2;
    }

    @Override // l.C6171
    /* JADX INFO: renamed from: ۙ */
    public final void mo8136(EnumC21815 enumC21815, int i, int i2, C9449 c9449) {
        switch (C6313.f21337[enumC21815.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (c9449.m24204().equals(this.f55942.f39682)) {
                    String str = c9449.m24202() + ":" + c9449.m24203();
                    this.f55944.remove(str);
                    C21690 c21690 = (C21690) this.f55943.get(str);
                    if (c21690 != null) {
                        c21690.f70368 = null;
                    }
                }
                break;
        }
    }
}
