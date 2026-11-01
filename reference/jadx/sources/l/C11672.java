package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۨۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes.dex */
public final class C11672 extends AbstractC11462 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f39227;

    /* JADX INFO: renamed from: ֫֡᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f39228;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static C11835 f39229;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0544 f39230;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39231;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f39233;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39234;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39235;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39236;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39237;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39238;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC11026 f39239;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f39240;

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֫ */
    public final void mo13030() {
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC20745 mo28615() {
        return null;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo13036() {
        return true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۧ */
    public native List mo13037();

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۫ */
    public final String mo13039() {
        return "local";
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰۙ */
    public final boolean mo13042() {
        return true;
    }

    static {
        ApplicationC6132.m17119(UMErrorCode.E_UM_BE_CREATE_FAILED);
        f39228 = new short[]{8128, -22043, -22133, -22108, -22098, -22088, -22107, -22109, -22098, -22043, -22098, -22101, -22082, -22101, -22133, -22108, -22098, -22088, -22107, -22109, -22098, -22043, -22098, -22101, -22082, -22101, -22133, -22108, -22098, -22088, -22107, -22109, -22098, -22043, -22107, -22104, -22104, -3254, -14124, -2138, -22133, -22108, -22098, -22088, -22107, -22109, -22098, -22043, -22107, -22104, -22104};
        new C20201().m10243();
        f39229 = new C11835("local", null);
        f39230 = new C16673();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m29124(String str) {
        InputStream resourceAsStream = C11672.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            return false;
        }
        C19431.m44468(resourceAsStream);
        return true;
    }

    public C11672(String str) {
        super(0, str);
        InterfaceC0544 interfaceC0544 = f39230;
        this.f39234 = new C12440(this, interfaceC0544);
        this.f39238 = new C17378(this, interfaceC0544);
        this.f39231 = new C6089(this);
        this.f39236 = new C11029(this);
        this.f39232 = new C23729(this);
        this.f39235 = new C13789(this);
        this.f39237 = new C20906(this);
        this.f39239 = new C15968(this);
    }

    public C11672(C17367 c17367) {
        super(c17367);
        InterfaceC0544 interfaceC0544 = f39230;
        this.f39234 = new C12440(this, interfaceC0544);
        this.f39238 = new C17378(this, interfaceC0544);
        this.f39231 = new C6089(this);
        this.f39236 = new C11029(this);
        this.f39232 = new C23729(this);
        this.f39235 = new C13789(this);
        this.f39237 = new C20906(this);
        this.f39239 = new C15968(this);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13032(C11018 c11018) {
        super.mo13032(c11018);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۚ */
    public final void mo28628(String str) {
        super.mo28628(str);
        if (mo28638()) {
            C13638.requireNonNull(f39229.f39732);
            str = AbstractC11462.m28608(f39229.f39732);
            this.f39240 = str;
        } else {
            this.f39240 = null;
        }
        try {
            this.f39233 = C0055.m956(str);
        } catch (IOException unused) {
            this.f39233 = str;
        }
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩶ */
    public final String mo28639() {
        return this.f39240;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo28638() {
        return m28629().startsWith("//SEARCH//");
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo13031() {
        return (this.f39233.startsWith("/proc/") || this.f39233.startsWith("/dev/")) ? false : true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final String mo28635(C11545 c11545) {
        try {
            C8847 c8847 = new C8847(this.f39233);
            long jM22975 = c8847.m22975();
            long jM22976 = c8847.m22976();
            if (jM22976 == 0) {
                return null;
            }
            return C16737.m39264(R.string.MT_Protector, C1791.m5863(jM22976 - jM22975), C1791.m5863(jM22976));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܺ */
    public final String mo28637() {
        return this.f39233;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܽ */
    public final String mo13043() {
        if (mo28638()) {
            return AbstractC11462.m28614(this.f39240) + " - " + C16737.m39288(R.string.MT_Protector);
        }
        return super.mo13043();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC9677 mo13029() {
        return C21611.f70098;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final void mo23741(boolean z) {
        ArrayList arrayList;
        super.mo23741(z);
        C19016.m43736();
        if (mo28638()) {
            C11835 c11835 = f39229;
            synchronized (c11835) {
                arrayList = new ArrayList(c11835.f39735);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6794) ((C6189) it.next()).m17194()).m18398();
            }
        }
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC4674 mo28620(C21422 c21422) {
        AbstractC4674 abstractC4674M50200 = C22669.m50200(c21422);
        if (abstractC4674M50200 == C20075.m45445()) {
            abstractC4674M50200 = new C20075();
        }
        return abstractC4674M50200.mo1961(new C9989());
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC4674 mo23634(C21422 c21422) {
        AbstractC4674 c2267;
        if (!c21422.m47970().m28814(b.k)) {
            c2267 = new C2267(R.string.MT_Protector, R.drawable.MT_Protector);
            c2267.m12944();
        } else {
            c2267 = new C4927("local");
        }
        return c2267.mo1961(new C22024());
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC4674 mo23638() {
        return new C7207();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC4674 mo23637() {
        if (mo28638()) {
            C5983 c5983 = new C5983(R.string.MT_Protector, R.drawable.MT_Protector);
            c5983.m12944();
            return c5983;
        }
        return new C18496();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC4674 mo23636() {
        C5755 c5755 = new C5755(R.string.MT_Protector, R.drawable.MT_Protector);
        c5755.f19549 = new ArrayList();
        return c5755;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC4674 mo28642() {
        if (mo28638()) {
            return new C10923(R.string.MT_Protector, R.drawable.MT_Protector);
        }
        return new C0815(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC4674 mo13044() {
        return new DialogInterfaceOnDismissListenerC7394();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC4674 mo23631() {
        return new C10361(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo28624(final C11545 c11545, InterfaceC2557 interfaceC2557) {
        C18827 c18827;
        if (!C6696.m18084()) {
            AbstractC20745 abstractC20745Mo7989 = interfaceC2557.mo7989();
            if (abstractC20745Mo7989 instanceof C17196) {
                final C17196 c17196 = (C17196) abstractC20745Mo7989;
                if (C6696.m18097()) {
                    final C11731 c11731Mo7971 = interfaceC2557.mo7971();
                    int iM29319 = c11731Mo7971.m29319();
                    if ((c11731Mo7971.m29327() < 10000 || (iM29319 & 4) == 0) && (iM29319 & 36) == 0) {
                        c18827 = new C18827(c11545, new BooleanSupplier() { // from class: l.ᩴܰ֨
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                C17196 c17197 = c17196;
                                C11731 c11731 = c11731Mo7971;
                                int iM293110 = c11731.m29319();
                                boolean z = false;
                                if ((c11731.m29327() < 10000 || (iM293110 & 4) == 0) && (iM293110 & 36) == 0) {
                                    try {
                                        c17197.mo33970().close();
                                    } catch (IOException unused) {
                                        z = true;
                                    }
                                }
                                return !z;
                            }
                        }, interfaceC2557, new Runnable() { // from class: l.۠ܰ֨
                            @Override // java.lang.Runnable
                            public final void run() {
                                Main mainM28824 = c11545.m28824();
                                C11731 c11731 = c11731Mo7971;
                                C8244.m21623(mainM28824, c17196.mo33986(), C13672.m33382(c11731.m29319()), c11731.m29326(), c11731.m29320());
                            }
                        });
                    } else {
                        C8265.m21685(c11545, interfaceC2557);
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && c17196.mo40126()) {
                    final Uri uriMo40127 = c17196.mo40127();
                    c18827 = new C18827(c11545, new BooleanSupplier() { // from class: l.᩵ܰ֨
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            try {
                                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C16737.m39259().openFileDescriptor(uriMo40127, "r");
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                }
                                return true;
                            } catch (Exception e) {
                                String message = e.getMessage();
                                return message == null || !message.contains("Permission denied");
                            }
                        }
                    }, interfaceC2557, new Runnable() { // from class: l.ۡܰ֨
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8244.m21623(c11545.m28824(), c17196.mo33986(), "unknown", "unknown", "unknown");
                        }
                    });
                }
                c18827.m10243();
                return;
            }
            if (abstractC20745Mo7989 instanceof C14705) {
                C14705 c14705 = (C14705) abstractC20745Mo7989;
                try {
                    StructStat structStatLstat = Os.lstat(c14705.m35232());
                    int i = structStatLstat.st_mode;
                    boolean z = false;
                    if ((structStatLstat.st_gid < 10000 || (i & 4) == 0) && (i & 36) == 0) {
                        try {
                            c14705.mo33970().close();
                        } catch (IOException unused) {
                            z = true;
                        }
                    }
                    if (z) {
                        C8244.m21623(c11545.m28824(), c14705.mo33986(), C13672.m33382(structStatLstat.st_mode), Features.m56(structStatLstat.st_uid), Features.m56(structStatLstat.st_gid));
                        return;
                    }
                } catch (ErrnoException unused2) {
                }
            }
        }
        C8265.m21685(c11545, interfaceC2557);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo23627(InterfaceC2557 interfaceC2557) {
        String path = interfaceC2557.getPath();
        C23186 c23186 = C23186.f75236;
        C13465.m32966(path, MotionUtils.EASING_TYPE_PATH);
        C23186.m51183(path, (C5546) null);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo23626(String str, boolean z) {
        C23186 c23186 = C23186.f75236;
        C13465.m32966(str, MotionUtils.EASING_TYPE_PATH);
        C23186.m51183(str, (C5546) null);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Switch 'out' block B:33:0x0073 for B:30:0x0064 already processed. Defaulting to fallback option. */
    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo28626(C21422 c21422, ArrayList arrayList) {
        boolean z;
        boolean z2;
        if (c21422.m47977()) {
            z = false;
            z2 = false;
        } else {
            Iterator it = c21422.m47979().iterator();
            z2 = true;
            while (true) {
                if (it.hasNext()) {
                    InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
                    if (interfaceC2557.mo7985()) {
                        C21512 c21512Mo7972 = interfaceC2557.mo7972();
                        String strM48185 = c21512Mo7972.m48185();
                        strM48185.getClass();
                        switch (strM48185) {
                            case "application/vnd.android.package-archives":
                            case "application/x-jar":
                            case "application/zip":
                            case "application/vnd.android.package-archive":
                                continue;
                                break;
                            default:
                                if (!c21512Mo7972.m48180(4, 5)) {
                                    break;
                                } else {
                                    z2 = false;
                                    break;
                                }
                                break;
                        }
                    }
                    z = false;
                    z2 = false;
                } else {
                    z = true;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (C9512.m24345(c21422)) {
            arrayList2.add(new C9512());
            arrayList2.add(new C17272());
        }
        C22501 c22501 = this.f38585;
        if (c22501 != null) {
            if (c22501.m50018("arsc")) {
                arrayList2.add(new C15446());
            } else if (this.f38585.m50018("dex")) {
                arrayList2.add(new C8390());
            } else if (this.f38585.m50018("folder")) {
                arrayList2.add(new C11212());
            } else if (this.f38585.m50018("zip") || this.f38585.m50017()) {
                arrayList2.add(new C15136());
                C22501 c22502 = this.f38585;
                if (!"jar".equals(c22502.f73453) || !"jar".equals(c22502.f73456)) {
                    C22501 c22503 = this.f38585;
                    String str = c22503.f73456;
                    String str2 = c22503.f73453;
                    if (("jar".equals(str2) && "apk".equals(str)) || ("apk".equals(str2) && "jar".equals(str))) {
                        arrayList2.add(new C8390());
                    }
                } else {
                    arrayList2.add(new C8390());
                }
            } else if (this.f38585.m50018("apk")) {
                arrayList2.add(new C15136(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C8390());
                arrayList2.add(new C15446());
                arrayList2.add(new C6978());
            } else if (!z) {
                arrayList2.add(new C11608());
            }
            if (!this.f38585.m50018("folder")) {
                C22501 c22504 = this.f38585;
                if (c22504.f73455 == c22504.f73452) {
                    if (arrayList2.size() % 2 == 0) {
                        arrayList2.add(0, new C3449());
                    } else {
                        arrayList2.add(new C3449());
                    }
                }
            }
        }
        int iM28609 = AbstractC11462.m28609();
        if (z && z2) {
            int i = iM28609 % 2 != 0 ? iM28609 - 1 : iM28609;
            arrayList.add(i, new C21505());
            arrayList.add(i + 1, new C19202(R.string.MT_Protector, R.drawable.MT_Protector));
            iM28609 += 2;
        } else if (z) {
            arrayList2.add(new C21505());
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() % 2 != 0 && !C21485.m48102().mo1960(c21422)) {
            arrayList.set(iM28609, (AbstractC4674) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC13848 mo23624() {
        return C3971.f14739;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩹ */
    public final C6086 mo13045() {
        if (mo28638()) {
            return new C6086(C16737.m39288(R.string.MT_Protector), this.f39240, C0690.f2897);
        }
        String strM28629 = m28629();
        return new C6086(C6730.m18161(strM28629), strM28629, C0690.f2900);
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC20745 mo13040(InterfaceC2557 interfaceC2557) {
        return interfaceC2557.mo7989();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13033(C11545 c11545, List list, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10840 c10840 = (C10840) it.next();
            AbstractC20745 abstractC20745M15313 = C5553.m15313(c10840.m27178(), new String[0]);
            c10840.m27173(abstractC20745M15313);
            arrayList.add(new C23540(abstractC20745M15313, abstractC20745M15313.getName(), abstractC20745M15313.mo33986()));
        }
        m28622((List) arrayList);
        try {
            runnable.run();
        } catch (Throwable th) {
            c11545.m28824().m31002(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙۙ */
    public final boolean mo23629() {
        return (C15198.m36412() || mo28638()) ? false : true;
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo23628(C11545 c11545, String str, boolean z) throws C4987 {
        boolean zMo33987;
        Main mainM28824;
        String strConcat;
        if (mo28638()) {
            return;
        }
        try {
            C2462.m7541(this.f39233, EnumC11636.MODIFY_DIRECTORY_LINKED);
            AbstractC20745 abstractC20745M15313 = str.startsWith("/") ? C5553.m15313(str, new String[0]) : C5553.m15313(m28629(), str);
            if (abstractC20745M15313.mo33975()) {
                if (abstractC20745M15313.mo33974()) {
                    throw new C4987(R.string.MT_Protector);
                }
                throw new C4987(R.string.MT_Protector);
            }
            if (z) {
                zMo33987 = abstractC20745M15313.mo33987();
            } else {
                AbstractC20745 abstractC20745M46689 = abstractC20745M15313.m46689();
                zMo33987 = (abstractC20745M46689 == null || abstractC20745M46689.mo33975() || abstractC20745M46689.mo33987()) && abstractC20745M15313.mo33978();
            }
            if (!zMo33987) {
                if (z) {
                    mainM28824 = c11545.m28824();
                    strConcat = "Failed to create directory: ".concat(str);
                } else {
                    mainM28824 = c11545.m28824();
                    strConcat = "Failed to create file: ".concat(str);
                }
                mainM28824.m31000(strConcat, false);
                C21094.m47530();
                return;
            }
            c11545.m28763(abstractC20745M15313.getName());
            if (str.indexOf(47) == -1) {
                C21094.m47530();
            } else {
                c11545.m28812(abstractC20745M15313.getParent(), true);
            }
        } catch (C4987 e) {
            c11545.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۙ */
    public final void mo13034(C11545 c11545, C11545 c11546) {
        c11545.m28775("local");
        if (!c11546.m28814("local")) {
            C6936 c6936M28807 = c11545.m28807();
            c6936M28807.m18631(c11546, c6936M28807.m18661(), false);
        }
        c11545.m28823();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo13041(String str) {
        AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
        return abstractC20745M15313.mo33975() && !abstractC20745M15313.mo33974();
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ۨ */
    public final void mo13038(C11545 c11545) {
        if (c11545.m28816()) {
            return;
        }
        List<C23540> listM28631 = m28631();
        if (listM28631.isEmpty()) {
            return;
        }
        m28622((List) null);
        boolean zMo28638 = mo28638();
        ArrayList arrayList = new ArrayList();
        for (C23540 c23540 : listM28631) {
            if (c23540.m51886()) {
                arrayList.add(zMo28638 ? c23540.m51888() : c23540.m51883());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (zMo28638) {
            c11545.m28776(arrayList);
        } else {
            c11545.m28777((Collection) arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29122(C17367 c17367) {
        C11835 c11835 = new C11835("local", c17367.m40448());
        c11835.f39736 = c17367.readInt();
        int i = c17367.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM40458 = c17367.m40458();
            String strM40459 = c17367.m40458();
            AbstractC20745 abstractC20745M15313 = C5553.m15313(strM40458, new String[0]);
            if (abstractC20745M15313 instanceof InterfaceC16034) {
                abstractC20745M15313 = ((InterfaceC16034) abstractC20745M15313).mo8445();
            }
            arrayList.add(new C6189(new C6794(abstractC20745M15313), strM40459));
        }
        BitSet bitSetValueOf = BitSet.valueOf(c17367.m40451());
        for (int i3 = 0; i3 < i; i3++) {
            if (bitSetValueOf.get(i3)) {
                ((C6189) arrayList.get(i3)).f21065 = true;
            }
        }
        c11835.f39735 = arrayList;
        f39229 = c11835;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29125(C11018 c11018) {
        ArrayList arrayList;
        C11835 c11835 = f39229;
        c11018.m27783(c11835.f39732);
        c11018.writeInt(c11835.f39736);
        synchronized (c11835) {
            arrayList = new ArrayList(c11835.f39735);
        }
        c11018.writeInt(arrayList.size());
        BitSet bitSet = new BitSet(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C6189 c6189 = (C6189) arrayList.get(i);
            c11018.m27786(c6189.m17194().getPath());
            c11018.m27786(c6189.m17197());
            bitSet.set(i, c6189.f21065);
        }
        c11018.m27794(bitSet.toByteArray());
    }

    @Override // l.AbstractC11462
    /* JADX INFO: renamed from: ᩻ */
    public final List mo13046() {
        return Arrays.asList(AbstractC11462.f38579, this.f39234, this.f39238, this.f39231, AbstractC11462.f38575, AbstractC11462.f38578, AbstractC11462.f38580, this.f39237, this.f39235, this.f39236, this.f39232, this.f39239);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m29120(final C11545 c11545, final int i) {
        C9436 c9436M34018 = C14063.m34018();
        boolean z = false;
        if (!c9436M34018.m24194()) {
            C14063 c14063M127 = c11545.m28824().m127();
            String str = C5553.m15313(m28629(), new String[0]).mo40129().m40128() + "/*";
            if (c9436M34018.m24196()) {
                c14063M127.m34023(str, false, c9436M34018, new Runnable() { // from class: l.ۤܰ֨
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35392.m29120(c11545, i);
                    }
                });
                return;
            } else {
                c14063M127.m34025(str);
                return;
            }
        }
        C7318 c7318 = new C7318();
        List<PackageInfo> installedPackages = C16737.m39292().getInstalledPackages(0);
        HashMap map = new HashMap(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            map.put(packageInfo.packageName, packageInfo);
        }
        if (Build.VERSION.SDK_INT == 33) {
            Iterator it = C5553.m15313(c11545.m28798(), new String[0]).mo33983(true).iterator();
            while (it.hasNext()) {
                c7318.m19524((AbstractC20745) it.next());
            }
        } else {
            Iterator<PackageInfo> it2 = installedPackages.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().packageName;
                if (!str2.equals("android")) {
                    c7318.m19524(C5553.m15313(c11545.m28798(), str2));
                }
            }
            z = true;
        }
        List listM19526 = c7318.m19526();
        if (listM19526.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        ArrayList arrayList = new ArrayList(listM19526.size());
        Iterator it3 = listM19526.iterator();
        while (it3.hasNext()) {
            PackageInfo packageInfo2 = (PackageInfo) map.get(((C17196) it3.next()).getName());
            if (packageInfo2 != null) {
                arrayList.add(packageInfo2);
            }
        }
        Collections.sort(arrayList, new C16445(1));
        C6732 c6732 = new C6732(c11545.m28824(), arrayList);
        c6732.m18187(i);
        c6732.m18188(new C16081(listM19526, c11545));
        if (z) {
            c6732.m18189(new ViewOnClickListenerC20314(1, c11545));
        }
        c6732.m18186();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29119(List list, C11545 c11545, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set set = (Set) C9030.stream(arrayList).map(new C7459(2)).collect(C1890.toSet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17196 c17196 = (C17196) it.next();
            if (set.contains(c17196.getName())) {
                linkedHashSet.add(c17196.m40128());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        c11545.m28824().m127().m34024(linkedHashSet);
    }
}
