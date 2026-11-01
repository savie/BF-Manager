package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۘ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C3963 extends AbstractC15254 {
    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ܰ */
    public final int mo9739() {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_HEADER_ITEM;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo9738(C4669 c4669, C2718 c2718) {
        int iM52248 = c4669.m12876().m52248();
        C16665 c16665M12881 = c4669.m12881();
        C16665 c16665M12870 = c4669.m12870();
        int iM52249 = c16665M12881.m52248();
        int iMo14219 = (c16665M12870.mo14219() + c16665M12870.m52248()) - iM52249;
        int i = c4669.m12875().f22101;
        String str = "039";
        if (i < 28) {
            if (i >= 10000) {
                str = "040";
            } else if (i < 28) {
                str = i >= 26 ? "038" : i >= 24 ? "037" : "035";
            }
        }
        String strM38890 = C16523.m38890("dex\n", str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        if (c2718.m8288()) {
            c2718.m8283(8, "magic: " + new C17432(strM38890).m40637());
            c2718.m8283(4, "checksum");
            c2718.m8283(20, "signature");
            c2718.m8283(4, "file_size:       ".concat(C22475.m49978(c4669.m12868())));
            c2718.m8283(4, "header_size:     ".concat(C22475.m49978(UMErrorCode.E_UM_BE_DEFLATE_FAILED)));
            c2718.m8283(4, "endian_tag:      ".concat(C22475.m49978(305419896)));
            c2718.m8283(4, "link_size:       0");
            c2718.m8283(4, "link_off:        0");
            c2718.m8283(4, "map_off:         ".concat(C22475.m49978(iM52248)));
        }
        for (int i2 = 0; i2 < 8; i2++) {
            c2718.m8280(strM38890.charAt(i2));
        }
        c2718.m8281(24);
        c2718.m8289(c4669.m12868());
        c2718.m8289(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c2718.m8289(305419896);
        c2718.m8281(8);
        c2718.m8289(iM52248);
        c4669.m12886().m12267(c2718);
        c4669.m12877().m28603(c2718);
        c4669.m12888().m27802(c2718);
        c4669.m12889().m32496(c2718);
        c4669.m12884().m37946(c2718);
        c4669.m12869().m39787(c2718);
        if (c2718.m8288()) {
            c2718.m8283(4, "data_size:       ".concat(C22475.m49978(iMo14219)));
            c2718.m8283(4, "data_off:        ".concat(C22475.m49978(iM52249)));
        }
        c2718.m8289(iMo14219);
        c2718.m8289(iM52249);
    }
}
