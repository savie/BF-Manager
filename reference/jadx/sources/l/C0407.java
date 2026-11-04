package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.bouncycastle.math.ec.rfc7748.X448Field;

/* JADX INFO: renamed from: l.֡ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes2.dex */
public class C0407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0407 f1952 = C5233.f18438;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2213(C14402 c14402) {
        C0407 c0407;
        ArrayList arrayList = new ArrayList();
        C0407 c0408 = this;
        while (true) {
            boolean z = false;
            if (c0408 != null) {
                if (!(c0408 instanceof C19293)) {
                    if (c0408 instanceof C14576) {
                        c14402.f45392 = false;
                        c14402.f45391 = false;
                    } else if (c0408 instanceof C1153) {
                        c0408 = ((C1153) c0408).f4259;
                    } else if (c0408 instanceof C16640) {
                        arrayList.add(new C21116(0, c0408, c14402));
                        c0408 = c0408.f1952;
                    } else if (c0408 instanceof C1899) {
                        arrayList.add(new C21116(1, c0408, c14402));
                    } else if (c0408 instanceof C2644) {
                        arrayList.add(new C21116(2, c0408, c14402));
                        c0408 = ((C2644) c0408).f8452;
                    } else if (c0408 instanceof C22782) {
                        C22782 c22782 = (C22782) c0408;
                        arrayList.add(new C21116(3, c0408, c14402, c22782.f73902, c22782.f73899));
                        c14402.m34833();
                        c0408 = c22782.f73901;
                    } else if (c0408 instanceof C16814) {
                        C16814 c16814 = (C16814) c0408;
                        arrayList.add(new C21116(3, c0408, c14402, c16814.f54250, c16814.f54252));
                        c14402.m34833();
                        c0408 = c16814.f54251;
                    } else if (c0408 instanceof C8106) {
                        C8106 c8106 = (C8106) c0408;
                        C21116 c21116 = new C21116(4, c0408, c14402);
                        arrayList.add(c21116);
                        c14402.m34833();
                        if (c8106.f26769 == 0) {
                            c21116.f67455 = 1;
                            c21116.f67452 += c21116.f67457;
                            c21116.f67450 += c21116.f67449;
                            c0407 = c8106.f26771.f1952;
                        } else {
                            c0407 = c8106.f26768[0];
                        }
                        c0408 = c0407;
                    } else {
                        if (c0408 instanceof C5454) {
                            int i = c14402.f45394;
                            int[] iArr = ((C5454) c0408).f19048;
                            c14402.f45394 = i + iArr.length;
                            c14402.f45393 += iArr.length;
                        } else if (c0408 instanceof C22036) {
                            c14402.f45394++;
                            c14402.f45393++;
                        } else if (c0408 instanceof C12339) {
                            c14402.f45394++;
                            c14402.f45393 += 2;
                        } else if ((c0408 instanceof C21290) || (c0408 instanceof C13656)) {
                            c14402.f45394++;
                            c14402.f45391 = false;
                        } else if (c0408 instanceof C10847) {
                            c14402.f45394 += ((C10847) c0408).f34348;
                            if (c14402.f45392) {
                                c14402.f45393 += Integer.MAX_VALUE;
                            }
                            c14402.f45391 = false;
                        } else if ((c0408 instanceof C17055) || (c0408 instanceof C10342)) {
                            c14402.f45392 = false;
                        } else if (c0408 instanceof C21531) {
                            c14402.f45394 += ((C21531) c0408).f68793.length;
                            c14402.f45392 = false;
                        }
                        c0408 = c0408.f1952;
                    }
                }
                c0408 = null;
            } else {
                if (arrayList.isEmpty()) {
                    return c14402.f45391;
                }
                C21116 c21117 = (C21116) j$$ExternalSyntheticOutline0.m(arrayList, 1);
                int i2 = c21117.f67453;
                int i3 = c21117.f67451;
                C0407 c0409 = c21117.f67459;
                if (i2 == 0) {
                    c14402.f45392 = false;
                    c14402.f45391 = false;
                } else if (i2 == 1) {
                    c14402.f45392 = false;
                    c14402.f45391 = false;
                    C2764.m9138(arrayList, 1);
                    c0408 = c0409.f1952;
                } else if (i2 == 2) {
                    if (((C2644) c0409).f8451 != EnumC9355.INDEPENDENT) {
                        c14402.f45394 = c21117.f67452;
                        c14402.f45391 = false;
                    }
                    C2764.m9138(arrayList, 1);
                    c0408 = c0409.f1952;
                } else if (i2 == 3) {
                    int i4 = c14402.f45394;
                    int i5 = c21117.f67458;
                    int i6 = c21117.f67452;
                    int i7 = (i4 * i5) + i6;
                    if (i7 < i6) {
                        i7 = X448Field.M28;
                    }
                    c14402.f45394 = i7;
                    if (c21117.f67448 && c14402.f45392) {
                        int i8 = c14402.f45393 * i3;
                        int i9 = c21117.f67450;
                        int i10 = i8 + i9;
                        c14402.f45393 = i10;
                        if (i10 < i9) {
                            c14402.f45392 = false;
                        }
                    } else {
                        c14402.f45392 = false;
                    }
                    if (c14402.f45391 && i5 == i3 && c21117.f67456) {
                        z = true;
                    }
                    c14402.f45391 = z;
                    C2764.m9138(arrayList, 1);
                    c0408 = c0409.f1952;
                } else {
                    if (i2 != 4) {
                        throw new AssertionError(c21117.f67453);
                    }
                    C8106 c8107 = (C8106) c0409;
                    if (c21117.f67455 == 0) {
                        c21117.f67457 = Math.min(c21117.f67457, c14402.f45394);
                        c21117.f67449 = Math.max(c21117.f67449, c14402.f45393);
                        c21117.f67448 &= c14402.f45392;
                        c14402.m34833();
                        int i11 = c21117.f67454 + 1;
                        c21117.f67454 = i11;
                        if (i11 < c8107.f26769) {
                            c0408 = c8107.f26768[i11];
                        } else {
                            c21117.f67452 += c21117.f67457;
                            c21117.f67450 += c21117.f67449;
                            c21117.f67455 = 1;
                            c0408 = c8107.f26771.f1952;
                        }
                    } else {
                        c14402.f45394 += c21117.f67452;
                        c14402.f45393 += c21117.f67450;
                        c14402.f45392 &= c21117.f67448;
                        c14402.f45391 = false;
                    }
                }
                C2764.m9138(arrayList, 1);
            }
        }
    }
}
