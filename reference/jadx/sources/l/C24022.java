package l;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O8UA */
/* JADX INFO: loaded from: classes.dex */
public final class C24022 implements InterfaceC2763 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21287 f77739 = new C21287();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24768 f77738 = new C24768();

    @Override // l.InterfaceC2763
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC24393 mo5929(int i, int i2, byte[] bArr) {
        return C19171.m44438(this, bArr, i2);
    }

    @Override // l.InterfaceC2763
    /* JADX INFO: renamed from: ۙ */
    public final void mo5930(byte[] bArr, int i, int i2, C9474 c9474, InterfaceC8103 interfaceC8103) {
        C17308 c17308M17682;
        C21287 c21287 = this.f77739;
        c21287.m48491(i2 + i, bArr);
        c21287.m48510(i);
        ArrayList arrayList = new ArrayList();
        try {
            C3884.m12523(c21287);
            while (!TextUtils.isEmpty(c21287.m48515(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                byte b = -1;
                int iM48516 = 0;
                while (b == -1) {
                    iM48516 = c21287.m48516();
                    String strM48515 = c21287.m48515(StandardCharsets.UTF_8);
                    if (strM48515 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strM48515)) {
                        b = 2;
                    } else {
                        b = strM48515.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                c21287.m48510(iM48516);
                if (b == 0) {
                    C20663.m47290(new C21038(arrayList2), c9474, interfaceC8103);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(c21287.m48515(StandardCharsets.UTF_8))) {
                    }
                } else if (b == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    c21287.m48515(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f77738.m55289(c21287));
                } else if (b == 3 && (c17308M17682 = C6122.m17682(c21287, arrayList)) != null) {
                    arrayList2.add(c17308M17682);
                }
            }
        } catch (C2970 e) {
            throw new IllegalArgumentException(e);
        }
    }
}
