package l;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۠ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9465 implements InterfaceC6951 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2460 f32023 = new C2460();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0291 f32022 = new C0291();

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
        C12287 c12287M5648;
        C2460 c2460 = this.f32023;
        c2460.m7508(i2 + i, bArr);
        c2460.m7510(i);
        ArrayList arrayList = new ArrayList();
        try {
            C3113.m9340(c2460);
            while (!TextUtils.isEmpty(c2460.m7523(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b = -1;
                int iM7500 = 0;
                while (b == -1) {
                    iM7500 = c2460.m7500();
                    String strM7523 = c2460.m7523(StandardCharsets.UTF_8);
                    if (strM7523 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strM7523)) {
                        b = 2;
                    } else {
                        b = strM7523.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                c2460.m7510(iM7500);
                if (b == 0) {
                    C23864.m52591(new C14029(arrayList2), c4128, interfaceC1008);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(c2460.m7523(StandardCharsets.UTF_8))) {
                    }
                } else if (b == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    c2460.m7523(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f32022.m1819(c2460));
                } else if (b == 3 && (c12287M5648 = C1702.m5648(c2460, arrayList)) != null) {
                    arrayList2.add(c12287M5648);
                }
            }
        } catch (C22861 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
