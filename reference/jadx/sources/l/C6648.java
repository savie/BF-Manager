package l;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ۠᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E6NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6648 extends BaseAdapter {

    /* JADX INFO: renamed from: ۨ۬ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f22458 = {8188, 18353, 18073, 17738, -25054, 19988, -24963, 31557, 28418, 31434, -26357, 29035, -32084, 4912, 5031, 4912, -30049, 19581, 19237, -28850, 29456, 27072, 28895, -27312, 25675, 31161, -30022, -32739, -28461, 25761, -28598, -27941, -28574, 18121};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f22459;

    public C6648(List list) {
        this.f22459 = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return C1937.m6276(this.f22459);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        List list = null;
        int i2 = -1913335586;
        int i3 = AbstractC0464.f2088;
        int i4 = C3535.f13026;
        int iM45029 = C19806.m45029("֨۟") ^ i4;
        int i5 = ((iM45029 ^ i3) * 10981) ^ (-1797906540);
        int i6 = 846825255;
        while (true) {
            i2 = ((((i2 ^ i3) * 7013) >> 31) & i5) ^ (iM45029 ^ i6);
            switch (i2) {
                case -1913659539:
                case -82732119:
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31673)) ^ (-859251327);
                        i6 = -1798242092;
                    } else {
                        iM45029 = C19806.m45029("᩺ۗ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-9407)) ^ (-835572960);
                        i6 = 156660801;
                    }
                    break;
                case -1480238311:
                case -1188078335:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7927) ^ (-692437654);
                        i6 = 218676453;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۢ֡") + i3) * 87;
                        i5 = ((iM45029 ^ i4) * (-27319)) ^ (-917628759);
                        i6 = -918258217;
                    }
                    break;
                case -1310631930:
                case 1454732227:
                    if (C1461.m5080()) {
                        iM45029 = (i4 - C19806.m45029("ۖ᩵")) * 35;
                        i5 = ((iM45029 ^ i3) * 2979) ^ (-134564686);
                        i6 = 570789694;
                    } else {
                        iM45029 = (i3 - C19806.m45029("᩶ۙ")) * (-3);
                        i5 = ((iM45029 ^ i4) * 29903) ^ (-495770298);
                        i6 = 1264919132;
                    }
                    break;
                case -1115379288:
                case 810401771:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = C19806.m45029("ۖܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23575) ^ (-720199178);
                        i6 = 4410463;
                    } else {
                        iM45029 = (i4 - C19806.m45029("֨֡")) * 91;
                        i5 = ((iM45029 ^ i3) * 5403) ^ 1020273489;
                        i6 = 741091044;
                    }
                    break;
                case -1064118467:
                case -844862647:
                    if (C3660.f13403 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7927) ^ (-692437654);
                        i6 = 218676453;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۛ۫") ^ i4;
                        i5 = ((iM45029 ^ i3) * 6447) ^ 1815970300;
                        i6 = -1527677754;
                    }
                    break;
                case -860656854:
                case -219228724:
                    if (!C2332.f8260) {
                        iM45029 = C19806.m45029("۟ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-4353)) ^ 570218354;
                        i6 = 30728679;
                    } else {
                        iM45029 = (i4 - C19806.m45029("ۖ᩵")) * 35;
                        i5 = ((iM45029 ^ i3) * 2979) ^ (-134564686);
                        i6 = 570789694;
                    }
                    break;
                case -823429536:
                case 1157992585:
                    if (C0526.f2219) {
                        iM45029 = (i4 - C19806.m45029("ۖ᩵")) * 35;
                        i5 = ((iM45029 ^ i3) * 2979) ^ (-134564686);
                        i6 = 570789694;
                    } else {
                        iM45029 = C19806.m45029("ܿۗ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-9911)) ^ 36205552;
                        i6 = -282167927;
                    }
                    break;
                case -592762279:
                case 964832894:
                    if (C0216.f1393 != 0) {
                        iM45029 = C19806.m45029("۟ܳ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-4353)) ^ 570218354;
                        i6 = 30728679;
                    } else {
                        iM45029 = C19806.m45029("ۖܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23575) ^ (-720199178);
                        i6 = 4410463;
                    }
                    break;
                case -322304272:
                case 1838746895:
                    if (C3743.f13569) {
                        iM45029 = (C19806.m45029("۟ۖ") ^ i4) * (-83);
                        i5 = ((iM45029 ^ i3) * 24657) ^ (-1826469732);
                        i6 = -1370390004;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7927) ^ (-692437654);
                        i6 = 218676453;
                    }
                    break;
                case -41515440:
                case 945368166:
                    list = this.f22459;
                    if (RunnableC1895.f7152) {
                        iM45029 = (i3 - ThreadFactoryC3888.m11306("ۢܰ")) * 15;
                        i5 = ((iM45029 ^ i4) * 31275) ^ (-202397555);
                        i6 = 642301769;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۡ᩻") ^ i4;
                        i5 = ((iM45029 ^ i3) * 7927) ^ (-692437654);
                        i6 = 218676453;
                    }
                    break;
                case -14121525:
                case 200503742:
                    return ((C3825) RunnableC1606.m5478(list, i)).f14173;
                case 46425924:
                case 1390964544:
                    C1875.m6086();
                    if (RunnableC0195.f1321 < 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31673)) ^ (-859251327);
                        i6 = -1798242092;
                    } else {
                        iM45029 = C19806.m45029("ۖܽ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23575) ^ (-720199178);
                        i6 = 4410463;
                    }
                    break;
                case 213112672:
                case 1478565983:
                    C0050.m946();
                    return 0L;
                case 796723786:
                case 1580466636:
                    C1066.m4023();
                    C1189.m4368();
                    iM45029 = C19806.m45029("ۖܽ") ^ i3;
                    i5 = ((iM45029 ^ i4) * 23575) ^ (-720199178);
                    i6 = 4410463;
                    break;
                case 926494983:
                case 1145395236:
                    if (C0216.f1393 != 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31673)) ^ (-859251327);
                        i6 = -1798242092;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("֫ܳ") + i3) * (-61);
                        i5 = ((iM45029 ^ i4) * 26981) ^ (-1624279533);
                        i6 = -1253353756;
                    }
                    break;
                default:
                    if (C0526.m2437() >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۧ۠") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-31673)) ^ (-859251327);
                        i6 = -1798242092;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("۠۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * 29153) ^ 1021746860;
                        i6 = -422593262;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list = null;
        int i2 = -243112865;
        int i3 = C0050.f912;
        int i4 = C3722.f13525;
        int iM11306 = ThreadFactoryC3888.m11306("۫۫") ^ i4;
        int i5 = ((iM11306 ^ i3) * (-16975)) ^ 1672835420;
        int i6 = -932803546;
        while (true) {
            i2 = ((((i2 ^ i3) * (-13707)) >> 31) & i5) ^ (iM11306 ^ i6);
            switch (i2) {
                case -1814579637:
                case -996845414:
                    if (C3722.m10894() <= 0) {
                        iM11306 = (C19806.m45029("ᩴ᩻") ^ i4) * (-119);
                        i5 = ((iM11306 ^ i3) * 26795) ^ (-167526790);
                        i6 = -1573630319;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ܶۛ") ^ i3) * 127;
                        i5 = ((iM11306 ^ i4) * 11155) ^ (-1566290164);
                        i6 = -802881334;
                    }
                    break;
                case -1739451539:
                case 1684628872:
                    if (C1460.f5948 >= 0) {
                        iM11306 = (C19806.m45029("ᩴ᩻") ^ i4) * (-119);
                        i5 = ((iM11306 ^ i3) * 26795) ^ (-167526790);
                        i6 = -1573630319;
                    } else {
                        iM11306 = C19806.m45029("ۢ᩻") ^ i4;
                        i5 = ((iM11306 ^ i3) * 7057) ^ (-60365351);
                        i6 = 1856695386;
                    }
                    break;
                case -1427975313:
                case 2020612631:
                    list = this.f22459;
                    if (CallableC1627.m5507() != 0) {
                        iM11306 = (C19806.m45029("ᩴ᩻") ^ i4) * (-119);
                        i5 = ((iM11306 ^ i3) * 26795) ^ (-167526790);
                        i6 = -1573630319;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("᩸᩸")) * 37;
                        i5 = ((iM11306 ^ i4) * (-22959)) ^ 415007429;
                        i6 = -677138332;
                    }
                    break;
                case -1392661623:
                case -485690996:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * 5161) ^ (-1080691283);
                        i6 = 328025265;
                    } else {
                        iM11306 = (C19806.m45029("֨ۚ") + i3) * (-7);
                        i5 = ((iM11306 ^ i4) * 8449) ^ 2027079194;
                        i6 = -1465912490;
                    }
                    break;
                case -703700309:
                case -432997941:
                    return (C3825) C2477.m7592(list, i);
                case -555554740:
                case 815323988:
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩵") ^ i3) * 33;
                        i5 = ((iM11306 ^ i4) * (-29837)) ^ (-1642671048);
                        i6 = 915115649;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * 5161) ^ (-1080691283);
                        i6 = 328025265;
                    }
                    break;
                case -403747747:
                case 802802647:
                    if (C3577.f13150 < 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-21495)) ^ (-1805920660);
                        i6 = 1994872258;
                    } else {
                        iM11306 = (i4 - C19806.m45029("ۧۢ")) * (-3);
                        i5 = ((iM11306 ^ i3) * (-27417)) ^ 1207892400;
                        i6 = -686155508;
                    }
                    break;
                case -317167972:
                case 933126729:
                    if (C1419.f5860 >= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩵") ^ i3) * 33;
                        i5 = ((iM11306 ^ i4) * (-29837)) ^ (-1642671048);
                        i6 = 915115649;
                    } else {
                        iM11306 = C19806.m45029("۫᩻") ^ i3;
                        i5 = ((iM11306 ^ i4) * 9173) ^ (-804049192);
                        i6 = -730301826;
                    }
                    break;
                case -57731729:
                case 921928676:
                    C1460.m5050();
                    if (C0278.f1572 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶᩵") ^ i3) * 33;
                        i5 = ((iM11306 ^ i4) * (-29837)) ^ (-1642671048);
                        i6 = 915115649;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-21495)) ^ (-1805920660);
                        i6 = 1994872258;
                    }
                    break;
                case 422593456:
                case 1977539420:
                    if (C0629.f2722 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-21495)) ^ (-1805920660);
                        i6 = 1994872258;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۧۧ") + i4) * 25;
                        i5 = ((iM11306 ^ i3) * (-28343)) ^ 880876648;
                        i6 = -1025241460;
                    }
                    break;
                case 637430149:
                case 1300349137:
                    if (C2704.m8255() <= 0) {
                        iM11306 = (i4 - C19806.m45029("ۧۢ")) * (-3);
                        i5 = ((iM11306 ^ i3) * (-27417)) ^ 1207892400;
                        i6 = -686155508;
                    } else {
                        iM11306 = C19806.m45029("ۗۨ") ^ i4;
                        i5 = ((iM11306 ^ i3) * 12871) ^ (-87414403);
                        i6 = -1987885406;
                    }
                    break;
                case 1008287328:
                case 1272198233:
                    if (C1419.f5860 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * 5161) ^ (-1080691283);
                        i6 = 328025265;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("ۚۘ") + i3) * 85;
                        i5 = ((iM11306 ^ i4) * (-9879)) ^ (-508463341);
                        i6 = 1871940208;
                    }
                    break;
                case 1112489019:
                case 1730377110:
                    if (C2871.f10837 >= 0) {
                        iM11306 = (C19806.m45029("ᩴ᩻") ^ i4) * (-119);
                        i5 = ((iM11306 ^ i3) * 26795) ^ (-167526790);
                        i6 = -1573630319;
                    } else {
                        iM11306 = C19806.m45029("᩻᩷") ^ i4;
                        i5 = ((iM11306 ^ i3) * (-10071)) ^ (-1735463556);
                        i6 = -1230319923;
                    }
                    break;
                case 1359773087:
                case 1804404902:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩶֨") + i3) * (-69);
                        i5 = ((iM11306 ^ i4) * (-21495)) ^ (-1805920660);
                        i6 = 1994872258;
                    } else {
                        iM11306 = (i4 - ThreadFactoryC3888.m11306("ᩴ۟")) * 15;
                        i5 = ((iM11306 ^ i3) * (-31783)) ^ (-835571222);
                        i6 = 1246021654;
                    }
                    break;
                case 1486747151:
                case 2084359071:
                    ViewTreeObserverOnPreDrawListenerC3327.m9874();
                    return null;
                default:
                    C2871.m8646();
                    iM11306 = (i4 - C19806.m45029("ۧۢ")) * (-3);
                    i5 = ((iM11306 ^ i3) * (-27417)) ^ 1207892400;
                    i6 = -686155508;
                    break;
            }
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int iM45029;
        int i2;
        int i3;
        short[] sArr;
        int i4;
        int i5;
        int iM450210;
        int i6;
        int i7;
        String strM3412;
        int iM11306;
        int i8;
        int i9;
        int iM11307;
        int i10;
        int iM450211;
        int i11;
        int i12;
        int i13;
        int iM11308;
        int i14;
        int i15;
        int i16 = C3722.f13525;
        int i17 = MenuItemOnMenuItemClickListenerC3244.f12064;
        int iM450212 = C19806.m45029("ۙܿ") ^ i17;
        int i18 = ((iM450212 ^ i16) * 687) ^ 1101714717;
        View viewM8167 = null;
        String str = null;
        String strM6674 = null;
        StringBuilder sbM8976 = null;
        String strM6288 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i19 = iM450212 ^ 62338141;
        int iM450213 = 0;
        int iM11309 = 0;
        int iM113010 = 0;
        short s = 0;
        short s2 = 0;
        int i20 = 0;
        int i21 = 0;
        C3825 c3825 = null;
        TextView textView = null;
        String strM5047 = null;
        String str2 = null;
        long jM5059 = 0;
        CharSequence charSequenceM6690 = null;
        String strM10423 = null;
        int i22 = 0;
        int i23 = 320634013;
        Context contextM10066 = null;
        TextView textView2 = null;
        String strM6690 = null;
        View viewM24439 = null;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            int i26 = i19 ^ (i18 & (((i23 ^ i16) * 23785) >> 31));
            switch (i26) {
                case -2129863197:
                case 1860794516:
                    i26 = i26;
                    textView = textView;
                    sArr = sArr3;
                    i4 = i20;
                    i5 = i21;
                    contextM10066 = RunnableC3388.m10066(viewM24439);
                    c3825 = (C3825) RunnableC1606.m5478(this.f22459, i);
                    if (RunnableC1895.f7152) {
                        int iM450214 = C19806.m45029("᩶ܽ") ^ i16;
                        i19 = iM450214 ^ 1988630518;
                        i18 = ((iM450214 ^ i17) * 24805) ^ (-1169409291);
                        i21 = i5;
                        textView = textView;
                        i20 = i4;
                        viewM24439 = viewM24439;
                    } else {
                        int iM113011 = (ThreadFactoryC3888.m11306("ۤۖ") + i16) * 7;
                        i18 = ((iM113011 ^ i17) * (-17357)) ^ (-381184300);
                        i19 = iM113011 ^ 510721867;
                        i21 = i5;
                        textView = textView;
                        i20 = i4;
                    }
                    sArr3 = sArr;
                    i23 = i26;
                    break;
                case -2102842251:
                case 354259285:
                    i26 = i26;
                    textView = textView;
                    strM6690 = C2124.m6690(contextM10066, i25);
                    jM5059 = C1460.m5059();
                    if (Math.abs(jM5059 - c3825.f14175) < 60000) {
                        iM11306 = ThreadFactoryC3888.m11306("֡ۧ") ^ i17;
                        i8 = ((iM11306 ^ i16) * (-11983)) ^ 504102407;
                        i9 = -961391111;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۚܺ") ^ i16;
                        i8 = ((iM11306 ^ i17) * (-22791)) ^ (-1430909769);
                        i9 = 132416603;
                    }
                    i19 = iM11306 ^ i9;
                    textView = textView;
                    i18 = i8;
                    i23 = i26;
                    break;
                case -2065432056:
                case 1787336687:
                    i26 = i26;
                    C1148.m4223(sbM8976, C0817.m3412(contextM10066, iM113010 ^ 2101681813));
                    textView = textView;
                    strM6674 = C2124.m6674(sbM8976);
                    iM45029 = C19806.m45029("᩻ܿ") ^ i16;
                    i2 = ((iM45029 ^ i17) * 10679) ^ 1606217050;
                    i3 = -1008585647;
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case -2065048541:
                case -1903753725:
                    strM3412 = C0817.m3412(contextM10066, ThreadFactoryC3888.m11306(strM6288) ^ 2097210556);
                    str2 = strM3412;
                    iM45029 = C19806.m45029("ۡ۠") ^ i16;
                    i2 = ((iM45029 ^ i17) * (-17667)) ^ (-440592658);
                    i3 = 2145174324;
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case -2058545824:
                case -209444375:
                    i26 = i26;
                    sbM8976 = C3012.m8976(str2, strM5047);
                    textView = textView;
                    iM113010 = ThreadFactoryC3888.m11306(C3660.m10790(f22458, 19, 3, i24));
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        viewM24439 = viewM24439;
                        contextM10066 = contextM10066;
                        int iM113012 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i17;
                        i11 = ((iM113012 ^ i16) * 20869) ^ 1267470473;
                        i13 = iM113012 ^ 777905702;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    } else {
                        iM45029 = C19806.m45029("۫ۤ") ^ i16;
                        i2 = ((iM45029 ^ i17) * (-26567)) ^ 1447765875;
                        i3 = 1341554028;
                        i19 = iM45029 ^ i3;
                        i18 = i2;
                        textView = textView;
                        i23 = i26;
                    }
                    break;
                case -2005627679:
                case -1903780196:
                    i24 = 4880;
                    iM450211 = ThreadFactoryC3888.m11306("ۛۘ") ^ i17;
                    i11 = ((iM450211 ^ i16) * (-19929)) ^ 1633804478;
                    i12 = 2071899666;
                    i13 = iM450211 ^ i12;
                    i21 = i21;
                    textView = textView;
                    contextM10066 = contextM10066;
                    i20 = i20;
                    sArr3 = sArr3;
                    i23 = i26;
                    i19 = i13;
                    i18 = i11;
                    viewM24439 = viewM24439;
                    break;
                case -1970874443:
                case 1445088973:
                    Context context = contextM10066;
                    TextView textView3 = (TextView) C2642.m8167(viewM24439, iM450213 ^ 2098715804);
                    String str3 = c3825.f14172;
                    if (c3825.f14178) {
                        int iM450215 = C19806.m45029("ۤܳ") ^ i16;
                        i18 = ((iM450215 ^ i17) * (-18141)) ^ 510465403;
                        str = str3;
                        textView = textView3;
                        contextM10066 = context;
                        i23 = i26;
                        i19 = iM450215 ^ 1335856666;
                    } else {
                        int iM113013 = (ThreadFactoryC3888.m11306("ܽܳ") + i17) * (-13);
                        str = str3;
                        textView = textView3;
                        contextM10066 = context;
                        i23 = i26;
                        i19 = iM113013 ^ 2052969727;
                        i18 = ((iM113013 ^ i16) * 2479) ^ (-278099339);
                    }
                    break;
                case -1925140381:
                case 493379167:
                    strM3412 = C0817.m3412(contextM10066, ThreadFactoryC3888.m11306(strM10423) ^ 2103333235);
                    str2 = strM3412;
                    iM45029 = C19806.m45029("ۡ۠") ^ i16;
                    i2 = ((iM45029 ^ i17) * (-17667)) ^ (-440592658);
                    i3 = 2145174324;
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case -1889744872:
                case -907456539:
                    i26 = i26;
                    C1025.m3861();
                    textView = textView;
                    iM45029 = C19806.m45029("۫ܳ") ^ i17;
                    i2 = ((iM45029 ^ i16) * (-21359)) ^ (-1276780108);
                    i3 = 1755773112;
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case -1868934857:
                case -717267543:
                    i26 = i26;
                    textView = textView;
                    contextM10066 = contextM10066;
                    iM11309 = ThreadFactoryC3888.m11306(C19806.m45020(f22458, 7, 3, i24));
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 < 0) {
                        iM450210 = ThreadFactoryC3888.m11306("ۗ᩸") ^ i16;
                        i6 = ((iM450210 ^ i17) * 1783) ^ (-1893815791);
                        i7 = 1220426398;
                        i15 = iM450210 ^ i7;
                        textView = textView;
                        i23 = i26;
                        Context context2 = contextM10066;
                        i19 = i15;
                        i18 = i6;
                        contextM10066 = context2;
                    } else {
                        viewM24439 = viewM24439;
                        sArr3 = sArr3;
                        i20 = i20;
                        i21 = i21;
                        iM450211 = ThreadFactoryC3888.m11306("ۘܰ") ^ i17;
                        i11 = ((iM450211 ^ i16) * 30607) ^ 901162770;
                        i12 = 360997943;
                        i13 = iM450211 ^ i12;
                        i21 = i21;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i20 = i20;
                        sArr3 = sArr3;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    }
                    break;
                case -1837969255:
                case 1011328130:
                    i26 = i26;
                    if (C0278.f1572 > 0) {
                        viewM24439 = viewM24439;
                        contextM10066 = contextM10066;
                        textView = textView;
                        int iM113014 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i17;
                        i11 = ((iM113014 ^ i16) * 20869) ^ 1267470473;
                        i13 = iM113014 ^ 777905702;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    } else {
                        textView = textView;
                        iM45029 = C19806.m45029("۫ܳ") ^ i17;
                        i2 = ((iM45029 ^ i16) * (-21359)) ^ (-1276780108);
                        i3 = 1755773112;
                        i19 = iM45029 ^ i3;
                        i18 = i2;
                        textView = textView;
                        i23 = i26;
                    }
                    break;
                case -1734944175:
                case -1266242856:
                    C2477.m7593();
                    if (C3722.m10894() <= 0) {
                        int iM113015 = (i16 - ThreadFactoryC3888.m11306("᩶ۢ")) * (-21);
                        i26 = i26;
                        i18 = ((iM113015 ^ i17) * 5681) ^ (-1931606938);
                        i19 = iM113015 ^ (-793845448);
                    } else {
                        i26 = i26;
                        textView = textView;
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩺") + i17) * (-17);
                        i2 = ((iM45029 ^ i16) * 7735) ^ (-573022372);
                        i3 = 1716366697;
                        i19 = iM45029 ^ i3;
                        i18 = i2;
                        textView = textView;
                    }
                    i23 = i26;
                    break;
                case -1679640396:
                case -1207141167:
                    i26 = i26;
                    contextM10066 = contextM10066;
                    textView = textView;
                    short[] sArr4 = sArr3;
                    int i27 = i20;
                    i21 = i21;
                    sArr3 = sArr4;
                    viewM8167 = C2642.m8167(viewM24439, C19806.m45029(C2477.m7604(sArr4, i27, i21, i24)) ^ 2118281050);
                    if (C1875.f7103 >= 0) {
                        iM11308 = ThreadFactoryC3888.m11306("ۧ֨") ^ i16;
                        i20 = i27;
                        i6 = ((iM11308 ^ i17) * 7039) ^ (-967711196);
                        i14 = 1029688682;
                    } else {
                        i20 = i27;
                        iM11308 = (i17 - ThreadFactoryC3888.m11306("ۧۙ")) * (-23);
                        i6 = ((iM11308 ^ i16) * 22869) ^ (-1606281100);
                        i14 = 1360738061;
                    }
                    i15 = iM11308 ^ i14;
                    i21 = i21;
                    textView = textView;
                    i20 = i20;
                    sArr3 = sArr3;
                    i23 = i26;
                    Context context3 = contextM10066;
                    i19 = i15;
                    i18 = i6;
                    contextM10066 = context3;
                    break;
                case -1610557930:
                case -629382920:
                    i26 = i26;
                    viewM24439 = viewM24439;
                    contextM10066 = contextM10066;
                    textView = textView;
                    sArr3 = sArr3;
                    i20 = i20;
                    i21 = i21;
                    if (view != null) {
                        viewM24439 = view;
                        iM11308 = (C19806.m45029("᩵ۙ") + i16) * (-45);
                        i6 = ((iM11308 ^ i17) * 32611) ^ (-323902288);
                        i14 = -382594279;
                        i15 = iM11308 ^ i14;
                        i21 = i21;
                        textView = textView;
                        i20 = i20;
                        sArr3 = sArr3;
                        i23 = i26;
                        Context context4 = contextM10066;
                        i19 = i15;
                        i18 = i6;
                        contextM10066 = context4;
                    } else {
                        iM450211 = C19806.m45029("֫᩺") ^ i17;
                        i11 = ((iM450211 ^ i16) * 4269) ^ 323491844;
                        i12 = 832081583;
                        i13 = iM450211 ^ i12;
                        i21 = i21;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i20 = i20;
                        sArr3 = sArr3;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    }
                    break;
                case -1565132180:
                case 1753055956:
                    i26 = i26;
                    viewM24439 = viewM24439;
                    contextM10066 = contextM10066;
                    textView = textView;
                    sArr3 = sArr3;
                    i20 = i20;
                    i21 = i21;
                    sArr2 = f22458;
                    if (C0629.m2907()) {
                        iM450211 = (C19806.m45029("ۜܺ") + i17) * (-5);
                        i11 = ((iM450211 ^ i16) * 12651) ^ 1464738559;
                        i12 = 1946292248;
                    } else {
                        iM450211 = ThreadFactoryC3888.m11306("ۘܰ") ^ i17;
                        i11 = ((iM450211 ^ i16) * 30607) ^ 901162770;
                        i12 = 360997943;
                    }
                    i13 = iM450211 ^ i12;
                    i21 = i21;
                    textView = textView;
                    contextM10066 = contextM10066;
                    i20 = i20;
                    sArr3 = sArr3;
                    i23 = i26;
                    i19 = i13;
                    i18 = i11;
                    viewM24439 = viewM24439;
                    break;
                case -1516464510:
                case 1181560458:
                    i26 = i26;
                    viewM24439 = viewM24439;
                    contextM10066 = contextM10066;
                    textView = textView;
                    sArr3 = sArr3;
                    i20 = i20;
                    i21 = i21;
                    int i28 = s + s2;
                    int i29 = (s * s) + 26378496;
                    if ((i28 * i28) - (i29 + i29) <= 0) {
                        iM450211 = (ThreadFactoryC3888.m11306("᩷ۛ") ^ i16) * 29;
                        i11 = ((iM450211 ^ i17) * (-30605)) ^ 356124190;
                        i12 = -1314065542;
                    } else {
                        iM450211 = (C19806.m45029("ۘ᩷") + i17) * 69;
                        i11 = ((iM450211 ^ i16) * 7193) ^ 215992158;
                        i12 = 2013103732;
                    }
                    i13 = iM450211 ^ i12;
                    i21 = i21;
                    textView = textView;
                    contextM10066 = contextM10066;
                    i20 = i20;
                    sArr3 = sArr3;
                    i23 = i26;
                    i19 = i13;
                    i18 = i11;
                    viewM24439 = viewM24439;
                    break;
                case -1498277679:
                case -64871348:
                    i26 = i26;
                    textView = textView;
                    if (i22 == 2) {
                        iM11306 = (C19806.m45029("ۗܶ") ^ i17) * (-127);
                        i8 = ((iM11306 ^ i16) * (-24703)) ^ (-1946590432);
                        i9 = 994252700;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ܳܺ") ^ i16;
                        i8 = ((iM11306 ^ i17) * 15587) ^ 473229408;
                        i9 = 1873477802;
                    }
                    i19 = iM11306 ^ i9;
                    textView = textView;
                    i18 = i8;
                    i23 = i26;
                    break;
                case -1467680792:
                case 1830424766:
                    i26 = i26;
                    textView = textView;
                    if (C2249.m6911(str)) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۚۡ") ^ i17) * (-93);
                        i2 = ((iM45029 ^ i16) * 31867) ^ (-1241121115);
                        i3 = 1446122386;
                    } else {
                        str2 = str;
                        iM45029 = C19806.m45029("ۡ۠") ^ i16;
                        i2 = ((iM45029 ^ i17) * (-17667)) ^ (-440592658);
                        i3 = 2145174324;
                    }
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case -1415871014:
                case -425771089:
                    i26 = i26;
                    textView = textView;
                    MenuItemOnMenuItemClickListenerC3244.m9704(textView2, strM6674);
                    i22 = c3825.f14177;
                    if (i22 == 3) {
                        iM45029 = (i17 - C19806.m45029("ᩳ᩹")) * 37;
                        i2 = ((iM45029 ^ i16) * 9345) ^ 1578003131;
                        i3 = -249206879;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۖܺ") + i17) * (-93);
                        i2 = ((iM45029 ^ i16) * 10933) ^ 1122227578;
                        i3 = 660379808;
                    }
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case -1359783921:
                case -1311908513:
                    i26 = i26;
                    viewM24439 = viewM24439;
                    contextM10066 = contextM10066;
                    textView = textView;
                    sArr3 = sArr3;
                    i20 = i20;
                    i21 = i21;
                    s = sArr2[0];
                    s2 = 5136;
                    if (C1025.f4800 < 0) {
                        iM450211 = (C19806.m45029("ۧ۠") + i16) * 99;
                        i11 = ((iM450211 ^ i17) * (-5629)) ^ (-465522270);
                        i12 = -968347725;
                        i13 = iM450211 ^ i12;
                        i21 = i21;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i20 = i20;
                        sArr3 = sArr3;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    } else {
                        i21 = i21;
                        i20 = i20;
                        sArr3 = sArr3;
                        int iM113016 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i17;
                        i11 = ((iM113016 ^ i16) * 20869) ^ 1267470473;
                        i13 = iM113016 ^ 777905702;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    }
                    break;
                case -1242060524:
                case 1623494464:
                    iM11307 = ThreadFactoryC3888.m11306(C3535.m10423(f22458, 22, 3, i24));
                    i10 = 2123721757;
                    i25 = iM11307 ^ i10;
                    iM11306 = ThreadFactoryC3888.m11306("ۗ۫") ^ i16;
                    i8 = ((iM11306 ^ i17) * 30881) ^ 1888791833;
                    i9 = -1479032485;
                    i19 = iM11306 ^ i9;
                    textView = textView;
                    i18 = i8;
                    i23 = i26;
                    break;
                case -959394036:
                case 1408572331:
                    i26 = i26;
                    contextM10066 = contextM10066;
                    textView = textView;
                    sArr3 = f22458;
                    i20 = 1;
                    i21 = 3;
                    if (!RunnableC1895.f7152) {
                        viewM24439 = viewM24439;
                        int iM113017 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i17;
                        i11 = ((iM113017 ^ i16) * 20869) ^ 1267470473;
                        i13 = iM113017 ^ 777905702;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    } else {
                        iM450210 = ThreadFactoryC3888.m11306("ᩴ᩵") ^ i17;
                        i6 = ((iM450210 ^ i16) * (-24597)) ^ 2069714113;
                        i7 = 420292583;
                        i15 = iM450210 ^ i7;
                        textView = textView;
                        i23 = i26;
                        Context context5 = contextM10066;
                        i19 = i15;
                        i18 = i6;
                        contextM10066 = context5;
                    }
                    break;
                case -911986521:
                case 2090986374:
                    C7105.m18985();
                    return null;
                case -674709182:
                case 185064489:
                    i26 = i26;
                    textView = textView;
                    strM10423 = C3535.m10423(f22458, 16, 3, i24);
                    if (C0629.m2907()) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩻۬") + i16) * 61;
                        i2 = ((iM45029 ^ i17) * (-7005)) ^ (-595600092);
                        i3 = 1654144988;
                    } else {
                        iM45029 = C19806.m45029("۫ܳ") ^ i17;
                        i2 = ((iM45029 ^ i16) * (-21359)) ^ (-1276780108);
                        i3 = 1755773112;
                    }
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case -638004128:
                case -35523625:
                    i26 = i26;
                    contextM10066 = contextM10066;
                    textView = textView;
                    textView2 = (TextView) viewM8167;
                    iM450213 = C19806.m45029(C0671.m3009(f22458, 4, 3, i24));
                    if (!C19806.f63586) {
                        iM450210 = (C19806.m45029("ۗ᩺") + i16) * (-71);
                        i6 = ((iM450210 ^ i17) * 25955) ^ (-667800002);
                        i7 = -811724040;
                        i15 = iM450210 ^ i7;
                        textView = textView;
                        i23 = i26;
                        Context context6 = contextM10066;
                        i19 = i15;
                        i18 = i6;
                        contextM10066 = context6;
                    } else {
                        contextM10066 = contextM10066;
                        sArr = sArr3;
                        i4 = i20;
                        i5 = i21;
                        int iM113018 = (ThreadFactoryC3888.m11306("ۤۖ") + i16) * 7;
                        i18 = ((iM113018 ^ i17) * (-17357)) ^ (-381184300);
                        i19 = iM113018 ^ 510721867;
                        i21 = i5;
                        textView = textView;
                        i20 = i4;
                        sArr3 = sArr;
                        i23 = i26;
                    }
                    break;
                case -294316631:
                case 1255526679:
                    iM11307 = C19806.m45029(RunnableC0195.m1429(f22458, 25, 3, i24));
                    i10 = 2125568590;
                    i25 = iM11307 ^ i10;
                    iM11306 = ThreadFactoryC3888.m11306("ۗ۫") ^ i16;
                    i8 = ((iM11306 ^ i17) * 30881) ^ 1888791833;
                    i9 = -1479032485;
                    i19 = iM11306 ^ i9;
                    textView = textView;
                    i18 = i8;
                    i23 = i26;
                    break;
                case 94826292:
                case 1739650344:
                    charSequenceM6690 = C2124.m6690(contextM10066, C19806.m45029(C0671.m3009(f22458, 31, 3, i24)) ^ 2128966285);
                    iM11306 = (C19806.m45029("֫᩹") ^ i16) * (-29);
                    i8 = ((iM11306 ^ i17) * (-8833)) ^ (-29671658);
                    i9 = -577492454;
                    i19 = iM11306 ^ i9;
                    textView = textView;
                    i18 = i8;
                    i23 = i26;
                    break;
                case 117150290:
                case 1793156367:
                    i26 = i26;
                    textView = textView;
                    strM6288 = C1937.m6288(f22458, 10, 3, i24);
                    if (C10634.f36300 >= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩺᩺") + i17) * (-17);
                        i2 = ((iM45029 ^ i16) * 7735) ^ (-573022372);
                        i3 = 1716366697;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ᩳ۬") ^ i17;
                        i2 = ((iM45029 ^ i16) * (-8813)) ^ (-1091286660);
                        i3 = 636023629;
                    }
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case 237611622:
                case 618175764:
                    iM11307 = C19806.m45029(C1461.m5070(f22458, 28, 3, i24));
                    i10 = 2129635830;
                    i25 = iM11307 ^ i10;
                    iM11306 = ThreadFactoryC3888.m11306("ۗ۫") ^ i16;
                    i8 = ((iM11306 ^ i17) * 30881) ^ 1888791833;
                    i9 = -1479032485;
                    i19 = iM11306 ^ i9;
                    textView = textView;
                    i18 = i8;
                    i23 = i26;
                    break;
                case 304983386:
                case 1121577424:
                    i24 = 43226;
                    iM450211 = ThreadFactoryC3888.m11306("ۛۘ") ^ i17;
                    i11 = ((iM450211 ^ i16) * (-19929)) ^ 1633804478;
                    i12 = 2071899666;
                    i13 = iM450211 ^ i12;
                    i21 = i21;
                    textView = textView;
                    contextM10066 = contextM10066;
                    i20 = i20;
                    sArr3 = sArr3;
                    i23 = i26;
                    i19 = i13;
                    i18 = i11;
                    viewM24439 = viewM24439;
                    break;
                case 403272031:
                case 2030457586:
                    C2124.m6673();
                    if (C1668.f6641 >= 0) {
                        int iM113019 = (i16 - ThreadFactoryC3888.m11306("᩶ۢ")) * (-21);
                        i26 = i26;
                        i18 = ((iM113019 ^ i17) * 5681) ^ (-1931606938);
                        i19 = iM113019 ^ (-793845448);
                        i23 = i26;
                    } else {
                        i26 = i26;
                        viewM24439 = viewM24439;
                        contextM10066 = contextM10066;
                        textView = textView;
                        int iM1130110 = ThreadFactoryC3888.m11306("᩶ܿ") ^ i17;
                        i11 = ((iM1130110 ^ i16) * 20869) ^ 1267470473;
                        i13 = iM1130110 ^ 777905702;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    }
                    break;
                case 404824337:
                case 908637953:
                    C10634.m26820();
                    if (C1419.f5860 < 0) {
                        i26 = i26;
                        viewM24439 = viewM24439;
                        contextM10066 = contextM10066;
                        textView = textView;
                        sArr3 = sArr3;
                        i20 = i20;
                        i21 = i21;
                        iM450211 = ThreadFactoryC3888.m11306("ۘܰ") ^ i17;
                        i11 = ((iM450211 ^ i16) * 30607) ^ 901162770;
                        i12 = 360997943;
                        i13 = iM450211 ^ i12;
                        i21 = i21;
                        textView = textView;
                        contextM10066 = contextM10066;
                        i20 = i20;
                        sArr3 = sArr3;
                        i23 = i26;
                        i19 = i13;
                        i18 = i11;
                        viewM24439 = viewM24439;
                    } else {
                        i26 = i26;
                        textView = textView;
                        iM45029 = C19806.m45029("۫ܳ") ^ i17;
                        i2 = ((iM45029 ^ i16) * (-21359)) ^ (-1276780108);
                        i3 = 1755773112;
                        i19 = iM45029 ^ i3;
                        i18 = i2;
                        textView = textView;
                        i23 = i26;
                    }
                    break;
                case 487133510:
                case 1237060549:
                    StringBuilder sb = new StringBuilder();
                    C1148.m4223(sb, strM6690);
                    C1148.m4223(sb, strM5047);
                    RunnableC1895.m6168(sb, charSequenceM6690);
                    C1461.m5083(textView, C2124.m6674(sb));
                    return viewM24439;
                case 602502752:
                case 1841357765:
                    i26 = i26;
                    textView = textView;
                    viewM24439 = C9576.m24439(viewGroup, iM11309 ^ 2124027426, viewGroup, false);
                    contextM10066 = contextM10066;
                    sArr3 = sArr3;
                    i20 = i20;
                    i21 = i21;
                    iM11308 = (C19806.m45029("᩵ۙ") + i16) * (-45);
                    i6 = ((iM11308 ^ i17) * 32611) ^ (-323902288);
                    i14 = -382594279;
                    i15 = iM11308 ^ i14;
                    i21 = i21;
                    textView = textView;
                    i20 = i20;
                    sArr3 = sArr3;
                    i23 = i26;
                    Context context7 = contextM10066;
                    i19 = i15;
                    i18 = i6;
                    contextM10066 = context7;
                    break;
                case 686417648:
                case 867251657:
                    C0050.m946();
                    if (C0817.m3399()) {
                        i26 = i26;
                        textView = textView;
                        sArr = sArr3;
                        i4 = i20;
                        i5 = i21;
                        int iM1130111 = (ThreadFactoryC3888.m11306("ۤۖ") + i16) * 7;
                        i18 = ((iM1130111 ^ i17) * (-17357)) ^ (-381184300);
                        i19 = iM1130111 ^ 510721867;
                        i21 = i5;
                        textView = textView;
                        i20 = i4;
                        sArr3 = sArr;
                        i23 = i26;
                    }
                    i26 = i26;
                    textView = textView;
                    iM45029 = C19806.m45029("۫ܳ") ^ i17;
                    i2 = ((iM45029 ^ i16) * (-21359)) ^ (-1276780108);
                    i3 = 1755773112;
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                case 1520576753:
                case 2129360053:
                    i26 = i26;
                    textView = textView;
                    boolean z = c3825.f14174;
                    strM5047 = C1460.m5047(f22458, 13, 3, i24);
                    if (z) {
                        iM45029 = ThreadFactoryC3888.m11306("᩵ܿ") ^ i17;
                        i2 = ((iM45029 ^ i16) * (-16563)) ^ (-501812078);
                        i3 = 1384451892;
                    } else {
                        strM6674 = str2;
                        iM45029 = C19806.m45029("᩻ܿ") ^ i16;
                        i2 = ((iM45029 ^ i17) * 10679) ^ 1606217050;
                        i3 = -1008585647;
                    }
                    i19 = iM45029 ^ i3;
                    i18 = i2;
                    textView = textView;
                    i23 = i26;
                    break;
                default:
                    charSequenceM6690 = DateUtils.getRelativeTimeSpanString(c3825.f14175, jM5059, 60000L);
                    iM11306 = (C19806.m45029("֫᩹") ^ i16) * (-29);
                    i8 = ((iM11306 ^ i17) * (-8833)) ^ (-29671658);
                    i9 = -577492454;
                    i19 = iM11306 ^ i9;
                    textView = textView;
                    i18 = i8;
                    i23 = i26;
                    break;
            }
        }
    }
}
