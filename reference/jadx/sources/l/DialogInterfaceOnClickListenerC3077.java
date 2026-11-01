package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3077 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11649;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11650;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11651;

    public /* synthetic */ DialogInterfaceOnClickListenerC3077(int i, Object obj, Object obj2) {
        int i2 = -2114874989;
        int i3 = C3722.f13525;
        int i4 = C1189.f5284;
        this.f11650 = i;
        this.f11651 = obj;
        this.f11649 = obj2;
        int iM45029 = C19806.m45029("ۧ۫") ^ i4;
        int i5 = ((iM45029 ^ i3) * (-30387)) ^ 1979482481;
        int i6 = -217177591;
        while (true) {
            i2 = (iM45029 ^ i6) ^ (i5 & (((i2 ^ i3) * 30495) >> 31));
            switch (i2) {
                case -2097763026:
                case -2092415780:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (i4 - ThreadFactoryC3888.m11306("ۢۘ")) * 85;
                        i5 = ((iM45029 ^ i3) * (-6655)) ^ 337122669;
                        i6 = 800774415;
                    } else {
                        iM45029 = C19806.m45029("ۡۢ") ^ i3;
                        i5 = ((iM45029 ^ i4) * (-12077)) ^ (-108929594);
                        i6 = -189897113;
                    }
                    break;
                case -2042308316:
                case -774861412:
                    return;
                case -1530381721:
                case 1130023499:
                    C1377.m4833();
                    throw new RuntimeException();
                case -530560584:
                case 1753771352:
                    if (C0817.f3443) {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 32531) ^ 1436501115;
                        i6 = -921573927;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ۖ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 23737) ^ 1673839215;
                        i6 = 4777776;
                    }
                    break;
                case -328406687:
                case 1259286065:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C3743.m10966();
                    iM45029 = C19806.m45029("ۘ۬") ^ i4;
                    i5 = ((iM45029 ^ i3) * (-4185)) ^ 1047208309;
                    i6 = 857516910;
                    break;
                case 624290740:
                case 1260469526:
                    if (C1977.f7413 <= 0) {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 32531) ^ 1436501115;
                        i6 = -921573927;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܰ") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-19223)) ^ 2015671226;
                        i6 = -1756270250;
                    }
                    break;
                default:
                    C0797.m3359();
                    if (C0050.f912 > 0) {
                        iM45029 = C19806.m45029("᩸ۚ") ^ i3;
                        i5 = ((iM45029 ^ i4) * 32531) ^ 1436501115;
                        i6 = -921573927;
                    } else {
                        iM45029 = C19806.m45029("ۘ۬") ^ i4;
                        i5 = ((iM45029 ^ i3) * (-4185)) ^ 1047208309;
                        i6 = 857516910;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007e  */
    /* JADX WARN: Code duplicated, block: B:65:0x023c A[PHI: r4 r12 r13 r18
      0x023c: PHI (r4v6 l.۠ܽۘ) = (r4v2 l.۠ܽۘ), (r4v5 l.۠ܽۘ), (r4v2 l.۠ܽۘ) binds: [B:64:0x023a, B:47:0x018b, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:64:0x023a, B:47:0x018b, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int) binds: [B:64:0x023a, B:47:0x018b, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]
      0x023c: PHI (r18v6 java.lang.Object) = (r18v2 java.lang.Object), (r18v4 java.lang.Object), (r18v2 java.lang.Object) binds: [B:64:0x023a, B:47:0x018b, B:11:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0278 A[PHI: r7 r8 r9 r10 r14 r26
      0x0278: PHI (r7v4 bin.mt.plus.Main) = (r7v3 bin.mt.plus.Main), (r7v2 bin.mt.plus.Main), (r7v2 bin.mt.plus.Main) binds: [B:23:0x00bb, B:68:0x0276, B:60:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r8v4 android.content.Intent) = (r8v3 android.content.Intent), (r8v2 android.content.Intent), (r8v2 android.content.Intent) binds: [B:23:0x00bb, B:68:0x0276, B:60:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:23:0x00bb, B:68:0x0276, B:60:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r10v4 l.۫᩷᩹) = (r10v2 l.۫᩷᩹), (r10v3 l.۫᩷᩹), (r10v2 l.۫᩷᩹) binds: [B:23:0x00bb, B:68:0x0276, B:60:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r14v3 java.util.ArrayList) = (r14v2 java.util.ArrayList), (r14v2 java.util.ArrayList), (r14v4 java.util.ArrayList) binds: [B:23:0x00bb, B:68:0x0276, B:60:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0278: PHI (r26v3 int) = (r26v1 int), (r26v2 int), (r26v1 int) binds: [B:23:0x00bb, B:68:0x0276, B:60:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int iM11306;
        int i2;
        int i3;
        int iM45029;
        int i4;
        int iM450210;
        int i5;
        int i6 = i;
        int i7 = C2871.f10837;
        int i8 = C7105.f23796;
        int iM11307 = ThreadFactoryC3888.m11306("ܶܳ") ^ i7;
        int i9 = ((iM11307 ^ i8) * (-30539)) ^ (-1898134600);
        Object obj = null;
        C19015 c19015 = null;
        C12665 c12665 = null;
        Main mainM7591 = null;
        Intent intent = null;
        int i10 = iM11307 ^ (-458974050);
        int bindingAdapterPosition = 0;
        int i11 = 0;
        int i12 = -1360988501;
        int iM31486 = 0;
        C8432 c8432 = null;
        Object obj2 = null;
        Object obj3 = null;
        InterfaceC2557 interfaceC2557 = null;
        C8291 c8291 = null;
        C11545 c11545 = null;
        Object obj4 = null;
        C13810 c13810 = null;
        ArrayList arrayList = null;
        int i13 = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i8) * (-4023)) >> 31));
            switch (i12) {
                case -2120033455:
                case -733650626:
                    if (C19806.f63586) {
                        iM11306 = (i8 - C19806.m45029("ܰܳ")) * (-75);
                        i2 = ((iM11306 ^ i7) * (-5403)) ^ 495906889;
                        i3 = 1737037337;
                    } else {
                        iM11306 = C19806.m45029("ۛۖ") ^ i7;
                        i2 = ((iM11306 ^ i8) * (-5917)) ^ (-1007955360);
                        i3 = -1127270333;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case -2119951502:
                case -699082164:
                    C13810.m33612(c13810, (ArrayList) obj4);
                    break;
                case -2072188158:
                case -751476385:
                    c19015 = (C19015) obj;
                    C0526.m2429(c8432);
                    if (!C0817.f3443) {
                        int iM11308 = (ThreadFactoryC3888.m11306("۬᩷") ^ i7) * 67;
                        i10 = iM11308 ^ 1794027116;
                        i9 = ((iM11308 ^ i8) * 31001) ^ (-1232451042);
                        intent = null;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۨ᩶") ^ i7;
                        i2 = ((iM11306 ^ i8) * 3013) ^ 1260962049;
                        i3 = 2139083516;
                        i10 = iM11306 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -2064540821:
                case -199770165:
                    break;
                case -2058527759:
                case 1494459626:
                    C8432.f29282.mo23641(Object.class);
                    break;
                case -1944505383:
                case -1108172069:
                    if (ThreadFactoryC3888.m11300() > 0) {
                        iM11306 = (i8 - C19806.m45029("ܰܳ")) * (-75);
                        i2 = ((iM11306 ^ i7) * (-5403)) ^ 495906889;
                        i3 = 1737037337;
                        i10 = iM11306 ^ i3;
                        i9 = i2;
                    } else {
                        int iM11309 = (ThreadFactoryC3888.m11306("۬᩷") ^ i7) * 67;
                        i10 = iM11309 ^ 1794027116;
                        i9 = ((iM11309 ^ i8) * 31001) ^ (-1232451042);
                        intent = null;
                    }
                    break;
                case -1680147921:
                case 1985960994:
                    mainM7591 = C2477.m7591(c11545);
                    if (!C0526.f2219) {
                        intent = new Intent(mainM7591, (Class<?>) ActivityC1919.class);
                        if (C2704.f10408) {
                            iM11306 = (i8 - ThreadFactoryC3888.m11306("ᩳܰ")) * (-3);
                            i2 = ((iM11306 ^ i7) * (-463)) ^ 1731825704;
                            i3 = -41361981;
                        } else {
                            iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i8;
                            i2 = ((iM11306 ^ i7) * (-7825)) ^ 1790214200;
                            i3 = 505512491;
                        }
                        i10 = iM11306 ^ i3;
                        i9 = i2;
                    } else {
                        int iM113010 = (ThreadFactoryC3888.m11306("۬᩷") ^ i7) * 67;
                        i10 = iM113010 ^ 1794027116;
                        i9 = ((iM113010 ^ i8) * 31001) ^ (-1232451042);
                        intent = null;
                    }
                    break;
                case -1587928238:
                case -1543456726:
                    c11545 = (C11545) this.f11651;
                    Object obj5 = this.f11649;
                    if (C0216.f1393 == 0) {
                        int iM113011 = ThreadFactoryC3888.m11306("ۛۢ") ^ i8;
                        i10 = iM113011 ^ 1937680474;
                        obj3 = obj5;
                        i9 = ((iM113011 ^ i7) * (-26791)) ^ 1751835762;
                        i6 = i;
                    } else {
                        obj3 = obj5;
                        int iM113012 = (ThreadFactoryC3888.m11306("۬᩷") ^ i7) * 67;
                        i10 = iM113012 ^ 1794027116;
                        i9 = ((iM113012 ^ i8) * 31001) ^ (-1232451042);
                        intent = null;
                    }
                    break;
                case -1461185186:
                case -846253826:
                    bindingAdapterPosition = c19015.getBindingAdapterPosition();
                    c12665 = c8432.f21343;
                    iM31486 = c12665.m31486(c8432);
                    if (C0797.m3359()) {
                        iM11306 = ThreadFactoryC3888.m11306("۟ܽ") ^ i8;
                        i2 = ((iM11306 ^ i7) * 29445) ^ 1207571786;
                        i3 = -1263921978;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i8;
                        i2 = ((iM11306 ^ i7) * (-7825)) ^ 1790214200;
                        i3 = 505512491;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case -1448743053:
                case -867655009:
                    c8432 = (C8432) this.f11651;
                    Object obj6 = this.f11649;
                    if (C1066.f4915 > 0) {
                        iM45029 = (C19806.m45029("ۗ᩵") ^ i7) * 7;
                        obj = obj6;
                        i9 = ((iM45029 ^ i8) * (-11493)) ^ 279023862;
                        i4 = 1625948572;
                        i10 = iM45029 ^ i4;
                    } else {
                        obj = obj6;
                        iM11306 = C19806.m45029("ۛۖ") ^ i7;
                        i2 = ((iM11306 ^ i8) * (-5917)) ^ (-1007955360);
                        i3 = -1127270333;
                        i10 = iM11306 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -1189468654:
                case 640605764:
                    interfaceC2557 = (InterfaceC2557) obj3;
                    dialogInterface.dismiss();
                    if (i6 != 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ۨ") + i7) * 19;
                        i2 = ((iM11306 ^ i8) * 10713) ^ (-1804792229);
                        i3 = 1022793976;
                    } else {
                        iM11306 = C19806.m45029("ܳۧ") ^ i8;
                        i2 = ((iM11306 ^ i7) * (-4417)) ^ 1908595060;
                        i3 = -967605544;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case -1119037760:
                case 1401223716:
                    arrayList = c8432.f21338;
                    if (C0629.f2722 <= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("֨ۢ") ^ i8;
                        i2 = ((iM11306 ^ i7) * (-7825)) ^ 1790214200;
                        i3 = 505512491;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩳۧ") ^ i8;
                        i2 = ((iM11306 ^ i7) * 9883) ^ 962531680;
                        i3 = -1672152215;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case -1017085846:
                case -276839992:
                    c8291 = (C8291) this.f11651;
                    Object obj7 = this.f11649;
                    if (!C0962.f3784) {
                        iM45029 = C19806.m45029("ܳܳ") ^ i8;
                        obj2 = obj7;
                        i9 = ((iM45029 ^ i7) * 1657) ^ 1724439167;
                        i4 = -47758492;
                        i10 = iM45029 ^ i4;
                    } else {
                        obj2 = obj7;
                        iM11306 = (C19806.m45029("ܿ֨") + i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM11306 ^ i7) * 10339) ^ 503522014;
                        i3 = -346186461;
                        i10 = iM11306 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -749242363:
                case 1178109084:
                    ThreadFactoryC3888.m11300();
                    C1419.m4973();
                    int iM113013 = (ThreadFactoryC3888.m11306("۬᩷") ^ i7) * 67;
                    i10 = iM113013 ^ 1794027116;
                    i9 = ((iM113013 ^ i8) * 31001) ^ (-1232451042);
                    intent = null;
                    break;
                case -512467993:
                case 1661896687:
                    c12665.notifyItemRangeRemoved(bindingAdapterPosition - i11, 2);
                    iM11306 = (C19806.m45029("ۡܽ") + i7) * (-75);
                    i2 = ((iM11306 ^ i8) * (-15283)) ^ 1211069056;
                    i3 = 371499865;
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case -359713122:
                case 1579594529:
                    c13810 = (C13810) this.f11651;
                    Object obj8 = this.f11649;
                    if (C1398.f5802 > 0) {
                        iM45029 = (i8 - C19806.m45029("ۧ᩺")) * (-107);
                        obj4 = obj8;
                        i9 = ((iM45029 ^ i7) * (-23887)) ^ 354148574;
                        i4 = -372179426;
                        i10 = iM45029 ^ i4;
                    } else {
                        obj4 = obj8;
                        iM11306 = C19806.m45029("ۛۖ") ^ i7;
                        i2 = ((iM11306 ^ i8) * (-5917)) ^ (-1007955360);
                        i3 = -1127270333;
                        i10 = iM11306 ^ i3;
                        i9 = i2;
                    }
                    break;
                case -281795329:
                case 1446220946:
                    arrayList.remove(i13);
                    C23186.m51202().m32802(i13);
                    if (C0050.m938(arrayList) > 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֫᩺") ^ i8) * 21;
                        i2 = ((iM11306 ^ i7) * 25377) ^ (-559460352);
                        i3 = -2055332042;
                    } else {
                        iM11306 = C19806.m45029("ܳۡ") ^ i7;
                        i2 = ((iM11306 ^ i8) * 15449) ^ 1139416365;
                        i3 = -771853459;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case -74391845:
                case 1338739887:
                    C8265.m21676(c11545, interfaceC2557, ActivityC11632.class);
                    iM11306 = (C19806.m45029("֫ܿ") + i7) * (-83);
                    i2 = ((iM11306 ^ i8) * (-11099)) ^ 2050373227;
                    i3 = 267981899;
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case -26205922:
                case 204943843:
                    C0817.m3397(c11545, interfaceC2557, new C2849(c11545));
                    iM11306 = (C19806.m45029("֫ܿ") + i7) * (-83);
                    i2 = ((iM11306 ^ i8) * (-11099)) ^ 2050373227;
                    i3 = 267981899;
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case 239071636:
                case 819711004:
                    C19806.m45024();
                    if (C19806.f63586) {
                        iM11306 = (C19806.m45029("ܿ֨") + i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM11306 ^ i7) * 10339) ^ 503522014;
                        i3 = -346186461;
                    } else {
                        iM11306 = (i8 - C19806.m45029("ܰܳ")) * (-75);
                        i2 = ((iM11306 ^ i7) * (-5403)) ^ 495906889;
                        i3 = 1737037337;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case 455690311:
                case 1565813769:
                    C1419.m4977(mainM7591, intent);
                    C6936.m18602(interfaceC2557, 2000);
                    iM11306 = (C19806.m45029("֫ܿ") + i7) * (-83);
                    i2 = ((iM11306 ^ i8) * (-11099)) ^ 2050373227;
                    i3 = 267981899;
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case 524227638:
                case 2049780538:
                    c12665.notifyItemRangeRemoved(bindingAdapterPosition, i11);
                    iM11306 = (C19806.m45029("ۡܽ") + i7) * (-75);
                    i2 = ((iM11306 ^ i8) * (-15283)) ^ 1211069056;
                    i3 = 371499865;
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case 637147532:
                case 2127470039:
                    i11 = 1;
                    i13 = (bindingAdapterPosition - iM31486) - 1;
                    if (C3722.f13525 <= 0) {
                        iM11306 = (C19806.m45029("ܿ֨") + i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((iM11306 ^ i7) * 10339) ^ 503522014;
                        i3 = -346186461;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻ܳ") ^ i7;
                        i2 = ((iM11306 ^ i8) * 29295) ^ 1343209713;
                        i3 = -512240464;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case 729820543:
                case 927199275:
                    C8291.m21728(c8291, (boolean[]) obj2);
                    break;
                case 969825740:
                case 1318012547:
                    if (i6 != 2) {
                        iM11306 = (C19806.m45029("֫ܿ") + i7) * (-83);
                        i2 = ((iM11306 ^ i8) * (-11099)) ^ 2050373227;
                        i3 = 267981899;
                    } else {
                        iM11306 = (i7 - ThreadFactoryC3888.m11306("ۘ᩷")) * 25;
                        i2 = ((iM11306 ^ i8) * (-291)) ^ (-770430545);
                        i3 = -494897142;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                case 1292333345:
                case 1448372399:
                    switch (this.f11650) {
                        case 0:
                            iM450210 = C19806.m45029("ۨܶ") ^ i7;
                            i9 = ((iM450210 ^ i8) * 16269) ^ (-22856463);
                            i5 = 384858088;
                            break;
                        case 1:
                            iM450210 = (C19806.m45029("ۖ֫") + i8) * (-71);
                            i9 = ((iM450210 ^ i7) * 9389) ^ 1676321252;
                            i5 = 297313595;
                            break;
                        case 2:
                            iM450210 = ThreadFactoryC3888.m11306("֡ۘ") ^ i7;
                            i9 = ((iM450210 ^ i8) * 10907) ^ (-962419709);
                            i5 = 1484755269;
                            break;
                        default:
                            iM450210 = ThreadFactoryC3888.m11306("ۜܽ") ^ i7;
                            i9 = ((iM450210 ^ i8) * (-27719)) ^ (-255619056);
                            i5 = 1905281287;
                            break;
                    }
                    i10 = iM450210 ^ i5;
                    i6 = i;
                    break;
                case 1962431737:
                case 2121363292:
                    if (i6 != 1) {
                        iM11306 = (C19806.m45029("᩶ۙ") ^ i8) * 99;
                        i2 = ((iM11306 ^ i7) * 981) ^ (-913277433);
                        i3 = 2083640168;
                    } else {
                        iM11306 = (C19806.m45029("ᩳ᩶") + i8) * 127;
                        i2 = ((iM11306 ^ i7) * (-26737)) ^ (-563947702);
                        i3 = 648128961;
                    }
                    i10 = iM11306 ^ i3;
                    i9 = i2;
                    break;
                default:
                    C1025.m3861();
                    C3535.m10431();
                    break;
            }
            return;
        }
    }
}
