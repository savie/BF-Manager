package l;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes.dex */
public final class C22891 implements InterfaceC2428 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f74434;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15130 f74436;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11634 f74437 = new C11634(new byte[5], 5);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SparseArray f74435 = new SparseArray();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f74433 = new SparseIntArray();

    @Override // l.InterfaceC2428
    /* JADX INFO: renamed from: ۙ */
    public final void mo7415(C6694 c6694, InterfaceC15690 interfaceC15690, C8074 c8074) {
    }

    public C22891(C15130 c15130, int i) {
        this.f74436 = c15130;
        this.f74434 = i;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    @Override // l.InterfaceC2428
    /* JADX INFO: renamed from: ۙ */
    public final void mo7414(C2460 c2460) {
        C6694 c6694;
        C6694 c6695;
        int i;
        C11634 c11634;
        InterfaceC19363 interfaceC19363M11795;
        C6694 c6696;
        int i2;
        if (c2460.m7516() == 2) {
            C15130 c15130 = this.f74436;
            int i3 = 0;
            if (c15130.f49422 == 1 || c15130.f49422 == 2 || c15130.f49435 == 1) {
                c6694 = (C6694) c15130.f49436.get(0);
            } else {
                c6694 = new C6694(((C6694) c15130.f49436.get(0)).m18071());
                c15130.f49436.add(c6694);
            }
            if ((c2460.m7516() & 128) != 0) {
                c2460.m7535(1);
                int iM7519 = c2460.m7519();
                int i4 = 3;
                c2460.m7535(3);
                C11634 c11635 = this.f74437;
                c2460.m7507(0, 2, c11635.f39082);
                c11635.m29029(0);
                c11635.m29034(3);
                int i5 = 13;
                c15130.f49427 = c11635.m29039(13);
                c2460.m7507(0, 2, c11635.f39082);
                c11635.m29029(0);
                int i6 = 4;
                c11635.m29034(4);
                int i7 = 12;
                c2460.m7535(c11635.m29039(12));
                if (c15130.f49422 == 2 && c15130.f49440 == null) {
                    c15130.f49440 = ((C4149) c15130.f49424).m11795(21, new C17951(21, null, 0, null, C17983.f57507));
                    if (c15130.f49440 != null) {
                        c15130.f49440.mo6528(c6694, c15130.f49433, new C8074(iM7519, 21, 8192));
                    }
                }
                SparseArray sparseArray = this.f74435;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.f74433;
                sparseIntArray.clear();
                int iM7503 = c2460.m7503();
                while (iM7503 > 0) {
                    int i8 = 5;
                    c2460.m7507(i3, 5, c11635.f39082);
                    c11635.m29029(i3);
                    int iM29039 = c11635.m29039(8);
                    c11635.m29034(i4);
                    int iM290310 = c11635.m29039(i5);
                    c11635.m29034(i6);
                    int iM290311 = c11635.m29039(i7);
                    int iM7500 = c2460.m7500();
                    int i9 = iM7500 + iM290311;
                    int i10 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iM7516 = 0;
                    while (true) {
                        if (c2460.m7500() >= i9) {
                            c11634 = c11635;
                            break;
                        }
                        int iM7517 = c2460.m7516();
                        c11634 = c11635;
                        int iM7501 = c2460.m7500() + c2460.m7516();
                        if (iM7501 > i9) {
                            break;
                        }
                        if (iM7517 == i8) {
                            long jM7532 = c2460.m7532();
                            if (jM7532 == 1094921523) {
                                i10 = 129;
                            } else if (jM7532 == 1161904947) {
                                i10 = 135;
                            } else if (jM7532 == 1094921524) {
                                i10 = 172;
                            } else if (jM7532 == 1212503619) {
                                i10 = 36;
                            }
                            c6696 = c6694;
                            i2 = iM7519;
                        } else if (iM7517 == 106) {
                            c6696 = c6694;
                            i2 = iM7519;
                            i10 = 129;
                        } else if (iM7517 == 122) {
                            c6696 = c6694;
                            i2 = iM7519;
                            i10 = 135;
                        } else {
                            if (iM7517 == 127) {
                                int iM7518 = c2460.m7516();
                                if (iM7518 == 21) {
                                    i10 = 172;
                                } else if (iM7518 == 14) {
                                    i10 = 136;
                                } else if (iM7518 == 33) {
                                    i10 = 139;
                                }
                            } else if (iM7517 == 123) {
                                c6696 = c6694;
                                i2 = iM7519;
                                i10 = 138;
                            } else if (iM7517 == 10) {
                                strTrim = c2460.m7505(3, StandardCharsets.UTF_8).trim();
                                iM7516 = c2460.m7516();
                            } else if (iM7517 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c2460.m7500() < iM7501) {
                                    String strTrim2 = c2460.m7505(3, StandardCharsets.UTF_8).trim();
                                    c2460.m7516();
                                    C6694 c6697 = c6694;
                                    byte[] bArr = new byte[4];
                                    c2460.m7507(0, 4, bArr);
                                    arrayList2.add(new C21479(strTrim2, bArr));
                                    c6694 = c6697;
                                    iM7519 = iM7519;
                                }
                                c6696 = c6694;
                                i2 = iM7519;
                                arrayList = arrayList2;
                                i10 = 89;
                            } else {
                                c6696 = c6694;
                                i2 = iM7519;
                                if (iM7517 == 111) {
                                    i10 = 257;
                                }
                            }
                            c6696 = c6694;
                            i2 = iM7519;
                        }
                        c2460.m7535(iM7501 - c2460.m7500());
                        i8 = 5;
                        c6694 = c6696;
                        c11635 = c11634;
                        iM7519 = i2;
                    }
                    c2460.m7510(i9);
                    C17951 c17951 = new C17951(i10, strTrim, iM7516, arrayList, Arrays.copyOfRange(c2460.m7518(), iM7500, i9));
                    if (iM29039 == 6 || iM29039 == 5) {
                        iM29039 = i10;
                    }
                    iM7503 -= iM290311 + 5;
                    int i11 = c15130.f49422 == 2 ? iM29039 : iM290310;
                    if (!c15130.f49437.get(i11)) {
                        if (c15130.f49422 == 2 && iM29039 == 21) {
                            interfaceC19363M11795 = c15130.f49440;
                        } else {
                            interfaceC19363M11795 = ((C4149) c15130.f49424).m11795(iM29039, c17951);
                        }
                        if (c15130.f49422 != 2 || iM290310 < sparseIntArray.get(i11, 8192)) {
                            sparseIntArray.put(i11, iM290310);
                            sparseArray.put(i11, interfaceC19363M11795);
                        }
                    }
                    i3 = 0;
                    i4 = 3;
                    i5 = 13;
                    i6 = 4;
                    i7 = 12;
                    c6694 = c6694;
                    c11635 = c11634;
                    iM7519 = iM7519;
                }
                C6694 c6698 = c6694;
                int i12 = iM7519;
                int size = sparseIntArray.size();
                int i13 = 0;
                while (i13 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i13);
                    int iValueAt = sparseIntArray.valueAt(i13);
                    c15130.f49437.put(iKeyAt, true);
                    c15130.f49429.put(iValueAt, true);
                    InterfaceC19363 interfaceC19363 = (InterfaceC19363) sparseArray.valueAt(i13);
                    if (interfaceC19363 != null) {
                        if (interfaceC19363 != c15130.f49440) {
                            InterfaceC15690 interfaceC15690 = c15130.f49433;
                            i = i12;
                            C8074 c8074 = new C8074(i, iKeyAt, 8192);
                            c6695 = c6698;
                            interfaceC19363.mo6528(c6695, interfaceC15690, c8074);
                        } else {
                            c6695 = c6698;
                            i = i12;
                        }
                        c15130.f49428.put(iValueAt, interfaceC19363);
                    } else {
                        c6695 = c6698;
                        i = i12;
                    }
                    i13++;
                    c6698 = c6695;
                    i12 = i;
                }
                if (c15130.f49422 == 2) {
                    if (c15130.f49438) {
                        return;
                    }
                    c15130.f49433.mo7696();
                    c15130.f49435 = 0;
                    c15130.f49438 = true;
                    return;
                }
                c15130.f49428.remove(this.f74434);
                c15130.f49435 = c15130.f49422 == 1 ? 0 : c15130.f49435 - 1;
                if (c15130.f49435 == 0) {
                    c15130.f49433.mo7696();
                    c15130.f49438 = true;
                }
            }
        }
    }
}
