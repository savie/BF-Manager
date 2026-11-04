package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* JADX INFO: renamed from: l.ۗ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3283 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۠ۗۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f10699 = {2871, 24743, 24756, 24749, 24818};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10700;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f10701;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4245 f10702;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnClickListenerC20437 f10703;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10745 f10704;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10705;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10706;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10707;

    public C3283(AbstractViewOnClickListenerC20437 abstractViewOnClickListenerC20437, int i, C4245 c4245, boolean z, int i2, boolean z2) {
        this.f10703 = abstractViewOnClickListenerC20437;
        this.f10706 = i;
        this.f10702 = c4245;
        this.f10700 = z;
        this.f10707 = i2;
        this.f10705 = z2;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10745 c10745 = new C10745(this.f10703.f65459.m23233());
        c10745.mo25916((Runnable) null);
        c10745.m27397(R.string.MT_Protector);
        c10745.mo25931();
        this.f10704 = c10745;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        String str;
        boolean zM14470;
        XmlResourceParserC9734 xmlResourceParserC9734M35991;
        String str2 = "/";
        AbstractViewOnClickListenerC20437 abstractViewOnClickListenerC20437 = this.f10703;
        C22941 c22941 = new C22941(abstractViewOnClickListenerC20437.f65455);
        int i = this.f10706;
        try {
            if (i == 0) {
                m10828(c22941);
                c22941.close();
                return;
            }
            ((C10627) abstractViewOnClickListenerC20437).f33709 = new C22829("zip", "/");
            C3374 c3374 = new C3374(c22941.m51749());
            C10745 c10745 = this.f10704;
            C17359.requireNonNull(c10745);
            c3374.m11078(new C21151(c10745));
            int i2 = 1;
            C21246 c21246 = i == 1 ? new C21246(c22941) : null;
            Set set = abstractViewOnClickListenerC20437.f65458 != null ? (Set) C1170.stream(abstractViewOnClickListenerC20437.f65458).map(new C4527(2)).collect(C2025.toSet()) : null;
            for (C8002 c8002 : c22941.m51742()) {
                if (this.f10704.m27399()) {
                    break;
                }
                c3374.m11079(i2);
                if (c8002.isDirectory() || c8002.getSize() <= 10 || c8002.getSize() >= 2097152) {
                    str = str2;
                } else {
                    if (set != null) {
                        if (!set.contains(str2 + c8002.getName())) {
                            str = str2;
                        }
                    }
                    try {
                        InputStream inputStreamM51727 = c22941.m51727(c8002);
                        if (i != i2) {
                            int i3 = this.f10707;
                            int i4 = 2;
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        try {
                                            XmlResourceParserC9734 xmlResourceParserC9734M35992 = C14955.m35973(inputStreamM51727).m35991();
                                            while (true) {
                                                int next = xmlResourceParserC9734M35992.next();
                                                if (next != i2) {
                                                    if (next == i4) {
                                                        int attributeCount = xmlResourceParserC9734M35992.getAttributeCount();
                                                        int i5 = 0;
                                                        while (true) {
                                                            if (i5 != attributeCount) {
                                                                int iM25344 = xmlResourceParserC9734M35992.m25344(i5);
                                                                str = str2;
                                                                if (iM25344 >= 16 && iM25344 <= 31) {
                                                                    try {
                                                                        if (i3 == xmlResourceParserC9734M35992.m25350(i5)) {
                                                                            xmlResourceParserC9734M35992.close();
                                                                            zM14470 = true;
                                                                        }
                                                                    } catch (Exception unused) {
                                                                        zM14470 = false;
                                                                    }
                                                                }
                                                                i5++;
                                                                str2 = str;
                                                            }
                                                            str = str2;
                                                        }
                                                    }
                                                    i2 = 1;
                                                    i4 = 2;
                                                    str2 = str2;
                                                } else {
                                                    str = str2;
                                                }
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } else {
                                        str = str2;
                                        throw new RuntimeException();
                                    }
                                    i2 = 1;
                                } else {
                                    str = str2;
                                    xmlResourceParserC9734M35991 = C14955.m35973(inputStreamM51727).m35991();
                                    while (true) {
                                        int next2 = xmlResourceParserC9734M35991.next();
                                        if (next2 != 1) {
                                            if (next2 == 2) {
                                                int attributeCount2 = xmlResourceParserC9734M35991.getAttributeCount();
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 == attributeCount2) {
                                                        continue;
                                                    } else {
                                                        int iM25345 = xmlResourceParserC9734M35991.m25344(i6);
                                                        if (iM25345 < 28 || iM25345 > 31 || i3 != xmlResourceParserC9734M35991.m25350(i6)) {
                                                            i6++;
                                                        } else {
                                                            xmlResourceParserC9734M35991.close();
                                                            zM14470 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                zM14470 = false;
                            } else {
                                str = str2;
                                xmlResourceParserC9734M35991 = C14955.m35973(inputStreamM51727).m35991();
                                while (true) {
                                    int next3 = xmlResourceParserC9734M35991.next();
                                    if (next3 == 1) {
                                        zM14470 = false;
                                    } else if (next3 == 2) {
                                        int attributeCount3 = xmlResourceParserC9734M35991.getAttributeCount();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 == attributeCount3) {
                                                continue;
                                            } else {
                                                int iM25346 = xmlResourceParserC9734M35991.m25344(i7);
                                                if ((iM25346 == 2 || iM25346 == 1) && i3 == xmlResourceParserC9734M35991.m25350(i7)) {
                                                    xmlResourceParserC9734M35991.close();
                                                    zM14470 = true;
                                                } else {
                                                    i7++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            str = str2;
                            zM14470 = C4642.m14470(inputStreamM51727, this.f10702, this.f10700, c21246);
                        }
                        if (zM14470) {
                            try {
                                C2494 c2494 = new C2494(c8002);
                                ((C10627) abstractViewOnClickListenerC20437).f33709.f73990.add(new C1200(c2494, c2494.getParent()));
                            } catch (IOException unused3) {
                            }
                        }
                    } catch (IOException unused4) {
                        str = str2;
                    }
                    i2 = 1;
                }
                str2 = str;
            }
            c22941.close();
        } catch (Throwable th) {
            try {
                c22941.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10828(C22941 c22941) {
        int iM2761;
        int i;
        int i2;
        C3374 c3374;
        int iM3169;
        int i3;
        C21246 c21246;
        int i4;
        byte[] bArr;
        C3374 c3375;
        C8244 c8244;
        byte[] bArr2;
        int i5;
        C21246 c21247;
        int iM31610;
        int i6;
        int i7;
        int i8;
        C3374 c3376;
        C3374 c3377;
        byte[] bArr3;
        int i9;
        int iM31611;
        int i10;
        int i11;
        int i12;
        int iM31612;
        int i13;
        C3374 c3378;
        int iM31613;
        int i14;
        int i15;
        int i16;
        int iM31614;
        int i17;
        int i18 = 109121307;
        int i19 = C2288.f7433;
        int i20 = C2702.f8586;
        int iM2762 = (C0619.m2761("᩻۬") + i20) * (-117);
        int i21 = ((iM2762 ^ i19) * 29679) ^ (-983010473);
        int i22 = iM2762 ^ (-1770819235);
        C3374 c3379 = null;
        Iterator itM13647 = null;
        ArrayList arrayList = null;
        byte[] bArrM35989 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i23 = 0;
        int i24 = 0;
        ArrayList arrayList2 = null;
        Iterator itM53426 = null;
        C10627 c10627 = null;
        C2494 c2494 = null;
        C3374 c33710 = null;
        int i25 = 0;
        C21246 c21248 = null;
        String strM35993 = null;
        C8244 c8245 = null;
        C8002 c8002 = null;
        C8002 c8003 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i19) * 15613) >> 31));
            switch (i18) {
                case -2039824614:
                case -772637734:
                    c3374 = c3379;
                    c8245.m22158();
                    c10627 = (C10627) this.f10703;
                    if (C11235.f35427 < 0) {
                        short[] sArr2 = f10699;
                        c8245 = c8245;
                        if (C11235.f35427 < 0) {
                            c21246 = c21248;
                            i4 = i24;
                            String strM13650 = C4282.m13650(sArr2, 1, 3, i4);
                            short[] sArr3 = f10699;
                            if (C2354.f7599 >= 0) {
                                bArr = bArrM35989;
                            } else {
                                bArr = bArrM35989;
                                c10627.f33709 = new C22829(strM13650, C3734.m12149(sArr3, 4, 1, i4));
                                long jM7752 = C2288.m7752(arrayList2);
                                if (C11235.f35427 < 0) {
                                    c33710 = new C3374(jM7752);
                                    AbstractC0641.m2819(c33710, new InterfaceC17544() { // from class: l.᩹۠۫
                                        @Override // l.InterfaceC17544
                                        /* JADX INFO: renamed from: ۙ */
                                        public final void mo1209(int i26) {
                                            this.f75808.f10704.m27403((i26 / 2) + 50);
                                        }
                                    });
                                    itM13647 = C4282.m13647(arrayList2);
                                    iM31613 = (i20 - C0773.m3169("᩹᩵")) * 83;
                                    i14 = ((iM31613 ^ i19) * WhirlpoolDigest.REDUCTION_POLYNOMIAL) ^ 1746985486;
                                    i15 = -420831219;
                                    i16 = iM31613 ^ i15;
                                    bArrM35989 = bArr;
                                }
                                i24 = i4;
                                c21248 = c21246;
                            }
                            int iM31615 = (C0773.m3169("ܿᩳ") + i20) * 91;
                            i14 = ((iM31615 ^ i19) * (-22719)) ^ 248211635;
                            i16 = iM31615 ^ 1962753454;
                            bArrM35989 = bArr;
                            c33710 = null;
                            i24 = i4;
                            c21248 = c21246;
                        }
                        c3376 = c3374;
                        i22 = i16;
                        i21 = i14;
                        c8245 = c8245;
                        c3379 = c3376;
                    } else {
                        c8245 = c8245;
                    }
                    int iM31616 = C0773.m3169("ۗ֨") ^ i20;
                    i14 = ((iM31616 ^ i19) * 21919) ^ 1791357992;
                    i16 = iM31616 ^ (-1509067649);
                    c3376 = c3374;
                    i22 = i16;
                    i21 = i14;
                    c8245 = c8245;
                    c3379 = c3376;
                    break;
                case -2031356962:
                case 59378616:
                    C4245 c4245 = this.f10702;
                    c4245.m13568reset((CharSequence) strM35993);
                    if (!c4245.find()) {
                        c21246 = c21248;
                        c3374 = c3379;
                        i4 = i24;
                        c8245 = c8245;
                        bArr = bArrM35989;
                        iM31613 = (i20 - C0773.m3169("᩹᩵")) * 83;
                        i14 = ((iM31613 ^ i19) * WhirlpoolDigest.REDUCTION_POLYNOMIAL) ^ 1746985486;
                        i15 = -420831219;
                        i16 = iM31613 ^ i15;
                        bArrM35989 = bArr;
                        i24 = i4;
                        c21248 = c21246;
                        c3376 = c3374;
                        i22 = i16;
                        i21 = i14;
                        c8245 = c8245;
                        c3379 = c3376;
                    } else {
                        iM2761 = C0773.m3169("ۚ۫") ^ i20;
                        i = ((iM2761 ^ i19) * 23529) ^ (-1298395515);
                        i2 = 1499484994;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    }
                    break;
                case -2008543756:
                case 490749359:
                    if (C3998.f13671 == 0) {
                        c3374 = c3379;
                        c8245 = c8245;
                        int iM31617 = C0773.m3169("ۗ֨") ^ i20;
                        i14 = ((iM31617 ^ i19) * 21919) ^ 1791357992;
                        i16 = iM31617 ^ (-1509067649);
                        c3376 = c3374;
                        i22 = i16;
                        i21 = i14;
                        c8245 = c8245;
                        c3379 = c3376;
                    } else {
                        c21248 = c21248;
                        c3378 = c3379;
                        c8245 = c8245;
                        int i26 = i24;
                        bArr3 = bArrM35989;
                        i9 = i26;
                        iM31614 = (i20 - C0773.m3169("֡ۘ")) * 31;
                        i10 = ((iM31614 ^ i19) * 29173) ^ 653652862;
                        i17 = -252277898;
                        i22 = iM31614 ^ i17;
                        c8245 = c8245;
                        c3379 = c3378;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr4 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr4;
                    }
                    break;
                case -2004940918:
                case -1677141011:
                    c3374 = c3379;
                    if (C3998.m12923(itM13647)) {
                        iM3169 = C0619.m2761("ܿۘ") ^ i20;
                        i = ((iM3169 ^ i19) * (-9251)) ^ 793852305;
                        i3 = 35013662;
                    } else {
                        iM3169 = C0619.m2761("ܺ᩺") ^ i19;
                        i = ((iM3169 ^ i20) * (-20803)) ^ 1554086049;
                        i3 = 17116585;
                    }
                    int i27 = iM3169 ^ i3;
                    c3379 = c3374;
                    i22 = i27;
                    i21 = i;
                    break;
                case -1970892985:
                case 1418947701:
                    if (!RunnableC1848.f6235) {
                        c21247 = c21248;
                        c3375 = c3379;
                        c8244 = c8245;
                        int i28 = i24;
                        bArr2 = bArrM35989;
                        i5 = i28;
                        iM31610 = (C0773.m3169("ۨ᩷") ^ i19) * (-127);
                        i6 = ((iM31610 ^ i20) * 13947) ^ 39629421;
                        i7 = 72405253;
                        i13 = iM31610 ^ i7;
                        c21248 = c21247;
                        C3374 c33711 = c3375;
                        i22 = i13;
                        i21 = i6;
                        c8245 = c8244;
                        c3379 = c33711;
                        byte[] bArr5 = bArr2;
                        i24 = i5;
                        bArrM35989 = bArr5;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩶") ^ i20;
                        i = ((iM2761 ^ i19) * 16829) ^ 1864964305;
                        i2 = 1788733764;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    }
                    break;
                case -1922827845:
                case 13478070:
                    try {
                        bArrM35989 = AbstractC3624.m11754(C0269.m1776(c22941, c8003)).m35989(c21248);
                        iM2761 = (C0773.m3169("᩻ۧ") ^ i20) * 35;
                        i = ((iM2761 ^ i19) * (-10111)) ^ (-1295791479);
                        i2 = 1976543140;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    } catch (Throwable unused) {
                        c3378 = c3379;
                        int i29 = i24;
                        bArr3 = bArrM35989;
                        i9 = i29;
                        iM31614 = C0619.m2761("᩺ۘ") ^ i20;
                        i10 = ((iM31614 ^ i19) * (-10155)) ^ (-229876201);
                        i17 = 1249658184;
                        i22 = iM31614 ^ i17;
                        c8245 = c8245;
                        c3379 = c3378;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr6 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr6;
                    }
                    break;
                case -1832221452:
                case -1203876624:
                    c8245.m22159(bArrM35989);
                    C1519.m5406(arrayList2, c8003);
                    c3378 = c3379;
                    int i210 = i24;
                    bArr3 = bArrM35989;
                    i9 = i210;
                    iM31614 = C0619.m2761("᩺ۘ") ^ i20;
                    i10 = ((iM31614 ^ i19) * (-10155)) ^ (-229876201);
                    i17 = 1249658184;
                    i22 = iM31614 ^ i17;
                    c8245 = c8245;
                    c3379 = c3378;
                    i21 = i10;
                    c21248 = c21248;
                    byte[] bArr7 = bArr3;
                    i24 = i9;
                    bArrM35989 = bArr7;
                    break;
                case -1674327018:
                case 306952247:
                    if (C2354.m7977(c8003) < 2097152) {
                        iM2761 = C0619.m2761("ۛ᩵") ^ i19;
                        i = ((iM2761 ^ i20) * (-15345)) ^ (-753529192);
                        i2 = -281989092;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    } else {
                        c3378 = c3379;
                        int i211 = i24;
                        bArr3 = bArrM35989;
                        i9 = i211;
                        iM31614 = C0619.m2761("᩺ۘ") ^ i20;
                        i10 = ((iM31614 ^ i19) * (-10155)) ^ (-229876201);
                        i17 = 1249658184;
                        i22 = iM31614 ^ i17;
                        c8245 = c8245;
                        c3379 = c3378;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr8 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr8;
                    }
                    break;
                case -1591981198:
                case 1249395931:
                    c8002 = (C8002) C4238.m13529(itM13647);
                    if (!C1519.m5404(this.f10704)) {
                        iM2761 = (C0619.m2761("ۢۘ") + i19) * (-127);
                        i = ((iM2761 ^ i20) * (-9299)) ^ (-1056730910);
                        i2 = -704046896;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    } else {
                        c3374 = c3379;
                        iM3169 = C0619.m2761("ܺ᩺") ^ i19;
                        i = ((iM3169 ^ i20) * (-20803)) ^ 1554086049;
                        i3 = 17116585;
                        int i212 = iM3169 ^ i3;
                        c3379 = c3374;
                        i22 = i212;
                        i21 = i;
                    }
                    break;
                case -1539082463:
                case 540215164:
                    i8 = 22442;
                    int iM2763 = C0619.m2761("ۡۤ") ^ i19;
                    bArrM35989 = bArrM35989;
                    i24 = i8;
                    i21 = ((iM2763 ^ i20) * 16027) ^ 1620481189;
                    c21248 = c21248;
                    c3376 = c3379;
                    i22 = iM2763 ^ (-1635760291);
                    c8245 = c8245;
                    c3379 = c3376;
                    break;
                case -1527985969:
                case 1271849882:
                    c8245 = c8245;
                    c21248 = c21248;
                    int i30 = i24;
                    bArr3 = bArrM35989;
                    i9 = i30;
                    c3378 = new C3374(c22941.m51749());
                    if (AbstractC3624.f12429 <= 0) {
                        iM31614 = (i20 - C0773.m3169("֡ۘ")) * 31;
                        i10 = ((iM31614 ^ i19) * 29173) ^ 653652862;
                        i17 = -252277898;
                    } else {
                        RunnableC3055.m9935(c3378, new InterfaceC17544() { // from class: l.ܶ۠۫
                            @Override // l.InterfaceC17544
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1209(int i31) {
                                this.f51832.f10704.m27403(i31 / 2);
                            }
                        });
                        itM53426 = C23916.m53426(C2023.m6951(c22941));
                        iM31614 = C0619.m2761("᩺ۘ") ^ i20;
                        i10 = ((iM31614 ^ i19) * (-10155)) ^ (-229876201);
                        i17 = 1249658184;
                    }
                    i22 = iM31614 ^ i17;
                    c8245 = c8245;
                    c3379 = c3378;
                    i21 = i10;
                    c21248 = c21248;
                    byte[] bArr9 = bArr3;
                    i24 = i9;
                    bArrM35989 = bArr9;
                    break;
                case -1516188098:
                case 785441718:
                    C1519.m5406(arrayList, new C1200(c2494, c2494.getParent()));
                    c21246 = c21248;
                    c3374 = c3379;
                    i4 = i24;
                    c8245 = c8245;
                    bArr = bArrM35989;
                    iM31613 = (i20 - C0773.m3169("᩹᩵")) * 83;
                    i14 = ((iM31613 ^ i19) * WhirlpoolDigest.REDUCTION_POLYNOMIAL) ^ 1746985486;
                    i15 = -420831219;
                    i16 = iM31613 ^ i15;
                    bArrM35989 = bArr;
                    i24 = i4;
                    c21248 = c21246;
                    c3376 = c3374;
                    i22 = i16;
                    i21 = i14;
                    c8245 = c8245;
                    c3379 = c3376;
                    break;
                case -1424099606:
                case -295482766:
                    C0862.m3503();
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("ۤۤ") ^ i19;
                        i = ((iM2761 ^ i20) * 14675) ^ 248291969;
                        i2 = -2022089121;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    } else {
                        c21248 = c21248;
                        c3378 = c3379;
                        c8245 = c8245;
                        int i213 = i24;
                        bArr3 = bArrM35989;
                        i9 = i213;
                        iM31614 = (i20 - C0773.m3169("֡ۘ")) * 31;
                        i10 = ((iM31614 ^ i19) * 29173) ^ 653652862;
                        i17 = -252277898;
                        i22 = iM31614 ^ i17;
                        c8245 = c8245;
                        c3379 = c3378;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr10 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr10;
                    }
                    break;
                case -1411844775:
                case -459877300:
                    c3375 = c3379;
                    c8244 = c8245;
                    int i31 = i24;
                    bArr2 = bArrM35989;
                    i5 = i31;
                    c21248 = new C21246(c22941);
                    arrayList2 = new ArrayList();
                    if (C2310.f7472 >= 0) {
                        iM31612 = (C0773.m3169("֡۫") + i20) * (-103);
                        i6 = ((iM31612 ^ i19) * 8719) ^ (-47291657);
                        i12 = 1368476401;
                    } else {
                        iM31612 = C0619.m2761("ۨܿ") ^ i19;
                        i6 = ((iM31612 ^ i20) * 15091) ^ 1525236887;
                        i12 = 698096016;
                    }
                    i13 = iM31612 ^ i12;
                    C3374 c33712 = c3375;
                    i22 = i13;
                    i21 = i6;
                    c8245 = c8244;
                    c3379 = c33712;
                    byte[] bArr11 = bArr2;
                    i24 = i5;
                    bArrM35989 = bArr11;
                    break;
                case -1384067953:
                case -495570576:
                    i8 = 24797;
                    int iM2764 = C0619.m2761("ۡۤ") ^ i19;
                    bArrM35989 = bArrM35989;
                    i24 = i8;
                    i21 = ((iM2764 ^ i20) * 16027) ^ 1620481189;
                    c21248 = c21248;
                    c3376 = c3379;
                    i22 = iM2764 ^ (-1635760291);
                    c8245 = c8245;
                    c3379 = c3376;
                    break;
                case -1122480656:
                case -53298141:
                    c21248 = c21248;
                    c3377 = c3379;
                    int i32 = i24;
                    bArr3 = bArrM35989;
                    i9 = i32;
                    AbstractC22044 abstractC22044M47850 = C20932.m47850(C6382.f21563);
                    this.f10701 = abstractC22044M47850;
                    c8245 = new C8244(abstractC22044M47850);
                    if (C11235.f35427 >= 0) {
                        iM31611 = C0619.m2761("ۧ֡") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-30601)) ^ (-536400266);
                        i11 = 2131935592;
                    } else {
                        iM31611 = (C0773.m3169("ۗ۬") + i20) * 31;
                        i10 = ((iM31611 ^ i19) * 4367) ^ 344572411;
                        i11 = 555632419;
                    }
                    c3379 = c3377;
                    i22 = iM31611 ^ i11;
                    i21 = i10;
                    c21248 = c21248;
                    byte[] bArr12 = bArr3;
                    i24 = i9;
                    bArrM35989 = bArr12;
                    break;
                case -1091391526:
                case 698420131:
                    c21247 = c21248;
                    c3375 = c3379;
                    c8244 = c8245;
                    int i33 = i24;
                    bArr2 = bArrM35989;
                    i5 = i33;
                    int i34 = s + 1;
                    if ((i23 + 1) - (i34 * i34) <= 0) {
                        iM31610 = C0773.m3169("ۙ۫") ^ i20;
                        i6 = ((iM31610 ^ i19) * 8935) ^ 1478089882;
                        i7 = -437325823;
                    } else {
                        iM31610 = (C0619.m2761("ܺ۟") ^ i19) * 41;
                        i6 = ((iM31610 ^ i20) * 19861) ^ (-1045025975);
                        i7 = 453144921;
                    }
                    i13 = iM31610 ^ i7;
                    c21248 = c21247;
                    C3374 c33713 = c3375;
                    i22 = i13;
                    i21 = i6;
                    c8245 = c8244;
                    c3379 = c33713;
                    byte[] bArr13 = bArr2;
                    i24 = i5;
                    bArrM35989 = bArr13;
                    break;
                case -885480866:
                case 1101165568:
                    if (C11235.f35427 < 0) {
                        c21247 = c21248;
                        c3375 = c3379;
                        c8244 = c8245;
                        int i35 = i24;
                        bArr2 = bArrM35989;
                        i5 = i35;
                        iM31610 = (i19 - C0773.m3169("᩵᩵")) * 85;
                        i6 = ((iM31610 ^ i20) * (-4571)) ^ 1179964791;
                        i7 = -1571296821;
                        i13 = iM31610 ^ i7;
                        c21248 = c21247;
                        C3374 c33714 = c3375;
                        i22 = i13;
                        i21 = i6;
                        c8245 = c8244;
                        c3379 = c33714;
                        byte[] bArr14 = bArr2;
                        i24 = i5;
                        bArrM35989 = bArr14;
                    } else {
                        iM2761 = C0619.m2761("ۗۙ") ^ i19;
                        i = ((iM2761 ^ i20) * 28835) ^ 85962561;
                        i2 = 910977820;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    }
                    break;
                case -600666296:
                case 1666707572:
                    break;
                case -517107852:
                case 41996294:
                    c3374 = c3379;
                    c8003 = (C8002) C4238.m13529(itM53426);
                    if (!C1519.m5404(this.f10704)) {
                        iM3169 = C0773.m3169("ۧۖ") ^ i19;
                        i = ((iM3169 ^ i20) * 13645) ^ 402430649;
                        i3 = 1048066529;
                        int i214 = iM3169 ^ i3;
                        c3379 = c3374;
                        i22 = i214;
                        i21 = i;
                    } else {
                        c8245 = c8245;
                        c21246 = c21248;
                        i4 = i24;
                        bArr = bArrM35989;
                        iM31613 = (C0773.m3169("ᩳ۬") + i19) * 59;
                        i14 = ((iM31613 ^ i20) * (-21225)) ^ (-1351499966);
                        i15 = 2019547560;
                        i16 = iM31613 ^ i15;
                        bArrM35989 = bArr;
                        i24 = i4;
                        c21248 = c21246;
                        c3376 = c3374;
                        i22 = i16;
                        i21 = i14;
                        c8245 = c8245;
                        c3379 = c3376;
                    }
                    break;
                case -450124414:
                case -131478672:
                    C1542.m5459();
                    if (C2419.m8174() < 0) {
                        c21247 = c21248;
                        c3375 = c3379;
                        c8244 = c8245;
                        int i215 = i24;
                        bArr2 = bArrM35989;
                        i5 = i215;
                        iM31610 = (C0773.m3169("ۨ᩷") ^ i19) * (-127);
                        i6 = ((iM31610 ^ i20) * 13947) ^ 39629421;
                        i7 = 72405253;
                        i13 = iM31610 ^ i7;
                        c21248 = c21247;
                        C3374 c33715 = c3375;
                        i22 = i13;
                        i21 = i6;
                        c8245 = c8244;
                        c3379 = c33715;
                        byte[] bArr15 = bArr2;
                        i24 = i5;
                        bArrM35989 = bArr15;
                    } else {
                        c21248 = c21248;
                        c3378 = c3379;
                        c8245 = c8245;
                        int i216 = i24;
                        bArr3 = bArrM35989;
                        i9 = i216;
                        iM31614 = (i20 - C0773.m3169("֡ۘ")) * 31;
                        i10 = ((iM31614 ^ i19) * 29173) ^ 653652862;
                        i17 = -252277898;
                        i22 = iM31614 ^ i17;
                        c8245 = c8245;
                        c3379 = c3378;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr16 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr16;
                    }
                    break;
                case -287825213:
                case 1497708130:
                    C3734.m12141(c33710, i25);
                    C14955 c14955M11754 = AbstractC3624.m11754(C2310.m7804(c22941, c8002));
                    c14955M11754.m35986(c21248, this.f10705, this.f10701);
                    strM35993 = c14955M11754.m35993();
                    if (strM35993 == null) {
                        c21246 = c21248;
                        c3374 = c3379;
                        i4 = i24;
                        c8245 = c8245;
                        bArr = bArrM35989;
                        iM31613 = (i20 - C0773.m3169("᩹᩵")) * 83;
                        i14 = ((iM31613 ^ i19) * WhirlpoolDigest.REDUCTION_POLYNOMIAL) ^ 1746985486;
                        i15 = -420831219;
                        i16 = iM31613 ^ i15;
                        bArrM35989 = bArr;
                        i24 = i4;
                        c21248 = c21246;
                        c3376 = c3374;
                        i22 = i16;
                        i21 = i14;
                        c8245 = c8245;
                        c3379 = c3376;
                    } else {
                        iM2761 = (C0619.m2761("ܰܰ") ^ i20) * 27;
                        i = ((iM2761 ^ i19) * 8819) ^ 457278189;
                        i2 = 628219146;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    }
                    break;
                case -139497898:
                case 34707818:
                    c21246 = c21248;
                    c3374 = c3379;
                    i4 = i24;
                    c8245 = c8245;
                    bArr = bArrM35989;
                    i25 = 1;
                    if (C3998.m12923(itM53426)) {
                        iM31613 = (i20 - C0773.m3169("ۢۜ")) * 45;
                        i14 = ((iM31613 ^ i19) * 30567) ^ (-359794141);
                        i15 = 1517652654;
                    } else {
                        iM31613 = (C0773.m3169("ᩳ۬") + i19) * 59;
                        i14 = ((iM31613 ^ i20) * (-21225)) ^ (-1351499966);
                        i15 = 2019547560;
                    }
                    i16 = iM31613 ^ i15;
                    bArrM35989 = bArr;
                    i24 = i4;
                    c21248 = c21246;
                    c3376 = c3374;
                    i22 = i16;
                    i21 = i14;
                    c8245 = c8245;
                    c3379 = c3376;
                    break;
                case -38586784:
                case 1018576855:
                    C1080.m4050();
                    RunnableC3646.m11813();
                    c21248 = c21248;
                    c3378 = c3379;
                    c8245 = c8245;
                    int i217 = i24;
                    bArr3 = bArrM35989;
                    i9 = i217;
                    iM31614 = (i20 - C0773.m3169("֡ۘ")) * 31;
                    i10 = ((iM31614 ^ i19) * 29173) ^ 653652862;
                    i17 = -252277898;
                    i22 = iM31614 ^ i17;
                    c8245 = c8245;
                    c3379 = c3378;
                    i21 = i10;
                    c21248 = c21248;
                    byte[] bArr17 = bArr3;
                    i24 = i9;
                    bArrM35989 = bArr17;
                    break;
                case 108666634:
                case 777549676:
                    if (AbstractC3624.f12429 > 0) {
                        iM2761 = C0773.m3169("ۤۤ") ^ i19;
                        i = ((iM2761 ^ i20) * 14675) ^ 248291969;
                        i2 = -2022089121;
                    } else {
                        iM2761 = C0619.m2761("ۗۙ") ^ i19;
                        i = ((iM2761 ^ i20) * 28835) ^ 85962561;
                        i2 = 910977820;
                    }
                    i22 = iM2761 ^ i2;
                    i21 = i;
                    break;
                case 286158767:
                case 1830724122:
                    c2494 = new C2494(c8002);
                    arrayList = c10627.f33709.f73990;
                    if (!RunnableC1848.m6360()) {
                        iM2761 = (C0773.m3169("ۛܺ") + i19) * (-13);
                        i = ((iM2761 ^ i20) * (-29773)) ^ 4279920;
                        i2 = -1536681558;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    } else {
                        c3375 = c3379;
                        c8244 = c8245;
                        int i36 = i24;
                        bArr2 = bArrM35989;
                        i5 = i36;
                        iM31612 = (C0773.m3169("֡۫") + i20) * (-103);
                        i6 = ((iM31612 ^ i19) * 8719) ^ (-47291657);
                        i12 = 1368476401;
                        i13 = iM31612 ^ i12;
                        C3374 c33716 = c3375;
                        i22 = i13;
                        i21 = i6;
                        c8245 = c8244;
                        c3379 = c33716;
                        byte[] bArr18 = bArr2;
                        i24 = i5;
                        bArrM35989 = bArr18;
                    }
                    break;
                case 586415734:
                case 996218452:
                    if (!C2023.f6737) {
                        c21248 = c21248;
                        c3377 = c3379;
                        int i37 = i24;
                        bArr3 = bArrM35989;
                        i9 = i37;
                        iM31611 = C0619.m2761("ۧ֡") ^ i19;
                        i10 = ((iM31611 ^ i20) * (-30601)) ^ (-536400266);
                        i11 = 2131935592;
                        c3379 = c3377;
                        i22 = iM31611 ^ i11;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr19 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr19;
                    } else {
                        c3374 = c3379;
                        c8245 = c8245;
                        int iM31618 = C0773.m3169("ۗ֨") ^ i20;
                        i14 = ((iM31618 ^ i19) * 21919) ^ 1791357992;
                        i16 = iM31618 ^ (-1509067649);
                        c3376 = c3374;
                        i22 = i16;
                        i21 = i14;
                        c8245 = c8245;
                        c3379 = c3376;
                    }
                    break;
                case 686824158:
                case 1571430317:
                    c21247 = c21248;
                    c3375 = c3379;
                    c8244 = c8245;
                    int i38 = i24;
                    bArr2 = bArrM35989;
                    i5 = i38;
                    s = sArr[c];
                    i23 = s * 2;
                    if (C3998.m12920()) {
                        iM31610 = C0773.m3169("ۚۙ") ^ i19;
                        i6 = ((iM31610 ^ i20) * (-26043)) ^ (-129324369);
                        i7 = -593472584;
                    } else {
                        iM31610 = (i19 - C0773.m3169("᩵᩵")) * 85;
                        i6 = ((iM31610 ^ i20) * (-4571)) ^ 1179964791;
                        i7 = -1571296821;
                    }
                    i13 = iM31610 ^ i7;
                    c21248 = c21247;
                    C3374 c33717 = c3375;
                    i22 = i13;
                    i21 = i6;
                    c8245 = c8244;
                    c3379 = c33717;
                    byte[] bArr110 = bArr2;
                    i24 = i5;
                    bArrM35989 = bArr110;
                    break;
                case 900632909:
                case 1925032621:
                    C3099.m10095();
                    break;
                case 1271529867:
                case 1973858770:
                    c21247 = c21248;
                    c3375 = c3379;
                    c8244 = c8245;
                    int i39 = i24;
                    bArr2 = bArrM35989;
                    i5 = i39;
                    sArr = f10699;
                    c = 0;
                    if (AbstractC0116.f1064 <= 0) {
                        iM31610 = (C0773.m3169("ۨ᩷") ^ i19) * (-127);
                        i6 = ((iM31610 ^ i20) * 13947) ^ 39629421;
                        i7 = 72405253;
                    } else {
                        iM31610 = C0773.m3169("᩶ۜ") ^ i20;
                        i6 = ((iM31610 ^ i19) * (-6147)) ^ (-184589864);
                        i7 = 365413175;
                    }
                    i13 = iM31610 ^ i7;
                    c21248 = c21247;
                    C3374 c33718 = c3375;
                    i22 = i13;
                    i21 = i6;
                    c8245 = c8244;
                    c3379 = c33718;
                    byte[] bArr111 = bArr2;
                    i24 = i5;
                    bArrM35989 = bArr111;
                    break;
                case 1411290787:
                case 2124736011:
                    if (!C2878.f9462) {
                        c3375 = c3379;
                        c8244 = c8245;
                        int i310 = i24;
                        bArr2 = bArrM35989;
                        i5 = i310;
                        iM31612 = (C0773.m3169("֡۫") + i20) * (-103);
                        i6 = ((iM31612 ^ i19) * 8719) ^ (-47291657);
                        i12 = 1368476401;
                        i13 = iM31612 ^ i12;
                        C3374 c33719 = c3375;
                        i22 = i13;
                        i21 = i6;
                        c8245 = c8244;
                        c3379 = c33719;
                        byte[] bArr112 = bArr2;
                        i24 = i5;
                        bArrM35989 = bArr112;
                    } else {
                        iM2761 = C0773.m3169("ۨ᩶") ^ i20;
                        i = ((iM2761 ^ i19) * 16829) ^ 1864964305;
                        i2 = 1788733764;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    }
                    break;
                case 1546306163:
                case 1849665308:
                    c3378 = c3379;
                    C3734.m12141(c3378, i25);
                    if (C2287.m7750(c8003)) {
                        int i218 = i24;
                        bArr3 = bArrM35989;
                        i9 = i218;
                        iM31614 = C0619.m2761("᩺ۘ") ^ i20;
                        i10 = ((iM31614 ^ i19) * (-10155)) ^ (-229876201);
                        i17 = 1249658184;
                        i22 = iM31614 ^ i17;
                        c8245 = c8245;
                        c3379 = c3378;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr113 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr113;
                    } else {
                        int iM31619 = (C0773.m3169("֨֫") + i20) * (-125);
                        i21 = ((iM31619 ^ i19) * (-17607)) ^ 798831649;
                        c3379 = c3378;
                        i22 = iM31619 ^ (-589583242);
                    }
                    break;
                default:
                    if (C2354.m7977(c8003) <= 10) {
                        c3378 = c3379;
                        int i219 = i24;
                        bArr3 = bArrM35989;
                        i9 = i219;
                        iM31614 = C0619.m2761("᩺ۘ") ^ i20;
                        i10 = ((iM31614 ^ i19) * (-10155)) ^ (-229876201);
                        i17 = 1249658184;
                        i22 = iM31614 ^ i17;
                        c8245 = c8245;
                        c3379 = c3378;
                        i21 = i10;
                        c21248 = c21248;
                        byte[] bArr114 = bArr3;
                        i24 = i9;
                        bArrM35989 = bArr114;
                    } else {
                        iM2761 = (C0773.m3169("֨ۧ") ^ i19) * (-35);
                        i = ((iM2761 ^ i20) * 32323) ^ 1519636947;
                        i2 = 310760332;
                        i22 = iM2761 ^ i2;
                        i21 = i;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f10704.m27399()) {
            return;
        }
        C10627 c10627 = (C10627) this.f10703;
        C15102 c15102 = c10627.f33708;
        if (c10627.f33709.f73990.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            C13132.m32616(c10627.f33707, c15102, c10627.f33709);
        }
        c15102.mo2272(c10627.f33709);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f10703.f65459.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f10704.m27405();
        AbstractC22044 abstractC22044 = this.f10701;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
    }
}
