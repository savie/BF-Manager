package l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7MO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7028 implements InterfaceC1612 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f23180 = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23181;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC1272 f23182 = new C3509();

    /* JADX WARN: Code duplicated, block: B:84:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x0161 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2553 m19343(Uri uri, C15648 c15648, List list, C1150 c1150, Map map, C9169 c9169) {
        InterfaceC22486 c18054;
        InterfaceC22486 interfaceC22486;
        boolean zMo2294;
        InterfaceC22486 c9849;
        boolean z;
        List listSingletonList;
        int i;
        InterfaceC1272 interfaceC1272;
        C15648 c15649 = c15648;
        int iM33907 = C13923.m33907(c15649.f50848);
        List list2 = (List) map.get("Content-Type");
        int iM33908 = C13923.m33907((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
        int iM33905 = C13923.m33905(uri);
        int i2 = 7;
        ArrayList arrayList = new ArrayList(7);
        m19342(arrayList, iM33907);
        m19342(arrayList, iM33908);
        m19342(arrayList, iM33905);
        for (int i3 = 0; i3 < 7; i3++) {
            m19342(arrayList, f23180[i3]);
        }
        c9169.mo10076();
        InterfaceC22486 interfaceC22487 = null;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i4)).intValue();
            try {
                if (iIntValue == 0) {
                    c18054 = new C18054();
                } else if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        c9849 = new C9849(0);
                    } else if (iIntValue != i2) {
                        InterfaceC1272 interfaceC1273 = InterfaceC1272.f4579;
                        if (iIntValue == 8) {
                            InterfaceC1272 interfaceC1274 = this.f23182;
                            boolean z2 = this.f23181;
                            C19378 c19378 = c15649.f50812;
                            if (c19378 == null) {
                                z = false;
                                break;
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= c19378.m44819()) {
                                    z = false;
                                    break;
                                }
                                InterfaceC8191 interfaceC8191M44820 = c19378.m44820(i5);
                                if (interfaceC8191M44820 instanceof C9814) {
                                    z = !((C9814) interfaceC8191M44820).f31618.isEmpty();
                                    break;
                                }
                                i5++;
                            }
                            int i6 = z ? 4 : 0;
                            if (z2) {
                                interfaceC1273 = interfaceC1274;
                            } else {
                                i6 |= 32;
                            }
                            c9849 = new C16231(interfaceC1273, i6, c1150, list != null ? list : AbstractC1928.of());
                        } else if (iIntValue != 11) {
                            c9849 = iIntValue != 13 ? null : new C9068(c15649.f50811, c1150, this.f23182, this.f23181);
                        } else {
                            InterfaceC1272 interfaceC1275 = this.f23182;
                            boolean z3 = this.f23181;
                            if (list != null) {
                                i = 48;
                                listSingletonList = list;
                            } else {
                                C20124 c20124 = new C20124();
                                c20124.m46315("application/cea-608");
                                listSingletonList = Collections.singletonList(c20124.m46295());
                                i = 16;
                            }
                            String str = c15649.f50836;
                            if (TextUtils.isEmpty(str)) {
                                interfaceC1272 = interfaceC1275;
                            } else {
                                interfaceC1272 = interfaceC1275;
                                if (C9681.m25262(str, "audio/mp4a-latm") == null) {
                                    i |= 2;
                                }
                                if (C9681.m25262(str, "video/avc") == null) {
                                    i |= 4;
                                }
                            }
                            if (!z3) {
                                interfaceC1272 = interfaceC1273;
                            }
                            c9849 = new C7370(2, !z3 ? 1 : 0, interfaceC1272, c1150, new C9103(i, listSingletonList));
                        }
                    } else {
                        c18054 = new C8006(0, 0L);
                    }
                    interfaceC22486 = c9849;
                    interfaceC22486.getClass();
                    zMo2294 = interfaceC22486.mo2294(c9169);
                    c9169.mo10076();
                    if (zMo2294) {
                        return new C2553(interfaceC22486, c15648, c1150, this.f23182, this.f23181);
                    }
                    if (interfaceC22487 != null && (iIntValue == iM33907 || iIntValue == iM33908 || iIntValue == iM33905 || iIntValue == 11)) {
                        interfaceC22487 = interfaceC22486;
                    }
                    i4++;
                    c15649 = c15648;
                    i2 = 7;
                } else {
                    c18054 = new C7613();
                }
                zMo2294 = interfaceC22486.mo2294(c9169);
                c9169.mo10076();
            } catch (EOFException unused) {
                c9169.mo10076();
                zMo2294 = false;
            } catch (Throwable th) {
                c9169.mo10076();
                throw th;
            }
            interfaceC22486 = c18054;
            interfaceC22486.getClass();
            if (zMo2294) {
                return new C2553(interfaceC22486, c15648, c1150, this.f23182, this.f23181);
            }
            if (interfaceC22487 != null) {
            }
            i4++;
            c15649 = c15648;
            i2 = 7;
        }
        interfaceC22487.getClass();
        return new C2553(interfaceC22487, c15648, c1150, this.f23182, this.f23181);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m19342(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (f23180[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7028 m19344(C3509 c3509) {
        this.f23182 = c3509;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7028 m19345(boolean z) {
        this.f23181 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15648 m19346(C15648 c15648) {
        if (!this.f23181 || !this.f23182.mo4645(c15648)) {
            return c15648;
        }
        C20124 c20124M37397 = c15648.m37397();
        String str = c15648.f50836;
        c20124M37397.m46315("application/x-media3-cues");
        c20124M37397.m46314(this.f23182.mo4647(c15648));
        StringBuilder sb = new StringBuilder();
        sb.append(c15648.f50848);
        sb.append(str != null ? " ".concat(str) : "");
        c20124M37397.m46300(sb.toString());
        c20124M37397.m46298(C25227.FOREVER_NS);
        return c20124M37397.m46295();
    }
}
