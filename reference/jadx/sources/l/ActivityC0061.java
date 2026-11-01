package l;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC0061 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۗ֨ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f942 = {7145, -21791, 17122, 20236, -23549, -23350, -16591, 31303, 19029, -20164, 8617, 15264, -16056, -9121, 6163, 18652, -19816, -16806, 23655, -18238, -20716, 4428, -641, -1678, 5937, -4281, -2152, 5547, 5242, -7830, -7865, -7859, -7846, -7865, -7871, -7872, -7857, -7844, -7849, -7837, -7857, -7872, -7857, -7863, -7861, -7844};

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f943 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C19818 f944;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public List f945 = Collections.EMPTY_LIST;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 80799923;
        int i7 = RunnableC1606.f6488;
        int i8 = C2124.f7782;
        int iM45029 = (C19806.m45029("ۚ᩺") ^ i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i9 = ((iM45029 ^ i8) * (-15897)) ^ (-258626989);
        int i10 = -395151550;
        while (true) {
            i6 = ((((i6 ^ i8) * (-17387)) >> 31) & i9) ^ (iM45029 ^ i10);
            switch (i6) {
                case -2116160468:
                case 371398410:
                    sArr = f942;
                    if (C1461.f5957 <= 0) {
                        iM45029 = C19806.m45029("ۙۚ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-14935)) ^ 604235504;
                        i10 = -665832241;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨۛ") ^ i7) * (-47);
                        i9 = ((iM45029 ^ i8) * 29909) ^ (-1493482110);
                        i10 = 447751720;
                    }
                    break;
                case -1785773320:
                case 1689945677:
                    i4 = 57646;
                    iM45029 = C19806.m45029("᩹ۘ") ^ i7;
                    i9 = ((iM45029 ^ i8) * 5733) ^ (-324909794);
                    i10 = -36118855;
                    break;
                case -1565674244:
                case 372116446:
                    i = s * s2;
                    i2 = s * s;
                    if (C1937.f7317 >= 0) {
                        iM45029 = C19806.m45029("ۙۚ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-14935)) ^ 604235504;
                        i10 = -665832241;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩷ᩳ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-31785)) ^ 1696505820;
                        i10 = 1910506518;
                    }
                    break;
                case -1504858339:
                case 40156792:
                    s = sArr[c];
                    s2 = 12328;
                    if (C1066.f4915 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴܺ") ^ i7) * 15;
                        i9 = ((iM45029 ^ i8) * 24637) ^ (-1149029978);
                        i10 = 1142860534;
                    } else {
                        iM45029 = (i7 - C19806.m45029("᩵ܿ")) * (-13);
                        i9 = ((iM45029 ^ i8) * 3139) ^ 752157505;
                        i10 = -1004924748;
                    }
                    break;
                case -1232324971:
                case 131304625:
                    C10634.m26820();
                    C2704.m8255();
                    iM45029 = C19806.m45029("᩺ۘ") ^ i7;
                    i9 = ((iM45029 ^ i8) * (-1621)) ^ (-979373404);
                    i10 = -821680775;
                    break;
                case -634074290:
                case 1141976140:
                    c = 28;
                    if (C3286.f12186) {
                        iM45029 = (ThreadFactoryC3888.m11306("ᩴܺ") ^ i7) * 15;
                        i9 = ((iM45029 ^ i8) * 24637) ^ (-1149029978);
                        i10 = 1142860534;
                    } else {
                        iM45029 = C19806.m45029("ۤ᩹") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-13529)) ^ (-229994161);
                        i10 = -774448893;
                    }
                    break;
                case -584399753:
                case 1231505076:
                    C19806.m45024();
                    if (C0671.m3008() >= 0) {
                        iM45029 = C19806.m45029("ۙۚ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-14935)) ^ 604235504;
                        i10 = -665832241;
                    } else {
                        iM45029 = C19806.m45029("᩺ۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 11915) ^ 1849181068;
                        i10 = 16839944;
                    }
                    break;
                case -523796746:
                case 1989691551:
                    if (C0629.f2722 > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۧ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 21191) ^ 1501979149;
                        i10 = 1499151633;
                    } else {
                        iM45029 = C19806.m45029("᩺ۘ") ^ i7;
                        i9 = ((iM45029 ^ i8) * (-1621)) ^ (-979373404);
                        i10 = -821680775;
                    }
                    break;
                case -464632418:
                case 1940266397:
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = C19806.m45029("ۙۚ") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-14935)) ^ 604235504;
                        i10 = -665832241;
                    } else {
                        iM45029 = C19806.m45029("ܿ۠") ^ i7;
                        i9 = ((iM45029 ^ i8) * 19593) ^ 1697028710;
                        i10 = -77529016;
                    }
                    break;
                case -315292621:
                case 807108833:
                    if (RunnableC1895.f7152) {
                        iM45029 = (C19806.m45029("ۙܺ") ^ i8) * (-85);
                        i9 = ((iM45029 ^ i7) * (-713)) ^ 260762585;
                        i10 = -1389906768;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۧ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 21191) ^ 1501979149;
                        i10 = 1499151633;
                    }
                    break;
                case -32801254:
                case 1625559326:
                    if (i - (i2 + i3) > 0) {
                        iM45029 = ThreadFactoryC3888.m11306("᩹۠") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-11045)) ^ (-392075815);
                        i10 = 183229808;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢ᩶") ^ i7;
                        i9 = ((iM45029 ^ i8) * 6441) ^ 331842474;
                        i10 = 2052619252;
                    }
                    break;
                case 108580033:
                case 732084356:
                    i3 = 37994896;
                    if (C1461.f5957 <= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۧ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 21191) ^ 1501979149;
                        i10 = 1499151633;
                    } else {
                        iM45029 = C19806.m45029("ۤ֫") ^ i8;
                        i9 = ((iM45029 ^ i7) * (-18303)) ^ (-1447044464);
                        i10 = 394218578;
                    }
                    break;
                case 302789406:
                case 339227868:
                    sArr2 = f942;
                    i5 = 29;
                    if (C3722.m10894() <= 0) {
                        iM45029 = C19806.m45029("᩺ۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 11915) ^ 1849181068;
                        i10 = 16839944;
                    } else {
                        iM45029 = (i8 - ThreadFactoryC3888.m11306("᩸ۤ")) * (-119);
                        i9 = ((iM45029 ^ i7) * (-17247)) ^ 1406856318;
                        i10 = 204201334;
                    }
                    break;
                case 347484433:
                case 921360789:
                    if (RunnableC1895.f7152) {
                        iM45029 = C19806.m45029("۫᩶") ^ i8;
                        i9 = ((iM45029 ^ i7) * 17323) ^ (-322329877);
                        i10 = 673456295;
                    } else {
                        iM45029 = C19806.m45029("᩺ۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 11915) ^ 1849181068;
                        i10 = 16839944;
                    }
                    break;
                case 550684735:
                case 1951443956:
                    RunnableC1895.m6170();
                    ThreadFactoryC3888.m11300();
                    return null;
                case 816604665:
                case 2104713468:
                    i4 = 16883;
                    iM45029 = C19806.m45029("᩹ۘ") ^ i7;
                    i9 = ((iM45029 ^ i8) * 5733) ^ (-324909794);
                    i10 = -36118855;
                    break;
                case 1606374983:
                case 2053855684:
                    if (C0526.f2219) {
                        iM45029 = C19806.m45029("᩺ۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 11915) ^ 1849181068;
                        i10 = 16839944;
                    } else {
                        iM45029 = C19806.m45029("ۛܽ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 1237) ^ 2013142567;
                        i10 = 904119892;
                    }
                    break;
                case 1679723873:
                case 2120461616:
                    return C19806.m45020(sArr2, i5, 17, i4);
                default:
                    if (!C2704.f10408) {
                        iM45029 = ThreadFactoryC3888.m11306("۫ۧ") ^ i7;
                        i9 = ((iM45029 ^ i8) * 21191) ^ 1501979149;
                        i10 = 1499151633;
                    } else {
                        iM45029 = C19806.m45029("᩺ۖ") ^ i8;
                        i9 = ((iM45029 ^ i7) * 11915) ^ 1849181068;
                        i10 = 16839944;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9 A[PHI: r3
      0x00a9: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v2 java.lang.String) binds: [B:27:0x00a7, B:9:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0172 A[PHI: r1 r10 r12 r13
      0x0172: PHI (r1v4 android.view.MenuInflater) = 
      (r1v2 android.view.MenuInflater)
      (r1v3 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
     binds: [B:46:0x0170, B:35:0x00fc, B:31:0x00db, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r10v4 int) = (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:46:0x0170, B:35:0x00fc, B:31:0x00db, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r12v4 short[]) = (r12v2 short[]), (r12v3 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:46:0x0170, B:35:0x00fc, B:31:0x00db, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r13v4 int) = (r13v2 int), (r13v2 int), (r13v3 int), (r13v2 int) binds: [B:46:0x0170, B:35:0x00fc, B:31:0x00db, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01e4 A[PHI: r5 r8 r9
      0x01e4: PHI (r5v4 char) = (r5v3 char), (r5v2 char), (r5v2 char), (r5v2 char), (r5v2 char) binds: [B:58:0x01e2, B:50:0x01a7, B:17:0x0067, B:15:0x0063, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r8v4 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:58:0x01e2, B:50:0x01a7, B:17:0x0067, B:15:0x0063, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r9v4 short) = (r9v2 short), (r9v3 short), (r9v2 short), (r9v2 short), (r9v2 short) binds: [B:58:0x01e2, B:50:0x01a7, B:17:0x0067, B:15:0x0063, B:12:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0211 A[PHI: r6 r7 r18
      0x0211: PHI (r6v4 short) = (r6v3 short), (r6v2 short) binds: [B:54:0x01c6, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r7v4 short) = (r7v3 short), (r7v2 short) binds: [B:54:0x01c6, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r18v4 short[]) = (r18v3 short[]), (r18v5 short[]) binds: [B:54:0x01c6, B:6:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0244 A[PHI: r2
      0x0244: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v7 int) binds: [B:64:0x0242, B:15:0x0063, B:9:0x0054, B:87:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM11306;
        int i;
        int i2;
        int i3 = C10634.f36300;
        int i4 = C2124.f7782;
        int iM45029 = C19806.m45029("᩻ܿ") ^ i4;
        int i5 = ((iM45029 ^ i3) * 589) ^ (-1564045401);
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM45029 ^ (-2105245720);
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1711241802;
        String strM3747 = null;
        int iM450210 = 0;
        while (true) {
            i11 = i6 ^ (i5 & (((i11 ^ i3) * 1613) >> 31));
            switch (i11) {
                case -2097926489:
                case -1310774241:
                    if ((i8 * i8) - i7 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("᩵ᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * 19807) ^ 2023470064;
                        i2 = -1284087340;
                    } else {
                        iM11306 = (i4 - C19806.m45029("۟ۘ")) * (-51);
                        i = ((iM11306 ^ i3) * (-16055)) ^ 2021421088;
                        i2 = 471180742;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2047874940:
                case 1330046800:
                    menuInflater = getMenuInflater();
                    sArr2 = f942;
                    if (C3286.f12186) {
                        iM11306 = (C19806.m45029("۠ۘ") + i4) * (-7);
                        i = ((iM11306 ^ i3) * (-12113)) ^ 1183664177;
                        i2 = -506907162;
                    } else {
                        iM11306 = (C19806.m45029("ۢۧ") ^ i3) * 21;
                        i = ((iM11306 ^ i4) * (-23387)) ^ 817784470;
                        i2 = -1134272981;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -2031523697:
                case 555567215:
                    strM3747 = C0962.m3747(sArr2, i10, 3, i9);
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۠") + i3) * (-73);
                        i = ((iM11306 ^ i4) * (-29751)) ^ (-1668195903);
                        i2 = -389929812;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۤ") ^ i4) * (-75);
                        i = ((iM11306 ^ i3) * (-11049)) ^ 11715589;
                        i2 = -2042006589;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1544507506:
                case 2123975066:
                    i7 = s * s2;
                    s3 = 17306;
                    if (C2249.f8050 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۙܺ")) * (-87);
                        i = ((iM11306 ^ i3) * 17061) ^ 1447029275;
                        i2 = -1450910268;
                    } else {
                        iM11306 = C19806.m45029("᩻ۜ") ^ i4;
                        i = ((iM11306 ^ i3) * (-15983)) ^ 912931933;
                        i2 = -1873850871;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1444568816:
                case -202058018:
                    C2477.m7593();
                    return false;
                case -1398470007:
                case 682044737:
                    c = '\n';
                    if (C1189.f5284 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۙܺ")) * (-87);
                        i = ((iM11306 ^ i3) * 17061) ^ 1447029275;
                        i2 = -1450910268;
                    } else {
                        iM11306 = (C19806.m45029("ܰ᩶") + i4) * (-63);
                        i = ((iM11306 ^ i3) * 29243) ^ 1385888341;
                        i2 = 576510576;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1322309030:
                case 389217773:
                    i10 = 11;
                    if (C0526.f2219) {
                        iM11306 = (C19806.m45029("۠ۘ") + i4) * (-7);
                        i = ((iM11306 ^ i3) * (-12113)) ^ 1183664177;
                        i2 = -506907162;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۛ") ^ i3;
                        i = ((iM11306 ^ i4) * 21773) ^ (-1786700860);
                        i2 = -1642501936;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1306496671:
                case 1728771626:
                    s = sArr[c];
                    s2 = 69224;
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۘܿ")) * 41;
                        i = ((iM11306 ^ i3) * 28487) ^ 1378624182;
                        i2 = -863123005;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ܺ") ^ i3;
                        i = ((iM11306 ^ i4) * 24763) ^ (-5224552);
                        i2 = -1046573451;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1199231947:
                case 1879691700:
                    iM450210 = C19806.m45029(strM3747) ^ 2098950538;
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30681)) ^ (-1854947271);
                        i2 = -1744847574;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM11307 = (ThreadFactoryC3888.m11306("᩷ܽ") + i3) * (-77);
                        i5 = ((iM11307 ^ i4) * (-16527)) ^ 2017528188;
                        i6 = iM11307 ^ 1309524239;
                    }
                    break;
                case -1111978683:
                case 807779788:
                    i9 = 34465;
                    iM11306 = (ThreadFactoryC3888.m11306("᩶۠") + i4) * (-51);
                    i = ((iM11306 ^ i3) * (-17513)) ^ 307449986;
                    i2 = -1364169995;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -997530644:
                case -821163784:
                    menuInflater.inflate(iM450210, menu);
                    return true;
                case -665329644:
                case -182663737:
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30681)) ^ (-1854947271);
                        i2 = -1744847574;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۡ֡") ^ i4) * (-67);
                        i = ((iM11306 ^ i3) * (-14597)) ^ (-1212973392);
                        i2 = 2013267333;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -405277757:
                case -35175761:
                    i8 = s + s3;
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("۠ۘ") + i4) * (-7);
                        i = ((iM11306 ^ i3) * (-12113)) ^ 1183664177;
                        i2 = -506907162;
                    } else {
                        iM11306 = (i3 - C19806.m45029("۫ۘ")) * 47;
                        i = ((iM11306 ^ i4) * (-29327)) ^ (-1725242431);
                        i2 = -1608607075;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -347562617:
                case -322520776:
                    if (C2249.f8050 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30681)) ^ (-1854947271);
                        i2 = -1744847574;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩸۠") + i3) * (-73);
                        i = ((iM11306 ^ i4) * (-29751)) ^ (-1668195903);
                        i2 = -389929812;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 125478638:
                case 687581100:
                    C2871.m8646();
                    iM11306 = (i4 - C19806.m45029("ۙܺ")) * (-87);
                    i = ((iM11306 ^ i3) * 17061) ^ 1447029275;
                    i2 = -1450910268;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 208786209:
                case 419590291:
                    i9 = 45492;
                    iM11306 = (ThreadFactoryC3888.m11306("᩶۠") + i4) * (-51);
                    i = ((iM11306 ^ i3) * (-17513)) ^ 307449986;
                    i2 = -1364169995;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1034269686:
                case 1852452985:
                    RunnableC1606.m5473();
                    if (C3577.f13150 >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۙܺ")) * (-87);
                        i = ((iM11306 ^ i3) * 17061) ^ 1447029275;
                        i2 = -1450910268;
                    } else {
                        iM11306 = (C19806.m45029("۠ۘ") + i4) * (-7);
                        i = ((iM11306 ^ i3) * (-12113)) ^ 1183664177;
                        i2 = -506907162;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 1104983740:
                case 1534092301:
                    if (AbstractC0464.f2088 > 0) {
                        iM11306 = (i4 - C19806.m45029("ۙܺ")) * (-87);
                        i = ((iM11306 ^ i3) * 17061) ^ 1447029275;
                        i2 = -1450910268;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܺۧ") ^ i3;
                        i = ((iM11306 ^ i4) * (-30681)) ^ (-1854947271);
                        i2 = -1744847574;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    sArr = f942;
                    if (C0526.m2437() >= 0) {
                        iM11306 = (i4 - C19806.m45029("ۘܿ")) * 41;
                        i = ((iM11306 ^ i3) * 28487) ^ 1378624182;
                        i2 = -863123005;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ᩳ᩵") + i3) * 75;
                        i = ((iM11306 ^ i4) * (-15035)) ^ 1938036444;
                        i2 = 1539891334;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02ac A[PHI: r1 r3 r4 r5 r16 r17
      0x02ac: PHI (r1v67 short[]) = (r1v5 short[]), (r1v10 short[]), (r1v59 short[]), (r1v68 short[]) binds: [B:67:0x02aa, B:45:0x01cd, B:10:0x007a, B:7:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r3v4 android.widget.ListView) = 
      (r3v2 android.widget.ListView)
      (r3v2 android.widget.ListView)
      (r3v2 android.widget.ListView)
      (r3v5 android.widget.ListView)
     binds: [B:67:0x02aa, B:45:0x01cd, B:10:0x007a, B:7:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r4v6 int) = (r4v2 int), (r4v4 int), (r4v2 int), (r4v2 int) binds: [B:67:0x02aa, B:45:0x01cd, B:10:0x007a, B:7:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r5v5 int) = (r5v2 int), (r5v3 int), (r5v2 int), (r5v2 int) binds: [B:67:0x02aa, B:45:0x01cd, B:10:0x007a, B:7:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r16v5 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:67:0x02aa, B:45:0x01cd, B:10:0x007a, B:7:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x02ac: PHI (r17v5 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:67:0x02aa, B:45:0x01cd, B:10:0x007a, B:7:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM11306;
        int i;
        int i2;
        short[] sArr;
        int iM11307;
        int i3;
        int i4;
        int iM45029;
        int i5;
        int i6 = C0629.f2722;
        int i7 = RunnableC1606.f6488;
        int iM11308 = ThreadFactoryC3888.m11306("ᩳ᩹") ^ i6;
        int i8 = ((iM11308 ^ i7) * (-23641)) ^ (-1339842379);
        ListView listView = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i9 = iM11308 ^ 23783245;
        int i10 = 0;
        int iM450210 = 0;
        int i11 = 0;
        int iM11309 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 781336507;
        short s2 = 0;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i7) * (-21987)) >> 31));
            switch (i17) {
                case -2067806243:
                case 2090751624:
                    i14 = 9827;
                    iM11306 = ThreadFactoryC3888.m11306("᩸ᩴ") ^ i7;
                    i = ((iM11306 ^ i6) * 31) ^ 1634016475;
                    i2 = -1648693670;
                    i9 = iM11306 ^ i2;
                    int i18 = i;
                    sArr3 = sArr3;
                    i8 = i18;
                    break;
                case -1985562235:
                case 1919841918:
                    super.onCreate(bundle);
                    sArr3 = f942;
                    i15 = 1;
                    i16 = 3;
                    if (C19806.f63586) {
                        iM11307 = C19806.m45029("ܶ᩹") ^ i7;
                        i3 = ((iM11307 ^ i6) * (-28399)) ^ (-1817176450);
                        i4 = -1334512308;
                    } else {
                        iM11307 = ThreadFactoryC3888.m11306("ܰ᩶") ^ i6;
                        i3 = ((iM11307 ^ i7) * (-4705)) ^ (-8111004);
                        i4 = 344365689;
                    }
                    i9 = iM11307 ^ i4;
                    i8 = i3;
                    break;
                case -1926742319:
                case -171775148:
                    AbstractC0464.m2313();
                    if (C0050.m946() > 0) {
                        iM11307 = C19806.m45029("ܶ᩹") ^ i7;
                        i3 = ((iM11307 ^ i6) * (-28399)) ^ (-1817176450);
                        i4 = -1334512308;
                        i9 = iM11307 ^ i4;
                        i8 = i3;
                    } else {
                        sArr3 = sArr3;
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۘ") + i6) * 115;
                        i = ((iM11306 ^ i7) * (-16757)) ^ 1510064414;
                        i2 = -52911286;
                        i9 = iM11306 ^ i2;
                        int i19 = i;
                        sArr3 = sArr3;
                        i8 = i19;
                    }
                    break;
                case -1820507795:
                case -257281567:
                    sArr = sArr3;
                    iM11309 = ThreadFactoryC3888.m11306(C1189.m4365(sArr5, 7, 3, i14));
                    if (C0526.f2219) {
                        iM45029 = (ThreadFactoryC3888.m11306("֡ۜ") ^ i7) * 7;
                        i3 = ((iM45029 ^ i6) * (-22285)) ^ 813824358;
                        i5 = 63669828;
                    } else {
                        iM45029 = (C19806.m45029("ܺۡ") + i7) * 37;
                        i3 = ((iM45029 ^ i6) * 12289) ^ 638588112;
                        i5 = -394602459;
                    }
                    int i20 = iM45029 ^ i5;
                    sArr3 = sArr;
                    i9 = i20;
                    i8 = i3;
                    break;
                case -1467688781:
                case 1630332913:
                    sArr3 = sArr3;
                    s = sArr2[c];
                    s2 = 13360;
                    if (!C3577.m10565()) {
                        sArr3 = sArr3;
                        iM11307 = C19806.m45029("ܶ᩹") ^ i7;
                        i3 = ((iM11307 ^ i6) * (-28399)) ^ (-1817176450);
                        i4 = -1334512308;
                        i9 = iM11307 ^ i4;
                        i8 = i3;
                    } else {
                        iM11306 = (i6 - ThreadFactoryC3888.m11306("ܳۤ")) * 15;
                        i = ((iM11306 ^ i7) * (-4271)) ^ (-980672329);
                        i2 = 933988643;
                        i9 = iM11306 ^ i2;
                        int i110 = i;
                        sArr3 = sArr3;
                        i8 = i110;
                    }
                    break;
                case -1382101158:
                case -1355803670:
                    sArr = sArr3;
                    RunnableC0195.m1436(this, C19806.m45029(C0817.m3406(sArr4, i12, i13, i14)) ^ 2129974813);
                    sArr5 = f942;
                    if (C2477.f9839 > 0) {
                        iM45029 = C19806.m45029("᩶᩺") ^ i6;
                        i3 = ((iM45029 ^ i7) * 9551) ^ 1820705316;
                        i5 = -473518111;
                        int i21 = iM45029 ^ i5;
                        sArr3 = sArr;
                        i9 = i21;
                        i8 = i3;
                    } else {
                        sArr3 = sArr;
                        iM11307 = C19806.m45029("ܶ᩹") ^ i7;
                        i3 = ((iM11307 ^ i6) * (-28399)) ^ (-1817176450);
                        i4 = -1334512308;
                        i9 = iM11307 ^ i4;
                        i8 = i3;
                    }
                    break;
                case -1333865498:
                case -873093371:
                    ViewGroupOnHierarchyChangeListenerC1916.m6233();
                    break;
                case -1012963975:
                case 132756475:
                    sArr3 = sArr3;
                    iM450210 = C19806.m45029(C1025.m3859(sArr3, i15, i16, i14));
                    i11 = 2098072502;
                    if (C0050.m946() <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۘ") + i6) * 115;
                        i = ((iM11306 ^ i7) * (-16757)) ^ 1510064414;
                        i2 = -52911286;
                    } else {
                        iM11306 = C19806.m45029("ۡۜ") ^ i7;
                        i = ((iM11306 ^ i6) * 7731) ^ (-799290573);
                        i2 = 822517353;
                    }
                    i9 = iM11306 ^ i2;
                    int i111 = i;
                    sArr3 = sArr3;
                    i8 = i111;
                    break;
                case -845789785:
                case 1450001524:
                    C1377.m4833();
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        sArr3 = sArr3;
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۘ") + i6) * 115;
                        i = ((iM11306 ^ i7) * (-16757)) ^ 1510064414;
                        i2 = -52911286;
                        i9 = iM11306 ^ i2;
                        int i112 = i;
                        sArr3 = sArr3;
                        i8 = i112;
                    } else {
                        sArr = sArr3;
                        iM45029 = C19806.m45029("ᩳܶ") ^ i7;
                        i3 = ((iM45029 ^ i6) * 9555) ^ 2063958670;
                        i5 = 1604992541;
                        int i22 = iM45029 ^ i5;
                        sArr3 = sArr;
                        i9 = i22;
                        i8 = i3;
                    }
                    break;
                case -556690262:
                case 216669948:
                    sArr = sArr3;
                    RunnableC0195.m1436(this, iM450210 ^ i11);
                    sArr4 = f942;
                    i12 = 4;
                    i13 = 3;
                    if (C1189.f5284 <= 0) {
                        iM45029 = C19806.m45029("ᩳܶ") ^ i7;
                        i3 = ((iM45029 ^ i6) * 9555) ^ 2063958670;
                        i5 = 1604992541;
                    } else {
                        iM45029 = (i6 - C19806.m45029("ᩴ֫")) * (-13);
                        i3 = ((iM45029 ^ i7) * (-28149)) ^ 2079061653;
                        i5 = -1404287043;
                    }
                    int i23 = iM45029 ^ i5;
                    sArr3 = sArr;
                    i9 = i23;
                    i8 = i3;
                    break;
                case 4017537:
                case 1233023341:
                    sArr = sArr3;
                    C0526.m2430(this.f41645, new ViewOnClickListenerC0653(1, this));
                    if (C3722.f13525 > 0) {
                        C19818 c19818 = new C19818(this);
                        this.f944 = c19818;
                        listView.setAdapter((ListAdapter) c19818);
                        listView.setOnItemClickListener(this);
                        listView.setOnItemLongClickListener(this);
                    }
                    sArr3 = sArr;
                    iM11306 = (ThreadFactoryC3888.m11306("᩹ۘ") + i6) * 115;
                    i = ((iM11306 ^ i7) * (-16757)) ^ 1510064414;
                    i2 = -52911286;
                    i9 = iM11306 ^ i2;
                    int i113 = i;
                    sArr3 = sArr3;
                    i8 = i113;
                    break;
                case 292594310:
                case 1081483603:
                    C10634.m26820();
                    sArr = sArr3;
                    iM45029 = C19806.m45029("ᩳܶ") ^ i7;
                    i3 = ((iM45029 ^ i6) * 9555) ^ 2063958670;
                    i5 = 1604992541;
                    int i24 = iM45029 ^ i5;
                    sArr3 = sArr;
                    i9 = i24;
                    i8 = i3;
                    break;
                case 302414319:
                case 1995582668:
                    sArr3 = sArr3;
                    sArr2 = f942;
                    c = 0;
                    if (C2704.f10408) {
                        iM11306 = ThreadFactoryC3888.m11306("᩷᩵") ^ i7;
                        i = ((iM11306 ^ i6) * (-23969)) ^ (-849281860);
                        i2 = -1896316937;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۘ") + i6) * 115;
                        i = ((iM11306 ^ i7) * (-16757)) ^ 1510064414;
                        i2 = -52911286;
                    }
                    i9 = iM11306 ^ i2;
                    int i114 = i;
                    sArr3 = sArr3;
                    i8 = i114;
                    break;
                case 349456734:
                case 1190550748:
                    sArr3 = sArr3;
                    if ((s * s2) - ((s * s) + 44622400) <= 0) {
                        iM11306 = C19806.m45029("ᩳ۬") ^ i7;
                        i = ((iM11306 ^ i6) * 2103) ^ (-570317050);
                        i2 = -1823819127;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۤ") ^ i6) * 109;
                        i = ((iM11306 ^ i7) * 1185) ^ (-173715760);
                        i2 = 201090100;
                    }
                    i9 = iM11306 ^ i2;
                    int i115 = i;
                    sArr3 = sArr3;
                    i8 = i115;
                    break;
                case 1110029502:
                case 2025270321:
                    sArr = sArr3;
                    this.f41645 = (C6938) RunnableC0195.m1436(this, 2121110327 ^ iM11309);
                    i10 = R.id.list;
                    if (RunnableC1606.m5473() != 0) {
                        iM45029 = (i6 - C19806.m45029("ۖܺ")) * 17;
                        i3 = ((iM45029 ^ i7) * 22397) ^ 212645451;
                        i5 = -2016933369;
                    } else {
                        iM45029 = C19806.m45029("۬ۖ") ^ i6;
                        i3 = ((iM45029 ^ i7) * (-285)) ^ 1840386428;
                        i5 = 1546060801;
                    }
                    int i25 = iM45029 ^ i5;
                    sArr3 = sArr;
                    i9 = i25;
                    i8 = i3;
                    break;
                case 1304137538:
                case 1555252220:
                    i14 = 60302;
                    iM11306 = ThreadFactoryC3888.m11306("᩸ᩴ") ^ i7;
                    i = ((iM11306 ^ i6) * 31) ^ 1634016475;
                    i2 = -1648693670;
                    i9 = iM11306 ^ i2;
                    int i116 = i;
                    sArr3 = sArr3;
                    i8 = i116;
                    break;
                case 1592034022:
                case 1604573591:
                    if (C0216.f1393 == 0) {
                        sArr = sArr3;
                        iM45029 = (i6 - C19806.m45029("ۖܺ")) * 17;
                        i3 = ((iM45029 ^ i7) * 22397) ^ 212645451;
                        i5 = -2016933369;
                        int i26 = iM45029 ^ i5;
                        sArr3 = sArr;
                        i9 = i26;
                        i8 = i3;
                    }
                    sArr = sArr3;
                    iM45029 = C19806.m45029("ᩳܶ") ^ i7;
                    i3 = ((iM45029 ^ i6) * 9555) ^ 2063958670;
                    i5 = 1604992541;
                    int i27 = iM45029 ^ i5;
                    sArr3 = sArr;
                    i9 = i27;
                    i8 = i3;
                    break;
                default:
                    sArr = sArr3;
                    listView = (ListView) C2332.m7083(this, i10);
                    C0278.m1782(this, this.f41645);
                    C1937.m6275(this);
                    if (!C2704.f10408) {
                        sArr3 = sArr;
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۘ") + i6) * 115;
                        i = ((iM11306 ^ i7) * (-16757)) ^ 1510064414;
                        i2 = -52911286;
                        i9 = iM11306 ^ i2;
                        int i117 = i;
                        sArr3 = sArr3;
                        i8 = i117;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("֫ۙ") ^ i7;
                        i3 = ((iM45029 ^ i6) * (-16095)) ^ 1763305534;
                        i5 = -269865513;
                        int i28 = iM45029 ^ i5;
                        sArr3 = sArr;
                        i9 = i28;
                        i8 = i3;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        List listM12968 = null;
        int i = 386831605;
        int i2 = C1977.f7413;
        int i3 = C0278.f1572;
        int iM11306 = ThreadFactoryC3888.m11306("֫᩺") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-30483)) ^ (-1886196400);
        int i5 = -1380388552;
        while (true) {
            i = ((((i ^ i2) * 30393) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2035690118:
                case 190800080:
                    if (C1189.f5284 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩻") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-17395)) ^ (-885654626);
                        i5 = -976005882;
                    } else {
                        iM11306 = C19806.m45029("ܶ᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-20955)) ^ (-103207997);
                        i5 = -74662590;
                    }
                    break;
                case -2023177810:
                case -1450583353:
                    if (C10634.f36300 >= 0) {
                        iM11306 = C19806.m45029("ۤܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19207) ^ (-1127821200);
                        i5 = -1965586910;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩶ۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30825) ^ (-1557005241);
                        i5 = -1028631445;
                    }
                    break;
                case -1977278372:
                case 1157359442:
                    if (C3743.f13569) {
                        iM11306 = C19806.m45029("ۚۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-8445)) ^ (-1095945811);
                        i5 = 371767545;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18945) ^ (-1410102710);
                        i5 = -665135636;
                    }
                    break;
                case -1973442828:
                case 1113262785:
                    C3743.m10966();
                    if (RunnableC1895.m6170() != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩻") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-17395)) ^ (-885654626);
                        i5 = -976005882;
                    } else {
                        iM11306 = C19806.m45029("ۤܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19207) ^ (-1127821200);
                        i5 = -1965586910;
                    }
                    break;
                case -1905152947:
                case 710224641:
                    listM12968 = C4678.m12968();
                    if (C3660.f13403 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19991)) ^ (-1713945899);
                        i5 = -1112664567;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۜ۟") + i3) * 3;
                        i4 = ((iM11306 ^ i2) * (-31019)) ^ (-1977342481);
                        i5 = 1904111372;
                    }
                    break;
                case -1897645362:
                case -1751098998:
                    C1668.m5583();
                    break;
                case -1603957733:
                case 976282303:
                    C2332.m7079();
                    if (C3722.f13525 > 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18945) ^ (-1410102710);
                        i5 = -665135636;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩻") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-17395)) ^ (-885654626);
                        i5 = -976005882;
                    }
                    break;
                case -1578339558:
                case 1005886515:
                    if (C3743.m10966() <= 0) {
                        iM11306 = (i3 - C19806.m45029("᩺۫")) * (-107);
                        i4 = ((iM11306 ^ i2) * 2073) ^ (-2011261954);
                        i5 = -1968479151;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۨۗ") + i3) * (-69);
                        i4 = ((iM11306 ^ i2) * 24603) ^ 251162208;
                        i5 = 1260302487;
                    }
                    break;
                case -1482450560:
                case -540775392:
                    if (C3722.f13525 <= 0) {
                        iM11306 = C19806.m45029("ۤܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19207) ^ (-1127821200);
                        i5 = -1965586910;
                    } else {
                        iM11306 = C19806.m45029("ۙۘ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 12015) ^ 1769218738;
                        i5 = 1092868209;
                    }
                    break;
                case -1328596880:
                case -901433860:
                    super.onResume();
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚ᩻") + i2) * 27;
                        i4 = ((iM11306 ^ i3) * (-17395)) ^ (-885654626);
                        i5 = -976005882;
                    } else {
                        iM11306 = (C19806.m45029("ܽ᩵") ^ i2) * (-19);
                        i4 = ((iM11306 ^ i3) * 8513) ^ (-1165187058);
                        i5 = -2051529780;
                    }
                    break;
                case -837803492:
                case 321298154:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۘᩴ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 18945) ^ (-1410102710);
                        i5 = -665135636;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֡ܶ") ^ i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM11306 ^ i3) * 29375) ^ (-2082073317);
                        i5 = 1703119923;
                    }
                    break;
                case -567799041:
                case 1667472289:
                    C0278.m1789();
                    iM11306 = C19806.m45029("ۤܳ") ^ i3;
                    i4 = ((iM11306 ^ i2) * 19207) ^ (-1127821200);
                    i5 = -1965586910;
                    break;
                case -273983926:
                case 2050681691:
                    if (!C1461.m5080()) {
                        iM11306 = (i3 - C19806.m45029("᩺۫")) * (-107);
                        i4 = ((iM11306 ^ i2) * 2073) ^ (-2011261954);
                        i5 = -1968479151;
                    } else {
                        iM11306 = C19806.m45029("ۤܳ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19207) ^ (-1127821200);
                        i5 = -1965586910;
                    }
                    break;
                case 689566642:
                case 1304999711:
                    this.f945 = listM12968;
                    this.f944.notifyDataSetChanged();
                    break;
                case 1063848677:
                case 1814132704:
                    if (RunnableC0195.f1321 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19991)) ^ (-1713945899);
                        i5 = -1112664567;
                    } else {
                        iM11306 = C19806.m45029("ܿ֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16801)) ^ 918521521;
                        i5 = 1502347895;
                    }
                    break;
                default:
                    if (RunnableC0195.m1431()) {
                        iM11306 = (C19806.m45029("ܰ᩻") ^ i2) * (-9);
                        i4 = ((iM11306 ^ i3) * (-14803)) ^ (-245350070);
                        i5 = -1816209164;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬ܳ") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-19991)) ^ (-1713945899);
                        i5 = -1112664567;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = null;
        AbstractC20745 abstractC20745M1379 = null;
        int i2 = -1326838914;
        int i3 = RunnableC3388.f12514;
        int i4 = C3577.f13150;
        int iM11306 = ThreadFactoryC3888.m11306("ܳۜ") ^ i4;
        int i5 = ((iM11306 ^ i3) * 6897) ^ (-508224623);
        int i6 = -1045643300;
        while (true) {
            i2 = ((((i2 ^ i3) * (-17501)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1839898955:
                case 1184097287:
                    if (C1419.f5860 < 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۧᩴ")) * (-103);
                        i5 = ((iM11306 ^ i3) * (-25235)) ^ 1484073773;
                        i6 = -826843184;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨֡")) * 17;
                        i5 = ((iM11306 ^ i4) * 18797) ^ 501462929;
                        i6 = 1964689303;
                    }
                    break;
                case -1810370607:
                case 1573705984:
                    abstractC20745M1379 = ((C0176) RunnableC1606.m5478(this.f945, i)).m1379();
                    if (C1461.m5080()) {
                        iM11306 = C19806.m45029("۬۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26935) ^ 1093107421;
                        i6 = -1699647996;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܺ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-23351)) ^ (-1239219119);
                        i6 = -2042378715;
                    }
                    break;
                case -1702729453:
                case -790246935:
                    if (C7105.m18985()) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18887)) ^ (-2143083595);
                        i6 = -1125255138;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۛ᩵")) * (-91);
                        i5 = ((iM11306 ^ i3) * 32429) ^ 674815213;
                        i6 = -403110784;
                    }
                    break;
                case -1405187998:
                case 1403315932:
                    if (C1875.f7103 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18887)) ^ (-2143083595);
                        i6 = -1125255138;
                    } else {
                        iM11306 = C19806.m45029("᩸۬") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-20963)) ^ 1665213197;
                        i6 = 1266171821;
                    }
                    break;
                case -1138861789:
                case 479080911:
                    intent.setData(abstractC20745M1379.m46732());
                    C1419.m4977(this, intent);
                    break;
                case -960232207:
                case 186568369:
                    C2704.m8255();
                    if (C2704.m8255() <= 0) {
                        iM11306 = C19806.m45029("۬۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26935) ^ 1093107421;
                        i6 = -1699647996;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡᩸") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-18887)) ^ (-2143083595);
                        i6 = -1125255138;
                    }
                    break;
                case -910218466:
                case 2038191014:
                    if (!C3286.f12186) {
                        iM11306 = C19806.m45029("۬۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26935) ^ 1093107421;
                        i6 = -1699647996;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨֡")) * 17;
                        i5 = ((iM11306 ^ i4) * 18797) ^ 501462929;
                        i6 = 1964689303;
                    }
                    break;
                case -783045441:
                case -776583542:
                    intent = new Intent(this, (Class<?>) ActivityC9940.class);
                    if (C2124.f7782 <= 0) {
                        iM11306 = C19806.m45029("᩶ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3395) ^ 1782132978;
                        i6 = 144385994;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۙ") ^ i3;
                        i5 = ((iM11306 ^ i4) * 30357) ^ (-2049740432);
                        i6 = -1010000242;
                    }
                    break;
                case -623698302:
                case 1533090694:
                    if (C0797.f3386) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨֡")) * 17;
                        i5 = ((iM11306 ^ i4) * 18797) ^ 501462929;
                        i6 = 1964689303;
                    } else {
                        iM11306 = (C19806.m45029("ܶ᩹") + i3) * 57;
                        i5 = ((iM11306 ^ i4) * 7313) ^ 470436415;
                        i6 = 204783534;
                    }
                    break;
                case -475146401:
                case 862443791:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = C19806.m45029("᩶ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3395) ^ 1782132978;
                        i6 = 144385994;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨۜ") ^ i3;
                        i5 = ((iM11306 ^ i4) * (-28739)) ^ (-1748579262);
                        i6 = 1323689122;
                    }
                    break;
                case -351320750:
                case 576307612:
                    if (AbstractC0464.f2088 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("֨֡")) * 17;
                        i5 = ((iM11306 ^ i4) * 18797) ^ 501462929;
                        i6 = 1964689303;
                    } else {
                        iM11306 = C19806.m45029("ۚܿ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-13735)) ^ (-2019306191);
                        i6 = 2036354729;
                    }
                    break;
                case -2472751:
                case 1353991204:
                    if (C0671.f2816 != 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ۧᩴ")) * (-103);
                        i5 = ((iM11306 ^ i3) * (-25235)) ^ 1484073773;
                        i6 = -826843184;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ܺ")) * 7;
                        i5 = ((iM11306 ^ i4) * (-18325)) ^ (-3513675);
                        i6 = -1786338906;
                    }
                    break;
                case 78725832:
                case 253216572:
                    C2332.m7079();
                    C7105.m18985();
                    iM11306 = ThreadFactoryC3888.m11306("֡᩸") ^ i4;
                    i5 = ((iM11306 ^ i3) * (-18887)) ^ (-2143083595);
                    i6 = -1125255138;
                    break;
                case 172608012:
                case 639660730:
                    C2477.m7593();
                    break;
                case 514284509:
                case 1133571466:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("۬۟") ^ i3;
                        i5 = ((iM11306 ^ i4) * 26935) ^ 1093107421;
                        i6 = -1699647996;
                    } else {
                        iM11306 = C19806.m45029("ۚܳ") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-11273)) ^ 700266262;
                        i6 = 1696062747;
                    }
                    break;
                default:
                    if (C1461.m5080()) {
                        iM11306 = C19806.m45029("᩶ۢ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 3395) ^ 1782132978;
                        i6 = 144385994;
                    } else {
                        iM11306 = (C19806.m45029("᩻ۘ") ^ i3) * 77;
                        i5 = ((iM11306 ^ i4) * (-2077)) ^ (-663793787);
                        i6 = -729340858;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00df A[PHI: r3 r4 r5 r8 r9
      0x00df: PHI (r3v3 int) = (r3v2 int), (r3v2 int), (r3v4 int) binds: [B:30:0x00dd, B:26:0x00bd, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r4v4 int) = (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:30:0x00dd, B:26:0x00bd, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r5v4 int) = (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:30:0x00dd, B:26:0x00bd, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:30:0x00dd, B:26:0x00bd, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int) binds: [B:30:0x00dd, B:26:0x00bd, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x024d A[PHI: r11 r12 r18 r19 r24
      0x024d: PHI (r11v4 int) = (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:94:0x024d, B:62:0x0249, B:57:0x0228, B:16:0x0077, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r12v4 int) = (r12v2 int), (r12v2 int), (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:94:0x024d, B:62:0x0249, B:57:0x0228, B:16:0x0077, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r18v9 short) = (r18v2 short), (r18v4 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:94:0x024d, B:62:0x0249, B:57:0x0228, B:16:0x0077, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r19v6 int) = (r19v2 int), (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:94:0x024d, B:62:0x0249, B:57:0x0228, B:16:0x0077, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r24v5 int) = (r24v3 int), (r24v3 int), (r24v4 int), (r24v3 int), (r24v3 int) binds: [B:94:0x024d, B:62:0x0249, B:57:0x0228, B:16:0x0077, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0289 A[PHI: r6 r17
      0x0289: PHI (r6v6 int) = (r6v2 int), (r6v3 int), (r6v2 int) binds: [B:66:0x0287, B:42:0x0187, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x0289: PHI (r17v6 char) = (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:66:0x0287, B:42:0x0187, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x02bb A[PHI: r1 r14 r15 r16
      0x02bb: PHI (r1v3 int) = (r1v2 int), (r1v2 int), (r1v4 int) binds: [B:93:0x02bb, B:70:0x02b9, B:46:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r14v3 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v4 short[]) binds: [B:93:0x02bb, B:70:0x02b9, B:46:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r15v3 int) = (r15v2 int), (r15v2 int), (r15v4 int) binds: [B:93:0x02bb, B:70:0x02b9, B:46:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x02bb: PHI (r16v4 short[]) = (r16v2 short[]), (r16v3 short[]), (r16v2 short[]) binds: [B:93:0x02bb, B:70:0x02b9, B:46:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM11306;
        int i;
        int i2;
        int i3 = AbstractC0464.f2088;
        int i4 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM11307 = ThreadFactoryC3888.m11306("᩷ۛ") ^ i4;
        int i5 = ((iM11307 ^ i3) * (-15465)) ^ 186017939;
        C20523 c20523 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11307 ^ (-1370904010);
        int iM18990 = 0;
        int i7 = 0;
        int iM11308 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        char c = 0;
        short s = 0;
        int i15 = 0;
        int i16 = 450928492;
        int i17 = 0;
        short[] sArr3 = null;
        int i18 = 0;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i3) * (-27693)) >> 31));
            switch (i16) {
                case -2027970229:
                case 1903257831:
                    i9 = 25;
                    i10 = 3;
                    if (C2642.f10294 <= 0) {
                        iM11306 = (C19806.m45029("ۚۙ") + i3) * (-63);
                        i = ((iM11306 ^ i4) * (-21905)) ^ 935619482;
                        i2 = 1914866085;
                    } else {
                        iM11306 = C19806.m45029("᩻ۧ") ^ i4;
                        i = ((iM11306 ^ i3) * (-24575)) ^ 1982009683;
                        i2 = 1212834629;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1499317763:
                case 1144647210:
                    if (iM18990 == (C19806.m45029(C1419.m4969(sArr, i14, i8, i13)) ^ 2124723667)) {
                        iM11306 = C19806.m45029("ۜ۟") ^ i4;
                        i = ((iM11306 ^ i3) * 23947) ^ (-768687745);
                        i2 = 444273971;
                    } else {
                        iM11306 = C19806.m45029("᩷֫") ^ i4;
                        i = ((iM11306 ^ i3) * (-20247)) ^ (-1215933837);
                        i2 = -798805628;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1283721624:
                case -532163702:
                    i13 = 25186;
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-7);
                    i = ((iM11306 ^ i3) * (-16053)) ^ 2131344371;
                    i2 = 2014047050;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1159091514:
                case 1297903939:
                    C2332.m7079();
                    if (!C2871.m8646()) {
                        iM11306 = (C19806.m45029("ᩴ᩷") + i4) * 73;
                        i = ((iM11306 ^ i3) * 20203) ^ 341978009;
                        i2 = 490926025;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM45029 = C19806.m45029("ܺۨ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-18851)) ^ 1393039087;
                        i6 = iM45029 ^ (-444737902);
                    }
                    break;
                case -1149641977:
                case 436911657:
                    c20523 = new C20523(this, this);
                    sArr2 = f942;
                    if (!C0817.m3399()) {
                        int iM450210 = C19806.m45029("ܺۨ") ^ i4;
                        i5 = ((iM450210 ^ i3) * (-18851)) ^ 1393039087;
                        i6 = iM450210 ^ (-444737902);
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܽܰ") ^ i3;
                        i = ((iM11306 ^ i4) * 15513) ^ 1826306919;
                        i2 = 689125459;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case -1051448334:
                case 895955892:
                    i17 = i15 * i15;
                    i11 = s * s;
                    i12 = 334963204;
                    if (C2477.f9839 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 33;
                        i = ((iM11306 ^ i4) * 21449) ^ 2086039186;
                        i2 = 1336271633;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܿᩴ") ^ i3;
                        i = ((iM11306 ^ i4) * 13895) ^ (-462675833);
                        i2 = 62573562;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -1020377428:
                case 1540917192:
                    int i19 = i11 + i12;
                    if ((i19 + i19) - i17 >= 0) {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩴۛ")) * (-69);
                        i = ((iM11306 ^ i3) * 16285) ^ (-1017862156);
                        i2 = -1612655617;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ᩳ") ^ i3;
                        i = ((iM11306 ^ i4) * (-2595)) ^ 1395689546;
                        i2 = -1205457931;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -748992798:
                case 1149183435:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 33;
                        i = ((iM11306 ^ i4) * 21449) ^ 2086039186;
                        i2 = 1336271633;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۧ") ^ i3) * (-95);
                        i = ((iM11306 ^ i4) * 10089) ^ 1041506636;
                        i2 = 1322762366;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -520243546:
                case 1512888620:
                    iM18990 = C7105.m18990(menuItem);
                    sArr = f942;
                    i14 = 22;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ᩴ᩷") + i4) * 73;
                        i = ((iM11306 ^ i3) * 20203) ^ 341978009;
                        i2 = 490926025;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֫۠") ^ i3;
                        i = ((iM11306 ^ i4) * 877) ^ 96171961;
                        i2 = 1760328218;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -417133955:
                case 2098961962:
                    C1460.m5050();
                    iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 33;
                    i = ((iM11306 ^ i4) * 21449) ^ 2086039186;
                    i2 = 1336271633;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -380940994:
                case 8996145:
                    iM11308 = ThreadFactoryC3888.m11306(C1189.m4365(sArr2, i9, i10, i13));
                    i18 = 2129691908;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (C19806.m45029("ۚۙ") + i3) * (-63);
                        i = ((iM11306 ^ i4) * (-21905)) ^ 935619482;
                        i2 = 1914866085;
                    } else {
                        iM11306 = (C19806.m45029("ۧܰ") + i3) * (-55);
                        i = ((iM11306 ^ i4) * (-30697)) ^ (-49266911);
                        i2 = -299378326;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -323159110:
                case -244877606:
                    c20523.m40376(iM11308 ^ i18);
                    c20523.m40340();
                    i7 = 6;
                    if (C3577.f13150 >= 0) {
                        iM11306 = (C19806.m45029("ۚۙ") + i3) * (-63);
                        i = ((iM11306 ^ i4) * (-21905)) ^ 935619482;
                        i2 = 1914866085;
                    } else {
                        iM11306 = C19806.m45029("ۖ᩺") ^ i4;
                        i = ((iM11306 ^ i3) * (-22479)) ^ 901417700;
                        i2 = 1330837176;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case -296743573:
                case 2064670011:
                    c20523.m40336(i7);
                    c20523.m40368(true);
                    return true;
                case -225263497:
                case -110897066:
                    short s2 = sArr3[c];
                    int i20 = s2 + 18302;
                    if (C0278.f1572 <= 0) {
                        s = s2;
                        i15 = i20;
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 33;
                        i = ((iM11306 ^ i4) * 21449) ^ 2086039186;
                        i2 = 1336271633;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    } else {
                        int iM450211 = C19806.m45029("ۙᩳ") ^ i4;
                        i5 = ((iM450211 ^ i3) * 17703) ^ 100791328;
                        i6 = iM450211 ^ 1616302335;
                        s = s2;
                        i15 = i20;
                    }
                    break;
                case -137659581:
                case 17900821:
                    if (C2788.f10625 >= 0) {
                        int iM450212 = C19806.m45029("ܺۨ") ^ i4;
                        i5 = ((iM450212 ^ i3) * (-18851)) ^ 1393039087;
                        i6 = iM450212 ^ (-444737902);
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ᩻")) * 33;
                        i = ((iM11306 ^ i4) * 21449) ^ 2086039186;
                        i2 = 1336271633;
                        i6 = iM11306 ^ i2;
                        i5 = i;
                    }
                    break;
                case 18680108:
                case 736731057:
                    AbstractC0464.m2313();
                    C7105.m18985();
                    return false;
                case 78632463:
                case 905111328:
                    i13 = 37467;
                    iM11306 = (i4 - ThreadFactoryC3888.m11306("֡۬")) * (-7);
                    i = ((iM11306 ^ i3) * (-16053)) ^ 2131344371;
                    i2 = 2014047050;
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 256410821:
                case 1514591322:
                    sArr3 = f942;
                    if (C2788.f10625 >= 0) {
                        iM11306 = (C19806.m45029("ᩴ᩷") + i4) * 73;
                        i = ((iM11306 ^ i3) * 20203) ^ 341978009;
                        i2 = 490926025;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۙ۬")) * 39;
                        i = ((iM11306 ^ i4) * (-21629)) ^ (-1383067819);
                        i2 = 1604106087;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 475080527:
                case 695481675:
                    c = 21;
                    if (C0629.f2722 <= 0) {
                        iM11306 = (C19806.m45029("ᩴۧ") ^ i3) * (-95);
                        i = ((iM11306 ^ i4) * 10089) ^ 1041506636;
                        i2 = 1322762366;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡᩳ") ^ i4;
                        i = ((iM11306 ^ i3) * (-23457)) ^ (-453673025);
                        i2 = 1401961074;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                case 814644136:
                case 2064750896:
                    i8 = 3;
                    if (C0050.f912 <= 0) {
                        iM11306 = (C19806.m45029("ᩴۧ") ^ i3) * (-95);
                        i = ((iM11306 ^ i4) * 10089) ^ 1041506636;
                        i2 = 1322762366;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۖ") + i3) * (-81);
                        i = ((iM11306 ^ i4) * (-24615)) ^ 2055464386;
                        i2 = -1361307945;
                    }
                    i6 = iM11306 ^ i2;
                    i5 = i;
                    break;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m972(ActivityC0061 activityC0061) {
        List listM12968 = null;
        int i = -1368847431;
        int i2 = AbstractC0464.f2088;
        int i3 = ThreadFactoryC3888.f14547;
        int iM11306 = (ThreadFactoryC3888.m11306("ܳۘ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i4 = ((iM11306 ^ i3) * (-10749)) ^ (-2141810006);
        int i5 = -665262793;
        while (true) {
            i = ((((i ^ i3) * (-13407)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -1369647842:
                case -985277864:
                    if (C0216.m1591() <= 0) {
                        iM11306 = C19806.m45029("ۚۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32401)) ^ 1892130481;
                        i5 = 380957858;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۫ۙ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 7535) ^ (-1952548703);
                        i5 = 1947301464;
                    }
                    break;
                case -1236054744:
                case -1008561741:
                    if (C1148.f5161 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5765) ^ 273910641;
                        i5 = 540787343;
                    } else {
                        iM11306 = C19806.m45029("ܰ᩶") ^ i3;
                        i4 = ((iM11306 ^ i2) * 18793) ^ 370694299;
                        i5 = 300016654;
                    }
                    break;
                case -1207185139:
                case 2001676817:
                    activityC0061.f945 = listM12968;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5765) ^ 273910641;
                        i5 = 540787343;
                    } else {
                        iM11306 = (C19806.m45029("ᩴۧ") + i2) * 7;
                        i4 = ((iM11306 ^ i3) * 561) ^ (-1178253588);
                        i5 = -1681259571;
                    }
                    break;
                case -1200520827:
                case -251421317:
                    activityC0061.f944.notifyDataSetChanged();
                    break;
                case -957338894:
                case -702190040:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i3) * (-33);
                        i4 = ((iM11306 ^ i2) * 12929) ^ (-963795262);
                        i5 = 376027558;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۟᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 20717) ^ (-52718550);
                        i5 = -1786645311;
                    }
                    break;
                case -883404334:
                case 2054474179:
                    C0278.m1789();
                    RunnableC1606.m5473();
                    break;
                case -851544338:
                case -6995494:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13785) ^ 961897979;
                        i5 = 41764671;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("۬᩷") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-27131)) ^ (-325491826);
                        i5 = -163671246;
                    }
                    break;
                case -523177488:
                case 577904914:
                    if (C0216.f1393 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13785) ^ 961897979;
                        i5 = 41764671;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩺ۜ") + i2) * 39;
                        i4 = ((iM11306 ^ i3) * 7865) ^ 1395303641;
                        i5 = -1583181129;
                    }
                    break;
                case -503851477:
                case -249055147:
                    if (C1398.f5802 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i3) * (-33);
                        i4 = ((iM11306 ^ i2) * 12929) ^ (-963795262);
                        i5 = 376027558;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩸") ^ i3;
                        i4 = ((iM11306 ^ i2) * 8367) ^ 47787623;
                        i5 = 556552131;
                    }
                    break;
                case -228101530:
                case -190552595:
                    if (C19806.f63586) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13785) ^ 961897979;
                        i5 = 41764671;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚ۫") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-28463)) ^ (-1475316698);
                        i5 = -1688393797;
                    }
                    break;
                case 13362538:
                case 2019148695:
                    if (!C19806.f63586) {
                        iM11306 = C19806.m45029("ۚۜ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-32401)) ^ 1892130481;
                        i5 = 380957858;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i3) * (-33);
                        i4 = ((iM11306 ^ i2) * 12929) ^ (-963795262);
                        i5 = 376027558;
                    }
                    break;
                case 295239258:
                case 1087874532:
                    if (!C0817.m3399()) {
                        iM11306 = ThreadFactoryC3888.m11306("ۤ᩹") ^ i2;
                        i4 = ((iM11306 ^ i3) * 13785) ^ 961897979;
                        i5 = 41764671;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i3) * (-33);
                        i4 = ((iM11306 ^ i2) * 12929) ^ (-963795262);
                        i5 = 376027558;
                    }
                    break;
                case 1096040293:
                case 1753316367:
                    C1148.m4232();
                    iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i3) * (-33);
                    i4 = ((iM11306 ^ i2) * 12929) ^ (-963795262);
                    i5 = 376027558;
                    break;
                case 1199740748:
                case 1847629242:
                    if (RunnableC0195.m1431()) {
                        iM11306 = C19806.m45029("֡ۛ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9783) ^ 742795649;
                        i5 = -1181363114;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5765) ^ 273910641;
                        i5 = 540787343;
                    }
                    break;
                case 1511981069:
                case 1548305712:
                    if (C2788.f10625 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("۠ۨ") ^ i3) * (-33);
                        i4 = ((iM11306 ^ i2) * 12929) ^ (-963795262);
                        i5 = 376027558;
                    } else {
                        iM11306 = (C19806.m45029("ܽ᩶") ^ i2) * (-87);
                        i4 = ((iM11306 ^ i3) * (-8321)) ^ 1814967612;
                        i5 = -1642724703;
                    }
                    break;
                default:
                    listM12968 = C4678.m12968();
                    if (C0797.f3386) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۧ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 5765) ^ 273910641;
                        i5 = 540787343;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۧܽ")) * 15;
                        i4 = ((iM11306 ^ i3) * (-3263)) ^ 1931780432;
                        i5 = -539183239;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m971(ActivityC0061 activityC0061, C0176 c0176) {
        AbstractC20745 abstractC20745M1379 = null;
        int i = -538037109;
        int i2 = RunnableC0195.f1321;
        int i3 = C3722.f13525;
        int iM11306 = ThreadFactoryC3888.m11306("ᩴۖ") ^ i3;
        int i4 = ((iM11306 ^ i2) * 18339) ^ 1241580137;
        int i5 = 1966723804;
        while (true) {
            i = ((((i ^ i2) * 27387) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2142411682:
                case -1111190979:
                    if (C0629.f2722 <= 0) {
                        iM11306 = C19806.m45029("֡۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22845)) ^ 930977929;
                        i5 = 1672934721;
                    } else {
                        iM11306 = (C19806.m45029("ۢᩴ") ^ i3) * 85;
                        i4 = ((iM11306 ^ i2) * 7673) ^ (-940831760);
                        i5 = -49316923;
                    }
                    break;
                case -2011447380:
                case 1346691044:
                    if (RunnableC1564.f6300) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16119) ^ (-2078630389);
                        i5 = -203678591;
                    } else {
                        iM11306 = (i2 - ThreadFactoryC3888.m11306("ۨ᩵")) * 49;
                        i4 = ((iM11306 ^ i3) * (-3129)) ^ (-1934390329);
                        i5 = -604856648;
                    }
                    break;
                case -1911373459:
                case -1900763714:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16119) ^ (-2078630389);
                        i5 = -203678591;
                    } else {
                        iM11306 = (i2 - C19806.m45029("᩸᩺")) * 97;
                        i4 = ((iM11306 ^ i3) * (-14265)) ^ 717997347;
                        i5 = -290610733;
                    }
                    break;
                case -1521061140:
                case -60234654:
                    if (C0797.f3386) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-12005)) ^ 6136123;
                        i5 = 869024105;
                    } else {
                        iM11306 = C19806.m45029("۫᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * 25373) ^ (-333138407);
                        i5 = -898847302;
                    }
                    break;
                case -1454245054:
                case 1030449772:
                    activityC0061.f945 = C4678.m12968();
                    if (C2332.f8260) {
                        iM11306 = ThreadFactoryC3888.m11306("ۗۘ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 23207) ^ (-17845460);
                        i5 = -369658556;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16119) ^ (-2078630389);
                        i5 = -203678591;
                    }
                    break;
                case -1446555612:
                case -1407171834:
                    C1189.m4368();
                    C2704.m8255();
                    break;
                case -1347142954:
                case -1067215239:
                    C0278.m1789();
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    iM11306 = C19806.m45029("ۖۖ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-9917)) ^ 758085177;
                    i5 = -1933984450;
                    break;
                case -863397761:
                case 1055947659:
                    activityC0061.f944.notifyDataSetChanged();
                    break;
                case -693985413:
                case 1018598783:
                    C1025.m3861();
                    if (!RunnableC1895.f7152) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-12005)) ^ 6136123;
                        i5 = 869024105;
                    } else {
                        iM11306 = C19806.m45029("֡۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22845)) ^ 930977929;
                        i5 = 1672934721;
                    }
                    break;
                case -590291482:
                case 683285375:
                    abstractC20745M1379 = c0176.m1379();
                    if (RunnableC1606.f6488 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܽܽ") ^ i2) * 77;
                        i4 = ((iM11306 ^ i3) * (-12005)) ^ 6136123;
                        i5 = 869024105;
                    } else {
                        iM11306 = (C19806.m45029("᩻ۘ") ^ i2) * 67;
                        i4 = ((iM11306 ^ i3) * (-14437)) ^ (-1870754727);
                        i5 = -965676552;
                    }
                    break;
                case -284005750:
                case 1781308836:
                    if (C0671.f2816 != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16119) ^ (-2078630389);
                        i5 = -203678591;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩺ۨ")) * 93;
                        i4 = ((iM11306 ^ i2) * (-10029)) ^ (-755739793);
                        i5 = -884950297;
                    }
                    break;
                case -253952790:
                case 1384937351:
                    if (C0278.f1572 <= 0) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9917)) ^ 758085177;
                        i5 = -1933984450;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩷֫") ^ i3;
                        i4 = ((iM11306 ^ i2) * 19299) ^ 2143889966;
                        i5 = -106049496;
                    }
                    break;
                case 657503410:
                case 1560507867:
                    RunnableC3388.m10052(abstractC20745M1379);
                    if (C2642.m8171() != 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֡֡") ^ i3;
                        i4 = ((iM11306 ^ i2) * 16119) ^ (-2078630389);
                        i5 = -203678591;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۬֡") + i2) * (-51);
                        i4 = ((iM11306 ^ i3) * (-32497)) ^ (-1493435712);
                        i5 = 1632699524;
                    }
                    break;
                case 891149641:
                case 1458381083:
                    if (RunnableC3388.f12514 >= 0) {
                        iM11306 = C19806.m45029("֡۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22845)) ^ 930977929;
                        i5 = 1672934721;
                    } else {
                        iM11306 = C19806.m45029("۟ܶ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 20487) ^ (-1817535649);
                        i5 = -245793309;
                    }
                    break;
                case 1618705370:
                case 1961641854:
                    if (C2642.f10294 > 0) {
                        iM11306 = C19806.m45029("ۖۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9917)) ^ 758085177;
                        i5 = -1933984450;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۧۢ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9403)) ^ (-1128535877);
                        i5 = 23975953;
                    }
                    break;
                default:
                    C3577.m10565();
                    if (C2332.m7079() <= 0) {
                        iM11306 = C19806.m45029("֡۬") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-22845)) ^ 930977929;
                        i5 = 1672934721;
                    } else {
                        iM11306 = C19806.m45029("ۖۖ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9917)) ^ 758085177;
                        i5 = -1933984450;
                    }
                    break;
            }
            return;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int iM45029;
        int i2;
        int i3;
        String str;
        short s;
        int i4;
        C0176 c0176;
        int i5;
        int i6;
        int i7;
        int i8;
        C0176 c0177;
        C0176 c0178;
        String str2;
        String strM5344;
        int iM450210;
        int i9;
        int i10;
        int i11;
        int iM450211;
        int i12;
        final ActivityC0061 activityC0061 = this;
        View view2 = view;
        int i13 = -1920926294;
        int i14 = C1398.f5802;
        int i15 = C1668.f6641;
        int iM450212 = C19806.m45029("ۢܰ") ^ i14;
        int i16 = ((iM450212 ^ i15) * 21177) ^ 88331564;
        int i17 = iM450212 ^ (-1857935509);
        final String strM1373 = null;
        C12418 c12418M38298 = null;
        String str3 = null;
        short[] sArr = null;
        int i18 = 0;
        final C0176 c0179 = null;
        int i19 = 0;
        int i20 = 0;
        C16195 c16195 = null;
        int i21 = 0;
        int iM11306 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        short s2 = 0;
        int iM11307 = 0;
        InterfaceC21133 interfaceC21133 = null;
        C12418 c12418M38299 = null;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * 4005) >> 31));
            switch (i13) {
                case -2115130403:
                case -648869661:
                    iM11306 = ThreadFactoryC3888.m11306(C10634.m26821(sArr, i23, i21, i19));
                    i22 = 2101084895;
                    if (C1189.f5284 > 0) {
                        iM450211 = C19806.m45029("ܰۘ") ^ i14;
                        i11 = ((iM450211 ^ i15) * (-23215)) ^ (-1236270036);
                        i12 = 1230391146;
                        i17 = iM450211 ^ i12;
                        i16 = i11;
                    } else {
                        str = strM1373;
                        s = s2;
                        i4 = iM11307;
                        i7 = i18;
                        c0176 = c0179;
                        int iM11308 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                        i5 = ((iM11308 ^ i15) * (-159)) ^ (-933966765);
                        i6 = iM11308 ^ (-516193636);
                        s2 = s;
                        i18 = i7;
                        c0179 = c0176;
                        strM1373 = str;
                        i17 = i6;
                        i16 = i5;
                        iM11307 = i4;
                        activityC0061 = this;
                        view2 = view;
                    }
                    break;
                case -1916286495:
                case -1635249707:
                    C12418 c12418 = c12418M38298;
                    iM11307 = ThreadFactoryC3888.m11306(str3) ^ 2098390603;
                    if (C2642.f10294 <= 0) {
                        c12418M38298 = c12418;
                        c0177 = c0179;
                        int iM450213 = (C19806.m45029("֫ۧ") ^ i15) * (-35);
                        i11 = ((iM450213 ^ i14) * 5879) ^ (-1186012302);
                        i17 = iM450213 ^ (-1918512429);
                        activityC0061 = this;
                        c0179 = c0177;
                        i16 = i11;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("ᩴ֨") ^ i15) * 25;
                        c12418M38298 = c12418;
                        i16 = ((iM11309 ^ i14) * 13833) ^ 2069334607;
                        i17 = iM11309 ^ (-1824319528);
                    }
                    break;
                case -1805833905:
                case -1173993145:
                    C1461.m5080();
                    if (C2642.m8171() == 0) {
                        str = strM1373;
                        s = s2;
                        i4 = iM11307;
                        i7 = i18;
                        c0176 = c0179;
                        int iM113010 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                        i5 = ((iM113010 ^ i15) * (-159)) ^ (-933966765);
                        i6 = iM113010 ^ (-516193636);
                        s2 = s;
                        i18 = i7;
                        c0179 = c0176;
                        strM1373 = str;
                        i17 = i6;
                        i16 = i5;
                        iM11307 = i4;
                        activityC0061 = this;
                        view2 = view;
                    } else {
                        strM5344 = str3;
                        str2 = strM1373;
                        i8 = iM11307;
                        c0178 = c0179;
                        iM450210 = C19806.m45029("ᩴ֡") ^ i14;
                        i9 = ((iM450210 ^ i15) * 2247) ^ 800664912;
                        i10 = -883458069;
                        str3 = strM5344;
                        i16 = i9;
                        strM1373 = str2;
                        i17 = iM450210 ^ i10;
                        c0179 = c0178;
                        iM11307 = i8;
                    }
                    break;
                case -1545571153:
                case -1186939980:
                    i19 = 52396;
                    iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i14) * 83;
                    i2 = ((iM45029 ^ i15) * 4383) ^ 1569076763;
                    i3 = 1257193333;
                    c0179 = c0179;
                    iM11307 = iM11307;
                    String str4 = strM1373;
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    strM1373 = str4;
                    break;
                case -1363255696:
                case -941595836:
                    C0526.m2437();
                    if (C2249.f8050 < 0) {
                        c0177 = c0179;
                        i8 = iM11307;
                        int iM113011 = (ThreadFactoryC3888.m11306("ۗۢ") ^ i15) * (-71);
                        C0176 c01710 = c0177;
                        i16 = ((iM113011 ^ i14) * (-31851)) ^ (-255114539);
                        i17 = iM113011 ^ 1766313115;
                        c0179 = c01710;
                        c16195 = null;
                        iM11307 = i8;
                    } else {
                        str = strM1373;
                        s = s2;
                        i4 = iM11307;
                        i7 = i18;
                        c0176 = c0179;
                        int iM113012 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                        i5 = ((iM113012 ^ i15) * (-159)) ^ (-933966765);
                        i6 = iM113012 ^ (-516193636);
                        s2 = s;
                        i18 = i7;
                        c0179 = c0176;
                        strM1373 = str;
                        i17 = i6;
                        i16 = i5;
                        iM11307 = i4;
                        activityC0061 = this;
                        view2 = view;
                    }
                    break;
                case -1295465085:
                case 1166826543:
                    i8 = iM11307;
                    c0177 = (C0176) RunnableC1606.m5478(activityC0061.f945, i);
                    strM1373 = c0177.m1373();
                    if (C3535.m10431() <= 0) {
                        int iM113013 = (ThreadFactoryC3888.m11306("ۗۢ") ^ i15) * (-71);
                        C0176 c01711 = c0177;
                        i16 = ((iM113013 ^ i14) * (-31851)) ^ (-255114539);
                        i17 = iM113013 ^ 1766313115;
                        c0179 = c01711;
                        c16195 = null;
                    } else {
                        i20 = 0;
                        c16195 = new C16195(activityC0061, view2, 0);
                        c12418M38298 = c16195.m38298();
                        if (C1025.m3861() <= 0) {
                            iM11307 = i8;
                            int iM450214 = (C19806.m45029("֫ۧ") ^ i15) * (-35);
                            i11 = ((iM450214 ^ i14) * 5879) ^ (-1186012302);
                            i17 = iM450214 ^ (-1918512429);
                            activityC0061 = this;
                            c0179 = c0177;
                            i16 = i11;
                        } else {
                            int iM113014 = ThreadFactoryC3888.m11306("ܶ۠") ^ i15;
                            c0179 = c0177;
                            i16 = ((iM113014 ^ i14) * (-6847)) ^ (-1446113936);
                            i17 = iM113014 ^ 1107467966;
                            i20 = 0;
                        }
                    }
                    iM11307 = i8;
                    break;
                case -1253871716:
                case -742538068:
                    strM1373 = strM1373;
                    iM11307 = iM11307;
                    c0179 = c0179;
                    int i25 = i24 + 9610000;
                    if ((i25 + i25) - i18 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ܰ᩸") ^ i15;
                        i2 = ((iM45029 ^ i14) * (-439)) ^ (-1267865757);
                        i3 = 330181734;
                    } else {
                        iM45029 = (C19806.m45029("֫֡") + i15) * (-113);
                        i2 = ((iM45029 ^ i14) * (-3205)) ^ 1897127513;
                        i3 = -2121402764;
                    }
                    c0179 = c0179;
                    iM11307 = iM11307;
                    String str5 = strM1373;
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    strM1373 = str5;
                    break;
                case -1168650728:
                case 53789880:
                    str = strM1373;
                    s = s2;
                    i4 = iM11307;
                    c0176 = c0179;
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        int iM450215 = C19806.m45029("ܶ᩻") ^ i15;
                        i5 = ((iM450215 ^ i14) * 13423) ^ 1091405654;
                        i6 = iM450215 ^ (-1752943204);
                        s2 = s;
                    } else {
                        i7 = i18;
                        int iM113015 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                        i5 = ((iM113015 ^ i15) * (-159)) ^ (-933966765);
                        i6 = iM113015 ^ (-516193636);
                        s2 = s;
                        i18 = i7;
                    }
                    c0179 = c0176;
                    strM1373 = str;
                    i17 = i6;
                    i16 = i5;
                    iM11307 = i4;
                    activityC0061 = this;
                    view2 = view;
                    break;
                case -1064960263:
                case 1648596799:
                    int i26 = iM11306 ^ i22;
                    ThreadFactoryC3888.m11301(c12418M38299, i20, i26, i20, i26);
                    interfaceC21133 = new InterfaceC21133() { // from class: l.۟֡ۨ
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // l.InterfaceC21133
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i27 = ActivityC0061.f943;
                            int itemId = menuItem.getItemId();
                            ActivityC0061 activityC0062 = this.f23814;
                            String str6 = strM1373;
                            C0176 c01712 = c0179;
                            int i28 = 1;
                            if (itemId == bin.mt.plus.R.string.MT_Protector) {
                                C15585 c15585 = new C15585(activityC0062, activityC0062, str6, c01712);
                                c15585.m40376(bin.mt.plus.R.string.MT_Protector);
                                c15585.m40346((CharSequence) str6);
                                c15585.m40340();
                                c15585.m40336(6);
                                c15585.m40355();
                                c15585.m40368(true);
                                return true;
                            }
                            int i29 = DialogInterfaceC19356.f62401;
                            C8067 c8067 = new C8067(activityC0062);
                            c8067.m21274(bin.mt.plus.R.string.MT_Protector);
                            c8067.m21261(activityC0062.getString(bin.mt.plus.R.string.MT_Protector, str6));
                            c8067.m21251(bin.mt.plus.R.string.MT_Protector, new DialogInterfaceOnClickListenerC20418(i28, activityC0062, c01712));
                            c8067.m21275(bin.mt.plus.R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c8067.m21269();
                            return true;
                        }
                    };
                    if (C3577.f13150 >= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i15) * 9;
                        i11 = ((iM450211 ^ i14) * 4749) ^ (-1170550348);
                        i12 = -1573759811;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ۛܶ") ^ i15) * (-11);
                        i11 = ((iM450211 ^ i14) * (-29775)) ^ (-2142462375);
                        i12 = 1311682320;
                    }
                    i17 = iM450211 ^ i12;
                    i16 = i11;
                    break;
                case -902934304:
                case -191009360:
                    C1025.m3861();
                    if (C1977.f7413 <= 0) {
                        strM5344 = str3;
                        str2 = strM1373;
                        i8 = iM11307;
                        c0178 = c0179;
                        iM450210 = C19806.m45029("ᩴ֡") ^ i14;
                        i9 = ((iM450210 ^ i15) * 2247) ^ 800664912;
                        i10 = -883458069;
                        str3 = strM5344;
                        i16 = i9;
                        strM1373 = str2;
                        i17 = iM450210 ^ i10;
                        c0179 = c0178;
                        iM11307 = i8;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i15) * 9;
                        i11 = ((iM450211 ^ i14) * 4749) ^ (-1170550348);
                        i12 = -1573759811;
                        i17 = iM450211 ^ i12;
                        i16 = i11;
                    }
                    break;
                case -713518005:
                case 1613738035:
                    i8 = iM11307;
                    c0178 = c0179;
                    str2 = strM1373;
                    strM5344 = RunnableC1564.m5344(f942, 15, 3, i19);
                    if (C0671.f2816 != 0) {
                        iM450210 = C19806.m45029("ᩴ֡") ^ i14;
                        i9 = ((iM450210 ^ i15) * 2247) ^ 800664912;
                        i10 = -883458069;
                    } else {
                        iM450210 = (i14 - C19806.m45029("ܶܺ")) * (-127);
                        i9 = ((iM450210 ^ i15) * (-17713)) ^ (-946314098);
                        i10 = 1046782828;
                    }
                    str3 = strM5344;
                    i16 = i9;
                    strM1373 = str2;
                    i17 = iM450210 ^ i10;
                    c0179 = c0178;
                    iM11307 = i8;
                    break;
                case -680506445:
                case 2034313160:
                    str = strM1373;
                    i4 = iM11307;
                    c0176 = c0179;
                    s = s2;
                    int i27 = s + 3100;
                    i7 = i27 * i27;
                    i24 = s * s;
                    if (!C0962.f3784) {
                        int iM450216 = C19806.m45029("۫᩺") ^ i14;
                        int i28 = ((iM450216 ^ i15) * (-30955)) ^ (-1937479519);
                        i18 = i7;
                        c0179 = c0176;
                        strM1373 = str;
                        iM11307 = i4;
                        i17 = iM450216 ^ (-123207234);
                        s2 = s;
                        i16 = i28;
                        activityC0061 = this;
                    } else {
                        int iM113016 = ThreadFactoryC3888.m11306("ܿ۠") ^ i14;
                        i5 = ((iM113016 ^ i15) * (-159)) ^ (-933966765);
                        i6 = iM113016 ^ (-516193636);
                        s2 = s;
                        i18 = i7;
                        c0179 = c0176;
                        strM1373 = str;
                        i17 = i6;
                        i16 = i5;
                        iM11307 = i4;
                        activityC0061 = this;
                        view2 = view;
                    }
                    break;
                case -532581445:
                case 273769986:
                    C1398.m4895();
                    C1189.m4368();
                    iM450211 = (ThreadFactoryC3888.m11306("ܽۗ") ^ i15) * 9;
                    i11 = ((iM450211 ^ i14) * 4749) ^ (-1170550348);
                    i12 = -1573759811;
                    i17 = iM450211 ^ i12;
                    i16 = i11;
                    break;
                case -481676390:
                case 1504102123:
                    C12418 c12419 = c12418M38298;
                    i8 = iM11307;
                    ThreadFactoryC3888.m11301(c12419, i20, i8, i20, i8);
                    c12418M38299 = c16195.m38298();
                    sArr = f942;
                    i23 = 18;
                    if (C1668.f6641 >= 0) {
                        c12418M38298 = c12419;
                        c0178 = c0179;
                        str2 = strM1373;
                        i21 = 3;
                        strM5344 = str3;
                        iM450210 = C19806.m45029("ᩴ֡") ^ i14;
                        i9 = ((iM450210 ^ i15) * 2247) ^ 800664912;
                        i10 = -883458069;
                        str3 = strM5344;
                        i16 = i9;
                        strM1373 = str2;
                        i17 = iM450210 ^ i10;
                        c0179 = c0178;
                        iM11307 = i8;
                    } else {
                        int iM113017 = (ThreadFactoryC3888.m11306("᩶֫") + i14) * (-39);
                        int i29 = ((iM113017 ^ i15) * 21849) ^ 463852427;
                        i17 = iM113017 ^ (-1240073535);
                        c12418M38298 = c12419;
                        iM11307 = i8;
                        i16 = i29;
                        i21 = 3;
                    }
                    break;
                case -243778448:
                case 1246846644:
                    C1937.m6279();
                    C1025.m3861();
                    return false;
                case 16655110:
                case 110289401:
                    String str6 = strM1373;
                    i8 = iM11307;
                    C0176 c01712 = c0179;
                    s2 = f942[14];
                    if (!C3743.f13569) {
                        c0177 = c01712;
                        strM1373 = str6;
                        iM11307 = i8;
                        int iM450217 = (C19806.m45029("֫ۧ") ^ i15) * (-35);
                        i11 = ((iM450217 ^ i14) * 5879) ^ (-1186012302);
                        i17 = iM450217 ^ (-1918512429);
                        activityC0061 = this;
                        c0179 = c0177;
                        i16 = i11;
                    } else {
                        int iM450218 = (C19806.m45029("ۖ֫") + i14) * (-123);
                        i16 = ((iM450218 ^ i15) * (-13425)) ^ 762747376;
                        c0179 = c01712;
                        strM1373 = str6;
                        i17 = iM450218 ^ 891790098;
                        iM11307 = i8;
                        activityC0061 = this;
                    }
                    break;
                case 865144420:
                case 1171490180:
                    c16195.m38296(interfaceC21133);
                    C2766.m8440(view2, c16195);
                    return true;
                default:
                    i19 = 50512;
                    iM45029 = (ThreadFactoryC3888.m11306("ۤۙ") + i14) * 83;
                    i2 = ((iM45029 ^ i15) * 4383) ^ 1569076763;
                    i3 = 1257193333;
                    c0179 = c0179;
                    iM11307 = iM11307;
                    String str7 = strM1373;
                    i17 = iM45029 ^ i3;
                    i16 = i2;
                    strM1373 = str7;
                    break;
            }
        }
    }
}
