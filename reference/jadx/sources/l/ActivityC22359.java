package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩷᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 72SJ */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC22359 extends AbstractActivityC17204 implements TextWatcher {

    /* JADX INFO: renamed from: ܳۧۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f72372 = {8227, -13679, 12, -8384, 8735, -15060, 11577, 3527, 15666, -14216, 24345, 24325, 24348, 24334, 24320, 24327, 24352, 24333, 24327, 24328, 24324, 24332, 24352, 24327, 24349, 24332, 24327, 24349, 24393, 24332, 24347, 24347, 24326, 24347, -16367, 13573, 1857, -16103, 1651, 14027, 4575, 2895, -13656, 20, -14469, -10801, 7210, 17300, -17892, 20003, 23190, 25111, -18121, 7563, -19259, -23182, -31552, -21741, 20679, -16881, 18398, 17548, -27581, -9658, -9657, -9660, 2317, -24839, -24872, -24885, -24872, -24879, -24878, -24883, -24872, -24881, -24840, -24871, -24876, -24887, -24836, -24866, -24887, -24876, -24885, -24876, -24887, -24892};

    /* JADX INFO: renamed from: ܽ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72373 = 0;

    /* JADX INFO: renamed from: ֫᩷, reason: not valid java name and contains not printable characters */
    public String f72374;

    /* JADX INFO: renamed from: ۚ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72375;

    /* JADX INFO: renamed from: ۧ᩷, reason: not valid java name and contains not printable characters */
    public TabLayout f72376;

    /* JADX INFO: renamed from: ۫᩷, reason: not valid java name and contains not printable characters */
    public View f72377;

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public long f72378;

    /* JADX INFO: renamed from: ܺ᩷, reason: not valid java name and contains not printable characters */
    public C15179 f72379;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f72380;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public View f72381;

    /* JADX INFO: renamed from: ᩻᩷, reason: not valid java name and contains not printable characters */
    public boolean f72382;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -92833631;
        int i5 = C1783.f6087;
        int i6 = C2287.f7432;
        int iM3169 = (C0773.m3169("۠۫") + i6) * 123;
        int i7 = ((iM3169 ^ i5) * 32701) ^ 1705184002;
        int i8 = 876270787;
        while (true) {
            i4 = ((((i4 ^ i5) * 22767) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1783927392:
                case 1467170411:
                    C1783.m6232();
                    iM3169 = (C0773.m3169("ۜ֡") + i6) * 13;
                    i7 = ((iM3169 ^ i5) * (-28681)) ^ 841182169;
                    i8 = -105972875;
                    break;
                case -1590878496:
                case 1236999121:
                    if (RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("᩶ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-31629)) ^ 961823220;
                        i8 = 735560374;
                    } else {
                        iM3169 = (C0773.m3169("۟ܰ") + i5) * (-47);
                        i7 = ((iM3169 ^ i6) * 24507) ^ 684415506;
                        i8 = -1039906623;
                    }
                    break;
                case -1573104106:
                case -378370002:
                    if (C1826.m6301() >= 0) {
                        iM3169 = (C0619.m2761("ۧܿ") + i6) * (-79);
                        i7 = ((iM3169 ^ i5) * (-11979)) ^ (-1119086795);
                        i8 = -77245253;
                    } else {
                        iM3169 = C0773.m3169("ܿܺ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 17189) ^ (-140081617);
                        i8 = -118088710;
                    }
                    break;
                case -1413257313:
                case 2065113670:
                    C0773.m3161();
                    if (C2485.f7950 == 0) {
                        iM3169 = (C0773.m3169("۟ۤ") ^ i5) * (-15);
                        i7 = ((iM3169 ^ i6) * 18611) ^ 1963880021;
                        i8 = 860028227;
                    } else {
                        iM3169 = (C0773.m3169("ۜ֡") + i6) * 13;
                        i7 = ((iM3169 ^ i5) * (-28681)) ^ 841182169;
                        i8 = -105972875;
                    }
                    break;
                case -1402192483:
                case -614846977:
                    if (C1146.m4231()) {
                        iM3169 = C0773.m3169("ܰۛ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 3089) ^ (-2080375362);
                        i8 = 1819779677;
                    } else {
                        iM3169 = (C0619.m2761("ۧܿ") + i6) * (-79);
                        i7 = ((iM3169 ^ i5) * (-11979)) ^ (-1119086795);
                        i8 = -77245253;
                    }
                    break;
                case -1074236577:
                case 2043118111:
                    if (C3448.f11240 >= 0) {
                        iM3169 = C0773.m3169("᩶ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-31629)) ^ 961823220;
                        i8 = 735560374;
                    } else {
                        iM3169 = C0773.m3169("ۛۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 6745) ^ (-959425373);
                        i8 = -417790822;
                    }
                    break;
                case -971661818:
                case 1592008915:
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (C0773.m3169("۟ۤ") ^ i5) * (-15);
                        i7 = ((iM3169 ^ i6) * 18611) ^ 1963880021;
                        i8 = 860028227;
                    } else {
                        iM3169 = (C0619.m2761("᩸ۗ") ^ i5) * (-57);
                        i7 = ((iM3169 ^ i6) * (-14019)) ^ (-1215555556);
                        i8 = -708663870;
                    }
                    break;
                case -351460045:
                case 2028036648:
                    if (C3033.f9831 >= 0) {
                        iM3169 = C0773.m3169("᩶ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-31629)) ^ 961823220;
                        i8 = 735560374;
                    } else {
                        iM3169 = C0619.m2761("ܿۢ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 4461) ^ 1854420046;
                        i8 = 2131233689;
                    }
                    break;
                case -329197057:
                case 2125398997:
                    break;
                case 7501146:
                case 2022760579:
                    C2419.m8174();
                    break;
                case 525628411:
                case 1801875610:
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0773.m3169("᩶ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-31629)) ^ 961823220;
                        i8 = 735560374;
                    } else {
                        iM3169 = (C0773.m3169("ۜ֡") + i6) * 13;
                        i7 = ((iM3169 ^ i5) * (-28681)) ^ 841182169;
                        i8 = -105972875;
                    }
                    break;
                case 601948380:
                case 1166061404:
                    if (C3734.f12817 >= 0) {
                        iM3169 = C0773.m3169("᩶ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-31629)) ^ 961823220;
                        i8 = 735560374;
                    } else {
                        iM3169 = (C0773.m3169("ܽۜ") ^ i5) * 11;
                        i7 = ((iM3169 ^ i6) * (-7151)) ^ (-1114051973);
                        i8 = -1854981053;
                    }
                    break;
                case 676166801:
                case 2045412341:
                    if (C2966.f9654 >= 0) {
                        iM3169 = (C0773.m3169("۟ۤ") ^ i5) * (-15);
                        i7 = ((iM3169 ^ i6) * 18611) ^ 1963880021;
                        i8 = 860028227;
                    } else {
                        iM3169 = C0619.m2761("ۢܳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-25461)) ^ 1648374586;
                        i8 = -979898940;
                    }
                    break;
                case 893158892:
                case 1051914606:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۜ֡") + i6) * 13;
                        i7 = ((iM3169 ^ i5) * (-28681)) ^ 841182169;
                        i8 = -105972875;
                    } else {
                        iM3169 = (C0773.m3169("ۤۨ") ^ i6) * 61;
                        i7 = ((iM3169 ^ i5) * (-16465)) ^ 16544820;
                        i8 = 1134511519;
                    }
                    break;
                case 1728987637:
                case 2031885927:
                    if (C17202.f56030) {
                        iM3169 = C0619.m2761("ۘܿ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 279) ^ 502425292;
                        i8 = 1652149760;
                    } else {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 457) ^ (-1598051328);
                        i8 = 558965322;
                    }
                    break;
                default:
                    if (C2354.f7599 >= 0) {
                        iM3169 = C0619.m2761("᩶ۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 457) ^ (-1598051328);
                        i8 = 558965322;
                    } else {
                        iM3169 = C0773.m3169("᩶ۖ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-31629)) ^ 961823220;
                        i8 = 735560374;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        short[] sArr2 = null;
        int i3 = 0;
        int i4 = 81668971;
        int i5 = C1519.f5300;
        int i6 = AbstractC3624.f12429;
        int iM3169 = C0773.m3169("ۜ֡") ^ i6;
        int i7 = ((iM3169 ^ i5) * 6125) ^ 571504124;
        int i8 = -1545110946;
        while (true) {
            i4 = ((((i4 ^ i5) * (-23471)) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -1452860323:
                case -938653500:
                    s3 = 23836;
                    if (C0487.f2131 <= 0) {
                        iM3169 = (C0773.m3169("ۚۤ") ^ i5) * 95;
                        i7 = ((iM3169 ^ i6) * (-1645)) ^ 471519888;
                        i8 = 1117020348;
                    } else {
                        iM3169 = C0773.m3169("ܰۖ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-1765)) ^ 1987662727;
                        i8 = 165013777;
                    }
                    break;
                case -1451325806:
                case 446579229:
                    C2288.m7767();
                    C2375.m8065();
                    return null;
                case -1387634473:
                case 1382028340:
                    RunnableC3055.m9933();
                    iM3169 = (C0773.m3169("ۛ᩺") ^ i6) * (-35);
                    i7 = ((iM3169 ^ i5) * (-26881)) ^ (-868811635);
                    i8 = 922783571;
                    break;
                case -1313639277:
                case 594434972:
                    return C20932.m47853(sArr2, i3, 21, i2);
                case -858440828:
                case 464723952:
                    C2287.m7745();
                    if (!C2878.f9462) {
                        iM3169 = (i6 - C0619.m2761("۠ۜ")) * 57;
                        i7 = ((iM3169 ^ i5) * (-8483)) ^ (-1414877167);
                        i8 = -1464076312;
                    } else {
                        iM3169 = (C0773.m3169("ۚۤ") ^ i5) * 95;
                        i7 = ((iM3169 ^ i6) * (-1645)) ^ 471519888;
                        i8 = 1117020348;
                    }
                    break;
                case -743490881:
                case 1996736214:
                    AbstractC0641.m2813();
                    if (C3690.f12684 <= 0) {
                        iM3169 = C0619.m2761("ۧۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11125) ^ 2127996372;
                        i8 = 330004334;
                    } else {
                        iM3169 = (C0773.m3169("ۚۤ") ^ i5) * 95;
                        i7 = ((iM3169 ^ i6) * (-1645)) ^ 471519888;
                        i8 = 1117020348;
                    }
                    break;
                case -693396344:
                case 52716238:
                    if ((s * s3) - i > 0) {
                        iM3169 = (C0773.m3169("֨ܽ") ^ i5) * 77;
                        i7 = ((iM3169 ^ i6) * (-25679)) ^ (-1369931061);
                        i8 = -759935510;
                    } else {
                        iM3169 = (C0619.m2761("֨۫") ^ i6) * 63;
                        i7 = ((iM3169 ^ i5) * 12999) ^ (-1751912434);
                        i8 = -275926188;
                    }
                    break;
                case -401962031:
                case 2277853:
                    sArr = f72372;
                    if (RunnableC1848.f6235) {
                        iM3169 = (i6 - C0619.m2761("۠ۜ")) * 57;
                        i7 = ((iM3169 ^ i5) * (-8483)) ^ (-1414877167);
                        i8 = -1464076312;
                    } else {
                        iM3169 = C0773.m3169("ۗܺ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 31509) ^ (-1002989920);
                        i8 = -682145097;
                    }
                    break;
                case -364516152:
                case 401861739:
                    i2 = 4765;
                    iM3169 = C0619.m2761("᩺ᩴ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 10555) ^ 2114642749;
                    i8 = 1736652669;
                    break;
                case -237726219:
                case 194302494:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0619.m2761("ۘۗ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-7491)) ^ (-809270261);
                        i8 = 1022244835;
                    } else {
                        iM3169 = C0773.m3169("ۚܳ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-17525)) ^ (-337126422);
                        i8 = 101241580;
                    }
                    break;
                case 136905163:
                case 865138565:
                    if (C1080.f3865 >= 0) {
                        iM3169 = C0619.m2761("ۘۗ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-7491)) ^ (-809270261);
                        i8 = 1022244835;
                    } else {
                        iM3169 = C0773.m3169("ᩴۚ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 32097) ^ (-1939638289);
                        i8 = -775505689;
                    }
                    break;
                case 242673434:
                case 1327903542:
                    C2375.m8065();
                    if (C3033.f9831 < 0) {
                        iM3169 = (C0773.m3169("ۚۤ") ^ i5) * 95;
                        i7 = ((iM3169 ^ i6) * (-1645)) ^ 471519888;
                        i8 = 1117020348;
                    } else {
                        iM3169 = (C0773.m3169("ۛ᩺") ^ i6) * (-35);
                        i7 = ((iM3169 ^ i5) * (-26881)) ^ (-868811635);
                        i8 = 922783571;
                    }
                    break;
                case 482535782:
                case 1754358759:
                    int i9 = s + s2;
                    i = i9 * i9;
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ۧۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11125) ^ 2127996372;
                        i8 = 330004334;
                    } else {
                        iM3169 = (i6 - C0619.m2761("ᩴ۟")) * 99;
                        i7 = ((iM3169 ^ i5) * 12129) ^ 547291227;
                        i8 = -232834464;
                    }
                    break;
                case 653926917:
                case 745362317:
                    sArr2 = f72372;
                    i3 = 67;
                    if (C3779.f12953 <= 0) {
                        iM3169 = C0619.m2761("ۧۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11125) ^ 2127996372;
                        i8 = 330004334;
                    } else {
                        iM3169 = (C0619.m2761("ܿ۬") + i5) * 91;
                        i7 = ((iM3169 ^ i6) * 29157) ^ (-162953527);
                        i8 = 1361169944;
                    }
                    break;
                case 991853018:
                case 1543580589:
                    s = sArr[c];
                    s2 = 5959;
                    if (RunnableC3646.f12471) {
                        iM3169 = C0619.m2761("ۘۗ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-7491)) ^ (-809270261);
                        i8 = 1022244835;
                    } else {
                        iM3169 = (C0619.m2761("ܿ᩶") + i5) * 3;
                        i7 = ((iM3169 ^ i6) * 9179) ^ (-1788953447);
                        i8 = -2101589148;
                    }
                    break;
                case 994215306:
                case 1454431413:
                    c = 'B';
                    if (RunnableC0334.f1808 <= 0) {
                        iM3169 = (C0773.m3169("ۛ᩺") ^ i6) * (-35);
                        i7 = ((iM3169 ^ i5) * (-26881)) ^ (-868811635);
                        i8 = 922783571;
                    } else {
                        iM3169 = C0619.m2761("ۜܳ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-31425)) ^ (-1509228503);
                        i8 = -463457742;
                    }
                    break;
                case 1089763299:
                case 1397932629:
                    i2 = 40637;
                    iM3169 = C0619.m2761("᩺ᩴ") ^ i6;
                    i7 = ((iM3169 ^ i5) * 10555) ^ 2114642749;
                    i8 = 1736652669;
                    break;
                case 1306862271:
                case 1426769905:
                    if (C3099.m10095()) {
                        iM3169 = C0619.m2761("ۧۜ") ^ i5;
                        i7 = ((iM3169 ^ i6) * 11125) ^ 2127996372;
                        i8 = 330004334;
                    } else {
                        iM3169 = (C0773.m3169("֨ۨ") ^ i6) * 25;
                        i7 = ((iM3169 ^ i5) * 2981) ^ 2084914246;
                        i8 = 1015332559;
                    }
                    break;
                default:
                    if (C1826.f6190 <= 0) {
                        iM3169 = (C0773.m3169("ۚۤ") ^ i5) * 95;
                        i7 = ((iM3169 ^ i6) * (-1645)) ^ 471519888;
                        i8 = 1117020348;
                    } else {
                        iM3169 = C0619.m2761("ۚ᩹") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-3445)) ^ 1729541669;
                        i8 = 782953237;
                    }
                    break;
            }
        }
    }

    public ActivityC22359() {
        ArrayList arrayList = null;
        int i = -87744397;
        int i2 = C3734.f12817;
        int i3 = C1321.f4751;
        int iM3169 = C0773.m3169("ᩴ᩷") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-1099)) ^ (-661943296);
        int i5 = -72815621;
        while (true) {
            i = ((((i ^ i2) * (-11033)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -2110408600:
                case 1868926062:
                    if (C1080.f3865 >= 0) {
                        iM3169 = (C0773.m3169("ۛܺ") + i3) * (-107);
                        i4 = ((iM3169 ^ i2) * (-17545)) ^ (-1371294450);
                        i5 = -1011713794;
                    } else {
                        iM3169 = C0773.m3169("ܿ֫") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-973)) ^ 353473083;
                        i5 = 2127438580;
                    }
                    break;
                case -2109541429:
                case -459157108:
                    if (AbstractC0116.f1064 <= 0) {
                        iM3169 = (i3 - C0619.m2761("ۢۢ")) * (-125);
                        i4 = ((iM3169 ^ i2) * (-16071)) ^ (-640992102);
                        i5 = 1776380696;
                    } else {
                        iM3169 = (C0773.m3169("ۚۙ") ^ i2) * 99;
                        i4 = ((iM3169 ^ i3) * 32451) ^ (-605536720);
                        i5 = -2006352680;
                    }
                    break;
                case -2067833676:
                case -1894044025:
                    if (C3099.f10023 <= 0) {
                        iM3169 = C0619.m2761("ܺ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10723) ^ 230453856;
                        i5 = -1770073758;
                    } else {
                        iM3169 = (C0773.m3169("۫ۖ") ^ i3) * (-125);
                        i4 = ((iM3169 ^ i2) * 14523) ^ (-1842787437);
                        i5 = -1408344292;
                    }
                    break;
                case -1643329988:
                case 1955221791:
                    if (C11235.f35427 < 0) {
                        iM3169 = C0619.m2761("ܺ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10723) ^ 230453856;
                        i5 = -1770073758;
                    } else {
                        iM3169 = (i3 - C0619.m2761("ۢۢ")) * (-125);
                        i4 = ((iM3169 ^ i2) * (-16071)) ^ (-640992102);
                        i5 = 1776380696;
                    }
                    break;
                case -1354390285:
                case 57604714:
                    C3099.m10095();
                    if (RunnableC3055.m9933() != 0) {
                        iM3169 = (i3 - C0619.m2761("ۢۢ")) * (-125);
                        i4 = ((iM3169 ^ i2) * (-16071)) ^ (-640992102);
                        i5 = 1776380696;
                    } else {
                        iM3169 = C0619.m2761("۬ܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5221)) ^ (-1779521096);
                        i5 = -12344984;
                    }
                    break;
                case -1292411078:
                case -275483867:
                    if (C2023.f6737) {
                        iM3169 = (C0773.m3169("ۛܺ") + i3) * (-107);
                        i4 = ((iM3169 ^ i2) * (-17545)) ^ (-1371294450);
                        i5 = -1011713794;
                    } else {
                        iM3169 = (C0773.m3169("۬ۚ") ^ i3) * (-31);
                        i4 = ((iM3169 ^ i2) * (-22711)) ^ 312597901;
                        i5 = -509680461;
                    }
                    break;
                case -1213864573:
                case 968778087:
                    if (C3033.m9845() <= 0) {
                        iM3169 = C0619.m2761("۬ܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5221)) ^ (-1779521096);
                        i5 = -12344984;
                    } else {
                        iM3169 = C0773.m3169("֨֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-18447)) ^ (-364170506);
                        i5 = 391284849;
                    }
                    break;
                case -836303063:
                case 1747354619:
                    C0950.m3785();
                    if (C3998.f13671 == 0) {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7617) ^ (-1338659531);
                        i5 = -1323600675;
                    } else {
                        iM3169 = C0619.m2761("۬ܰ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-5221)) ^ (-1779521096);
                        i5 = -12344984;
                    }
                    break;
                case -745062597:
                case -262157080:
                    this.f72380 = arrayList;
                    return;
                case -665445437:
                case -315846478:
                    if (C1564.m5509() <= 0) {
                        iM3169 = (C0773.m3169("ۛܺ") + i3) * (-107);
                        i4 = ((iM3169 ^ i2) * (-17545)) ^ (-1371294450);
                        i5 = -1011713794;
                    } else {
                        iM3169 = C0619.m2761("ۡۨ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-15177)) ^ 1217529431;
                        i5 = -1624874437;
                    }
                    break;
                case 78254607:
                case 1783869973:
                    C20932.m47848();
                    throw new RuntimeException();
                case 197702028:
                case 1620283372:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = (C0773.m3169("ۛܺ") + i3) * (-107);
                        i4 = ((iM3169 ^ i2) * (-17545)) ^ (-1371294450);
                        i5 = -1011713794;
                    } else {
                        iM3169 = (i2 - C0773.m3169("۬ۡ")) * (-73);
                        i4 = ((iM3169 ^ i3) * (-23809)) ^ 919329738;
                        i5 = -1377629017;
                    }
                    break;
                case 394301469:
                case 940541713:
                    C2966.m9664();
                    C3492.m11488();
                    iM3169 = C0619.m2761("۬ܰ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-5221)) ^ (-1779521096);
                    i5 = -12344984;
                    break;
                case 648479079:
                case 839474118:
                    if (C1343.f4799 != 0) {
                        iM3169 = (C0773.m3169("ۛܺ") + i3) * (-107);
                        i4 = ((iM3169 ^ i2) * (-17545)) ^ (-1371294450);
                        i5 = -1011713794;
                    } else {
                        iM3169 = C0619.m2761("ۛۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-14621)) ^ (-1077422386);
                        i5 = 296700240;
                    }
                    break;
                case 1024910838:
                case 1563654659:
                    arrayList = new ArrayList();
                    if (C1542.f5343 <= 0) {
                        iM3169 = C0619.m2761("ܺ֫") ^ i2;
                        i4 = ((iM3169 ^ i3) * 10723) ^ 230453856;
                        i5 = -1770073758;
                    } else {
                        iM3169 = C0619.m2761("ۘܽ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8303) ^ (-1661695377);
                        i5 = 388345268;
                    }
                    break;
                default:
                    if (C1146.f4234 >= 0) {
                        iM3169 = C0773.m3169("᩸ܳ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 7617) ^ (-1338659531);
                        i5 = -1323600675;
                    } else {
                        iM3169 = C0619.m2761("֨ۜ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 21641) ^ 912111289;
                        i5 = 1225529962;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50428(ActivityC22359 activityC22359) {
        long jM9342 = 0;
        long j = 0;
        int i = 376185112;
        int i2 = C0269.f1558;
        int i3 = C1826.f6190;
        int iM3169 = C0773.m3169("ܺܿ") ^ i3;
        int i4 = ((iM3169 ^ i2) * (-18039)) ^ 382069357;
        int i5 = 972731927;
        while (true) {
            i = ((((i ^ i2) * (-19063)) >> 31) & i4) ^ (iM3169 ^ i5);
            switch (i) {
                case -1979668031:
                case -958188164:
                    if (C3033.f9831 >= 0) {
                        iM3169 = (C0773.m3169("ܰܰ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 11983) ^ 1456638158;
                        i5 = -1947301256;
                    } else {
                        iM3169 = (C0773.m3169("᩷ۗ") ^ i3) * 79;
                        i4 = ((iM3169 ^ i2) * (-29815)) ^ (-183306426);
                        i5 = 177286193;
                    }
                    break;
                case -1962414712:
                case 34365849:
                    if (C1564.f5401 <= 0) {
                        iM3169 = (C0773.m3169("ۛۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 14823) ^ (-949194527);
                        i5 = 282902450;
                    } else {
                        iM3169 = (i2 - C0619.m2761("֫ۧ")) * (-121);
                        i4 = ((iM3169 ^ i3) * (-483)) ^ (-1820396073);
                        i5 = 771277012;
                    }
                    break;
                case -1909932069:
                case -136628085:
                    C20932.m47848();
                    if (C3779.f12953 > 0) {
                        iM3169 = (C0773.m3169("ۛۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 14823) ^ (-949194527);
                        i5 = 282902450;
                    } else {
                        iM3169 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4487)) ^ (-642809225);
                        i5 = -1149936730;
                    }
                    break;
                case -1808729763:
                case 959440150:
                    C2375.m8065();
                    C2023.m6964();
                    break;
                case -1735443678:
                case -771621812:
                    C0269.m1775();
                    C3492.m11488();
                    iM3169 = C0619.m2761("ᩴۘ") ^ i2;
                    i4 = ((iM3169 ^ i3) * (-4487)) ^ (-642809225);
                    i5 = -1149936730;
                    break;
                case -1241821406:
                case 950142101:
                    if (C2702.f8586 <= 0) {
                        iM3169 = (C0773.m3169("ۛۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 14823) ^ (-949194527);
                        i5 = 282902450;
                    } else {
                        iM3169 = C0619.m2761("ۚۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-30443)) ^ (-1904938051);
                        i5 = -1430389496;
                    }
                    break;
                case -1174754607:
                case -752609569:
                    C0619.m2763();
                    if (C0950.f3488 < 0) {
                        iM3169 = (i3 - C0773.m3169("ۛ᩶")) * (-39);
                        i4 = ((iM3169 ^ i2) * 10855) ^ (-148284867);
                        i5 = 1703329575;
                    } else {
                        iM3169 = (C0773.m3169("ۛۖ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM3169 ^ i3) * 14823) ^ (-949194527);
                        i5 = 282902450;
                    }
                    break;
                case -994099413:
                case 478390451:
                    C0773.m3161();
                    if (!RunnableC1848.f6235) {
                        iM3169 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4487)) ^ (-642809225);
                        i5 = -1149936730;
                    } else {
                        iM3169 = (C0619.m2761("ܰ۬") + i3) * 35;
                        i4 = ((iM3169 ^ i2) * (-13481)) ^ (-2131932822);
                        i5 = 1018083778;
                    }
                    break;
                case -600934616:
                case 1317777065:
                    j = activityC22359.f72378;
                    if (C3492.f12043 <= 0) {
                        iM3169 = (C0773.m3169("ܰܰ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 11983) ^ 1456638158;
                        i5 = -1947301256;
                    } else {
                        iM3169 = C0773.m3169("ᩴۜ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-12209)) ^ 887716818;
                        i5 = 1400721441;
                    }
                    break;
                case -575104878:
                case 732378456:
                    break;
                case -496140872:
                case 678266808:
                    if (C1519.f5300 >= 0) {
                        iM3169 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4487)) ^ (-642809225);
                        i5 = -1149936730;
                    } else {
                        iM3169 = C0619.m2761("֫ۗ") ^ i2;
                        i4 = ((iM3169 ^ i3) * 8917) ^ 368681523;
                        i5 = 400828934;
                    }
                    break;
                case -322878607:
                case 933371162:
                    if (AbstractC3624.m11755() != 0) {
                        iM3169 = (C0773.m3169("ܰܰ") + i2) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((iM3169 ^ i3) * 11983) ^ 1456638158;
                        i5 = -1947301256;
                    } else {
                        iM3169 = C0619.m2761("֡ۙ") ^ i3;
                        i4 = ((iM3169 ^ i2) * 28155) ^ 240975713;
                        i5 = 711862294;
                    }
                    break;
                case -296068750:
                case 29747838:
                    activityC22359.f72378 = C3448.m11251();
                    if (C0862.f3233 != 0) {
                        iM3169 = (i3 - C0773.m3169("ۛ᩶")) * (-39);
                        i4 = ((iM3169 ^ i2) * 10855) ^ (-148284867);
                        i5 = 1703329575;
                    } else {
                        iM3169 = C0619.m2761("ۛᩴ") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-14047)) ^ (-1584796938);
                        i5 = 336610723;
                    }
                    break;
                case 1562337973:
                case 2076258045:
                    jM9342 = C2834.m9342();
                    if (C2288.f7433 <= 0) {
                        iM3169 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4487)) ^ (-642809225);
                        i5 = -1149936730;
                    } else {
                        iM3169 = C0773.m3169("ۧ᩵") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-545)) ^ 1882294715;
                        i5 = 1726587408;
                    }
                    break;
                case 1895143613:
                case 2101664874:
                    if (C2419.m8174() < 0) {
                        C2834.m9339(new C7222(activityC22359));
                    }
                    iM3169 = (C0619.m2761("ܰ۬") + i3) * 35;
                    i4 = ((iM3169 ^ i2) * (-13481)) ^ (-2131932822);
                    i5 = 1018083778;
                    break;
                case 1938311924:
                case 2084106966:
                    if (jM9342 - j < 300) {
                        iM3169 = C0773.m3169("۬۠") ^ i3;
                        i4 = ((iM3169 ^ i2) * (-23161)) ^ 1041240606;
                        i5 = 1329781707;
                    } else {
                        iM3169 = (i2 - C0773.m3169("ܳ۫")) * (-31);
                        i4 = ((iM3169 ^ i3) * 15629) ^ (-19754804);
                        i5 = -1462425515;
                    }
                    break;
                default:
                    if (C3492.m11488()) {
                        iM3169 = (C0773.m3169("ۧ᩻") ^ i3) * (-19);
                        i4 = ((iM3169 ^ i2) * 7157) ^ (-1991750205);
                        i5 = -1253023475;
                    } else {
                        iM3169 = C0619.m2761("ᩴۘ") ^ i2;
                        i4 = ((iM3169 ^ i3) * (-4487)) ^ (-642809225);
                        i5 = -1149936730;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x02e1 A[PHI: r4 r29 r31
      0x02e1: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v2 java.lang.String) binds: [B:58:0x02cb, B:52:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r29v7 android.view.View) = (r29v6 android.view.View), (r29v8 android.view.View) binds: [B:58:0x02cb, B:52:0x028d] A[DONT_GENERATE, DONT_INLINE]
      0x02e1: PHI (r31v5 l.᩻᩷᩻) = (r31v4 l.᩻᩷᩻), (r31v6 l.᩻᩷᩻) binds: [B:58:0x02cb, B:52:0x028d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iM3169;
        int i;
        int i2;
        int i3;
        int iM2761;
        int i4;
        int iM2762;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C16390 c16390;
        short[] sArr;
        int iM31610;
        int i10;
        int i11;
        C16390 c16391;
        int iM31611;
        int i12;
        int i13;
        ActivityC22359 activityC22359 = this;
        int i14 = C1783.f6087;
        int i15 = AbstractC0641.f2496;
        int iM31612 = C0773.m3169("ۡۘ") ^ i14;
        int i16 = ((iM31612 ^ i15) * 29709) ^ (-214395215);
        View viewM5518 = null;
        ViewOnClickListenerC25319 viewOnClickListenerC25319 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i17 = iM31612 ^ (-1332461767);
        int i18 = 0;
        int i19 = 0;
        int iM31613 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int iM31614 = 0;
        int i23 = 0;
        int i24 = 0;
        int iM2763 = 0;
        int i25 = 0;
        int i26 = -1178445762;
        C16390 c16392 = null;
        String strM3168 = null;
        View view = null;
        short[] sArr6 = null;
        int iM2764 = 0;
        short s = 0;
        Intent intentM8359 = null;
        while (true) {
            i26 = i17 ^ (i16 & (((i26 ^ i15) * (-16051)) >> 31));
            switch (i26) {
                case -2072979019:
                case -331933309:
                    if (C2288.m7767()) {
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i24 = i24;
                        sArr2 = sArr2;
                        sArr6 = sArr6;
                        i23 = i23;
                        c16392 = c16392;
                        iM2761 = (C0619.m2761("ۖ֨") ^ i15) * (-117);
                        i16 = ((iM2761 ^ i14) * (-21401)) ^ (-1437984440);
                        i4 = -903421526;
                        i7 = iM2761 ^ i4;
                        sArr2 = sArr2;
                        c16392 = c16392;
                        i23 = i23;
                        sArr6 = sArr6;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i24 = i24;
                        view = view;
                        i17 = i7;
                        activityC22359 = this;
                    }
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i8 = i23;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    int iM2765 = (C0619.m2761("ۨ᩺") + i15) * (-53);
                    sArr2 = sArr2;
                    c16392 = c16392;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = iM2765 ^ 595306942;
                    i23 = i8;
                    i16 = ((iM2765 ^ i14) * (-30465)) ^ 2008605105;
                    activityC22359 = this;
                    break;
                case -1913991027:
                case -801094164:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i24 = i24;
                    sArr2 = sArr2;
                    sArr6 = sArr6;
                    i23 = i23;
                    c16392 = c16392;
                    int i27 = i21 + i22;
                    short s2 = s;
                    int i28 = s2 + 620;
                    if ((i27 + i27) - (i28 * i28) >= 0) {
                        iM2762 = C0619.m2761("ۛܰ") ^ i14;
                        i5 = ((iM2762 ^ i15) * (-1685)) ^ 1997721940;
                        i6 = 1026896805;
                    } else {
                        iM2762 = C0619.m2761("᩻ۤ") ^ i14;
                        i5 = ((iM2762 ^ i15) * (-17901)) ^ 61634431;
                        i6 = -1727909607;
                    }
                    i7 = iM2762 ^ i6;
                    s = s2;
                    i16 = i5;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    i23 = i23;
                    sArr6 = sArr6;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i24 = i24;
                    view = view;
                    i17 = i7;
                    activityC22359 = this;
                    break;
                case -1849693818:
                case 1103124165:
                    activityC22359.f72378 = C3448.m11251();
                    C2834.m9339(new C7222(activityC22359));
                    break;
                case -1832589361:
                case -308980319:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    if (strM3168 == null) {
                        iM3169 = C0773.m3169("᩺֨") ^ i15;
                        i = ((iM3169 ^ i14) * (-17109)) ^ (-90218885);
                        i2 = -1517643033;
                    } else {
                        iM3169 = (i15 - C0619.m2761("ۚ᩸")) * 73;
                        i = ((iM3169 ^ i14) * 19309) ^ 602929148;
                        i2 = -1525297752;
                    }
                    i3 = iM3169 ^ i2;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i3;
                    i16 = i;
                    break;
                case -1808813051:
                case 1659735826:
                    C2702.m8876();
                    C2288.m7767();
                    break;
                case -1632906642:
                case -751475930:
                    i20 = 43354;
                    iM2761 = C0619.m2761("ۛۙ") ^ i15;
                    i16 = ((iM2761 ^ i14) * (-28109)) ^ 550156199;
                    i4 = 2052491002;
                    i7 = iM2761 ^ i4;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    i23 = i23;
                    sArr6 = sArr6;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i24 = i24;
                    view = view;
                    i17 = i7;
                    activityC22359 = this;
                    break;
                case -1339259460:
                case 358717445:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    activityC22359.f72381 = C2878.m9476(activityC22359, C0773.m3169(RunnableC3646.m11809(sArr4, i18, i19, i20)) ^ 2117615119);
                    sArr5 = f72372;
                    if (C3492.f12043 > 0) {
                        iM3169 = C0619.m2761("۠ۡ") ^ i15;
                        i = ((iM3169 ^ i14) * (-6553)) ^ (-1353181110);
                        i2 = -22420252;
                        i3 = iM3169 ^ i2;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = i3;
                        i16 = i;
                    } else {
                        i8 = i23;
                        sArr2 = sArr2;
                        c16392 = c16392;
                        int iM2766 = (C0619.m2761("ۨ᩺") + i15) * (-53);
                        sArr2 = sArr2;
                        c16392 = c16392;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = iM2766 ^ 595306942;
                        i23 = i8;
                        i16 = ((iM2766 ^ i14) * (-30465)) ^ 2008605105;
                        activityC22359 = this;
                    }
                    break;
                case -999350114:
                case -90141992:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i24 = i24;
                    sArr2 = sArr2;
                    sArr6 = sArr6;
                    i23 = i23;
                    c16392 = c16392;
                    s = f72372[0];
                    i21 = s * s;
                    i22 = 384400;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0619.m2761("ۖ֨") ^ i15) * (-117);
                        i16 = ((iM2761 ^ i14) * (-21401)) ^ (-1437984440);
                        i4 = -903421526;
                    } else {
                        iM2761 = C0619.m2761("۠ܿ") ^ i15;
                        i16 = ((iM2761 ^ i14) * 15107) ^ 2024984432;
                        i4 = 121608480;
                    }
                    i7 = iM2761 ^ i4;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    i23 = i23;
                    sArr6 = sArr6;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i24 = i24;
                    view = view;
                    i17 = i7;
                    activityC22359 = this;
                    break;
                case -990387400:
                case 20510679:
                    View view2 = view;
                    C16390 c16393 = (C16390) C1564.m5518(activityC22359, iM2763 ^ i25);
                    activityC22359.f56046 = c16393;
                    C2375.m8067(activityC22359, c16393);
                    AbstractC0116.m1238(this);
                    C16390 c16394 = activityC22359.f56046;
                    int iM2767 = (i14 - C0619.m2761("ܺ᩶")) * 91;
                    int i29 = ((iM2767 ^ i15) * 5021) ^ 460042875;
                    i9 = iM2767 ^ 1010381901;
                    c16392 = c16394;
                    i16 = i29;
                    view = view2;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i9;
                    break;
                case -897611756:
                case 1550947347:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    c16391 = c16392;
                    C1321.m4850(c16391, new ViewOnClickListenerC25255(activityC22359, 1));
                    intentM8359 = C2485.m8359(this);
                    if (C1146.f4234 >= 0) {
                        iM31611 = C0773.m3169("᩷۫") ^ i15;
                        i10 = ((iM31611 ^ i14) * (-23669)) ^ 1278705125;
                        i12 = -586570545;
                    } else {
                        iM31611 = C0773.m3169("ܳۤ") ^ i15;
                        i10 = ((iM31611 ^ i14) * 15515) ^ (-1707032293);
                        i12 = -542262849;
                    }
                    i13 = iM31611 ^ i12;
                    c16392 = c16391;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    View view3 = view;
                    i17 = i13;
                    i16 = i10;
                    view = view3;
                    break;
                case -749543281:
                case -557210685:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    C1564.m5518(activityC22359, iM31614 ^ 2100430177);
                    sArr6 = f72372;
                    i24 = 4;
                    i8 = 3;
                    if (!C3998.m12920()) {
                        int iM2768 = (C0619.m2761("ۨ᩺") + i15) * (-53);
                        sArr2 = sArr2;
                        c16392 = c16392;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = iM2768 ^ 595306942;
                        i23 = i8;
                        i16 = ((iM2768 ^ i14) * (-30465)) ^ 2008605105;
                        activityC22359 = this;
                    } else {
                        int iM2769 = C0619.m2761("֡ۧ") ^ i14;
                        int i30 = ((iM2769 ^ i15) * 2521) ^ 1736953494;
                        i9 = iM2769 ^ (-995169918);
                        i16 = i30;
                        sArr2 = sArr2;
                        c16392 = c16392;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i23 = 3;
                        i17 = i9;
                    }
                    break;
                case -638910770:
                case 794572155:
                    C17202.m40373(C2878.m9486(f72372, 22, 12, i20));
                    C0950.m3790(this);
                    break;
                case -636934229:
                case 47974103:
                    C3077.m10041();
                    if (C1519.f5300 >= 0) {
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        c16391 = c16392;
                        iM31611 = C0773.m3169("᩷۫") ^ i15;
                        i10 = ((iM31611 ^ i14) * (-23669)) ^ 1278705125;
                        i12 = -586570545;
                        i13 = iM31611 ^ i12;
                        c16392 = c16391;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        View view4 = view;
                        i17 = i13;
                        i16 = i10;
                        view = view4;
                    } else {
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i8 = i23;
                        sArr2 = sArr2;
                        c16392 = c16392;
                        int iM27610 = (C0619.m2761("ۨ᩺") + i15) * (-53);
                        sArr2 = sArr2;
                        c16392 = c16392;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = iM27610 ^ 595306942;
                        i23 = i8;
                        i16 = ((iM27610 ^ i14) * (-30465)) ^ 2008605105;
                        activityC22359 = this;
                    }
                    break;
                case -569225171:
                case 1217576041:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    activityC22359.f72379 = (C15179) viewM5518;
                    sArr4 = f72372;
                    i18 = 40;
                    i19 = 3;
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("ۨ᩻") ^ i14;
                        i = ((iM3169 ^ i15) * (-27209)) ^ (-1193598265);
                        i2 = -1509719834;
                    } else {
                        iM3169 = C0619.m2761("ۢܽ") ^ i14;
                        i = ((iM3169 ^ i15) * 17177) ^ 1690882366;
                        i2 = -99077935;
                    }
                    i3 = iM3169 ^ i2;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i3;
                    i16 = i;
                    break;
                case -414485032:
                case 1185085834:
                    C3099.m10095();
                    if (C1542.m5459() >= 0) {
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        sArr = sArr2;
                        c16390 = c16392;
                        iM31610 = C0773.m3169("֡ۡ") ^ i14;
                        i10 = ((iM31610 ^ i15) * (-29901)) ^ (-1367094384);
                        i11 = -1874986179;
                        i13 = iM31610 ^ i11;
                        c16392 = c16390;
                        sArr2 = sArr;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        View view5 = view;
                        i17 = i13;
                        i16 = i10;
                        view = view5;
                    }
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    c16391 = c16392;
                    iM31611 = C0773.m3169("᩷۫") ^ i15;
                    i10 = ((iM31611 ^ i14) * (-23669)) ^ 1278705125;
                    i12 = -586570545;
                    i13 = iM31611 ^ i12;
                    c16392 = c16391;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    View view6 = view;
                    i17 = i13;
                    i16 = i10;
                    view = view6;
                    break;
                case -259798954:
                case 2109429023:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    int i31 = i23;
                    i24 = i24;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    sArr6 = sArr6;
                    super.onCreate(bundle);
                    m40415();
                    i23 = i31;
                    iM31614 = C0773.m3169(C3448.m11252(f72372, 1, 3, i20));
                    if (C0950.m3785() == 0) {
                        iM2761 = C0619.m2761("ܺܺ") ^ i15;
                        i16 = ((iM2761 ^ i14) * 5351) ^ (-1394890480);
                        i4 = 1411174769;
                        i7 = iM2761 ^ i4;
                        sArr2 = sArr2;
                        c16392 = c16392;
                        i23 = i23;
                        sArr6 = sArr6;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i24 = i24;
                        view = view;
                        i17 = i7;
                        activityC22359 = this;
                    } else {
                        i8 = i23;
                        sArr6 = sArr6;
                        i24 = i24;
                        int iM27611 = (C0619.m2761("ۨ᩺") + i15) * (-53);
                        sArr2 = sArr2;
                        c16392 = c16392;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = iM27611 ^ 595306942;
                        i23 = i8;
                        i16 = ((iM27611 ^ i14) * (-30465)) ^ 2008605105;
                        activityC22359 = this;
                    }
                    break;
                case -74403729:
                case 1889632560:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    viewM5518 = C1564.m5518(activityC22359, C0773.m3169(C1146.m4222(sArr3, 37, 3, i20)) ^ 2102915310);
                    iM3169 = C0619.m2761("۫֨") ^ i15;
                    i = ((iM3169 ^ i14) * (-12653)) ^ 1602248735;
                    i2 = -1035471482;
                    i3 = iM3169 ^ i2;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i3;
                    i16 = i;
                    break;
                case -38541439:
                case 366960336:
                    break;
                case -12276660:
                case 1781366127:
                    activityC22359.f72377 = C2878.m9476(activityC22359, iM2764);
                    view = activityC22359.f72381;
                    viewOnClickListenerC25319 = new ViewOnClickListenerC25319(4, activityC22359);
                    int iM31615 = (C0773.m3169("ۡ᩹") + i14) * (-59);
                    i = ((iM31615 ^ i15) * (-2223)) ^ (-2040417520);
                    i17 = iM31615 ^ (-1609444684);
                    i16 = i;
                    break;
                case 229302507:
                case 2137470112:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    c16390 = c16392;
                    sArr = sArr2;
                    iM2763 = C0619.m2761(C1564.m5510(sArr, 7, 3, i20));
                    i25 = 2118703566;
                    if (C0619.f2439) {
                        iM31610 = C0773.m3169("֡ۡ") ^ i14;
                        i10 = ((iM31610 ^ i15) * (-29901)) ^ (-1367094384);
                        i11 = -1874986179;
                    } else {
                        iM31610 = C0773.m3169("۬ۢ") ^ i14;
                        i10 = ((iM31610 ^ i15) * 19971) ^ 521876665;
                        i11 = 1259094871;
                    }
                    i13 = iM31610 ^ i11;
                    c16392 = c16390;
                    sArr2 = sArr;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    View view7 = view;
                    i17 = i13;
                    i16 = i10;
                    view = view7;
                    break;
                case 232805910:
                case 1168475730:
                    C2375.m8070(view, viewOnClickListenerC25319);
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    if (C3448.m11251() - activityC22359.f72378 < 300) {
                        iM3169 = C0619.m2761("۫ۚ") ^ i14;
                        i = ((iM3169 ^ i15) * 1781) ^ 911222678;
                        i2 = 1609296489;
                    } else {
                        iM3169 = (C0773.m3169("ۙܶ") + i15) * 77;
                        i = ((iM3169 ^ i14) * (-7413)) ^ (-1102381788);
                        i2 = -2092939098;
                    }
                    i3 = iM3169 ^ i2;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i3;
                    i16 = i;
                    break;
                case 639967283:
                case 1013994487:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    strM3168 = C0773.m3168(intentM8359, C3998.m12925(f72372, 18, 4, i20));
                    if (activityC22359.f72374 != null) {
                        iM3169 = C0773.m3169("ܿۜ") ^ i14;
                        i = ((iM3169 ^ i15) * 13283) ^ (-1622817499);
                        i2 = -655333052;
                    } else {
                        iM3169 = C0773.m3169("᩺֨") ^ i15;
                        i = ((iM3169 ^ i14) * (-17109)) ^ (-90218885);
                        i2 = -1517643033;
                    }
                    i3 = iM3169 ^ i2;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i3;
                    i16 = i;
                    break;
                case 669283922:
                case 1718324522:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    activityC22359.f72376 = (TabLayout) C1564.m5518(activityC22359, 2104088923 ^ iM31613);
                    sArr3 = f72372;
                    if (C2354.f7599 < 0) {
                        iM3169 = C0773.m3169("ۙۢ") ^ i15;
                        i = ((iM3169 ^ i14) * 25927) ^ (-640176348);
                        i2 = -93007893;
                        i3 = iM3169 ^ i2;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = i3;
                        i16 = i;
                    } else {
                        i24 = i24;
                        sArr2 = sArr2;
                        sArr6 = sArr6;
                        i23 = i23;
                        c16392 = c16392;
                        iM2761 = (C0619.m2761("ۖ֨") ^ i15) * (-117);
                        i16 = ((iM2761 ^ i14) * (-21401)) ^ (-1437984440);
                        i4 = -903421526;
                        i7 = iM2761 ^ i4;
                        sArr2 = sArr2;
                        c16392 = c16392;
                        i23 = i23;
                        sArr6 = sArr6;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i24 = i24;
                        view = view;
                        i17 = i7;
                        activityC22359 = this;
                    }
                    break;
                case 867592476:
                case 1973233146:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    activityC22359.f56046.setSubtitle(strM3168);
                    iM31613 = C0773.m3169(C3734.m12149(f72372, 34, 3, i20));
                    if (C3448.f11240 < 0) {
                        iM3169 = (i14 - C0619.m2761("ۗ᩻")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i = ((iM3169 ^ i15) * 27475) ^ (-419057512);
                        i2 = -1496125320;
                        i3 = iM3169 ^ i2;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = i3;
                        i16 = i;
                    } else {
                        c16391 = c16392;
                        iM31611 = C0773.m3169("᩷۫") ^ i15;
                        i10 = ((iM31611 ^ i14) * (-23669)) ^ 1278705125;
                        i12 = -586570545;
                        i13 = iM31611 ^ i12;
                        c16392 = c16391;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        View view8 = view;
                        i17 = i13;
                        i16 = i10;
                        view = view8;
                    }
                    break;
                case 1129471996:
                case 1474234985:
                    AbstractC0116.m1243();
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i8 = i23;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    int iM27612 = (C0619.m2761("ۨ᩺") + i15) * (-53);
                    sArr2 = sArr2;
                    c16392 = c16392;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = iM27612 ^ 595306942;
                    i23 = i8;
                    i16 = ((iM27612 ^ i14) * (-30465)) ^ 2008605105;
                    activityC22359 = this;
                    break;
                case 1163902448:
                case 1433979484:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    activityC22359.f72374 = C0619.m2760(intentM8359, C2287.m7749(f72372, 10, 8, i20));
                    iM3169 = C0619.m2761("ᩴ۫") ^ i14;
                    i = ((iM3169 ^ i15) * (-20725)) ^ (-1835083083);
                    i2 = 1984364790;
                    i3 = iM3169 ^ i2;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i3;
                    i16 = i;
                    break;
                case 1719129438:
                case 1954327831:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    iM2764 = C0619.m2761(C1080.m4056(sArr5, 43, 3, i20)) ^ 2121493015;
                    if (C3099.f10023 > 0) {
                        iM3169 = C0619.m2761("ۧܳ") ^ i14;
                        i = ((iM3169 ^ i15) * 27431) ^ (-296872901);
                        i2 = 538560949;
                        i3 = iM3169 ^ i2;
                        view = view;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i17 = i3;
                        i16 = i;
                    } else {
                        i24 = i24;
                        sArr2 = sArr2;
                        sArr6 = sArr6;
                        i23 = i23;
                        c16392 = c16392;
                        iM2761 = (C0619.m2761("ۖ֨") ^ i15) * (-117);
                        i16 = ((iM2761 ^ i14) * (-21401)) ^ (-1437984440);
                        i4 = -903421526;
                        i7 = iM2761 ^ i4;
                        sArr2 = sArr2;
                        c16392 = c16392;
                        i23 = i23;
                        sArr6 = sArr6;
                        viewOnClickListenerC25319 = viewOnClickListenerC25319;
                        i24 = i24;
                        view = view;
                        i17 = i7;
                        activityC22359 = this;
                    }
                    break;
                case 1981214537:
                case 1996587494:
                    i20 = 24425;
                    iM2761 = C0619.m2761("ۛۙ") ^ i15;
                    i16 = ((iM2761 ^ i14) * (-28109)) ^ 550156199;
                    i4 = 2052491002;
                    i7 = iM2761 ^ i4;
                    sArr2 = sArr2;
                    c16392 = c16392;
                    i23 = i23;
                    sArr6 = sArr6;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i24 = i24;
                    view = view;
                    i17 = i7;
                    activityC22359 = this;
                    break;
                default:
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    int i32 = i23;
                    short[] sArr7 = sArr6;
                    int i33 = i24;
                    C16390 c16395 = c16392;
                    C2878.m9476(activityC22359, C0619.m2761(C3690.m11996(sArr7, i33, i32, i20)) ^ 2130189043);
                    sArr2 = f72372;
                    int iM27613 = (C0619.m2761("ᩴ۬") + i15) * 53;
                    i = ((iM27613 ^ i14) * (-15567)) ^ (-360207857);
                    i3 = iM27613 ^ (-1048283950);
                    c16392 = c16395;
                    sArr6 = sArr7;
                    i24 = i33;
                    i23 = i32;
                    view = view;
                    viewOnClickListenerC25319 = viewOnClickListenerC25319;
                    i17 = i3;
                    i16 = i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a0 A[PHI: r3 r6 r7 r8 r9
      0x01a0: PHI (r3v5 l.ۙ᩹֫) = (r3v4 l.ۙ᩹֫), (r3v2 l.ۙ᩹֫), (r3v2 l.ۙ᩹֫), (r3v2 l.ۙ᩹֫), (r3v2 l.ۙ᩹֫), (r3v2 l.ۙ᩹֫) binds: [B:54:0x019e, B:43:0x0140, B:39:0x0118, B:35:0x00f8, B:31:0x00d7, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r6v5 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v4 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
     binds: [B:54:0x019e, B:43:0x0140, B:39:0x0118, B:35:0x00f8, B:31:0x00d7, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r7v5 l.ᩳ۬᩸) = (r7v2 l.ᩳ۬᩸), (r7v2 l.ᩳ۬᩸), (r7v2 l.ᩳ۬᩸), (r7v4 l.ᩳ۬᩸), (r7v2 l.ᩳ۬᩸), (r7v2 l.ᩳ۬᩸) binds: [B:54:0x019e, B:43:0x0140, B:39:0x0118, B:35:0x00f8, B:31:0x00d7, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r8v4 java.lang.String) = 
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v2 java.lang.String)
      (r8v3 java.lang.String)
      (r8v2 java.lang.String)
     binds: [B:54:0x019e, B:43:0x0140, B:39:0x0118, B:35:0x00f8, B:31:0x00d7, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x01a0: PHI (r9v3 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v5 java.lang.String)
     binds: [B:54:0x019e, B:43:0x0140, B:39:0x0118, B:35:0x00f8, B:31:0x00d7, B:23:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0223 A[PHI: r1 r5 r15
      0x0223: PHI (r1v4 l.ۨ᩵֫) = (r1v3 l.ۨ᩵֫), (r1v2 l.ۨ᩵֫), (r1v2 l.ۨ᩵֫), (r1v2 l.ۨ᩵֫), (r1v2 l.ۨ᩵֫) binds: [B:64:0x0221, B:50:0x017d, B:27:0x00b8, B:11:0x0045, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r5v4 l.᩹ۖ᩸) = (r5v2 l.᩹ۖ᩸), (r5v3 l.᩹ۖ᩸), (r5v2 l.᩹ۖ᩸), (r5v2 l.᩹ۖ᩸), (r5v2 l.᩹ۖ᩸) binds: [B:64:0x0221, B:50:0x017d, B:27:0x00b8, B:11:0x0045, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r15v8 l.ۛ᩵֫) = (r15v4 l.ۛ᩵֫), (r15v5 l.ۛ᩵֫), (r15v4 l.ۛ᩵֫), (r15v4 l.ۛ᩵֫), (r15v4 l.ۛ᩵֫) binds: [B:64:0x0221, B:50:0x017d, B:27:0x00b8, B:11:0x0045, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0288  */
    @Override // l.AbstractActivityC17204, l.ActivityC4348, l.ActivityC3409, android.app.Activity
    public final void onDestroy() {
        int iM2761;
        int i;
        C12574 c12574 = null;
        Iterator itM13647 = null;
        C5205 c5205 = null;
        C23255 c23255 = null;
        String strM4058 = null;
        InterfaceC19106 interfaceC19106M11756 = null;
        String strM4059 = null;
        String strM35150 = null;
        int i2 = -166780997;
        int i3 = C3448.f11240;
        int i4 = C4238.f15451;
        int iM3169 = C0773.m3169("᩷ᩳ") ^ i3;
        int i5 = ((iM3169 ^ i4) * (-29419)) ^ (-969516585);
        int i6 = 1517956106;
        while (true) {
            int i7 = iM3169 ^ i6;
            C6609 c6609 = null;
            while (true) {
                i2 = ((((i2 ^ i4) * 28173) >> 31) & i5) ^ i7;
                switch (i2) {
                    case -1660667073:
                    case 1332803086:
                        c6609.m18542(strM4059);
                        if (C11235.f35427 >= 0) {
                            iM2761 = (C0619.m2761("֫۫") ^ i3) * 31;
                            i5 = ((iM2761 ^ i4) * (-26689)) ^ (-1761375799);
                            i = 255725130;
                        } else {
                            iM2761 = C0619.m2761("ۡ᩻") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26385) ^ (-1629588395);
                            i = -702361922;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1526753690:
                    case 595444900:
                        c12574 = new C12574();
                        if (C0269.f1558 <= 0) {
                            iM2761 = (C0619.m2761("֫۫") ^ i3) * 31;
                            i5 = ((iM2761 ^ i4) * (-26689)) ^ (-1761375799);
                            i = 255725130;
                        } else {
                            iM2761 = (i3 - C0773.m3169("ۜۤ")) * (-9);
                            i5 = ((iM2761 ^ i4) * (-3199)) ^ 1305932556;
                            i = 103624162;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1410517818:
                    case -795432136:
                        C17202.m40372();
                        C2023.m6964();
                        break;
                    case -1305420176:
                    case -1297531032:
                        super.onDestroy();
                        if (this.f72375) {
                            iM2761 = (C0619.m2761("ۧۛ") ^ i4) * 81;
                            i5 = ((iM2761 ^ i3) * (-21299)) ^ (-391921686);
                            i = 991333255;
                        } else {
                            iM2761 = C0773.m3169("۠ۤ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26181) ^ 1129980024;
                            i = -1237107668;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1262240697:
                    case -748865520:
                        itM13647 = C4282.m13647(this.f72380);
                        iM2761 = C0773.m3169("۠ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17457)) ^ (-1077448296);
                        i = -1797722859;
                        i7 = iM2761 ^ i;
                        break;
                    case -1128934332:
                    case 1671159105:
                        c6609.m18540(strM4058);
                        if (C1146.f4234 >= 0) {
                            iM2761 = C0619.m2761("ۘܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-6803)) ^ 486275406;
                            i = 77617810;
                        } else {
                            iM2761 = (i4 - C0619.m2761("۟ܰ")) * 75;
                            i5 = ((iM2761 ^ i3) * (-5805)) ^ 1746357641;
                            i = 1754959469;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -1029816259:
                    case 1210034113:
                        C1519.m5396(c12574.f40370, strM35150, c6609);
                        iM2761 = C0773.m3169("۠ܿ") ^ i4;
                        i5 = ((iM2761 ^ i3) * (-17457)) ^ (-1077448296);
                        i = -1797722859;
                        i7 = iM2761 ^ i;
                        break;
                    case -787155200:
                    case 849309864:
                        if (C1519.f5300 < 0) {
                            c6609 = new C6609();
                            c23255 = c5205.f18367;
                            if (C0773.m3161() != 0) {
                                iM2761 = (C0619.m2761("֫۫") ^ i3) * 31;
                                i5 = ((iM2761 ^ i4) * (-26689)) ^ (-1761375799);
                                i = 255725130;
                            } else {
                                iM2761 = C0773.m3169("᩵ۘ") ^ i3;
                                i5 = ((iM2761 ^ i4) * 9501) ^ (-727131595);
                                i = -1439441746;
                            }
                            i7 = iM2761 ^ i;
                        }
                        break;
                    case -732578902:
                    case 2061392894:
                        c5205 = (C5205) C4238.m13529(itM13647);
                        if (C0862.f3233 != 0) {
                            iM2761 = C0619.m2761("ۘܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-6803)) ^ 486275406;
                            i = 77617810;
                        } else {
                            iM2761 = (i3 - C0773.m3169("ۤܿ")) * (-35);
                            i5 = ((iM2761 ^ i4) * 2453) ^ (-1535200410);
                            i = 211163031;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -625470473:
                    case 1965493724:
                        strM4059 = C1080.m4058(interfaceC19106M11756);
                        if (C2375.f7641 <= 0) {
                            iM2761 = C0619.m2761("ۘܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-6803)) ^ 486275406;
                            i = 77617810;
                        } else {
                            iM2761 = C0773.m3169("ۜᩳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * 5681) ^ (-566168023);
                            i = 733210881;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -573786421:
                    case 577703011:
                        if (C3998.m12923(itM13647)) {
                            iM2761 = C0619.m2761("۬ܳ") ^ i4;
                            i5 = ((iM2761 ^ i3) * (-585)) ^ 1110769452;
                            i = -865486064;
                        } else {
                            iM2761 = (C0773.m3169("᩶ۨ") + i3) * (-117);
                            i5 = ((iM2761 ^ i4) * (-5095)) ^ 102229898;
                            i = -293645489;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -450262509:
                    case -167906887:
                        C0269.m1775();
                        AbstractC3624.m11755();
                        iM2761 = (i3 - C0773.m3169("ۙᩳ")) * 23;
                        i5 = ((iM2761 ^ i4) * 22883) ^ (-1109088055);
                        i = 236727052;
                        i7 = iM2761 ^ i;
                        break;
                    case -348648822:
                    case 1240199311:
                        if (this.f72382) {
                            iM2761 = (C0773.m3169("᩶֨") + i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                            i5 = ((iM2761 ^ i3) * (-26617)) ^ 2114862751;
                            i = 570064315;
                        } else {
                            iM2761 = C0773.m3169("۠ۤ") ^ i3;
                            i5 = ((iM2761 ^ i4) * 26181) ^ 1129980024;
                            i = -1237107668;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -320258733:
                    case 1856305365:
                        C2354.m7983();
                        if (C1080.f3865 < 0) {
                        }
                        iM2761 = (C0619.m2761("֫۫") ^ i3) * 31;
                        i5 = ((iM2761 ^ i4) * (-26689)) ^ (-1761375799);
                        i = 255725130;
                        i7 = iM2761 ^ i;
                        break;
                    case -293280639:
                    case 1577737358:
                        break;
                    case -275379254:
                    case 546547583:
                        C0773.m3161();
                        if (RunnableC0334.f1808 > 0) {
                            iM2761 = (i3 - C0773.m3169("ۙᩳ")) * 23;
                            i5 = ((iM2761 ^ i4) * 22883) ^ (-1109088055);
                            i = 236727052;
                        } else {
                            iM2761 = (C0619.m2761("֫۫") ^ i3) * 31;
                            i5 = ((iM2761 ^ i4) * (-26689)) ^ (-1761375799);
                            i = 255725130;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -269162811:
                    case -230697530:
                        interfaceC19106M11756 = AbstractC3624.m11756(c5205.f18363);
                        if (C4282.f15546 <= 0) {
                            iM2761 = C0619.m2761("ۘܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-6803)) ^ 486275406;
                            i = 77617810;
                        } else {
                            iM2761 = (C0773.m3169("᩹ۧ") + i3) * (-35);
                            i5 = ((iM2761 ^ i4) * 23835) ^ (-405253196);
                            i = -406715629;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case -127542046:
                    case 1115249419:
                        strM4058 = C1080.m4058(AbstractC0116.m1233(c23255));
                        if (C1146.m4231()) {
                            iM2761 = C0773.m3169("ܳ᩹") ^ i4;
                            i5 = ((iM2761 ^ i3) * 20505) ^ 323519748;
                            i = 167907531;
                        } else {
                            iM2761 = C0619.m2761("ۘܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-6803)) ^ 486275406;
                            i = 77617810;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 167765652:
                    case 803617008:
                        if (C1146.f4234 >= 0) {
                            iM2761 = (i3 - C0773.m3169("ۙᩳ")) * 23;
                            i5 = ((iM2761 ^ i4) * 22883) ^ (-1109088055);
                            i = 236727052;
                        } else {
                            iM2761 = (C0773.m3169("ᩳۡ") + i4) * 73;
                            i5 = ((iM2761 ^ i3) * (-9841)) ^ 1835934701;
                            i = -288242474;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    case 227102066:
                    case 1047240098:
                        strM35150 = c5205.f18365.m35150();
                        if (RunnableC3055.f9898 >= 0) {
                            iM2761 = C0619.m2761("ۘܿ") ^ i3;
                            i5 = ((iM2761 ^ i4) * (-6803)) ^ 486275406;
                            i = 77617810;
                        } else {
                            iM2761 = (C0619.m2761("᩺ۢ") + i4) * (-105);
                            i5 = ((iM2761 ^ i3) * 26287) ^ (-1835010509);
                            i = -820366726;
                        }
                        i7 = iM2761 ^ i;
                        break;
                    default:
                        C24509.m54770(this.f72374, c12574);
                        iM2761 = C0773.m3169("۠ۤ") ^ i3;
                        i5 = ((iM2761 ^ i4) * 26181) ^ 1129980024;
                        i = -1237107668;
                        i7 = iM2761 ^ i;
                        break;
                }
                return;
            }
            iM3169 = (C0773.m3169("֡۬") + i4) * (-7);
            i5 = ((iM3169 ^ i3) * (-3455)) ^ 1213571815;
            i6 = -277981634;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 363667718;
        int i5 = C4282.f15546;
        int i6 = C2287.f7432;
        int iM3169 = C0773.m3169("᩺ܿ") ^ i6;
        int i7 = ((iM3169 ^ i5) * 19583) ^ 1118031129;
        int i8 = -1561524487;
        while (true) {
            i4 = ((((i4 ^ i5) * 8171) >> 31) & i7) ^ (iM3169 ^ i8);
            switch (i4) {
                case -2123058992:
                case -1160775832:
                    if (C13473.f42873 != 0) {
                        iM3169 = C0773.m3169("ܿܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 16005) ^ 875796018;
                        i8 = -130760539;
                    } else {
                        iM3169 = C0773.m3169("֨ᩳ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-11117)) ^ (-1646377261);
                        i8 = 194216955;
                    }
                    break;
                case -1881704490:
                case 930500113:
                    C20932.m47848();
                    if (!RunnableC3646.f12471) {
                        iM3169 = C0773.m3169("ܿܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 16005) ^ 875796018;
                        i8 = -130760539;
                    } else {
                        iM3169 = C0619.m2761("֡ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-711)) ^ 649666220;
                        i8 = 1372345689;
                    }
                    break;
                case -1471115700:
                case 1850344108:
                    this.f72382 = true;
                    break;
                case -919466877:
                case 791737637:
                    if (C2966.m9664()) {
                        iM3169 = (i6 - C0619.m2761("ۘۡ")) * (-111);
                        i7 = ((iM3169 ^ i5) * (-15333)) ^ (-535957945);
                        i8 = -1525927175;
                    } else {
                        iM3169 = (C0619.m2761("ۡۜ") ^ i5) * (-41);
                        i7 = ((iM3169 ^ i6) * (-7663)) ^ 1399817916;
                        i8 = -1375578860;
                    }
                    break;
                case -774144464:
                case 2031483648:
                    C2288.m7767();
                    break;
                case -752008711:
                case 953562505:
                    if (C0862.f3233 != 0) {
                        iM3169 = (C0619.m2761("ۡۜ") ^ i5) * (-41);
                        i7 = ((iM3169 ^ i6) * (-7663)) ^ 1399817916;
                        i8 = -1375578860;
                    } else {
                        iM3169 = (i5 - C0773.m3169("᩻֨")) * 43;
                        i7 = ((iM3169 ^ i6) * 31801) ^ (-2144489315);
                        i8 = 947252554;
                    }
                    break;
                case -202772986:
                case 78415931:
                    if (!C3690.m11987()) {
                        iM3169 = (C0619.m2761("ۡۜ") ^ i5) * (-41);
                        i7 = ((iM3169 ^ i6) * (-7663)) ^ 1399817916;
                        i8 = -1375578860;
                    } else {
                        iM3169 = C0773.m3169("ܿܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 16005) ^ 875796018;
                        i8 = -130760539;
                    }
                    break;
                case -93509877:
                case 1831982956:
                    if (C2834.f9334 <= 0) {
                        iM3169 = (C0773.m3169("֨ܶ") + i5) * 35;
                        i7 = ((iM3169 ^ i6) * 16285) ^ (-2072231811);
                        i8 = 114335090;
                    } else {
                        iM3169 = (i5 - C0619.m2761("ۘ֫")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((iM3169 ^ i6) * 20717) ^ 1615281787;
                        i8 = 2028138568;
                    }
                    break;
                case 212049351:
                case 589082308:
                    if (AbstractC0641.f2496 >= 0) {
                        iM3169 = C0773.m3169("ܿܿ") ^ i6;
                        i7 = ((iM3169 ^ i5) * 16005) ^ 875796018;
                        i8 = -130760539;
                    } else {
                        iM3169 = C0619.m2761("ۛۖ") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-12193)) ^ (-1486397378);
                        i8 = -556907707;
                    }
                    break;
                case 294746502:
                case 511946642:
                    if (C2878.f9462) {
                        iM3169 = (C0773.m3169("֨ܶ") + i5) * 35;
                        i7 = ((iM3169 ^ i6) * 16285) ^ (-2072231811);
                        i8 = 114335090;
                    } else {
                        iM3169 = (C0619.m2761("ᩴۚ") + i6) * (-11);
                        i7 = ((iM3169 ^ i5) * (-32037)) ^ (-1781895797);
                        i8 = 1534144364;
                    }
                    break;
                case 369903506:
                case 2015607116:
                    if (C2419.f7754 < 0) {
                        iM3169 = C0773.m3169("ܺ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-10445)) ^ 65300848;
                        i8 = 293954656;
                    } else {
                        iM3169 = C0619.m2761("֡ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-711)) ^ 649666220;
                        i8 = 1372345689;
                    }
                    break;
                case 586786037:
                case 1931522699:
                    if (C17202.f56030) {
                        iM3169 = (C0773.m3169("ۨ֫") ^ i6) * 27;
                        i7 = ((iM3169 ^ i5) * (-28949)) ^ 188579795;
                        i8 = -176499495;
                    } else {
                        iM3169 = C0773.m3169("ܺ᩶") ^ i5;
                        i7 = ((iM3169 ^ i6) * (-10445)) ^ 65300848;
                        i8 = 293954656;
                    }
                    break;
                case 631866071:
                case 1685371270:
                    if (C3077.f9998) {
                        iM3169 = (i6 - C0619.m2761("ܿᩴ")) * (-87);
                        i7 = ((iM3169 ^ i5) * (-15441)) ^ 717721772;
                        i8 = 1532113360;
                    } else {
                        iM3169 = C0619.m2761("֡ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-711)) ^ 649666220;
                        i8 = 1372345689;
                    }
                    break;
                case 1356738526:
                case 1392886378:
                    if (RunnableC3646.f12471) {
                        iM3169 = (C0773.m3169("֨ܶ") + i5) * 35;
                        i7 = ((iM3169 ^ i6) * 16285) ^ (-2072231811);
                        i8 = 114335090;
                    } else {
                        iM3169 = (C0619.m2761("֫᩸") ^ i6) * 115;
                        i7 = ((iM3169 ^ i5) * 16399) ^ 1570147511;
                        i8 = 573194848;
                    }
                    break;
                case 1997441175:
                case 2027739597:
                    if (C17202.m40372()) {
                        iM3169 = (C0619.m2761("᩷᩵") ^ i5) * 37;
                        i7 = ((iM3169 ^ i6) * (-16793)) ^ (-220915094);
                        i8 = -242416321;
                    } else {
                        iM3169 = C0619.m2761("֡ۡ") ^ i6;
                        i7 = ((iM3169 ^ i5) * (-711)) ^ 649666220;
                        i8 = 1372345689;
                    }
                    break;
                default:
                    C0487.m2356();
                    C2485.m8357();
                    iM3169 = C0619.m2761("֡ۡ") ^ i6;
                    i7 = ((iM3169 ^ i5) * (-711)) ^ 649666220;
                    i8 = 1372345689;
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50427(ActivityC22359 activityC22359) {
        String str = null;
        C12574 c12574M54773 = null;
        Iterator itM4942 = null;
        C5205 c5205 = null;
        C14570 c14570 = null;
        String strM35150 = null;
        C6609 c6609 = null;
        C23255 c23255 = null;
        String strM18539 = null;
        int i = -930590573;
        int i2 = C20932.f66974;
        int i3 = C1080.f3865;
        int iM2761 = C0619.m2761("۟ܶ") ^ i2;
        int i4 = ((iM2761 ^ i3) * (-29459)) ^ 518890794;
        int i5 = 238066807;
        while (true) {
            i = ((((i ^ i3) * 13847) >> 31) & i4) ^ (iM2761 ^ i5);
            switch (i) {
                case -2083612883:
                case 765757993:
                    if (C3998.m12923(itM4942)) {
                        iM2761 = C0773.m3169("۫ۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 5259) ^ (-1309441496);
                        i5 = -494200635;
                    } else {
                        iM2761 = (i2 - C0773.m3169("ܺۖ")) * 77;
                        i4 = ((iM2761 ^ i3) * (-27519)) ^ 360136136;
                        i5 = -1976241497;
                    }
                    break;
                case -1960802015:
                case 192785272:
                    c23255 = c5205.f18367;
                    strM18539 = c6609.m18539();
                    if (C3998.m12920()) {
                        iM2761 = (C0773.m3169("ۨ᩸") ^ i3) * (-121);
                        i4 = ((iM2761 ^ i2) * (-30433)) ^ (-474468499);
                        i5 = 1575453852;
                    } else {
                        iM2761 = C0619.m2761("ۚܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1729) ^ 716935985;
                        i5 = -198782288;
                    }
                    break;
                case -1800845873:
                case -1576546712:
                    strM35150 = c14570.m35150();
                    if (RunnableC3646.f12471) {
                        iM2761 = C0619.m2761("ۚܳ") ^ i3;
                        i4 = ((iM2761 ^ i2) * 1729) ^ 716935985;
                        i5 = -198782288;
                    } else {
                        iM2761 = C0773.m3169("ᩳ۬") ^ i3;
                        i4 = ((iM2761 ^ i2) * 2343) ^ 812784974;
                        i5 = 842434073;
                    }
                    break;
                case -1365276483:
                case 620529861:
                    str = activityC22359.f72374;
                    if (C3448.m11248() != 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16255) ^ 1549962621;
                        i5 = -1766364332;
                    } else {
                        iM2761 = (C0619.m2761("ۧ۬") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM2761 ^ i2) * (-18593)) ^ 1055971081;
                        i5 = -1355274500;
                    }
                    break;
                case -1266517241:
                case 1432759666:
                    activityC22359.f72382 = true;
                    break;
                case -1132770197:
                case 898343871:
                    C1542.m5459();
                    if (C3099.f10023 <= 0) {
                        iM2761 = C0773.m3169("֡ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1207) ^ (-612159740);
                        i5 = -511405782;
                    } else {
                        iM2761 = C0773.m3169("ܰ֫") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-7301)) ^ 157532529;
                        i5 = -792405569;
                    }
                    break;
                case -911914395:
                case 1217666162:
                    c14570 = c5205.f18365;
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16255) ^ 1549962621;
                        i5 = -1766364332;
                    } else {
                        iM2761 = C0619.m2761("ۜۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-1331)) ^ (-1323826833);
                        i5 = 1339017378;
                    }
                    break;
                case -892196720:
                case 1379318185:
                    if (C3690.f12684 <= 0) {
                        iM2761 = C0773.m3169("֡ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1207) ^ (-612159740);
                        i5 = -511405782;
                    } else {
                        iM2761 = (i2 - C0773.m3169("᩸ۧ")) * (-5);
                        i4 = ((iM2761 ^ i3) * (-11335)) ^ 2076433269;
                        i5 = -884642089;
                    }
                    break;
                case -884413196:
                case 2040166506:
                    C2485.m8357();
                    RunnableC0334.m2063();
                    iM2761 = (i3 - C0619.m2761("۟᩷")) * 5;
                    i4 = ((iM2761 ^ i2) * (-24459)) ^ 483301201;
                    i5 = 1212827780;
                    break;
                case -802659803:
                case 239127425:
                    break;
                case -514502587:
                case 883066138:
                    if (C1343.f4799 != 0) {
                        iM2761 = (i3 - C0619.m2761("۟᩷")) * 5;
                        i4 = ((iM2761 ^ i2) * (-24459)) ^ 483301201;
                        i5 = 1212827780;
                    } else {
                        iM2761 = C0619.m2761("ᩳۗ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 23789) ^ (-1843059314);
                        i5 = 1002950658;
                    }
                    break;
                case -442913174:
                case 295491028:
                    C0269.m1786(c23255, strM18539);
                    if (C1519.f5300 >= 0) {
                        iM2761 = C0773.m3169("֡ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1207) ^ (-612159740);
                        i5 = -511405782;
                    } else {
                        iM2761 = C0773.m3169("᩷᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 27977) ^ (-2034208243);
                        i5 = 1673679676;
                    }
                    break;
                case -380376536:
                case 511941642:
                    c6609 = (C6609) C2310.m7814(c12574M54773.f40370, strM35150);
                    if (c6609 != null) {
                        iM2761 = C0773.m3169("ܳ᩶") ^ i2;
                        i4 = ((iM2761 ^ i3) * (-7471)) ^ (-743851657);
                        i5 = -1578321913;
                    } else {
                        iM2761 = (i3 - C0773.m3169("ܿۚ")) * (-39);
                        i4 = ((iM2761 ^ i2) * 26671) ^ (-124066268);
                        i5 = 272798024;
                    }
                    break;
                case -366806692:
                case 11619764:
                    C2878.m9491();
                    C1542.m5459();
                    break;
                case -117740735:
                case 1225643357:
                    C2310.m7800(c5205.f18363, c6609.m18541());
                    iM2761 = (i3 - C0773.m3169("ܿۚ")) * (-39);
                    i4 = ((iM2761 ^ i2) * 26671) ^ (-124066268);
                    i5 = 272798024;
                    break;
                case 212667482:
                case 971871099:
                    c5205 = (C5205) C0950.m3796(itM4942);
                    if (AbstractC0641.m2813() <= 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16255) ^ 1549962621;
                        i5 = -1766364332;
                    } else {
                        iM2761 = (C0773.m3169("ۧ᩺") ^ i2) * 109;
                        i4 = ((iM2761 ^ i3) * (-8915)) ^ (-2037285623);
                        i5 = 1885363404;
                    }
                    break;
                case 285745731:
                case 840379320:
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0773.m3169("֡ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1207) ^ (-612159740);
                        i5 = -511405782;
                    } else {
                        iM2761 = (i3 - C0773.m3169("֡ܰ")) * 67;
                        i4 = ((iM2761 ^ i2) * 32499) ^ 441806074;
                        i5 = 460531990;
                    }
                    break;
                case 311046495:
                case 1672961899:
                    itM4942 = C1343.m4942(activityC22359.f72380);
                    iM2761 = (i3 - C0773.m3169("ܿۚ")) * (-39);
                    i4 = ((iM2761 ^ i2) * 26671) ^ (-124066268);
                    i5 = 272798024;
                    break;
                case 598357916:
                case 1182314988:
                    c12574M54773 = C24509.m54773(str);
                    if (c12574M54773 == null) {
                        iM2761 = C0773.m3169("ܺۤ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 18455) ^ 1985897861;
                        i5 = -85701558;
                    } else {
                        iM2761 = (C0773.m3169("ܺ᩷") ^ i2) * 15;
                        i4 = ((iM2761 ^ i3) * 28567) ^ 1409904788;
                        i5 = -499014685;
                    }
                    break;
                case 721008644:
                case 792747969:
                    C3779.m12264();
                    if (C2354.f7599 < 0) {
                        iM2761 = C0773.m3169("ۡ᩻") ^ i2;
                        i4 = ((iM2761 ^ i3) * 16255) ^ 1549962621;
                        i5 = -1766364332;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۟᩷")) * 5;
                        i4 = ((iM2761 ^ i2) * (-24459)) ^ 483301201;
                        i5 = 1212827780;
                    }
                    break;
                case 1071682413:
                case 1894390013:
                    if (C23916.m53419() != 0) {
                        iM2761 = (i3 - C0619.m2761("۟᩷")) * 5;
                        i4 = ((iM2761 ^ i2) * (-24459)) ^ 483301201;
                        i5 = 1212827780;
                    } else {
                        iM2761 = C0773.m3169("ۚۡ") ^ i3;
                        i4 = ((iM2761 ^ i2) * (-8177)) ^ (-2054796538);
                        i5 = -1658962877;
                    }
                    break;
                default:
                    C3099.m10095();
                    if (C2834.f9334 <= 0) {
                        iM2761 = C0773.m3169("֡ۜ") ^ i2;
                        i4 = ((iM2761 ^ i3) * 1207) ^ (-612159740);
                        i5 = -511405782;
                    } else {
                        iM2761 = (i3 - C0619.m2761("۟᩷")) * 5;
                        i4 = ((iM2761 ^ i2) * (-24459)) ^ 483301201;
                        i5 = 1212827780;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0245 A[PHI: r2 r3 r8 r9 r18 r22 r23
      0x0245: PHI (r2v4 android.view.MenuItem) = (r2v2 android.view.MenuItem), (r2v2 android.view.MenuItem), (r2v2 android.view.MenuItem), (r2v5 android.view.MenuItem) binds: [B:57:0x0243, B:38:0x0152, B:34:0x012d, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r3v5 int) = (r3v2 int), (r3v2 int), (r3v3 int), (r3v2 int) binds: [B:57:0x0243, B:38:0x0152, B:34:0x012d, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r8v5 int) = (r8v2 int), (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:57:0x0243, B:38:0x0152, B:34:0x012d, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r9v4 short[]) = (r9v2 short[]), (r9v2 short[]), (r9v2 short[]), (r9v5 short[]) binds: [B:57:0x0243, B:38:0x0152, B:34:0x012d, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r18v5 short) = (r18v3 short), (r18v2 short), (r18v2 short), (r18v2 short) binds: [B:57:0x0243, B:38:0x0152, B:34:0x012d, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r22v22 int) = (r22v6 int), (r22v13 int), (r22v14 int), (r22v24 int) binds: [B:57:0x0243, B:38:0x0152, B:34:0x012d, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r23v6 short) = (r23v4 short), (r23v3 short), (r23v3 short), (r23v3 short) binds: [B:57:0x0243, B:38:0x0152, B:34:0x012d, B:7:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM3169;
        int i;
        int i2;
        int iM2761;
        int i3;
        int i4;
        int i5 = C1564.f5401;
        int i6 = C3492.f12043;
        int iM31610 = (C0773.m3169("᩸ܺ") ^ i5) * (-25);
        int i7 = ((iM31610 ^ i6) * 20071) ^ 510482274;
        MenuItem menuItemM3793 = null;
        String strM5471 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = iM31610 ^ (-1294485493);
        int i9 = 0;
        int iM2762 = 0;
        int iM31611 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 313305495;
        short s2 = 0;
        while (true) {
            i17 = i8 ^ (i7 & (((i17 ^ i6) * 27233) >> 31));
            switch (i17) {
                case -2134783826:
                case 945157236:
                    i9 = i9;
                    i12 = 3;
                    if (C17202.m40372()) {
                        iM2761 = C0619.m2761("ۜۤ") ^ i6;
                        i3 = ((iM2761 ^ i5) * 27391) ^ (-1672652597);
                        i4 = 797639615;
                    } else {
                        iM2761 = (C0773.m3169("ܳۗ") ^ i5) * (-81);
                        i3 = ((iM2761 ^ i6) * (-1377)) ^ (-1102049716);
                        i4 = 72607255;
                    }
                    int i18 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i18;
                    break;
                case -2091215278:
                case -746909724:
                    C2834.m9344();
                    i9 = i9;
                    iM2761 = (C0773.m3169("ܽ᩷") + i5) * (-43);
                    i3 = ((iM2761 ^ i6) * 6653) ^ (-811066112);
                    i4 = 1322769585;
                    int i19 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i19;
                    break;
                case -1432216969:
                case 45271530:
                    i16 = 15468;
                    iM2761 = (C0619.m2761("ܽ᩹") ^ i6) * (-69);
                    i3 = ((iM2761 ^ i5) * (-16295)) ^ 1596696857;
                    i4 = 1720226613;
                    int i110 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i110;
                    break;
                case -1295729565:
                case -40786824:
                    C1783.m6232();
                    if (C1564.m5509() > 0) {
                        i9 = i9;
                        iM2761 = C0619.m2761("۟᩷") ^ i5;
                        i3 = ((iM2761 ^ i6) * (-6575)) ^ 1092357798;
                        i4 = -1885713079;
                        int i111 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i111;
                    } else {
                        iM3169 = C0773.m3169("۬ᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * 19701) ^ (-2144544596);
                        i2 = -1064476123;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    }
                    break;
                case -1247735044:
                case -70192276:
                    i9 = i9;
                    sArr = f72372;
                    if (C2419.m8174() >= 0) {
                        iM2761 = C0619.m2761("۟᩷") ^ i5;
                        i3 = ((iM2761 ^ i6) * (-6575)) ^ 1092357798;
                        i4 = -1885713079;
                    } else {
                        iM2761 = C0619.m2761("ۢ֨") ^ i6;
                        i3 = ((iM2761 ^ i5) * 12649) ^ (-1950153780);
                        i4 = -816987315;
                    }
                    int i112 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i112;
                    break;
                case -1165672351:
                case 1129250273:
                    iM31611 = C0773.m3169(strM5471);
                    i10 = 2122745694;
                    if (C3448.m11248() == 0) {
                        iM3169 = C0773.m3169("᩶ᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * (-25885)) ^ (-888570869);
                        i2 = 1570971119;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM2761 = (C0773.m3169("ܽ᩷") + i5) * (-43);
                        i3 = ((iM2761 ^ i6) * 6653) ^ (-811066112);
                        i4 = 1322769585;
                        int i113 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i113;
                    }
                    break;
                case -1097628782:
                case -591690622:
                    i9 = i9;
                    c = '.';
                    if (C1783.f6087 <= 0) {
                        i9 = i9;
                        iM2761 = (C0619.m2761("ۚ᩺") ^ i6) * (-105);
                        i9 = i9;
                        i3 = ((iM2761 ^ i5) * (-16777)) ^ 2132278431;
                        i4 = 2100269388;
                    } else {
                        iM2761 = (C0619.m2761("᩸ۤ") + i5) * 89;
                        i3 = ((iM2761 ^ i6) * 10575) ^ (-1492662021);
                        i4 = 1271517227;
                    }
                    int i114 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i114;
                    break;
                case -950705349:
                case 1014842622:
                    i9 = i9;
                    iM2762 = C0619.m2761(C3099.m10092(sArr2, i11, i12, i16));
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ܳۗ") ^ i5) * (-81);
                        i3 = ((iM2761 ^ i6) * (-1377)) ^ (-1102049716);
                        i4 = 72607255;
                    } else {
                        iM2761 = (C0773.m3169("᩶ۗ") ^ i5) * 59;
                        i3 = ((iM2761 ^ i6) * (-19143)) ^ 1496205003;
                        i4 = 1764186226;
                    }
                    int i115 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i115;
                    break;
                case -923104574:
                case 546007366:
                    i16 = 8631;
                    iM2761 = (C0619.m2761("ܽ᩹") ^ i6) * (-69);
                    i3 = ((iM2761 ^ i5) * (-16295)) ^ 1596696857;
                    i4 = 1720226613;
                    int i116 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i116;
                    break;
                case -735784980:
                case -681990075:
                    i9 = i9;
                    s = sArr[c];
                    s2 = 37820;
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ܳۗ") ^ i5) * (-81);
                        i3 = ((iM2761 ^ i6) * (-1377)) ^ (-1102049716);
                        i4 = 72607255;
                    } else {
                        iM2761 = (C0619.m2761("᩶ܽ") ^ i5) * 49;
                        i3 = ((iM2761 ^ i6) * (-4183)) ^ (-1074125297);
                        i4 = 1963686648;
                    }
                    int i117 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i117;
                    break;
                case -735281825:
                case 1314312088:
                    C2023.m6953(menuItemM3793, iM31611 ^ i10);
                    menuItemM3793.setShowAsAction(2);
                    return true;
                case -703583770:
                case 1522186416:
                    strM5471 = C1542.m5471(sArr3, 50, 3, i16);
                    if (C4282.f15546 <= 0) {
                        iM3169 = C0773.m3169("۬ᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * 19701) ^ (-2144544596);
                        i2 = -1064476123;
                    } else {
                        iM3169 = (i6 - C0619.m2761("۬֫")) * 115;
                        i = ((iM3169 ^ i5) * 27151) ^ 1009039107;
                        i2 = 1306541471;
                    }
                    i8 = iM3169 ^ i2;
                    i7 = i;
                    break;
                case -694221864:
                case 646260960:
                    RunnableC3646.m11813();
                    return false;
                case -618941562:
                case -183680126:
                    C0269.m1775();
                    if (C0862.f3233 != 0) {
                        iM3169 = C0773.m3169("۬ᩴ") ^ i6;
                        i = ((iM3169 ^ i5) * 19701) ^ (-2144544596);
                        i2 = -1064476123;
                        i8 = iM3169 ^ i2;
                        i7 = i;
                    } else {
                        i9 = i9;
                        iM2761 = (C0773.m3169("ܽ᩷") + i5) * (-43);
                        i3 = ((iM2761 ^ i6) * 6653) ^ (-811066112);
                        i4 = 1322769585;
                        int i118 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i118;
                    }
                    break;
                case -132190366:
                case 2049155647:
                    sArr2 = f72372;
                    i11 = 47;
                    if (C0269.m1775() <= 0) {
                        i9 = 0;
                        iM2761 = (C0619.m2761("ۚ᩺") ^ i6) * (-105);
                        i9 = i9;
                        i3 = ((iM2761 ^ i5) * (-16777)) ^ 2132278431;
                        i4 = 2100269388;
                        int i119 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i119;
                    } else {
                        int iM31612 = C0773.m3169("۫ᩳ") ^ i5;
                        i8 = iM31612 ^ 1120068911;
                        i7 = ((iM31612 ^ i6) * (-11745)) ^ (-2083793804);
                        i9 = 0;
                    }
                    break;
                case 58112268:
                case 2065845574:
                    i9 = i9;
                    i13 = s * s2;
                    i14 = s * s;
                    i15 = 357588100;
                    if (C3099.m10095()) {
                        iM2761 = (C0773.m3169("ܽ᩷") + i5) * (-43);
                        i3 = ((iM2761 ^ i6) * 6653) ^ (-811066112);
                        i4 = 1322769585;
                    } else {
                        iM2761 = C0773.m3169("ܽܺ") ^ i6;
                        i3 = ((iM2761 ^ i5) * (-11195)) ^ (-758462934);
                        i4 = 2065515117;
                    }
                    int i1110 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1110;
                    break;
                case 445576016:
                case 1760246073:
                    i9 = i9;
                    if ((i14 + i15) - i13 < 0) {
                        iM2761 = (C0619.m2761("ۤ᩸") ^ i5) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i3 = ((iM2761 ^ i6) * 16083) ^ (-1948336506);
                        i4 = 1736266809;
                    } else {
                        iM2761 = (i6 - C0619.m2761("᩹ۤ")) * 75;
                        i3 = ((iM2761 ^ i5) * 19155) ^ (-1016881274);
                        i4 = 1928292189;
                    }
                    int i1111 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1111;
                    break;
                case 845506830:
                case 2111834482:
                    if (C3734.f12817 >= 0) {
                        iM2761 = (C0619.m2761("ۚ᩺") ^ i6) * (-105);
                        i9 = i9;
                        i3 = ((iM2761 ^ i5) * (-16777)) ^ 2132278431;
                        i4 = 2100269388;
                        int i1112 = i9;
                        i8 = iM2761 ^ i4;
                        i7 = i3;
                        i9 = i1112;
                    }
                    i9 = i9;
                    iM2761 = C0619.m2761("۟᩷") ^ i5;
                    i3 = ((iM2761 ^ i6) * (-6575)) ^ 1092357798;
                    i4 = -1885713079;
                    int i1113 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1113;
                    break;
                default:
                    int i20 = 2128810005 ^ iM2762;
                    menuItemM3793 = C0950.m3793(menu, i9, i20, i9, i20);
                    sArr3 = f72372;
                    if (C4238.m13540() <= 0) {
                        i9 = i9;
                        iM2761 = (C0773.m3169("ܳۗ") ^ i5) * (-81);
                        i3 = ((iM2761 ^ i6) * (-1377)) ^ (-1102049716);
                        i4 = 72607255;
                    } else {
                        iM2761 = C0773.m3169("ܶܶ") ^ i5;
                        i9 = i9;
                        i3 = ((iM2761 ^ i6) * 27927) ^ (-1950761248);
                        i4 = -1400426859;
                    }
                    int i1114 = i9;
                    i8 = iM2761 ^ i4;
                    i7 = i3;
                    i9 = i1114;
                    break;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM2761;
        int i;
        int i2;
        int iM2762;
        int i3;
        int i4;
        int iM2763;
        int i5;
        int iM2764;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM3169;
        int i10;
        int i11;
        int i12;
        short[] sArr;
        int i13;
        int iM31610;
        int i14;
        int i15;
        int iM31611;
        short[] sArr2;
        int i16;
        int iM2765;
        int i17;
        int i18;
        C5205 c5205;
        int iM2766;
        int i19;
        int i20;
        int iM31612;
        int i21;
        int i22;
        int i23 = 1256752615;
        int i24 = C0269.f1558;
        int i25 = C3690.f12684;
        int iM2767 = (C0619.m2761("۠᩵") + i24) * 33;
        int i26 = ((iM2767 ^ i25) * (-2641)) ^ (-667262290);
        int i27 = iM2767 ^ 1195989897;
        String str = null;
        Iterator itM13647 = null;
        C5205 c5206 = null;
        C5205 c5207 = null;
        String strM35150 = null;
        String strM40377 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        boolean z = false;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int iM8344 = 0;
        int i31 = 0;
        int iM31613 = 0;
        int i32 = 0;
        char c = 0;
        short s = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        boolean zM12923 = false;
        int i36 = 0;
        C23255 c23255 = null;
        C5205 c5208 = null;
        JSONException jSONException = null;
        String strM11996 = null;
        String strM33137 = null;
        boolean zM9480 = false;
        boolean zM9481 = false;
        ArrayList arrayList = null;
        JSONObject jSONObject = null;
        boolean z2 = false;
        JSONObject jSONObject2 = null;
        String strM6952 = null;
        boolean z3 = false;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i25) * 23951) >> 31));
            switch (i23) {
                case -2103291348:
                case 1648844313:
                    AbstractC0641.m2814(this, jSONException, str);
                    return z;
                case -1884654765:
                case 171623371:
                    strM6952 = strM6952;
                    c5208 = c5208;
                    if (C2287.m7737(AbstractC0116.m1233(c5208.f18363)) == 0) {
                        c5206 = c5206;
                        c5207 = c5207;
                        i31 = i31;
                        sArr4 = sArr4;
                        i36 = i36;
                        iM2765 = (C0619.m2761("ۢܽ") ^ i24) * (-47);
                        i17 = ((iM2765 ^ i25) * (-24357)) ^ 1035808419;
                        i18 = 414363187;
                        i22 = iM2765 ^ i18;
                        i36 = i36;
                        sArr4 = sArr4;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i22;
                        i26 = i17;
                        c5207 = c5205;
                    } else {
                        iM3169 = C0773.m3169("۫ۙ") ^ i24;
                        c5206 = c5206;
                        i10 = ((iM3169 ^ i25) * 27857) ^ (-1692590536);
                        i11 = 1929726037;
                        i27 = iM3169 ^ i11;
                        i26 = i10;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    break;
                case -1780438527:
                case 885228026:
                    RunnableC0334.m2063();
                    iM2761 = C0773.m3169("ۜۙ") ^ i24;
                    i = ((iM2761 ^ i25) * (-17043)) ^ (-2048565647);
                    i2 = -2065640315;
                    i27 = iM2761 ^ i2;
                    i26 = i;
                    break;
                case -1678676299:
                case 86240118:
                    strM6952 = strM6952;
                    try {
                        C5205 c5209 = (C5205) C0950.m3796(itM13647);
                        try {
                            strM35150 = c5209.f18365.m35150();
                            zM9480 = C2878.m9480(strM35150);
                            int iM31614 = (C0773.m3169("᩷ۜ") + i24) * 5;
                            i27 = iM31614 ^ (-787210435);
                            i26 = ((iM31614 ^ i25) * (-32161)) ^ (-865952004);
                            c5207 = c5209;
                            strM6952 = strM6952;
                        } catch (JSONException e) {
                            jSONException = e;
                            c5207 = c5209;
                            c5208 = c5208;
                            c5206 = c5206;
                            i36 = i36;
                            iM2765 = C0773.m3169("ۤܺ") ^ i25;
                            c5207 = c5207;
                            i17 = ((iM2765 ^ i24) * (-20421)) ^ 1645638086;
                            i18 = -1135489126;
                            i22 = iM2765 ^ i18;
                            i36 = i36;
                            sArr4 = sArr4;
                            i31 = i31;
                            c5206 = c5206;
                            c5208 = c5208;
                            strM6952 = strM6952;
                            c5205 = c5207;
                            i27 = i22;
                            i26 = i17;
                            c5207 = c5205;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        jSONException = e;
                        c5208 = c5208;
                        c5206 = c5206;
                        i36 = i36;
                        iM2765 = C0773.m3169("ۤܺ") ^ i25;
                        c5207 = c5207;
                        i17 = ((iM2765 ^ i24) * (-20421)) ^ 1645638086;
                        i18 = -1135489126;
                        i22 = iM2765 ^ i18;
                        i36 = i36;
                        sArr4 = sArr4;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i22;
                        i26 = i17;
                        c5207 = c5205;
                        break;
                    }
                    break;
                case -1643233364:
                case 486136930:
                    C5205 c52010 = c5206;
                    c5207 = c5207;
                    strM6952 = strM6952;
                    int i37 = i31;
                    short[] sArr6 = sArr4;
                    int i38 = i36;
                    C5205 c52011 = (C5205) C1542.m5457(arrayList, i37);
                    if (C2287.m7737(AbstractC3624.m11756(c52011.f18367)) == 0) {
                        iM2766 = C0619.m2761("ۚ֫") ^ i24;
                        i19 = ((iM2766 ^ i25) * (-10779)) ^ (-1498162469);
                        i20 = -2047431712;
                    } else {
                        iM2766 = C0619.m2761("۠֨") ^ i24;
                        i19 = ((iM2766 ^ i25) * (-609)) ^ 1851293200;
                        i20 = -539282440;
                    }
                    i8 = iM2766 ^ i20;
                    i36 = i38;
                    sArr4 = sArr6;
                    i31 = i37;
                    c5206 = c52010;
                    c5208 = c52011;
                    i26 = i19;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i8;
                    c5207 = c5205;
                    break;
                case -1591313785:
                case 818916599:
                    if (!zM9481) {
                        iM2761 = (C0619.m2761("ܿᩴ") ^ i24) * 19;
                        i = ((iM2761 ^ i25) * 18755) ^ 971953230;
                        i2 = 1223650324;
                        i27 = iM2761 ^ i2;
                        i26 = i;
                    } else {
                        c5207 = c5207;
                        strM6952 = strM6952;
                        c5208 = c5208;
                        sArr4 = sArr4;
                        c5206 = c5206;
                        i31 = i31;
                        i36 = i36;
                        iM2765 = C0619.m2761("ۘܺ") ^ i25;
                        i17 = ((iM2765 ^ i24) * 31925) ^ 648563927;
                        i18 = -784697020;
                        i22 = iM2765 ^ i18;
                        i36 = i36;
                        sArr4 = sArr4;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i22;
                        i26 = i17;
                        c5207 = c5205;
                    }
                    break;
                case -1586058725:
                case 2013527559:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    arrayList = this.f72380;
                    C23255 c23256 = ((C5205) C3690.m11990(arrayList, z2 ? 1 : 0)).f18363;
                    if (C3492.f12043 > 0) {
                        int iM2768 = (C0619.m2761("ۖ۫") + i24) * (-43);
                        c23255 = c23256;
                        i26 = ((iM2768 ^ i25) * 5665) ^ (-502998852);
                        i8 = iM2768 ^ (-1140068856);
                        i36 = i36;
                        sArr4 = sArr4;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i8;
                        c5207 = c5205;
                    } else {
                        c23255 = c23256;
                        iM2763 = (C0773.m3169("᩶᩹") + i24) * (-59);
                        i3 = ((iM2763 ^ i25) * (-5849)) ^ 682361376;
                        i5 = -865236692;
                        i13 = iM2763 ^ i5;
                        i36 = i36;
                        c5207 = c5207;
                        sArr4 = sArr4;
                        i27 = i13;
                        i26 = i3;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    break;
                case -1431246354:
                case 1666950227:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    c5206 = c5206;
                    i31 = i31;
                    this.f72379.m36527(i31);
                    sArr4 = f72372;
                    i36 = 57;
                    if (C2834.f9334 <= 0) {
                        iM31612 = (C0619.m2761("ܰ᩺") + i25) * (-49);
                        i17 = ((iM31612 ^ i24) * 5747) ^ (-98998089);
                        i21 = 100685683;
                    } else {
                        iM31612 = C0773.m3169("᩺ܺ") ^ i25;
                        i17 = ((iM31612 ^ i24) * 7461) ^ 1643777539;
                        i21 = -1683263945;
                    }
                    i22 = iM31612 ^ i21;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -1420317869:
                case -1162129729:
                    C4282.m13644();
                    if (C1080.f3865 < 0) {
                        c5207 = c5207;
                        strM6952 = strM6952;
                        iM8344 = iM8344;
                        c5208 = c5208;
                        sArr4 = sArr4;
                        c5206 = c5206;
                        i31 = i31;
                        i36 = i36;
                        iM2762 = C0619.m2761("۫۬") ^ i24;
                        i3 = ((iM2762 ^ i25) * (-28677)) ^ (-1928599267);
                        i4 = 2036570880;
                        i13 = iM2762 ^ i4;
                        iM8344 = iM8344;
                        i36 = i36;
                        c5207 = c5207;
                        sArr4 = sArr4;
                        i27 = i13;
                        i26 = i3;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    } else {
                        iM2761 = (C0619.m2761("ܿᩳ") ^ i25) * 97;
                        i = ((iM2761 ^ i24) * 9891) ^ 684001915;
                        i2 = -1475940541;
                        i27 = iM2761 ^ i2;
                        i26 = i;
                    }
                    break;
                case -1415369807:
                case 1732790520:
                    if (C2834.m9344() < 0) {
                        c5207 = c5207;
                        strM6952 = strM6952;
                        iM8344 = iM8344;
                        c5208 = c5208;
                        sArr4 = sArr4;
                        c5206 = c5206;
                        i31 = i31;
                        i36 = i36;
                        iM2762 = (C0619.m2761("᩶ۤ") + i25) * (-127);
                        i3 = ((iM2762 ^ i24) * 5489) ^ 220718983;
                        i4 = -1660586309;
                        i13 = iM2762 ^ i4;
                        iM8344 = iM8344;
                        i36 = i36;
                        c5207 = c5207;
                        sArr4 = sArr4;
                        i27 = i13;
                        i26 = i3;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    } else {
                        c5207 = c5207;
                        strM6952 = strM6952;
                        c5208 = c5208;
                        c5206 = c5206;
                        i31 = i31;
                        iM31612 = (C0619.m2761("ܰ᩺") + i25) * (-49);
                        i17 = ((iM31612 ^ i24) * 5747) ^ (-98998089);
                        i21 = 100685683;
                        i22 = iM31612 ^ i21;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i22;
                        i26 = i17;
                        c5207 = c5205;
                    }
                    break;
                case -1415145497:
                case 80256332:
                    C0950.m3785();
                    C1146.m4231();
                    return false;
                case -1366819831:
                case 1445322366:
                    if (C2354.f7599 >= 0) {
                        iM2761 = (C0619.m2761("ܿᩳ") ^ i25) * 97;
                        i = ((iM2761 ^ i24) * 9891) ^ 684001915;
                        i2 = -1475940541;
                        i27 = iM2761 ^ i2;
                        i26 = i;
                    } else {
                        strM6952 = strM6952;
                        c5208 = c5208;
                        i12 = i36;
                        c5206 = c5206;
                        sArr = sArr4;
                        iM31611 = (C0773.m3169("᩵֨") ^ i25) * 75;
                        sArr2 = sArr;
                        i10 = ((iM31611 ^ i24) * (-1775)) ^ 2064655029;
                        i16 = 1152441739;
                        i36 = i12;
                        c5207 = c5207;
                        sArr4 = sArr2;
                        i27 = iM31611 ^ i16;
                        i26 = i10;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    break;
                case -1317755101:
                case 42978912:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    try {
                        itM13647 = C4282.m13647(arrayList);
                        iM2765 = C0619.m2761("ۘܺ") ^ i25;
                        i17 = ((iM2765 ^ i24) * 31925) ^ 648563927;
                        i18 = -784697020;
                    } catch (JSONException e3) {
                        jSONException = e3;
                        c5207 = c5207;
                        iM2765 = C0773.m3169("ۤܺ") ^ i25;
                        c5207 = c5207;
                        i17 = ((iM2765 ^ i24) * (-20421)) ^ 1645638086;
                        i18 = -1135489126;
                    }
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -1292607732:
                case 514003796:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    z = true;
                    if (C0862.m3509(AbstractC3624.m11756(c23255)) != 0) {
                        iM2765 = (i24 - C0773.m3169("ܿۖ")) * 49;
                        i17 = ((iM2765 ^ i25) * (-4919)) ^ 1787169287;
                        i18 = -154699549;
                    } else {
                        iM2765 = (C0619.m2761("᩺᩷") ^ i25) * (-15);
                        i17 = ((iM2765 ^ i24) * 27705) ^ 400683261;
                        i18 = 1480078366;
                    }
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -1189148425:
                case 1767610699:
                    strM6952 = strM6952;
                    JSONException jSONException2 = jSONException;
                    c5208 = c5208;
                    c5206 = c5206;
                    if (i31 == 0) {
                        jSONException = jSONException2;
                        c5207 = c5207;
                        i31 = i31;
                        sArr4 = sArr4;
                        i36 = i36;
                        iM2765 = (C0619.m2761("ۢܽ") ^ i24) * (-47);
                        i17 = ((iM2765 ^ i25) * (-24357)) ^ 1035808419;
                        i18 = 414363187;
                        i22 = iM2765 ^ i18;
                        i36 = i36;
                        sArr4 = sArr4;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i22;
                        i26 = i17;
                        c5207 = c5205;
                    } else {
                        int iM31615 = (C0773.m3169("ᩳ᩷") + i24) * 37;
                        jSONException = jSONException2;
                        i26 = ((iM31615 ^ i25) * (-16039)) ^ 1771591983;
                        i27 = iM31615 ^ 1510220732;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    break;
                case -1155263699:
                case 1764182520:
                    try {
                        strM6952 = strM6952;
                        try {
                            strM11996 = C3690.m11996(f72372, 63, 3, i30);
                            iM31610 = (C0773.m3169("ۢۧ") + i25) * (-17);
                            i14 = ((iM31610 ^ i24) * 4581) ^ (-581905400);
                            i15 = -780874107;
                            i27 = iM31610 ^ i15;
                            i26 = i14;
                            strM6952 = strM6952;
                        } catch (JSONException e4) {
                            e = e4;
                            jSONException = e;
                            c5208 = c5208;
                            c5206 = c5206;
                            i36 = i36;
                            iM2765 = C0773.m3169("ۤܺ") ^ i25;
                            c5207 = c5207;
                            i17 = ((iM2765 ^ i24) * (-20421)) ^ 1645638086;
                            i18 = -1135489126;
                            i22 = iM2765 ^ i18;
                            i36 = i36;
                            sArr4 = sArr4;
                            i31 = i31;
                            c5206 = c5206;
                            c5208 = c5208;
                            strM6952 = strM6952;
                            c5205 = c5207;
                            i27 = i22;
                            i26 = i17;
                            c5207 = c5205;
                        }
                    } catch (JSONException e5) {
                        e = e5;
                        strM6952 = strM6952;
                    }
                    break;
                case -1135075888:
                case 1258570020:
                    C3734.m12146(C0619.m2761(strM40377) ^ 2124945351);
                    C0862.m3505(c5208.f18367);
                    return z;
                case -1119415490:
                case 1719226179:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    jSONObject2 = new JSONObject();
                    jSONObject = new JSONObject();
                    iM2765 = C0619.m2761("ۨܿ") ^ i25;
                    i17 = ((iM2765 ^ i24) * 24369) ^ 600558315;
                    i18 = -1886962924;
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -1088339439:
                case 1312465723:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    str = null;
                    if (i31 < C2702.m8879(arrayList)) {
                        iM2765 = (i25 - C0773.m3169("ۚۡ")) * (-61);
                        i17 = ((iM2765 ^ i24) * (-22361)) ^ 495975106;
                        i18 = 482635881;
                    } else {
                        iM2765 = C0773.m3169("ۢܿ") ^ i24;
                        i17 = ((iM2765 ^ i25) * (-32659)) ^ (-602088121);
                        i18 = -1845405764;
                    }
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -953712738:
                case 768103008:
                    i9 = 0;
                    int iM2769 = (C0619.m2761("ۜܽ") + i25) * 57;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i9;
                    i26 = ((iM2769 ^ i24) * (-13057)) ^ (-898272336);
                    c5207 = c5207;
                    i27 = iM2769 ^ 1247813698;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case -917128219:
                case 24336322:
                    if (C4282.f15546 > 0) {
                        c5207 = c5207;
                        strM6952 = strM6952;
                        c5208 = c5208;
                        c5206 = c5206;
                        i31 = i31;
                        iM31612 = (C0619.m2761("ܰ᩺") + i25) * (-49);
                        i17 = ((iM31612 ^ i24) * 5747) ^ (-98998089);
                        i21 = 100685683;
                        i22 = iM31612 ^ i21;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i22;
                        i26 = i17;
                        c5207 = c5205;
                    } else {
                        iM2761 = C0773.m3169("ۜۙ") ^ i24;
                        i = ((iM2761 ^ i25) * (-17043)) ^ (-2048565647);
                        i2 = -2065640315;
                        i27 = iM2761 ^ i2;
                        i26 = i;
                    }
                    break;
                case -891931222:
                case -87870978:
                    try {
                        jSONObject.put(strM11996, strM6952);
                        c5207 = c5207;
                        strM6952 = strM6952;
                        c5208 = c5208;
                        sArr4 = sArr4;
                        c5206 = c5206;
                        i31 = i31;
                        i36 = i36;
                        iM2765 = C0619.m2761("ۘܺ") ^ i25;
                        i17 = ((iM2765 ^ i24) * 31925) ^ 648563927;
                        i18 = -784697020;
                    } catch (JSONException e6) {
                        jSONException = e6;
                        strM6952 = strM6952;
                        c5208 = c5208;
                        c5206 = c5206;
                        i36 = i36;
                        iM2765 = C0773.m3169("ۤܺ") ^ i25;
                        c5207 = c5207;
                        i17 = ((iM2765 ^ i24) * (-20421)) ^ 1645638086;
                        i18 = -1135489126;
                    }
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -750967117:
                case 1589461813:
                    C1783.m6232();
                    if (AbstractC0116.f1064 <= 0) {
                        strM6952 = strM6952;
                        iM8344 = iM8344;
                        c5208 = c5208;
                        sArr4 = sArr4;
                        c5206 = c5206;
                        i31 = i31;
                        i36 = i36;
                        iM2762 = (C0619.m2761("۫ܿ") + i24) * (-85);
                        i3 = ((iM2762 ^ i25) * 27457) ^ (-1492499139);
                        i4 = -435008606;
                        i13 = iM2762 ^ i4;
                        iM8344 = iM8344;
                        i36 = i36;
                        c5207 = c5207;
                        sArr4 = sArr4;
                        i27 = i13;
                        i26 = i3;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    c5207 = c5207;
                    strM6952 = strM6952;
                    iM8344 = iM8344;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    iM2762 = C0619.m2761("۫۬") ^ i24;
                    i3 = ((iM2762 ^ i25) * (-28677)) ^ (-1928599267);
                    i4 = 2036570880;
                    i13 = iM2762 ^ i4;
                    iM8344 = iM8344;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case -727701662:
                case 12502670:
                    jSONObject2.put(strM11996, C2023.m6952(AbstractC0116.m1233(c5207.f18367)));
                    strM6952 = C2023.m6952(AbstractC0116.m1233(c5207.f18363));
                    zM9481 = C2878.m9480(strM6952);
                    iM2761 = C0773.m3169("ܺۗ") ^ i25;
                    i = ((iM2761 ^ i24) * (-19749)) ^ 2101593574;
                    i2 = 238816074;
                    i27 = iM2761 ^ i2;
                    i26 = i;
                    break;
                case -711311162:
                case 1952064992:
                    if (C1783.f6087 <= 0) {
                        iM2761 = (i25 - C0773.m3169("ܿۧ")) * (-51);
                        i = ((iM2761 ^ i24) * 28877) ^ (-95914318);
                        i2 = 317739264;
                        i27 = iM2761 ^ i2;
                        i26 = i;
                    } else {
                        strM6952 = strM6952;
                        c5208 = c5208;
                        i12 = i36;
                        c5206 = c5206;
                        sArr = sArr4;
                        iM31611 = (C0773.m3169("᩵֨") ^ i25) * 75;
                        sArr2 = sArr;
                        i10 = ((iM31611 ^ i24) * (-1775)) ^ 2064655029;
                        i16 = 1152441739;
                        i36 = i12;
                        c5207 = c5207;
                        sArr4 = sArr2;
                        i27 = iM31611 ^ i16;
                        i26 = i10;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    break;
                case -603944169:
                case 906479174:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    iM8344 = C2485.m8344(menuItem);
                    strM33137 = C13473.m33137(f72372, 54, 3, i30);
                    if (C2354.f7599 >= 0) {
                        iM2763 = (C0773.m3169("᩶᩹") + i24) * (-59);
                        i3 = ((iM2763 ^ i25) * (-5849)) ^ 682361376;
                        i5 = -865236692;
                    } else {
                        iM2763 = (C0619.m2761("ۡܽ") ^ i25) * 29;
                        i3 = ((iM2763 ^ i24) * 29977) ^ 423971223;
                        i5 = 595708616;
                    }
                    i13 = iM2763 ^ i5;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case -450258325:
                case 418357779:
                    strM6952 = strM6952;
                    C3734.m12146(iM31613 ^ i32);
                    c5206 = (C5205) C1542.m5457(arrayList, z2 ? 1 : 0);
                    if (AbstractC0116.f1064 > 0) {
                        iM31610 = (i25 - C0773.m3169("ۖᩳ")) * 99;
                        i14 = ((iM31610 ^ i24) * (-6737)) ^ 1907958802;
                        i15 = 1975546222;
                        i27 = iM31610 ^ i15;
                        i26 = i14;
                        strM6952 = strM6952;
                    } else {
                        iM8344 = iM8344;
                        c5208 = c5208;
                        sArr4 = sArr4;
                        c5206 = c5206;
                        i31 = i31;
                        i36 = i36;
                        iM2762 = (C0619.m2761("۫ܿ") + i24) * (-85);
                        i3 = ((iM2762 ^ i25) * 27457) ^ (-1492499139);
                        i4 = -435008606;
                        i13 = iM2762 ^ i4;
                        iM8344 = iM8344;
                        i36 = i36;
                        c5207 = c5207;
                        sArr4 = sArr4;
                        i27 = i13;
                        i26 = i3;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    break;
                case -382146099:
                case -68520347:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    iM8344 = iM8344;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    if (i34 - (i35 + 1) >= 0) {
                        iM2762 = C0773.m3169("ۛۢ") ^ i24;
                        i3 = ((iM2762 ^ i25) * (-31255)) ^ 1753363109;
                        i4 = 1890461286;
                    } else {
                        iM2762 = (C0773.m3169("۠۬") ^ i25) * 101;
                        i3 = ((iM2762 ^ i24) * 30365) ^ 317795590;
                        i4 = -152565290;
                    }
                    i13 = iM2762 ^ i4;
                    iM8344 = iM8344;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case -344269209:
                case -263376961:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    iM8344 = iM8344;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    s = sArr3[c];
                    i33 = s + 1;
                    if (C4238.m13540() <= 0) {
                        iM2762 = (C0619.m2761("۫ܿ") + i24) * (-85);
                        i3 = ((iM2762 ^ i25) * 27457) ^ (-1492499139);
                        i4 = -435008606;
                    } else {
                        iM2762 = C0773.m3169("᩺֫") ^ i25;
                        i3 = ((iM2762 ^ i24) * (-12541)) ^ 2127042293;
                        i4 = 265544352;
                    }
                    i13 = iM2762 ^ i4;
                    iM8344 = iM8344;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case -326168979:
                case 1918847671:
                    C2419.m8174();
                    if (RunnableC3646.f12471) {
                        iM2761 = C0773.m3169("ۜۙ") ^ i24;
                        i = ((iM2761 ^ i25) * (-17043)) ^ (-2048565647);
                        i2 = -2065640315;
                    } else {
                        iM2761 = C0773.m3169("ܰۡ") ^ i24;
                        i = ((iM2761 ^ i25) * 11803) ^ (-1490255459);
                        i2 = -434911669;
                    }
                    i27 = iM2761 ^ i2;
                    i26 = i;
                    break;
                case -271981754:
                case -77519600:
                    strM6952 = strM6952;
                    c5208 = c5208;
                    c5206 = c5206;
                    try {
                        zM12923 = C3998.m12923(itM13647);
                        iM3169 = C0773.m3169("֡ܶ") ^ i24;
                        i10 = ((iM3169 ^ i25) * (-9095)) ^ (-89397969);
                        i11 = 1879768061;
                        i27 = iM3169 ^ i11;
                        i26 = i10;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    } catch (JSONException e7) {
                        jSONException = e7;
                        i36 = i36;
                        iM2765 = C0773.m3169("ۤܺ") ^ i25;
                        c5207 = c5207;
                        i17 = ((iM2765 ^ i24) * (-20421)) ^ 1645638086;
                        i18 = -1135489126;
                        i22 = iM2765 ^ i18;
                        i36 = i36;
                        sArr4 = sArr4;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                        c5205 = c5207;
                        i27 = i22;
                        i26 = i17;
                        c5207 = c5205;
                    }
                    break;
                case -260387150:
                case 800187959:
                    C2834.m9339(new C13933(this, jSONObject2, jSONObject));
                    return z;
                case -258117329:
                case 2124883606:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    int i39 = i36;
                    c5206 = c5206;
                    i31 = i31;
                    if (z3) {
                        i36 = i39;
                        iM2765 = (C0619.m2761("ۢܽ") ^ i24) * (-47);
                        i17 = ((iM2765 ^ i25) * (-24357)) ^ 1035808419;
                        i18 = 414363187;
                    } else {
                        iM2765 = (C0619.m2761("ۙ᩹") ^ i25) * 11;
                        i36 = i39;
                        i17 = ((iM2765 ^ i24) * 17935) ^ (-1033997235);
                        i18 = 224887575;
                    }
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -180317691:
                case 1840973465:
                    if (RunnableC3055.f9898 >= 0) {
                        strM6952 = strM6952;
                        c5208 = c5208;
                        i12 = i36;
                        c5206 = c5206;
                        sArr = sArr4;
                        iM31611 = (C0773.m3169("᩵֨") ^ i25) * 75;
                        sArr2 = sArr;
                        i10 = ((iM31611 ^ i24) * (-1775)) ^ 2064655029;
                        i16 = 1152441739;
                        i36 = i12;
                        c5207 = c5207;
                        sArr4 = sArr2;
                        i27 = iM31611 ^ i16;
                        i26 = i10;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    } else {
                        iM2761 = C0773.m3169("ۜۙ") ^ i24;
                        i = ((iM2761 ^ i25) * (-17043)) ^ (-2048565647);
                        i2 = -2065640315;
                        i27 = iM2761 ^ i2;
                        i26 = i;
                    }
                    break;
                case -91117365:
                case 1152570180:
                    z3 = true;
                    iM2765 = (C0773.m3169("֨ۜ") + i24) * (-31);
                    i17 = ((iM2765 ^ i25) * 3143) ^ 1132066619;
                    i18 = -2122646419;
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case -40135113:
                case 1842439668:
                    return z2;
                case 35194596:
                case 191744136:
                    C5205 c52012 = c5207;
                    strM6952 = strM6952;
                    c5208 = c5208;
                    short[] sArr7 = sArr4;
                    C5205 c52013 = c5206;
                    int i40 = i31;
                    int i41 = i36;
                    int i42 = iM8344;
                    if (i42 == (C0619.m2761(strM33137) ^ 2124550523)) {
                        iM2764 = (C0773.m3169("ᩴ᩶") ^ i25) * (-37);
                        i6 = ((iM2764 ^ i24) * (-30959)) ^ (-642106427);
                        i7 = 1178279501;
                    } else {
                        iM2764 = (C0619.m2761("ۧ᩸") + i24) * 5;
                        i6 = ((iM2764 ^ i25) * (-14729)) ^ 579558675;
                        i7 = -2118856924;
                    }
                    iM8344 = i42;
                    i36 = i41;
                    c5207 = c52012;
                    sArr4 = sArr7;
                    i27 = iM2764 ^ i7;
                    i31 = i40;
                    i26 = i6;
                    c5206 = c52013;
                    z2 = false;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case 56425689:
                case 1030045641:
                    strM6952 = strM6952;
                    if (zM9480) {
                        iM31610 = C0773.m3169("۠ۖ") ^ i24;
                        i14 = ((iM31610 ^ i25) * (-22521)) ^ (-1861180566);
                        i15 = -1805496124;
                    } else {
                        strM11996 = strM35150;
                        iM31610 = (C0773.m3169("ۢۧ") + i25) * (-17);
                        i14 = ((iM31610 ^ i24) * 4581) ^ (-581905400);
                        i15 = -780874107;
                    }
                    i27 = iM31610 ^ i15;
                    i26 = i14;
                    strM6952 = strM6952;
                    break;
                case 316082275:
                case 1609065758:
                    i30 = 55842;
                    iM2762 = C0619.m2761("ܳۖ") ^ i24;
                    i3 = ((iM2762 ^ i25) * (-29099)) ^ (-1058041475);
                    i4 = 423737434;
                    i13 = iM2762 ^ i4;
                    iM8344 = iM8344;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case 366152509:
                case 1547898116:
                    strM6952 = strM6952;
                    this.f72379.m36527(z2 ? 1 : 0);
                    sArr5 = f72372;
                    i28 = 60;
                    i29 = 3;
                    if (C3998.m12920()) {
                        int iM31616 = (C0773.m3169("ܿ᩷") + i24) * 61;
                        i27 = iM31616 ^ 224880035;
                        i26 = ((iM31616 ^ i25) * 7583) ^ 313090195;
                    } else {
                        c5208 = c5208;
                        i12 = i36;
                        c5206 = c5206;
                        sArr = sArr4;
                        iM31611 = (C0773.m3169("᩵֨") ^ i25) * 75;
                        sArr2 = sArr;
                        i10 = ((iM31611 ^ i24) * (-1775)) ^ 2064655029;
                        i16 = 1152441739;
                        i36 = i12;
                        c5207 = c5207;
                        sArr4 = sArr2;
                        i27 = iM31611 ^ i16;
                        i26 = i10;
                        c5206 = c5206;
                        c5208 = c5208;
                    }
                    strM6952 = strM6952;
                    break;
                case 399973523:
                case 477299948:
                    z3 = false;
                    iM2765 = (C0773.m3169("֨ۜ") + i24) * (-31);
                    i17 = ((iM2765 ^ i25) * 3143) ^ 1132066619;
                    i18 = -2122646419;
                    i22 = iM2765 ^ i18;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    c5205 = c5207;
                    i27 = i22;
                    i26 = i17;
                    c5207 = c5205;
                    break;
                case 492969919:
                case 578186055:
                    C0862.m3505(c5206.f18363);
                    c5206.f18363.m52337(str);
                    return z;
                case 552931914:
                case 700069403:
                    i30 = 4306;
                    iM2762 = C0619.m2761("ܳۖ") ^ i24;
                    i3 = ((iM2762 ^ i25) * (-29099)) ^ (-1058041475);
                    i4 = 423737434;
                    i13 = iM2762 ^ i4;
                    iM8344 = iM8344;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case 725750040:
                case 1252771319:
                    i9 = i31 + 1;
                    int iM27610 = (C0619.m2761("ۜܽ") + i25) * 57;
                    i36 = i36;
                    sArr4 = sArr4;
                    i31 = i9;
                    i26 = ((iM27610 ^ i24) * (-13057)) ^ (-898272336);
                    c5207 = c5207;
                    i27 = iM27610 ^ 1247813698;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case 824416689:
                case 2084926574:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    iM8344 = iM8344;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    i34 = i33 * i33;
                    i35 = s * 2;
                    if (C1826.f6190 <= 0) {
                        iM2762 = C0619.m2761("۫۬") ^ i24;
                        i3 = ((iM2762 ^ i25) * (-28677)) ^ (-1928599267);
                        i4 = 2036570880;
                    } else {
                        iM2762 = (i25 - C0619.m2761("ۘۙ")) * (-47);
                        i3 = ((iM2762 ^ i24) * (-21035)) ^ (-1579451272);
                        i4 = -1969929494;
                    }
                    i13 = iM2762 ^ i4;
                    iM8344 = iM8344;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case 1231647160:
                case 1304893262:
                    strM6952 = strM6952;
                    iM31613 = C0773.m3169(C2834.m9343(sArr5, i28, i29, i30));
                    i32 = 2104925472;
                    if (C4238.f15451 < 0) {
                        iM31610 = C0773.m3169("ۨۧ") ^ i25;
                        i14 = ((iM31610 ^ i24) * 30175) ^ (-705334536);
                        i15 = -606468108;
                        i27 = iM31610 ^ i15;
                        i26 = i14;
                        strM6952 = strM6952;
                    } else {
                        c5207 = c5207;
                        c5208 = c5208;
                        sArr4 = sArr4;
                        c5206 = c5206;
                        i31 = i31;
                        i36 = i36;
                        iM2763 = (C0773.m3169("᩶᩹") + i24) * (-59);
                        i3 = ((iM2763 ^ i25) * (-5849)) ^ 682361376;
                        i5 = -865236692;
                        i13 = iM2763 ^ i5;
                        i36 = i36;
                        c5207 = c5207;
                        sArr4 = sArr4;
                        i27 = i13;
                        i26 = i3;
                        i31 = i31;
                        c5206 = c5206;
                        c5208 = c5208;
                        strM6952 = strM6952;
                    }
                    break;
                case 1316809087:
                case 1601250749:
                    c5207 = c5207;
                    strM6952 = strM6952;
                    iM8344 = iM8344;
                    c5208 = c5208;
                    sArr4 = sArr4;
                    c5206 = c5206;
                    i31 = i31;
                    i36 = i36;
                    sArr3 = f72372;
                    c = '5';
                    if (C1321.f4751 >= 0) {
                        iM2762 = (C0619.m2761("᩶ۤ") + i25) * (-127);
                        i3 = ((iM2762 ^ i24) * 5489) ^ 220718983;
                        i4 = -1660586309;
                    } else {
                        iM2762 = (i24 - C0619.m2761("᩺۟")) * (-125);
                        i3 = ((iM2762 ^ i25) * (-19197)) ^ 1221935346;
                        i4 = 123799049;
                    }
                    i13 = iM2762 ^ i4;
                    iM8344 = iM8344;
                    i36 = i36;
                    c5207 = c5207;
                    sArr4 = sArr4;
                    i27 = i13;
                    i26 = i3;
                    i31 = i31;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                case 1598871127:
                case 2123575298:
                    strM6952 = strM6952;
                    c5208 = c5208;
                    c5206 = c5206;
                    if (zM12923) {
                        iM3169 = (i25 - C0773.m3169("ᩳ۟")) * (-11);
                        i10 = ((iM3169 ^ i24) * 16063) ^ 1566270278;
                        i11 = 1317821650;
                    } else {
                        iM3169 = C0773.m3169("ۧ֡") ^ i25;
                        i10 = ((iM3169 ^ i24) * (-31507)) ^ 1760029316;
                        i11 = 289569997;
                    }
                    i27 = iM3169 ^ i11;
                    i26 = i10;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
                default:
                    strM6952 = strM6952;
                    c5208 = c5208;
                    c5206 = c5206;
                    c5207 = c5207;
                    sArr = sArr4;
                    i12 = i36;
                    strM40377 = C17202.m40377(sArr, i12, 3, i30);
                    if (C20932.f66974 <= 0) {
                        iM31611 = (C0773.m3169("᩵֨") ^ i25) * 75;
                        sArr2 = sArr;
                        i10 = ((iM31611 ^ i24) * (-1775)) ^ 2064655029;
                        i16 = 1152441739;
                    } else {
                        sArr2 = sArr;
                        iM31611 = C0773.m3169("ܺۛ") ^ i24;
                        i10 = ((iM31611 ^ i25) * (-15207)) ^ (-315252326);
                        i16 = -1826725074;
                    }
                    i36 = i12;
                    c5207 = c5207;
                    sArr4 = sArr2;
                    i27 = iM31611 ^ i16;
                    i26 = i10;
                    c5206 = c5206;
                    c5208 = c5208;
                    strM6952 = strM6952;
                    break;
            }
        }
    }
}
