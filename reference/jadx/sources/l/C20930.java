package l;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20930 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Uri f67999;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f68000;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f68001;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f68002;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f68003;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f68004;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17216 f68006;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC6558 f68007;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22766 f68008;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20225 f68010;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9724 f68011;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5263 f68012;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Uri[] f68013;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C3623 f68014;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7648[] f68015;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Uri f68017;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18813 f68016 = new C18813();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f68005 = C17983.f57507;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f68009 = -9223372036854775807L;

    public C20930(InterfaceC20225 interfaceC20225, InterfaceC5263 interfaceC5263, Uri[] uriArr, C7648[] c7648Arr, InterfaceC15992 interfaceC15992, InterfaceC19706 interfaceC19706, C3623 c3623, List list, C9724 c9724) {
        this.f68010 = interfaceC20225;
        this.f68012 = interfaceC5263;
        this.f68013 = uriArr;
        this.f68015 = c7648Arr;
        this.f68014 = c3623;
        this.f68004 = list;
        this.f68011 = c9724;
        InterfaceC15785 interfaceC15785Mo12441 = interfaceC15992.mo12441(1);
        this.f68001 = interfaceC15785Mo12441;
        if (interfaceC19706 != null) {
            interfaceC15785Mo12441.mo11161(interfaceC19706);
        }
        this.f68002 = interfaceC15992.mo12441(3);
        this.f68006 = new C17216("", c7648Arr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c7648Arr[i].f25244 & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f68007 = new C10347(this.f68006, C17039.m39821(arrayList));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m47046() throws C22766 {
        C22766 c22766 = this.f68008;
        if (c22766 != null) {
            throw c22766;
        }
        Uri uri = this.f67999;
        if (uri == null || !uri.equals(this.f68017)) {
            return;
        }
        this.f68012.mo14544(this.f67999);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17216 m47050() {
        return this.f68006;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m47061() {
        return this.f68000;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6558 m47063() {
        return this.f68007;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47054(boolean z) {
        this.f68003 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m47049(long j, C6901 c6901) {
        int iMo17786 = this.f68007.mo17786();
        Uri[] uriArr = this.f68013;
        int length = uriArr.length;
        InterfaceC5263 interfaceC5263 = this.f68012;
        C16325 c16325Mo14536 = (iMo17786 >= length || iMo17786 == -1) ? null : interfaceC5263.mo14536(uriArr[this.f68007.mo17783()], true);
        if (c16325Mo14536 != null) {
            AbstractC22433 abstractC22433 = c16325Mo14536.f52586;
            if (!abstractC22433.isEmpty()) {
                long jMo14535 = c16325Mo14536.f52577 - interfaceC5263.mo14535();
                long j2 = j - jMo14535;
                int iM41822 = C17983.m41822((List) abstractC22433, Long.valueOf(j2), true);
                long j3 = ((C15620) abstractC22433.get(iM41822)).f63678;
                return c6901.m18520(j2, j3, (!c16325Mo14536.f36443 || iM41822 == abstractC22433.size() - 1) ? j3 : ((C15620) abstractC22433.get(iM41822 + 1)).f63678) + jMo14535;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47048(C0468 c0468) {
        AbstractC22433 abstractC22433;
        int i = c0468.f2137;
        if (i == -1) {
            return 1;
        }
        C16325 c16325Mo14536 = this.f68012.mo14536(this.f68013[this.f68006.m40158(c0468.f12017)], false);
        c16325Mo14536.getClass();
        AbstractC22433 abstractC22434 = c16325Mo14536.f52586;
        int i2 = (int) (c0468.f44689 - c16325Mo14536.f52591);
        if (i2 < 0) {
            return 1;
        }
        if (i2 < abstractC22434.size()) {
            abstractC22433 = ((C15620) abstractC22434.get(i2)).f50799;
        } else {
            abstractC22433 = c16325Mo14536.f52583;
        }
        if (i >= abstractC22433.size()) {
            return 2;
        }
        C7152 c7152 = (C7152) abstractC22433.get(i);
        if (c7152.f23909) {
            return 0;
        }
        return C13638.equals(Uri.parse(C22923.m50738(c16325Mo14536.f36441, c7152.f63674)), c0468.f12016.f41015) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m47062(C0468 c0468) {
        AbstractC22433 abstractC22433;
        int i = c0468.f2137;
        C2023.m6510(i != -1);
        C16325 c16325Mo14536 = this.f68012.mo14536(this.f68013[this.f68006.m40158(c0468.f12017)], false);
        c16325Mo14536.getClass();
        AbstractC22433 abstractC22434 = c16325Mo14536.f52586;
        int i2 = (int) (c0468.f44689 - c16325Mo14536.f52591);
        if (i2 < 0) {
            return 0L;
        }
        if (i2 < abstractC22434.size()) {
            abstractC22433 = ((C15620) abstractC22434.get(i2)).f50799;
        } else {
            abstractC22433 = c16325Mo14536.f52583;
        }
        return ((C7152) abstractC22433.get(i)).f63680;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47053(C14643 c14643, long j, long j2, List list, boolean z, C19519 c19519) {
        long j3;
        Uri uri;
        boolean z2;
        String str;
        C7524 c7524M47045;
        C0468 c0468 = list.isEmpty() ? null : (C0468) C22808.m50475(list);
        int iM40158 = c0468 == null ? -1 : this.f68006.m40158(c0468.f12017);
        long j4 = c14643.f47886;
        long jMax = j - j4;
        long j5 = this.f68009;
        long jMax2 = j5 != -9223372036854775807L ? j5 - j4 : -9223372036854775807L;
        if (c0468 == null || this.f68000) {
            j3 = -9223372036854775807L;
        } else {
            long j6 = c0468.f12014 - c0468.f12013;
            jMax = Math.max(0L, jMax - j6);
            j3 = -9223372036854775807L;
            if (jMax2 != -9223372036854775807L) {
                jMax2 = Math.max(0L, jMax2 - j6);
            }
        }
        this.f68007.mo17789(j4, jMax, jMax2, list, m47059(c0468, j));
        int iMo17783 = this.f68007.mo17783();
        boolean z3 = iM40158 != iMo17783;
        Uri[] uriArr = this.f68013;
        Uri uri2 = uriArr[iMo17783];
        InterfaceC5263 interfaceC5263 = this.f68012;
        if (!interfaceC5263.mo14534(uri2)) {
            c19519.f62766 = uri2;
            this.f68017 = uri2;
            return;
        }
        C16325 c16325Mo14536 = interfaceC5263.mo14536(uri2, true);
        c16325Mo14536.getClass();
        long j7 = c16325Mo14536.f52577;
        this.f68000 = c16325Mo14536.f36443;
        this.f68009 = c16325Mo14536.f52572 ? j3 : (c16325Mo14536.f52575 + j7) - interfaceC5263.mo14535();
        long jMo14535 = j7 - interfaceC5263.mo14535();
        C16325 c16325 = c16325Mo14536;
        Pair pairM47043 = m47043(c0468, z3, c16325Mo14536, jMo14535, j);
        long jLongValue = ((Long) pairM47043.first).longValue();
        int iIntValue = ((Integer) pairM47043.second).intValue();
        if (z3 && c0468 != null && (jLongValue < c16325.f52591 || ((c7524M47045 = m47045(c16325, jLongValue, iIntValue)) != null && c7524M47045.f25017.f63678 + jMo14535 < j2))) {
            Uri uri3 = uriArr[iM40158];
            C16325 c16325Mo14537 = interfaceC5263.mo14536(uri3, true);
            c16325Mo14537.getClass();
            jMo14535 = c16325Mo14537.f52577 - interfaceC5263.mo14535();
            Pair pairM47044 = m47043(c0468, false, c16325Mo14537, jMo14535, j);
            jLongValue = ((Long) pairM47044.first).longValue();
            iIntValue = ((Integer) pairM47044.second).intValue();
            uri = uri3;
            c16325 = c16325Mo14537;
            iMo17783 = iM40158;
        } else {
            uri = uri2;
        }
        String str2 = c16325.f36441;
        boolean z4 = c16325.f36443;
        long j8 = c16325.f52591;
        AbstractC22433 abstractC22433 = c16325.f52586;
        if (iMo17783 != iM40158 && iM40158 != -1) {
            interfaceC5263.mo14537(uriArr[iM40158]);
        }
        if (jLongValue < j8) {
            this.f68008 = new C22766();
            return;
        }
        C7524 c7524M47046 = m47045(c16325, jLongValue, iIntValue);
        if (c7524M47046 == null) {
            if (!c16325.f52572) {
                c19519.f62766 = uri;
                this.f68017 = uri;
                return;
            } else {
                if (z || abstractC22433.isEmpty()) {
                    c19519.f62767 = true;
                    return;
                }
                c7524M47046 = new C7524((C19853) C22808.m50475(abstractC22433), (j8 + ((long) abstractC22433.size())) - 1, -1);
            }
        }
        C7524 c7524 = c7524M47046;
        C19853 c19853 = c7524.f25017;
        this.f68017 = null;
        SystemClock.elapsedRealtime();
        C15620 c15620 = c19853.f63676;
        Uri uriM50741 = (c15620 == null || (str = c15620.f63681) == null) ? null : C22923.m50741(str2, str);
        AbstractC3216 abstractC3216M47044 = m47044(uriM50741, iMo17783, true);
        c19519.f62765 = abstractC3216M47044;
        if (abstractC3216M47044 != null) {
            return;
        }
        String str3 = c19853.f63681;
        Uri uriM50742 = str3 != null ? C22923.m50741(str2, str3) : null;
        boolean z5 = false;
        AbstractC3216 abstractC3216M47045 = m47044(uriM50742, iMo17783, false);
        c19519.f62765 = abstractC3216M47045;
        if (abstractC3216M47045 != null) {
            return;
        }
        if (c19853 instanceof C7152) {
            if (((C7152) c19853).f23910 || (c7524.f25019 == 0 && z4)) {
                z5 = true;
            }
            z2 = z5;
        } else {
            z2 = z4;
        }
        boolean zM2325 = C0468.m2325(c0468, j, uri, z2, c7524, jMo14535);
        if (zM2325 && c7524.f25018) {
            return;
        }
        int iMo17785 = this.f68007.mo17785();
        Object objMo17796 = this.f68007.mo17796();
        boolean z6 = this.f68003;
        C18813 c18813 = this.f68016;
        c19519.f62765 = C0468.m2322(this.f68010, this.f68001, this.f68015[iMo17783], jMo14535, c16325, c7524, uri, this.f68004, iMo17785, objMo17796, z6, this.f68014, c0468, c18813.m43417(uriM50742), c18813.m43417(uriM50741), zM2325, z2, this.f68011);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C7524 m47045(C16325 c16325, long j, int i) {
        long j2 = c16325.f52591;
        AbstractC22433 abstractC22433 = c16325.f52583;
        int i2 = (int) (j - j2);
        AbstractC22433 abstractC22434 = c16325.f52586;
        if (i2 == abstractC22434.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < abstractC22433.size()) {
                return new C7524((C19853) abstractC22433.get(i), j, i);
            }
            return null;
        }
        C15620 c15620 = (C15620) abstractC22434.get(i2);
        if (i == -1) {
            return new C7524(c15620, j, -1);
        }
        if (i < c15620.f50799.size()) {
            return new C7524((C19853) c15620.f50799.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < abstractC22434.size()) {
            return new C7524((C19853) abstractC22434.get(i3), j + 1, -1);
        }
        if (abstractC22433.isEmpty()) {
            return null;
        }
        return new C7524((C19853) abstractC22433.get(0), j + 1, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47051(AbstractC3216 abstractC3216) {
        if (abstractC3216 instanceof C8230) {
            C8230 c8230 = (C8230) abstractC3216;
            this.f68005 = c8230.m12201();
            Uri uri = c8230.f12016.f41015;
            byte[] bArrM21610 = c8230.m21610();
            bArrM21610.getClass();
            this.f68016.m43416(uri, bArrM21610);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47058(AbstractC3216 abstractC3216, long j) {
        InterfaceC6558 interfaceC6558 = this.f68007;
        return interfaceC6558.mo17797(interfaceC6558.indexOf(this.f68006.m40158(abstractC3216.f12017)), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47057(Uri uri, long j) {
        int iIndexOf;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f68013;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iIndexOf = this.f68007.indexOf(i)) == -1) {
            return true;
        }
        this.f67999 = uri;
        return j != -9223372036854775807L && this.f68007.mo17797(iIndexOf, j) && this.f68012.mo14540(uri, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2241[] m47059(C0468 c0468, long j) {
        List listOf;
        int iM40158 = c0468 == null ? -1 : this.f68006.m40158(c0468.f12017);
        int length = this.f68007.length();
        InterfaceC2241[] interfaceC2241Arr = new InterfaceC2241[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iMo36012 = this.f68007.mo36012(i);
            Uri uri = this.f68013[iMo36012];
            InterfaceC5263 interfaceC5263 = this.f68012;
            if (!interfaceC5263.mo14534(uri)) {
                interfaceC2241Arr[i] = InterfaceC2241.f8041;
            } else {
                C16325 c16325Mo14536 = interfaceC5263.mo14536(uri, z);
                c16325Mo14536.getClass();
                long jMo14535 = c16325Mo14536.f52577 - interfaceC5263.mo14535();
                Pair pairM47043 = m47043(c0468, iMo36012 != iM40158, c16325Mo14536, jMo14535, j);
                long jLongValue = ((Long) pairM47043.first).longValue();
                int iIntValue = ((Integer) pairM47043.second).intValue();
                long j2 = c16325Mo14536.f52591;
                AbstractC22433 abstractC22433 = c16325Mo14536.f52583;
                AbstractC22433 abstractC22434 = c16325Mo14536.f52586;
                int i2 = (int) (jLongValue - j2);
                if (i2 < 0 || abstractC22434.size() < i2) {
                    listOf = AbstractC22433.of();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < abstractC22434.size()) {
                        if (iIntValue != -1) {
                            C15620 c15620 = (C15620) abstractC22434.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(c15620);
                            } else if (iIntValue < c15620.f50799.size()) {
                                AbstractC22433 abstractC22435 = c15620.f50799;
                                arrayList.addAll(abstractC22435.subList(iIntValue, abstractC22435.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(abstractC22434.subList(i2, abstractC22434.size()));
                        iIntValue = 0;
                    }
                    if (c16325Mo14536.f52582 != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < abstractC22433.size()) {
                            arrayList.addAll(abstractC22433.subList(iIntValue, abstractC22433.size()));
                        }
                    }
                    listOf = C0561.unmodifiableList(arrayList);
                }
                interfaceC2241Arr[i] = new C8936(jMo14535, listOf);
            }
            i++;
            z = false;
        }
        return interfaceC2241Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47047(long j, List list) {
        if (this.f68008 != null || this.f68007.length() < 2) {
            return list.size();
        }
        return this.f68007.mo17787(j, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47055(long j, AbstractC3216 abstractC3216, List list) {
        if (this.f68008 != null) {
            return false;
        }
        return this.f68007.mo17792(j, abstractC3216, list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47056(Uri uri) {
        return C17983.m41842(uri, this.f68013);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Pair m47043(C0468 c0468, boolean z, C16325 c16325, long j, long j2) {
        boolean z2 = true;
        if (c0468 != null) {
            long j3 = c0468.f44689;
            int i = c0468.f2137;
            if (!z) {
                if (c0468.m2328()) {
                    if (i == -1) {
                        j3 = j3 != -1 ? j3 + 1 : -1L;
                    }
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i));
            }
        }
        long j4 = c16325.f52575;
        AbstractC22433 abstractC22433 = c16325.f52583;
        long j5 = c16325.f52591;
        AbstractC22433 abstractC22434 = c16325.f52586;
        long j6 = j4 + j;
        if (c0468 != null && !this.f68000) {
            j2 = c0468.f12013;
        }
        if (!c16325.f52572 && j2 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) abstractC22434.size())), -1);
        }
        long j7 = j2 - j;
        Long lValueOf = Long.valueOf(j7);
        int i2 = 0;
        if (this.f68012.mo14542() && c0468 != null) {
            z2 = false;
        }
        int iM41822 = C17983.m41822(abstractC22434, lValueOf, z2);
        long j8 = ((long) iM41822) + j5;
        if (iM41822 >= 0) {
            C15620 c15620 = (C15620) abstractC22434.get(iM41822);
            AbstractC22433 abstractC22435 = j7 < c15620.f63678 + c15620.f63680 ? c15620.f50799 : abstractC22433;
            while (i2 < abstractC22435.size()) {
                C7152 c7152 = (C7152) abstractC22435.get(i2);
                if (j7 >= c7152.f63678 + c7152.f63680) {
                    i2++;
                } else if (c7152.f23910) {
                    j8 += abstractC22435 == abstractC22433 ? 1L : 0L;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC3216 m47044(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        C18813 c18813 = this.f68016;
        byte[] bArrM43418 = c18813.m43418(uri);
        if (bArrM43418 != null) {
            c18813.m43416(uri, bArrM43418);
            return null;
        }
        C16490 c16490 = new C16490();
        c16490.m38756(uri);
        c16490.m38754(1);
        return new C8230(this.f68002, c16490.m38753(), this.f68015[i], this.f68007.mo17785(), this.f68007.mo17796(), this.f68005);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47052(InterfaceC6558 interfaceC6558) {
        this.f68012.mo14537(this.f68013[this.f68007.mo17783()]);
        this.f68007 = interfaceC6558;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m47060() {
        this.f68012.mo14537(this.f68013[this.f68007.mo17783()]);
        this.f68008 = null;
    }
}
