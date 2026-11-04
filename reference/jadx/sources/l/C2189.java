package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Z3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2189 extends C17370 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6664 f7194;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f7195;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f7196;

    public C2189(C6664 c6664, HashMap map, HashMap map2) {
        this.f7194 = c6664;
        this.f7196 = map;
        this.f7195 = map2;
    }

    @Override // l.C17370
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7495(EnumC1114 enumC1114, int i, int i2, C23315 c23315) {
        switch (C11883.f38302[enumC1114.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (c23315.m52462().equals(this.f7194.f22223)) {
                    String str = c23315.m52460() + ":" + c23315.m52461();
                    this.f7196.remove(str);
                    C1443 c1443 = (C1443) this.f7195.get(str);
                    if (c1443 != null) {
                        c1443.f5058 = null;
                    }
                }
                break;
        }
    }
}
