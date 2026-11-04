package l;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۠᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C8861 implements InterfaceC0658 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28950;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7370 f28951;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14573 f28953 = new C14573(new byte[5], 5);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SparseArray f28952 = new SparseArray();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f28954 = new SparseIntArray();

    @Override // l.InterfaceC0658
    /* JADX INFO: renamed from: ۙ */
    public final void mo2878(C1150 c1150, InterfaceC12789 interfaceC12789, C10857 c10857) {
    }

    public C8861(C7370 c7370, int i) {
        this.f28951 = c7370;
        this.f28950 = i;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x017e  */
    @Override // l.InterfaceC0658
    /* JADX INFO: renamed from: ۙ */
    public final void mo2879(C21287 c21287) {
        C1150 c1150;
        C1150 c1151;
        int i;
        C14573 c14573;
        InterfaceC22792 interfaceC22792M24254;
        C1150 c1152;
        int i2;
        if (c21287.m48493() == 2) {
            C7370 c7370 = this.f28951;
            int i3 = 0;
            if (c7370.f24251 == 1 || c7370.f24251 == 2 || c7370.f24254 == 1) {
                c1150 = (C1150) c7370.f24253.get(0);
            } else {
                c1150 = new C1150(((C1150) c7370.f24253.get(0)).m4243());
                c7370.f24253.add(c1150);
            }
            if ((c21287.m48493() & 128) != 0) {
                c21287.m48503(1);
                int iM48494 = c21287.m48494();
                int i4 = 3;
                c21287.m48503(3);
                C14573 c14574 = this.f28953;
                c21287.m48490(0, 2, c14574.f45926);
                c14574.m35167(0);
                c14574.m35161(3);
                int i5 = 13;
                c7370.f24249 = c14574.m35163(13);
                c21287.m48490(0, 2, c14574.f45926);
                c14574.m35167(0);
                int i6 = 4;
                c14574.m35161(4);
                int i7 = 12;
                c21287.m48503(c14574.m35163(12));
                if (c7370.f24251 == 2 && c7370.f24252 == null) {
                    c7370.f24252 = ((C9103) c7370.f24243).m24254(21, new C4892(21, null, 0, null, C7116.f23453));
                    if (c7370.f24252 != null) {
                        c7370.f24252.mo18563(c1150, c7370.f24246, new C10857(iM48494, 21, 8192));
                    }
                }
                SparseArray sparseArray = this.f28952;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.f28954;
                sparseIntArray.clear();
                int iM48486 = c21287.m48486();
                while (iM48486 > 0) {
                    int i8 = 5;
                    c21287.m48490(i3, 5, c14574.f45926);
                    c14574.m35167(i3);
                    int iM35163 = c14574.m35163(8);
                    c14574.m35161(i4);
                    int iM35164 = c14574.m35163(i5);
                    c14574.m35161(i6);
                    int iM35165 = c14574.m35163(i7);
                    int iM48516 = c21287.m48516();
                    int i9 = iM48516 + iM35165;
                    int i10 = -1;
                    String strTrim = null;
                    ArrayList arrayList = null;
                    int iM48493 = 0;
                    while (true) {
                        if (c21287.m48516() >= i9) {
                            c14573 = c14574;
                            break;
                        }
                        int iM48495 = c21287.m48493();
                        c14573 = c14574;
                        int iM48517 = c21287.m48516() + c21287.m48493();
                        if (iM48517 > i9) {
                            break;
                        }
                        if (iM48495 == i8) {
                            long jM48485 = c21287.m48485();
                            if (jM48485 == 1094921523) {
                                i10 = 129;
                            } else if (jM48485 == 1161904947) {
                                i10 = 135;
                            } else if (jM48485 == 1094921524) {
                                i10 = 172;
                            } else if (jM48485 == 1212503619) {
                                i10 = 36;
                            }
                            c1152 = c1150;
                            i2 = iM48494;
                        } else if (iM48495 == 106) {
                            c1152 = c1150;
                            i2 = iM48494;
                            i10 = 129;
                        } else if (iM48495 == 122) {
                            c1152 = c1150;
                            i2 = iM48494;
                            i10 = 135;
                        } else {
                            if (iM48495 == 127) {
                                int iM48496 = c21287.m48493();
                                if (iM48496 == 21) {
                                    i10 = 172;
                                } else if (iM48496 == 14) {
                                    i10 = 136;
                                } else if (iM48496 == 33) {
                                    i10 = 139;
                                }
                            } else if (iM48495 == 123) {
                                c1152 = c1150;
                                i2 = iM48494;
                                i10 = 138;
                            } else if (iM48495 == 10) {
                                strTrim = c21287.m48488(3, StandardCharsets.UTF_8).trim();
                                iM48493 = c21287.m48493();
                            } else if (iM48495 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (c21287.m48516() < iM48517) {
                                    String strTrim2 = c21287.m48488(3, StandardCharsets.UTF_8).trim();
                                    c21287.m48493();
                                    C1150 c1153 = c1150;
                                    byte[] bArr = new byte[4];
                                    c21287.m48490(0, 4, bArr);
                                    arrayList2.add(new C14081(strTrim2, bArr));
                                    c1150 = c1153;
                                    iM48494 = iM48494;
                                }
                                c1152 = c1150;
                                i2 = iM48494;
                                arrayList = arrayList2;
                                i10 = 89;
                            } else {
                                c1152 = c1150;
                                i2 = iM48494;
                                if (iM48495 == 111) {
                                    i10 = 257;
                                }
                            }
                            c1152 = c1150;
                            i2 = iM48494;
                        }
                        c21287.m48503(iM48517 - c21287.m48516());
                        i8 = 5;
                        c1150 = c1152;
                        c14574 = c14573;
                        iM48494 = i2;
                    }
                    c21287.m48510(i9);
                    C4892 c4892 = new C4892(i10, strTrim, iM48493, arrayList, Arrays.copyOfRange(c21287.m48497(), iM48516, i9));
                    if (iM35163 == 6 || iM35163 == 5) {
                        iM35163 = i10;
                    }
                    iM48486 -= iM35165 + 5;
                    int i11 = c7370.f24251 == 2 ? iM35163 : iM35164;
                    if (!c7370.f24260.get(i11)) {
                        if (c7370.f24251 == 2 && iM35163 == 21) {
                            interfaceC22792M24254 = c7370.f24252;
                        } else {
                            interfaceC22792M24254 = ((C9103) c7370.f24243).m24254(iM35163, c4892);
                        }
                        if (c7370.f24251 != 2 || iM35164 < sparseIntArray.get(i11, 8192)) {
                            sparseIntArray.put(i11, iM35164);
                            sparseArray.put(i11, interfaceC22792M24254);
                        }
                    }
                    i3 = 0;
                    i4 = 3;
                    i5 = 13;
                    i6 = 4;
                    i7 = 12;
                    c1150 = c1150;
                    c14574 = c14573;
                    iM48494 = iM48494;
                }
                C1150 c1154 = c1150;
                int i12 = iM48494;
                int size = sparseIntArray.size();
                int i13 = 0;
                while (i13 < size) {
                    int iKeyAt = sparseIntArray.keyAt(i13);
                    int iValueAt = sparseIntArray.valueAt(i13);
                    c7370.f24260.put(iKeyAt, true);
                    c7370.f24244.put(iValueAt, true);
                    InterfaceC22792 interfaceC22792 = (InterfaceC22792) sparseArray.valueAt(i13);
                    if (interfaceC22792 != null) {
                        if (interfaceC22792 != c7370.f24252) {
                            InterfaceC12789 interfaceC12789 = c7370.f24246;
                            i = i12;
                            C10857 c10857 = new C10857(i, iKeyAt, 8192);
                            c1151 = c1154;
                            interfaceC22792.mo18563(c1151, interfaceC12789, c10857);
                        } else {
                            c1151 = c1154;
                            i = i12;
                        }
                        c7370.f24261.put(iValueAt, interfaceC22792);
                    } else {
                        c1151 = c1154;
                        i = i12;
                    }
                    i13++;
                    c1154 = c1151;
                    i12 = i;
                }
                if (c7370.f24251 == 2) {
                    if (c7370.f24257) {
                        return;
                    }
                    c7370.f24246.mo16661();
                    c7370.f24254 = 0;
                    c7370.f24257 = true;
                    return;
                }
                c7370.f24261.remove(this.f28950);
                c7370.f24254 = c7370.f24251 == 1 ? 0 : c7370.f24254 - 1;
                if (c7370.f24254 == 0) {
                    c7370.f24246.mo16661();
                    c7370.f24257 = true;
                }
            }
        }
    }
}
