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

/* JADX INFO: renamed from: l.ۜ᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes.dex */
public final class C7495 extends AbstractC7364 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static InterfaceC0454 f24783;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static boolean f24784;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C22829 f24785;

    /* JADX INFO: renamed from: ܳۖۨ, reason: not valid java name and contains not printable characters */
    private static final short[] f24786;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24787;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f24788;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24789;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24790;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f24791;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24793;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24794;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24795;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC18551 f24796;

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֨ */
    public native List mo10160();

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۟ */
    public final String mo10164() {
        return "local";
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۠ */
    public final void mo10165() {
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10167() {
        return true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ۙ */
    public final boolean mo10178() {
        return true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC22044 mo20216() {
        return null;
    }

    static {
        ApplicationC23172.m52091(76);
        f24786 = new short[]{1054, -10678, -10716, -10741, -10751, -10729, -10742, -10740, -10751, -10678, -10751, -10748, -10735, -10748, -10716, -10741, -10751, -10729, -10742, -10740, -10751, -10678, -10751, -10748, -10735, -10748, -10716, -10741, -10751, -10729, -10742, -10740, -10751, -10678, -10742, -10745, -10745, 22694, 24293, 20291, -10716, -10741, -10751, -10729, -10742, -10740, -10751, -10678, -10742, -10745, -10745};
        new C6750().m8197();
        f24785 = new C22829("local", null);
        f24783 = new C4512();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m20540(String str) {
        InputStream resourceAsStream = C7495.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            return false;
        }
        C20244.m46520(resourceAsStream);
        return true;
    }

    public C7495(String str) {
        super(0, str);
        InterfaceC0454 interfaceC0454 = f24783;
        this.f24790 = new C14952(this, interfaceC0454);
        this.f24795 = new C21666(this, interfaceC0454);
        this.f24794 = new C18682(this);
        this.f24793 = new C0783(this);
        this.f24792 = new C8241(this);
        this.f24789 = new C8986(this);
        this.f24787 = new C20920(this);
        this.f24796 = new C12715(this);
    }

    public C7495(C20348 c20348) {
        super(c20348);
        InterfaceC0454 interfaceC0454 = f24783;
        this.f24790 = new C14952(this, interfaceC0454);
        this.f24795 = new C21666(this, interfaceC0454);
        this.f24794 = new C18682(this);
        this.f24793 = new C0783(this);
        this.f24792 = new C8241(this);
        this.f24789 = new C8986(this);
        this.f24787 = new C20920(this);
        this.f24796 = new C12715(this);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10161(C6178 c6178) {
        super.mo10161(c6178);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩴ */
    public final void mo20211(String str) {
        super.mo20211(str);
        if (mo20209()) {
            C17359.requireNonNull(f24785.f73993);
            str = AbstractC7364.m20187(f24785.f73993);
            this.f24791 = str;
        } else {
            this.f24791 = null;
        }
        try {
            this.f24788 = C14453.m34911(str);
        } catch (IOException unused) {
            this.f24788 = str;
        }
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩶ */
    public final String mo20212() {
        return this.f24791;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo20209() {
        return m20218().startsWith("//SEARCH//");
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo10170() {
        return (this.f24788.startsWith("/proc/") || this.f24788.startsWith("/dev/")) ? false : true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܰ */
    public final String mo20207() {
        return this.f24788;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final String mo20213(C8614 c8614) {
        try {
            C20854 c20854 = new C20854(this.f24788);
            long jM47682 = c20854.m47682();
            long jM47683 = c20854.m47683();
            if (jM47683 == 0) {
                return null;
            }
            return C21576.m49059(R.string.MT_Protector, C8311.m22390(jM47683 - jM47682), C8311.m22390(jM47683));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ֡ */
    public final String mo10159() {
        if (mo20209()) {
            return AbstractC7364.m20188(this.f24791) + " - " + C21576.m49088(R.string.MT_Protector);
        }
        return super.mo10159();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC7629 mo10174() {
        return C11969.f38536;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final void mo20214(boolean z) {
        ArrayList arrayList;
        super.mo20214(z);
        C24808.m55327();
        if (mo20209()) {
            C22829 c22829 = f24785;
            synchronized (c22829) {
                arrayList = new ArrayList(c22829.f73990);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6004) ((C1200) it.next()).m4414()).m17450();
            }
        }
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC9843 mo18808(C12915 c12915) {
        AbstractC9843 c19495;
        if (!c12915.m31974().m23228(b.k)) {
            c19495 = new C19495(R.string.MT_Protector, R.drawable.MT_Protector);
            c19495.m25621();
        } else {
            c19495 = new C1265("local");
        }
        return c19495.mo2725(new C12782());
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC9843 mo18807() {
        return new C3833();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC9843 mo18809() {
        if (mo20209()) {
            C9908 c9908 = new C9908(R.string.MT_Protector, R.drawable.MT_Protector);
            c9908.m25621();
            return c9908;
        }
        return new C20241();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC9843 mo20196(C12915 c12915) {
        AbstractC9843 abstractC9843M45071 = C19540.m45071(c12915);
        if (abstractC9843M45071 == C12540.m31154()) {
            abstractC9843M45071 = new C12540();
        }
        return abstractC9843M45071.mo2725(new C3415());
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC9843 mo18805() {
        C10126 c10126 = new C10126(R.string.MT_Protector, R.drawable.MT_Protector);
        c10126.f32410 = new ArrayList();
        return c10126;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC9843 mo20219() {
        if (mo20209()) {
            return new C0960(R.string.MT_Protector, R.drawable.MT_Protector);
        }
        return new C22807(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܶ */
    public final AbstractC9843 mo10173() {
        return new DialogInterfaceOnDismissListenerC6181();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC9843 mo18802() {
        return new C20634(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo20200(C8614 c8614, InterfaceC2386 interfaceC2386) {
        C16158 c16158;
        if (!C7756.m21096()) {
            AbstractC22044 abstractC22044Mo8093 = interfaceC2386.mo8093();
            if (abstractC22044Mo8093 instanceof C18379) {
                final C18379 c18379 = (C18379) abstractC22044Mo8093;
                if (C7756.m21111()) {
                    final C9097 c9097Mo5155 = interfaceC2386.mo5155();
                    int iM24247 = c9097Mo5155.m24247();
                    if ((c9097Mo5155.m24246() < 10000 || (iM24247 & 4) == 0) && (iM24247 & 36) == 0) {
                        c16158 = new C16158(c8614, new BooleanSupplier() { // from class: l.᩻᩻۫
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                C18379 c183710 = c18379;
                                C9097 c9097 = c9097Mo5155;
                                int iM24248 = c9097.m24247();
                                boolean z = false;
                                if ((c9097.m24246() < 10000 || (iM24248 & 4) == 0) && (iM24248 & 36) == 0) {
                                    try {
                                        c183710.mo4290().close();
                                    } catch (IOException unused) {
                                        z = true;
                                    }
                                }
                                return !z;
                            }
                        }, interfaceC2386, new RunnableC24059(c8614, c18379, c9097Mo5155, 1));
                    } else {
                        C1663.m5985(c8614, interfaceC2386);
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && c18379.mo42886()) {
                    final Uri uriMo42888 = c18379.mo42888();
                    c16158 = new C16158(c8614, new BooleanSupplier() { // from class: l.ܺ᩻۫
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            try {
                                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C21576.m49091().openFileDescriptor(uriMo42888, "r");
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                }
                                return true;
                            } catch (Exception e) {
                                String message = e.getMessage();
                                return message == null || !message.contains("Permission denied");
                            }
                        }
                    }, interfaceC2386, new RunnableC17936(0, c8614, c18379));
                }
                c16158.m8197();
                return;
            }
            if (abstractC22044Mo8093 instanceof C17063) {
                C17063 c17063 = (C17063) abstractC22044Mo8093;
                try {
                    StructStat structStatLstat = Os.lstat(c17063.m40200());
                    int i = structStatLstat.st_mode;
                    boolean z = false;
                    if ((structStatLstat.st_gid < 10000 || (i & 4) == 0) && (i & 36) == 0) {
                        try {
                            c17063.mo4290().close();
                        } catch (IOException unused) {
                            z = true;
                        }
                    }
                    if (z) {
                        C23618.m52860(c8614.m23233(), c17063.mo4294(), C6790.m18977(structStatLstat.st_mode), Features.m45(structStatLstat.st_uid), Features.m45(structStatLstat.st_gid));
                        return;
                    }
                } catch (ErrnoException unused2) {
                }
            }
        }
        C1663.m5985(c8614, interfaceC2386);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo18797(InterfaceC2386 interfaceC2386) {
        String path = interfaceC2386.getPath();
        C22961 c22961 = C22961.f74590;
        C15243.m36590(path, MotionUtils.EASING_TYPE_PATH);
        C22961.m51794(path, (C8877) null);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo18796(String str, boolean z) {
        C22961 c22961 = C22961.f74590;
        C15243.m36590(str, MotionUtils.EASING_TYPE_PATH);
        C22961.m51794(str, (C8877) null);
    }

    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Switch 'out' block B:33:0x0073 for B:30:0x0064 already processed. Defaulting to fallback option. */
    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo20202(C12915 c12915, ArrayList arrayList) {
        boolean z;
        boolean z2;
        if (c12915.m31988()) {
            z = false;
            z2 = false;
        } else {
            Iterator it = c12915.m31982().iterator();
            z2 = true;
            while (true) {
                if (it.hasNext()) {
                    InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
                    if (interfaceC2386.mo8090()) {
                        C8969 c8969Mo8091 = interfaceC2386.mo8091();
                        String strM23975 = c8969Mo8091.m23975();
                        strM23975.getClass();
                        switch (strM23975) {
                            case "application/vnd.android.package-archives":
                            case "application/x-jar":
                            case "application/zip":
                            case "application/vnd.android.package-archive":
                                continue;
                                break;
                            default:
                                if (!c8969Mo8091.m23971(4, 5)) {
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
        if (C13637.m33377(c12915)) {
            arrayList2.add(new C13637());
            arrayList2.add(new C18859());
        }
        C6774 c6774 = this.f24219;
        if (c6774 != null) {
            if (c6774.m18897("arsc")) {
                arrayList2.add(new C15195());
            } else if (this.f24219.m18897("dex")) {
                arrayList2.add(new C1772());
            } else if (this.f24219.m18897("folder")) {
                arrayList2.add(new C14449());
            } else if (this.f24219.m18897("zip") || this.f24219.m18896()) {
                arrayList2.add(new C5829());
                C6774 c6775 = this.f24219;
                if (!"jar".equals(c6775.f22589) || !"jar".equals(c6775.f22593)) {
                    C6774 c6776 = this.f24219;
                    String str = c6776.f22593;
                    String str2 = c6776.f22589;
                    if (("jar".equals(str2) && "apk".equals(str)) || ("apk".equals(str2) && "jar".equals(str))) {
                        arrayList2.add(new C1772());
                    }
                } else {
                    arrayList2.add(new C1772());
                }
            } else if (this.f24219.m18897("apk")) {
                arrayList2.add(new C5829(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C10720());
                arrayList2.add(new C15195());
                arrayList2.add(new C1772());
            } else if (!z) {
                arrayList2.add(new C8483());
            }
            if (!this.f24219.m18897("folder")) {
                arrayList2.add(new C9974());
            }
            if (!this.f24219.m18897("folder")) {
                C6774 c6777 = this.f24219;
                if (c6777.f22590 == c6777.f22594) {
                    if (arrayList2.size() % 2 == 0) {
                        arrayList2.add(0, new C18925());
                    } else {
                        arrayList2.add(new C18925());
                    }
                }
            }
        }
        int iM20190 = AbstractC7364.m20190();
        if (z && z2) {
            int i = iM20190 % 2 != 0 ? iM20190 - 1 : iM20190;
            arrayList.add(i, new C16621());
            arrayList.add(i + 1, new C12036(R.string.MT_Protector, R.drawable.MT_Protector));
            iM20190 += 2;
        } else if (z) {
            arrayList2.add(new C16621());
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() % 2 != 0 && !C2100.m7268().mo2481(c12915)) {
            arrayList.set(iM20190, (AbstractC9843) arrayList2.remove(0));
        }
        AbstractC7364.m20189(arrayList2);
        arrayList.addAll(arrayList2);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC0895 mo10169() {
        return C13461.f42854;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ܳ */
    public final C21535 mo10171() {
        if (mo20209()) {
            return new C21535(C21576.m49088(R.string.MT_Protector), this.f24791, C20613.f66061);
        }
        String strM20218 = m20218();
        return new C21535(C11293.m28548(strM20218), strM20218, C20613.f66109);
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC22044 mo10176(InterfaceC2386 interfaceC2386) {
        return interfaceC2386.mo8093();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10162(C8614 c8614, List list, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14406 c14406 = (C14406) it.next();
            AbstractC22044 abstractC22044M35193 = C14584.m35193(c14406.m34843(), new String[0]);
            c14406.m34839(abstractC22044M35193);
            arrayList.add(new C21120(abstractC22044M35193, abstractC22044M35193.getName(), abstractC22044M35193.mo4294()));
        }
        m20198((List) arrayList);
        try {
            runnable.run();
        } catch (Throwable th) {
            c8614.m23233().m40401(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙۙ */
    public final boolean mo18799() {
        return (C16514.m39144() || mo20209()) ? false : true;
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo18798(C8614 c8614, String str, boolean z) throws C4866 {
        boolean zMo4274;
        Main mainM23233;
        String strConcat;
        if (mo20209()) {
            return;
        }
        try {
            C6265.m17912(this.f24788, EnumC12230.MODIFY_DIRECTORY_LINKED);
            AbstractC22044 abstractC22044M35193 = str.startsWith("/") ? C14584.m35193(str, new String[0]) : C14584.m35193(m20218(), str);
            if (abstractC22044M35193.mo2934()) {
                if (abstractC22044M35193.mo4281()) {
                    throw new C4866(R.string.MT_Protector);
                }
                throw new C4866(R.string.MT_Protector);
            }
            if (z) {
                zMo4274 = abstractC22044M35193.mo4274();
            } else {
                AbstractC22044 abstractC22044M49858 = abstractC22044M35193.m49858();
                zMo4274 = (abstractC22044M49858 == null || abstractC22044M49858.mo2934() || abstractC22044M49858.mo4274()) && abstractC22044M35193.mo4283();
            }
            if (!zMo4274) {
                if (z) {
                    mainM23233 = c8614.m23233();
                    strConcat = "Failed to create directory: ".concat(str);
                } else {
                    mainM23233 = c8614.m23233();
                    strConcat = "Failed to create file: ".concat(str);
                }
                mainM23233.m40400(strConcat, false);
                C6331.m18055();
                return;
            }
            c8614.m23230(abstractC22044M35193.getName());
            if (str.indexOf(47) == -1) {
                C6331.m18055();
            } else {
                c8614.m23226(abstractC22044M35193.getParent(), true);
            }
        } catch (C4866 e) {
            c8614.m23233().m40401(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۙ */
    public final void mo10163(C8614 c8614, C8614 c8615) {
        c8614.m23174("local");
        if (!c8615.m23228("local")) {
            C20065 c20065M23194 = c8614.m23194();
            c20065M23194.m46149(c8615, c20065M23194.m46165(), false);
        }
        c8614.m23212();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo10177(String str) {
        AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
        return abstractC22044M35193.mo2934() && !abstractC22044M35193.mo4281();
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۤ */
    public final void mo10168(C8614 c8614) {
        if (c8614.m23165()) {
            return;
        }
        List<C21120> listM20206 = m20206();
        if (listM20206.isEmpty()) {
            return;
        }
        m20198((List) null);
        boolean zMo20209 = mo20209();
        ArrayList arrayList = new ArrayList();
        for (C21120 c21120 : listM20206) {
            if (c21120.m48219()) {
                arrayList.add(zMo20209 ? c21120.m48220() : c21120.m48221());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (zMo20209) {
            c8614.m23175(arrayList);
        } else {
            c8614.m23176((Collection) arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20539(C20348 c20348) {
        C22829 c22829 = new C22829("local", c20348.m46742());
        c22829.f73992 = c20348.readInt();
        int i = c20348.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            String strM46758 = c20348.m46758();
            String strM46759 = c20348.m46758();
            AbstractC22044 abstractC22044M35193 = C14584.m35193(strM46758, new String[0]);
            if (abstractC22044M35193 instanceof InterfaceC6557) {
                abstractC22044M35193 = ((InterfaceC6557) abstractC22044M35193).mo15565();
            }
            arrayList.add(new C1200(new C6004(abstractC22044M35193), strM46759));
        }
        BitSet bitSetValueOf = BitSet.valueOf(c20348.m46748());
        for (int i3 = 0; i3 < i; i3++) {
            if (bitSetValueOf.get(i3)) {
                ((C1200) arrayList.get(i3)).f4366 = true;
            }
        }
        c22829.f73990 = arrayList;
        f24785 = c22829;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20542(C6178 c6178) {
        ArrayList arrayList;
        C22829 c22829 = f24785;
        c6178.m17787(c22829.f73993);
        c6178.writeInt(c22829.f73992);
        synchronized (c22829) {
            arrayList = new ArrayList(c22829.f73990);
        }
        c6178.writeInt(arrayList.size());
        BitSet bitSet = new BitSet(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1200 c1200 = (C1200) arrayList.get(i);
            c6178.m17800(c1200.m4414().getPath());
            c6178.m17800(c1200.m4417());
            bitSet.set(i, c1200.f4366);
        }
        c6178.m17806(bitSet.toByteArray());
    }

    @Override // l.AbstractC7364
    /* JADX INFO: renamed from: ۡ */
    public final List mo10166() {
        return Arrays.asList(AbstractC7364.f24216, this.f24790, this.f24795, this.f24794, AbstractC7364.f24209, AbstractC7364.f24214, AbstractC7364.f24215, this.f24787, this.f24789, this.f24793, this.f24792, this.f24796);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m20538(final C8614 c8614, final int i) {
        C2717 c2717M33861 = C13903.m33861();
        boolean z = false;
        if (!c2717M33861.m9056()) {
            C13903 c13903M128 = c8614.m23233().m128();
            String str = C14584.m35193(m20218(), new String[0]).mo42890().m42887() + "/*";
            if (c2717M33861.m9058()) {
                c13903M128.m33868(str, false, c2717M33861, new Runnable() { // from class: l.ܶ᩻۫
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f53328.m20538(c8614, i);
                    }
                });
                return;
            } else {
                c13903M128.m33870(str);
                return;
            }
        }
        C20617 c20617 = new C20617();
        List<PackageInfo> installedPackages = C21576.m49081().getInstalledPackages(0);
        HashMap map = new HashMap(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            map.put(packageInfo.packageName, packageInfo);
        }
        if (Build.VERSION.SDK_INT == 33) {
            Iterator it = C14584.m35193(c8614.m23166(), new String[0]).mo4299(true).iterator();
            while (it.hasNext()) {
                c20617.m47238((AbstractC22044) it.next());
            }
        } else {
            Iterator<PackageInfo> it2 = installedPackages.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().packageName;
                if (!str2.equals("android")) {
                    c20617.m47238(C14584.m35193(c8614.m23166(), str2));
                }
            }
            z = true;
        }
        List listM47240 = c20617.m47240();
        if (listM47240.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        ArrayList arrayList = new ArrayList(listM47240.size());
        Iterator it3 = listM47240.iterator();
        while (it3.hasNext()) {
            PackageInfo packageInfo2 = (PackageInfo) map.get(((C18379) it3.next()).getName());
            if (packageInfo2 != null) {
                arrayList.add(packageInfo2);
            }
        }
        Collections.sort(arrayList, new C23904(0));
        C13219 c13219 = new C13219(c8614.m23233(), arrayList);
        c13219.m32763(i);
        c13219.m32764(new C22391(listM47240, c8614));
        if (z) {
            c13219.m32765(new ViewOnClickListenerC23960(3, c8614));
        }
        c13219.m32762();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20536(List list, C8614 c8614, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set set = (Set) C1170.stream(arrayList).map(new C23173(2)).collect(C2025.toSet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18379 c18379 = (C18379) it.next();
            if (set.contains(c18379.getName())) {
                linkedHashSet.add(c18379.m42887());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        c8614.m23233().m128().m33869(linkedHashSet);
    }
}
