package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩻ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes.dex */
public final class C25091 extends AbstractC16139 {
    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_HEADER_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        int iM23364 = c10918.m27702().m23364();
        C19123 c19123M27699 = c10918.m27699();
        C19123 c19123M27693 = c10918.m27693();
        int iM23365 = c19123M27699.m23364();
        int iMo23358 = (c19123M27693.mo23358() + c19123M27693.m23364()) - iM23365;
        int i = c10918.m27709().f53790;
        String str = "039";
        if (i < 28) {
            if (i >= 10000) {
                str = "040";
            } else if (i < 28) {
                str = i >= 26 ? "038" : i >= 24 ? "037" : "035";
            }
        }
        String strM34865 = C14442.m34865("dex\n", str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        if (c15000.m36116()) {
            c15000.m36111(8, "magic: " + new C9976(strM34865).m25818());
            c15000.m36111(4, "checksum");
            c15000.m36111(20, "signature");
            c15000.m36111(4, "file_size:       ".concat(C5306.m15938(c10918.m27704())));
            c15000.m36111(4, "header_size:     ".concat(C5306.m15938(UMErrorCode.E_UM_BE_DEFLATE_FAILED)));
            c15000.m36111(4, "endian_tag:      ".concat(C5306.m15938(305419896)));
            c15000.m36111(4, "link_size:       0");
            c15000.m36111(4, "link_off:        0");
            c15000.m36111(4, "map_off:         ".concat(C5306.m15938(iM23364)));
        }
        for (int i2 = 0; i2 < 8; i2++) {
            c15000.m36129(strM34865.charAt(i2));
        }
        c15000.m36109(24);
        c15000.m36124(c10918.m27704());
        c15000.m36124(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c15000.m36124(305419896);
        c15000.m36109(8);
        c15000.m36124(iM23364);
        c10918.m27714().m28067(c15000);
        c10918.m27694().m46186(c15000);
        c10918.m27708().m9036(c15000);
        c10918.m27705().m29338(c15000);
        c10918.m27707().m42874(c15000);
        c10918.m27713().m3719(c15000);
        if (c15000.m36116()) {
            c15000.m36111(4, "data_size:       ".concat(C5306.m15938(iMo23358)));
            c15000.m36111(4, "data_off:        ".concat(C5306.m15938(iM23365)));
        }
        c15000.m36124(iMo23358);
        c15000.m36124(iM23365);
    }
}
