package l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7MO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21635 implements InterfaceC20225 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f70163 = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f70164;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC13302 f70165 = new C11164();

    /* JADX WARN: Code duplicated, block: B:84:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x0161 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23047 m48351(Uri uri, C7648 c7648, List list, C6694 c6694, Map map, C14984 c14984) {
        InterfaceC10045 c11912;
        InterfaceC10045 interfaceC10045;
        boolean zMo2754;
        InterfaceC10045 c1327;
        boolean z;
        List listSingletonList;
        int i;
        InterfaceC13302 interfaceC13302;
        C7648 c7649 = c7648;
        int iM2178 = C0418.m2178(c7649.f25265);
        List list2 = (List) map.get("Content-Type");
        int iM2179 = C0418.m2178((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
        int iM2177 = C0418.m2177(uri);
        int i2 = 7;
        ArrayList arrayList = new ArrayList(7);
        m48347(arrayList, iM2178);
        m48347(arrayList, iM2179);
        m48347(arrayList, iM2177);
        for (int i3 = 0; i3 < 7; i3++) {
            m48347(arrayList, f70163[i3]);
        }
        c14984.mo19217();
        InterfaceC10045 interfaceC10046 = null;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i4)).intValue();
            try {
                if (iIntValue == 0) {
                    c11912 = new C11912();
                } else if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        c1327 = new C1327(0);
                    } else if (iIntValue != i2) {
                        InterfaceC13302 interfaceC13303 = InterfaceC13302.f44171;
                        if (iIntValue == 8) {
                            InterfaceC13302 interfaceC13304 = this.f70165;
                            boolean z2 = this.f70164;
                            C0987 c0987 = c7649.f25258;
                            if (c0987 == null) {
                                z = false;
                                break;
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= c0987.m3789()) {
                                    z = false;
                                    break;
                                }
                                InterfaceC22155 interfaceC22155M3793 = c0987.m3793(i5);
                                if (interfaceC22155M3793 instanceof C0801) {
                                    z = !((C0801) interfaceC22155M3793).f3399.isEmpty();
                                    break;
                                }
                                i5++;
                            }
                            int i6 = z ? 4 : 0;
                            if (z2) {
                                interfaceC13303 = interfaceC13304;
                            } else {
                                i6 |= 32;
                            }
                            c1327 = new C17618(interfaceC13303, i6, c6694, list != null ? list : AbstractC22433.of());
                        } else if (iIntValue != 11) {
                            c1327 = iIntValue != 13 ? null : new C6446(c7649.f25269, c6694, this.f70165, this.f70164);
                        } else {
                            InterfaceC13302 interfaceC13305 = this.f70165;
                            boolean z3 = this.f70164;
                            if (list != null) {
                                i = 48;
                                listSingletonList = list;
                            } else {
                                C10471 c10471 = new C10471();
                                c10471.m26533("application/cea-608");
                                listSingletonList = Collections.singletonList(c10471.m26497());
                                i = 16;
                            }
                            String str = c7649.f25277;
                            if (TextUtils.isEmpty(str)) {
                                interfaceC13302 = interfaceC13305;
                            } else {
                                interfaceC13302 = interfaceC13305;
                                if (C6632.m17987(str, "audio/mp4a-latm") == null) {
                                    i |= 2;
                                }
                                if (C6632.m17987(str, "video/avc") == null) {
                                    i |= 4;
                                }
                            }
                            if (!z3) {
                                interfaceC13302 = interfaceC13303;
                            }
                            c1327 = new C15130(2, !z3 ? 1 : 0, interfaceC13302, c6694, new C4149(i, listSingletonList));
                        }
                    } else {
                        c11912 = new C5624(0, 0L);
                    }
                    interfaceC10045 = c1327;
                    interfaceC10045.getClass();
                    zMo2754 = interfaceC10045.mo2754(c14984);
                    c14984.mo19217();
                    if (zMo2754) {
                        return new C23047(interfaceC10045, c7648, c6694, this.f70165, this.f70164);
                    }
                    if (interfaceC10046 != null && (iIntValue == iM2178 || iIntValue == iM2179 || iIntValue == iM2177 || iIntValue == 11)) {
                        interfaceC10046 = interfaceC10045;
                    }
                    i4++;
                    c7649 = c7648;
                    i2 = 7;
                } else {
                    c11912 = new C5561();
                }
                zMo2754 = interfaceC10045.mo2754(c14984);
                c14984.mo19217();
            } catch (EOFException unused) {
                c14984.mo19217();
                zMo2754 = false;
            } catch (Throwable th) {
                c14984.mo19217();
                throw th;
            }
            interfaceC10045 = c11912;
            interfaceC10045.getClass();
            if (zMo2754) {
                return new C23047(interfaceC10045, c7648, c6694, this.f70165, this.f70164);
            }
            if (interfaceC10046 != null) {
            }
            i4++;
            c7649 = c7648;
            i2 = 7;
        }
        interfaceC10046.getClass();
        return new C23047(interfaceC10046, c7648, c6694, this.f70165, this.f70164);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48347(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (f70163[i2] == i) {
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
    public final C21635 m48349(C11164 c11164) {
        this.f70165 = c11164;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21635 m48350(boolean z) {
        this.f70164 = z;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 m48348(C7648 c7648) {
        if (!this.f70164 || !this.f70165.mo4660(c7648)) {
            return c7648;
        }
        C10471 c10471M20201 = c7648.m20201();
        String str = c7648.f25277;
        c10471M20201.m26533("application/x-media3-cues");
        c10471M20201.m26532(this.f70165.mo4662(c7648));
        StringBuilder sb = new StringBuilder();
        sb.append(c7648.f25265);
        sb.append(str != null ? " ".concat(str) : "");
        c10471M20201.m26502(sb.toString());
        c10471M20201.m26500(C17492.FOREVER_NS);
        return c10471M20201.m26497();
    }
}
