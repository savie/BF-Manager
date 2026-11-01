package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩶۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8Q6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20048 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f64186 = new C2460();

    @Override // l.InterfaceC6951
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC9753 mo11108(int i, int i2, byte[] bArr) {
        return C22474.m49977(this, bArr, i2);
    }

    @Override // l.InterfaceC6951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11109(byte[] bArr, int i, int i2, C4128 c4128, InterfaceC1008 interfaceC1008) {
        C0612 c0612M45996;
        C2460 c2460 = this.f64186;
        c2460.m7508(i2 + i, bArr);
        c2460.m7510(i);
        ArrayList arrayList = new ArrayList();
        while (c2460.m7503() > 0) {
            C2023.m6506("Incomplete Mp4Webvtt Top Level box header found.", c2460.m7503() >= 8);
            int iM7499 = c2460.m7499();
            if (c2460.m7499() == 1987343459) {
                int i3 = iM7499 - 8;
                CharSequence charSequenceM5645 = null;
                C20369 c20369M5649 = null;
                while (i3 > 0) {
                    C2023.m6506("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM74910 = c2460.m7499();
                    int iM74911 = c2460.m7499();
                    int i4 = iM74910 - 8;
                    byte[] bArrM7518 = c2460.m7518();
                    int iM7500 = c2460.m7500();
                    String str = C17983.f57504;
                    String str2 = new String(bArrM7518, iM7500, i4, StandardCharsets.UTF_8);
                    c2460.m7535(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM74911 == 1937011815) {
                        c20369M5649 = C1702.m5649(str2);
                    } else if (iM74911 == 1885436268) {
                        charSequenceM5645 = C1702.m5645((String) null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM5645 == null) {
                    charSequenceM5645 = "";
                }
                if (c20369M5649 != null) {
                    c20369M5649.m46002(charSequenceM5645);
                    c0612M45996 = c20369M5649.m45996();
                } else {
                    Pattern pattern = C1702.f6726;
                    C14404 c14404 = new C14404();
                    c14404.f47223 = charSequenceM5645;
                    c0612M45996 = c14404.m34671().m45996();
                }
                arrayList.add(c0612M45996);
            } else {
                c2460.m7535(iM7499 - 8);
            }
        }
        interfaceC1008.accept(new C17513(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
